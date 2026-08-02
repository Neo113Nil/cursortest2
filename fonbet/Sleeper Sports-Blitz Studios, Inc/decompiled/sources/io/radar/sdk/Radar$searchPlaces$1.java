package io.radar.sdk;

import android.location.Location;
import android.os.Handler;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.radar.sdk.Radar;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Radar.kt */
@Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"io/radar/sdk/Radar$searchPlaces$1", "Lio/radar/sdk/Radar$RadarLocationCallback;", "onComplete", "", "status", "Lio/radar/sdk/Radar$RadarStatus;", FirebaseAnalytics.Param.LOCATION, "Landroid/location/Location;", "stopped", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class Radar$searchPlaces$1 implements Radar.RadarLocationCallback {
    final /* synthetic */ Radar.RadarSearchPlacesCallback $callback;
    final /* synthetic */ String[] $categories;
    final /* synthetic */ Map<String, String> $chainMetadata;
    final /* synthetic */ String[] $chains;
    final /* synthetic */ String[] $countryCodes;
    final /* synthetic */ String[] $groups;
    final /* synthetic */ Integer $limit;
    final /* synthetic */ int $radius;

    Radar$searchPlaces$1(int i, String[] strArr, Map<String, String> map, String[] strArr2, String[] strArr3, String[] strArr4, Integer num, Radar.RadarSearchPlacesCallback radarSearchPlacesCallback) {
        this.$radius = i;
        this.$chains = strArr;
        this.$chainMetadata = map;
        this.$categories = strArr2;
        this.$groups = strArr3;
        this.$countryCodes = strArr4;
        this.$limit = num;
        this.$callback = radarSearchPlacesCallback;
    }

    @Override // io.radar.sdk.Radar.RadarLocationCallback
    public void onComplete(final Radar.RadarStatus status, Location location, boolean stopped) {
        Intrinsics.checkNotNullParameter(status, "status");
        if (status != Radar.RadarStatus.SUCCESS || location == null) {
            Handler handler$sdk_release = Radar.INSTANCE.getHandler$sdk_release();
            final Radar.RadarSearchPlacesCallback radarSearchPlacesCallback = this.$callback;
            handler$sdk_release.post(new Runnable() { // from class: io.radar.sdk.Radar$searchPlaces$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    Radar$searchPlaces$1.onComplete$lambda$0(Radar.RadarSearchPlacesCallback.this, status);
                }
            });
            return;
        }
        Radar.INSTANCE.getApiClient$sdk_release().searchPlaces$sdk_release(location, this.$radius, this.$chains, this.$chainMetadata, this.$categories, this.$groups, this.$countryCodes, this.$limit, new Radar$searchPlaces$1$onComplete$2(this.$callback, location));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onComplete$lambda$0(Radar.RadarSearchPlacesCallback callback, Radar.RadarStatus status) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Intrinsics.checkNotNullParameter(status, "$status");
        Radar.RadarSearchPlacesCallback.DefaultImpls.onComplete$default(callback, status, null, null, 6, null);
    }
}
