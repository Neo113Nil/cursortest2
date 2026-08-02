package defpackage;

import com.sofascore.model.fantasy.FantasyLeague;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class i37 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ j37 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i37(j37 j37Var, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        switch (i) {
            case 1:
                umh umhVar = umh.e;
                this.t = j37Var;
                super(2, rq3Var);
                break;
            default:
                this.t = j37Var;
                break;
        }
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        j37 j37Var = this.t;
        switch (i) {
            case 0:
                return new i37(j37Var, rq3Var, 0);
            default:
                umh umhVar = umh.e;
                return new i37(j37Var, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((i37) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        Object value;
        int i = this.r;
        j37 j37Var = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    wi7 wi7Var = j37Var.e;
                    int i3 = j37Var.f.a;
                    this.s = 1;
                    obj = wi7Var.r(i3, this);
                    if (obj == lu3Var) {
                        break;
                    }
                } else if (i2 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                FantasyLeague fantasyLeague = (FantasyLeague) obj;
                if (fantasyLeague != null) {
                    fdi fdiVar = j37Var.j;
                    do {
                        value = fdiVar.getValue();
                    } while (!fdiVar.k(value, iz8.w(fantasyLeague)));
                }
                break;
            default:
                lu3 lu3Var2 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    g62 g62Var = j37Var.l;
                    umh umhVar = umh.e;
                    this.s = 1;
                    if (g62Var.q(this, umhVar) == lu3Var2) {
                        break;
                    }
                } else if (i4 != 1) {
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
