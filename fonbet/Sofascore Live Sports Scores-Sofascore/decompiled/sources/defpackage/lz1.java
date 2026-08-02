package defpackage;

import android.text.Layout;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class lz1 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ lz1(long j, float[] fArr, dsf dsfVar, csf csfVar) {
        this.a = 1;
        this.b = j;
        this.c = fArr;
        this.d = dsfVar;
        this.e = csfVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long j;
        boolean z;
        float a;
        float a2;
        sx2 L0;
        long D;
        int i = this.a;
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                oqf oqfVar = (oqf) obj4;
                fsf fsfVar = (fsf) obj3;
                long j2 = this.b;
                ay1 ay1Var = (ay1) obj2;
                yma ymaVar = (yma) obj;
                ymaVar.a();
                float f2 = oqfVar.a;
                float f3 = oqfVar.b;
                wj2 wj2Var = ymaVar.a;
                ((hpo) wj2Var.b.a).I(f2, f3);
                try {
                    ha5.H(ymaVar, (a10) fsfVar.a, j2, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ay1Var, 0, 890);
                    ((hpo) wj2Var.b.a).I(-f2, -f3);
                    return Unit.a;
                } catch (Throwable th) {
                    ((hpo) wj2Var.b.a).I(-f2, -f3);
                    throw th;
                }
            case 1:
                float[] fArr = (float[]) obj4;
                dsf dsfVar = (dsf) obj3;
                csf csfVar = (csf) obj2;
                c8e c8eVar = (c8e) obj;
                int i2 = c8eVar.b;
                x10 x10Var = c8eVar.a;
                int i3 = c8eVar.c;
                long j3 = this.b;
                int g = i2 > pej.g(j3) ? c8eVar.b : pej.g(j3);
                if (i3 >= pej.f(j3)) {
                    i3 = pej.f(j3);
                }
                long g2 = t6a.g(c8eVar.d(g), c8eVar.d(i3));
                int i4 = dsfVar.a;
                ydj ydjVar = x10Var.d;
                int g3 = pej.g(g2);
                int f4 = pej.f(g2);
                Layout layout = ydjVar.f;
                int length = layout.getText().length();
                if (g3 < 0) {
                    s3a.a("startOffset must be > 0");
                }
                if (g3 >= length) {
                    s3a.a("startOffset must be less than text length");
                }
                if (f4 <= g3) {
                    s3a.a("endOffset must be greater than startOffset");
                }
                if (f4 > length) {
                    s3a.a("endOffset must be smaller or equal to text length");
                }
                if (fArr.length - i4 < (f4 - g3) * 4) {
                    s3a.a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
                }
                int g4 = ydjVar.g(g3);
                int g5 = ydjVar.g(f4 - 1);
                ef9 ef9Var = new ef9(ydjVar);
                if (g4 <= g5) {
                    while (true) {
                        int lineStart = layout.getLineStart(g4);
                        int f5 = ydjVar.f(g4);
                        int max = Math.max(g3, lineStart);
                        int min = Math.min(f4, f5);
                        float h = ydjVar.h(g4);
                        float e = ydjVar.e(g4);
                        j = g2;
                        int i5 = i4;
                        boolean z2 = false;
                        boolean z3 = layout.getParagraphDirection(g4) == 1;
                        while (max < min) {
                            boolean isRtlCharAt = layout.isRtlCharAt(max);
                            if (!z3 || isRtlCharAt) {
                                if (z3 && isRtlCharAt) {
                                    z2 = false;
                                    float a3 = ef9Var.a(false, false, false, max);
                                    z = z3;
                                    a = ef9Var.a(true, true, false, max + 1);
                                    a2 = a3;
                                } else {
                                    z = z3;
                                    z2 = false;
                                    if (z || !isRtlCharAt) {
                                        a = ef9Var.a(false, false, false, max);
                                        a2 = ef9Var.a(true, true, false, max + 1);
                                    } else {
                                        a2 = ef9Var.a(false, false, true, max);
                                        a = ef9Var.a(true, true, true, max + 1);
                                    }
                                }
                                fArr[i5] = a;
                                fArr[i5 + 1] = h;
                                fArr[i5 + 2] = a2;
                                fArr[i5 + 3] = e;
                                i5 += 4;
                                max++;
                                z3 = z;
                            } else {
                                a = ef9Var.a(z2, z2, true, max);
                                z = z3;
                                a2 = ef9Var.a(true, true, true, max + 1);
                            }
                            z2 = false;
                            fArr[i5] = a;
                            fArr[i5 + 1] = h;
                            fArr[i5 + 2] = a2;
                            fArr[i5 + 3] = e;
                            i5 += 4;
                            max++;
                            z3 = z;
                        }
                        if (g4 != g5) {
                            g4++;
                            g2 = j;
                            i4 = i5;
                        }
                    }
                } else {
                    j = g2;
                }
                int e2 = (pej.e(j) * 4) + dsfVar.a;
                for (int i6 = dsfVar.a; i6 < e2; i6 += 4) {
                    int i7 = i6 + 1;
                    float f6 = fArr[i7];
                    float f7 = csfVar.a;
                    fArr[i7] = f6 + f7;
                    int i8 = i6 + 3;
                    fArr[i8] = fArr[i8] + f7;
                }
                dsfVar.a = e2;
                csfVar.a = x10Var.b() + csfVar.a;
                return Unit.a;
            case 2:
                ghf ghfVar = (ghf) obj4;
                cdi cdiVar = (cdi) obj3;
                long j4 = this.b;
                b20 b20Var = (b20) obj2;
                ha5 ha5Var = (ha5) obj;
                float a4 = ghfVar.a() / ghfVar.g.h();
                float max2 = (Math.max(Math.min(1.0f, a4) - 0.4f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) * 5.0f) / 3.0f;
                float abs = Math.abs(a4) - 1.0f;
                if (abs >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    f = abs;
                }
                if (f > 2.0f) {
                    f = 2.0f;
                }
                float pow = (((0.4f * max2) - 0.25f) + (f - (((float) Math.pow(f, 2.0d)) / 4.0f))) * 0.5f;
                float f8 = pow * 360.0f;
                float f9 = ((0.8f * max2) + pow) * 360.0f;
                qh0 qh0Var = new qh0(pow, f8, f9, Math.min(1.0f, max2));
                float floatValue = ((Number) cdiVar.getValue()).floatValue();
                long O0 = ha5Var.O0();
                L0 = ha5Var.L0();
                D = L0.D();
                L0.t().o();
                try {
                    ((hpo) L0.a).F(O0, pow);
                    float H0 = ha5Var.H0(bhf.b);
                    float f10 = bhf.c;
                    float H02 = (ha5Var.H0(f10) / 2.0f) + H0;
                    oqf oqfVar2 = new oqf(Float.intBitsToFloat((int) (yaa.u(ha5Var.n()) >> 32)) - H02, Float.intBitsToFloat((int) (yaa.u(ha5Var.n()) & 4294967295L)) - H02, Float.intBitsToFloat((int) (yaa.u(ha5Var.n()) >> 32)) + H02, Float.intBitsToFloat((int) (yaa.u(ha5Var.n()) & 4294967295L)) + H02);
                    ha5.L(ha5Var, j4, f8, f9 - f8, oqfVar2.f(), oqfVar2.e(), floatValue, new jii(ha5Var.H0(f10), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, 0, null, 26), 768);
                    bhf.c(ha5Var, b20Var, oqfVar2, j4, floatValue, qh0Var);
                    mz1.v(L0, D);
                    return Unit.a;
                } finally {
                }
            default:
                long j5 = this.b;
                b20 b20Var2 = (b20) obj2;
                ha5 ha5Var2 = (ha5) obj;
                float invoke = ((a88) obj4).invoke();
                float max3 = (Math.max(Math.min(1.0f, invoke) - 0.4f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) * 5.0f) / 3.0f;
                float b = llf.b(Math.abs(invoke) - 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2.0f);
                float pow2 = (((0.4f * max3) - 0.25f) + (b - (((float) Math.pow(b, 2.0d)) / 4.0f))) * 0.5f;
                float f11 = pow2 * 360.0f;
                float f12 = ((0.8f * max3) + pow2) * 360.0f;
                qh0 qh0Var2 = new qh0(pow2, f11, f12, Math.min(1.0f, max3));
                float floatValue2 = ((Number) ((cdi) obj3).getValue()).floatValue();
                long O02 = ha5Var2.O0();
                L0 = ha5Var2.L0();
                D = L0.D();
                L0.t().o();
                try {
                    ((hpo) L0.a).F(O02, pow2);
                    float H03 = (ha5Var2.H0(2.5f) / 2.0f) + ha5Var2.H0(5.5f);
                    long u = yaa.u(ha5Var2.n());
                    int i9 = (int) (u >> 32);
                    int i10 = (int) (u & 4294967295L);
                    oqf oqfVar3 = new oqf(Float.intBitsToFloat(i9) - H03, Float.intBitsToFloat(i10) - H03, Float.intBitsToFloat(i9) + H03, Float.intBitsToFloat(i10) + H03);
                    ha5.L(ha5Var2, j5, f11, f12 - f11, oqfVar3.f(), oqfVar3.e(), floatValue2, new jii(ha5Var2.H0(2.5f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 0, null, 26), 768);
                    x2a.x(ha5Var2, b20Var2, oqfVar3, j5, floatValue2, qh0Var2);
                    mz1.v(L0, D);
                    return Unit.a;
                } finally {
                }
        }
    }

    public /* synthetic */ lz1(int i, long j, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.b = j;
        this.e = obj3;
    }
}
