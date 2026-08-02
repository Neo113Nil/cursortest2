package defpackage;

import androidx.compose.runtime.e;
import com.unity3d.services.UnityAdsConstants;
import kotlin.time.TimeMark;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class e24 extends d7e {
    public final d7e f;
    public final op3 g;
    public final long h;
    public final yhj i;
    public final boolean j;
    public final znh k;
    public TimeMark l;
    public boolean m;
    public float n;
    public ay1 o;
    public d7e p;
    public final long q;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        if (r10 != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public e24(d7e d7eVar, d7e d7eVar2, op3 op3Var, long j, boolean z, boolean z2) {
        xhj xhjVar = xhj.a;
        this.f = d7eVar2;
        this.g = op3Var;
        this.h = j;
        this.i = xhjVar;
        this.j = z;
        this.k = e.c(0);
        this.n = 1.0f;
        this.p = d7eVar;
        long i = d7eVar != null ? d7eVar.i() : 0L;
        long i2 = d7eVar2 != null ? d7eVar2.i() : 0L;
        boolean z3 = i != 9205357640488583168L;
        boolean z4 = i2 != 9205357640488583168L;
        if (z2) {
            if (z4) {
                i = i2;
            }
            this.q = i;
        }
        i = (z3 && z4) ? (Float.floatToRawIntBits(Math.max(Float.intBitsToFloat((int) (i >> 32)), Float.intBitsToFloat((int) (i2 >> 32)))) << 32) | (Float.floatToRawIntBits(Math.max(Float.intBitsToFloat((int) (i & 4294967295L)), Float.intBitsToFloat((int) (i2 & 4294967295L)))) & 4294967295L) : 9205357640488583168L;
        this.q = i;
    }

    @Override // defpackage.d7e
    public final boolean c(float f) {
        this.n = f;
        return true;
    }

    @Override // defpackage.d7e
    public final boolean e(ay1 ay1Var) {
        this.o = ay1Var;
        return true;
    }

    @Override // defpackage.d7e
    public final long i() {
        return this.q;
    }

    @Override // defpackage.d7e
    public final void j(ha5 ha5Var) {
        boolean z = this.m;
        d7e d7eVar = this.f;
        if (z) {
            k(ha5Var, d7eVar, this.n);
            return;
        }
        TimeMark timeMark = this.l;
        if (timeMark == null) {
            timeMark = this.i.a();
            this.l = timeMark;
        }
        float e = xd5.e(timeMark.a()) / xd5.e(this.h);
        float b = llf.b(e, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        float f = this.n;
        float f2 = b * f;
        if (this.j) {
            f -= f2;
        }
        this.m = e >= 1.0f;
        k(ha5Var, this.p, f);
        k(ha5Var, d7eVar, f2);
        if (this.m) {
            this.p = null;
        } else {
            znh znhVar = this.k;
            znhVar.i(znhVar.h() + 1);
        }
    }

    public final void k(ha5 ha5Var, d7e d7eVar, float f) {
        if (d7eVar == null || f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        long n = ha5Var.n();
        long i = d7eVar.i();
        long B = (i == 9205357640488583168L || njh.g(i) || n == 9205357640488583168L || njh.g(n)) ? n : b6a.B(i, this.g.e(i, n));
        if (n == 9205357640488583168L || njh.g(n)) {
            d7eVar.g(ha5Var, B, f, this.o);
            return;
        }
        float intBitsToFloat = (Float.intBitsToFloat((int) (n >> 32)) - Float.intBitsToFloat((int) (B >> 32))) / 2.0f;
        float intBitsToFloat2 = (Float.intBitsToFloat((int) (n & 4294967295L)) - Float.intBitsToFloat((int) (B & 4294967295L))) / 2.0f;
        ((hpo) ha5Var.L0().a).y(intBitsToFloat, intBitsToFloat2, intBitsToFloat, intBitsToFloat2);
        try {
            d7eVar.g(ha5Var, B, f, this.o);
        } finally {
            float f2 = -intBitsToFloat;
            float f3 = -intBitsToFloat2;
            ((hpo) ha5Var.L0().a).y(f2, f3, f2, f3);
        }
    }
}
