package io.radar.sdk;

import android.content.Context;
import android.location.Location;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import com.google.android.play.core.integrity.StandardIntegrityManager;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import io.radar.sdk.Radar;
import io.radar.sdk.RadarTrackingOptions;
import io.radar.sdk.model.RadarRegion;
import io.radar.sdk.model.RadarVerifiedLocationToken;
import io.sentry.SentryEvent;
import io.sentry.clientreport.DiscardedEvent;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Enumeration;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RadarVerificationManager.kt */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0001\u0018\u0000 I2\u00020\u0001:\u0001IB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\nH\u0002J\u0006\u0010'\u001a\u00020%JN\u0010(\u001a\u00020%2\b\u0010)\u001a\u0004\u0018\u00010\n2:\u0010*\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\n¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(.\u0012\u0015\u0012\u0013\u0018\u00010\n¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(/\u0012\u0004\u0012\u00020%0+H\u0002J\u0006\u00100\u001a\u00020\nJ[\u00101\u001a\u00020%2\b\u00102\u001a\u0004\u0018\u00010\u00142\b\u0010)\u001a\u0004\u0018\u00010\n2:\u0010*\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\n¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(.\u0012\u0015\u0012\u0013\u0018\u00010\n¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(/\u0012\u0004\u0012\u00020%0+¢\u0006\u0002\u00103J\u000e\u00104\u001a\u00020\n2\u0006\u00105\u001a\u000206J\"\u00107\u001a\u00020%2\u0006\u00108\u001a\u00020\u00122\u0006\u00109\u001a\u00020:2\n\b\u0002\u0010;\u001a\u0004\u0018\u00010<J\b\u0010=\u001a\u00020\u0012H\u0002J\u0006\u0010>\u001a\u00020\u0012J\u0006\u0010?\u001a\u00020%J\u001a\u0010@\u001a\u00020%2\b\u0010A\u001a\u0004\u0018\u00010\n2\b\u0010B\u001a\u0004\u0018\u00010\nJ\u0016\u0010C\u001a\u00020%2\u0006\u0010D\u001a\u00020#2\u0006\u00108\u001a\u00020\u0012J\u0006\u0010E\u001a\u00020%J>\u0010F\u001a\u00020%2\b\b\u0002\u00108\u001a\u00020\u00122\b\b\u0002\u00109\u001a\u00020:2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010;\u001a\u0004\u0018\u00010<JV\u0010H\u001a\u00020%2\u0006\u00102\u001a\u00020\u00142\b\u0010)\u001a\u0004\u0018\u00010\n2:\u0010*\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\n¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(.\u0012\u0015\u0012\u0013\u0018\u00010\n¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(/\u0012\u0004\u0012\u00020%0+H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u000e\u0010!\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006J"}, d2 = {"Lio/radar/sdk/RadarVerificationManager;", "", "context", "Landroid/content/Context;", SentryEvent.JsonKeys.LOGGER, "Lio/radar/sdk/RadarLogger;", "(Landroid/content/Context;Lio/radar/sdk/RadarLogger;)V", "connectivityManager", "Landroid/net/ConnectivityManager;", "expectedCountryCode", "", "expectedStateCode", "handler", "Landroid/os/Handler;", "lastIPs", "lastToken", "Lio/radar/sdk/model/RadarVerifiedLocationToken;", "lastTokenBeacons", "", "lastTokenElapsedRealtime", "", "lastWarmUpTimestampSeconds", "networkCallback", "Landroid/net/ConnectivityManager$NetworkCallback;", "runnable", "Ljava/lang/Runnable;", "standardIntegrityTokenProvider", "Lcom/google/android/play/core/integrity/StandardIntegrityManager$StandardIntegrityTokenProvider;", "started", "getStarted", "()Z", "setStarted", "(Z)V", "startedBeacons", "startedInterval", "", "callTrackVerified", "", DiscardedEvent.JsonKeys.REASON, "clearVerifiedLocationToken", "fetchTokenFromGoogle", "requestHash", "block", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "integrityToken", "integrityException", "getIPs", "getIntegrityToken", "googlePlayProjectNumber", "(Ljava/lang/Long;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "getRequestHash", FirebaseAnalytics.Param.LOCATION, "Landroid/location/Location;", "getVerifiedLocationToken", RadarTrackingOptions.KEY_BEACONS, RadarTrackingOptions.KEY_DESIRED_ACCURACY, "Lio/radar/sdk/RadarTrackingOptions$RadarTrackingOptionsDesiredAccuracy;", "callback", "Lio/radar/sdk/Radar$RadarTrackVerifiedCallback;", "isIntegrityApiIncluded", "isLastTokenValid", "scheduleNextIntervalWithLastToken", "setExpectedJurisdiction", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "stateCode", "startTrackingVerified", "interval", "stopTrackingVerified", "trackVerified", "transactionId", "warmUpProviderAndFetchTokenFromGoogle", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class RadarVerificationManager {
    private static final int WARM_UP_WINDOW_SECONDS = 43200;
    private final ConnectivityManager connectivityManager;
    private final Context context;
    private String expectedCountryCode;
    private String expectedStateCode;
    private final Handler handler;
    private String lastIPs;
    private RadarVerifiedLocationToken lastToken;
    private boolean lastTokenBeacons;
    private long lastTokenElapsedRealtime;
    private long lastWarmUpTimestampSeconds;
    private final RadarLogger logger;
    private ConnectivityManager.NetworkCallback networkCallback;
    private Runnable runnable;
    private StandardIntegrityManager.StandardIntegrityTokenProvider standardIntegrityTokenProvider;
    private boolean started;
    private boolean startedBeacons;
    private int startedInterval;

    public RadarVerificationManager(Context context, RadarLogger logger) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.context = context;
        this.logger = logger;
        this.handler = new Handler(context.getMainLooper());
        Object systemService = context.getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.connectivityManager = (ConnectivityManager) systemService;
    }

    public final boolean getStarted() {
        return this.started;
    }

    public final void setStarted(boolean z) {
        this.started = z;
    }

    private final boolean isIntegrityApiIncluded() {
        try {
            Class.forName("com.google.android.play.core.integrity.StandardIntegrityManager");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static /* synthetic */ void trackVerified$default(RadarVerificationManager radarVerificationManager, boolean z, RadarTrackingOptions.RadarTrackingOptionsDesiredAccuracy radarTrackingOptionsDesiredAccuracy, String str, String str2, Radar.RadarTrackVerifiedCallback radarTrackVerifiedCallback, int i, Object obj) {
        Radar.RadarTrackVerifiedCallback radarTrackVerifiedCallback2;
        String str3;
        RadarTrackingOptions.RadarTrackingOptionsDesiredAccuracy radarTrackingOptionsDesiredAccuracy2;
        String str4;
        RadarVerificationManager radarVerificationManager2;
        boolean z2;
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            radarTrackingOptionsDesiredAccuracy = RadarTrackingOptions.RadarTrackingOptionsDesiredAccuracy.MEDIUM;
        }
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        if ((i & 16) != 0) {
            radarTrackVerifiedCallback2 = null;
            str4 = str;
            str3 = str2;
            z2 = z;
            radarTrackingOptionsDesiredAccuracy2 = radarTrackingOptionsDesiredAccuracy;
            radarVerificationManager2 = radarVerificationManager;
        } else {
            radarTrackVerifiedCallback2 = radarTrackVerifiedCallback;
            str3 = str2;
            radarTrackingOptionsDesiredAccuracy2 = radarTrackingOptionsDesiredAccuracy;
            str4 = str;
            radarVerificationManager2 = radarVerificationManager;
            z2 = z;
        }
        radarVerificationManager2.trackVerified(z2, radarTrackingOptionsDesiredAccuracy2, str4, str3, radarTrackVerifiedCallback2);
    }

    public final void trackVerified(boolean beacons, RadarTrackingOptions.RadarTrackingOptionsDesiredAccuracy desiredAccuracy, String reason, String transactionId, Radar.RadarTrackVerifiedCallback callback) {
        Intrinsics.checkNotNullParameter(desiredAccuracy, "desiredAccuracy");
        Radar.INSTANCE.getApiClient$sdk_release().getConfig$sdk_release("trackVerified", true, new RadarVerificationManager$trackVerified$1(desiredAccuracy, callback, this, beacons, reason, transactionId, beacons));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void callTrackVerified(String reason) {
        if (this.started) {
            trackVerified(this.startedBeacons, RadarTrackingOptions.RadarTrackingOptionsDesiredAccuracy.HIGH, reason, null, new Radar.RadarTrackVerifiedCallback() { // from class: io.radar.sdk.RadarVerificationManager$callTrackVerified$1
                @Override // io.radar.sdk.Radar.RadarTrackVerifiedCallback
                public void onComplete(Radar.RadarStatus status, RadarVerifiedLocationToken token) {
                    Intrinsics.checkNotNullParameter(status, "status");
                    RadarVerificationManager.this.scheduleNextIntervalWithLastToken();
                }
            });
        }
    }

    public final void scheduleNextIntervalWithLastToken() {
        int i = this.startedInterval;
        RadarVerifiedLocationToken radarVerifiedLocationToken = this.lastToken;
        if (radarVerifiedLocationToken != null) {
            int elapsedRealtime = ((int) (SystemClock.elapsedRealtime() - this.lastTokenElapsedRealtime)) / 1000;
            int min = Math.min(radarVerifiedLocationToken.getExpiresIn() - elapsedRealtime, this.startedInterval);
            RadarLogger.d$default(this.logger, "Calculated next interval | minInterval = " + min + "; expiresIn = " + radarVerifiedLocationToken.getExpiresIn() + "; lastTokenElapsed = " + elapsedRealtime + "; startedInterval = " + this.startedInterval, null, null, 6, null);
            i = min;
        }
        int i2 = i - 10;
        int i3 = i2 >= 10 ? i2 : 10;
        if (this.runnable == null) {
            this.runnable = new Runnable() { // from class: io.radar.sdk.RadarVerificationManager$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    RadarVerificationManager.scheduleNextIntervalWithLastToken$lambda$1(RadarVerificationManager.this, this);
                }
            };
        }
        Runnable runnable = this.runnable;
        if (runnable != null) {
            this.handler.removeCallbacks(runnable);
            if (this.started) {
                RadarLogger.d$default(this.logger, "Requesting token again in " + i3 + " seconds", null, null, 6, null);
                this.handler.postDelayed(runnable, ((long) i3) * 1000);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scheduleNextIntervalWithLastToken$lambda$1(RadarVerificationManager verificationManager, RadarVerificationManager this$0) {
        Intrinsics.checkNotNullParameter(verificationManager, "$verificationManager");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        RadarLogger.d$default(verificationManager.logger, "Token request interval fired", null, null, 6, null);
        this$0.callTrackVerified("interval");
    }

    public final void startTrackingVerified(int interval, boolean beacons) {
        stopTrackingVerified();
        this.started = true;
        this.startedInterval = interval;
        this.startedBeacons = beacons;
        NetworkRequest build = new NetworkRequest.Builder().addTransportType(3).addTransportType(0).addTransportType(2).addTransportType(1).removeCapability(15).build();
        final Function0<Unit> function0 = new Function0<Unit>() { // from class: io.radar.sdk.RadarVerificationManager$startTrackingVerified$handleNetworkChange$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                String str;
                String str2;
                RadarLogger radarLogger;
                RadarLogger radarLogger2;
                String str3;
                RadarLogger radarLogger3;
                RadarLogger radarLogger4;
                String iPs = RadarVerificationManager.this.getIPs();
                str = RadarVerificationManager.this.lastIPs;
                boolean z = false;
                if (str == null) {
                    radarLogger4 = RadarVerificationManager.this.logger;
                    RadarLogger.d$default(radarLogger4, "First time getting IPs", null, null, 6, null);
                } else {
                    if (Intrinsics.areEqual(iPs, "error")) {
                        radarLogger3 = RadarVerificationManager.this.logger;
                        RadarLogger.d$default(radarLogger3, "Error getting IPs", null, null, 6, null);
                    } else {
                        str2 = RadarVerificationManager.this.lastIPs;
                        if (!Intrinsics.areEqual(iPs, str2)) {
                            radarLogger2 = RadarVerificationManager.this.logger;
                            StringBuilder sb = new StringBuilder("IPs changed | ips = ");
                            sb.append(iPs);
                            sb.append("; lastIPs = ");
                            str3 = RadarVerificationManager.this.lastIPs;
                            sb.append(str3);
                            RadarLogger.d$default(radarLogger2, sb.toString(), null, null, 6, null);
                        } else {
                            radarLogger = RadarVerificationManager.this.logger;
                            RadarLogger.d$default(radarLogger, "IPs unchanged", null, null, 6, null);
                        }
                    }
                    z = true;
                }
                RadarVerificationManager.this.lastIPs = iPs;
                if (z) {
                    this.callTrackVerified("ip_change");
                }
            }
        };
        ConnectivityManager.NetworkCallback networkCallback = new ConnectivityManager.NetworkCallback() { // from class: io.radar.sdk.RadarVerificationManager$startTrackingVerified$1
            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(Network network) {
                RadarLogger radarLogger;
                Intrinsics.checkNotNullParameter(network, "network");
                super.onAvailable(network);
                radarLogger = RadarVerificationManager.this.logger;
                RadarLogger.d$default(radarLogger, "Network connected", null, null, 6, null);
                function0.invoke();
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(Network network) {
                RadarLogger radarLogger;
                Intrinsics.checkNotNullParameter(network, "network");
                super.onLost(network);
                radarLogger = RadarVerificationManager.this.logger;
                RadarLogger.d$default(radarLogger, "Network lost", null, null, 6, null);
                function0.invoke();
            }
        };
        this.networkCallback = networkCallback;
        this.connectivityManager.registerNetworkCallback(build, networkCallback);
        if (this.startedInterval < 20) {
            Radar.INSTANCE.getLocationManager$sdk_release().getLocationClient().requestLocationUpdates(RadarTrackingOptions.RadarTrackingOptionsDesiredAccuracy.HIGH, 0, 0, RadarLocationReceiver.INSTANCE.getVerifiedLocationPendingIntent$sdk_release(this.context));
        }
        if (isLastTokenValid()) {
            scheduleNextIntervalWithLastToken();
        } else {
            callTrackVerified("start");
        }
    }

    public final void stopTrackingVerified() {
        this.started = false;
        try {
            if (this.startedInterval < 20) {
                Radar.INSTANCE.getLocationManager$sdk_release().getLocationClient().removeLocationUpdates(RadarLocationReceiver.INSTANCE.getVerifiedLocationPendingIntent$sdk_release(this.context));
            }
            ConnectivityManager.NetworkCallback networkCallback = this.networkCallback;
            if (networkCallback != null) {
                this.connectivityManager.unregisterNetworkCallback(networkCallback);
            }
            Runnable runnable = this.runnable;
            if (runnable != null) {
                this.handler.removeCallbacks(runnable);
            }
        } catch (Exception e) {
            Radar.INSTANCE.getLogger$sdk_release().e("Error unregistering callbacks", Radar.RadarLogType.SDK_EXCEPTION, e);
        }
    }

    public static /* synthetic */ void getVerifiedLocationToken$default(RadarVerificationManager radarVerificationManager, boolean z, RadarTrackingOptions.RadarTrackingOptionsDesiredAccuracy radarTrackingOptionsDesiredAccuracy, Radar.RadarTrackVerifiedCallback radarTrackVerifiedCallback, int i, Object obj) {
        if ((i & 4) != 0) {
            radarTrackVerifiedCallback = null;
        }
        radarVerificationManager.getVerifiedLocationToken(z, radarTrackingOptionsDesiredAccuracy, radarTrackVerifiedCallback);
    }

    public final void getVerifiedLocationToken(boolean beacons, RadarTrackingOptions.RadarTrackingOptionsDesiredAccuracy desiredAccuracy, Radar.RadarTrackVerifiedCallback callback) {
        Intrinsics.checkNotNullParameter(desiredAccuracy, "desiredAccuracy");
        if (isLastTokenValid()) {
            Radar.flushLogs$sdk_release();
            if (callback != null) {
                callback.onComplete(Radar.RadarStatus.SUCCESS, this.lastToken);
                return;
            }
            return;
        }
        trackVerified(beacons, desiredAccuracy, "last_token_invalid", null, callback);
    }

    public final void clearVerifiedLocationToken() {
        this.lastToken = null;
    }

    public final boolean isLastTokenValid() {
        RadarVerifiedLocationToken radarVerifiedLocationToken = this.lastToken;
        boolean z = false;
        if (radarVerifiedLocationToken == null) {
            return false;
        }
        long elapsedRealtime = (SystemClock.elapsedRealtime() - this.lastTokenElapsedRealtime) / 1000;
        RadarRegion state = radarVerifiedLocationToken.getUser().getState();
        double distanceToBorder = state != null ? state.getDistanceToBorder() : -1.0d;
        if (elapsedRealtime < radarVerifiedLocationToken.getExpiresIn() && radarVerifiedLocationToken.getPassed() && distanceToBorder > 1609.0d) {
            z = true;
        }
        if (z) {
            RadarLogger.d$default(Radar.INSTANCE.getLogger$sdk_release(), "Last token valid | lastToken.expiresIn = " + radarVerifiedLocationToken.getExpiresIn() + "; lastTokenElapsed = " + elapsedRealtime + "; lastToken.passed = " + radarVerifiedLocationToken.getPassed() + "; lastDistanceToStateBorder = " + distanceToBorder, null, null, 6, null);
            return z;
        }
        RadarLogger.d$default(Radar.INSTANCE.getLogger$sdk_release(), "Last token invalid | lastToken.expiresIn = " + radarVerifiedLocationToken.getExpiresIn() + "; lastTokenElapsed = " + elapsedRealtime + "; lastToken.passed = " + radarVerifiedLocationToken.getPassed() + "; lastDistanceToStateBorder = " + distanceToBorder, null, null, 6, null);
        return z;
    }

    public final void setExpectedJurisdiction(String countryCode, String stateCode) {
        this.expectedCountryCode = countryCode;
        this.expectedStateCode = stateCode;
    }

    public final String getRequestHash(Location location) {
        Intrinsics.checkNotNullParameter(location, "location");
        RadarUtils radarUtils = RadarUtils.INSTANCE;
        String str = RadarSettings.INSTANCE.getInstallId$sdk_release(this.context) + location.getLatitude() + location.getLongitude() + location.isFromMockProvider() + false;
        Intrinsics.checkNotNullExpressionValue(str, "toString(...)");
        return radarUtils.hashSHA256(str);
    }

    private final void warmUpProviderAndFetchTokenFromGoogle(long googlePlayProjectNumber, final String requestHash, final Function2<? super String, ? super String, Unit> block) {
        if (!isIntegrityApiIncluded()) {
            RadarLogger.w$default(this.logger, "Integrity API not included", null, null, 6, null);
            block.invoke(null, "Integrity API not included");
            return;
        }
        StandardIntegrityManager createStandard = IntegrityManagerFactory.createStandard(this.context);
        Intrinsics.checkNotNullExpressionValue(createStandard, "createStandard(...)");
        Task prepareIntegrityToken = createStandard.prepareIntegrityToken(StandardIntegrityManager.PrepareIntegrityTokenRequest.builder().setCloudProjectNumber(googlePlayProjectNumber).build());
        final Function1<StandardIntegrityManager.StandardIntegrityTokenProvider, Unit> function1 = new Function1<StandardIntegrityManager.StandardIntegrityTokenProvider, Unit>() { // from class: io.radar.sdk.RadarVerificationManager$warmUpProviderAndFetchTokenFromGoogle$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(StandardIntegrityManager.StandardIntegrityTokenProvider standardIntegrityTokenProvider) {
                invoke2(standardIntegrityTokenProvider);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(StandardIntegrityManager.StandardIntegrityTokenProvider standardIntegrityTokenProvider) {
                RadarVerificationManager radarVerificationManager = RadarVerificationManager.this;
                Intrinsics.checkNotNull(standardIntegrityTokenProvider);
                radarVerificationManager.standardIntegrityTokenProvider = standardIntegrityTokenProvider;
                RadarLogger.d$default(Radar.INSTANCE.getLogger$sdk_release(), "Successfully warmed up integrity token provider", null, null, 6, null);
                RadarVerificationManager.this.lastWarmUpTimestampSeconds = System.currentTimeMillis() / 1000;
                RadarVerificationManager.this.fetchTokenFromGoogle(requestHash, block);
            }
        };
        prepareIntegrityToken.addOnSuccessListener(new OnSuccessListener() { // from class: io.radar.sdk.RadarVerificationManager$$ExternalSyntheticLambda0
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                RadarVerificationManager.warmUpProviderAndFetchTokenFromGoogle$lambda$6(Function1.this, obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: io.radar.sdk.RadarVerificationManager$$ExternalSyntheticLambda1
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                RadarVerificationManager.warmUpProviderAndFetchTokenFromGoogle$lambda$7(Function2.this, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void warmUpProviderAndFetchTokenFromGoogle$lambda$6(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void warmUpProviderAndFetchTokenFromGoogle$lambda$7(Function2 block, Exception exception) {
        Intrinsics.checkNotNullParameter(block, "$block");
        Intrinsics.checkNotNullParameter(exception, "exception");
        String message = exception.getMessage();
        Radar.INSTANCE.getLogger$sdk_release().e("Error warming up integrity token provider | warmupException = " + message, Radar.RadarLogType.SDK_ERROR, exception);
        block.invoke(null, message);
    }

    public final void getIntegrityToken(Long googlePlayProjectNumber, String requestHash, Function2<? super String, ? super String, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (!isIntegrityApiIncluded()) {
            RadarLogger.w$default(this.logger, "Integrity API not included", null, null, 6, null);
            block.invoke(null, "Integrity API not included");
            return;
        }
        if (requestHash == null) {
            RadarLogger.d$default(this.logger, "Missing request hash", null, null, 6, null);
            block.invoke(null, "Missing request hash");
            return;
        }
        if (googlePlayProjectNumber == null) {
            RadarLogger.d$default(this.logger, "Error warming up integrity token provider: Google Play project number is null", null, null, 6, null);
            block.invoke(null, "Google Play project number is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        if (this.standardIntegrityTokenProvider != null) {
            long j = this.lastWarmUpTimestampSeconds;
            if (j != 0 && currentTimeMillis - j <= 43200) {
                fetchTokenFromGoogle(requestHash, block);
                return;
            }
        }
        warmUpProviderAndFetchTokenFromGoogle(googlePlayProjectNumber.longValue(), requestHash, block);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fetchTokenFromGoogle(String requestHash, final Function2<? super String, ? super String, Unit> block) {
        StandardIntegrityManager.StandardIntegrityTokenProvider standardIntegrityTokenProvider = null;
        if (!isIntegrityApiIncluded()) {
            RadarLogger.w$default(this.logger, "Integrity API not included", null, null, 6, null);
            block.invoke(null, "Integrity API not included");
            return;
        }
        RadarLogger.d$default(this.logger, "Requesting integrity token", null, null, 6, null);
        StandardIntegrityManager.StandardIntegrityTokenProvider standardIntegrityTokenProvider2 = this.standardIntegrityTokenProvider;
        if (standardIntegrityTokenProvider2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("standardIntegrityTokenProvider");
        } else {
            standardIntegrityTokenProvider = standardIntegrityTokenProvider2;
        }
        Task request = standardIntegrityTokenProvider.request(StandardIntegrityManager.StandardIntegrityTokenRequest.builder().setRequestHash(requestHash).build());
        Intrinsics.checkNotNullExpressionValue(request, "request(...)");
        final Function1<StandardIntegrityManager.StandardIntegrityToken, Unit> function1 = new Function1<StandardIntegrityManager.StandardIntegrityToken, Unit>() { // from class: io.radar.sdk.RadarVerificationManager$fetchTokenFromGoogle$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(StandardIntegrityManager.StandardIntegrityToken standardIntegrityToken) {
                invoke2(standardIntegrityToken);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(StandardIntegrityManager.StandardIntegrityToken standardIntegrityToken) {
                RadarLogger radarLogger;
                String str = standardIntegrityToken.token();
                radarLogger = RadarVerificationManager.this.logger;
                RadarLogger.d$default(radarLogger, "Successfully requested integrity token | integrityToken = " + str, null, null, 6, null);
                block.invoke(str, null);
            }
        };
        request.addOnSuccessListener(new OnSuccessListener() { // from class: io.radar.sdk.RadarVerificationManager$$ExternalSyntheticLambda3
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                RadarVerificationManager.fetchTokenFromGoogle$lambda$8(Function1.this, obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: io.radar.sdk.RadarVerificationManager$$ExternalSyntheticLambda4
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                RadarVerificationManager.fetchTokenFromGoogle$lambda$9(RadarVerificationManager.this, block, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void fetchTokenFromGoogle$lambda$8(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void fetchTokenFromGoogle$lambda$9(RadarVerificationManager this$0, Function2 block, Exception exception) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(block, "$block");
        Intrinsics.checkNotNullParameter(exception, "exception");
        String message = exception.getMessage();
        RadarLogger.d$default(this$0.logger, "Error requesting integrity token | integrityException = " + message, null, null, 6, null);
        block.invoke(null, message);
    }

    public final String getIPs() {
        ArrayList arrayList = new ArrayList();
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            Intrinsics.checkNotNullExpressionValue(networkInterfaces, "getNetworkInterfaces(...)");
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface nextElement = networkInterfaces.nextElement();
                Intrinsics.checkNotNullExpressionValue(nextElement, "nextElement(...)");
                Enumeration<InetAddress> inetAddresses = nextElement.getInetAddresses();
                Intrinsics.checkNotNullExpressionValue(inetAddresses, "getInetAddresses(...)");
                while (inetAddresses.hasMoreElements()) {
                    InetAddress nextElement2 = inetAddresses.nextElement();
                    Intrinsics.checkNotNullExpressionValue(nextElement2, "nextElement(...)");
                    String hostAddress = nextElement2.getHostAddress();
                    if (hostAddress != null) {
                        arrayList.add(hostAddress);
                    }
                }
            }
            return arrayList.size() > 0 ? CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, null, 62, null) : "error";
        } catch (Exception e) {
            RadarLogger.d$default(this.logger, "Error getting IPs | e = " + e.getLocalizedMessage(), null, null, 6, null);
            return "error";
        }
    }
}
