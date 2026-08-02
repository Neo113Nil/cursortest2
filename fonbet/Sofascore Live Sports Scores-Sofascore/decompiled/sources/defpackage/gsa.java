package defpackage;

import com.unity3d.services.UnityAdsConstants;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class gsa implements knh {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ jvg b;
    public final /* synthetic */ Object c;

    public gsa(a6e a6eVar, yya yyaVar, v5e v5eVar) {
        this.b = a6eVar;
        this.c = yyaVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x01a2, code lost:
    
        if (java.lang.Math.abs(r10) <= java.lang.Math.abs(r9)) goto L91;
     */
    @Override // defpackage.knh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float a(float f) {
        int i = this.a;
        Object obj = this.c;
        jvg jvgVar = this.b;
        switch (i) {
            case 0:
                ksa ksaVar = (ksa) jvgVar;
                List list = ksaVar.j().k;
                lnh lnhVar = (lnh) obj;
                int size = list.size();
                float f2 = Float.NEGATIVE_INFINITY;
                float f3 = Float.POSITIVE_INFINITY;
                for (int i2 = 0; i2 < size; i2++) {
                    dsa dsaVar = (dsa) list.get(i2);
                    dsa dsaVar2 = dsaVar != null ? dsaVar : null;
                    if (dsaVar2 == null || !dsaVar2.s) {
                        csa j = ksaVar.j();
                        int e = (int) (j.o == ewd.a ? j.e() & 4294967295L : j.e() >> 32);
                        int i3 = -ksaVar.j().l;
                        int i4 = ksaVar.j().p;
                        int i5 = dsaVar.p;
                        int i6 = dsaVar.o;
                        int i7 = ksaVar.j().n;
                        float a = i6 - lnhVar.a(e, i5, i3, i4);
                        if (a <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && a > f2) {
                            f2 = a;
                        }
                        if (a >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && a < f3) {
                            f3 = a;
                        }
                    }
                }
                char c = Math.abs(f) < ((csa) ((eoh) ksaVar.f).getValue()).i.H0(400.0f) ? (char) 0 : f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? (char) 1 : (char) 2;
                if (c == 0) {
                    break;
                } else {
                    if (c != 1) {
                        if (c != 2) {
                            f2 = 0.0f;
                        }
                    }
                    f2 = f3;
                }
                return (f2 == Float.POSITIVE_INFINITY || f2 == Float.NEGATIVE_INFINITY) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : f2;
            default:
                a6e a6eVar = (a6e) jvgVar;
                lnh lnhVar2 = a6eVar.m().n;
                List list2 = a6eVar.m().a;
                int size2 = list2.size();
                float f4 = Float.NEGATIVE_INFINITY;
                float f5 = Float.POSITIVE_INFINITY;
                for (int i8 = 0; i8 < size2; i8++) {
                    n1c n1cVar = (n1c) list2.get(i8);
                    int E = o6a.E(a6eVar.m());
                    int i9 = -a6eVar.m().f;
                    int i10 = a6eVar.m().d;
                    int i11 = a6eVar.m().b;
                    int i12 = n1cVar.k;
                    a6eVar.n();
                    float a2 = i12 - lnhVar2.a(E, i11, i9, i10);
                    if (a2 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && a2 > f4) {
                        f4 = a2;
                    }
                    if (a2 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && a2 < f5) {
                        f5 = a2;
                    }
                }
                if (f4 == Float.NEGATIVE_INFINITY) {
                    f4 = f5;
                }
                if (f5 == Float.POSITIVE_INFINITY) {
                    f5 = f4;
                }
                if (!a6eVar.d()) {
                    if (y6a.G(a6eVar, f)) {
                        f4 = 0.0f;
                        f5 = 0.0f;
                    } else {
                        f5 = 0.0f;
                    }
                }
                if (!a6eVar.c()) {
                    f4 = 0.0f;
                    if (!y6a.G(a6eVar, f)) {
                        f5 = 0.0f;
                    }
                }
                Float valueOf = Float.valueOf(f4);
                Float valueOf2 = Float.valueOf(f5);
                float floatValue = valueOf.floatValue();
                float floatValue2 = valueOf2.floatValue();
                float floatValue3 = ((Number) ((yya) obj).invoke(Float.valueOf(f), Float.valueOf(floatValue), Float.valueOf(floatValue2))).floatValue();
                if (floatValue3 != floatValue && floatValue3 != floatValue2 && floatValue3 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    u3a.c("Final Snapping Offset Should Be one of " + floatValue + ", " + floatValue2 + " or 0.0");
                }
                return (floatValue3 == Float.POSITIVE_INFINITY || floatValue3 == Float.NEGATIVE_INFINITY) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : floatValue3;
        }
    }

    @Override // defpackage.knh
    public final float b(float f, float f2) {
        int i = this.a;
        jvg jvgVar = this.b;
        float f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        switch (i) {
            case 0:
                float abs = Math.abs(f2);
                List list = ((ksa) jvgVar).j().k;
                if (!list.isEmpty()) {
                    int size = list.size();
                    int size2 = list.size();
                    int i2 = 0;
                    while (r1 < size2) {
                        i2 += ((dsa) list.get(r1)).p;
                        r1++;
                    }
                    r1 = i2 / size;
                }
                float f4 = abs - r1;
                if (f4 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    f3 = f4;
                }
                return Math.signum(f2) * f3;
            default:
                a6e a6eVar = (a6e) jvgVar;
                int o = a6eVar.o();
                e1d e1dVar = a6eVar.m;
                int i3 = ((r5e) ((eoh) e1dVar).getValue()).c + o;
                if (i3 == 0) {
                    return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                }
                int i4 = a6eVar.e;
                if (f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    i4++;
                }
                int c = llf.c(((int) (f2 / i3)) + i4, 0, a6eVar.n());
                a6eVar.o();
                int i5 = ((r5e) ((eoh) e1dVar).getValue()).c;
                long j = i4;
                long j2 = j - 1;
                if (j2 < 0) {
                    j2 = 0;
                }
                int i6 = (int) j2;
                long j3 = j + 1;
                if (j3 > 2147483647L) {
                    j3 = 2147483647L;
                }
                int abs2 = Math.abs((llf.c(llf.c(c, i6, (int) j3), 0, a6eVar.n()) - i4) * i3) - i3;
                r1 = abs2 >= 0 ? abs2 : 0;
                if (r1 == 0) {
                    return r1;
                }
                return Math.signum(f) * r1;
        }
    }

    public gsa(ksa ksaVar, lnh lnhVar) {
        this.b = ksaVar;
        this.c = lnhVar;
    }
}
