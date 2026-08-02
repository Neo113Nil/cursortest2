package u0;

import android.os.Build;
import android.view.View;
import androidx.core.view.C5336p0;
import androidx.core.view.C5353y0;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* renamed from: u0.o, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class RunnableC9906o extends C5336p0.b implements Runnable, androidx.core.view.D, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final M f99668a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f99669b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f99670c;

    /* renamed from: d, reason: collision with root package name */
    private C5353y0 f99671d;

    public RunnableC9906o(@NotNull M m11) {
        super(!m11.c() ? 1 : 0);
        this.f99668a = m11;
    }

    @Override // androidx.core.view.D
    @NotNull
    public final C5353y0 onApplyWindowInsets(@NotNull View view, @NotNull C5353y0 c5353y0) {
        this.f99671d = c5353y0;
        M m11 = this.f99668a;
        m11.m(c5353y0);
        if (this.f99669b) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.f99670c) {
            m11.l(c5353y0);
            M.k(m11, c5353y0);
        }
        return m11.c() ? C5353y0.f42353b : c5353y0;
    }

    @Override // androidx.core.view.C5336p0.b
    public final void onEnd(@NotNull C5336p0 c5336p0) {
        this.f99669b = false;
        this.f99670c = false;
        C5353y0 c5353y0 = this.f99671d;
        if (c5336p0.a() != 0 && c5353y0 != null) {
            M m11 = this.f99668a;
            m11.l(c5353y0);
            m11.m(c5353y0);
            M.k(m11, c5353y0);
        }
        this.f99671d = null;
        super.onEnd(c5336p0);
    }

    @Override // androidx.core.view.C5336p0.b
    public final void onPrepare(@NotNull C5336p0 c5336p0) {
        this.f99669b = true;
        this.f99670c = true;
        super.onPrepare(c5336p0);
    }

    @Override // androidx.core.view.C5336p0.b
    @NotNull
    public final C5353y0 onProgress(@NotNull C5353y0 c5353y0, @NotNull List<C5336p0> list) {
        M m11 = this.f99668a;
        M.k(m11, c5353y0);
        return m11.c() ? C5353y0.f42353b : c5353y0;
    }

    @Override // androidx.core.view.C5336p0.b
    @NotNull
    public final C5336p0.a onStart(@NotNull C5336p0 c5336p0, @NotNull C5336p0.a aVar) {
        this.f99669b = false;
        return super.onStart(c5336p0, aVar);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(@NotNull View view) {
        view.requestApplyInsets();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(@NotNull View view) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f99669b) {
            this.f99669b = false;
            this.f99670c = false;
            C5353y0 c5353y0 = this.f99671d;
            if (c5353y0 != null) {
                M m11 = this.f99668a;
                m11.l(c5353y0);
                M.k(m11, c5353y0);
                this.f99671d = null;
            }
        }
    }
}
