package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class u9 extends r9 {
    public static u9 e;
    public static final d1g f = d1g.b;
    public static final d1g g = d1g.a;
    public aej c;
    public s3h d;

    public final int G(int i, d1g d1gVar) {
        aej aejVar = this.c;
        if (aejVar == null) {
            Intrinsics.i("layoutResult");
            throw null;
        }
        int h = aejVar.h(i);
        aej aejVar2 = this.c;
        if (aejVar2 == null) {
            Intrinsics.i("layoutResult");
            throw null;
        }
        d1g i2 = aejVar2.i(h);
        aej aejVar3 = this.c;
        if (d1gVar != i2) {
            if (aejVar3 != null) {
                return aejVar3.h(i);
            }
            Intrinsics.i("layoutResult");
            throw null;
        }
        if (aejVar3 != null) {
            return aejVar3.b.c(i, false) - 1;
        }
        Intrinsics.i("layoutResult");
        throw null;
    }

    @Override // defpackage.r9
    public final int[] g(int i) {
        int i2;
        if (p().length() > 0 && i < p().length()) {
            try {
                s3h s3hVar = this.d;
                if (s3hVar == null) {
                    Intrinsics.i("node");
                    throw null;
                }
                oqf g2 = s3hVar.g();
                int round = Math.round(g2.d - g2.b);
                if (i <= 0) {
                    i = 0;
                }
                aej aejVar = this.c;
                if (aejVar == null) {
                    Intrinsics.i("layoutResult");
                    throw null;
                }
                int d = aejVar.b.d(i);
                aej aejVar2 = this.c;
                if (aejVar2 == null) {
                    Intrinsics.i("layoutResult");
                    throw null;
                }
                float f2 = aejVar2.b.f(d) + round;
                aej aejVar3 = this.c;
                if (aejVar3 == null) {
                    Intrinsics.i("layoutResult");
                    throw null;
                }
                float f3 = aejVar3.b.f(r0.f - 1);
                aej aejVar4 = this.c;
                if (f2 < f3) {
                    if (aejVar4 == null) {
                        Intrinsics.i("layoutResult");
                        throw null;
                    }
                    i2 = aejVar4.b.e(f2);
                } else {
                    if (aejVar4 == null) {
                        Intrinsics.i("layoutResult");
                        throw null;
                    }
                    i2 = aejVar4.b.f;
                }
                return l(i, G(i2 - 1, g) + 1);
            } catch (IllegalStateException unused) {
            }
        }
        return null;
    }

    @Override // defpackage.r9
    public final int[] y(int i) {
        int i2;
        if (p().length() > 0 && i > 0) {
            try {
                s3h s3hVar = this.d;
                if (s3hVar == null) {
                    Intrinsics.i("node");
                    throw null;
                }
                oqf g2 = s3hVar.g();
                int round = Math.round(g2.d - g2.b);
                int length = p().length();
                if (length <= i) {
                    i = length;
                }
                aej aejVar = this.c;
                if (aejVar == null) {
                    Intrinsics.i("layoutResult");
                    throw null;
                }
                int d = aejVar.b.d(i);
                aej aejVar2 = this.c;
                if (aejVar2 == null) {
                    Intrinsics.i("layoutResult");
                    throw null;
                }
                float f2 = aejVar2.b.f(d) - round;
                if (f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    aej aejVar3 = this.c;
                    if (aejVar3 == null) {
                        Intrinsics.i("layoutResult");
                        throw null;
                    }
                    i2 = aejVar3.b.e(f2);
                } else {
                    i2 = 0;
                }
                if (i == p().length() && i2 < d) {
                    i2++;
                }
                return l(G(i2, f), i);
            } catch (IllegalStateException unused) {
            }
        }
        return null;
    }
}
