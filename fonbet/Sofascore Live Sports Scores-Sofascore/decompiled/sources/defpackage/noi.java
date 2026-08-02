package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class noi implements kx4, rq3 {
    public final /* synthetic */ ooi a;
    public final lj2 b;
    public lj2 c;
    public gze d = gze.b;
    public final g e = g.a;
    public final /* synthetic */ ooi f;

    public noi(ooi ooiVar, lj2 lj2Var) {
        this.f = ooiVar;
        this.a = ooiVar;
        this.b = lj2Var;
    }

    @Override // defpackage.kx4
    public final float C(long j) {
        return this.a.C(j);
    }

    @Override // defpackage.kx4
    public final float C0(int i) {
        return this.a.C0(i);
    }

    @Override // defpackage.kx4
    public final float D0(float f) {
        return f / this.a.j();
    }

    @Override // defpackage.kx4
    public final float H0(float f) {
        return this.a.j() * f;
    }

    @Override // defpackage.kx4
    public final long N(int i) {
        return this.a.N(i);
    }

    @Override // defpackage.kx4
    public final long O(float f) {
        return this.a.O(f);
    }

    @Override // defpackage.kx4
    public final long R0(long j) {
        return this.a.R0(j);
    }

    public final Object b(gze gzeVar, rq3 rq3Var) {
        lj2 lj2Var = new lj2(1, z9a.b(rq3Var));
        lj2Var.t();
        this.d = gzeVar;
        this.c = lj2Var;
        Object q = lj2Var.q();
        lu3 lu3Var = lu3.a;
        return q;
    }

    public final long d() {
        ooi ooiVar = this.f;
        long R0 = ooiVar.R0(c6o.c0(ooiVar).A.e());
        long j = ooiVar.x;
        float max = Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Float.intBitsToFloat((int) (R0 >> 32)) - ((int) (j >> 32))) / 2.0f;
        float max2 = Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Float.intBitsToFloat((int) (R0 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
        return (Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(max2) & 4294967295L);
    }

    public final hsk e() {
        return c6o.c0(this.f).A;
    }

    @Override // defpackage.kx4
    public final int e0(float f) {
        return this.a.e0(f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, noi] */
    /* JADX WARN: Type inference failed for: r10v1, types: [yda] */
    /* JADX WARN: Type inference failed for: r10v4, types: [yda] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r13v0, types: [kotlin.jvm.functions.Function2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(long j, Function2 function2, h21 h21Var) {
        loi loiVar;
        int i;
        lj2 lj2Var;
        try {
            if (h21Var instanceof loi) {
                loiVar = (loi) h21Var;
                int i2 = loiVar.u;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    loiVar.u = i2 - Integer.MIN_VALUE;
                    Object obj = loiVar.s;
                    lu3 lu3Var = lu3.a;
                    i = loiVar.u;
                    if (i != 0) {
                        y6a.M(obj);
                        if (j <= 0 && (lj2Var = this.c) != null) {
                            p2g p2gVar = w2g.b;
                            lj2Var.resumeWith(new u2g(new hze(j)));
                        }
                        g9i L = xw3.L(this.f.Y0(), null, null, new z40(j, (Object) this, (rq3) null, 6), 3);
                        loiVar.r = L;
                        loiVar.u = 1;
                        obj = function2.invoke(this, loiVar);
                        this = L;
                        if (obj == lu3Var) {
                            return lu3Var;
                        }
                    } else {
                        if (i != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        g9i g9iVar = loiVar.r;
                        y6a.M(obj);
                        this = g9iVar;
                    }
                    this.e(gj2.b);
                    return obj;
                }
            }
            if (i != 0) {
            }
            this.e(gj2.b);
            return obj;
        } catch (Throwable th) {
            this.e(gj2.b);
            throw th;
        }
        loiVar = new loi(this, h21Var);
        Object obj2 = loiVar.s;
        lu3 lu3Var2 = lu3.a;
        i = loiVar.u;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(long j, Function2 function2, sq3 sq3Var) {
        moi moiVar;
        int i;
        try {
            if (sq3Var instanceof moi) {
                moiVar = (moi) sq3Var;
                int i2 = moiVar.t;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    moiVar.t = i2 - Integer.MIN_VALUE;
                    Object obj = moiVar.r;
                    Object obj2 = lu3.a;
                    i = moiVar.t;
                    if (i != 0) {
                        y6a.M(obj);
                        moiVar.t = 1;
                        Object f = f(j, function2, moiVar);
                        return f == obj2 ? obj2 : f;
                    }
                    if (i == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
            if (i != 0) {
            }
        } catch (hze unused) {
            return null;
        }
        moiVar = new moi(this, sq3Var);
        Object obj3 = moiVar.r;
        Object obj22 = lu3.a;
        i = moiVar.t;
    }

    @Override // defpackage.rq3
    public final CoroutineContext getContext() {
        return this.e;
    }

    @Override // defpackage.kx4
    public final float getFontScale() {
        return this.a.getFontScale();
    }

    @Override // defpackage.kx4
    public final float h0(long j) {
        return this.a.h0(j);
    }

    @Override // defpackage.kx4
    public final float j() {
        return this.a.j();
    }

    @Override // defpackage.rq3
    public final void resumeWith(Object obj) {
        ooi ooiVar = this.f;
        synchronized (ooiVar.u) {
            ooiVar.t.q(this);
            Unit unit = Unit.a;
        }
        this.b.resumeWith(obj);
    }

    @Override // defpackage.kx4
    public final long u(float f) {
        return this.a.u(f);
    }

    @Override // defpackage.kx4
    public final long v(long j) {
        return this.a.v(j);
    }
}
