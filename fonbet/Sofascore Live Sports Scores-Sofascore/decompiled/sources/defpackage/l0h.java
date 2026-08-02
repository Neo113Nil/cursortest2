package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class l0h extends hoi implements Function1 {
    public int r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ o0h u;
    public final /* synthetic */ axj v;
    public final /* synthetic */ float w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0h(Object obj, Object obj2, o0h o0hVar, axj axjVar, float f, rq3 rq3Var) {
        super(1, rq3Var);
        this.s = obj;
        this.t = obj2;
        this.u = o0hVar;
        this.v = axjVar;
        this.w = f;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        return new l0h(this.s, this.t, this.u, this.v, this.w, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((l0h) create((rq3) obj)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.r;
        if (i == 0) {
            y6a.M(obj);
            k0h k0hVar = new k0h(this.s, this.t, this.u, this.v, this.w, null);
            this.r = 1;
            if (s9a.r(k0hVar, this) == lu3Var) {
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
