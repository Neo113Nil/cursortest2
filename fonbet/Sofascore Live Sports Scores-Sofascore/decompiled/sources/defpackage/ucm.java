package defpackage;

import com.blaze.blazesdk.players.inline.BlazeBaseInlinePlayerContainer;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ucm extends hoi implements ct8 {
    public /* synthetic */ ku3 r;
    public /* synthetic */ rum s;
    public final /* synthetic */ BlazeBaseInlinePlayerContainer t;
    public final /* synthetic */ u6b u;
    public final /* synthetic */ ttk v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ucm(BlazeBaseInlinePlayerContainer blazeBaseInlinePlayerContainer, u6b u6bVar, ttk ttkVar, rq3 rq3Var) {
        super(3, rq3Var);
        this.t = blazeBaseInlinePlayerContainer;
        this.u = u6bVar;
        this.v = ttkVar;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        u6b u6bVar = this.u;
        ttk ttkVar = this.v;
        ucm ucmVar = new ucm(this.t, u6bVar, ttkVar, (rq3) obj3);
        ucmVar.r = (ku3) obj;
        ucmVar.s = (rum) obj2;
        return ucmVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        ku3 ku3Var = this.r;
        rum rumVar = this.s;
        s9a.t(ku3Var);
        BlazeBaseInlinePlayerContainer.access$routePlayerEmbeddingByState(this.t, rumVar, this.u, this.v);
        return Unit.a;
    }
}
