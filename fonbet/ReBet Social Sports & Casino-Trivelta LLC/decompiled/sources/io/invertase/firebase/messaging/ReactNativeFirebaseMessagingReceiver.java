package io.invertase.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.facebook.react.HeadlessJsTaskService;
import com.google.firebase.messaging.RemoteMessage;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class ReactNativeFirebaseMessagingReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static HashMap f49316a = new HashMap();

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (Kg.a.a() == null) {
            Kg.a.b(context.getApplicationContext());
        }
        if (intent.getExtras() == null) {
            Log.e("RNFirebaseMsgReceiver", "broadcast intent received with no extras");
            return;
        }
        RemoteMessage remoteMessage = new RemoteMessage(intent.getExtras());
        Lg.g i10 = Lg.g.i();
        if (remoteMessage.m() != null) {
            f49316a.put(remoteMessage.j(), remoteMessage);
            w.a().b().c(remoteMessage);
        }
        if (Lg.m.c(context)) {
            i10.o(u.h(remoteMessage, Boolean.FALSE));
            return;
        }
        try {
            Intent intent2 = new Intent(context, (Class<?>) ReactNativeFirebaseMessagingHeadlessService.class);
            intent2.putExtra("message", remoteMessage);
            if (context.startService(intent2) != null) {
                HeadlessJsTaskService.acquireWakeLockNow(context);
            }
        } catch (IllegalStateException e10) {
            Log.e("RNFirebaseMsgReceiver", "Background messages only work if the message priority is set to 'high'", e10);
        }
    }
}
