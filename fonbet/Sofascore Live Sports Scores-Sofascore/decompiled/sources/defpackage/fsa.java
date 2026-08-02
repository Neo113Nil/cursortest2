package defpackage;

import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class fsa implements oug {
    public final /* synthetic */ int a;
    public final /* synthetic */ oug b;
    public final /* synthetic */ jvg c;

    public /* synthetic */ fsa(oug ougVar, jvg jvgVar, int i) {
        this.a = i;
        this.c = jvgVar;
        this.b = ougVar;
    }

    @Override // defpackage.oug
    public final float a(float f) {
        switch (this.a) {
        }
        return this.b.a(f);
    }

    public final int b(int i) {
        Object obj;
        int i2 = this.a;
        jvg jvgVar = this.c;
        switch (i2) {
            case 0:
                ksa ksaVar = (ksa) jvgVar;
                csa j = ksaVar.j();
                if (j.k.isEmpty()) {
                    return 0;
                }
                int h = ksaVar.h();
                if (i > e() || h > i) {
                    return ((i - ksaVar.h()) * oea.C(j)) - ksaVar.i();
                }
                List list = j.k;
                int size = list.size();
                int i3 = 0;
                while (true) {
                    if (i3 < size) {
                        obj = list.get(i3);
                        if (((dsa) obj).a != i) {
                            i3++;
                        }
                    } else {
                        obj = null;
                    }
                }
                dsa dsaVar = (dsa) obj;
                if (dsaVar != null) {
                    return dsaVar.o;
                }
                return 0;
            default:
                a6e a6eVar = (a6e) jvgVar;
                return (int) (llf.e(t6a.u(a6eVar) + wzb.b(((a6eVar.p() * (i - a6eVar.k())) - (a6eVar.l() * a6eVar.p())) + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), a6eVar.h, a6eVar.g) - t6a.u(a6eVar));
        }
    }

    public final int c() {
        int i = this.a;
        jvg jvgVar = this.c;
        switch (i) {
            case 0:
                return ((ksa) jvgVar).h();
            default:
                return ((a6e) jvgVar).e;
        }
    }

    public final int d() {
        int i = this.a;
        jvg jvgVar = this.c;
        switch (i) {
            case 0:
                return ((ksa) jvgVar).i();
            default:
                return ((a6e) jvgVar).f;
        }
    }

    public final int e() {
        int i = this.a;
        jvg jvgVar = this.c;
        switch (i) {
            case 0:
                dsa dsaVar = (dsa) CollectionsKt.j0(((ksa) jvgVar).j().k);
                if (dsaVar != null) {
                    return dsaVar.a;
                }
                return 0;
            default:
                return ((n1c) CollectionsKt.h0(((a6e) jvgVar).m().a)).a;
        }
    }

    public final void f(int i, int i2) {
        int i3 = this.a;
        jvg jvgVar = this.c;
        switch (i3) {
            case 0:
                ((ksa) jvgVar).m(i, i2);
                break;
            default:
                a6e a6eVar = (a6e) jvgVar;
                float p = a6eVar.p();
                float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                if (p != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    f = i2 / p;
                }
                a6eVar.u(i, f, true);
                break;
        }
    }
}
