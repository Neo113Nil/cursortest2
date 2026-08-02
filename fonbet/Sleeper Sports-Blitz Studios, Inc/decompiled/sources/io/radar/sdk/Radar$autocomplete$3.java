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
@Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J/\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"io/radar/sdk/Radar$autocomplete$3", "Lio/radar/sdk/RadarApiClient$RadarGeocodeApiCallback;", "onComplete", "", "status", "Lio/radar/sdk/Radar$RadarStatus;", UriUtil.LOCAL_RESOURCE_SCHEME, "Lorg/json/JSONObject;", "addresses", "", "Lio/radar/sdk/model/RadarAddress;", "(Lio/radar/sdk/Radar$RadarStatus;Lorg/json/JSONObject;[Lio/radar/sdk/model/RadarAddress;)V", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class Radar$autocomplete$3 implements RadarApiClient.RadarGeocodeApiCallback {
    final /* synthetic */ Radar.RadarGeocodeCallback $callback;

    Radar$autocomplete$3(Radar.RadarGeocodeCallback radarGeocodeCallback) {
        this.$callback = radarGeocodeCallback;
    }

    @Override // io.radar.sdk.RadarApiClient.RadarGeocodeApiCallback
    public void onComplete(final Radar.RadarStatus status, JSONObject res, final RadarAddress[] addresses) {
        Intrinsics.checkNotNullParameter(status, "status");
        Handler handler$sdk_release = Radar.INSTANCE.getHandler$sdk_release();
        final Radar.RadarGeocodeCallback radarGeocodeCallback = this.$callback;
        handler$sdk_release.post(new Runnable() { // from class: io.radar.sdk.Radar$autocomplete$3$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                Radar$autocomplete$3.onComplete$lambda$0(Radar.RadarGeocodeCallback.this, status, addresses);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onComplete$lambda$0(Radar.RadarGeocodeCallback callback, Radar.RadarStatus status, RadarAddress[] radarAddressArr) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Intrinsics.checkNotNullParameter(status, "$status");
        callback.onComplete(status, radarAddressArr);
    }
}
