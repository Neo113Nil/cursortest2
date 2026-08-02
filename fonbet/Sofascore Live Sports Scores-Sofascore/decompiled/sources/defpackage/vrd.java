package defpackage;

import androidx.activity.ComponentActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class vrd extends hoi implements Function2 {
    public final /* synthetic */ int r = 0;
    public int s;
    public final /* synthetic */ u6b t;
    public final /* synthetic */ b1d u;
    public final /* synthetic */ rgh v;
    public final /* synthetic */ ComponentActivity w;
    public final /* synthetic */ ku3 x;
    public final /* synthetic */ dfh y;
    public final /* synthetic */ Function0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vrd(u6b u6bVar, b1d b1dVar, rq3 rq3Var, rgh rghVar, ComponentActivity componentActivity, ku3 ku3Var, dfh dfhVar, Function0 function0) {
        super(2, rq3Var);
        e6b e6bVar = e6b.a;
        this.t = u6bVar;
        this.u = b1dVar;
        this.v = rghVar;
        this.w = componentActivity;
        this.x = ku3Var;
        this.y = dfhVar;
        this.z = function0;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        switch (this.r) {
            case 0:
                return new vrd(this.u, this.t, rq3Var, this.v, this.w, this.x, this.y, this.z);
            default:
                e6b e6bVar = e6b.a;
                return new vrd(this.t, this.u, rq3Var, this.v, this.w, this.x, this.y, this.z);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
            case 0:
                ((vrd) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
                return lu3.a;
            default:
                return ((vrd) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        switch (this.r) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i = this.s;
                if (i == 0) {
                    y6a.M(obj);
                    d33 d33Var = new d33(this.t, this.v, this.w, this.x, this.y, this.z, 1);
                    this.s = 1;
                    if (this.u.collect(d33Var, this) == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                pvd.x();
                return null;
            default:
                lu3 lu3Var2 = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    e6b e6bVar = e6b.c;
                    dfh dfhVar = this.y;
                    Function0 function0 = this.z;
                    b1d b1dVar = this.u;
                    u6b u6bVar = this.t;
                    vrd vrdVar = new vrd(b1dVar, u6bVar, (rq3) null, this.v, this.w, this.x, dfhVar, function0);
                    this.s = 1;
                    if (b6a.A(u6bVar, e6bVar, vrdVar, this) == lu3Var2) {
                        return lu3Var2;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vrd(b1d b1dVar, u6b u6bVar, rq3 rq3Var, rgh rghVar, ComponentActivity componentActivity, ku3 ku3Var, dfh dfhVar, Function0 function0) {
        super(2, rq3Var);
        this.u = b1dVar;
        this.t = u6bVar;
        this.v = rghVar;
        this.w = componentActivity;
        this.x = ku3Var;
        this.y = dfhVar;
        this.z = function0;
    }
}
