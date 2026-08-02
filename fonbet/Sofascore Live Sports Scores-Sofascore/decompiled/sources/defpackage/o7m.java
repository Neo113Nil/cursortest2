package defpackage;

import com.blaze.blazesdk.players.inline.BlazeBaseInlinePlayerContainer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class o7m extends hoi implements Function2 {
    public int r;
    public final /* synthetic */ BlazeBaseInlinePlayerContainer s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o7m(BlazeBaseInlinePlayerContainer blazeBaseInlinePlayerContainer, rq3 rq3Var) {
        super(2, rq3Var);
        this.s = blazeBaseInlinePlayerContainer;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new o7m(this.s, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new o7m(this.s, (rq3) obj2).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.r;
        if (i == 0) {
            y6a.M(obj);
            BlazeBaseInlinePlayerContainer blazeBaseInlinePlayerContainer = this.s;
            gx1 gx1Var = new gx1(blazeBaseInlinePlayerContainer, 5);
            this.r = 1;
            if (BlazeBaseInlinePlayerContainer.handleEmbeddingError$default(blazeBaseInlinePlayerContainer, null, gx1Var, false, this, 1, null) == lu3Var) {
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
