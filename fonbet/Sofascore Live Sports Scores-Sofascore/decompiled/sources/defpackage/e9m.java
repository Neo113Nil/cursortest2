package defpackage;

import com.blaze.blazesdk.shared.results.g0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class e9m extends hoi implements Function1 {
    public final /* synthetic */ Function1 r;
    public final /* synthetic */ g0 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e9m(Function1 function1, g0 g0Var, rq3 rq3Var) {
        super(1, rq3Var);
        this.r = function1;
        this.s = g0Var;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        return new e9m(this.r, this.s, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new e9m(this.r, this.s, (rq3) obj).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        this.r.invoke(this.s);
        return Unit.a;
    }
}
