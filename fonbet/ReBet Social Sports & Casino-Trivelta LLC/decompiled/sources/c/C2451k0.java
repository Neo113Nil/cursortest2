package c;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: c.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2451k0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f26601a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f26602b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f26603c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f26604d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f26605e;

    /* renamed from: f, reason: collision with root package name */
    public final double f26606f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f26607g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f26608h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f26609i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f26610j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f26611k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f26612l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f26613m;

    /* renamed from: n, reason: collision with root package name */
    public final List f26614n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f26615o;

    /* renamed from: p, reason: collision with root package name */
    public final String f26616p;

    public C2451k0(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, double d10, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, List list, boolean z22, String str) {
        this.f26601a = z10;
        this.f26602b = z11;
        this.f26603c = z12;
        this.f26604d = z13;
        this.f26605e = z14;
        this.f26606f = d10;
        this.f26607g = z15;
        this.f26608h = z16;
        this.f26609i = z17;
        this.f26610j = z18;
        this.f26611k = z19;
        this.f26612l = z20;
        this.f26613m = z21;
        this.f26614n = list;
        this.f26615o = z22;
        this.f26616p = str;
    }

    public final boolean a() {
        return this.f26611k;
    }

    public final double b() {
        return this.f26606f;
    }

    public final boolean c() {
        return this.f26607g;
    }

    public final boolean d() {
        return this.f26610j;
    }

    public final boolean e() {
        return this.f26613m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2451k0)) {
            return false;
        }
        C2451k0 c2451k0 = (C2451k0) obj;
        return this.f26601a == c2451k0.f26601a && this.f26602b == c2451k0.f26602b && this.f26603c == c2451k0.f26603c && this.f26604d == c2451k0.f26604d && this.f26605e == c2451k0.f26605e && Double.compare(this.f26606f, c2451k0.f26606f) == 0 && this.f26607g == c2451k0.f26607g && this.f26608h == c2451k0.f26608h && this.f26609i == c2451k0.f26609i && this.f26610j == c2451k0.f26610j && this.f26611k == c2451k0.f26611k && this.f26612l == c2451k0.f26612l && this.f26613m == c2451k0.f26613m && Intrinsics.areEqual(this.f26614n, c2451k0.f26614n) && this.f26615o == c2451k0.f26615o && Intrinsics.areEqual(this.f26616p, c2451k0.f26616p);
    }

    public final boolean f() {
        return this.f26615o;
    }

    public final boolean g() {
        return this.f26609i;
    }

    public final List h() {
        return this.f26614n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v6, types: [boolean] */
    public final int hashCode() {
        boolean z10 = this.f26601a;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        int i10 = r02 * 31;
        ?? r22 = this.f26602b;
        int i11 = r22;
        if (r22 != 0) {
            i11 = 1;
        }
        int i12 = (i10 + i11) * 31;
        ?? r23 = this.f26603c;
        int i13 = r23;
        if (r23 != 0) {
            i13 = 1;
        }
        int i14 = (i12 + i13) * 31;
        ?? r24 = this.f26604d;
        int i15 = r24;
        if (r24 != 0) {
            i15 = 1;
        }
        int i16 = (i14 + i15) * 31;
        ?? r25 = this.f26605e;
        int i17 = r25;
        if (r25 != 0) {
            i17 = 1;
        }
        int hashCode = (Double.hashCode(this.f26606f) + ((i16 + i17) * 31)) * 31;
        ?? r03 = this.f26607g;
        int i18 = r03;
        if (r03 != 0) {
            i18 = 1;
        }
        int i19 = (hashCode + i18) * 31;
        ?? r04 = this.f26608h;
        int i20 = r04;
        if (r04 != 0) {
            i20 = 1;
        }
        int i21 = (i19 + i20) * 31;
        ?? r05 = this.f26609i;
        int i22 = r05;
        if (r05 != 0) {
            i22 = 1;
        }
        int i23 = (i21 + i22) * 31;
        ?? r06 = this.f26610j;
        int i24 = r06;
        if (r06 != 0) {
            i24 = 1;
        }
        int i25 = (i23 + i24) * 31;
        ?? r07 = this.f26611k;
        int i26 = r07;
        if (r07 != 0) {
            i26 = 1;
        }
        int i27 = (i25 + i26) * 31;
        ?? r08 = this.f26612l;
        int i28 = r08;
        if (r08 != 0) {
            i28 = 1;
        }
        int i29 = (i27 + i28) * 31;
        ?? r09 = this.f26613m;
        int i30 = r09;
        if (r09 != 0) {
            i30 = 1;
        }
        int i31 = (i29 + i30) * 31;
        List list = this.f26614n;
        int hashCode2 = (i31 + (list == null ? 0 : list.hashCode())) * 31;
        boolean z11 = this.f26615o;
        int i32 = (hashCode2 + (z11 ? 1 : z11 ? 1 : 0)) * 31;
        String str = this.f26616p;
        return i32 + (str != null ? str.hashCode() : 0);
    }

    public final String i() {
        return this.f26616p;
    }

    public final boolean j() {
        return this.f26608h;
    }

    public final boolean k() {
        return this.f26602b;
    }

    public final boolean l() {
        return this.f26612l;
    }

    public final boolean m() {
        return this.f26601a;
    }

    public final boolean n() {
        return this.f26605e;
    }

    public final boolean o() {
        return this.f26604d;
    }

    public final boolean p() {
        return this.f26603c;
    }

    public final String toString() {
        return "SecurityInfo(isDeveloperOptionsEnabled=" + this.f26601a + ", isADBEnabled=" + this.f26602b + ", isVPNActive=" + this.f26603c + ", isUnknownSourcesEnabled=" + this.f26604d + ", isEmulator=" + this.f26605e + ", emulatorConfidence=" + this.f26606f + ", fridaDetected=" + this.f26607g + ", xposedDetected=" + this.f26608h + ", substrateDetected=" + this.f26609i + ", magiskDetected=" + this.f26610j + ", debuggerAttached=" + this.f26611k + ", isAppCloned=" + this.f26612l + ", rootedAdvanced=" + this.f26613m + ", suspiciousApps=" + this.f26614n + ", signatureValid=" + this.f26615o + ", threatLevel=" + this.f26616p + ')';
    }
}
