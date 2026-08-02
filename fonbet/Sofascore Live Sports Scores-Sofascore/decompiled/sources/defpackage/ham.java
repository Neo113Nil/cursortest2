package defpackage;

import com.blaze.blazesdk.players.inline.BlazeBaseInlinePlayerContainer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ham extends hoi implements ct8 {
    public /* synthetic */ ku3 r;
    public /* synthetic */ rum s;
    public final /* synthetic */ BlazeBaseInlinePlayerContainer t;
    public final /* synthetic */ Function0 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ham(BlazeBaseInlinePlayerContainer blazeBaseInlinePlayerContainer, Function0 function0, rq3 rq3Var) {
        super(3, rq3Var);
        this.t = blazeBaseInlinePlayerContainer;
        this.u = function0;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ham hamVar = new ham(this.t, this.u, (rq3) obj3);
        hamVar.r = (ku3) obj;
        hamVar.s = (rum) obj2;
        return hamVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        ku3 ku3Var = this.r;
        rum rumVar = this.s;
        s9a.t(ku3Var);
        BlazeBaseInlinePlayerContainer.access$routePlaceholderEmbeddingByState(this.t, rumVar, this.u, ku3Var);
        return Unit.a;
    }
}
