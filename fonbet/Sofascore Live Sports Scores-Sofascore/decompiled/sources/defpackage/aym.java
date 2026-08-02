package defpackage;

import defpackage.w3m;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class aym extends hoi implements Function1 {
    public final /* synthetic */ w3m r;
    public final /* synthetic */ w3m.a s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aym(w3m w3mVar, w3m.a aVar, rq3 rq3Var) {
        super(1, rq3Var);
        this.r = w3mVar;
        this.s = aVar;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        return new aym(this.r, this.s, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new aym(this.r, this.s, (rq3) obj).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        w3m w3mVar = this.r;
        yda ydaVar = w3mVar.M0;
        if (ydaVar != null) {
            ydaVar.e(null);
        }
        if (w3mVar.L()) {
            w3m.a.C1357a c1357a = new w3m.a.C1357a(false);
            yda ydaVar2 = w3mVar.M0;
            if (ydaVar2 != null) {
                ydaVar2.e(null);
            }
            w3mVar.M0 = x5m.safeViewModelScopeIO$default(w3mVar, null, new jcm(w3mVar, c1357a, null), 1, null);
            return Unit.a;
        }
        w3m.a aVar = this.s;
        if (aVar instanceof w3m.a.C1357a) {
            w3m.a.C1357a c1357a2 = (w3m.a.C1357a) aVar;
            yda ydaVar3 = w3mVar.M0;
            if (ydaVar3 != null) {
                ydaVar3.e(null);
            }
            w3mVar.M0 = x5m.safeViewModelScopeIO$default(w3mVar, null, new jcm(w3mVar, c1357a2, null), 1, null);
        } else if (aVar instanceof w3m.a.b) {
            x5m.safeViewModelScopeMain$default(w3mVar, null, new gvm(w3mVar, ((w3m.a.b) aVar).a, null), 1, null);
        } else {
            if (!(aVar instanceof b7m)) {
                zzl.b();
                return null;
            }
            yda ydaVar4 = w3mVar.M0;
            if (ydaVar4 != null) {
                ydaVar4.e(null);
            }
            w3mVar.M0 = x5m.safeViewModelScopeIO$default(w3mVar, null, new jum(w3mVar, null), 1, null);
        }
        return Unit.a;
    }
}
