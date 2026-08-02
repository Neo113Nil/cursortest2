package com.twilio.voice;

import android.os.Handler;
import com.twilio.voice.Constants;
import com.twilio.voice.EventPayload;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONObject;

/* loaded from: classes4.dex */
class HttpsRegistrar {
    static final String DEFAULT_REGISTRATION_FAILED_MESSAGE = "Registration failed";
    static final String DEFAULT_UNREGISTRATION_FAILED_MESSAGE = "Unregistration failed";
    static final String JSON_CODE_KEY = "code";
    static final String JSON_MESSAGE_KEY = "message";
    private static final String REGISTRATION_ID_LOCATION = "Location";

    private HttpsRegistrar() {
    }

    public static /* synthetic */ void a(String str, String str2, String str3, String str4, boolean z10, Handler handler, final RegistrarListener registrarListener) {
        String str5 = DEFAULT_REGISTRATION_FAILED_MESSAGE;
        try {
            try {
                HttpsURLConnection create = VoiceURLConnection.create(str, str2, VoiceURLConnection.METHOD_TYPE_POST);
                create.addRequestProperty("X-Twilio-Request-Id", str3);
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(create.getOutputStream());
                outputStreamWriter.write(str4);
                outputStreamWriter.close();
                int responseCode = create.getResponseCode();
                String responseMessage = create.getResponseMessage();
                if (responseCode == 201) {
                    final String headerField = create.getHeaderField(REGISTRATION_ID_LOCATION);
                    if (headerField != null) {
                        if (!z10) {
                            publishRegistrationSuccessfulEvent(str, str3, EventGroupType.REGISTRATION_EVENT_GROUP);
                        }
                        handler.post(new Runnable() { // from class: com.twilio.voice.M
                            @Override // java.lang.Runnable
                            public final void run() {
                                RegistrarListener.this.onSuccess(headerField);
                            }
                        });
                    } else {
                        final String str6 = z10 ? DEFAULT_UNREGISTRATION_FAILED_MESSAGE : DEFAULT_REGISTRATION_FAILED_MESSAGE;
                        publishError(z10, str, str3, responseCode, responseMessage);
                        handler.post(new Runnable() { // from class: com.twilio.voice.N
                            @Override // java.lang.Runnable
                            public final void run() {
                                RegistrarListener.this.onError(new RegistrationException(RegistrationException.EXCEPTION_REGISTRATION_ERROR, str6, "Registration Location is null"));
                            }
                        });
                    }
                } else {
                    JSONObject processJSONError = processJSONError(create.getErrorStream());
                    final RegistrationException handleHttpErrorCode = handleHttpErrorCode(z10, responseCode, processJSONError.getInt("code"), processJSONError.getString("message"), responseMessage);
                    publishError(z10, str, str3, handleHttpErrorCode.getErrorCode(), handleHttpErrorCode.getMessage() + " : " + handleHttpErrorCode.getExplanation());
                    handler.post(new Runnable() { // from class: com.twilio.voice.O
                        @Override // java.lang.Runnable
                        public final void run() {
                            RegistrarListener.this.onError(handleHttpErrorCode);
                        }
                    });
                }
                VoiceURLConnection.release(create);
            } catch (Exception e10) {
                handleException(Boolean.valueOf(z10), e10, null, handler, registrarListener);
                if (z10) {
                    str5 = DEFAULT_UNREGISTRATION_FAILED_MESSAGE;
                }
                publishError(z10, str, str3, RegistrationException.EXCEPTION_REGISTRATION_ERROR, str5 + " : " + e10.getMessage());
                VoiceURLConnection.release(null);
            }
        } catch (Throwable th2) {
            VoiceURLConnection.release(null);
            throw th2;
        }
    }

