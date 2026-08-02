package io.radar.sdk;

import android.content.Context;
import android.os.Build;
import androidx.core.content.ContextCompat;
import com.google.android.gms.location.ActivityRecognition;
import com.google.android.gms.location.ActivityRecognitionClient;
import com.google.android.gms.location.ActivityTransition;
import com.google.android.gms.location.ActivityTransitionRequest;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import io.radar.sdk.Radar;
import io.radar.sdk.RadarActivityManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RadarActivityManager.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001b\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0010H\u0000¢\u0006\u0002\b\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0016"}, d2 = {"Lio/radar/sdk/RadarActivityManager;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "activityClient", "Lcom/google/android/gms/location/ActivityRecognitionClient;", "request", "Lcom/google/android/gms/location/ActivityTransitionRequest;", "getRequest", "()Lcom/google/android/gms/location/ActivityTransitionRequest;", "transitions", "", "Lcom/google/android/gms/location/ActivityTransition;", "startActivityUpdates", "Lkotlin/Result;", "", "startActivityUpdates-d1pmJ48$sdk_release", "()Ljava/lang/Object;", "stopActivityUpdates", "stopActivityUpdates$sdk_release", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class RadarActivityManager {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static boolean isActivityUpdatesStarted;
    private final ActivityRecognitionClient activityClient;
    private final Context context;
    private final ActivityTransitionRequest request;
    private final List<ActivityTransition> transitions;

    public RadarActivityManager(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        ArrayList arrayList = new ArrayList();
        this.transitions = arrayList;
        arrayList.add(new ActivityTransition.Builder().setActivityType(0).setActivityTransition(0).build());
        arrayList.add(new ActivityTransition.Builder().setActivityType(1).setActivityTransition(0).build());
        arrayList.add(new ActivityTransition.Builder().setActivityType(8).setActivityTransition(0).build());
        arrayList.add(new ActivityTransition.Builder().setActivityType(3).setActivityTransition(0).build());
        arrayList.add(new ActivityTransition.Builder().setActivityType(7).setActivityTransition(0).build());
        this.request = new ActivityTransitionRequest(arrayList);
        ActivityRecognitionClient client = ActivityRecognition.getClient(context);
        Intrinsics.checkNotNullExpressionValue(client, "getClient(...)");
        this.activityClient = client;
    }

    public final ActivityTransitionRequest getRequest() {
        return this.request;
    }

    /* compiled from: RadarActivityManager.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lio/radar/sdk/RadarActivityManager$Companion;", "", "()V", "isActivityUpdatesStarted", "", "getActivityType", "Lio/radar/sdk/Radar$RadarActivityType;", "int", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Radar.RadarActivityType getActivityType(int r2) {
            if (r2 == 0) {
                return Radar.RadarActivityType.CAR;
            }
            if (r2 == 1) {
                return Radar.RadarActivityType.BIKE;
            }
            if (r2 == 3) {
                return Radar.RadarActivityType.STATIONARY;
            }
            if (r2 == 7) {
                return Radar.RadarActivityType.FOOT;
            }
            if (r2 == 8) {
                return Radar.RadarActivityType.RUN;
            }
            return Radar.RadarActivityType.UNKNOWN;
        }
    }

    /* renamed from: startActivityUpdates-d1pmJ48$sdk_release, reason: not valid java name */
    public final Object m13254startActivityUpdatesd1pmJ48$sdk_release() {
        try {
            Result.Companion companion = Result.INSTANCE;
            if (Build.VERSION.SDK_INT < 29 || ContextCompat.checkSelfPermission(this.context, "android.permission.ACTIVITY_RECOGNITION") != 0) {
                RadarLogger.d$default(Radar.INSTANCE.getLogger$sdk_release(), "Permission for activity recognition not granted", null, null, 6, null);
            } else if (!isActivityUpdatesStarted) {
                RadarLogger.d$default(Radar.INSTANCE.getLogger$sdk_release(), "trying to start activity updates", null, null, 6, null);
                Task<Void> requestActivityTransitionUpdates = this.activityClient.requestActivityTransitionUpdates(this.request, RadarLocationReceiver.INSTANCE.getActivityPendingIntent$sdk_release(this.context));
                Intrinsics.checkNotNullExpressionValue(requestActivityTransitionUpdates, "requestActivityTransitionUpdates(...)");
                final RadarActivityManager$startActivityUpdates$1$1 radarActivityManager$startActivityUpdates$1$1 = new Function1<Void, Unit>() { // from class: io.radar.sdk.RadarActivityManager$startActivityUpdates$1$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Void r1) {
                        invoke2(r1);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Void r7) {
                        RadarActivityManager.Companion companion2 = RadarActivityManager.INSTANCE;
                        RadarActivityManager.isActivityUpdatesStarted = true;
                        RadarLogger.d$default(Radar.INSTANCE.getLogger$sdk_release(), "Activity updates started", null, null, 6, null);
                    }
                };
                requestActivityTransitionUpdates.addOnSuccessListener(new OnSuccessListener() { // from class: io.radar.sdk.RadarActivityManager$$ExternalSyntheticLambda0
                    @Override // com.google.android.gms.tasks.OnSuccessListener
                    public final void onSuccess(Object obj) {
                        RadarActivityManager.startActivityUpdates_d1pmJ48$lambda$2$lambda$0(Function1.this, obj);
                    }
                });
                requestActivityTransitionUpdates.addOnFailureListener(new OnFailureListener() { // from class: io.radar.sdk.RadarActivityManager$$ExternalSyntheticLambda1
                    @Override // com.google.android.gms.tasks.OnFailureListener
                    public final void onFailure(Exception exc) {
                        RadarActivityManager.startActivityUpdates_d1pmJ48$lambda$2$lambda$1(exc);
                    }
                });
            } else {
                RadarLogger.d$default(Radar.INSTANCE.getLogger$sdk_release(), "Activity updates already started", null, null, 6, null);
            }
            return Result.m13470constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m13470constructorimpl(ResultKt.createFailure(th));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startActivityUpdates_d1pmJ48$lambda$2$lambda$0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startActivityUpdates_d1pmJ48$lambda$2$lambda$1(Exception e) {
        Intrinsics.checkNotNullParameter(e, "e");
        RadarLogger.e$default(Radar.INSTANCE.getLogger$sdk_release(), "Activity updates failed to start", null, null, 6, null);
    }

    public final void stopActivityUpdates$sdk_release() {
        if (isActivityUpdatesStarted) {
            this.activityClient.removeActivityUpdates(RadarLocationReceiver.INSTANCE.getActivityPendingIntent$sdk_release(this.context));
            isActivityUpdatesStarted = false;
        }
    }
}
