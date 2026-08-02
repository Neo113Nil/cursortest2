package com.google.android.gms.cloudmessaging;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.cloudmessaging.CloudMessagingReceiver;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.lang.ref.SoftReference;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import xsna.bo01;
import xsna.nq01;
import xsna.zt50;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.1.0 */
/* loaded from: classes12.dex */
public abstract class CloudMessagingReceiver extends BroadcastReceiver {

    @Nullable
    public static SoftReference a;

    public abstract int a(@NonNull Context context, @NonNull CloudMessage cloudMessage);

    public final int c(@NonNull Context context, @NonNull Intent intent) {
        int i;
        Task b;
        if (intent.getExtras() == null) {
            return 500;
        }
        CloudMessage cloudMessage = new CloudMessage(intent);
        if (TextUtils.isEmpty(cloudMessage.i())) {
            b = Tasks.forResult(null);
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("google.message_id", cloudMessage.i());
            Integer j = cloudMessage.j();
            if (j != null) {
                bundle.putInt("google.product_id", j.intValue());
            }
            bundle.putBoolean("supports_message_handled", true);
            nq01 a2 = nq01.a(context);
            synchronized (a2) {
                i = a2.d;
                a2.d = i + 1;
            }
            b = a2.b(new bo01(i, 2, bundle));
        }
        int a3 = a(context, cloudMessage);
        try {
            Tasks.await(b, TimeUnit.SECONDS.toMillis(1L), TimeUnit.MILLISECONDS);
            return a3;
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            "Message ack failed: ".concat(e.toString());
            return a3;
        }
    }

    public final int d(@NonNull Context context, @NonNull Intent intent) {
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
                Log.e("CloudMessagingReceiver", "Notification pending intent canceled");
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            extras.remove("pending_intent");
        } else {
            extras = new Bundle();
        }
        String action = intent.getAction();
        if (action == "com.google.firebase.messaging.NOTIFICATION_DISMISS" || (action != null && action.equals("com.google.firebase.messaging.NOTIFICATION_DISMISS"))) {
            b(extras);
            return -1;
        }
        Log.e("CloudMessagingReceiver", "Unknown notification action");
        return 500;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(@NonNull final Context context, @NonNull final Intent intent) {
        ExecutorService executorService;
        if (intent == null) {
            return;
        }
        final boolean isOrderedBroadcast = isOrderedBroadcast();
        final BroadcastReceiver.PendingResult goAsync = goAsync();
        synchronized (CloudMessagingReceiver.class) {
            try {
                SoftReference softReference = a;
                ExecutorService executorService2 = softReference != null ? (ExecutorService) softReference.get() : null;
                if (executorService2 == null) {
                    com.google.android.gms.internal.cloudmessaging.zze.zza();
                    executorService2 = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new zt50("firebase-iid-executor")));
                    a = new SoftReference(executorService2);
                }
                executorService = executorService2;
            } catch (Throwable th) {
                throw th;
            }
        }
        executorService.execute(new Runnable() { // from class: xsna.ua01
            @Override // java.lang.Runnable
            public final void run() {
                Intent intent2 = intent;
                BroadcastReceiver.PendingResult pendingResult = goAsync;
                try {
                    Parcelable parcelableExtra = intent2.getParcelableExtra("wrapped_intent");
                    Intent intent3 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
                    CloudMessagingReceiver cloudMessagingReceiver = CloudMessagingReceiver.this;
                    Context context2 = context;
                    int d = intent3 != null ? cloudMessagingReceiver.d(context2, intent3) : cloudMessagingReceiver.c(context2, intent2);
                    if (isOrderedBroadcast) {
                        pendingResult.setResultCode(d);
                    }
                } finally {
                    pendingResult.finish();
                }
            }
        });
    }

    public void b(@NonNull Bundle bundle) {
    }
}
