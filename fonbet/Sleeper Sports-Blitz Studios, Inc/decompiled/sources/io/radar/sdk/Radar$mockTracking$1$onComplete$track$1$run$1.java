package io.radar.sdk;

import android.location.Location;
import android.os.Handler;
import com.facebook.common.util.UriUtil;
import com.socure.docv.capturesdk.common.analytics.AnalyticsConstantsKt;
import io.radar.sdk.Radar;
import io.radar.sdk.RadarApiClient;
import io.radar.sdk.model.RadarConfig;
import io.radar.sdk.model.RadarCoordinate;
import io.radar.sdk.model.RadarEvent;
import io.radar.sdk.model.RadarGeofence;
import io.radar.sdk.model.RadarUser;
import io.radar.sdk.model.RadarVerifiedLocationToken;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.json.JSONObject;

/* compiled from: Radar.kt */
@Metadata(d1 = {"\u0000A\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J]\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0002\u0010\u0013¨\u0006\u0014"}, d2 = {"io/radar/sdk/Radar$mockTracking$1$onComplete$track$1$run$1", "Lio/radar/sdk/RadarApiClient$RadarTrackApiCallback;", "onComplete", "", "status", "Lio/radar/sdk/Radar$RadarStatus;", UriUtil.LOCAL_RESOURCE_SCHEME, "Lorg/json/JSONObject;", "events", "", "Lio/radar/sdk/model/RadarEvent;", "user", "Lio/radar/sdk/model/RadarUser;", "nearbyGeofences", "Lio/radar/sdk/model/RadarGeofence;", AnalyticsConstantsKt.KEY_CONFIG, "Lio/radar/sdk/model/RadarConfig;", AnalyticsConstantsKt.KEY_TOKEN, "Lio/radar/sdk/model/RadarVerifiedLocationToken;", "(Lio/radar/sdk/Radar$RadarStatus;Lorg/json/JSONObject;[Lio/radar/sdk/model/RadarEvent;Lio/radar/sdk/model/RadarUser;[Lio/radar/sdk/model/RadarGeofence;Lio/radar/sdk/model/RadarConfig;Lio/radar/sdk/model/RadarVerifiedLocationToken;)V", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class Radar$mockTracking$1$onComplete$track$1$run$1 implements RadarApiClient.RadarTrackApiCallback {
    final /* synthetic */ Radar.RadarTrackCallback $callback;
    final /* synthetic */ RadarCoordinate[] $coordinates;
    final /* synthetic */ Ref.IntRef $i;
    final /* synthetic */ Ref.IntRef $intervalLimit;
    final /* synthetic */ Location $location;
    final /* synthetic */ Radar$mockTracking$1$onComplete$track$1 $track;

    Radar$mockTracking$1$onComplete$track$1$run$1(Ref.IntRef intRef, RadarCoordinate[] radarCoordinateArr, Radar$mockTracking$1$onComplete$track$1 radar$mockTracking$1$onComplete$track$1, Ref.IntRef intRef2, Radar.RadarTrackCallback radarTrackCallback, Location location) {
        this.$i = intRef;
        this.$coordinates = radarCoordinateArr;
        this.$track = radar$mockTracking$1$onComplete$track$1;
        this.$intervalLimit = intRef2;
        this.$callback = radarTrackCallback;
        this.$location = location;
    }

    @Override // io.radar.sdk.RadarApiClient.RadarTrackApiCallback
    public void onComplete(final Radar.RadarStatus status, JSONObject res, final RadarEvent[] events, final RadarUser user, RadarGeofence[] nearbyGeofences, RadarConfig config, RadarVerifiedLocationToken token) {
        Intrinsics.checkNotNullParameter(status, "status");
        Handler handler$sdk_release = Radar.INSTANCE.getHandler$sdk_release();
        final Radar.RadarTrackCallback radarTrackCallback = this.$callback;
        final Location location = this.$location;
        handler$sdk_release.post(new Runnable() { // from class: io.radar.sdk.Radar$mockTracking$1$onComplete$track$1$run$1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                Radar$mockTracking$1$onComplete$track$1$run$1.onComplete$lambda$0(Radar.RadarTrackCallback.this, status, location, events, user);
            }
        });
        if (this.$i.element < this.$coordinates.length - 1) {
            Radar.INSTANCE.getHandler$sdk_release().postDelayed(this.$track, this.$intervalLimit.element * 1000);
        }
        this.$i.element++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onComplete$lambda$0(Radar.RadarTrackCallback radarTrackCallback, Radar.RadarStatus status, Location location, RadarEvent[] radarEventArr, RadarUser radarUser) {
        Intrinsics.checkNotNullParameter(status, "$status");
        Intrinsics.checkNotNullParameter(location, "$location");
        if (radarTrackCallback != null) {
            radarTrackCallback.onComplete(status, location, radarEventArr, radarUser);
        }
    }
}
