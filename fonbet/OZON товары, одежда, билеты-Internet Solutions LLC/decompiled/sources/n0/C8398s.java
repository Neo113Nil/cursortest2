package n0;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.compose.ui.platform.AbstractC5245f1;
import androidx.compose.ui.platform.C5242e1;
import hd.C6915b;
import i1.InterfaceC6991k;
import k1.C7459e;
import k1.C7464j;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import l1.C7844u;
import l1.C7845v;
import l1.InterfaceC7802U;
import n1.C8408a;
import n1.InterfaceC8410c;
import org.jetbrains.annotations.NotNull;

/* renamed from: n0.s, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C8398s extends AbstractC5245f1 implements InterfaceC6991k {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C8380a f76218b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C8399t f76219c;

    /* renamed from: d, reason: collision with root package name */
    private RenderNode f76220d;

    public C8398s(@NotNull C8380a c8380a, @NotNull C8399t c8399t, @NotNull Function1<? super C5242e1, Unit> function1) {
        super(function1);
        this.f76218b = c8380a;
        this.f76219c = c8399t;
    }

    private static boolean a(float f7, EdgeEffect edgeEffect, Canvas canvas) {
        if (f7 == 0.0f) {
            return edgeEffect.draw(canvas);
        }
        int save = canvas.save();
        canvas.rotate(f7);
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    private final RenderNode b() {
        RenderNode renderNode = this.f76220d;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode b11 = GI.b.b();
        this.f76220d = b11;
        return b11;
    }

    @Override // i1.InterfaceC6991k
    public final void draw(@NotNull InterfaceC8410c interfaceC8410c) {
        RecordingCanvas beginRecording;
        boolean z11;
        float f7;
        float f11;
        D1.J j11 = (D1.J) interfaceC8410c;
        long i11 = j11.i();
        C8380a c8380a = this.f76218b;
        c8380a.p(i11);
        if (C7464j.g(j11.i())) {
            j11.F0();
            return;
        }
        c8380a.j().getValue();
        float v12 = j11.v1(C8395p.b());
        Canvas b11 = C7845v.b(j11.w0().a());
        C8399t c8399t = this.f76219c;
        boolean z12 = c8399t.x() || c8399t.y() || c8399t.n() || c8399t.o();
        boolean z13 = c8399t.q() || c8399t.r() || c8399t.t() || c8399t.u();
        if (z12 && z13) {
            b().setPosition(0, 0, b11.getWidth(), b11.getHeight());
        } else if (z12) {
            b().setPosition(0, 0, (C6915b.c(v12) * 2) + b11.getWidth(), b11.getHeight());
        } else {
            if (!z13) {
                j11.F0();
                return;
            }
            b().setPosition(0, 0, b11.getWidth(), (C6915b.c(v12) * 2) + b11.getHeight());
        }
        beginRecording = b().beginRecording();
        if (c8399t.r()) {
            EdgeEffect i12 = c8399t.i();
            a(90.0f, i12, beginRecording);
            i12.finish();
        }
        boolean q11 = c8399t.q();
        C8381b c8381b = C8381b.f76147a;
        if (q11) {
            EdgeEffect h11 = c8399t.h();
            z11 = a(270.0f, h11, beginRecording);
            if (c8399t.s()) {
                float h12 = C7459e.h(c8380a.i());
                EdgeEffect i13 = c8399t.i();
                int i14 = Build.VERSION.SDK_INT;
                float b12 = i14 >= 31 ? c8381b.b(h11) : 0.0f;
                float f12 = 1 - h12;
                if (i14 >= 31) {
                    c8381b.c(i13, b12, f12);
                } else {
                    i13.onPull(b12, f12);
                }
            }
        } else {
            z11 = false;
        }
        if (c8399t.y()) {
            EdgeEffect m11 = c8399t.m();
            a(180.0f, m11, beginRecording);
            m11.finish();
        }
        if (c8399t.x()) {
            EdgeEffect l11 = c8399t.l();
            z11 = a(0.0f, l11, beginRecording) || z11;
            if (c8399t.z()) {
                float g10 = C7459e.g(c8380a.i());
                EdgeEffect m12 = c8399t.m();
                int i15 = Build.VERSION.SDK_INT;
                float b13 = i15 >= 31 ? c8381b.b(l11) : 0.0f;
                if (i15 >= 31) {
                    c8381b.c(m12, b13, g10);
                } else {
                    m12.onPull(b13, g10);
                }
            }
        }
        if (c8399t.u()) {
            EdgeEffect k11 = c8399t.k();
            a(270.0f, k11, beginRecording);
            k11.finish();
        }
        if (c8399t.t()) {
            EdgeEffect j12 = c8399t.j();
            z11 = a(90.0f, j12, beginRecording) || z11;
            if (c8399t.v()) {
                float h13 = C7459e.h(c8380a.i());
                EdgeEffect k12 = c8399t.k();
                int i16 = Build.VERSION.SDK_INT;
                float b14 = i16 >= 31 ? c8381b.b(j12) : 0.0f;
                if (i16 >= 31) {
                    c8381b.c(k12, b14, h13);
                } else {
                    k12.onPull(b14, h13);
                }
            }
        }
        if (c8399t.o()) {
            EdgeEffect g11 = c8399t.g();
            a(0.0f, g11, beginRecording);
            g11.finish();
        }
        if (c8399t.n()) {
            EdgeEffect f13 = c8399t.f();
            boolean z14 = a(180.0f, f13, beginRecording) || z11;
            if (c8399t.p()) {
                float g12 = C7459e.g(c8380a.i());
                EdgeEffect g13 = c8399t.g();
                int i17 = Build.VERSION.SDK_INT;
                float b15 = i17 >= 31 ? c8381b.b(f13) : 0.0f;
                float f14 = 1 - g12;
                if (i17 >= 31) {
                    c8381b.c(g13, b15, f14);
                } else {
                    g13.onPull(b15, f14);
                }
            }
            z11 = z14;
        }
        if (z11) {
            c8380a.k();
        }
        float f15 = z13 ? 0.0f : v12;
        if (z12) {
            v12 = 0.0f;
        }
        Z1.s layoutDirection = j11.getLayoutDirection();
        C7844u c7844u = new C7844u();
        c7844u.w(beginRecording);
        long i18 = j11.i();
        Z1.d b16 = j11.w0().b();
        Z1.s d11 = j11.w0().d();
        InterfaceC7802U a11 = j11.w0().a();
        long e11 = j11.w0().e();
        o1.d c11 = j11.w0().c();
        C8408a.b w02 = j11.w0();
        w02.h(interfaceC8410c);
        w02.j(layoutDirection);
        w02.g(c7844u);
        w02.k(i18);
        w02.i(null);
        c7844u.save();
        try {
            j11.w0().f().g(f15, v12);
            try {
                j11.F0();
                c7844u.p();
                C8408a.b w03 = j11.w0();
                w03.h(b16);
                w03.j(d11);
                w03.g(a11);
                w03.k(e11);
                w03.i(c11);
                b().endRecording();
                int save = b11.save();
                b11.translate(f7, f11);
                b11.drawRenderNode(b());
                b11.restoreToCount(save);
            } finally {
                j11.w0().f().g(-f15, -v12);
            }
        } catch (Throwable th2) {
            c7844u.p();
            C8408a.b w04 = j11.w0();
            w04.h(b16);
            w04.j(d11);
            w04.g(a11);
            w04.k(e11);
            w04.i(c11);
            throw th2;
        }
    }
}
