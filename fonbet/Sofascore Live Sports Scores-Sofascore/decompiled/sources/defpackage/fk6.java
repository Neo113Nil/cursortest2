package defpackage;

import androidx.fragment.app.Fragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class fk6 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ Fragment t;
    public final /* synthetic */ z88 u;
    public final /* synthetic */ Function2 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fk6(Fragment fragment, z88 z88Var, Function2 function2, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = fragment;
        this.u = z88Var;
        this.v = function2;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        switch (this.r) {
            case 0:
                return new fk6(this.t, this.u, this.v, rq3Var, 0);
            default:
                return new fk6(this.t, this.u, this.v, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((fk6) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        Function2 function2 = this.v;
        z88 z88Var = this.u;
        Fragment fragment = this.t;
        rq3 rq3Var = null;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    e6b e6bVar = e6b.e;
                    ek6 ek6Var = new ek6(z88Var, function2, rq3Var, 0);
                    this.s = 1;
                    if (b6a.A(fragment, e6bVar, ek6Var, this) == lu3Var) {
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
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    u6b viewLifecycleOwner = fragment.getViewLifecycleOwner();
                    viewLifecycleOwner.getClass();
                    e6b e6bVar2 = e6b.d;
                    ek6 ek6Var2 = new ek6(z88Var, function2, rq3Var, 2);
                    this.s = 1;
                    if (b6a.A(viewLifecycleOwner, e6bVar2, ek6Var2, this) == lu3Var2) {
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
