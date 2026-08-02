package io.radar.sdk;

import android.app.usage.UsageStatsManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.PowerManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: io.radar.sdk.e0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4619e0 {

    /* renamed from: d, reason: collision with root package name */
    public static final a f50077d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    public static final int f50078e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Context f50079a;

    /* renamed from: b, reason: collision with root package name */
    public final PowerManager f50080b;

    /* renamed from: c, reason: collision with root package name */
    public final UsageStatsManager f50081c;

    /* renamed from: io.radar.sdk.e0$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return C4619e0.f50078e;
        }

        public a() {
        }
    }

    public C4619e0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f50079a = context;
        this.f50080b = (PowerManager) context.getSystemService("power");
        this.f50081c = Build.VERSION.SDK_INT >= 28 ? (UsageStatsManager) context.getSystemService("usagestats") : null;
    }

    public final Integer b() {
        int appStandbyBucket;
        UsageStatsManager usageStatsManager = this.f50081c;
        if (usageStatsManager == null) {
            return null;
        }
        appStandbyBucket = usageStatsManager.getAppStandbyBucket();
        return Integer.valueOf(appStandbyBucket);
    }

    public final Hh.a c() {
        Intent registerReceiver = this.f50079a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        int intExtra = registerReceiver != null ? registerReceiver.getIntExtra("status", -1) : -1;
        boolean z10 = intExtra == 2 || intExtra == 5;
        Float valueOf = registerReceiver != null ? Float.valueOf((registerReceiver.getIntExtra("level", -1) * 100) / registerReceiver.getIntExtra("scale", -1)) : null;
        return new Hh.a(z10, valueOf != null ? valueOf.floatValue() : 0.0f, g(), f(), d(), e());
    }

    public final int d() {
        PowerManager powerManager;
        int locationPowerSaveMode;
        if (Build.VERSION.SDK_INT < 28 || (powerManager = this.f50080b) == null) {
            return f50078e;
        }
        locationPowerSaveMode = powerManager.getLocationPowerSaveMode();
        return locationPowerSaveMode;
    }

    public final boolean e() {
        PowerManager powerManager = this.f50080b;
        if (powerManager != null) {
            return powerManager.isDeviceIdleMode();
        }
        return false;
    }

    public final boolean f() {
        PowerManager powerManager = this.f50080b;
        if (powerManager != null) {
            return powerManager.isIgnoringBatteryOptimizations(this.f50079a.getPackageName());
        }
        return false;
    }

    public final Boolean g() {
        PowerManager powerManager = this.f50080b;
        if (powerManager != null) {
            return Boolean.valueOf(powerManager.isPowerSaveMode());
        }
        return null;
    }
}
