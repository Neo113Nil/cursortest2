package h1;

import Z1.s;
import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;
import k1.C7464j;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import l1.C7844u;
import l1.C7845v;
import l1.InterfaceC7802U;
import n1.C8408a;
import n1.InterfaceC8412e;
import org.jetbrains.annotations.NotNull;

/* renamed from: h1.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C6768a extends View.DragShadowBuilder {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Z1.d f64591a;

    /* renamed from: b, reason: collision with root package name */
    private final long f64592b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function1<InterfaceC8412e, Unit> f64593c;

    public C6768a(Z1.d dVar, long j11, Function1 function1) {
        this.f64591a = dVar;
        this.f64592b = j11;
        this.f64593c = function1;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onDrawShadow(@NotNull Canvas canvas) {
        C8408a c8408a = new C8408a();
        s sVar = s.Ltr;
        int i11 = C7845v.f72284b;
        C7844u c7844u = new C7844u();
        c7844u.w(canvas);
        C8408a.C1285a t2 = c8408a.t();
        Z1.d a11 = t2.a();
        s b11 = t2.b();
        InterfaceC7802U c11 = t2.c();
        long d11 = t2.d();
        C8408a.C1285a t11 = c8408a.t();
        t11.j(this.f64591a);
        t11.k(sVar);
        t11.i(c7844u);
        t11.l(this.f64592b);
        c7844u.save();
        this.f64593c.invoke(c8408a);
        c7844u.p();
        C8408a.C1285a t12 = c8408a.t();
        t12.j(a11);
        t12.k(b11);
        t12.i(c11);
        t12.l(d11);
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onProvideShadowMetrics(@NotNull Point point, @NotNull Point point2) {
        long j11 = this.f64592b;
        float f7 = C7464j.f(j11);
        Z1.d dVar = this.f64591a;
        point.set(dVar.Y0(dVar.C(f7)), dVar.Y0(dVar.C(C7464j.d(j11))));
        point2.set(point.x / 2, point.y / 2);
    }
}
