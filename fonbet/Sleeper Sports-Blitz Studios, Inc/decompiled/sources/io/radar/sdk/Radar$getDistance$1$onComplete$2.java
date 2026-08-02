package io.radar.sdk;

import android.os.Handler;
import com.facebook.common.util.UriUtil;
import io.radar.sdk.Radar;
import io.radar.sdk.RadarApiClient;
import io.radar.sdk.model.RadarRoutes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: Radar.kt */
@Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\n"}, d2 = {"io/radar/sdk/Radar$getDistance$1$onComplete$2", "Lio/radar/sdk/RadarApiClient$RadarDistanceApiCallback;", "onComplete", "", "status", "Lio/radar/sdk/Radar$RadarStatus;", UriUtil.LOCAL_RESOURCE_SCHEME, "Lorg/json/JSONObject;", "routes", "Lio/radar/sdk/model/RadarRoutes;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class Radar$getDistance$1$onComplete$2 implements RadarApiClient.RadarDistanceApiCallback {
    final /* synthetic */ Radar.RadarRouteCallback $callback;

    Radar$getDistance$1$onComplete$2(Radar.RadarRouteCallback radarRouteCallback) {
        this.$callback = radarRouteCallback;
    }

    @Override // io.radar.sdk.RadarApiClient.RadarDistanceApiCallback
    public void onComplete(final Radar.RadarStatus status, JSONObject res, final RadarRoutes routes) {
        Intrinsics.checkNotNullParameter(status, "status");
        Handler handler$sdk_release = Radar.INSTANCE.getHandler$sdk_release();
        final Radar.RadarRouteCallback radarRouteCallback = this.$callback;
        handler$sdk_release.post(new Runnable() { // from class: io.radar.sdk.Radar$getDistance$1$onComplete$2$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                Radar$getDistance$1$onComplete$2.onComplete$lambda$0(Radar.RadarRouteCallback.this, status, routes);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onComplete$lambda$0(Radar.RadarRouteCallback callback, Radar.RadarStatus status, RadarRoutes radarRoutes) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Intrinsics.checkNotNullParameter(status, "$status");
        callback.onComplete(status, radarRoutes);
    }
}
