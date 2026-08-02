package com.swmansion.rnscreens;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.Choreographer;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.F0;
import com.facebook.react.modules.core.ReactChoreographer;
import com.facebook.react.uimanager.ThemedReactContext;
import dd.AbstractC4056c;
import dd.AbstractC4061h;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.swmansion.rnscreens.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3813d extends Toolbar {

    /* renamed from: T1, reason: collision with root package name */
    public boolean f41764T1;

    /* renamed from: V1, reason: collision with root package name */
    public boolean f41765V1;

    /* renamed from: b2, reason: collision with root package name */
    public boolean f41766b2;

    /* renamed from: g1, reason: collision with root package name */
    public final b0 f41767g1;

    /* renamed from: g2, reason: collision with root package name */
    public final Choreographer.FrameCallback f41768g2;

    /* renamed from: p1, reason: collision with root package name */
    public final boolean f41769p1;

    /* renamed from: x1, reason: collision with root package name */
    public final boolean f41770x1;

    /* renamed from: y1, reason: collision with root package name */
    public androidx.core.graphics.e f41771y1;

    /* renamed from: com.swmansion.rnscreens.d$a */
    public static final class a implements Choreographer.FrameCallback {
        public a() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j10) {
            C3813d.this.f41765V1 = false;
            C3813d c3813d = C3813d.this;
            c3813d.measure(View.MeasureSpec.makeMeasureSpec(c3813d.getWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(C3813d.this.getHeight(), Integer.MIN_VALUE));
            C3813d c3813d2 = C3813d.this;
            c3813d2.layout(c3813d2.getLeft(), C3813d.this.getTop(), C3813d.this.getRight(), C3813d.this.getBottom());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3813d(Context context, b0 config) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f41767g1 = config;
        this.f41769p1 = true;
        this.f41770x1 = true;
        androidx.core.graphics.e NONE = androidx.core.graphics.e.f19097e;
        Intrinsics.checkNotNullExpressionValue(NONE, "NONE");
        this.f41771y1 = NONE;
        getMenu();
        this.f41768g2 = new a();
    }

    public final void T() {
        Activity currentActivity;
        if (this.f41767g1.getLegacyTopInsetBehavior() || !this.f41767g1.getConsumeTopInset() || this.f41766b2) {
            return;
        }
        Context context = getContext();
        ThemedReactContext themedReactContext = context instanceof ThemedReactContext ? (ThemedReactContext) context : null;
        if (themedReactContext == null || (currentActivity = themedReactContext.getCurrentActivity()) == null) {
            return;
        }
        View decorView = currentActivity.getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        int a10 = AbstractC4056c.a(decorView);
        if (a10 > 0) {
            U(getPaddingLeft(), a10, getPaddingRight(), getPaddingBottom());
        }
    }

    public final void U(int i10, int i11, int i12, int i13) {
        W();
        setPadding(i10, i11, i12, i13);
    }

    public final void V() {
        if (getPaddingTop() == 0 && getPaddingBottom() == 0 && getPaddingLeft() == 0 && getPaddingRight() == 0) {
            return;
        }
        U(0, 0, 0, 0);
    }

    public final void W() {
        this.f41764T1 = this.f41769p1;
    }

    public final void X() {
        this.f41766b2 = false;
        androidx.core.graphics.e NONE = androidx.core.graphics.e.f19097e;
        Intrinsics.checkNotNullExpressionValue(NONE, "NONE");
        this.f41771y1 = NONE;
    }

    public final void Y() {
        setContentInsetStartWithNavigation(this.f41767g1.getPreferredContentInsetStartWithNavigation());
        J(this.f41767g1.getPreferredContentInsetStart(), this.f41767g1.getPreferredContentInsetEnd());
    }

    @NotNull
    public final b0 getConfig() {
        return this.f41767g1;
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        this.f41766b2 = true;
        WindowInsets onApplyWindowInsets = super.onApplyWindowInsets(windowInsets);
        androidx.core.graphics.e b10 = AbstractC4061h.b(this, F0.p.a(), onApplyWindowInsets, false, 4, null);
        androidx.core.graphics.e b11 = AbstractC4061h.b(this, F0.p.g(), onApplyWindowInsets, false, 4, null);
        androidx.core.graphics.e c10 = androidx.core.graphics.e.c(b10.f19098a + b11.f19098a, 0, b10.f19100c + b11.f19100c, 0);
        Intrinsics.checkNotNullExpressionValue(c10, "of(...)");
        if (!(this.f41767g1.getLegacyTopInsetBehavior() ? true : this.f41767g1.getConsumeTopInset())) {
            X();
            V();
            return onApplyWindowInsets;
        }
        androidx.core.graphics.e c11 = androidx.core.graphics.e.c(0, Math.max(b10.f19099b, this.f41770x1 ? b11.f19099b : 0), 0, Math.max(b10.f19101d, 0));
        Intrinsics.checkNotNullExpressionValue(c11, "of(...)");
        androidx.core.graphics.e a10 = androidx.core.graphics.e.a(c10, c11);
        Intrinsics.checkNotNullExpressionValue(a10, "add(...)");
        if (!Intrinsics.areEqual(this.f41771y1, a10)) {
            this.f41771y1 = a10;
            U(a10.f19098a, a10.f19099b, a10.f19100c, a10.f19101d);
        }
        return onApplyWindowInsets;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        T();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        X();
        V();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f41767g1.l(this, z10 || this.f41764T1);
        this.f41764T1 = false;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        Window window;
        WindowManager.LayoutParams attributes;
        super.requestLayout();
        Context context = getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        Activity currentActivity = ((ThemedReactContext) context).getCurrentActivity();
        Integer valueOf = (currentActivity == null || (window = currentActivity.getWindow()) == null || (attributes = window.getAttributes()) == null) ? null : Integer.valueOf(attributes.softInputMode);
        if (Build.VERSION.SDK_INT > 29 || valueOf == null || valueOf.intValue() != 32 || this.f41765V1 || this.f41768g2 == null) {
            return;
        }
        this.f41765V1 = true;
        ReactChoreographer.INSTANCE.getInstance().postFrameCallback(ReactChoreographer.CallbackType.NATIVE_ANIMATED_MODULE, this.f41768g2);
    }
}
