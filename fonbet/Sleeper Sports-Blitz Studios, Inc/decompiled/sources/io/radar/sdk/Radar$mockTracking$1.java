package io.radar.sdk;

import android.location.Location;
import android.os.Handler;
import com.facebook.common.util.UriUtil;
import io.radar.sdk.Radar;
import io.radar.sdk.RadarApiClient;
import io.radar.sdk.model.RadarCoordinate;
import io.radar.sdk.model.RadarRoute;
import io.radar.sdk.model.RadarRouteGeometry;
import io.radar.sdk.model.RadarRoutes;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.json.JSONObject;

/* compiled from: Radar.kt */
@Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\n"}, d2 = {"io/radar/sdk/Radar$mockTracking$1", "Lio/radar/sdk/RadarApiClient$RadarDistanceApiCallback;", "onComplete", "", "status", "Lio/radar/sdk/Radar$RadarStatus;", UriUtil.LOCAL_RESOURCE_SCHEME, "Lorg/json/JSONObject;", "routes", "Lio/radar/sdk/model/RadarRoutes;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class Radar$mockTracking$1 implements RadarApiClient.RadarDistanceApiCallback {
    final /* synthetic */ Radar.RadarTrackCallback $callback;
    final /* synthetic */ int $interval;
    final /* synthetic */ Radar.RadarRouteMode $mode;

    /* compiled from: Radar.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Radar.RadarRouteMode.values().length];
            try {
                iArr[Radar.RadarRouteMode.FOOT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Radar.RadarRouteMode.BIKE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Radar.RadarRouteMode.CAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Radar.RadarRouteMode.TRUCK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Radar.RadarRouteMode.MOTORBIKE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    Radar$mockTracking$1(Radar.RadarRouteMode radarRouteMode, int i, Radar.RadarTrackCallback radarTrackCallback) {
        this.$mode = radarRouteMode;
        this.$interval = i;
        this.$callback = radarTrackCallback;
    }

    @Override // io.radar.sdk.RadarApiClient.RadarDistanceApiCallback
    public void onComplete(final Radar.RadarStatus status, JSONObject res, RadarRoutes routes) {
        RadarRoute foot;
        RadarRouteGeometry geometry;
        RadarRoute bike;
        RadarRouteGeometry geometry2;
        RadarRoute car;
        RadarRouteGeometry geometry3;
        RadarRoute truck;
        RadarRouteGeometry geometry4;
        RadarRoute motorbike;
        RadarRouteGeometry geometry5;
        Intrinsics.checkNotNullParameter(status, "status");
        int i = WhenMappings.$EnumSwitchMapping$0[this.$mode.ordinal()];
        final RadarCoordinate[] radarCoordinateArr = null;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (routes != null && (motorbike = routes.getMotorbike()) != null && (geometry5 = motorbike.getGeometry()) != null) {
                            radarCoordinateArr = geometry5.getCoordinates();
                        }
                    } else if (routes != null && (truck = routes.getTruck()) != null && (geometry4 = truck.getGeometry()) != null) {
                        radarCoordinateArr = geometry4.getCoordinates();
                    }
                } else if (routes != null && (car = routes.getCar()) != null && (geometry3 = car.getGeometry()) != null) {
                    radarCoordinateArr = geometry3.getCoordinates();
                }
            } else if (routes != null && (bike = routes.getBike()) != null && (geometry2 = bike.getGeometry()) != null) {
                radarCoordinateArr = geometry2.getCoordinates();
            }
        } else if (routes != null && (foot = routes.getFoot()) != null && (geometry = foot.getGeometry()) != null) {
            radarCoordinateArr = geometry.getCoordinates();
        }
        if (radarCoordinateArr == null) {
            Handler handler$sdk_release = Radar.INSTANCE.getHandler$sdk_release();
            final Radar.RadarTrackCallback radarTrackCallback = this.$callback;
            handler$sdk_release.post(new Runnable() { // from class: io.radar.sdk.Radar$mockTracking$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    Radar$mockTracking$1.onComplete$lambda$0(Radar.RadarTrackCallback.this, status);
                }
            });
            return;
        }
        final Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = this.$interval;
        int i2 = this.$interval;
        if (i2 < 1) {
            intRef.element = 1;
        } else if (i2 > 60) {
            intRef.element = 60;
        }
        final Ref.IntRef intRef2 = new Ref.IntRef();
        final Radar.RadarTrackCallback radarTrackCallback2 = this.$callback;
        Radar.INSTANCE.getHandler$sdk_release().post(new Runnable() { // from class: io.radar.sdk.Radar$mockTracking$1$onComplete$track$1
            @Override // java.lang.Runnable
            public void run() {
                RadarCoordinate radarCoordinate = radarCoordinateArr[intRef2.element];
                Location location = new Location("RadarSDK");
                location.setLatitude(radarCoordinate.getLatitude());
                location.setLongitude(radarCoordinate.getLongitude());
                location.setAccuracy(5.0f);
                boolean z = true;
                if (intRef2.element != 0 && intRef2.element != radarCoordinateArr.length - 1) {
                    z = false;
                }
                RadarApiClient.track$sdk_release$default(Radar.INSTANCE.getApiClient$sdk_release(), location, z, false, Radar.RadarLocationSource.MOCK_LOCATION, false, null, false, null, null, null, null, null, null, null, new Radar$mockTracking$1$onComplete$track$1$run$1(intRef2, radarCoordinateArr, this, intRef, radarTrackCallback2, location), 16320, null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onComplete$lambda$0(Radar.RadarTrackCallback radarTrackCallback, Radar.RadarStatus status) {
        Intrinsics.checkNotNullParameter(status, "$status");
        if (radarTrackCallback != null) {
            Radar.RadarTrackCallback.DefaultImpls.onComplete$default(radarTrackCallback, status, null, null, null, 14, null);
        }
    }
}
