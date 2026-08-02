package ru.ozon.fintech.features.cbottomstories.presentation.views;

import B50.e;
import B50.f;
import De.C2862e;
import Sc.s;
import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.B0;
import xe.C10720e0;
import xe.C10727i;
import xe.H0;
import xe.M;
import xe.N;
import xe.Y;
import z50.C10989c;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/ozon/fintech/features/cbottomstories/presentation/views/LeftRightFrameLayout;", "Landroid/widget/FrameLayout;", "cbottom-stories_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LeftRightFrameLayout extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private Function0<Unit> f95396a;

    /* renamed from: b, reason: collision with root package name */
    private Function0<Unit> f95397b;

    /* renamed from: c, reason: collision with root package name */
    private e f95398c;

    /* renamed from: d, reason: collision with root package name */
    private f f95399d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C2862e f95400e;

    /* renamed from: f, reason: collision with root package name */
    private B0 f95401f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f95402g;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottomstories.presentation.views.LeftRightFrameLayout$onTouchEvent$1", f = "LeftRightFrameLayout.kt", l = {52}, m = "invokeSuspend")
    static final class a extends j implements Function2<M, d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f95403d;

        a(d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return LeftRightFrameLayout.this.new a(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f95403d;
            if (i11 == 0) {
                s.b(obj);
                this.f95403d = 1;
                if (Y.b(180L, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            LeftRightFrameLayout leftRightFrameLayout = LeftRightFrameLayout.this;
            leftRightFrameLayout.f95402g = true;
            Function0<Unit> b11 = leftRightFrameLayout.b();
            if (b11 != null) {
                ((e) b11).invoke();
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeftRightFrameLayout(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        C10720e0 c10720e0 = C10720e0.f105451a;
        this.f95400e = N.a(De.s.f6650a);
    }

    public final Function0<Unit> b() {
        return this.f95398c;
    }

    public final void c(Function0<Unit> function0) {
        this.f95396a = function0;
    }

    public final void d(e eVar) {
        this.f95398c = eVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C10989c.a("LeftRightFrameLayout", "LeftRightFrameLayout " + getTag() + " dispatchTouchEvent ev?.action=" + (motionEvent != null ? Integer.valueOf(motionEvent.getAction()) : null) + " ");
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e(f fVar) {
        this.f95399d = fVar;
    }

    public final void f(Function0<Unit> function0) {
        this.f95397b = function0;
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C10989c.a("LeftRightFrameLayout", "LeftRightFrameLayout onTouchEvent event?.action=" + (motionEvent != null ? Integer.valueOf(motionEvent.getAction()) : null) + " ");
        if (motionEvent != null && motionEvent.getAction() == 0) {
            B0 b02 = this.f95401f;
            if (b02 != null) {
                ((H0) b02).j(null);
            }
            this.f95401f = C10727i.c(this.f95400e, null, null, new a(null), 3);
        }
        if (motionEvent != null && motionEvent.getAction() == 1) {
            B0 b03 = this.f95401f;
            if (b03 != null) {
                ((H0) b03).j(null);
            }
            if (this.f95402g) {
                this.f95402g = false;
                f fVar = this.f95399d;
                if (fVar != null) {
                    fVar.invoke();
                    return true;
                }
            } else {
                if (motionEvent.getX() > getWidth() / 2.0f) {
                    C10989c.a("LeftRightFrameLayout", "LeftRightFrameLayout onTouchEvent right");
                    Function0<Unit> function0 = this.f95397b;
                    if (function0 != null) {
                        function0.invoke();
                        return true;
                    }
                } else {
                    C10989c.a("LeftRightFrameLayout", "LeftRightFrameLayout onTouchEvent left");
                    Function0<Unit> function02 = this.f95396a;
                    if (function02 != null) {
                        function02.invoke();
                    }
                }
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z11) {
        C10989c.a("LeftRightFrameLayout", "LeftRightFrameLayout  " + getTag() + " requestDisallowInterceptTouchEvent");
        super.requestDisallowInterceptTouchEvent(z11);
    }
}
