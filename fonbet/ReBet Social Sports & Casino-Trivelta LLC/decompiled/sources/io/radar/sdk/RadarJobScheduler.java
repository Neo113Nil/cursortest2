package io.radar.sdk;

import Gh.C1165b;
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
import io.radar.sdk.C4589c;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\b¨\u0006\u000b"}, d2 = {"Lio/radar/sdk/RadarJobScheduler;", "Landroid/app/job/JobService;", "<init>", "()V", "Landroid/app/job/JobParameters;", "params", "", "onStartJob", "(Landroid/app/job/JobParameters;)Z", "onStopJob", "a", "sdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RadarJobScheduler extends JobService {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicInteger f49789b = new AtomicInteger();

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicInteger f49790c = new AtomicInteger();

    /* renamed from: io.radar.sdk.RadarJobScheduler$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(Context context, Location location, C4589c.EnumC4597i source) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(location, "location");
            Intrinsics.checkNotNullParameter(source, "source");
            C4589c c4589c = C4589c.f49918a;
            if (!c4589c.v()) {
                C4589c.N(context, null, 2, null);
            }
            ComponentName componentName = new ComponentName(context, (Class<?>) RadarJobScheduler.class);
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putDouble("latitude", location.getLatitude());
            persistableBundle.putDouble("longitude", location.getLongitude());
            persistableBundle.putDouble("accuracy", location.getAccuracy());
            persistableBundle.putString("provider", location.getProvider());
            persistableBundle.putLong("time", location.getTime());
            persistableBundle.putString("source", source.name());
            String T02 = C4589c.T0(source);
            Gh.y s10 = L0.f49705a.s(context);
            JobInfo build = new JobInfo.Builder((RadarJobScheduler.f49789b.incrementAndGet() % s10.d()) + 20160525, componentName).setExtras(persistableBundle).setMinimumLatency(0L).setOverrideDeadline(0L).setRequiredNetworkType(s10.e() ? 1 : 0).build();
            Object systemService = context.getSystemService("jobscheduler");
            if (systemService == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.app.job.JobScheduler");
            }
            if (((JobScheduler) systemService).schedule(build) == 1) {
                G0.b(c4589c.y(), "Scheduling location job | source = " + T02 + "; location = " + location, null, null, 6, null);
                return;
            }
            G0.b(c4589c.y(), "Failed to schedule location job | source = " + T02 + "; location = " + location, null, null, 6, null);
        }

        public final void b(Context context, C1165b[] beacons, C4589c.EnumC4597i source) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(beacons, "beacons");
            Intrinsics.checkNotNullParameter(source, "source");
            C4589c c4589c = C4589c.f49918a;
            if (!c4589c.v()) {
                C4589c.N(context, null, 2, null);
            }
            ComponentName componentName = new ComponentName(context, (Class<?>) RadarJobScheduler.class);
            String[] h10 = C4631k0.f50118a.h(beacons);
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putStringArray("beacons", h10);
            persistableBundle.putString("source", source.name());
            String T02 = C4589c.T0(source);
            Gh.y s10 = L0.f49705a.s(context);
            JobInfo build = new JobInfo.Builder((RadarJobScheduler.f49790c.incrementAndGet() % s10.d()) + 20210216, componentName).setExtras(persistableBundle).setMinimumLatency(0L).setOverrideDeadline(0L).setRequiredNetworkType(s10.e() ? 1 : 0).build();
            Object systemService = context.getSystemService("jobscheduler");
            if (systemService == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.app.job.JobScheduler");
            }
            if (((JobScheduler) systemService).schedule(build) == 1) {
                G0.b(c4589c.y(), "Scheduling beacons job | source = " + T02 + "; beaconsArr = " + ArraysKt.joinToString$default(h10, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null), null, null, 6, null);
                return;
            }
            G0.b(c4589c.y(), "Failed to schedule beacons job | source = " + T02 + "; beaconsArr = " + ArraysKt.joinToString$default(h10, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null), null, null, 6, null);
        }

        public Companion() {
        }
    }

    public static final void e(RadarJobScheduler this$0, JobParameters params) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(params, "$params");
        this$0.jobFinished(params, false);
    }

    public static final void f(RadarJobScheduler this$0, JobParameters params) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(params, "$params");
        this$0.jobFinished(params, false);
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(final JobParameters params) {
        Intrinsics.checkNotNullParameter(params, "params");
        C4589c c4589c = C4589c.f49918a;
        if (!c4589c.v()) {
            C4589c.N(getApplicationContext(), null, 2, null);
        }
        PersistableBundle extras = params.getExtras();
        Intrinsics.checkNotNullExpressionValue(extras, "params.extras");
        String[] stringArray = extras.getStringArray("beacons");
        double d10 = extras.getDouble("latitude");
        double d11 = extras.getDouble("longitude");
        float f10 = (float) extras.getDouble("accuracy");
        String string = extras.getString("provider");
        long j10 = extras.getLong("time");
        String string2 = extras.getString("source");
        if (string2 == null) {
            return false;
        }
        C4589c.EnumC4597i valueOf = C4589c.EnumC4597i.valueOf(string2);
        if (stringArray != null) {
            C1165b[] b10 = C4631k0.f50118a.b(stringArray);
            G0.b(c4589c.y(), "Starting beacons job | source = " + string2 + "; beaconsArr = " + ArraysKt.joinToString$default(stringArray, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null), null, null, 6, null);
            Context applicationContext = getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "this.applicationContext");
            c4589c.H(applicationContext, b10, valueOf);
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: io.radar.sdk.A0
                @Override // java.lang.Runnable
                public final void run() {
                    RadarJobScheduler.e(RadarJobScheduler.this, params);
                }
            }, 10000L);
            f49790c.set(0);
            return true;
        }
        Location location = new Location(string);
        location.setLatitude(d10);
        location.setLongitude(d11);
        location.setAccuracy(f10);
        location.setTime(j10);
        if (C4589c.Q()) {
            Hh.a c10 = c4589c.m().c();
            G0.b(c4589c.y(), "Starting location job | source = " + string2 + "; location = " + location + "; standbyBucket = " + c4589c.m().b() + "; performanceState = " + c10.b().name() + "; isCharging = " + c10.e() + "; batteryPercentage = " + c10.a() + "; isPowerSaveMode = " + c10.d() + "; isIgnoringBatteryOptimizations = " + c10.g() + "; locationPowerSaveMode = " + c10.c() + "; isDozeMode = " + c10.f(), null, null, 6, null);
        } else {
            G0.b(c4589c.y(), "Starting location job | source = " + string2 + "; location = " + location, null, null, 6, null);
        }
        Context applicationContext2 = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext2, "this.applicationContext");
        c4589c.J(applicationContext2, location, valueOf);
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: io.radar.sdk.B0
            @Override // java.lang.Runnable
            public final void run() {
                RadarJobScheduler.f(RadarJobScheduler.this, params);
            }
        }, 10000L);
        f49789b.set(0);
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters params) {
        Intrinsics.checkNotNullParameter(params, "params");
        C4589c c4589c = C4589c.f49918a;
        if (!c4589c.v()) {
            C4589c.N(getApplicationContext(), null, 2, null);
        }
        PersistableBundle extras = params.getExtras();
        Intrinsics.checkNotNullExpressionValue(extras, "params.extras");
        String[] stringArray = extras.getStringArray("beacons");
        double d10 = extras.getDouble("latitude");
        double d11 = extras.getDouble("longitude");
        float f10 = (float) extras.getDouble("accuracy");
        String string = extras.getString("provider");
        long j10 = extras.getLong("time");
        String string2 = extras.getString("source");
        if (stringArray != null) {
            G0.b(c4589c.y(), "Stopping beacons job | source = " + string2 + "; beaconsArr = " + ArraysKt.joinToString$default(stringArray, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null), null, null, 6, null);
            return false;
        }
        Location location = new Location(string);
        location.setLatitude(d10);
        location.setLongitude(d11);
        location.setAccuracy(f10);
        location.setTime(j10);
        G0.b(c4589c.y(), "Stopping location job | source = " + string2 + "; location = " + location, null, null, 6, null);
        return false;
    }
}
