package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.datatransport.Priority;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.reporting.MessagingClientEvent;
import com.vk.core.preference.Preference;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import xsna.bo01;
import xsna.ch20;
import xsna.dh20;
import xsna.ejr;
import xsna.fe70;
import xsna.ijp;
import xsna.kri0;
import xsna.nq01;
import xsna.on5;
import xsna.pr;
import xsna.sl9;
import xsna.top0;
import xsna.uir;
import xsna.upg0;
import xsna.vhr;
import xsna.vop0;
import xsna.wnd0;
import xsna.xl5;
import xsna.zfn;
import xsna.zt50;

/* loaded from: classes.dex */
public class FirebaseMessagingService extends EnhancedIntentService {
    public static final String ACTION_DIRECT_BOOT_REMOTE_INTENT = "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT";
    static final String ACTION_NEW_TOKEN = "com.google.firebase.messaging.NEW_TOKEN";
    static final String ACTION_REMOTE_INTENT = "com.google.android.c2dm.intent.RECEIVE";
    static final String EXTRA_TOKEN = "token";
    private static final int RECENTLY_RECEIVED_MESSAGE_IDS_MAX_SIZE = 10;
    private static final Queue<String> recentlyReceivedMessageIds = new ArrayDeque(10);
    private upg0 rpc;

    private boolean alreadyReceivedMessage(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Queue<String> queue = recentlyReceivedMessageIds;
        if (queue.contains(str)) {
            return true;
        }
        if (queue.size() >= 10) {
            queue.remove();
        }
        queue.add(str);
        return false;
    }