    public static /* synthetic */ void f(String str, String str2, String str3, Handler handler, final RegistrarListener registrarListener) {
        try {
            try {
                HttpsURLConnection create = VoiceURLConnection.create(str, str2, VoiceURLConnection.METHOD_TYPE_DELETE);
                create.addRequestProperty("X-Twilio-Request-Id", str3);
                create.connect();
                int responseCode = create.getResponseCode();
                String responseMessage = create.getResponseMessage();
                if (responseCode != 200 && responseCode != 204) {
                    JSONObject processJSONError = processJSONError(create.getErrorStream());
                    final RegistrationException handleHttpErrorCode = handleHttpErrorCode(true, responseCode, processJSONError.getInt("code"), processJSONError.getString("message"), responseMessage);
                    publishRegistrationErrorEvent(str, str3, "unregistration-error", handleHttpErrorCode.getErrorCode(), handleHttpErrorCode.getMessage() + " : " + handleHttpErrorCode.getExplanation());
                    handler.post(new Runnable() { // from class: com.twilio.voice.Q
                        @Override // java.lang.Runnable
                        public final void run() {
                            RegistrarListener.this.onError(handleHttpErrorCode);
                        }
                    });
                    VoiceURLConnection.release(create);
                }
                publishRegistrationSuccessfulEvent(str, str3, "unregistration");
                handler.post(new Runnable() { // from class: com.twilio.voice.P
                    @Override // java.lang.Runnable
                    public final void run() {
                        RegistrarListener.this.onSuccess(null);
                    }
                });
                VoiceURLConnection.release(create);
            } catch (Exception e10) {
                handleException(Boolean.TRUE, e10, null, handler, registrarListener);
                publishError(true, str, str3, RegistrationException.EXCEPTION_REGISTRATION_ERROR, DEFAULT_UNREGISTRATION_FAILED_MESSAGE + " : " + e10.getMessage());
                VoiceURLConnection.release(null);
            }
        } catch (Throwable th2) {
            VoiceURLConnection.release(null);
            throw th2;
        }
    }

    private static void handleException(final Boolean bool, final Exception exc, HttpsURLConnection httpsURLConnection, Handler handler, final RegistrarListener registrarListener) {
        final String str = bool.booleanValue() ? DEFAULT_UNREGISTRATION_FAILED_MESSAGE : DEFAULT_REGISTRATION_FAILED_MESSAGE;
        if (httpsURLConnection == null) {
            handler.post(new Runnable() { // from class: com.twilio.voice.K
                @Override // java.lang.Runnable
                public final void run() {
                    RegistrarListener.this.onError(new RegistrationException(RegistrationException.EXCEPTION_REGISTRATION_ERROR, str, exc.getMessage()));
                }
            });
            return;
        }
        try {
            JSONObject processJSONError = processJSONError(httpsURLConnection.getErrorStream());
            final int i10 = processJSONError.getInt("code");
            final String string = processJSONError.getString("message");
            handler.post(new Runnable() { // from class: com.twilio.voice.I
                @Override // java.lang.Runnable
                public final void run() {
                    RegistrarListener.this.onError(HttpsRegistrar.handleHttpAuthErrorCode(bool.booleanValue(), i10, string));
                }
            });
        } catch (Exception unused) {
            handler.post(new Runnable() { // from class: com.twilio.voice.J
                @Override // java.lang.Runnable
                public final void run() {
                    RegistrarListener.this.onError(new RegistrationException(RegistrationException.EXCEPTION_REGISTRATION_ERROR, str, exc.getMessage()));
                }
            });
        }
    }

    private static RegistrationException handleHttpAuthErrorCode(boolean z10, int i10, String str) {
        String str2 = i10 + " : " + str;
        if (i10 != 20151 && i10 != 20157 && i10 != 20403 && i10 != 51007) {
            switch (i10) {
                case VoiceException.EXCEPTION_INVALID_ACCESS_TOKEN /* 20101 */:
                case VoiceException.EXCEPTION_INVALID_ACCESS_TOKEN_HEADER /* 20102 */:
                case VoiceException.EXCEPTION_INVALID_ISSUER_SUBJECT /* 20103 */:
                case VoiceException.EXCEPTION_INVALID_ACCESS_TOKEN_EXPIRY /* 20104 */:
                case VoiceException.EXCEPTION_INVALID_ACCESS_TOKEN_NOT_VALID_YET /* 20105 */:
                case VoiceException.EXCEPTION_INVALID_ACCESS_TOKEN_GRANT /* 20106 */:
                case VoiceException.EXCEPTION_INVALID_SIGNATURE /* 20107 */:
                    break;
                default:
                    return !z10 ? new RegistrationException(i10, DEFAULT_REGISTRATION_FAILED_MESSAGE, str2) : new RegistrationException(i10, DEFAULT_UNREGISTRATION_FAILED_MESSAGE, str2);
            }
        }
        return new RegistrationException(i10, str, str2);
    }

