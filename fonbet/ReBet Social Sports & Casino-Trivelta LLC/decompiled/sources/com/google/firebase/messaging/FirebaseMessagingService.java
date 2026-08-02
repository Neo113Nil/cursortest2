package com.google.firebase.messaging;

import D9.C1134b;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.cloudmessaging.CloudMessage;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
public class FirebaseMessagingService extends AbstractServiceC3502i {
    public static final String ACTION_DIRECT_BOOT_REMOTE_INTENT = "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT";
    static final String ACTION_NEW_TOKEN = "com.google.firebase.messaging.NEW_TOKEN";
    static final String ACTION_REMOTE_INTENT = "com.google.android.c2dm.intent.RECEIVE";
    static final String EXTRA_TOKEN = "token";
    private static final int RECENTLY_RECEIVED_MESSAGE_IDS_MAX_SIZE = 10;
    private static final Queue<String> recentlyReceivedMessageIds = new ArrayDeque(10);
    private C1134b rpc;

    public static void resetForTesting() {
        recentlyReceivedMessageIds.clear();
    }

    public final boolean e(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Queue<String> queue = recentlyReceivedMessageIds;
        if (queue.contains(str)) {
            Log.isLoggable("FirebaseMessaging", 3);
            return true;
        }
        if (queue.size() >= 10) {
            queue.remove();
        }
        queue.add(str);
        return false;
    }

    public final void f(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        extras.remove("androidx.content.wakelockid");
        if (O.t(extras)) {
            O o10 = new O(extras);
            ExecutorService e10 = AbstractC3508o.e();
            try {
                if (new C3499f(this, o10, e10).a()) {
                    return;
                }
                e10.shutdown();
                if (M.E(intent)) {
                    M.w(intent);
                }
            } finally {
                e10.shutdown();
            }
        }
        onMessageReceived(new RemoteMessage(extras));
    }

    public final String g(Intent intent) {
        String stringExtra = intent.getStringExtra("google.message_id");
        return stringExtra == null ? intent.getStringExtra("message_id") : stringExtra;
    }

    @Override // com.google.firebase.messaging.AbstractServiceC3502i
    public Intent getStartCommandIntent(Intent intent) {
        return b0.b().c();
    }

    public final C1134b h(Context context) {
        if (this.rpc == null) {
            this.rpc = new C1134b(context.getApplicationContext());
        }
        return this.rpc;
    }

    @Override // com.google.firebase.messaging.AbstractServiceC3502i
    public void handleIntent(Intent intent) {
        String action = intent.getAction();
        if (ACTION_REMOTE_INTENT.equals(action) || ACTION_DIRECT_BOOT_REMOTE_INTENT.equals(action)) {
            i(intent);
        } else if (ACTION_NEW_TOKEN.equals(action)) {
            onNewToken(intent.getStringExtra(EXTRA_TOKEN));
        } else {
            intent.getAction();
        }
    }

    public final void i(Intent intent) {
        if (!e(intent.getStringExtra("google.message_id"))) {
            j(intent);
        }
        h(this).b(new CloudMessage(intent));
    }

    public final void j(Intent intent) {
        String stringExtra;
        stringExtra = intent.getStringExtra("message_type");
        if (stringExtra == null) {
            stringExtra = "gcm";
        }
        switch (stringExtra) {
            case "deleted_messages":
                onDeletedMessages();
                break;
            case "gcm":
                M.y(intent);
                f(intent);
                break;
            case "send_error":
                onSendError(g(intent), new a0(intent.getStringExtra("error")));
                break;
            case "send_event":
                onMessageSent(intent.getStringExtra("google.message_id"));
                break;
            default:
                Log.w("FirebaseMessaging", "Received message with unknown type: " + stringExtra);
                break;
        }
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

    @Deprecated
    public void onSendError(@NonNull String str, @NonNull Exception exc) {
    }

    public void setRpcForTesting(C1134b c1134b) {
        this.rpc = c1134b;
    }
}
