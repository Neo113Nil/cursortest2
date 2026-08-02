package defpackage;

import com.blaze.blazesdk.features.videos.players.ui.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class l1n extends hoi implements Function1 {
    public final /* synthetic */ a r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1n(a aVar, rq3 rq3Var) {
        super(1, rq3Var);
        this.r = aVar;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        return new l1n(this.r, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new l1n(this.r, (rq3) obj).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        a aVar = this.r;
        dxm dxmVar = aVar.q;
        dsl dslVar = aVar.s;
        if (dslVar != null) {
            dslVar.b(true);
        }
        return Unit.a;
    }
}
