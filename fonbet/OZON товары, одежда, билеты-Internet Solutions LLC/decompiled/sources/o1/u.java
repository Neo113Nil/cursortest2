package o1;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import k1.C7465k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import l1.C7803V;
import l1.C7844u;
import l1.InterfaceC7802U;
import n1.C8408a;
import n1.C8411d;
import n1.InterfaceC8412e;
import o1.e;
import org.jetbrains.annotations.NotNull;
import p1.C8830a;

/* loaded from: classes8.dex */
public final class u extends View {

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private static final a f77595j = new a();

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C7803V f77596a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C8408a f77597b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f77598c;

    /* renamed from: d, reason: collision with root package name */
    private Outline f77599d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f77600e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private Z1.d f77601f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private Z1.s f77602g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private AbstractC7737t f77603h;

    /* renamed from: i, reason: collision with root package name */
    private d f77604i;

    public static final class a extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, @NotNull Outline outline) {
            Outline outline2;
            if (!(view instanceof u) || (outline2 = ((u) view).f77599d) == null) {
                return;
            }
            outline.set(outline2);
        }
    }

    public u(@NotNull C8830a c8830a, @NotNull C7803V c7803v, @NotNull C8408a c8408a) {
        super(c8830a.getContext());
        this.f77596a = c7803v;
        this.f77597b = c8408a;
        setOutlineProvider(f77595j);
        this.f77600e = true;
        this.f77601f = C8411d.a();
        this.f77602g = Z1.s.Ltr;
        e.f77505a.getClass();
        this.f77603h = (AbstractC7737t) e.a.a();
        setWillNotDraw(false);
        setClipBounds(null);
    }

    public final void b(boolean z11) {
        if (this.f77600e != z11) {
            this.f77600e = z11;
            invalidate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(@NotNull Z1.d dVar, @NotNull Z1.s sVar, d dVar2, @NotNull Function1<? super InterfaceC8412e, Unit> function1) {
        this.f77601f = dVar;
        this.f77602g = sVar;
        this.f77603h = (AbstractC7737t) function1;
        this.f77604i = dVar2;
    }

    public final void d(Outline outline) {
        this.f77599d = outline;
        invalidateOutline();
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
    @Override // android.view.View
    protected final void dispatchDraw(@NotNull Canvas canvas) {
        C7803V c7803v = this.f77596a;
        Canvas v11 = c7803v.a().v();
        c7803v.a().w(canvas);
        C7844u a11 = c7803v.a();
        Z1.d dVar = this.f77601f;
        Z1.s sVar = this.f77602g;
        long a12 = C7465k.a(getWidth(), getHeight());
        d dVar2 = this.f77604i;
        ?? r92 = this.f77603h;
        C8408a c8408a = this.f77597b;
        Z1.d b11 = c8408a.w0().b();
        Z1.s d11 = c8408a.w0().d();
        InterfaceC7802U a13 = c8408a.w0().a();
        long e11 = c8408a.w0().e();
        d c11 = c8408a.w0().c();
        C8408a.b w02 = c8408a.w0();
        w02.h(dVar);
        w02.j(sVar);
        w02.g(a11);
        w02.k(a12);
        w02.i(dVar2);
        a11.save();
        try {
            r92.invoke(c8408a);
            a11.p();
            C8408a.b w03 = c8408a.w0();
            w03.h(b11);
            w03.j(d11);
            w03.g(a13);
            w03.k(e11);
            w03.i(c11);
            c7803v.a().w(v11);
            this.f77598c = false;
        } catch (Throwable th2) {
            a11.p();
            C8408a.b w04 = c8408a.w0();
            w04.h(b11);
            w04.j(d11);
            w04.g(a13);
            w04.k(e11);
            w04.i(c11);
            throw th2;
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.f77600e;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.f77598c) {
            return;
        }
        this.f77598c = true;
        super.invalidate();
    }

    @Override // android.view.View
    protected final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
    }
}
