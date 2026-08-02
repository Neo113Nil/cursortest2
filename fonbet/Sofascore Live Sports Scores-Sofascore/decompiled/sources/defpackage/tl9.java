package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class tl9 extends hoi implements Function2 {
    public final /* synthetic */ syl r;
    public final /* synthetic */ boolean s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tl9(syl sylVar, boolean z, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = sylVar;
        this.s = z;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new tl9(this.r, this.s, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new tl9(this.r, this.s, (rq3) obj2).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        syl sylVar = this.r;
        udm udmVar = sylVar.q;
        if (sylVar.H()) {
            sylVar.F(this.s);
        }
        return Unit.a;
    }
}
