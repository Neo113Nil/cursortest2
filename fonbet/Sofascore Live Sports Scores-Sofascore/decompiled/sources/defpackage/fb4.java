package defpackage;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class fb4 extends hoi implements Function2 {
    public int r;
    public final /* synthetic */ CoroutineContext s;
    public final /* synthetic */ k6g t;
    public final /* synthetic */ boolean u;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ Function1 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fb4(CoroutineContext coroutineContext, k6g k6gVar, boolean z, boolean z2, Function1 function1, rq3 rq3Var) {
        super(2, rq3Var);
        this.s = coroutineContext;
        this.t = k6gVar;
        this.u = z;
        this.v = z2;
        this.w = function1;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new fb4(this.s, this.t, this.u, this.v, this.w, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((fb4) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.r;
        if (i != 0) {
            if (i == 1) {
                y6a.M(obj);
                return obj;
            }
            a70.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        y6a.M(obj);
        eb4 eb4Var = new eb4(this.t, this.u, this.v, this.w, (rq3) null);
        this.r = 1;
        Object R = xw3.R(this.s, eb4Var, this);
        return R == lu3Var ? lu3Var : R;
    }
}
