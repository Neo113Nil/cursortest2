package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class t11 implements Function1 {
    public final /* synthetic */ u11 a;
    public final /* synthetic */ lj2 b;
    public final /* synthetic */ View c;
    public final /* synthetic */ Rect d;
    public final /* synthetic */ Point e;

    public t11(u11 u11Var, lj2 lj2Var, View view, Rect rect, Point point) {
        this.a = u11Var;
        this.b = lj2Var;
        this.c = view;
        this.d = rect;
        this.e = point;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((Boolean) obj).getClass();
        if (!this.a.r) {
            lj2 lj2Var = this.b;
            if (lj2Var.r() instanceof oed) {
                View view = this.c;
                if (view.isAttachedToWindow() && view.getGlobalVisibleRect(this.d, this.e)) {
                    p2g p2gVar = w2g.b;
                    lj2Var.resumeWith(Unit.a);
                }
            }
        }
        return Unit.a;
    }
}
