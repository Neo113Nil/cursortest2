package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class zsc extends hoi implements ct8 {
    public /* synthetic */ float r;
    public final /* synthetic */ Function1 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zsc(Function1 function1, rq3 rq3Var) {
        super(3, rq3Var);
        this.s = function1;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        float floatValue = ((Number) obj2).floatValue();
        zsc zscVar = new zsc(this.s, (rq3) obj3);
        zscVar.r = floatValue;
        return zscVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        this.s.invoke(new Float(this.r));
        return Unit.a;
    }
}
