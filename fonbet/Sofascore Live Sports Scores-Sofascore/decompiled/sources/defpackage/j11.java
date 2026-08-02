package defpackage;

import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class j11 extends hoi implements Function2 {
    public int r;
    public final /* synthetic */ u11 s;
    public final /* synthetic */ esf t;
    public final /* synthetic */ AdManagerAdView u;
    public final /* synthetic */ ng v;
    public final /* synthetic */ tm8 w;
    public final /* synthetic */ AdSize[] x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j11(u11 u11Var, esf esfVar, AdManagerAdView adManagerAdView, ng ngVar, tm8 tm8Var, AdSize[] adSizeArr, rq3 rq3Var) {
        super(2, rq3Var);
        this.s = u11Var;
        this.t = esfVar;
        this.u = adManagerAdView;
        this.v = ngVar;
        this.w = tm8Var;
        this.x = adSizeArr;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new j11(this.s, this.t, this.u, this.v, this.w, this.x, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j11) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.r;
        if (i == 0) {
            y6a.M(obj);
            yea yeaVar = j58.a;
            e58 f = e58.f();
            f.getClass();
            nxf[] nxfVarArr = nxf.a;
            boolean c = f.c("enforce_banner_ads_viewability");
            u11 u11Var = this.s;
            u6b u6bVar = u11Var.c;
            e6b e6bVar = c ? e6b.c : e6b.d;
            i11 i11Var = new i11(c, u11Var, this.t, this.u, this.v, this.w, this.x, null);
            this.r = 1;
            if (b6a.A(u6bVar, e6bVar, i11Var, this) == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        return Unit.a;
    }
}
