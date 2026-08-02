package com.google.android.gms.measurement.internal;

import android.content.pm.PackageManager;
import android.util.Pair;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import t9.C6452a;

/* renamed from: com.google.android.gms.measurement.internal.b6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3221b6 extends D6 {

    /* renamed from: d, reason: collision with root package name */
    public final Map f33935d;

    /* renamed from: e, reason: collision with root package name */
    public final I2 f33936e;

    /* renamed from: f, reason: collision with root package name */
    public final I2 f33937f;

    /* renamed from: g, reason: collision with root package name */
    public final I2 f33938g;

    /* renamed from: h, reason: collision with root package name */
    public final I2 f33939h;

    /* renamed from: i, reason: collision with root package name */
    public final I2 f33940i;

    /* renamed from: j, reason: collision with root package name */
    public final I2 f33941j;

    public C3221b6(S6 s62) {
        super(s62);
        this.f33935d = new HashMap();
        L2 x10 = this.f33578a.x();
        Objects.requireNonNull(x10);
        this.f33936e = new I2(x10, "last_delete_stale", 0L);
        L2 x11 = this.f33578a.x();
        Objects.requireNonNull(x11);
        this.f33937f = new I2(x11, "last_delete_stale_batch", 0L);
        L2 x12 = this.f33578a.x();
        Objects.requireNonNull(x12);
        this.f33938g = new I2(x12, "backoff", 0L);
        L2 x13 = this.f33578a.x();
        Objects.requireNonNull(x13);
        this.f33939h = new I2(x13, "last_upload", 0L);
        L2 x14 = this.f33578a.x();
        Objects.requireNonNull(x14);
        this.f33940i = new I2(x14, "last_upload_attempt", 0L);
        L2 x15 = this.f33578a.x();
        Objects.requireNonNull(x15);
        this.f33941j = new I2(x15, "midnight_offset", 0L);
    }

    @Override // com.google.android.gms.measurement.internal.D6
    public final boolean l() {
        return false;
    }

    public final Pair m(String str, V3 v32) {
        return v32.o(U3.AD_STORAGE) ? n(str) : new Pair("", Boolean.FALSE);
    }

    public final Pair n(String str) {
        C3213a6 c3213a6;
        C6452a.C0912a c0912a;
        h();
        C3298l3 c3298l3 = this.f33578a;
        long b10 = c3298l3.e().b();
        C3213a6 c3213a62 = (C3213a6) this.f33935d.get(str);
        if (c3213a62 != null && b10 < c3213a62.f33925c) {
            return new Pair(c3213a62.f33923a, Boolean.valueOf(c3213a62.f33924b));
        }
        C6452a.b(true);
        long D10 = c3298l3.w().D(str, AbstractC3209a2.f33855b) + b10;
        try {
            try {
                c0912a = C6452a.a(c3298l3.d());
            } catch (PackageManager.NameNotFoundException unused) {
                c0912a = null;
                if (c3213a62 != null && b10 < c3213a62.f33925c + this.f33578a.w().D(str, AbstractC3209a2.f33858c)) {
                    return new Pair(c3213a62.f33923a, Boolean.valueOf(c3213a62.f33924b));
                }
            }
        } catch (Exception e10) {
            this.f33578a.a().v().b("Unable to get advertising id", e10);
            c3213a6 = new C3213a6("", false, D10);
        }
        if (c0912a == null) {
            return new Pair("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
        }
        String a10 = c0912a.a();
        c3213a6 = a10 != null ? new C3213a6(a10, c0912a.b(), D10) : new C3213a6("", c0912a.b(), D10);
        this.f33935d.put(str, c3213a6);
        C6452a.b(false);
        return new Pair(c3213a6.f33923a, Boolean.valueOf(c3213a6.f33924b));
    }

    public final String o(String str, boolean z10) {
        h();
        String str2 = z10 ? (String) n(str).first : "00000000-0000-0000-0000-000000000000";
        MessageDigest C10 = b7.C();
        if (C10 == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, C10.digest(str2.getBytes())));
    }
}
