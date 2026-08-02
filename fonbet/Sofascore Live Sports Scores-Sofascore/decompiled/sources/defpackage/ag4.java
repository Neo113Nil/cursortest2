package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class ag4 extends hoi implements Function2 {
    public /* synthetic */ Object r;
    public final /* synthetic */ String s;
    public final /* synthetic */ long t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag4(long j, String str, rq3 rq3Var) {
        super(2, rq3Var);
        this.s = str;
        this.t = j;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        ag4 ag4Var = new ag4(this.t, this.s, rq3Var);
        ag4Var.r = obj;
        return ag4Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ag4) create((p0d) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        p0d p0dVar = (p0d) this.r;
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        e5f e5fVar = new e5f(this.s);
        Long l = new Long(this.t);
        p0dVar.getClass();
        p0dVar.f(e5fVar, l);
        return Unit.a;
    }
}
