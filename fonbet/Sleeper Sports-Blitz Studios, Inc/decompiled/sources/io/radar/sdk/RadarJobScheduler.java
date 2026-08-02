package io.radar.sdk;

import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.content.ComponentName;
import android.content.Context;
import android.location.Location;
import android.os.Handler;
import android.os.Looper;
import android.os.PersistableBundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.radar.sdk.Radar;
import io.radar.sdk.model.RadarBeacon;
import io.radar.sdk.model.RadarSdkConfiguration;
import io.radar.sdk.util.BatteryState;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RadarJobScheduler.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\t"}, d2 = {"Lio/radar/sdk/RadarJobScheduler;", "Landroid/app/job/JobService;", "()V", "onStartJob", "", "params", "Landroid/app/job/JobParameters;", "onStopJob", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class RadarJobScheduler extends JobService {
    private static final int BASE_JOB_ID_BEACONS = 20210216;
    private static final int BASE_JOB_ID_LOCATIONS = 20160525;
    private static final String EXTRA_ACCURACY = "accuracy";
    private static final String EXTRA_BEACONS = "beacons";
    private static final String EXTRA_LATITUDE = "latitude";
    private static final String EXTRA_LONGITUDE = "longitude";
    private static final String EXTRA_PROVIDER = "provider";
    private static final String EXTRA_SOURCE = "source";
    private static final String EXTRA_TIME = "time";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final AtomicInteger numActiveLocationJobs = new AtomicInteger();
    private static final AtomicInteger numActiveBeaconJobs = new AtomicInteger();

    /* compiled from: RadarJobScheduler.kt */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J%\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0000¢\u0006\u0002\b\u0019J-\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u0017\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u0019\u0010\u001dR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lio/radar/sdk/RadarJobScheduler$Companion;", "", "()V", "BASE_JOB_ID_BEACONS", "", "BASE_JOB_ID_LOCATIONS", "EXTRA_ACCURACY", "", "EXTRA_BEACONS", "EXTRA_LATITUDE", "EXTRA_LONGITUDE", "EXTRA_PROVIDER", "EXTRA_SOURCE", "EXTRA_TIME", "numActiveBeaconJobs", "Ljava/util/concurrent/atomic/AtomicInteger;", "numActiveLocationJobs", "scheduleJob", "", "context", "Landroid/content/Context;", FirebaseAnalytics.Param.LOCATION, "Landroid/location/Location;", "source", "Lio/radar/sdk/Radar$RadarLocationSource;", "scheduleJob$sdk_release", "beacons", "", "Lio/radar/sdk/model/RadarBeacon;", "(Landroid/content/Context;[Lio/radar/sdk/model/RadarBeacon;Lio/radar/sdk/Radar$RadarLocationSource;)V", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void scheduleJob$sdk_release(Context context, Location location, Radar.RadarLocationSource source) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(location, "location");
            Intrinsics.checkNotNullParameter(source, "source");
            if (!Radar.INSTANCE.getInitialized$sdk_release()) {
                Radar.initialize$default(context, null, 2, null);
            }
            ComponentName componentName = new ComponentName(context, (Class<?>) RadarJobScheduler.class);
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putDouble("latitude", location.getLatitude());
            persistableBundle.putDouble("longitude", location.getLongitude());
            persistableBundle.putDouble(RadarJobScheduler.EXTRA_ACCURACY, location.getAccuracy());
            persistableBundle.putString(RadarJobScheduler.EXTRA_PROVIDER, location.getProvider());
            persistableBundle.putLong("time", location.getTime());
            persistableBundle.putString("source", source.name());
            String stringForSource = Radar.stringForSource(source);
            RadarSdkConfiguration sdkConfiguration = RadarSettings.INSTANCE.getSdkConfiguration(context);
            JobInfo build = new JobInfo.Builder((RadarJobScheduler.numActiveLocationJobs.incrementAndGet() % sdkConfiguration.getMaxConcurrentJobs()) + 20160525, componentName).setExtras(persistableBundle).setMinimumLatency(0L).setOverrideDeadline(0L).setRequiredNetworkType(sdkConfiguration.getSchedulerRequiresNetwork() ? 1 : 0).build();
            Object systemService = context.getSystemService("jobscheduler");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.job.JobScheduler");
            if (((JobScheduler) systemService).schedule(build) == 1) {
                RadarLogger.d$default(Radar.INSTANCE.getLogger$sdk_release(), "Scheduling location job | source = " + stringForSource + "; location = " + location, null, null, 6, null);
                return;
            }
            RadarLogger.d$default(Radar.INSTANCE.getLogger$sdk_release(), "Failed to schedule location job | source = " + stringForSource + "; location = " + location, null, null, 6, null);
        }

        public final void scheduleJob$sdk_release(Context context, RadarBeacon[] beacons, Radar.RadarLocationSource source) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(beacons, "beacons");
            Intrinsics.checkNotNullParameter(source, "source");
            if (!Radar.INSTANCE.getInitialized$sdk_release()) {
                Radar.initialize$default(context, null, 2, null);
            }
            ComponentName componentName = new ComponentName(context, (Class<?>) RadarJobScheduler.class);
            String[] stringArrayForBeacons = RadarBeaconUtils.INSTANCE.stringArrayForBeacons(beacons);
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putStringArray("beacons", stringArrayForBeacons);
            persistableBundle.putString("source", source.name());
            String stringForSource = Radar.stringForSource(source);
            RadarSdkConfiguration sdkConfiguration = RadarSettings.INSTANCE.getSdkConfiguration(context);
            JobInfo build = new JobInfo.Builder((RadarJobScheduler.numActiveBeaconJobs.incrementAndGet() % sdkConfiguration.getMaxConcurrentJobs()) + RadarJobScheduler.BASE_JOB_ID_BEACONS, componentName).setExtras(persistableBundle).setMinimumLatency(0L).setOverrideDeadline(0L).setRequiredNetworkType(sdkConfiguration.getSchedulerRequiresNetwork() ? 1 : 0).build();
            Object systemService = context.getSystemService("jobscheduler");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.job.JobScheduler");
            if (((JobScheduler) systemService).schedule(build) == 1) {
                RadarLogger.d$default(Radar.INSTANCE.getLogger$sdk_release(), "Scheduling beacons job | source = " + stringForSource + "; beaconsArr = " + ArraysKt.joinToString$default(stringArrayForBeacons, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null), null, null, 6, null);
                return;
            }
            RadarLogger.d$default(Radar.INSTANCE.getLogger$sdk_release(), "Failed to schedule beacons job | source = " + stringForSource + "; beaconsArr = " + ArraysKt.joinToString$default(stringArrayForBeacons, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null), null, null, 6, null);
        }
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(final JobParameters params) {
        Intrinsics.checkNotNullParameter(params, "params");
        if (!Radar.INSTANCE.getInitialized$sdk_release()) {
            Radar.initialize$default(getApplicationContext(), null, 2, null);
        }
        PersistableBundle extras = params.getExtras();
        Intrinsics.checkNotNullExpressionValue(extras, "getExtras(...)");
        String[] stringArray = extras.getStringArray("beacons");
        double d = extras.getDouble("latitude");
        double d2 = extras.getDouble("longitude");
        float f = (float) extras.getDouble(EXTRA_ACCURACY);
        String string = extras.getString(EXTRA_PROVIDER);
        long j = extras.getLong("time");
        String string2 = extras.getString("source");
        if (string2 == null) {
            return false;
        }
        Radar.RadarLocationSource valueOf = Radar.RadarLocationSource.valueOf(string2);
        if (stringArray != null) {
            RadarBeacon[] beaconsForStringArray = RadarBeaconUtils.INSTANCE.beaconsForStringArray(stringArray);
            RadarLogger.d$default(Radar.INSTANCE.getLogger$sdk_release(), "Starting beacons job | source = " + string2 + "; beaconsArr = " + ArraysKt.joinToString$default(stringArray, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null), null, null, 6, null);
            Radar radar = Radar.INSTANCE;
            Context applicationContext = getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            radar.handleBeacons$sdk_release(applicationContext, beaconsForStringArray, valueOf);
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: io.radar.sdk.RadarJobScheduler$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    RadarJobScheduler.onStartJob$lambda$0(RadarJobScheduler.this, params);
                }
            }, 10000L);
            numActiveBeaconJobs.set(0);
            return true;
        }
        Location location = new Location(string);
        location.setLatitude(d);
        location.setLongitude(d2);
        location.setAccuracy(f);
        location.setTime(j);
        if (Radar.isTestKey$sdk_release()) {
            BatteryState batteryState = Radar.INSTANCE.getBatteryManager$sdk_release().getBatteryState();
            RadarLogger.d$default(Radar.INSTANCE.getLogger$sdk_release(), "Starting location job | source = " + string2 + "; location = " + location + "; standbyBucket = " + Radar.INSTANCE.getBatteryManager$sdk_release().getAppStandbyBucket() + "; performanceState = " + batteryState.getPerformanceState().name() + "; isCharging = " + batteryState.isCharging() + "; batteryPercentage = " + batteryState.getPercent() + "; isPowerSaveMode = " + batteryState.getPowerSaveMode() + "; isIgnoringBatteryOptimizations = " + batteryState.isIgnoringBatteryOptimizations() + "; locationPowerSaveMode = " + batteryState.getPowerLocationPowerSaveModeString() + "; isDozeMode = " + batteryState.isDeviceIdleMode(), null, null, 6, null);
        } else {
            RadarLogger.d$default(Radar.INSTANCE.getLogger$sdk_release(), "Starting location job | source = " + string2 + "; location = " + location, null, null, 6, null);
        }
        Radar radar2 = Radar.INSTANCE;
        Context applicationContext2 = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext2, "getApplicationContext(...)");
        radar2.handleLocation$sdk_release(applicationContext2, location, valueOf);
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: io.radar.sdk.RadarJobScheduler$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                RadarJobScheduler.onStartJob$lambda$2(RadarJobScheduler.this, params);
            }
        }, 10000L);
        numActiveLocationJobs.set(0);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onStartJob$lambda$0(RadarJobScheduler this$0, JobParameters params) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(params, "$params");
        this$0.jobFinished(params, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onStartJob$lambda$2(RadarJobScheduler this$0, JobParameters params) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(params, "$params");
        this$0.jobFinished(params, false);
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters params) {
        Intrinsics.checkNotNullParameter(params, "params");
        if (!Radar.INSTANCE.getInitialized$sdk_release()) {
            Radar.initialize$default(getApplicationContext(), null, 2, null);
        }
        PersistableBundle extras = params.getExtras();
        Intrinsics.checkNotNullExpressionValue(extras, "getExtras(...)");
        String[] stringArray = extras.getStringArray("beacons");
        double d = extras.getDouble("latitude");
        double d2 = extras.getDouble("longitude");
        float f = (float) extras.getDouble(EXTRA_ACCURACY);
        String string = extras.getString(EXTRA_PROVIDER);
        long j = extras.getLong("time");
        String string2 = extras.getString("source");
        if (stringArray != null) {
            RadarLogger.d$default(Radar.INSTANCE.getLogger$sdk_release(), "Stopping beacons job | source = " + string2 + "; beaconsArr = " + ArraysKt.joinToString$default(stringArray, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null), null, null, 6, null);
            return false;
        }
        Location location = new Location(string);
        location.setLatitude(d);
        location.setLongitude(d2);
        location.setAccuracy(f);
        location.setTime(j);
        RadarLogger.d$default(Radar.INSTANCE.getLogger$sdk_release(), "Stopping location job | source = " + string2 + "; location = " + location, null, null, 6, null);
        return false;
    }
}
