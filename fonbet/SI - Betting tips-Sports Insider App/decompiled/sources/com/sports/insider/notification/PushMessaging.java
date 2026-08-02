package com.sports.insider.notification;

import android.content.Context;
import c0.h0;
import cd.j;
import com.google.android.gms.internal.measurement.y3;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.sports.insider.MyApp;
import ed.b;
import eg.c0;
import eg.y;
import java.lang.ref.WeakReference;
import java.util.Map;
import kd.c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import zc.d;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sports/insider/notification/PushMessaging;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "<init>", "()V", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PushMessaging extends FirebaseMessagingService {
    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void onDeletedMessages() {
        super.onDeletedMessages();
        WeakReference weakReference = new WeakReference(null);
        if (((h0) weakReference.get()) == null) {
            weakReference = new WeakReference((h0) y3.m(h0.class, null, 6));
        }
        Object obj = weakReference.get();
        Intrinsics.checkNotNull(obj);
        ((h0) obj).f3273b.cancelAll();
        new b().c("onDeletedMessages", null);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0063 A[Catch: Exception -> 0x0119, TRY_ENTER, TryCatch #5 {Exception -> 0x0119, blocks: (B:4:0x0034, B:12:0x004b, B:19:0x0063, B:23:0x0079, B:31:0x009b, B:39:0x00c2, B:43:0x00d7, B:50:0x00fa, B:54:0x010f, B:56:0x0115, B:58:0x011b, B:60:0x0121, B:62:0x0125, B:64:0x012b, B:66:0x012f, B:68:0x0135, B:70:0x0139, B:72:0x013f, B:74:0x0143, B:76:0x0149, B:78:0x014d, B:80:0x0153, B:82:0x0157, B:85:0x00f3, B:88:0x00ba, B:92:0x0091, B:98:0x0041, B:101:0x002c, B:7:0x0039, B:25:0x007c, B:27:0x0082, B:3:0x001c, B:34:0x00a8, B:36:0x00ae, B:45:0x00e1, B:47:0x00e7), top: B:2:0x001c, inners: #0, #2, #3, #4, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0079 A[Catch: Exception -> 0x0119, TRY_LEAVE, TryCatch #5 {Exception -> 0x0119, blocks: (B:4:0x0034, B:12:0x004b, B:19:0x0063, B:23:0x0079, B:31:0x009b, B:39:0x00c2, B:43:0x00d7, B:50:0x00fa, B:54:0x010f, B:56:0x0115, B:58:0x011b, B:60:0x0121, B:62:0x0125, B:64:0x012b, B:66:0x012f, B:68:0x0135, B:70:0x0139, B:72:0x013f, B:74:0x0143, B:76:0x0149, B:78:0x014d, B:80:0x0153, B:82:0x0157, B:85:0x00f3, B:88:0x00ba, B:92:0x0091, B:98:0x0041, B:101:0x002c, B:7:0x0039, B:25:0x007c, B:27:0x0082, B:3:0x001c, B:34:0x00a8, B:36:0x00ae, B:45:0x00e1, B:47:0x00e7), top: B:2:0x001c, inners: #0, #2, #3, #4, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009b A[Catch: Exception -> 0x0119, TRY_LEAVE, TryCatch #5 {Exception -> 0x0119, blocks: (B:4:0x0034, B:12:0x004b, B:19:0x0063, B:23:0x0079, B:31:0x009b, B:39:0x00c2, B:43:0x00d7, B:50:0x00fa, B:54:0x010f, B:56:0x0115, B:58:0x011b, B:60:0x0121, B:62:0x0125, B:64:0x012b, B:66:0x012f, B:68:0x0135, B:70:0x0139, B:72:0x013f, B:74:0x0143, B:76:0x0149, B:78:0x014d, B:80:0x0153, B:82:0x0157, B:85:0x00f3, B:88:0x00ba, B:92:0x0091, B:98:0x0041, B:101:0x002c, B:7:0x0039, B:25:0x007c, B:27:0x0082, B:3:0x001c, B:34:0x00a8, B:36:0x00ae, B:45:0x00e1, B:47:0x00e7), top: B:2:0x001c, inners: #0, #2, #3, #4, #6 }] */
    @Override // com.google.firebase.messaging.FirebaseMessagingService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMessageReceived(RemoteMessage remoteMessage) {
        JSONObject dataJsonObject;
        boolean z5;
        boolean z7;
        boolean z10;
        boolean z11;
        Intrinsics.checkNotNullParameter(remoteMessage, "remoteMessage");
        Context context = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(context, "getApplicationContext(...)");
        Intrinsics.checkNotNullParameter(remoteMessage, "remoteMessage");
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            try {
                Map c2 = remoteMessage.c();
                Intrinsics.checkNotNull(c2, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
                dataJsonObject = new JSONObject(c2);
            } catch (Exception e7) {
                d.b(6, null, e7);
                dataJsonObject = new JSONObject();
            }
            Intrinsics.checkNotNullParameter(dataJsonObject, "dataJsonObject");
            boolean z12 = false;
            try {
                z5 = dataJsonObject.has("af-uinstall-tracking");
            } catch (Exception e9) {
                d.b(4, "isAppsFlyerPush", e9);
                z5 = false;
            }
            if (z5) {
                return;
            }
            Intrinsics.checkNotNullParameter(dataJsonObject, "dataJsonObject");
            if (dataJsonObject.has("notificationType")) {
                z7 = Intrinsics.areEqual(dataJsonObject.getString("notificationType"), "uinstall-tracking");
                if (z7) {
                    c0.t(MyApp.f6830c, new y("ALiveWork"), null, new bd.b(2, null, 4), 2);
                }
                if (!z7) {
                    return;
                }
                Intrinsics.checkNotNullParameter(dataJsonObject, "dataJsonObject");
                try {
                } catch (Exception e10) {
                    d.b(4, "isTypeBadSubsPush", e10);
                }
                if (dataJsonObject.has("notificationType")) {
                    z10 = Intrinsics.areEqual(dataJsonObject.getString("notificationType"), "badSubs");
                    if (z10) {
                        Intrinsics.checkNotNullParameter(dataJsonObject, "dataJsonObject");
                        kd.d dVar = new kd.d(8);
                        boolean z13 = false;
                        try {
                            if (dataJsonObject.has("notificationType")) {
                                z13 = Intrinsics.areEqual(dataJsonObject.getString("notificationType"), "pay");
                            }
                        } catch (Exception e11) {
                            d.b(4, "OnPayPushUseCaseIsType", e11);
                        }
                        if (z13) {
                            c0.t(MyApp.f6830c, c.c(), null, new j(dVar, dataJsonObject, (Continuation) null), 2);
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            return;
                        }
                        Intrinsics.checkNotNullParameter(dataJsonObject, "dataJsonObject");
                        kd.d dVar2 = new kd.d(10);
                        try {
                            if (dataJsonObject.has("notificationType")) {
                                z12 = Intrinsics.areEqual(dataJsonObject.getString("notificationType"), "whiteUser");
                            }
                        } catch (Exception e12) {
                            d.b(4, "isTypePushBase", e12);
                        }
                        if (z12) {
                            c0.t(MyApp.f6830c, c.c(), null, new bd.b(2, null, 5), 2);
                            dVar2.d(dataJsonObject);
                        }
                        if (z12) {
                            return;
                        }
                        if (ci.c.B(dataJsonObject)) {
                            ci.c.N(remoteMessage, context, dataJsonObject);
                            return;
                        }
                        if (ci.c.D(dataJsonObject)) {
                            ci.c.P(remoteMessage, dataJsonObject);
                            return;
                        }
                        if (ci.c.H(dataJsonObject)) {
                            ci.c.R(remoteMessage, context, dataJsonObject);
                            return;
                        }
                        if (ci.c.C(dataJsonObject)) {
                            ci.c.O(remoteMessage, context, dataJsonObject);
                            return;
                        }
                        if (ci.c.F(dataJsonObject)) {
                            ci.c.S(remoteMessage, context, dataJsonObject);
                            return;
                        }
                        if (ci.c.E(dataJsonObject)) {
                            ci.c.Q(remoteMessage, context, dataJsonObject);
                            return;
                        } else if (ci.c.G(dataJsonObject)) {
                            ci.c.T(remoteMessage, context, dataJsonObject);
                            return;
                        } else {
                            ci.c.U(remoteMessage, context, dataJsonObject);
                            return;
                        }
                    }
                    return;
                }
                z10 = false;
                if (z10) {
                }
            }
            z7 = false;
            if (z7) {
            }
            if (!z7) {
            }
        } catch (Exception e13) {
            d.b(6, null, e13);
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void onNewToken(String pushToken) {
        Intrinsics.checkNotNullParameter(pushToken, "fbToken");
        Intrinsics.checkNotNullParameter(pushToken, "pushToken");
        io.sentry.hints.j jVar = new io.sentry.hints.j(6);
        if (pushToken != null) {
            c0.t(MyApp.f6830c, new y("AppsFlyerUseCase"), null, new cd.c(jVar, pushToken, null, 3), 2);
        }
        y8.d dVar = new y8.d();
        if (pushToken != null) {
            c0.t(MyApp.f6830c, new y("PushTokenUseCase"), null, new ab.b(dVar, pushToken, null, 13), 2);
        }
        c0.t(MyApp.f6830c, new y("TokenPush"), null, new bd.b(2, null, 6), 2);
    }
}
