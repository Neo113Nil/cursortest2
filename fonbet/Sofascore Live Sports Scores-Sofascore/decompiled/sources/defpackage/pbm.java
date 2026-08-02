package defpackage;

import com.blaze.blazesdk.features.videos.players.ui.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class pbm extends hoi implements Function1 {
    public int r;
    public final /* synthetic */ a s;
    public final /* synthetic */ fqm t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pbm(a aVar, fqm fqmVar, rq3 rq3Var) {
        super(1, rq3Var);
        this.s = aVar;
        this.t = fqmVar;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        return new pbm(this.s, this.t, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new pbm(this.s, this.t, (rq3) obj).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.r;
        if (i == 0) {
            y6a.M(obj);
            e6b e6bVar = e6b.e;
            fqm fqmVar = this.t;
            a aVar = this.s;
            z8m z8mVar = new z8m(aVar, fqmVar, null);
            this.r = 1;
            int i2 = a.I;
            if (aVar.b(e6bVar, z8mVar, this) == lu3Var) {
                return lu3Var;
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
