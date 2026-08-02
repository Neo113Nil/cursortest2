package io.intercom.android.sdk.fcm;

import android.app.Application;
import android.text.TextUtils;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.push.IntercomPushClient;

/* loaded from: classes9.dex */
public class IntercomFcmMessengerService extends FirebaseMessagingService {
    private static final IntercomPushClient pushClient = new IntercomPushClient();
    private static final Twig twig = LumberMill.getLogger();

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(RemoteMessage remoteMessage) {
        twig.d("Intercom push received: " + remoteMessage.getData(), new Object[0]);
        pushClient.handlePush(getApplication(), remoteMessage.getData());
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(String str) {
        if (TextUtils.isEmpty(str)) {
            twig.e("Intercom push registration failed. Please make sure you have added a google-services.json file", new Object[0]);
        } else {
            pushClient.sendTokenToIntercom(getApplication(), str);
        }
    }

    public static void initialize(final Application application) {
        FirebaseMessaging.getInstance().getToken().addOnCompleteListener(new OnCompleteListener() { // from class: io.intercom.android.sdk.fcm.IntercomFcmMessengerService$$ExternalSyntheticLambda0
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                IntercomFcmMessengerService.lambda$initialize$0(application, task);
            }
        });
    }

    static /* synthetic */ void lambda$initialize$0(Application application, Task task) {
        if (!task.isSuccessful()) {
            twig.w("Fetching FCM registration token failed", task.getException());
            return;
        }
        String str = (String) task.getResult();
        twig.internal("FCM registration token fetched: " + str);
        pushClient.sendTokenToIntercom(application, str);
    }
}
