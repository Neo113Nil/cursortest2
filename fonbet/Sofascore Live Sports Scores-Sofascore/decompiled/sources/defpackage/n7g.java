package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class n7g implements uah {
    public final vt3 a;
    public final vt3 b;
    public final vt3 c;
    public final vt3 d;

    public n7g(vt3 vt3Var, vt3 vt3Var2, vt3 vt3Var3, vt3 vt3Var4) {
        this.a = vt3Var;
        this.b = vt3Var2;
        this.c = vt3Var3;
        this.d = vt3Var4;
    }

    public static n7g b(n7g n7gVar, vt3 vt3Var, vt3 vt3Var2, vt3 vt3Var3, vt3 vt3Var4, int i) {
        if ((i & 1) != 0) {
            vt3Var = n7gVar.a;
        }
        if ((i & 2) != 0) {
            vt3Var2 = n7gVar.b;
        }
        if ((i & 4) != 0) {
            vt3Var3 = n7gVar.c;
        }
        if ((i & 8) != 0) {
            vt3Var4 = n7gVar.d;
        }
        n7gVar.getClass();
        return new n7g(vt3Var, vt3Var2, vt3Var3, vt3Var4);
    }

    @Override // defpackage.uah
    public final pea a(long j, ema emaVar, kx4 kx4Var) {
        float a = this.a.a(j, kx4Var);
        float a2 = this.b.a(j, kx4Var);
        float a3 = this.c.a(j, kx4Var);
        float a4 = this.d.a(j, kx4Var);
        float e = njh.e(j);
        float f = a + a4;
        if (f > e) {
            float f2 = e / f;
            a *= f2;
            a4 *= f2;
        }
        float f3 = a2 + a3;
        if (f3 > e) {
            float f4 = e / f3;
            a2 *= f4;
            a3 *= f4;
        }
        if (a < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || a2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || a3 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || a4 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            u3a.a("Corner size in Px can't be negative(topStart = " + a + ", topEnd = " + a2 + ", bottomEnd = " + a3 + ", bottomStart = " + a4 + ")!");
        }
        if (a + a2 + a3 + a4 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return new dxd(jca.r(0L, j));
        }
        oqf r = jca.r(0L, j);
        ema emaVar2 = ema.a;
        float f5 = emaVar == emaVar2 ? a : a2;
        long floatToRawIntBits = (Float.floatToRawIntBits(f5) << 32) | (Float.floatToRawIntBits(f5) & 4294967295L);
        if (emaVar == emaVar2) {
            a = a2;
        }
        long floatToRawIntBits2 = (Float.floatToRawIntBits(a) << 32) | (Float.floatToRawIntBits(a) & 4294967295L);
        float f6 = emaVar == emaVar2 ? a3 : a4;
        long floatToRawIntBits3 = (Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(f6) & 4294967295L);
        if (emaVar != emaVar2) {
            a4 = a3;
        }
        return new exd(new e7g(r.a, r.b, r.c, r.d, floatToRawIntBits, floatToRawIntBits2, floatToRawIntBits3, (Float.floatToRawIntBits(a4) << 32) | (Float.floatToRawIntBits(a4) & 4294967295L)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n7g)) {
            return false;
        }
        n7g n7gVar = (n7g) obj;
        return Intrinsics.c(this.a, n7gVar.a) && Intrinsics.c(this.b, n7gVar.b) && Intrinsics.c(this.c, n7gVar.c) && Intrinsics.c(this.d, n7gVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.a + ", topEnd = " + this.b + ", bottomEnd = " + this.c + ", bottomStart = " + this.d + ')';
    }
}
