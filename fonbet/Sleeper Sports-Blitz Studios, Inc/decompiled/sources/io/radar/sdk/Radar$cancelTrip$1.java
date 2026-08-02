package io.radar.sdk;

import android.content.Context;
import android.os.Handler;
import com.facebook.common.util.UriUtil;
import io.radar.sdk.Radar;
import io.radar.sdk.RadarApiClient;
import io.radar.sdk.model.RadarEvent;
import io.radar.sdk.model.RadarTrip;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: Radar.kt */
@Metadata(d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J9\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0016¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"io/radar/sdk/Radar$cancelTrip$1", "Lio/radar/sdk/RadarApiClient$RadarTripApiCallback;", "onComplete", "", "status", "Lio/radar/sdk/Radar$RadarStatus;", UriUtil.LOCAL_RESOURCE_SCHEME, "Lorg/json/JSONObject;", "trip", "Lio/radar/sdk/model/RadarTrip;", "events", "", "Lio/radar/sdk/model/RadarEvent;", "(Lio/radar/sdk/Radar$RadarStatus;Lorg/json/JSONObject;Lio/radar/sdk/model/RadarTrip;[Lio/radar/sdk/model/RadarEvent;)V", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class Radar$cancelTrip$1 implements RadarApiClient.RadarTripApiCallback {
    final /* synthetic */ Radar.RadarTripCallback $callback;

    Radar$cancelTrip$1(Radar.RadarTripCallback radarTripCallback) {
        this.$callback = radarTripCallback;
    }

    @Override // io.radar.sdk.RadarApiClient.RadarTripApiCallback
    public void onComplete(final Radar.RadarStatus status, JSONObject res, final RadarTrip trip, final RadarEvent[] events) {
        Context context;
        Intrinsics.checkNotNullParameter(status, "status");
        if (status == Radar.RadarStatus.SUCCESS || status == Radar.RadarStatus.ERROR_NOT_FOUND) {
            RadarSettings radarSettings = RadarSettings.INSTANCE;
            context = Radar.context;
            if (context == null) {
                Intrinsics.throwUninitializedPropertyAccessException("context");
                context = null;
            }
            radarSettings.setTripOptions$sdk_release(context, null);
            Radar.INSTANCE.getLocationManager$sdk_release().restartPreviousTrackingOptions$sdk_release();
            Radar.INSTANCE.getLocationManager$sdk_release().getLocation(null);
        }
        Handler handler$sdk_release = Radar.INSTANCE.getHandler$sdk_release();
        final Radar.RadarTripCallback radarTripCallback = this.$callback;
        handler$sdk_release.post(new Runnable() { // from class: io.radar.sdk.Radar$cancelTrip$1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                Radar$cancelTrip$1.onComplete$lambda$0(Radar.RadarTripCallback.this, status, trip, events);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onComplete$lambda$0(Radar.RadarTripCallback radarTripCallback, Radar.RadarStatus status, RadarTrip radarTrip, RadarEvent[] radarEventArr) {
        Intrinsics.checkNotNullParameter(status, "$status");
        if (radarTripCallback != null) {
            radarTripCallback.onComplete(status, radarTrip, radarEventArr);
        }
    }
}