    public static RegistrationException handleHttpErrorCode(boolean z10, int i10, int i11, String str, String str2) {
        String explanation;
        String explanation2;
        String explanation3;
        String explanation4;
        String explanation5;
        String explanation6;
        String explanation7;
        String explanation8;
        String explanation9;
        String explanation10;
        String explanation11;
        String str3 = z10 ? DEFAULT_UNREGISTRATION_FAILED_MESSAGE : DEFAULT_REGISTRATION_FAILED_MESSAGE;
        String str4 = String.valueOf(i11) + " : " + str;
        if (i10 == 400) {
            VoiceException voiceException = VoiceException.BadRequestException;
            int errorCode = voiceException.getErrorCode();
            String message = voiceException.getMessage();
            if (str != null) {
                explanation = i11 + " : " + str;
            } else {
                explanation = voiceException.getExplanation();
            }
            return new RegistrationException(errorCode, message, explanation);
        }
        if (i10 == 401) {
            return handleHttpAuthErrorCode(z10, i11, str);
        }
        if (i10 == 403) {
            VoiceException voiceException2 = VoiceException.ForbiddenException;
            int errorCode2 = voiceException2.getErrorCode();
            String message2 = voiceException2.getMessage();
            if (str != null) {
                explanation2 = i11 + " : " + str;
            } else {
                explanation2 = voiceException2.getExplanation();
            }
            return new RegistrationException(errorCode2, message2, explanation2);
        }
        if (i10 == 404) {
            VoiceException voiceException3 = VoiceException.NotFoundException;
            int errorCode3 = voiceException3.getErrorCode();
            String message3 = voiceException3.getMessage();
            if (str != null) {
                explanation3 = i11 + " : " + str;
            } else {
                explanation3 = voiceException3.getExplanation();
            }
            return new RegistrationException(errorCode3, message3, explanation3);
        }
        if (i10 == 408) {
            VoiceException voiceException4 = VoiceException.RequestTimeoutException;
            int errorCode4 = voiceException4.getErrorCode();
            String message4 = voiceException4.getMessage();
            if (str != null) {
                explanation4 = i11 + " : " + str;
            } else {
                explanation4 = voiceException4.getExplanation();
            }
            return new RegistrationException(errorCode4, message4, explanation4);
        }
        if (i10 == 409) {
            RegistrationException registrationException = RegistrationException.ConflictException;
            int errorCode5 = registrationException.getErrorCode();
            String message5 = registrationException.getMessage();
            if (str != null) {
                explanation5 = i11 + " : " + str;
            } else {
                explanation5 = registrationException.getExplanation();
            }
            return new RegistrationException(errorCode5, message5, explanation5);
        }
        if (i10 == 426) {
            RegistrationException registrationException2 = RegistrationException.UpgradeRequiredException;
            int errorCode6 = registrationException2.getErrorCode();
            String message6 = registrationException2.getMessage();
            if (str != null) {
                explanation6 = i11 + " : " + str;
            } else {
                explanation6 = registrationException2.getExplanation();
            }
            return new RegistrationException(errorCode6, message6, explanation6);
        }
        if (i10 == 429) {
            RegistrationException registrationException3 = RegistrationException.TooManyRequestException;
            int errorCode7 = registrationException3.getErrorCode();
            String message7 = registrationException3.getMessage();
            if (str != null) {
                explanation7 = i11 + " : " + str;
            } else {
                explanation7 = registrationException3.getExplanation();
            }
            return new RegistrationException(errorCode7, message7, explanation7);
        }
        if (i10 == 500) {
            VoiceException voiceException5 = VoiceException.InternalServerErrorException;
            int errorCode8 = voiceException5.getErrorCode();
            String message8 = voiceException5.getMessage();
            if (str != null) {
                explanation8 = i11 + " : " + str;
            } else {
                explanation8 = voiceException5.getExplanation();
            }
            return new RegistrationException(errorCode8, message8, explanation8);
        }
        switch (i10) {
            case 502:
                VoiceException voiceException6 = VoiceException.BadGatewayException;
                int errorCode9 = voiceException6.getErrorCode();
                String message9 = voiceException6.getMessage();
                if (str != null) {
                    explanation9 = i11 + " : " + str;
                } else {
                    explanation9 = voiceException6.getExplanation();
                }
                return new RegistrationException(errorCode9, message9, explanation9);
            case 503:
                VoiceException voiceException7 = VoiceException.ServiceUnavailableException;
                int errorCode10 = voiceException7.getErrorCode();
                String message10 = voiceException7.getMessage();
                if (str != null) {
                    explanation10 = i11 + " : " + str;
                } else {
                    explanation10 = voiceException7.getExplanation();
                }
                return new RegistrationException(errorCode10, message10, explanation10);
            case 504:
                VoiceException voiceException8 = VoiceException.GatewayTimeoutException;
                int errorCode11 = voiceException8.getErrorCode();
                String message11 = voiceException8.getMessage();
                if (str != null) {
                    explanation11 = i11 + " : " + str;
                } else {
                    explanation11 = voiceException8.getExplanation();
                }
                return new RegistrationException(errorCode11, message11, explanation11);
            default:
                if (i11 == 0) {
                    str4 = String.valueOf(i10) + " : " + str2;
                }
                return new RegistrationException(RegistrationException.EXCEPTION_REGISTRATION_ERROR, str3, str4);
        }
    }

