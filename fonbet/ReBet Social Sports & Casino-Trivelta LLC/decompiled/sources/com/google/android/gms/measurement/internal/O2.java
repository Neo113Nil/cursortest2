package com.google.android.gms.measurement.internal;

/* loaded from: classes2.dex */
public final class O2 {

    /* renamed from: a, reason: collision with root package name */
    public final C3298l3 f33577a;

    public O2(S6 s62) {
        this.f33577a = s62.g0();
    }

    public final boolean a() {
        try {
            C3298l3 c3298l3 = this.f33577a;
            M9.d a10 = M9.e.a(c3298l3.d());
            if (a10 != null) {
                return a10.e("com.android.vending", 128).versionCode >= 80837300;
            }
            c3298l3.a().w().a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e10) {
            this.f33577a.a().w().b("Failed to retrieve Play Store version for Install Referrer", e10);
            return false;
        }
    }
}
