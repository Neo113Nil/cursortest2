package com.swmansion.rnscreens;

import android.app.Activity;
import android.view.View;
import android.view.ViewParent;
import androidx.core.view.AbstractC2082d0;
import androidx.core.view.C2111s0;
import androidx.core.view.F0;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.views.view.ReactViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ya.AbstractC6866a;

/* loaded from: classes4.dex */
public final class E extends ReactViewGroup {

    /* renamed from: j, reason: collision with root package name */
    public static final a f41632j = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final ReactContext f41633a;

    /* renamed from: b, reason: collision with root package name */
    public int f41634b;

    /* renamed from: c, reason: collision with root package name */
    public int f41635c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f41636d;

    /* renamed from: e, reason: collision with root package name */
    public float f41637e;

    /* renamed from: f, reason: collision with root package name */
    public int f41638f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f41639g;

    /* renamed from: h, reason: collision with root package name */
    public final c f41640h;

    /* renamed from: i, reason: collision with root package name */
    public b f41641i;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public static final class b extends BottomSheetBehavior.g {
        public b() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void b(View bottomSheet, float f10) {
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
            E.this.f41637e = Math.max(f10, 0.0f);
            if (E.this.f41636d) {
                return;
            }
            E e10 = E.this;
            int i10 = e10.f41634b;
            int reactHeight = E.this.getReactHeight();
            E e11 = E.this;
            e10.z(i10, reactHeight, e11.G(e11.f41637e), E.this.f41638f);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void c(View bottomSheet, int i10) {
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
            if (Lc.p.f7165a.b(i10)) {
                if (i10 == 3 || i10 == 4 || i10 == 6) {
                    E e10 = E.this;
                    e10.z(e10.f41634b, E.this.getReactHeight(), E.this.F(i10), E.this.f41638f);
                }
                E.this.f41635c = i10;
            }
        }
    }

    public static final class c extends C2111s0.b {
        public c() {
            super(0);
        }

        @Override // androidx.core.view.C2111s0.b
        public void onEnd(C2111s0 animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            E.this.f41636d = false;
        }

        @Override // androidx.core.view.C2111s0.b
        public F0 onProgress(F0 insets, List runningAnimations) {
            Intrinsics.checkNotNullParameter(insets, "insets");
            Intrinsics.checkNotNullParameter(runningAnimations, "runningAnimations");
            E.this.f41638f = insets.f(F0.p.b()).f19101d - insets.f(F0.p.e()).f19101d;
            E e10 = E.this;
            int i10 = e10.f41634b;
            int reactHeight = E.this.getReactHeight();
            E e11 = E.this;
            e10.z(i10, reactHeight, e11.G(e11.f41637e), E.this.f41638f);
            return insets;
        }

        @Override // androidx.core.view.C2111s0.b
        public C2111s0.a onStart(C2111s0 animation, C2111s0.a bounds) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            Intrinsics.checkNotNullParameter(bounds, "bounds");
            E.this.f41636d = true;
            C2111s0.a onStart = super.onStart(animation, bounds);
            Intrinsics.checkNotNullExpressionValue(onStart, "onStart(...)");
            return onStart;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(ReactContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.f41633a = reactContext;
        this.f41635c = 5;
        c cVar = new c();
        this.f41640h = cVar;
        Activity currentActivity = reactContext.getCurrentActivity();
        if (currentActivity == null) {
            throw new IllegalStateException("[RNScreens] Context detached from activity while creating ScreenFooter");
        }
        View decorView = currentActivity.getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        AbstractC2082d0.E0(decorView, cVar);
        this.f41641i = new b();
    }

    public static /* synthetic */ void A(E e10, int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 8) != 0) {
            i13 = 0;
        }
        e10.z(i10, i11, i12, i13);
    }

    private final boolean getHasReceivedInitialLayoutFromParent() {
        return this.f41634b > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getReactHeight() {
        return getMeasuredHeight();
    }

    private final int getReactWidth() {
        return getMeasuredWidth();
    }

    private final C3834z getScreenParent() {
        ViewParent parent = getParent();
        if (parent instanceof C3834z) {
            return (C3834z) parent;
        }
        return null;
    }

    private final BottomSheetBehavior<C3834z> getSheetBehavior() {
        return D().getSheetBehavior();
    }

    public final void B(boolean z10, int i10, int i11, int i12, int i13, int i14) {
        this.f41634b = i14;
        A(this, i14, getReactHeight(), F(E().x0()), 0, 8, null);
    }

    public final void C(BottomSheetBehavior behavior) {
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        if (this.f41639g) {
            return;
        }
        behavior.c0(this.f41641i);
        this.f41639g = true;
    }

    public final C3834z D() {
        C3834z screenParent = getScreenParent();
        if (screenParent != null) {
            return screenParent;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final BottomSheetBehavior E() {
        BottomSheetBehavior<C3834z> sheetBehavior = getSheetBehavior();
        if (sheetBehavior != null) {
            return sheetBehavior;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final int F(int i10) {
        BottomSheetBehavior E10 = E();
        if (i10 == 3) {
            return E10.s0();
        }
        if (i10 == 4) {
            return this.f41634b - E10.w0();
        }
        if (i10 == 5) {
            return this.f41634b;
        }
        if (i10 == 6) {
            return (int) (this.f41634b * (1 - E10.t0()));
        }
        throw new IllegalArgumentException("[RNScreens] use of stable-state method for unstable state");
    }

    public final int G(float f10) {
        C3834z screenParent = getScreenParent();
        return screenParent != null ? screenParent.getTop() : (int) AbstractC6866a.c(F(4), F(3), f10);
    }

    public final void H(BottomSheetBehavior behavior) {
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        if (this.f41639g) {
            behavior.J0(this.f41641i);
            this.f41639g = false;
        }
    }

    @NotNull
    public final ReactContext getReactContext() {
        return this.f41633a;
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        BottomSheetBehavior<C3834z> sheetBehavior = getSheetBehavior();
        if (sheetBehavior != null) {
            C(sheetBehavior);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        BottomSheetBehavior<C3834z> sheetBehavior = getSheetBehavior();
        if (sheetBehavior != null) {
            H(sheetBehavior);
        }
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (getHasReceivedInitialLayoutFromParent()) {
            z(this.f41634b, i13 - i11, F(E().x0()), this.f41638f);
        }
    }

    public final void z(int i10, int i11, int i12, int i13) {
        int max = ((i10 - i11) - i12) - Math.max(i13, 0);
        int reactHeight = getReactHeight();
        setTop(Math.max(max, 0));
        setBottom(getTop() + reactHeight);
    }
}
