package io.radar.sdk;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.socure.docv.capturesdk.common.analytics.AnalyticsConstantsKt;
import io.radar.sdk.RadarFirebaseMessagingService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RadarFirebaseMessagingService.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\u000b"}, d2 = {"Lio/radar/sdk/RadarFirebaseMessagingService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "()V", "onMessageReceived", "", "message", "Lcom/google/firebase/messaging/RemoteMessage;", "onNewToken", AnalyticsConstantsKt.KEY_TOKEN, "", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class RadarFirebaseMessagingService extends FirebaseMessagingService {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(RemoteMessage message) {
        Intrinsics.checkNotNullParameter(message, "message");
        super.onMessageReceived(message);
        if (!Radar.isInitialized()) {
            Radar.initialize$default(this, null, 2, null);
        }
        if (Intrinsics.areEqual(message.getData().get("type"), "radar:trackOnce")) {
            Radar.trackOnce$default(null, 1, null);
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        super.onNewToken(token);
        if (!Radar.isInitialized()) {
            Radar.initialize$default(this, null, 2, null);
        }
        RadarSettings.INSTANCE.setPushNotificationToken(token);
    }

    /* compiled from: RadarFirebaseMessagingService.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lio/radar/sdk/RadarFirebaseMessagingService$Companion;", "", "()V", "initialize", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void initialize$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        public final void initialize() {
            Task<String> token = FirebaseMessaging.getInstance().getToken();
            final RadarFirebaseMessagingService$Companion$initialize$1 radarFirebaseMessagingService$Companion$initialize$1 = new Function1<String, Unit>() { // from class: io.radar.sdk.RadarFirebaseMessagingService$Companion$initialize$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(String str) {
                    invoke2(str);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(String str) {
                    Radar.setPushNotificationToken(str);
                }
            };
            token.addOnSuccessListener(new OnSuccessListener() { // from class: io.radar.sdk.RadarFirebaseMessagingService$Companion$$ExternalSyntheticLambda0
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    RadarFirebaseMessagingService.Companion.initialize$lambda$0(Function1.this, obj);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: io.radar.sdk.RadarFirebaseMessagingService$Companion$$ExternalSyntheticLambda1
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    RadarFirebaseMessagingService.Companion.initialize$lambda$1(exc);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void initialize$lambda$1(Exception it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (Radar.isInitialized()) {
                RadarLogger.w$default(Radar.INSTANCE.getLogger$sdk_release(), "failed to get firebase token", null, null, 6, null);
            }
        }
    }
}
