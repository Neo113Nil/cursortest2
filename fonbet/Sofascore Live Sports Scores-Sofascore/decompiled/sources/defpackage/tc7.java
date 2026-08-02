package defpackage;

import com.unity3d.services.UnityAdsConstants;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class tc7 implements b98 {
    public final /* synthetic */ float a;
    public final /* synthetic */ kx4 b;
    public final /* synthetic */ ksa c;
    public final /* synthetic */ float d;
    public final /* synthetic */ e1d e;
    public final /* synthetic */ xnh f;
    public final /* synthetic */ cdi g;

    public tc7(float f, kx4 kx4Var, ksa ksaVar, float f2, e1d e1dVar, xnh xnhVar, cdi cdiVar) {
        this.a = f;
        this.b = kx4Var;
        this.c = ksaVar;
        this.d = f2;
        this.e = e1dVar;
        this.f = xnhVar;
        this.g = cdiVar;
    }

    @Override // defpackage.b98
    public final Object emit(Object obj, rq3 rq3Var) {
        Integer num;
        Pair pair = (Pair) obj;
        int intValue = ((Number) pair.a).intValue();
        List list = (List) pair.b;
        Iterator it = list.iterator();
        if (it.hasNext()) {
            num = new Integer(((dsa) it.next()).p);
            while (it.hasNext()) {
                Integer num2 = new Integer(((dsa) it.next()).p);
                if (num.compareTo(num2) > 0) {
                    num = num2;
                }
            }
        } else {
            num = null;
        }
        int i = 0;
        int intValue2 = num != null ? num.intValue() : 0;
        int size = intValue - list.size();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            i += ((dsa) it2.next()).p;
        }
        float f = (size * intValue2) + i + this.a;
        e1d e1dVar = this.e;
        p75 p75Var = (p75) e1dVar.getValue();
        kx4 kx4Var = this.b;
        float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float floatValue = new Float(p75Var != null ? kx4Var.H0(p75Var.a) : 0.0f).floatValue() + f;
        ksa ksaVar = this.c;
        xnh xnhVar = this.f;
        float f3 = this.d;
        xnhVar.i(Math.min(f3, floatValue - ((int) (ksaVar.j().e() & 4294967295L))));
        if (!((Boolean) this.g.getValue()).booleanValue() && ((p75) e1dVar.getValue()) == null && list.size() > 1) {
            Float f4 = new Float(floatValue - ((int) (ksaVar.j().e() & 4294967295L)));
            Float f5 = f4.floatValue() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? f4 : null;
            if (f5 != null) {
                float floatValue2 = f3 - f5.floatValue();
                if (floatValue2 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    f2 = floatValue2;
                }
                f2 = kx4Var.D0(f2);
            }
            e1dVar.setValue(new p75(f2));
        }
        return Unit.a;
    }
}
