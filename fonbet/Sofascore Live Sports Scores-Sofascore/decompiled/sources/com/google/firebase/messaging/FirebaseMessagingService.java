package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.cloudmessaging.Rpc;
import com.google.android.gms.cloudmessaging.zzv;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Tasks;
import defpackage.bka;
import defpackage.ejg;
import defpackage.g7h;
import defpackage.mo5;
import defpackage.qea;
import defpackage.s3p;
import defpackage.wo0;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Locale;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class FirebaseMessagingService extends mo5 {
    public static final String ACTION_DIRECT_BOOT_REMOTE_INTENT = "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT";
    static final String ACTION_FCM_REGISTERED = "com.google.firebase.messaging.FCM_REGISTERED";
    static final String ACTION_FCM_UNREGISTERED = "com.google.firebase.messaging.FCM_UNREGISTERED";
    static final String ACTION_NEW_TOKEN = "com.google.firebase.messaging.NEW_TOKEN";
    static final String ACTION_REMOTE_INTENT = "com.google.android.c2dm.intent.RECEIVE";
    static final String EXTRA_TOKEN = "token";
    private static final int RECENTLY_RECEIVED_MESSAGE_IDS_MAX_SIZE = 10;
    private static final Queue<String> recentlyReceivedMessageIds = new ArrayDeque(10);
    private Rpc rpc;

    public static void resetForTesting() {
        recentlyReceivedMessageIds.clear();
    }

    @Override // defpackage.mo5
    public Intent getStartCommandIntent(Intent intent) {
        return (Intent) ((ArrayDeque) g7h.s().e).poll();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01b1  */
    @Override // defpackage.mo5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void handleIntent(Intent intent) {
        Rpc rpc;
        int i;
        String action = intent.getAction();
        if (!ACTION_REMOTE_INTENT.equals(action) && !ACTION_DIRECT_BOOT_REMOTE_INTENT.equals(action)) {
            if (ACTION_NEW_TOKEN.equals(action)) {
                onNewToken(intent.getStringExtra("token"));
                return;
            }
            if (ACTION_FCM_REGISTERED.equals(action)) {
                onRegistered(intent.getStringExtra("token"));
                return;
            } else if (ACTION_FCM_UNREGISTERED.equals(action)) {
                onUnregistered(intent.getStringExtra("token"));
                return;
            } else {
                intent.getAction();
                return;
            }
        }
        String stringExtra = intent.getStringExtra("google.message_id");
        if (!TextUtils.isEmpty(stringExtra)) {
            Queue<String> queue = recentlyReceivedMessageIds;
            if (!queue.contains(stringExtra)) {
                if (queue.size() >= 10) {
                    queue.remove();
                }
                queue.add(stringExtra);
            }
            rpc = this.rpc;
            if (rpc == null) {
                rpc = new Rpc(getApplicationContext());
                this.rpc = rpc;
            }
            CloudMessage cloudMessage = new CloudMessage(intent);
            if (rpc.c.b() >= 233700000) {
                Tasks.forException(new IOException("SERVICE_NOT_AVAILABLE"));
                return;
            }
            Bundle bundle = new Bundle();
            Intent intent2 = cloudMessage.a;
            String stringExtra2 = intent2.getStringExtra("google.message_id");
            if (stringExtra2 == null) {
                stringExtra2 = intent2.getStringExtra("message_id");
            }
            bundle.putString("google.message_id", stringExtra2);
            Intent intent3 = cloudMessage.a;
            Integer valueOf = intent3.hasExtra("google.product_id") ? Integer.valueOf(intent3.getIntExtra("google.product_id", 0)) : null;
            if (valueOf != null) {
                bundle.putInt("google.product_id", valueOf.intValue());
            }
            zzv a = zzv.a(rpc.b);
            synchronized (a) {
                i = a.d;
                a.d = i + 1;
            }
            a.b(new s3p(i, 3, bundle, 0));
            return;
        }
        String stringExtra3 = intent.getStringExtra("message_type");
        if (stringExtra3 == null) {
            stringExtra3 = "gcm";
        }
        switch (stringExtra3) {
            case "deleted_messages":
                onDeletedMessages();
                break;
            case "gcm":
                qea.A(intent);
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    extras = new Bundle();
                }
                extras.remove("androidx.content.wakelockid");
                if (bka.u(extras)) {
                    bka bkaVar = new bka(extras);
                    ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new NamedThreadFactory("Firebase-Messaging-Network-Io"));
                    try {
                        if (new ejg(this, bkaVar, newSingleThreadExecutor).q()) {
                            break;
                        } else {
                            newSingleThreadExecutor.shutdown();
                            if (qea.G(intent)) {
                                qea.B(intent.getExtras(), "_nf");
                            }
                        }
                    } finally {
                        newSingleThreadExecutor.shutdown();
                    }
                }
                onMessageReceived(new RemoteMessage(extras));
                break;
            case "send_error":
                String stringExtra4 = intent.getStringExtra("google.message_id");
                if (stringExtra4 == null) {
                    stringExtra4 = intent.getStringExtra("message_id");
                }
                String stringExtra5 = intent.getStringExtra("error");
                wo0 wo0Var = new wo0(stringExtra5);
                if (stringExtra5 != null) {
                    stringExtra5.toLowerCase(Locale.US).getClass();
                }
                onSendError(stringExtra4, wo0Var);
                break;
            case "send_event":
                onMessageSent(intent.getStringExtra("google.message_id"));
                break;
        }
        rpc = this.rpc;
        if (rpc == null) {
        }
        CloudMessage cloudMessage2 = new CloudMessage(intent);
        if (rpc.c.b() >= 233700000) {
        }
    }

    public void setRpcForTesting(Rpc rpc) {
        this.rpc = rpc;
    }

    public void onDeletedMessages() {
    }

    public void onMessageReceived(@NonNull RemoteMessage remoteMessage) {
    }

    @Deprecated
    public void onMessageSent(@NonNull String str) {
    }

    public void onNewToken(String str) {
    }

    public void onRegistered(@NonNull String str) {
    }

    public void onUnregistered(@NonNull String str) {
    }

    @Deprecated
    public void onSendError(@NonNull String str, @NonNull Exception exc) {
    }
}
