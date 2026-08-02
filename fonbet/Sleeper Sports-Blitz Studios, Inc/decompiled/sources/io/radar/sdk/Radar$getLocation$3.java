package io.radar.sdk;

import android.location.Location;
import android.os.Handler;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.radar.sdk.Radar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Radar.kt */
@Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"io/radar/sdk/Radar$getLocation$3", "Lio/radar/sdk/Radar$RadarLocationCallback;", "onComplete", "", "status", "Lio/radar/sdk/Radar$RadarStatus;", FirebaseAnalytics.Param.LOCATION, "Landroid/location/Location;", "stopped", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class Radar$getLocation$3 implements Radar.RadarLocationCallback {
    final /* synthetic */ Radar.RadarLocationCallback $callback;

    Radar$getLocation$3(Radar.RadarLocationCallback radarLocationCallback) {
        this.$callback = radarLocationCallback;
    }

    @Override // io.radar.sdk.Radar.RadarLocationCallback
    public void onComplete(final Radar.RadarStatus status, final Location location, final boolean stopped) {
        Intrinsics.checkNotNullParameter(status, "status");
        Handler handler$sdk_release = Radar.INSTANCE.getHandler$sdk_release();
        final Radar.RadarLocationCallback radarLocationCallback = this.$callback;
        handler$sdk_release.post(new Runnable() { // from class: io.radar.sdk.Radar$getLocation$3$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                Radar$getLocation$3.onComplete$lambda$0(Radar.RadarLocationCallback.this, status, location, stopped);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onComplete$lambda$0(Radar.RadarLocationCallback radarLocationCallback, Radar.RadarStatus status, Location location, boolean z) {
        Intrinsics.checkNotNullParameter(status, "$status");
        if (radarLocationCallback != null) {
            radarLocationCallback.onComplete(status, location, z);
        }
    }
}
