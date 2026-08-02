package defpackage;

import defpackage.w3m;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class jcm extends hoi implements Function1 {
    public final /* synthetic */ w3m r;
    public final /* synthetic */ w3m.a.C1357a s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jcm(w3m w3mVar, w3m.a.C1357a c1357a, rq3 rq3Var) {
        super(1, rq3Var);
        this.r = w3mVar;
        this.s = c1357a;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        return new jcm(this.r, this.s, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new jcm(this.r, this.s, (rq3) obj).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        Object value;
        boolean z;
        boolean j0;
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        w3m w3mVar = this.r;
        fdi fdiVar = w3mVar.H0;
        do {
            value = fdiVar.getValue();
            z = this.s.a;
            j0 = w3m.j0(w3mVar);
            ((wpm) value).getClass();
        } while (!fdiVar.k(value, new wpm(false, z, j0)));
        return Unit.a;
    }
}
