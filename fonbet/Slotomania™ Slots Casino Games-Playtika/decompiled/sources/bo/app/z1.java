package bo.app;

import android.app.Activity;
import bo.app.x3;
import com.braze.Constants;
import com.braze.models.IBrazeLocation;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\bg\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\b\u001a\u00020\u0002H&J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH&J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH&J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH&J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H&J\b\u0010\u000f\u001a\u00020\u0002H&J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H&J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H&J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\tH&J\b\u0010\u0017\u001a\u00020\u0002H&J\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH&J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001aH&J,\u0010\f\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001c2\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010!\u001a\u00020\u000bH&J\u0012\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\"\u001a\u00020\u001cH&J\b\u0010#\u001a\u00020\u0002H&J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010%\u001a\u00020$H&J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010%\u001a\u00020$H&R\u001c\u0010&\u001a\u00020\u000b8&@&X¦\u000e¢\u0006\f\u001a\u0004\b&\u0010'\"\u0004\b\u000f\u0010(R\u001c\u0010*\u001a\u00020\u000b8&@&X¦\u000e¢\u0006\f\u001a\u0004\b)\u0010'\"\u0004\b\f\u0010(R\u0016\u0010,\u001a\u0004\u0018\u00010$8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010+ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006-À\u0006\u0001"}, d2 = {"Lbo/app/z1;", "", "", Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE, "Landroid/app/Activity;", "activity", "openSession", "closeSession", "e", "Lbo/app/x1;", "event", "", Constants.BRAZE_PUSH_CONTENT_KEY, "", "throwable", "b", "Lbo/app/x3$a;", "respondWithBuilder", "Lbo/app/a2;", "request", "Lcom/braze/models/IBrazeLocation;", FirebaseAnalytics.Param.LOCATION, "geofenceEvent", "refreshFeatureFlags", "Lbo/app/b6;", "templatedTriggeredAction", "Lbo/app/t2;", "triggerEvent", "", "lastCardUpdatedAt", "lastFullSyncAt", "", "retryCount", "isClientInitiated", "waitTimeInMs", "f", "", "campaignId", "isOutboundNetworkRequestsOffline", "()Z", "(Z)V", "c", "shouldRequestTriggersInNextRequest", "()Ljava/lang/String;", "userId", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public interface z1 {
    static /* synthetic */ void a(z1 z1Var, long j, long j2, int i, boolean z, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestContentCardsSync");
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        if ((i2 & 8) != 0) {
            z = false;
        }
        z1Var.a(j, j2, i, z);
    }

    String a();

    void a(long waitTimeInMs);

    void a(long lastCardUpdatedAt, long lastFullSyncAt, int retryCount, boolean isClientInitiated);

    void a(a2 request);

    void a(b6 templatedTriggeredAction, t2 triggerEvent);

    void a(t2 triggerEvent);

    void a(x3.a respondWithBuilder);

    void a(IBrazeLocation location);

    void a(String campaignId);

    void a(Throwable throwable);

    void a(boolean z);

    boolean a(x1 event);

    void b();

    void b(x1 geofenceEvent);

    void b(String campaignId);

    void b(Throwable throwable);

    void b(boolean z);

    boolean c();

    void closeSession(Activity activity);

    void d();

    void e();

    void f();

    void openSession(Activity activity);

    void refreshFeatureFlags();

    static /* synthetic */ void a(z1 z1Var, long j, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: performPushDeliveryFlush");
        }
        if ((i & 1) != 0) {
            j = 0;
        }
        z1Var.a(j);
    }
}
