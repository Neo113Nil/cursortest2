package com.unity3d.ads.core.domain;

import defpackage.a70;
import defpackage.hoi;
import defpackage.il4;
import defpackage.kea;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.w2g;
import defpackage.y6a;
import defpackage.zu4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lw2g;", "", "it", "<anonymous>", "(Lw2g;)V"}, k = 3, mv = {2, 1, 0})
@il4(c = "com.unity3d.ads.core.domain.AndroidAdRefresh$invoke$3$1$1$2", f = "AndroidAdRefresh.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class AndroidAdRefresh$invoke$3$1$1$2 extends hoi implements Function2<w2g, rq3<? super Unit>, Object> {
    final /* synthetic */ zu4 $showing;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidAdRefresh$invoke$3$1$1$2(zu4 zu4Var, rq3<? super AndroidAdRefresh$invoke$3$1$1$2> rq3Var) {
        super(2, rq3Var);
        this.$showing = zu4Var;
    }

    @Override // defpackage.h21
    public final rq3<Unit> create(Object obj, rq3<?> rq3Var) {
        return new AndroidAdRefresh$invoke$3$1$1$2(this.$showing, rq3Var);
    }

    public final Object invoke(Object obj, rq3<? super Unit> rq3Var) {
        return ((AndroidAdRefresh$invoke$3$1$1$2) create(new w2g(obj), rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        if (this.label != 0) {
            a70.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        y6a.M(obj);
        ((kea) this.$showing).e(null);
        return Unit.a;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((w2g) obj).a, (rq3<? super Unit>) obj2);
    }
}
