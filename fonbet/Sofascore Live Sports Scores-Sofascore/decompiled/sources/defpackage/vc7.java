package defpackage;

import com.sofascore.results.fantasy.ui.model.FantasyPlayerUiModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class vc7 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ yc7 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vc7(yc7 yc7Var, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = yc7Var;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        yc7 yc7Var = this.t;
        switch (i) {
            case 0:
                return new vc7(yc7Var, rq3Var, 0);
            case 1:
                return new vc7(yc7Var, rq3Var, 1);
            case 2:
                return new vc7(yc7Var, rq3Var, 2);
            default:
                return new vc7(yc7Var, rq3Var, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((vc7) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        gv9 gv9Var;
        switch (this.r) {
            case 0:
                Object obj2 = lu3.a;
                int i = this.s;
                yc7 yc7Var = this.t;
                if (i == 0) {
                    y6a.M(obj);
                    int intValue = yc7Var.i.intValue();
                    nc7 nc7Var = nc7.a;
                    this.s = 1;
                    Object r = s9a.r(new jr5(yc7Var, nc7Var, intValue, (rq3) null, 2), this);
                    if (r != obj2) {
                        r = Unit.a;
                    }
                    if (r == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                yc7Var.k();
                return Unit.a;
            case 1:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 != 0) {
                    if (i2 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                yc7 yc7Var2 = this.t;
                m73 m73Var = yc7Var2.m().b;
                gv9 gv9Var2 = m73Var != null ? m73Var.c : null;
                m73 m73Var2 = yc7Var2.m().c;
                gv9Var = m73Var2 != null ? m73Var2.c : null;
                this.s = 1;
                Object r2 = s9a.r(new wc7(false, gv9Var2, gv9Var, yc7Var2, null), this);
                return r2 == lu3Var ? lu3Var : r2;
            case 2:
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                if (i3 != 0) {
                    if (i3 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                yc7 yc7Var3 = this.t;
                m73 m73Var3 = yc7Var3.m().b;
                gv9 gv9Var3 = m73Var3 != null ? m73Var3.b : null;
                m73 m73Var4 = yc7Var3.m().c;
                gv9Var = m73Var4 != null ? m73Var4.b : null;
                this.s = 1;
                Object r3 = s9a.r(new wc7(true, gv9Var3, gv9Var, yc7Var3, null), this);
                return r3 == lu3Var2 ? lu3Var2 : r3;
            default:
                lu3 lu3Var3 = lu3.a;
                int i4 = this.s;
                if (i4 != 0) {
                    if (i4 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                yc7 yc7Var4 = this.t;
                m73 m73Var5 = yc7Var4.m().b;
                rq3 rq3Var = null;
                FantasyPlayerUiModel fantasyPlayerUiModel = m73Var5 != null ? m73Var5.a : null;
                m73 m73Var6 = yc7Var4.m().c;
                FantasyPlayerUiModel fantasyPlayerUiModel2 = m73Var6 != null ? m73Var6.a : null;
                this.s = 1;
                Object r4 = s9a.r(new k50(fantasyPlayerUiModel, fantasyPlayerUiModel2, yc7Var4, rq3Var, 6), this);
                return r4 == lu3Var3 ? lu3Var3 : r4;
        }
    }
}
