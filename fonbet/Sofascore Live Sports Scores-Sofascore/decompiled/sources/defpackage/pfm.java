package defpackage;

import defpackage.gim;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class pfm extends hoi implements Function2 {
    public final /* synthetic */ ilm r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pfm(ilm ilmVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = ilmVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new pfm(this.r, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new pfm(this.r, (rq3) obj2).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        ilm ilmVar = this.r;
        ilmVar.getClass();
        int F = ilmVar.F();
        n4m D = ilmVar.D();
        if ((D != null ? D.b : null) instanceof gim.a) {
            ilmVar.x0.c(F);
        }
        return Unit.a;
    }
}
