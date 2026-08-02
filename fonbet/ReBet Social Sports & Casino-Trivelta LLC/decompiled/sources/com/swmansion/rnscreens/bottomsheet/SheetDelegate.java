package com.swmansion.rnscreens.bottomsheet;

import Lc.a;
import Lc.g;
import Lc.p;
import Lc.q;
import Mc.e;
import X9.m;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.WindowMetrics;
import android.view.inputmethod.InputMethodManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.F0;
import androidx.core.view.J;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC2185j;
import androidx.lifecycle.InterfaceC2191p;
import androidx.lifecycle.InterfaceC2193s;
import cd.C2915a;
import com.facebook.react.uimanager.ThemedReactContext;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.shape.i;
import com.swmansion.rnscreens.AbstractC3822m;
import com.swmansion.rnscreens.B;
import com.swmansion.rnscreens.C;
import com.swmansion.rnscreens.C3819j;
import com.swmansion.rnscreens.C3820k;
import com.swmansion.rnscreens.C3821l;
import com.swmansion.rnscreens.C3823n;
import com.swmansion.rnscreens.C3834z;
import com.swmansion.rnscreens.E;
import com.swmansion.rnscreens.Y;
import com.swmansion.rnscreens.bottomsheet.SheetDelegate;
import com.twilio.voice.EventKeys;
import dd.AbstractC4056c;
import i3.C4527h;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 F2\u00020\u00012\u00020\u0002:\u0004Z_]VB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\fJ\u000f\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\fJ\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0015\u0010\fJ\u000f\u0010\u0016\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0016\u0010\fJ\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0011\u0010\u001b\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010\u001d\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u001d\u0010\u001cJ'\u0010$\u001a\u00020#2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020#H\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020#2\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020\n2\u0006\u0010,\u001a\u00020\u001eH\u0002¢\u0006\u0004\b-\u0010.J'\u00104\u001a\u00020\n2\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020\u00182\u0006\u00103\u001a\u000202H\u0002¢\u0006\u0004\b4\u00105J\u001f\u0010:\u001a\u00020\n2\u0006\u00107\u001a\u0002062\u0006\u00109\u001a\u000208H\u0016¢\u0006\u0004\b:\u0010;J\u001d\u0010>\u001a\u00020\n2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00030<H\u0000¢\u0006\u0004\b>\u0010?J7\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00030<2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00030<2\b\b\u0002\u0010A\u001a\u00020@2\b\b\u0002\u0010B\u001a\u00020\u0011H\u0000¢\u0006\u0004\bC\u0010DJ\u0017\u0010F\u001a\u00020\u00112\u0006\u0010E\u001a\u00020\u0011H\u0000¢\u0006\u0004\bF\u0010GJ\u001f\u0010K\u001a\u00020I2\u0006\u0010H\u001a\u00020\u00072\u0006\u0010J\u001a\u00020IH\u0016¢\u0006\u0004\bK\u0010LJ\u0011\u0010M\u001a\u0004\u0018\u00010\u0011H\u0000¢\u0006\u0004\bM\u0010\u001cJ\u0017\u0010Q\u001a\u00020P2\u0006\u0010O\u001a\u00020NH\u0000¢\u0006\u0004\bQ\u0010RJ\u0017\u0010S\u001a\u00020P2\u0006\u0010O\u001a\u00020NH\u0000¢\u0006\u0004\bS\u0010RJ\u0017\u0010T\u001a\u00020\n2\u0006\u0010J\u001a\u00020IH\u0000¢\u0006\u0004\bT\u0010UR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR\u0016\u0010\\\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u0016\u0010A\u001a\u00020@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u0016\u0010`\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010[R\u0016\u0010b\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010TR\u0016\u0010c\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010TR$\u0010h\u001a\u00020\u00112\u0006\u0010d\u001a\u00020\u00118\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\be\u0010T\u001a\u0004\bf\u0010gR*\u0010l\u001a\u00020\u00112\u0006\u0010d\u001a\u00020\u00118\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\bi\u0010T\u0012\u0004\bk\u0010\f\u001a\u0004\bj\u0010gR\u0018\u0010p\u001a\u00060mR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\u0018\u0010s\u001a\u00060qR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010rR\u0018\u0010u\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010tR\u001c\u0010x\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010<8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bv\u0010wR\u0014\u0010{\u001a\u0002028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\by\u0010zR\u0016\u0010\u007f\u001a\u0004\u0018\u00010|8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b}\u0010~¨\u0006\u0080\u0001"}, d2 = {"Lcom/swmansion/rnscreens/bottomsheet/SheetDelegate;", "Landroidx/lifecycle/p;", "Landroidx/core/view/J;", "Lcom/swmansion/rnscreens/z;", "screen", "<init>", "(Lcom/swmansion/rnscreens/z;)V", "Landroid/view/View;", "L", "()Landroid/view/View;", "", "D", "()V", "H", "G", "F", "E", "", "newState", "J", "(I)V", "K", "M", "state", "", "N", "(I)Z", "Q", "()Ljava/lang/Integer;", "O", "", "from", "to", "LLc/g;", "dimmingDelegate", "Landroid/animation/ValueAnimator;", "o", "(FFLLc/g;)Landroid/animation/ValueAnimator;", "s", "()Landroid/animation/ValueAnimator;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "coordinatorLayout", "w", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;)Landroid/animation/ValueAnimator;", "baseTranslationY", "S", "(F)V", "Landroid/animation/AnimatorSet;", "animatorSet", "isEnter", "Lcom/swmansion/rnscreens/Y;", "screenStackFragment", "j", "(Landroid/animation/AnimatorSet;ZLcom/swmansion/rnscreens/Y;)V", "Landroidx/lifecycle/s;", "source", "Landroidx/lifecycle/j$a;", "event", "k", "(Landroidx/lifecycle/s;Landroidx/lifecycle/j$a;)V", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "behavior", "R", "(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)V", "Lcom/swmansion/rnscreens/m;", "keyboardState", "selectedDetentIndex", m.f13664a, "(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;Lcom/swmansion/rnscreens/m;I)Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "keyboardHeight", "l", "(I)I", "v", "Landroidx/core/view/F0;", "insets", "f", "(Landroid/view/View;Landroidx/core/view/F0;)Landroidx/core/view/F0;", "P", "Lcom/swmansion/rnscreens/bottomsheet/SheetDelegate$c;", "sheetAnimationContext", "Landroid/animation/Animator;", "q", "(Lcom/swmansion/rnscreens/bottomsheet/SheetDelegate$c;)Landroid/animation/Animator;", "r", "I", "(Landroidx/core/view/F0;)V", "a", "Lcom/swmansion/rnscreens/z;", "A", "()Lcom/swmansion/rnscreens/z;", com.google.crypto.tink.integration.android.b.f37029b, "Z", "isKeyboardVisible", "c", "Lcom/swmansion/rnscreens/m;", W9.d.f13160a, "isSheetAnimationInProgress", com.bumptech.glide.gifdecoder.e.f29601m, "lastTopInset", "lastKeyboardBottomOffset", EventKeys.VALUE_KEY, "g", "z", "()I", "lastStableDetentIndex", C4527h.f48087o, "getLastStableState", "getLastStableState$annotations", "lastStableState", "Lcom/swmansion/rnscreens/bottomsheet/SheetDelegate$d;", i.f35755A, "Lcom/swmansion/rnscreens/bottomsheet/SheetDelegate$d;", "sheetStateObserver", "Lcom/swmansion/rnscreens/bottomsheet/SheetDelegate$b;", "Lcom/swmansion/rnscreens/bottomsheet/SheetDelegate$b;", "keyboardHandlerCallback", "Landroid/view/View;", "viewToRestoreFocus", "B", "()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "sheetBehavior", "C", "()Lcom/swmansion/rnscreens/Y;", "stackFragment", "Landroid/view/inputmethod/InputMethodManager;", "y", "()Landroid/view/inputmethod/InputMethodManager;", "inputMethodManager", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSheetDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SheetDelegate.kt\ncom/swmansion/rnscreens/bottomsheet/SheetDelegate\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,654:1\n1#2:655\n*E\n"})
/* loaded from: classes4.dex */
public final class SheetDelegate implements InterfaceC2191p, J {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final C3834z screen;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public boolean isKeyboardVisible;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public AbstractC3822m keyboardState;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public boolean isSheetAnimationInProgress;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public int lastTopInset;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public int lastKeyboardBottomOffset;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public int lastStableDetentIndex;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public int lastStableState;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public final d sheetStateObserver;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final b keyboardHandlerCallback;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    public View viewToRestoreFocus;

    public final class b extends BottomSheetBehavior.g {
        public b() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void b(View bottomSheet, float f10) {
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void c(View bottomSheet, int i10) {
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
            if (i10 == 4 && F0.y(bottomSheet.getRootWindowInsets()).q(F0.p.b())) {
                bottomSheet.requestFocus();
                InputMethodManager y10 = SheetDelegate.this.y();
                if (y10 != null) {
                    y10.hideSoftInputFromWindow(bottomSheet.getWindowToken(), 0);
                }
            }
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final Y f41752a;

        /* renamed from: b, reason: collision with root package name */
        public final C3834z f41753b;

        /* renamed from: c, reason: collision with root package name */
        public final CoordinatorLayout f41754c;

        /* renamed from: d, reason: collision with root package name */
        public final g f41755d;

        public c(Y fragment, C3834z screen, CoordinatorLayout coordinatorLayout, g dimmingDelegate) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            Intrinsics.checkNotNullParameter(screen, "screen");
            Intrinsics.checkNotNullParameter(coordinatorLayout, "coordinatorLayout");
            Intrinsics.checkNotNullParameter(dimmingDelegate, "dimmingDelegate");
            this.f41752a = fragment;
            this.f41753b = screen;
            this.f41754c = coordinatorLayout;
            this.f41755d = dimmingDelegate;
        }

        public final CoordinatorLayout a() {
            return this.f41754c;
        }

        public final g b() {
            return this.f41755d;
        }

        public final Y c() {
            return this.f41752a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.areEqual(this.f41752a, cVar.f41752a) && Intrinsics.areEqual(this.f41753b, cVar.f41753b) && Intrinsics.areEqual(this.f41754c, cVar.f41754c) && Intrinsics.areEqual(this.f41755d, cVar.f41755d);
        }

        public int hashCode() {
            return (((((this.f41752a.hashCode() * 31) + this.f41753b.hashCode()) * 31) + this.f41754c.hashCode()) * 31) + this.f41755d.hashCode();
        }

        public String toString() {
            return "SheetAnimationContext(fragment=" + this.f41752a + ", screen=" + this.f41753b + ", coordinatorLayout=" + this.f41754c + ", dimmingDelegate=" + this.f41755d + ")";
        }
    }

    public final class d extends BottomSheetBehavior.g {
        public d() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void b(View bottomSheet, float f10) {
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void c(View bottomSheet, int i10) {
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
            SheetDelegate.this.J(i10);
        }
    }

    public /* synthetic */ class e {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AbstractC2185j.a.values().length];
            try {
                iArr[AbstractC2185j.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AbstractC2185j.a.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AbstractC2185j.a.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AbstractC2185j.a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AbstractC2185j.a.ON_DESTROY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class f extends AnimatorListenerAdapter {
        public f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            SheetDelegate.this.isSheetAnimationInProgress = false;
            SheetDelegate.this.getScreen().y();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            SheetDelegate.this.isSheetAnimationInProgress = true;
        }
    }

    public SheetDelegate(C3834z screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        this.screen = screen;
        this.keyboardState = C3821l.f41981a;
        this.lastStableDetentIndex = screen.getSheetInitialDetentIndex();
        this.lastStableState = screen.getSheetDetents().k(screen.getSheetInitialDetentIndex());
        d dVar = new d();
        this.sheetStateObserver = dVar;
        this.keyboardHandlerCallback = new b();
        screen.getFragment();
        Fragment fragment = screen.getFragment();
        Intrinsics.checkNotNull(fragment);
        fragment.getLifecycle().a(this);
        BottomSheetBehavior B10 = B();
        if (B10 == null) {
            throw new IllegalStateException("[RNScreens] Sheet delegate accepts screen with initialized sheet behaviour only.");
        }
        B10.c0(dVar);
    }

    public static /* synthetic */ BottomSheetBehavior n(SheetDelegate sheetDelegate, BottomSheetBehavior bottomSheetBehavior, AbstractC3822m abstractC3822m, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            abstractC3822m = C3821l.f41981a;
        }
        if ((i11 & 4) != 0) {
            i10 = sheetDelegate.lastStableDetentIndex;
        }
        return sheetDelegate.m(bottomSheetBehavior, abstractC3822m, i10);
    }

    public static final void p(g gVar, ValueAnimator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
        Object animatedValue = animator.getAnimatedValue();
        Float f10 = animatedValue instanceof Float ? (Float) animatedValue : null;
        if (f10 != null) {
            gVar.d().setAlpha(f10.floatValue());
        }
    }

    public static final float t(SheetDelegate sheetDelegate, Number number) {
        return sheetDelegate.screen.getHeight();
    }

    public static final Float u(Number number) {
        return Float.valueOf(0.0f);
    }

    public static final void v(SheetDelegate sheetDelegate, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        sheetDelegate.S(((Float) animatedValue).floatValue());
    }

    public static final void x(SheetDelegate sheetDelegate, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        sheetDelegate.S(((Float) animatedValue).floatValue());
    }

    /* renamed from: A, reason: from getter */
    public final C3834z getScreen() {
        return this.screen;
    }

    public final BottomSheetBehavior B() {
        return this.screen.getSheetBehavior();
    }

    public final Y C() {
        Fragment fragment = this.screen.getFragment();
        Intrinsics.checkNotNull(fragment, "null cannot be cast to non-null type com.swmansion.rnscreens.ScreenStackFragment");
        return (Y) fragment;
    }

    public final void D() {
        K();
    }

    public final void E() {
        M();
    }

    public final void F() {
        C3819j.f41972a.g(this);
    }

    public final void G() {
        C3819j.f41972a.a(this);
    }

    public final void H() {
        C3819j.f41972a.d(L());
    }

    public final void I(F0 insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        this.lastKeyboardBottomOffset = insets.f(F0.p.b()).f19101d;
        if (this.isSheetAnimationInProgress) {
            return;
        }
        S(0.0f);
    }

    public final void J(int newState) {
        boolean b10 = p.f7165a.b(newState);
        if (b10) {
            this.lastStableState = newState;
            this.lastStableDetentIndex = this.screen.getSheetDetents().h(newState);
        }
        this.screen.x(this.lastStableDetentIndex, b10);
        if (N(newState)) {
            C().H0();
        }
    }

    public final void K() {
        View currentFocus;
        View decorView;
        Activity currentActivity = this.screen.getReactContext().getCurrentActivity();
        if (currentActivity == null || (currentFocus = currentActivity.getCurrentFocus()) == null) {
            return;
        }
        Window window = currentActivity.getWindow();
        if (window != null && (decorView = window.getDecorView()) != null && Intrinsics.areEqual(AbstractC4056c.c(decorView), Boolean.TRUE)) {
            this.viewToRestoreFocus = currentFocus;
        }
        this.screen.requestFocus();
        InputMethodManager y10 = y();
        if (y10 != null) {
            y10.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
    }

    public final View L() {
        Activity currentActivity = this.screen.getReactContext().getCurrentActivity();
        if (currentActivity == null) {
            throw new IllegalStateException("[RNScreens] Attempt to access activity on detached context");
        }
        View decorView = currentActivity.getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        return decorView;
    }

    public final void M() {
        View view = this.viewToRestoreFocus;
        if (view != null) {
            view.requestFocus();
            InputMethodManager y10 = y();
            if (y10 != null) {
                y10.showSoftInput(view, 0);
            }
        }
        this.viewToRestoreFocus = null;
    }

    public final boolean N(int state) {
        return state == 5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
    
        r0 = r0.getCurrentWindowMetrics();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0047, code lost:
    
        r0 = r0.getBounds();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Integer O() {
        WindowMetrics currentWindowMetrics;
        Rect bounds;
        DisplayMetrics displayMetrics;
        B container = this.screen.getContainer();
        if (container != null) {
            return Integer.valueOf(container.getHeight());
        }
        ThemedReactContext reactContext = this.screen.getReactContext();
        Resources resources = reactContext.getResources();
        if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            return Integer.valueOf(displayMetrics.heightPixels);
        }
        if (Build.VERSION.SDK_INT >= 30) {
            Object systemService = reactContext.getSystemService("window");
            WindowManager windowManager = systemService instanceof WindowManager ? (WindowManager) systemService : null;
            if (windowManager != null && currentWindowMetrics != null && bounds != null) {
                return Integer.valueOf(bounds.height());
            }
        }
        return null;
    }

    public final Integer P() {
        return this.screen.getSheetShouldOverflowTopInset() ? O() : Q();
    }

    public final Integer Q() {
        Integer O10 = O();
        if (O10 != null) {
            return Integer.valueOf(O10.intValue() - this.lastTopInset);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0029, code lost:
    
        if (Lc.q.a(r1) != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void R(BottomSheetBehavior behavior) {
        Integer valueOf;
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        Integer P10 = P();
        if (P10 == null) {
            throw new IllegalStateException("[RNScreens] Failed to find window height during bottom sheet behaviour configuration");
        }
        boolean b10 = q.b(this.screen);
        if (b10) {
            C contentWrapper = this.screen.getContentWrapper();
            if (contentWrapper != null) {
                valueOf = Integer.valueOf(contentWrapper.getHeight());
            }
            valueOf = null;
        } else {
            if (b10) {
                throw new NoWhenBranchMatchedException();
            }
            valueOf = Integer.valueOf((int) (this.screen.getSheetDetents().g() * P10.intValue()));
        }
        a.c(behavior, valueOf, this.screen.getSheetDetents().d() == 3 ? Integer.valueOf(this.screen.getSheetDetents().b(P10.intValue(), this.lastTopInset, this.screen.getSheetShouldOverflowTopInset())) : null);
    }

    public final void S(float baseTranslationY) {
        this.screen.setTranslationY(baseTranslationY - l(this.lastKeyboardBottomOffset));
    }

    @Override // androidx.core.view.J
    public F0 f(View v10, F0 insets) {
        Intrinsics.checkNotNullParameter(v10, "v");
        Intrinsics.checkNotNullParameter(insets, "insets");
        boolean q10 = insets.q(F0.p.b());
        androidx.core.graphics.e f10 = insets.f(F0.p.b());
        Intrinsics.checkNotNullExpressionValue(f10, "getInsets(...)");
        androidx.core.graphics.e f11 = insets.f(F0.p.g());
        Intrinsics.checkNotNullExpressionValue(f11, "getInsets(...)");
        androidx.core.graphics.e f12 = insets.f(F0.p.a());
        Intrinsics.checkNotNullExpressionValue(f12, "getInsets(...)");
        this.lastTopInset = Math.max(f11.f19099b, f12.f19099b);
        if (q10) {
            this.isKeyboardVisible = true;
            this.keyboardState = new C3823n(f10.f19101d);
            BottomSheetBehavior B10 = B();
            if (B10 != null) {
                n(this, B10, this.keyboardState, 0, 4, null);
            }
        } else {
            BottomSheetBehavior B11 = B();
            if (B11 != null) {
                if (this.isKeyboardVisible) {
                    n(this, B11, C3820k.f41979a, 0, 4, null);
                } else {
                    AbstractC3822m abstractC3822m = this.keyboardState;
                    C3821l c3821l = C3821l.f41981a;
                    if (!Intrinsics.areEqual(abstractC3822m, c3821l)) {
                        n(this, B11, c3821l, 0, 4, null);
                    }
                }
            }
            this.keyboardState = C3821l.f41981a;
            this.isKeyboardVisible = false;
        }
        F0 a10 = new F0.a(insets).b(F0.p.g(), androidx.core.graphics.e.c(f11.f19098a, f11.f19099b, f11.f19100c, q10 ? 0 : f11.f19101d)).a();
        Intrinsics.checkNotNullExpressionValue(a10, "build(...)");
        return a10;
    }

    public final void j(AnimatorSet animatorSet, boolean isEnter, Y screenStackFragment) {
        animatorSet.addListener(new Mc.e(screenStackFragment, new Mc.i(this.screen), isEnter ? e.a.f7620a : e.a.f7621b));
        animatorSet.addListener(new f());
    }

    @Override // androidx.lifecycle.InterfaceC2191p
    public void k(InterfaceC2193s source, AbstractC2185j.a event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        int i10 = e.$EnumSwitchMapping$0[event.ordinal()];
        if (i10 == 1) {
            D();
            return;
        }
        if (i10 == 2) {
            H();
            return;
        }
        if (i10 == 3) {
            G();
        } else if (i10 == 4) {
            F();
        } else {
            if (i10 != 5) {
                return;
            }
            E();
        }
    }

    public final int l(int keyboardHeight) {
        Integer P10 = P();
        if (P10 == null) {
            throw new IllegalStateException("[RNScreens] Failed to find window height during bottom sheet behaviour configuration");
        }
        if (!q.b(this.screen)) {
            return Math.min(P10.intValue() - ((int) (RangesKt.coerceIn(this.screen.getSheetDetents().g(), 0.0d, 1.0d) * P10.intValue())), keyboardHeight);
        }
        C contentWrapper = this.screen.getContentWrapper();
        return Math.min(Math.max(P10.intValue() - (contentWrapper != null ? contentWrapper.getHeight() : 0), 0), keyboardHeight);
    }

    public final BottomSheetBehavior m(BottomSheetBehavior behavior, AbstractC3822m keyboardState, int selectedDetentIndex) {
        BottomSheetBehavior bottomSheetBehavior;
        BottomSheetBehavior bottomSheetBehavior2;
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        Intrinsics.checkNotNullParameter(keyboardState, "keyboardState");
        Integer P10 = P();
        if (P10 == null) {
            throw new IllegalStateException("[RNScreens] Failed to find window height during bottom sheet behaviour configuration");
        }
        behavior.U0(true);
        behavior.O0(true);
        behavior.c0(this.sheetStateObserver);
        E footer = this.screen.getFooter();
        if (footer != null) {
            footer.C(behavior);
        }
        if (keyboardState instanceof C3821l) {
            int d10 = this.screen.getSheetDetents().d();
            if (d10 == 1) {
                a.f(behavior, Integer.valueOf(q.b(this.screen) ? this.screen.getSheetDetents().j(this.screen) : this.screen.getSheetDetents().i(P10.intValue())), false, Boolean.valueOf(this.screen.getSheetShouldOverflowTopInset()), 2, null);
                return behavior;
            }
            if (d10 == 2) {
                return a.i(behavior, Integer.valueOf(this.screen.getSheetDetents().k(selectedDetentIndex)), Integer.valueOf(this.screen.getSheetDetents().c(P10.intValue())), Integer.valueOf(this.screen.getSheetDetents().i(P10.intValue())), Boolean.valueOf(this.screen.getSheetShouldOverflowTopInset()));
            }
            if (d10 == 3) {
                return a.g(behavior, Integer.valueOf(this.screen.getSheetDetents().k(selectedDetentIndex)), Integer.valueOf(this.screen.getSheetDetents().c(P10.intValue())), Integer.valueOf(this.screen.getSheetDetents().i(P10.intValue())), Float.valueOf(this.screen.getSheetDetents().e()), Integer.valueOf(this.screen.getSheetDetents().b(P10.intValue(), this.lastTopInset, this.screen.getSheetShouldOverflowTopInset())), Boolean.valueOf(this.screen.getSheetShouldOverflowTopInset()));
            }
            throw new IllegalStateException("[RNScreens] Invalid detent count " + this.screen.getSheetDetents().d() + ". Expected at most 3.");
        }
        if (!(keyboardState instanceof C3823n)) {
            if (!(keyboardState instanceof C3820k)) {
                throw new NoWhenBranchMatchedException();
            }
            behavior.J0(this.keyboardHandlerCallback);
            int d11 = this.screen.getSheetDetents().d();
            if (d11 == 1) {
                a.e(behavior, Integer.valueOf(q.b(this.screen) ? this.screen.getSheetDetents().j(this.screen) : this.screen.getSheetDetents().i(P10.intValue())), false, Boolean.valueOf(this.screen.getSheetShouldOverflowTopInset()));
                return behavior;
            }
            if (d11 == 2) {
                return a.j(behavior, null, Integer.valueOf(this.screen.getSheetDetents().c(P10.intValue())), Integer.valueOf(this.screen.getSheetDetents().i(P10.intValue())), Boolean.valueOf(this.screen.getSheetShouldOverflowTopInset()), 1, null);
            }
            if (d11 == 3) {
                return a.h(behavior, null, Integer.valueOf(this.screen.getSheetDetents().c(P10.intValue())), Integer.valueOf(this.screen.getSheetDetents().i(P10.intValue())), Float.valueOf(this.screen.getSheetDetents().e()), Integer.valueOf(this.screen.getSheetDetents().b(P10.intValue(), this.lastTopInset, this.screen.getSheetShouldOverflowTopInset())), Boolean.valueOf(this.screen.getSheetShouldOverflowTopInset()), 1, null);
            }
            throw new IllegalStateException("[RNScreens] Invalid detent count " + this.screen.getSheetDetents().d() + ". Expected at most 3.");
        }
        boolean z10 = ((C3823n) keyboardState).a() != 0;
        int d12 = this.screen.getSheetDetents().d();
        if (d12 == 1) {
            behavior.c0(this.keyboardHandlerCallback);
            return behavior;
        }
        if (d12 == 2) {
            if (z10) {
                a.j(behavior, 3, null, null, null, 14, null);
                bottomSheetBehavior = behavior;
            } else {
                a.j(behavior, null, null, null, null, 15, null);
                bottomSheetBehavior = behavior;
            }
            bottomSheetBehavior.c0(this.keyboardHandlerCallback);
            return bottomSheetBehavior;
        }
        if (d12 != 3) {
            throw new IllegalStateException("[RNScreens] Invalid detent count " + this.screen.getSheetDetents().d() + ". Expected at most 3.");
        }
        if (z10) {
            bottomSheetBehavior2 = behavior;
            a.h(bottomSheetBehavior2, 3, null, null, null, null, null, 62, null);
        } else {
            bottomSheetBehavior2 = behavior;
            a.h(bottomSheetBehavior2, null, null, null, null, null, null, 63, null);
        }
        bottomSheetBehavior2.c0(this.keyboardHandlerCallback);
        return bottomSheetBehavior2;
    }

    public final ValueAnimator o(float from, float to, final g dimmingDelegate) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(from, to);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: Lc.m
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                SheetDelegate.p(g.this, valueAnimator);
            }
        });
        Intrinsics.checkNotNullExpressionValue(ofFloat, "apply(...)");
        return ofFloat;
    }

    public final Animator q(c sheetAnimationContext) {
        Intrinsics.checkNotNullParameter(sheetAnimationContext, "sheetAnimationContext");
        AnimatorSet animatorSet = new AnimatorSet();
        g b10 = sheetAnimationContext.b();
        Y c10 = sheetAnimationContext.c();
        ValueAnimator o10 = o(0.0f, b10.e(), b10);
        AnimatorSet.Builder play = animatorSet.play(s());
        C3834z c3834z = this.screen;
        if (!b10.j(c3834z, c3834z.getSheetInitialDetentIndex())) {
            play = null;
        }
        if (play != null) {
            play.with(o10);
        }
        j(animatorSet, true, c10);
        return animatorSet;
    }

    public final Animator r(c sheetAnimationContext) {
        Intrinsics.checkNotNullParameter(sheetAnimationContext, "sheetAnimationContext");
        AnimatorSet animatorSet = new AnimatorSet();
        CoordinatorLayout a10 = sheetAnimationContext.a();
        g b10 = sheetAnimationContext.b();
        Y c10 = sheetAnimationContext.c();
        ValueAnimator o10 = o(b10.d().getAlpha(), 0.0f, b10);
        animatorSet.play(o10).with(w(a10));
        j(animatorSet, false, c10);
        return animatorSet;
    }

    public final ValueAnimator s() {
        ValueAnimator ofObject = ValueAnimator.ofObject(new C2915a(new Function1() { // from class: Lc.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                float t10;
                t10 = SheetDelegate.t(SheetDelegate.this, (Number) obj);
                return Float.valueOf(t10);
            }
        }, new Function1() { // from class: Lc.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Float u10;
                u10 = SheetDelegate.u((Number) obj);
                return u10;
            }
        }), Float.valueOf(this.screen.getHeight()), Float.valueOf(0.0f));
        ofObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: Lc.l
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                SheetDelegate.v(SheetDelegate.this, valueAnimator);
            }
        });
        Intrinsics.checkNotNullExpressionValue(ofObject, "apply(...)");
        return ofObject;
    }

    public final ValueAnimator w(CoordinatorLayout coordinatorLayout) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, (coordinatorLayout.getBottom() - this.screen.getTop()) - this.screen.getTranslationY());
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: Lc.n
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                SheetDelegate.x(SheetDelegate.this, valueAnimator);
            }
        });
        Intrinsics.checkNotNullExpressionValue(ofFloat, "apply(...)");
        return ofFloat;
    }

    public final InputMethodManager y() {
        Object systemService = this.screen.getReactContext().getSystemService("input_method");
        if (systemService instanceof InputMethodManager) {
            return (InputMethodManager) systemService;
        }
        return null;
    }

    /* renamed from: z, reason: from getter */
    public final int getLastStableDetentIndex() {
        return this.lastStableDetentIndex;
    }
}
