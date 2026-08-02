package com.swmansion.rnscreens;

import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.animation.Animation;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AbstractC2082d0;
import androidx.core.view.C2111s0;
import androidx.core.view.F0;
import androidx.fragment.app.AbstractActivityC2168s;
import androidx.fragment.app.Fragment;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.shape.n;
import com.swmansion.rnscreens.bottomsheet.SheetDelegate;
import com.swmansion.rnscreens.d0;
import dd.C4057d;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import lb.C5444x;
import m.AbstractActivityC5481c;

@Metadata(d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\u0007J\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0015\u0010\u0006J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\b2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\b2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'J\u0019\u0010*\u001a\u00020)2\b\b\u0002\u0010(\u001a\u00020\u0016H\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0016H\u0016¢\u0006\u0004\b/\u0010\u0018J\u000f\u00100\u001a\u00020\bH\u0016¢\u0006\u0004\b0\u0010\u0007J\u0017\u00103\u001a\u00020\b2\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u00020\b2\u0006\u00105\u001a\u00020\u0016H\u0016¢\u0006\u0004\b6\u00107J\u0017\u00109\u001a\u00020\b2\u0006\u00108\u001a\u00020\u0016H\u0016¢\u0006\u0004\b9\u00107J\u000f\u0010:\u001a\u00020\bH\u0016¢\u0006\u0004\b:\u0010\u0007J\u000f\u0010;\u001a\u00020\bH\u0016¢\u0006\u0004\b;\u0010\u0007J\u000f\u0010<\u001a\u00020\bH\u0000¢\u0006\u0004\b<\u0010\u0007J\u0019\u0010?\u001a\u00020\b2\b\u0010>\u001a\u0004\u0018\u00010=H\u0016¢\u0006\u0004\b?\u0010@J+\u0010E\u001a\u00020\u001d2\u0006\u0010B\u001a\u00020A2\b\u0010D\u001a\u0004\u0018\u00010C2\b\u0010>\u001a\u0004\u0018\u00010=H\u0016¢\u0006\u0004\bE\u0010FJ!\u0010H\u001a\u00020\b2\u0006\u0010G\u001a\u00020\u001d2\b\u0010>\u001a\u0004\u0018\u00010=H\u0016¢\u0006\u0004\bH\u0010IJ\u000f\u0010J\u001a\u00020\bH\u0016¢\u0006\u0004\bJ\u0010\u0007J)\u0010O\u001a\u0004\u0018\u00010N2\u0006\u0010K\u001a\u00020\u00122\u0006\u0010L\u001a\u00020\u00162\u0006\u0010M\u001a\u00020\u0012H\u0016¢\u0006\u0004\bO\u0010PJ)\u0010Q\u001a\u0004\u0018\u00010\n2\u0006\u0010K\u001a\u00020\u00122\u0006\u0010L\u001a\u00020\u00162\u0006\u0010M\u001a\u00020\u0012H\u0016¢\u0006\u0004\bQ\u0010RJ\u000f\u0010S\u001a\u00020\bH\u0016¢\u0006\u0004\bS\u0010\u0007J\u000f\u0010T\u001a\u00020\bH\u0016¢\u0006\u0004\bT\u0010\u0007J\u0017\u0010U\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\bU\u0010\u001cJ\u001f\u0010W\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010B\u001a\u00020VH\u0016¢\u0006\u0004\bW\u0010XJ\u000f\u0010Y\u001a\u00020\u0016H\u0016¢\u0006\u0004\bY\u0010\u0018J\u000f\u0010Z\u001a\u00020\bH\u0016¢\u0006\u0004\bZ\u0010\u0007J\u000f\u0010\\\u001a\u00020[H\u0000¢\u0006\u0004\b\\\u0010]R\u0018\u0010a\u001a\u0004\u0018\u00010^8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u0018\u00102\u001a\u0004\u0018\u00010b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR\u0016\u0010g\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR\u0016\u0010i\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010fR\u0018\u0010m\u001a\u0004\u0018\u00010j8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010lR\u0016\u0010!\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bn\u0010oR\u0018\u0010r\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010qR$\u0010z\u001a\u0004\u0018\u00010s8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bt\u0010u\u001a\u0004\bv\u0010w\"\u0004\bx\u0010yRD\u0010\u0084\u0001\u001a\u001f\u0012\u0013\u0012\u00110s¢\u0006\f\b|\u0012\b\b}\u0012\u0004\b\b(z\u0012\u0004\u0012\u00020\b\u0018\u00010{8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0004\b~\u0010\u007f\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001\"\u0006\b\u0082\u0001\u0010\u0083\u0001R\u001a\u0010\u0088\u0001\u001a\u00030\u0085\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R\u001a\u0010\u008a\u0001\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b:\u0010\u0089\u0001R*\u0010\u0090\u0001\u001a\u0004\u0018\u00010,8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\b\u008b\u0001\u0010\u008c\u0001\u001a\u0005\b\u008d\u0001\u0010.\"\u0006\b\u008e\u0001\u0010\u008f\u0001R*\u0010\u0096\u0001\u001a\u0004\u0018\u00010[8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\b\u0091\u0001\u0010\u0092\u0001\u001a\u0005\b\u0093\u0001\u0010]\"\u0006\b\u0094\u0001\u0010\u0095\u0001R\u001b\u0010\u0099\u0001\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001R\u0018\u0010\u009d\u0001\u001a\u00030\u009a\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001¨\u0006\u009e\u0001"}, d2 = {"Lcom/swmansion/rnscreens/Y;", "Lcom/swmansion/rnscreens/G;", "Lcom/swmansion/rnscreens/Z;", "Lcom/swmansion/rnscreens/z;", "screenView", "<init>", "(Lcom/swmansion/rnscreens/z;)V", "()V", "", "N0", "Landroid/animation/Animator;", "E0", "()Landroid/animation/Animator;", "F0", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "D0", "()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "screen", "", "U0", "(Lcom/swmansion/rnscreens/z;)Ljava/lang/Integer;", "B0", "", "Z0", "()Z", "Landroid/view/Menu;", "menu", "a1", "(Landroid/view/Menu;)V", "Landroid/view/View;", "I0", "()Landroid/view/View;", "LLc/b;", "sheetTransitionCoordinator", "x0", "(LLc/b;)V", "Landroidx/core/view/F0;", "insetsCompat", "M0", "(Landroidx/core/view/F0;)V", "forceCreation", "LLc/g;", "R0", "(Z)LLc/g;", "Lcom/swmansion/rnscreens/bottomsheet/SheetDelegate;", "T0", "()Lcom/swmansion/rnscreens/bottomsheet/SheetDelegate;", "j", "P0", "Lcom/swmansion/rnscreens/d;", "toolbar", "W0", "(Lcom/swmansion/rnscreens/d;)V", ViewProps.HIDDEN, "X0", "(Z)V", "translucent", "Y0", "E", "p0", "H0", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "transit", "enter", "nextAnim", "Landroid/view/animation/Animation;", "onCreateAnimation", "(IZI)Landroid/view/animation/Animation;", "onCreateAnimator", "(IZI)Landroid/animation/Animator;", "onStart", "onStop", "onPrepareOptionsMenu", "Landroid/view/MenuInflater;", "onCreateOptionsMenu", "(Landroid/view/Menu;Landroid/view/MenuInflater;)V", "C0", "G0", "LLc/c;", "Q0", "()LLc/c;", "Lcom/google/android/material/appbar/AppBarLayout;", "u", "Lcom/google/android/material/appbar/AppBarLayout;", "appBarLayout", "Landroidx/appcompat/widget/Toolbar;", "v", "Landroidx/appcompat/widget/Toolbar;", "w", "Z", "isToolbarShadowHidden", C5444x.f55808b, "isToolbarTranslucent", "Lcom/swmansion/rnscreens/b0;", "y", "Lcom/swmansion/rnscreens/b0;", "lastActiveHeaderConfig", "z", "LLc/b;", "A", "Landroid/view/View;", "lastFocusedChild", "Lcom/swmansion/rnscreens/c;", "B", "Lcom/swmansion/rnscreens/c;", "K0", "()Lcom/swmansion/rnscreens/c;", "setSearchView", "(Lcom/swmansion/rnscreens/c;)V", "searchView", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "C", "Lkotlin/jvm/functions/Function1;", "getOnSearchViewCreate", "()Lkotlin/jvm/functions/Function1;", "V0", "(Lkotlin/jvm/functions/Function1;)V", "onSearchViewCreate", "Lbd/e;", "D", "Lbd/e;", "coordinatorLayout", "LLc/g;", "dimmingDelegate", "F", "Lcom/swmansion/rnscreens/bottomsheet/SheetDelegate;", "L0", "setSheetDelegate$react_native_screens_release", "(Lcom/swmansion/rnscreens/bottomsheet/SheetDelegate;)V", "sheetDelegate", "G", "LLc/c;", "getBottomSheetWindowInsetListenerChain$react_native_screens_release", "setBottomSheetWindowInsetListenerChain$react_native_screens_release", "(LLc/c;)V", "bottomSheetWindowInsetListenerChain", "H", "Landroidx/core/view/F0;", "lastInsetsCompat", "Lcom/swmansion/rnscreens/T;", "J0", "()Lcom/swmansion/rnscreens/T;", "screenStack", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nScreenStackFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScreenStackFragment.kt\ncom/swmansion/rnscreens/ScreenStackFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,587:1\n1#2:588\n*E\n"})
/* loaded from: classes4.dex */
public final class Y extends G implements Z {

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    public View lastFocusedChild;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    public C3812c searchView;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    public Function1 onSearchViewCreate;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    public bd.e coordinatorLayout;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    public Lc.g dimmingDelegate;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    public SheetDelegate sheetDelegate;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    public Lc.c bottomSheetWindowInsetListenerChain;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    public F0 lastInsetsCompat;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    public AppBarLayout appBarLayout;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public Toolbar toolbar;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public boolean isToolbarShadowHidden;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    public boolean isToolbarTranslucent;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    public b0 lastActiveHeaderConfig;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    public Lc.b sheetTransitionCoordinator;

    public static final class a extends C2111s0.b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ SheetDelegate f41705a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y f41706b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(SheetDelegate sheetDelegate, Y y10) {
            super(0);
            this.f41705a = sheetDelegate;
            this.f41706b = y10;
        }

        @Override // androidx.core.view.C2111s0.b
        public void onEnd(C2111s0 animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            super.onEnd(animation);
            this.f41706b.b().y();
        }

        @Override // androidx.core.view.C2111s0.b
        public F0 onProgress(F0 insets, List runningAnimations) {
            Intrinsics.checkNotNullParameter(insets, "insets");
            Intrinsics.checkNotNullParameter(runningAnimations, "runningAnimations");
            if (Build.VERSION.SDK_INT >= 30) {
                this.f41705a.I(insets);
            }
            return insets;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(C3834z screenView) {
        super(screenView);
        Intrinsics.checkNotNullParameter(screenView, "screenView");
    }

    public static final void A0(Lc.b bVar, Y y10, View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        bVar.b(y10.b());
    }

    public static final F0 O0(SheetDelegate sheetDelegate, View view, F0 windowInsets) {
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        Intrinsics.checkNotNullParameter(windowInsets, "windowInsets");
        sheetDelegate.I(windowInsets);
        return windowInsets;
    }

    public static /* synthetic */ Lc.g S0(Y y10, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return y10.R0(z10);
    }

    public static final WindowInsets y0(B b10, Y y10, View view, WindowInsets insets) {
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        Intrinsics.checkNotNullParameter(insets, "insets");
        F0 z10 = F0.z(insets, b10);
        Intrinsics.checkNotNullExpressionValue(z10, "toWindowInsetsCompat(...)");
        y10.M0(z10);
        return insets;
    }

    public static final F0 z0(Y y10, View view, F0 windowInsets) {
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        Intrinsics.checkNotNullParameter(windowInsets, "windowInsets");
        y10.M0(windowInsets);
        return windowInsets;
    }

    public final void B0(C3834z screen) {
        float max = Math.max(PixelUtil.toPixelFromDIP(screen.getSheetCornerRadius()), 0.0f);
        n.b bVar = new n.b();
        bVar.B(0, max);
        bVar.G(0, max);
        com.google.android.material.shape.n m10 = bVar.m();
        Intrinsics.checkNotNullExpressionValue(m10, "build(...)");
        com.google.android.material.shape.i iVar = new com.google.android.material.shape.i(m10);
        Integer U02 = U0(screen);
        iVar.setTint(U02 != null ? U02.intValue() : 0);
        screen.setBackground(iVar);
    }

    public boolean C0() {
        B container = b().getContainer();
        if (!(container instanceof T)) {
            throw new IllegalStateException("ScreenStackFragment added into a non-stack container");
        }
        if (!Intrinsics.areEqual(((T) container).getRootScreen(), b())) {
            return true;
        }
        Fragment parentFragment = getParentFragment();
        if (parentFragment instanceof Y) {
            return ((Y) parentFragment).C0();
        }
        return false;
    }

    public final BottomSheetBehavior D0() {
        return new BottomSheetBehavior();
    }

    @Override // com.swmansion.rnscreens.G, com.swmansion.rnscreens.H
    public void E() {
        super.E();
        b0 headerConfig = b().getHeaderConfig();
        if (headerConfig != null) {
            headerConfig.m();
        }
    }

    public final Animator E0() {
        SheetDelegate T02 = T0();
        bd.e eVar = null;
        Lc.g S02 = S0(this, false, 1, null);
        C3834z b10 = b();
        bd.e eVar2 = this.coordinatorLayout;
        if (eVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("coordinatorLayout");
        } else {
            eVar = eVar2;
        }
        return T02.q(new SheetDelegate.c(this, b10, eVar, S02));
    }

    public final Animator F0() {
        SheetDelegate T02 = T0();
        bd.e eVar = null;
        Lc.g S02 = S0(this, false, 1, null);
        C3834z b10 = b();
        bd.e eVar2 = this.coordinatorLayout;
        if (eVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("coordinatorLayout");
        } else {
            eVar = eVar2;
        }
        return T02.r(new SheetDelegate.c(this, b10, eVar, S02));
    }

    public void G0() {
        J0().O(this);
    }

    public final void H0() {
        if (isRemoving() && isDetached()) {
            return;
        }
        ThemedReactContext reactContext = b().getReactContext();
        int surfaceId = UIManagerHelper.getSurfaceId(reactContext);
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(reactContext, b().getId());
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new Mc.h(surfaceId, b().getId()));
        }
    }

    public final View I0() {
        View b10 = b();
        while (b10 != null) {
            if (b10.isFocused()) {
                return b10;
            }
            b10 = b10 instanceof ViewGroup ? ((ViewGroup) b10).getFocusedChild() : null;
        }
        return null;
    }

    public final T J0() {
        B container = b().getContainer();
        if (container instanceof T) {
            return (T) container;
        }
        throw new IllegalStateException("ScreenStackFragment added into a non-stack container");
    }

    /* renamed from: K0, reason: from getter */
    public final C3812c getSearchView() {
        return this.searchView;
    }

    /* renamed from: L0, reason: from getter */
    public final SheetDelegate getSheetDelegate() {
        return this.sheetDelegate;
    }

    public final void M0(F0 insetsCompat) {
        if (Intrinsics.areEqual(this.lastInsetsCompat, insetsCompat)) {
            return;
        }
        this.lastInsetsCompat = insetsCompat;
        SheetDelegate T02 = T0();
        BottomSheetBehavior<C3834z> sheetBehavior = b().getSheetBehavior();
        Intrinsics.checkNotNull(sheetBehavior);
        T02.R(sheetBehavior);
        B container = b().getContainer();
        Lc.b bVar = null;
        if (container != null) {
            bd.e eVar = this.coordinatorLayout;
            if (eVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("coordinatorLayout");
                eVar = null;
            }
            eVar.forceLayout();
            bd.e eVar2 = this.coordinatorLayout;
            if (eVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("coordinatorLayout");
                eVar2 = null;
            }
            eVar2.measure(View.MeasureSpec.makeMeasureSpec(container.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(container.getHeight(), 1073741824));
            bd.e eVar3 = this.coordinatorLayout;
            if (eVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("coordinatorLayout");
                eVar3 = null;
            }
            eVar3.layout(0, 0, container.getWidth(), container.getHeight());
        }
        b().u(true);
        Lc.b bVar2 = this.sheetTransitionCoordinator;
        if (bVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sheetTransitionCoordinator");
        } else {
            bVar = bVar2;
        }
        bVar.a(b());
    }

    public final void N0() {
        View view = getView();
        ViewParent parent = view != null ? view.getParent() : null;
        if (parent instanceof T) {
            ((T) parent).c0();
        }
    }

    public void P0() {
        Toolbar toolbar;
        AppBarLayout appBarLayout = this.appBarLayout;
        if (appBarLayout != null && (toolbar = this.toolbar) != null && toolbar.getParent() == appBarLayout) {
            appBarLayout.removeView(toolbar);
        }
        this.toolbar = null;
    }

    public final Lc.c Q0() {
        if (this.bottomSheetWindowInsetListenerChain == null) {
            this.bottomSheetWindowInsetListenerChain = new Lc.c();
        }
        Lc.c cVar = this.bottomSheetWindowInsetListenerChain;
        Intrinsics.checkNotNull(cVar);
        return cVar;
    }

    public final Lc.g R0(boolean forceCreation) {
        Lc.g gVar = this.dimmingDelegate;
        if (gVar == null || forceCreation) {
            if (gVar != null) {
                gVar.f(b().getSheetBehavior());
            }
            this.dimmingDelegate = new Lc.g(b().getReactContext(), b());
        }
        Lc.g gVar2 = this.dimmingDelegate;
        Intrinsics.checkNotNull(gVar2);
        return gVar2;
    }

    public final SheetDelegate T0() {
        if (this.sheetDelegate == null) {
            this.sheetDelegate = new SheetDelegate(b());
        }
        SheetDelegate sheetDelegate = this.sheetDelegate;
        Intrinsics.checkNotNull(sheetDelegate);
        return sheetDelegate;
    }

    public final Integer U0(C3834z screen) {
        Integer valueOf;
        ColorStateList L10;
        Drawable background = screen.getBackground();
        ColorDrawable colorDrawable = background instanceof ColorDrawable ? (ColorDrawable) background : null;
        if (colorDrawable != null) {
            valueOf = Integer.valueOf(colorDrawable.getColor());
        } else {
            Drawable background2 = screen.getBackground();
            com.google.android.material.shape.i iVar = background2 instanceof com.google.android.material.shape.i ? (com.google.android.material.shape.i) background2 : null;
            valueOf = (iVar == null || (L10 = iVar.L()) == null) ? null : Integer.valueOf(L10.getDefaultColor());
        }
        if (valueOf != null) {
            return valueOf;
        }
        C contentWrapper = screen.getContentWrapper();
        if (contentWrapper == null) {
            return null;
        }
        return dd.m.a(contentWrapper);
    }

    public final void V0(Function1 function1) {
        this.onSearchViewCreate = function1;
    }

    public void W0(C3813d toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        this.lastActiveHeaderConfig = toolbar.getConfig();
        AppBarLayout appBarLayout = this.appBarLayout;
        if (appBarLayout != null) {
            appBarLayout.addView(toolbar);
        }
        AppBarLayout.e eVar = new AppBarLayout.e(-1, -2);
        eVar.g(0);
        toolbar.setLayoutParams(eVar);
        this.toolbar = toolbar;
    }

    public void X0(boolean hidden) {
        if (this.isToolbarShadowHidden != hidden) {
            AppBarLayout appBarLayout = this.appBarLayout;
            if (appBarLayout != null) {
                appBarLayout.setElevation(hidden ? 0.0f : PixelUtil.toPixelFromDIP(4.0f));
            }
            AppBarLayout appBarLayout2 = this.appBarLayout;
            if (appBarLayout2 != null) {
                appBarLayout2.setStateListAnimator(null);
            }
            this.isToolbarShadowHidden = hidden;
        }
    }

    public void Y0(boolean translucent) {
        if (this.isToolbarTranslucent != translucent) {
            ViewGroup.LayoutParams layoutParams = b().getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
            ((CoordinatorLayout.f) layoutParams).o(translucent ? null : new AppBarLayout.ScrollingViewBehavior());
            this.isToolbarTranslucent = translucent;
        }
    }

    public final boolean Z0() {
        b0 headerConfig = b().getHeaderConfig();
        int configSubviewsCount = headerConfig != null ? headerConfig.getConfigSubviewsCount() : 0;
        if (headerConfig != null && configSubviewsCount > 0) {
            for (int i10 = 0; i10 < configSubviewsCount; i10++) {
                if (headerConfig.i(i10).getType() == d0.a.f41781e) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void a1(Menu menu) {
        menu.clear();
        if (Z0()) {
            Context context = getContext();
            if (this.searchView == null && context != null) {
                C3812c c3812c = new C3812c(context, this);
                this.searchView = c3812c;
                Function1 function1 = this.onSearchViewCreate;
                if (function1 != null) {
                    function1.invoke(c3812c);
                }
            }
            MenuItem add = menu.add("");
            add.setShowAsAction(2);
            add.setActionView(this.searchView);
        }
    }

    @Override // com.swmansion.rnscreens.G, com.swmansion.rnscreens.H
    public boolean j() {
        return b().s();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override // androidx.fragment.app.Fragment
    public Animation onCreateAnimation(int transit, boolean enter, int nextAnim) {
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public Animator onCreateAnimator(int transit, boolean enter, int nextAnim) {
        if (Lc.q.e(b())) {
            return enter ? E0() : F0();
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        a1(menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override // com.swmansion.rnscreens.G, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AppBarLayout appBarLayout;
        AppBarLayout appBarLayout2;
        AppBarLayout appBarLayout3;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        this.coordinatorLayout = new bd.e(requireContext, this);
        C3834z b10 = b();
        CoordinatorLayout.f fVar = new CoordinatorLayout.f(-1, -1);
        fVar.o(Lc.q.e(b()) ? D0() : this.isToolbarTranslucent ? null : new AppBarLayout.ScrollingViewBehavior());
        b10.setLayoutParams(fVar);
        bd.e eVar = this.coordinatorLayout;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("coordinatorLayout");
            eVar = null;
        }
        eVar.addView(Nc.c.f(b()));
        if (Lc.q.e(b())) {
            b().setClipToOutline(true);
            B0(b());
            b().setElevation(b().getSheetElevation());
            final SheetDelegate T02 = T0();
            BottomSheetBehavior<C3834z> sheetBehavior = b().getSheetBehavior();
            Intrinsics.checkNotNull(sheetBehavior);
            SheetDelegate.n(T02, sheetBehavior, null, 0, 6, null);
            Lc.g R02 = R0(true);
            C3834z b11 = b();
            bd.e eVar2 = this.coordinatorLayout;
            if (eVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("coordinatorLayout");
                eVar2 = null;
            }
            R02.h(b11, eVar2);
            C3834z b12 = b();
            BottomSheetBehavior<C3834z> sheetBehavior2 = b().getSheetBehavior();
            Intrinsics.checkNotNull(sheetBehavior2);
            R02.g(b12, sheetBehavior2);
            if (!b().getSheetShouldOverflowTopInset()) {
                Lc.b bVar = new Lc.b();
                this.sheetTransitionCoordinator = bVar;
                x0(bVar);
            }
            B container2 = b().getContainer();
            Intrinsics.checkNotNull(container2);
            bd.e eVar3 = this.coordinatorLayout;
            if (eVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("coordinatorLayout");
                eVar3 = null;
            }
            eVar3.measure(View.MeasureSpec.makeMeasureSpec(container2.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(container2.getHeight(), 1073741824));
            bd.e eVar4 = this.coordinatorLayout;
            if (eVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("coordinatorLayout");
                eVar4 = null;
            }
            eVar4.layout(0, 0, container2.getWidth(), container2.getHeight());
            if (Build.VERSION.SDK_INT < 30) {
                Lc.c Q02 = Q0();
                Q02.a(new androidx.core.view.J() { // from class: com.swmansion.rnscreens.U
                    @Override // androidx.core.view.J
                    public final F0 f(View view, F0 f02) {
                        F0 O02;
                        O02 = Y.O0(SheetDelegate.this, view, f02);
                        return O02;
                    }
                });
                AbstractC2082d0.x0(b(), Q02);
            }
            AbstractC2082d0.E0(b(), new a(T02, this));
        } else {
            Context context = getContext();
            if (context != null) {
                appBarLayout = new AppBarLayout(context);
                appBarLayout.setBackgroundColor(0);
                appBarLayout.setLayoutParams(new AppBarLayout.e(-1, -2));
            } else {
                appBarLayout = null;
            }
            this.appBarLayout = appBarLayout;
            bd.e eVar5 = this.coordinatorLayout;
            if (eVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("coordinatorLayout");
                eVar5 = null;
            }
            eVar5.addView(this.appBarLayout);
            if (this.isToolbarShadowHidden && (appBarLayout3 = this.appBarLayout) != null) {
                appBarLayout3.setTargetElevation(0.0f);
            }
            Toolbar toolbar = this.toolbar;
            if (toolbar != null && (appBarLayout2 = this.appBarLayout) != null) {
                appBarLayout2.addView(Nc.c.f(toolbar));
            }
            setHasOptionsMenu(true);
        }
        bd.e eVar6 = this.coordinatorLayout;
        if (eVar6 != null) {
            return eVar6;
        }
        Intrinsics.throwUninitializedPropertyAccessException("coordinatorLayout");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        b0 b0Var = this.lastActiveHeaderConfig;
        if (b0Var != null) {
            AbstractActivityC2168s activity = getActivity();
            b0Var.g(activity instanceof AbstractActivityC5481c ? (AbstractActivityC5481c) activity : null);
        }
        this.lastActiveHeaderConfig = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPrepareOptionsMenu(Menu menu) {
        b0 headerConfig;
        Intrinsics.checkNotNullParameter(menu, "menu");
        if (!b().s() || ((headerConfig = b().getHeaderConfig()) != null && !headerConfig.j())) {
            a1(menu);
        }
        super.onPrepareOptionsMenu(menu);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        View view = this.lastFocusedChild;
        if (view != null) {
            view.requestFocus();
        }
        super.onStart();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        if (C4057d.f45171a.a(getContext())) {
            this.lastFocusedChild = I0();
        }
        super.onStop();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
    }

    @Override // com.swmansion.rnscreens.G
    public void p0() {
        super.p0();
        N0();
        b().k();
    }

    public final void x0(final Lc.b sheetTransitionCoordinator) {
        final B container = b().getContainer();
        if (container != null) {
            if (Build.VERSION.SDK_INT >= 30) {
                container.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.swmansion.rnscreens.V
                    @Override // android.view.View.OnApplyWindowInsetsListener
                    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                        WindowInsets y02;
                        y02 = Y.y0(B.this, this, view, windowInsets);
                        return y02;
                    }
                });
            } else {
                Q0().a(new androidx.core.view.J() { // from class: com.swmansion.rnscreens.W
                    @Override // androidx.core.view.J
                    public final F0 f(View view, F0 f02) {
                        F0 z02;
                        z02 = Y.z0(Y.this, view, f02);
                        return z02;
                    }
                });
            }
        }
        B container2 = b().getContainer();
        if (container2 != null) {
            container2.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.swmansion.rnscreens.X
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                    Y.A0(Lc.b.this, this, view, i10, i11, i12, i13, i14, i15, i16, i17);
                }
            });
        }
    }

    public Y() {
        throw new IllegalStateException("ScreenStack fragments should never be restored. Follow instructions from https://github.com/software-mansion/react-native-screens/issues/17#issuecomment-424704067 to properly configure your main activity.");
    }
}
