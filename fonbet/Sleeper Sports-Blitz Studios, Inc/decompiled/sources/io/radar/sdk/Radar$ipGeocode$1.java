package io.radar.sdk;

import android.os.Handler;
import com.facebook.common.util.UriUtil;
import io.radar.sdk.Radar;
import io.radar.sdk.RadarApiClient;
import io.radar.sdk.model.RadarAddress;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: Radar.kt */
@Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"io/radar/sdk/Radar$ipGeocode$1", "Lio/radar/sdk/RadarApiClient$RadarIpGeocodeApiCallback;", "onComplete", "", "status", "Lio/radar/sdk/Radar$RadarStatus;", UriUtil.LOCAL_RESOURCE_SCHEME, "Lorg/json/JSONObject;", "address", "Lio/radar/sdk/model/RadarAddress;", "proxy", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class Radar$ipGeocode$1 implements RadarApiClient.RadarIpGeocodeApiCallback {
    final /* synthetic */ Radar.RadarIpGeocodeCallback $callback;

    Radar$ipGeocode$1(Radar.RadarIpGeocodeCallback radarIpGeocodeCallback) {
        this.$callback = radarIpGeocodeCallback;
    }

    @Override // io.radar.sdk.RadarApiClient.RadarIpGeocodeApiCallback
    public void onComplete(final Radar.RadarStatus status, JSONObject res, final RadarAddress address, final boolean proxy) {
        Intrinsics.checkNotNullParameter(status, "status");
        Handler handler$sdk_release = Radar.INSTANCE.getHandler$sdk_release();
        final Radar.RadarIpGeocodeCallback radarIpGeocodeCallback = this.$callback;
        handler$sdk_release.post(new Runnable() { // from class: io.radar.sdk.Radar$ipGeocode$1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                Radar$ipGeocode$1.onComplete$lambda$0(Radar.RadarIpGeocodeCallback.this, status, address, proxy);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onComplete$lambda$0(Radar.RadarIpGeocodeCallback callback, Radar.RadarStatus status, RadarAddress radarAddress, boolean z) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Intrinsics.checkNotNullParameter(status, "$status");
        callback.onComplete(status, radarAddress, z);
    }
}
