package defpackage;

import com.facebook.internal.g;
import com.facebook.login.t;
import com.facebook.login.u;
import com.facebook.login.w;
import com.sofascore.results.base.BaseActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class rrd extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public final /* synthetic */ rgh s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rrd(rgh rghVar, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.s = rghVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        rgh rghVar = this.s;
        switch (i) {
            case 0:
                return new rrd(rghVar, rq3Var, 0);
            default:
                return new rrd(rghVar, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((rrd) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        rgh rghVar = this.s;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                y6a.M(obj);
                n19 n19Var = n19.a;
                rgh.c(rghVar, null, 1);
                break;
            default:
                lu3 lu3Var2 = lu3.a;
                y6a.M(obj);
                BaseActivity baseActivity = rghVar.a;
                w wVar = (w) rghVar.d.getValue();
                g gVar = rghVar.e;
                t tVar = w.b;
                wVar.getClass();
                rghVar.f = baseActivity.registerForActivityResult(new u(wVar, gVar), new ilg(17));
                break;
        }
        return Unit.a;
    }
}
