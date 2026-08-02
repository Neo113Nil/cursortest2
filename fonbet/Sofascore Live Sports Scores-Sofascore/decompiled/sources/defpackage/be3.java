package defpackage;

import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class be3 extends View.DragShadowBuilder {
    public final nx4 a;
    public final long b;
    public final Function1 c;

    public be3(nx4 nx4Var, long j, Function1 function1) {
        this.a = nx4Var;
        this.b = j;
        this.c = function1;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onDrawShadow(Canvas canvas) {
        wj2 wj2Var = new wj2();
        ema emaVar = ema.a;
        Canvas canvas2 = xx.a;
        wx wxVar = new wx();
        wxVar.a = canvas;
        vj2 vj2Var = wj2Var.a;
        kx4 kx4Var = vj2Var.a;
        ema emaVar2 = vj2Var.b;
        uj2 uj2Var = vj2Var.c;
        long j = vj2Var.d;
        vj2Var.a = this.a;
        vj2Var.b = emaVar;
        vj2Var.c = wxVar;
        vj2Var.d = this.b;
        wxVar.o();
        this.c.invoke(wj2Var);
        wxVar.h();
        vj2Var.a = kx4Var;
        vj2Var.b = emaVar2;
        vj2Var.c = uj2Var;
        vj2Var.d = j;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onProvideShadowMetrics(Point point, Point point2) {
        long j = this.b;
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        nx4 nx4Var = this.a;
        point.set(nx4Var.e0(intBitsToFloat / nx4Var.j()), nx4Var.e0(Float.intBitsToFloat((int) (j & 4294967295L)) / nx4Var.j()));
        point2.set(point.x / 2, point.y / 2);
    }
}
