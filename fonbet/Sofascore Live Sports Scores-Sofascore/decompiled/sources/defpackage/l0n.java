package defpackage;

import com.blaze.blazesdk.ads.models.ui.BlazeContentExtraInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class l0n extends hoi implements Function1 {
    public final /* synthetic */ pxm r;
    public final /* synthetic */ BlazeContentExtraInfo s;
    public final /* synthetic */ Function1 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0n(pxm pxmVar, BlazeContentExtraInfo blazeContentExtraInfo, Function1 function1, rq3 rq3Var) {
        super(1, rq3Var);
        this.r = pxmVar;
        this.s = blazeContentExtraInfo;
        this.t = function1;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        return new l0n(this.r, this.s, this.t, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((l0n) create((rq3) obj)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        pxm pxmVar = this.r;
        if (!Intrinsics.c(pxmVar.c, ywm.a)) {
            return Unit.a;
        }
        pxmVar.c = jym.a;
        pxmVar.b.invoke(this.s, new bcl(22, pxmVar, this.t));
        return Unit.a;
    }
}