    private static JSONObject processJSONError(InputStream inputStream) {
        StringBuilder sb2 = new StringBuilder();
        if (inputStream != null) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb2.append(readLine);
                sb2.append('\n');
            }
            bufferedReader.close();
        }
        return new JSONObject(sb2.toString());
    }

    private static void publishError(boolean z10, String str, String str2, int i10, String str3) {
        if (z10) {
            publishRegistrationErrorEvent(str, str2, "unregistration-registration-error", i10, str3);
        } else {
            publishRegistrationErrorEvent(str, str2, "registration-error", i10, str3);
        }
    }

    private static void publishRegistrationErrorEvent(String str, String str2, String str3, int i10, String str4) {
        EventPublisher eventPublisher = new EventPublisher(Constants.getClientSdkProductName(), str);
        try {
            JSONObject payload = new EventPayload.Builder().productName(Constants.getClientSdkProductName()).requestId(str2).errorCode(Long.valueOf(i10)).errorMessage(str4).payLoadType("application/json").build().getPayload();
            Constants.SeverityLevel severityLevel = Constants.SeverityLevel.ERROR;
            eventPublisher.publish(severityLevel, EventGroupType.REGISTRATION_EVENT_GROUP, str3, eventPublisher.createEvent(severityLevel, EventGroupType.REGISTRATION_EVENT_GROUP, str3, payload));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private static void publishRegistrationSuccessfulEvent(String str, String str2, String str3) {
        EventPublisher eventPublisher = new EventPublisher(Constants.getClientSdkProductName(), str);
        try {
            JSONObject payload = new EventPayload.Builder().productName(Constants.getClientSdkProductName()).requestId(str2).payLoadType("application/json").build().getPayload();
            Constants.SeverityLevel severityLevel = Constants.SeverityLevel.INFO;
            eventPublisher.publish(severityLevel, EventGroupType.REGISTRATION_EVENT_GROUP, str3, eventPublisher.createEvent(severityLevel, EventGroupType.REGISTRATION_EVENT_GROUP, str3, payload));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static void register(String str, String str2, String str3, RegistrarListener registrarListener) {
        register(str, str2, str3, false, registrarListener);
    }

    public static void unregister(final String str, final String str2, final RegistrarListener registrarListener) {
        final String generateGUID = SidUtil.generateGUID("RQ", str);
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        final Handler createHandler = Utils.createHandler();
        newCachedThreadPool.execute(new Runnable() { // from class: com.twilio.voice.S
            @Override // java.lang.Runnable
            public final void run() {
                HttpsRegistrar.f(str, str2, generateGUID, createHandler, registrarListener);
            }
        });
    }

    public static void register(final String str, final String str2, final String str3, final boolean z10, final RegistrarListener registrarListener) {
        final String generateGUID = SidUtil.generateGUID("RQ", str);
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        final Handler createHandler = Utils.createHandler();
        newCachedThreadPool.execute(new Runnable() { // from class: com.twilio.voice.L
            @Override // java.lang.Runnable
            public final void run() {
                HttpsRegistrar.a(str, str3, generateGUID, str2, z10, createHandler, registrarListener);
            }
        });
    }
}
