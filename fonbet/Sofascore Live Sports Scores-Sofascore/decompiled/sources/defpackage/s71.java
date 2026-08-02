package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class s71 implements Function1 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ float c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ s71(long j, float f, q50 q50Var, long j2, e1d e1dVar) {
        this.b = j;
        this.c = f;
        this.e = q50Var;
        this.d = j2;
        this.f = e1dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long j;
        long j2;
        sx2 sx2Var;
        long j3;
        char c;
        long floatToRawIntBits;
        int floatToRawIntBits2;
        int i = this.a;
        long j4 = 4294967295L;
        char c2 = ' ';
        Object obj2 = this.f;
        Object obj3 = this.e;
        float f = this.c;
        switch (i) {
            case 0:
                gv9 gv9Var = (gv9) obj3;
                b20 b20Var = (b20) obj2;
                ha5 ha5Var = (ha5) obj;
                ha5Var.getClass();
                int i2 = 0;
                while (i2 < 3) {
                    i2++;
                    if (i2 != 1) {
                        if (i2 != 2) {
                            float intBitsToFloat = Float.intBitsToFloat((int) (ha5Var.n() & j4)) - f;
                            floatToRawIntBits = Float.floatToRawIntBits(f);
                            floatToRawIntBits2 = Float.floatToRawIntBits(intBitsToFloat);
                        } else {
                            floatToRawIntBits = Float.floatToRawIntBits(Float.intBitsToFloat((int) (ha5Var.n() >> c2)) / 2.0f);
                            floatToRawIntBits2 = Float.floatToRawIntBits(f);
                        }
                        j = floatToRawIntBits << c2;
                        j2 = floatToRawIntBits2 & j4;
                    } else {
                        float intBitsToFloat2 = Float.intBitsToFloat((int) (ha5Var.n() >> c2)) - f;
                        float intBitsToFloat3 = Float.intBitsToFloat((int) (ha5Var.n() & j4)) - f;
                        long floatToRawIntBits3 = Float.floatToRawIntBits(intBitsToFloat2);
                        long floatToRawIntBits4 = Float.floatToRawIntBits(intBitsToFloat3);
                        j = floatToRawIntBits3 << c2;
                        j2 = floatToRawIntBits4 & j4;
                    }
                    long j5 = j | j2;
                    long j6 = Intrinsics.c(gv9Var != null ? Boolean.valueOf(gv9Var.contains(Integer.valueOf(i2))) : null, Boolean.TRUE) ? this.b : this.d;
                    sx2 L0 = ha5Var.L0();
                    long D = L0.D();
                    L0.t().o();
                    long j7 = j4;
                    try {
                        c = c2;
                    } catch (Throwable th) {
                        th = th;
                        sx2Var = L0;
                    }
                    try {
                        ((hpo) L0.a).I(Float.intBitsToFloat((int) (j5 >> c)), Float.intBitsToFloat((int) (j5 & j7)));
                        j3 = D;
                        try {
                            ha5.X0(ha5Var, b20Var, j6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 60);
                            mz1.v(L0, j3);
                            c2 = c;
                            j4 = j7;
                        } catch (Throwable th2) {
                            th = th2;
                            sx2Var = L0;
                            mz1.v(sx2Var, j3);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        sx2Var = L0;
                        j3 = D;
                        mz1.v(sx2Var, j3);
                        throw th;
                    }
                }
                return Unit.a;
            default:
                q50 q50Var = (q50) obj3;
                e1d e1dVar = (e1d) obj2;
                ha5 ha5Var2 = (ha5) obj;
                ha5Var2.getClass();
                ha5.L(ha5Var2, this.b, 360.0f, 360.0f, 0L, yaa.f((int) (((c7a) e1dVar.getValue()).a >> 32), (int) (((c7a) e1dVar.getValue()).a & 4294967295L)), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new jii(ha5Var2.H0(f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1, 0, null, 26), 848);
                float floatValue = ((Number) q50Var.d()).floatValue();
                float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                if (floatValue > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    float floatValue2 = ((Number) q50Var.d()).floatValue();
                    if (floatValue2 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        f2 = floatValue2;
                    }
                    ha5.L(ha5Var2, this.d, 270.0f, f2 * (-360.0f), 0L, yaa.f((int) (((c7a) e1dVar.getValue()).a >> 32), (int) (4294967295L & ((c7a) e1dVar.getValue()).a)), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new jii(ha5Var2.H0(f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1, 0, null, 26), 848);
                }
                return Unit.a;
        }
    }

    public /* synthetic */ s71(gv9 gv9Var, b20 b20Var, float f, long j, long j2) {
        this.e = gv9Var;
        this.f = b20Var;
        this.c = f;
        this.b = j;
        this.d = j2;
    }
}