    private void dispatchMessage(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        extras.remove("androidx.content.wakelockid");
        if (fe70.f(extras)) {
            fe70 fe70Var = new fe70(extras);
            ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new zt50("Firebase-Messaging-Network-Io"));
            try {
                if (new zfn(this, fe70Var, newSingleThreadExecutor).a()) {
                    return;
                }
                newSingleThreadExecutor.shutdown();
                if (ch20.b(intent)) {
                    ch20.a(intent.getExtras(), "_nf");
                }
            } finally {
                newSingleThreadExecutor.shutdown();
            }
        }
        onMessageReceived(new RemoteMessage(extras));
    }

    private String getMessageId(Intent intent) {
        String stringExtra = intent.getStringExtra("google.message_id");
        return stringExtra == null ? intent.getStringExtra("message_id") : stringExtra;
    }

    private upg0 getRpc(Context context) {
        if (this.rpc == null) {
            this.rpc = new upg0(context.getApplicationContext());
        }
        return this.rpc;
    }

    private void handleMessageIntent(Intent intent) {
        int i;
        if (!alreadyReceivedMessage(intent.getStringExtra("google.message_id"))) {
            passMessageIntentToSdk(intent);
        }
        upg0 rpc = getRpc(this);
        CloudMessage cloudMessage = new CloudMessage(intent);
        if (rpc.c.a() < 233700000) {
            Tasks.forException(new IOException("SERVICE_NOT_AVAILABLE"));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("google.message_id", cloudMessage.i());
        Integer j = cloudMessage.j();
        if (j != null) {
            bundle.putInt("google.product_id", j.intValue());
        }
        nq01 a = nq01.a(rpc.b);
        synchronized (a) {
            i = a.d;
            a.d = i + 1;
        }
        a.b(new bo01(i, 3, bundle));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(29:36|(1:38)|39|(1:41)(2:108|(2:110|111))|42|(2:102|103)|44|(1:46)(1:101)|47|(1:49)|(1:51)|52|(1:100)|(1:57)|58|(1:60)|61|(1:63)|64|(1:66)|67|(5:(7:96|97|76|(1:78)|79|80|81)|(7:92|93|76|(0)|79|80|81)|(1:74)(8:85|(2:88|(1:90))|87|76|(0)|79|80|81)|80|81)|69|71|72|75|76|(0)|79) */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void passMessageIntentToSdk(Intent intent) {
        int i;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        boolean z;
        long parseLong;
        String str;
        String str2;
        String stringExtra = intent.getStringExtra("message_type");
        if (stringExtra == null) {
            stringExtra = "gcm";
        }
        i = 0;
        switch (stringExtra) {
            case "deleted_messages":
                onDeletedMessages();
                return;
            case "gcm":
                if (ch20.b(intent)) {
                    ch20.a(intent.getExtras(), "_nr");
                }
                if (!ACTION_DIRECT_BOOT_REMOTE_INTENT.equals(intent.getAction())) {
                    try {
                        vhr.d();
                        vhr d = vhr.d();
                        d.a();
                        Context context = d.a;
                        SharedPreferences h = Preference.h(context, 0, "com.google.firebase.messaging");
                        if (h.contains("export_to_big_query")) {
                            z = h.getBoolean("export_to_big_query", false);
                        } else {
                            PackageManager packageManager = context.getPackageManager();
                            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
                                z = applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                            }
                        }
                    } catch (PackageManager.NameNotFoundException | IllegalStateException unused) {
                    }
                    if (z) {
                        MessagingClientEvent.Event event = MessagingClientEvent.Event.MESSAGE_DELIVERED;
                        top0 top0Var = FirebaseMessaging.o;
                        if (top0Var == null) {
                            Log.e("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
                        } else {
                            Bundle extras = intent.getExtras();
                            if (extras == null) {
                                extras = Bundle.EMPTY;
                            }
                            MessagingClientEvent.a a = MessagingClientEvent.a();
                            Object obj = extras.get("google.ttl");
                            if (obj instanceof Integer) {
                                i = ((Integer) obj).intValue();
                            } else if (obj instanceof String) {
                                try {
                                    i = Integer.parseInt((String) obj);
                                } catch (NumberFormatException unused2) {
                                    Objects.toString(obj);
                                }
                            }
                            a.m(i);
                            a.e(event);
                            String string = extras.getString("google.to");
                            if (TextUtils.isEmpty(string)) {
                                try {
                                    vhr d2 = vhr.d();
                                    Object obj2 = com.google.firebase.installations.a.m;
                                    string = (String) Tasks.await(((com.google.firebase.installations.a) d2.b(uir.class)).getId());
                                } catch (InterruptedException | ExecutionException e) {
                                    throw new RuntimeException(e);
                                }
                            }
                            a.f(string);
                            vhr d3 = vhr.d();
                            d3.a();
                            a.i(d3.a.getPackageName());
                            a.k(MessagingClientEvent.SDKPlatform.ANDROID);
                            a.h(fe70.f(extras) ? MessagingClientEvent.MessageType.DISPLAY_NOTIFICATION : MessagingClientEvent.MessageType.DATA_MESSAGE);
                            String string2 = extras.getString("google.message_id");
                            if (string2 == null) {
                                string2 = extras.getString("message_id");
                            }
                            if (string2 != null) {
                                a.g(string2);
                            }
                            String string3 = extras.getString("from");
                            if (string3 == null || !string3.startsWith("/topics/")) {
                                string3 = null;
                            }
                            if (string3 != null) {
                                a.l(string3);
                            }
                            String string4 = extras.getString("collapse_key");
                            if (string4 != null) {
                                a.c(string4);
                            }
                            String string5 = extras.getString("google.c.a.m_l");
                            if (string5 != null) {
                                a.b(string5);
                            }
                            String string6 = extras.getString("google.c.a.c_l");
                            if (string6 != null) {
                                a.d(string6);
                            }
                            try {
                                if (extras.containsKey("google.c.sender.id")) {
                                    try {
                                        parseLong = Long.parseLong(extras.getString("google.c.sender.id"));
                                    } catch (NumberFormatException unused3) {
                                    }
                                    if (parseLong > 0) {
                                        a.j(parseLong);
                                    }
                                    MessagingClientEvent a2 = a.a();
                                    on5 b = wnd0.b(Integer.valueOf(intent.getIntExtra("google.product_id", 111881503)));
                                    vop0 a3 = top0Var.a("FCM_CLIENT_EVENT_LOGGING", new ijp("proto"), new pr(25));
                                    dh20.a a4 = dh20.a();
                                    a4.b(a2);
                                    a3.a(new xl5(null, a4.a(), Priority.DEFAULT, b), new sl9());
                                }
                                if (str != null) {
                                    try {
                                        parseLong = Long.parseLong(str);
                                    } catch (NumberFormatException unused4) {
                                    }
                                    if (parseLong > 0) {
                                    }
                                    MessagingClientEvent a22 = a.a();
                                    on5 b2 = wnd0.b(Integer.valueOf(intent.getIntExtra("google.product_id", 111881503)));
                                    vop0 a32 = top0Var.a("FCM_CLIENT_EVENT_LOGGING", new ijp("proto"), new pr(25));
                                    dh20.a a42 = dh20.a();
                                    a42.b(a22);
                                    a32.a(new xl5(null, a42.a(), Priority.DEFAULT, b2), new sl9());
                                }
                                if (str2.startsWith("1:")) {
                                    String[] split = str2.split(StringUtils.PROCESS_POSTFIX_DELIMITER);
                                    if (split.length >= 2) {
                                        String str3 = split[1];
                                        if (!str3.isEmpty()) {
                                            parseLong = Long.parseLong(str3);
                                        }
                                    }
                                    parseLong = 0;
                                    if (parseLong > 0) {
                                    }
                                    MessagingClientEvent a222 = a.a();
                                    on5 b22 = wnd0.b(Integer.valueOf(intent.getIntExtra("google.product_id", 111881503)));
                                    vop0 a322 = top0Var.a("FCM_CLIENT_EVENT_LOGGING", new ijp("proto"), new pr(25));
                                    dh20.a a422 = dh20.a();
                                    a422.b(a222);
                                    a322.a(new xl5(null, a422.a(), Priority.DEFAULT, b22), new sl9());
                                } else {
                                    parseLong = Long.parseLong(str2);
                                }
                                on5 b222 = wnd0.b(Integer.valueOf(intent.getIntExtra("google.product_id", 111881503)));
                                vop0 a3222 = top0Var.a("FCM_CLIENT_EVENT_LOGGING", new ijp("proto"), new pr(25));
                                dh20.a a4222 = dh20.a();
                                a4222.b(a222);
                                a3222.a(new xl5(null, a4222.a(), Priority.DEFAULT, b222), new sl9());
                            } catch (RuntimeException unused5) {
                            }
                            vhr d4 = vhr.d();
                            ejr ejrVar = d4.c;
                            d4.a();
                            str = ejrVar.e;
                            d4.a();
                            str2 = ejrVar.b;
                            if (parseLong > 0) {
                            }
                            MessagingClientEvent a2222 = a.a();
                        }
                    }
                    dispatchMessage(intent);
                    return;
                }
                z = false;
                if (z) {
                }
                dispatchMessage(intent);
                return;
            case "send_error":
                onSendError(getMessageId(intent), new SendException(intent.getStringExtra("error")));
                return;
            case "send_event":
                onMessageSent(intent.getStringExtra("google.message_id"));
                return;
            default:
                return;
        }
    }

    public static void resetForTesting() {
        recentlyReceivedMessageIds.clear();
    }

    @Override // com.google.firebase.messaging.EnhancedIntentService
    public Intent getStartCommandIntent(Intent intent) {
        return (Intent) kri0.a().d.poll();
    }

    @Override // com.google.firebase.messaging.EnhancedIntentService
    public void handleIntent(Intent intent) {
        String action = intent.getAction();
        if (ACTION_REMOTE_INTENT.equals(action) || ACTION_DIRECT_BOOT_REMOTE_INTENT.equals(action)) {
            handleMessageIntent(intent);
        } else if (ACTION_NEW_TOKEN.equals(action)) {
            onNewToken(intent.getStringExtra("token"));
        } else {
            intent.getAction();
        }
    }

    public void setRpcForTesting(upg0 upg0Var) {
        this.rpc = upg0Var;
    }

    public void onDeletedMessages() {
    }

    public void onMessageReceived(@NonNull RemoteMessage remoteMessage) {
    }

    public void onMessageSent(@NonNull String str) {
    }

    public void onNewToken(@NonNull String str) {
    }

    public void onSendError(@NonNull String str, @NonNull Exception exc) {
    }
}
