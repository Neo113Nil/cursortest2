package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class vqb extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ zqb t;
    public final /* synthetic */ String u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vqb(zqb zqbVar, String str, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = zqbVar;
        this.u = str;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        String str = this.u;
        zqb zqbVar = this.t;
        switch (i) {
            case 0:
                return new vqb(zqbVar, str, rq3Var, 0);
            default:
                return new vqb(zqbVar, str, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((vqb) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        String str = this.u;
        zqb zqbVar = this.t;
        switch (i) {
            case 0:
                Object obj2 = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    gzh gzhVar = zqbVar.e;
                    this.s = 1;
                    Object U = gz8.U(this, gzhVar.a.a, false, true, new jp1(str, 28));
                    if (U != obj2) {
                        U = Unit.a;
                    }
                    if (U != obj2) {
                        U = Unit.a;
                    }
                    if (U == obj2) {
                        break;
                    }
                } else if (i2 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            default:
                lu3 lu3Var = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    qa6 qa6Var = zqbVar.g;
                    qa6Var.getClass();
                    v76 v76Var = qa6Var.a;
                    v76Var.getClass();
                    nb8 s = zm2.s(v76Var.a, false, new String[]{"events_table", "tournament"}, new jp1(str, 12));
                    hs4 hs4Var = z45.a;
                    z88 H = hkg.H(k53.g0(s, hq4.c));
                    f10 f10Var = new f10(zqbVar, 12);
                    this.s = 1;
                    if (H.collect(f10Var, this) == lu3Var) {
                        break;
                    }
                } else if (i3 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
        }
        return Unit.a;
    }
}
