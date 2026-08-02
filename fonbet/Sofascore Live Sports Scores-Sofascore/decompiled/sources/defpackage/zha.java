package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class zha extends hoi implements Function2 {
    public int r;
    public final /* synthetic */ syl s;
    public final /* synthetic */ fqm t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zha(syl sylVar, fqm fqmVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.s = sylVar;
        this.t = fqmVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new zha(this.s, this.t, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new zha(this.s, this.t, (rq3) obj2).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        mpm mpmVar;
        lu3 lu3Var = lu3.a;
        int i = this.r;
        if (i == 0) {
            y6a.M(obj);
            syl sylVar = this.s;
            udm udmVar = sylVar.q;
            if (sylVar.H() && (mpmVar = sylVar.t) != null) {
                int currentItem = udmVar.j.getCurrentItem();
                this.r = 1;
                if (mpmVar.y(this.t, currentItem, this) == lu3Var) {
                    return lu3Var;
                }
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
