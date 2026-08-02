package n0;

import android.graphics.Canvas;
import android.widget.EdgeEffect;
import androidx.compose.ui.platform.AbstractC5245f1;
import androidx.compose.ui.platform.C5242e1;
import hd.C6915b;
import i1.InterfaceC6991k;
import k1.C7459e;
import k1.C7464j;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import l1.C7845v;
import n1.InterfaceC8410c;
import org.jetbrains.annotations.NotNull;
import u0.C9915y;

/* renamed from: n0.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C8396q extends AbstractC5245f1 implements InterfaceC6991k {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C8380a f76215b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C8399t f76216c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C8379U f76217d;

    public C8396q(@NotNull C8380a c8380a, @NotNull C8399t c8399t, @NotNull C8379U c8379u, @NotNull Function1<? super C5242e1, Unit> function1) {
        super(function1);
        this.f76215b = c8380a;
        this.f76216c = c8399t;
        this.f76217d = c8379u;
    }

    private static boolean a(float f7, long j11, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(f7);
        canvas.translate(C7459e.g(j11), C7459e.h(j11));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    @Override // i1.InterfaceC6991k
    public final void draw(@NotNull InterfaceC8410c interfaceC8410c) {
        D1.J j11 = (D1.J) interfaceC8410c;
        long i11 = j11.i();
        C8380a c8380a = this.f76215b;
        c8380a.p(i11);
        if (C7464j.g(j11.i())) {
            j11.F0();
            return;
        }
        j11.F0();
        c8380a.j().getValue();
        Canvas b11 = C7845v.b(j11.w0().a());
        C8399t c8399t = this.f76216c;
        boolean q11 = c8399t.q();
        C8379U c8379u = this.f76217d;
        boolean a11 = q11 ? a(270.0f, P9.a.a(-C7464j.d(j11.i()), j11.v1(((C9915y) c8379u.a()).b(j11.getLayoutDirection()))), c8399t.h(), b11) : false;
        if (c8399t.x()) {
            a11 = a(0.0f, P9.a.a(0.0f, j11.v1(((C9915y) c8379u.a()).d())), c8399t.l(), b11) || a11;
        }
        if (c8399t.t()) {
            a11 = a(90.0f, P9.a.a(0.0f, j11.v1(((C9915y) c8379u.a()).c(j11.getLayoutDirection())) + (-((float) C6915b.c(C7464j.f(j11.i()))))), c8399t.j(), b11) || a11;
        }
        if (c8399t.n()) {
            a11 = a(180.0f, P9.a.a(-C7464j.f(j11.i()), (-C7464j.d(j11.i())) + j11.v1(((C9915y) c8379u.a()).a())), c8399t.f(), b11) || a11;
        }
        if (a11) {
            c8380a.k();
        }
    }
}
