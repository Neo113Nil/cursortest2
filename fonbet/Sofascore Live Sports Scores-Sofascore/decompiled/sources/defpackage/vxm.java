package defpackage;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class vxm implements Function1 {
    public final /* synthetic */ lj2 a;

    public vxm(lj2 lj2Var) {
        this.a = lj2Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((View) obj).getClass();
        lj2 lj2Var = this.a;
        if (lj2Var.r() instanceof oed) {
            p2g p2gVar = w2g.b;
            lj2Var.resumeWith(Unit.a);
        }
        return Unit.a;
    }
}
