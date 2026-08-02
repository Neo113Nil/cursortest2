package io.radar.sdk;

import android.location.Location;
import android.os.Handler;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.radar.sdk.Radar;
import io.radar.sdk.model.RadarEvent;
import io.radar.sdk.model.RadarUser;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: Radar.kt */
@Metadata(d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J9\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"io/radar/sdk/Radar$logConversion$1", "Lio/radar/sdk/Radar$RadarTrackCallback;", "onComplete", "", "status", "Lio/radar/sdk/Radar$RadarStatus;", FirebaseAnalytics.Param.LOCATION, "Landroid/location/Location;", "events", "", "Lio/radar/sdk/model/RadarEvent;", "user", "Lio/radar/sdk/model/RadarUser;", "(Lio/radar/sdk/Radar$RadarStatus;Landroid/location/Location;[Lio/radar/sdk/model/RadarEvent;Lio/radar/sdk/model/RadarUser;)V", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class Radar$logConversion$1 implements Radar.RadarTrackCallback {
    final /* synthetic */ Radar.RadarLogConversionCallback $callback;
    final /* synthetic */ JSONObject $metadata;
    final /* synthetic */ String $name;

    Radar$logConversion$1(String str, JSONObject jSONObject, Radar.RadarLogConversionCallback radarLogConversionCallback) {
        this.$name = str;
        this.$metadata = jSONObject;
        this.$callback = radarLogConversionCallback;
    }

    @Override // io.radar.sdk.Radar.RadarTrackCallback
    public void onComplete(final Radar.RadarStatus status, Location location, RadarEvent[] events, RadarUser user) {
        Intrinsics.checkNotNullParameter(status, "status");
        if (status != Radar.RadarStatus.SUCCESS || location == null) {
            Handler handler$sdk_release = Radar.INSTANCE.getHandler$sdk_release();
            final Radar.RadarLogConversionCallback radarLogConversionCallback = this.$callback;
            handler$sdk_release.post(new Runnable() { // from class: io.radar.sdk.Radar$logConversion$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    Radar$logConversion$1.onComplete$lambda$0(Radar.RadarLogConversionCallback.this, status);
                }
            });
            return;
        }
        Radar.sendLogConversionRequest$sdk_release(this.$name, this.$metadata, this.$callback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onComplete$lambda$0(Radar.RadarLogConversionCallback callback, Radar.RadarStatus status) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Intrinsics.checkNotNullParameter(status, "$status");
        Radar.RadarLogConversionCallback.DefaultImpls.onComplete$default(callback, status, null, 2, null);
    }
}
