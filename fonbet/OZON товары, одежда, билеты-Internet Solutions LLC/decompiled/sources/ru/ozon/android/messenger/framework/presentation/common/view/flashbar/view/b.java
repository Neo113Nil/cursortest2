package ru.ozon.android.messenger.framework.presentation.common.view.flashbar.view;

import B90.t0;
import B90.u0;
import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.presentation.common.view.flashbar.animation.b;
import ru.ozon.android.messenger.framework.presentation.common.view.flashbar.view.d;

/* loaded from: classes10.dex */
public final class b extends FrameLayout implements d.a {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f91178i = 0;

    /* renamed from: a, reason: collision with root package name */
    private ru.ozon.android.messenger.framework.presentation.common.view.flashbar.view.c f91179a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private ru.ozon.android.messenger.framework.presentation.common.view.flashbar.animation.a f91180b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private ru.ozon.android.messenger.framework.presentation.common.view.flashbar.animation.a f91181c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final t0 f91182d;

    /* renamed from: e, reason: collision with root package name */
    private long f91183e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f91184f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f91185g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f91186h;

    public static final class a implements b.a {
        a(ru.ozon.android.messenger.framework.presentation.common.view.flashbar.view.a aVar) {
        }

        @Override // ru.ozon.android.messenger.framework.presentation.common.view.flashbar.animation.b.a
        public final void onStart() {
            b.this.f91186h = true;
        }

        @Override // ru.ozon.android.messenger.framework.presentation.common.view.flashbar.animation.b.a
        public final void onStop() {
            b bVar = b.this;
            bVar.f91186h = false;
            bVar.f91185g = false;
            bVar.post(new u0(bVar, 3));
        }

        @Override // ru.ozon.android.messenger.framework.presentation.common.view.flashbar.animation.b.a
        public final void onUpdate() {
            b.this.getClass();
        }
    }

    /* renamed from: ru.ozon.android.messenger.framework.presentation.common.view.flashbar.view.b$b, reason: collision with other inner class name */
    public static final class ViewTreeObserverOnGlobalLayoutListenerC1703b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f91188a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f91189b;

        public ViewTreeObserverOnGlobalLayoutListenerC1703b(ViewGroup viewGroup, b bVar) {
            this.f91188a = viewGroup;
            this.f91189b = bVar;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            ViewGroup viewGroup = this.f91188a;
            if (viewGroup.getMeasuredWidth() <= 0 || viewGroup.getMeasuredHeight() <= 0) {
                return;
            }
            viewGroup.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            b bVar = this.f91189b;
            ru.ozon.android.messenger.framework.presentation.common.view.flashbar.animation.a aVar = bVar.f91180b;
            ru.ozon.android.messenger.framework.presentation.common.view.flashbar.view.c cVar = bVar.f91179a;
            if (cVar == null) {
                Intrinsics.n("flashbarView");
                throw null;
            }
            aVar.d(cVar);
            aVar.a().a(bVar.new c());
            bVar.j();
        }
    }

    public static final class c implements b.a {
        c() {
        }

        @Override // ru.ozon.android.messenger.framework.presentation.common.view.flashbar.animation.b.a
        public final void onStart() {
            b.this.f91184f = true;
        }

        @Override // ru.ozon.android.messenger.framework.presentation.common.view.flashbar.animation.b.a
        public final void onStop() {
            b bVar = b.this;
            bVar.f91184f = false;
            bVar.f91185g = true;
        }

        @Override // ru.ozon.android.messenger.framework.presentation.common.view.flashbar.animation.b.a
        public final void onUpdate() {
            int i11 = b.f91178i;
            b.this.getClass();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        ru.ozon.android.messenger.framework.presentation.common.view.flashbar.animation.a aVar = new ru.ozon.android.messenger.framework.presentation.common.view.flashbar.animation.a();
        aVar.b();
        this.f91180b = aVar;
        ru.ozon.android.messenger.framework.presentation.common.view.flashbar.animation.a aVar2 = new ru.ozon.android.messenger.framework.presentation.common.view.flashbar.animation.a();
        aVar2.c();
        this.f91181c = aVar2;
        this.f91182d = new t0(this, 5);
        this.f91183e = 10000L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j() {
        if (this.f91183e != -1) {
            t0 t0Var = this.f91182d;
            removeCallbacks(t0Var);
            postDelayed(t0Var, this.f91183e);
            this.f91183e = -1L;
        }
    }

    public final void g(@NotNull ru.ozon.android.messenger.framework.presentation.common.view.flashbar.view.c flashbarView) {
        Intrinsics.checkNotNullParameter(flashbarView, "flashbarView");
        this.f91179a = flashbarView;
    }

    public final void h(@NotNull ru.ozon.android.messenger.framework.presentation.common.view.flashbar.view.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (this.f91186h || this.f91184f || !this.f91185g) {
            return;
        }
        if (this.f91183e > 0) {
            j();
            return;
        }
        ru.ozon.android.messenger.framework.presentation.common.view.flashbar.view.c cVar = this.f91179a;
        if (cVar == null) {
            Intrinsics.n("flashbarView");
            throw null;
        }
        ru.ozon.android.messenger.framework.presentation.common.view.flashbar.animation.a aVar = this.f91181c;
        aVar.d(cVar);
        aVar.a().a(new a(event));
    }

    public final void i(boolean z11) {
        ru.ozon.android.messenger.framework.presentation.common.view.flashbar.view.c cVar = this.f91179a;
        if (cVar == null) {
            Intrinsics.n("flashbarView");
            throw null;
        }
        Intrinsics.checkNotNullParameter(this, "callbacks");
        if (z11) {
            cVar.setOnTouchListener(new d(cVar, this));
        }
    }

    public final boolean k() {
        return this.f91184f;
    }

    public final boolean l() {
        return this.f91185g;
    }

    public final void m(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewParent parent = getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(this);
        }
        this.f91185g = false;
        removeCallbacks(this.f91182d);
    }

    public final void n(boolean z11) {
        this.f91186h = z11;
    }

    public final void o(long j11) {
        this.f91183e = j11;
        j();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        this.f91184f = false;
        this.f91185g = false;
        this.f91186h = false;
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getAction() == 0) {
            Rect rect = new Rect();
            ru.ozon.android.messenger.framework.presentation.common.view.flashbar.view.c cVar = this.f91179a;
            if (cVar == null) {
                Intrinsics.n("flashbarView");
                throw null;
            }
            cVar.getHitRect(rect);
        }
        return super.onInterceptTouchEvent(event);
    }

    public final void p(@NotNull ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        if (this.f91184f || this.f91185g) {
            return;
        }
        if (getParent() == null) {
            viewGroup.addView(this);
        }
        viewGroup.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC1703b(viewGroup, this));
    }
}
