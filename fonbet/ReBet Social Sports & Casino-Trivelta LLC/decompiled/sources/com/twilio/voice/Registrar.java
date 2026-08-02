package com.twilio.voice;

import android.os.Handler;

/* loaded from: classes4.dex */
class Registrar implements RegistrarListener {
    static final String RELATIVE_REGISTER_URL = "/v1/registrations?productId=voice";
    private static final String RELATIVE_UNREGISTER_URL = "?productId=voice";
    private static final Logger logger = Logger.getLogger(Registrar.class);
    private final String accessToken;
    private final String channelType;
    private final Handler handler = Utils.createHandler();
    private String homeRegion;
    private final String notificationToken;
    private RegistrationListener registrationListener;
    private UnregistrationListener unregistrationListener;
    String urlString;

    public Registrar(String str, String str2, String str3) {
        this.accessToken = str;
        this.channelType = str2;
        this.notificationToken = str3;
        try {
            this.homeRegion = new AccessTokenParser(str).getHomeRegion();
        } catch (AccessTokenParseException e10) {
            e10.printStackTrace();
        }
        String str4 = this.homeRegion;
        if (str4 != null) {
            this.urlString = String.format("https://ers.%s.twilio.com/v1/registrations?productId=voice", str4);
            return;
        }
        this.urlString = Constants.getNotificationServiceUrl() + RELATIVE_REGISTER_URL;
    }

    @Override // com.twilio.voice.RegistrarListener
    public void onError(final RegistrationException registrationException) {
        logger.e("Register: Registration error: " + registrationException.getErrorCode() + "-" + registrationException.getMessage() + "-" + registrationException.getExplanation());
        this.handler.post(new Runnable() { // from class: com.twilio.voice.Registrar.3
            @Override // java.lang.Runnable
            public void run() {
                if (Registrar.this.registrationListener != null) {
                    Registrar.this.registrationListener.onError(registrationException, Registrar.this.accessToken, Registrar.this.notificationToken);
                } else {
                    Registrar.this.unregistrationListener.onError(registrationException, Registrar.this.accessToken, Registrar.this.notificationToken);
                }
            }
        });
    }

    @Override // com.twilio.voice.RegistrarListener
    public void onSuccess(String str) {
        logger.d("Register: Registration succeeded at location " + str);
        this.handler.post(new Runnable() { // from class: com.twilio.voice.Registrar.2
            @Override // java.lang.Runnable
            public void run() {
                if (Registrar.this.registrationListener != null) {
                    Registrar.this.registrationListener.onRegistered(Registrar.this.accessToken, Registrar.this.notificationToken);
                } else {
                    Registrar.this.unregistrationListener.onUnregistered(Registrar.this.accessToken, Registrar.this.notificationToken);
                }
            }
        });
    }

    public void register(RegistrationListener registrationListener) {
        this.registrationListener = registrationListener;
        HttpsRegistrar.register(this.accessToken, new Registration(this.channelType, this.notificationToken).toJson().toString(), this.urlString, this);
    }

    public void unregister(UnregistrationListener unregistrationListener) {
        this.unregistrationListener = unregistrationListener;
        HttpsRegistrar.register(this.accessToken, new Registration(this.channelType, this.notificationToken).toJson().toString(), this.urlString, true, new RegistrarListener() { // from class: com.twilio.voice.Registrar.1
            @Override // com.twilio.voice.RegistrarListener
            public void onError(RegistrationException registrationException) {
                Registrar.logger.e("Unregister: Registration error: " + registrationException.getErrorCode() + "-" + registrationException.getMessage() + "-" + registrationException.getExplanation());
                Registrar.this.onError(registrationException);
            }

            @Override // com.twilio.voice.RegistrarListener
            public void onSuccess(String str) {
                Registrar.logger.d("Unregister: Registration succeeded at location " + str);
                HttpsRegistrar.unregister(Registrar.this.accessToken, str + Registrar.RELATIVE_UNREGISTER_URL, Registrar.this);
            }
        });
    }
}
