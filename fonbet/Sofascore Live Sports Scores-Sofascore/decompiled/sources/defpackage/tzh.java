package defpackage;

import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class tzh extends hoi implements Function2 {
    public final /* synthetic */ List A;
    public final /* synthetic */ Function2 B;
    public final /* synthetic */ z69 C;
    public int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ ku3 t;
    public final /* synthetic */ ksa u;
    public final /* synthetic */ float v;
    public final /* synthetic */ float w;
    public final /* synthetic */ float x;
    public final /* synthetic */ e1d y;
    public final /* synthetic */ xnh z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tzh(ku3 ku3Var, ksa ksaVar, float f, float f2, float f3, e1d e1dVar, xnh xnhVar, List list, Function2 function2, z69 z69Var, rq3 rq3Var) {
        super(2, rq3Var);
        this.t = ku3Var;
        this.u = ksaVar;
        this.v = f;
        this.w = f2;
        this.x = f3;
        this.y = e1dVar;
        this.z = xnhVar;
        this.A = list;
        this.B = function2;
        this.C = z69Var;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        tzh tzhVar = new tzh(this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, rq3Var);
        tzhVar.s = obj;
        return tzhVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((tzh) create((oug) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        oug ougVar = (oug) this.s;
        lu3 lu3Var = lu3.a;
        int i = this.r;
        int i2 = 4;
        if (i != 0 && i != 1) {
            if (i == 2) {
                y6a.M(obj);
                i2 = 4;
            } else if (i == 3) {
                y6a.M(obj);
                i2 = 4;
            } else if (i != 4) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            while (s9a.w(this.t)) {
                e1d e1dVar = this.y;
                if (((Integer) e1dVar.getValue()) == null) {
                    break;
                }
                int e = (int) (this.u.j().e() & 4294967295L);
                if (e == 0) {
                    this.s = ougVar;
                    this.r = 1;
                    if (n4o.y(16L, this) == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    xnh xnhVar = this.z;
                    float h = xnhVar.h();
                    float h2 = e - (xnhVar.h() + this.v);
                    float f = this.w;
                    float f2 = h < f ? (-(f - h)) * 0.08f : h2 < f ? (f - h2) * 0.08f : 0.0f;
                    float f3 = this.x;
                    float b = llf.b(f2, -f3, f3);
                    if (b == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        this.s = ougVar;
                        this.r = i2;
                        if (n4o.y(16L, this) == lu3Var) {
                            return lu3Var;
                        }
                    } else {
                        float a = ougVar.a(b);
                        hz8.w(this.v, this.A, this.B, this.C, e1dVar, this.z, this.u);
                        if (a == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            this.s = ougVar;
                            this.r = 2;
                            if (n4o.y(16L, this) == lu3Var) {
                                return lu3Var;
                            }
                            i2 = 4;
                        } else {
                            z1h z1hVar = new z1h(26);
                            this.s = ougVar;
                            this.r = 3;
                            if (bea.R(z1hVar, this) == lu3Var) {
                                return lu3Var;
                            }
                            i2 = 4;
                        }
                    }
                }
            }
            return Unit.a;
        }
        y6a.M(obj);
        while (s9a.w(this.t)) {
        }
        return Unit.a;
    }
}
