package Hh;

import io.radar.sdk.C4619e0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4952a;

    /* renamed from: b, reason: collision with root package name */
    public final float f4953b;

    /* renamed from: c, reason: collision with root package name */
    public final Boolean f4954c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f4955d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4956e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f4957f;

    /* renamed from: g, reason: collision with root package name */
    public final EnumC0105a f4958g;

    /* renamed from: Hh.a$a, reason: collision with other inner class name */
    public enum EnumC0105a {
        OK,
        OPTIMIZED,
        LOCATIONS_LOW_PERFORMANCE,
        IDLE,
        LOW,
        LOWEST
    }

    public a(boolean z10, float f10, Boolean bool, boolean z11, int i10, boolean z12) {
        this.f4952a = z10;
        this.f4953b = f10;
        this.f4954c = bool;
        this.f4955d = z11;
        this.f4956e = i10;
        this.f4957f = z12;
        if (bool == null) {
            this.f4958g = EnumC0105a.OK;
            return;
        }
        boolean z13 = bool.booleanValue() && !z11;
        boolean z14 = i10 != C4619e0.f50077d.a();
        if (z12) {
            this.f4958g = z13 ? z14 ? EnumC0105a.LOWEST : EnumC0105a.LOW : EnumC0105a.IDLE;
        } else if (z13) {
            this.f4958g = z14 ? EnumC0105a.LOCATIONS_LOW_PERFORMANCE : EnumC0105a.OPTIMIZED;
        } else {
            this.f4958g = EnumC0105a.OK;
        }
    }

    public final float a() {
        return this.f4953b;
    }

    public final EnumC0105a b() {
        return this.f4958g;
    }

    public final String c() {
        int i10 = this.f4956e;
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? String.valueOf(i10) : "LOCATION_MODE_THROTTLE_REQUESTS_WHEN_SCREEN_OFF" : "LOCATION_MODE_FOREGROUND_ONLY" : "LOCATION_MODE_ALL_DISABLED_WHEN_SCREEN_OFF" : "LOCATION_MODE_GPS_DISABLED_WHEN_SCREEN_OFF" : "LOCATION_MODE_NO_CHANGE";
    }

    public final Boolean d() {
        return this.f4954c;
    }

    public final boolean e() {
        return this.f4952a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f4952a == aVar.f4952a && Intrinsics.areEqual((Object) Float.valueOf(this.f4953b), (Object) Float.valueOf(aVar.f4953b)) && Intrinsics.areEqual(this.f4954c, aVar.f4954c) && this.f4955d == aVar.f4955d && this.f4956e == aVar.f4956e && this.f4957f == aVar.f4957f;
    }

    public final boolean f() {
        return this.f4957f;
    }

    public final boolean g() {
        return this.f4955d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r2v5, types: [boolean] */
    public int hashCode() {
        boolean z10 = this.f4952a;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        int hashCode = ((r02 * 31) + Float.hashCode(this.f4953b)) * 31;
        Boolean bool = this.f4954c;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        ?? r22 = this.f4955d;
        int i10 = r22;
        if (r22 != 0) {
            i10 = 1;
        }
        int hashCode3 = (((hashCode2 + i10) * 31) + Integer.hashCode(this.f4956e)) * 31;
        boolean z11 = this.f4957f;
        return hashCode3 + (z11 ? 1 : z11 ? 1 : 0);
    }

    public String toString() {
        return "BatteryState(isCharging=" + this.f4952a + ", percent=" + this.f4953b + ", powerSaveMode=" + this.f4954c + ", isIgnoringBatteryOptimizations=" + this.f4955d + ", locationPowerSaveMode=" + this.f4956e + ", isDeviceIdleMode=" + this.f4957f + ')';
    }
}
