package defpackage;

import android.graphics.drawable.Drawable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class b70 extends hoi implements Function2 {
    public final /* synthetic */ Drawable r;
    public final /* synthetic */ Function0 s;
    public final /* synthetic */ Function0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b70(Drawable drawable, Function0 function0, Function0 function02, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = drawable;
        this.s = function0;
        this.t = function02;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new b70(this.r, this.s, this.t, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b70) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        a70.e(this.r).registerAnimationCallback(new xik(this.s, this.t));
        return Unit.a;
    }
}
