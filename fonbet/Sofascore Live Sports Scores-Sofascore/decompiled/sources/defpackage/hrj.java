package defpackage;

import com.sofascore.model.mvvm.model.UniqueTournament;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class hrj extends hoi implements Function1 {
    public int r;
    public final /* synthetic */ irj s;
    public final /* synthetic */ UniqueTournament t;
    public final /* synthetic */ boolean u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hrj(irj irjVar, UniqueTournament uniqueTournament, boolean z, rq3 rq3Var) {
        super(1, rq3Var);
        this.s = irjVar;
        this.t = uniqueTournament;
        this.u = z;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        return new hrj(this.s, this.t, this.u, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((hrj) create((rq3) obj)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.r;
        if (i == 0) {
            y6a.M(obj);
            this.r = 1;
            Object c = irj.c(this.s, this.t, this.u, this);
            return c == lu3Var ? lu3Var : c;
        }
        if (i == 1) {
            y6a.M(obj);
            return obj;
        }
        a70.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
