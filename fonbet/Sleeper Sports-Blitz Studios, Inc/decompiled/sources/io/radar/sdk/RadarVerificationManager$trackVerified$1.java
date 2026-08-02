package io.radar.sdk;

import android.os.Handler;
import com.socure.docv.capturesdk.common.analytics.AnalyticsConstantsKt;
import io.radar.sdk.Radar;
import io.radar.sdk.RadarApiClient;
import io.radar.sdk.RadarTrackingOptions;
import io.radar.sdk.model.RadarConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RadarVerificationManager.kt */
@Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, d2 = {"io/radar/sdk/RadarVerificationManager$trackVerified$1", "Lio/radar/sdk/RadarApiClient$RadarGetConfigApiCallback;", "onComplete", "", "status", "Lio/radar/sdk/Radar$RadarStatus;", AnalyticsConstantsKt.KEY_CONFIG, "Lio/radar/sdk/model/RadarConfig;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class RadarVerificationManager$trackVerified$1 implements RadarApiClient.RadarGetConfigApiCallback {
    final /* synthetic */ boolean $beacons;
    final /* synthetic */ Radar.RadarTrackVerifiedCallback $callback;
    final /* synthetic */ RadarTrackingOptions.RadarTrackingOptionsDesiredAccuracy $desiredAccuracy;
    final /* synthetic */ boolean $lastTokenBeacons;
    final /* synthetic */ String $reason;
    final /* synthetic */ String $transactionId;
    final /* synthetic */ RadarVerificationManager $verificationManager;

    RadarVerificationManager$trackVerified$1(RadarTrackingOptions.RadarTrackingOptionsDesiredAccuracy radarTrackingOptionsDesiredAccuracy, Radar.RadarTrackVerifiedCallback radarTrackVerifiedCallback, RadarVerificationManager radarVerificationManager, boolean z, String str, String str2, boolean z2) {
        this.$desiredAccuracy = radarTrackingOptionsDesiredAccuracy;
        this.$callback = radarTrackVerifiedCallback;
        this.$verificationManager = radarVerificationManager;
        this.$beacons = z;
        this.$reason = str;
        this.$transactionId = str2;
        this.$lastTokenBeacons = z2;
    }

    @Override // io.radar.sdk.RadarApiClient.RadarGetConfigApiCallback
    public void onComplete(final Radar.RadarStatus status, RadarConfig config) {
        Intrinsics.checkNotNullParameter(status, "status");
        if (status != Radar.RadarStatus.SUCCESS || config == null) {
            Handler handler$sdk_release = Radar.INSTANCE.getHandler$sdk_release();
            final Radar.RadarTrackVerifiedCallback radarTrackVerifiedCallback = this.$callback;
            handler$sdk_release.post(new Runnable() { // from class: io.radar.sdk.RadarVerificationManager$trackVerified$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    RadarVerificationManager$trackVerified$1.onComplete$lambda$0(Radar.RadarStatus.this, radarTrackVerifiedCallback);
                }
            });
        } else {
            Radar.INSTANCE.getLocationManager$sdk_release().getLocation(this.$desiredAccuracy, Radar.RadarLocationSource.FOREGROUND_LOCATION, new RadarVerificationManager$trackVerified$1$onComplete$2(this.$verificationManager, config.getGooglePlayProjectNumber(), this.$callback, this.$beacons, this.$reason, this.$transactionId, this.$lastTokenBeacons));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onComplete$lambda$0(Radar.RadarStatus status, Radar.RadarTrackVerifiedCallback radarTrackVerifiedCallback) {
        Intrinsics.checkNotNullParameter(status, "$status");
        if (status != Radar.RadarStatus.SUCCESS) {
            Radar.sendError$sdk_release$default(Radar.INSTANCE, status, null, 2, null);
        }
        if (radarTrackVerifiedCallback != null) {
            Radar.RadarTrackVerifiedCallback.DefaultImpls.onComplete$default(radarTrackVerifiedCallback, status, null, 2, null);
        }
    }
}
