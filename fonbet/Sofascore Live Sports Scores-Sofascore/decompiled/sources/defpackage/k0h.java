package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class k0h extends hoi implements Function2 {
    public int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ o0h v;
    public final /* synthetic */ axj w;
    public final /* synthetic */ float x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0h(Object obj, Object obj2, o0h o0hVar, axj axjVar, float f, rq3 rq3Var) {
        super(2, rq3Var);
        this.t = obj;
        this.u = obj2;
        this.v = o0hVar;
        this.w = axjVar;
        this.x = f;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        k0h k0hVar = new k0h(this.t, this.u, this.v, this.w, this.x, rq3Var);
        k0hVar.s = obj;
        return k0hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k0h) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.r;
        rq3 rq3Var = null;
        o0h o0hVar = this.v;
        if (i == 0) {
            y6a.M(obj);
            ku3 ku3Var = (ku3) this.s;
            Object obj2 = this.t;
            Object obj3 = this.u;
            if (Intrinsics.c(obj2, obj3)) {
                o0hVar.p = null;
                if (Intrinsics.c(((eoh) o0hVar.d).getValue(), obj2)) {
                    return Unit.a;
                }
            } else {
                o0hVar.U();
            }
            boolean c = Intrinsics.c(obj2, obj3);
            float f = this.x;
            if (!c) {
                axj axjVar = this.w;
                axjVar.r(obj2);
                axjVar.p(0L);
                ((eoh) o0hVar.c).setValue(obj2);
                axjVar.l(f);
            }
            o0hVar.Z(f);
            if (o0hVar.o.i()) {
                xw3.L(ku3Var, null, null, new w9g(o0hVar, rq3Var, 9), 3);
            } else {
                o0hVar.n = Long.MIN_VALUE;
            }
            this.r = 1;
            if (o0hVar.d0(this) == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        o0hVar.Y();
        return Unit.a;
    }
}
