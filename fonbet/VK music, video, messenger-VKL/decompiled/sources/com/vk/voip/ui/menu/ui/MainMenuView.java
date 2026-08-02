package com.vk.voip.ui.menu.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.log.L;
import com.vk.voip.ui.R$styleable;
import com.vk.voip.ui.menu.ui.actions.PrimaryActionsView;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.subjects.f;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.biq;
import xsna.bqx0;
import xsna.bwt0;
import xsna.cn70;
import xsna.df00;
import xsna.epx;
import xsna.gt;
import xsna.qa9;
import xsna.s0p0;
import xsna.t70;
import xsna.tmg0;
import xsna.vlp0;
import xsna.wu;
import xsna.xq;
import xsna.zmp0;
import xsna.zrp;

/* compiled from: MainMenuView.kt */
/* loaded from: classes7.dex */
public final class MainMenuView extends FrameLayout implements tmg0, qa9 {
    public static final float s = cn70.a() * 10.0f;
    public final ViewGroup b;
    public final View c;
    public final PortalView d;
    public final View e;
    public final PrimaryActionsView f;
    public final com.vk.voip.ui.menu.ui.b g;
    public final f<b> h;
    public final View i;
    public final View j;
    public boolean k;
    public ExpandedState l;
    public final View m;
    public final View n;
    public final View o;
    public final s0p0.a p;
    public t70 q;
    public final UIMode r;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MainMenuView.kt */
    public static final class ExpandedState {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ExpandedState[] $VALUES;
        public static final ExpandedState COLLAPSED;
        public static final ExpandedState EXPANDED;
        public static final ExpandedState INTERMEDIATE;

        static {
            ExpandedState expandedState = new ExpandedState("EXPANDED", 0);
            EXPANDED = expandedState;
            ExpandedState expandedState2 = new ExpandedState("COLLAPSED", 1);
            COLLAPSED = expandedState2;
            ExpandedState expandedState3 = new ExpandedState("INTERMEDIATE", 2);
            INTERMEDIATE = expandedState3;
            ExpandedState[] expandedStateArr = {expandedState, expandedState2, expandedState3};
            $VALUES = expandedStateArr;
            $ENTRIES = new asp(expandedStateArr);
        }

        public ExpandedState() {
            throw null;
        }

        public static ExpandedState valueOf(String str) {
            return (ExpandedState) Enum.valueOf(ExpandedState.class, str);
        }

        public static ExpandedState[] values() {
            return (ExpandedState[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MainMenuView.kt */
    public static final class UIMode {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ UIMode[] $VALUES;
        public static final UIMode FLYING;
        public static final UIMode REGULAR;

        static {
            UIMode uIMode = new UIMode("REGULAR", 0);
            REGULAR = uIMode;
            UIMode uIMode2 = new UIMode("FLYING", 1);
            FLYING = uIMode2;
            UIMode[] uIModeArr = {uIMode, uIMode2};
            $VALUES = uIModeArr;
            $ENTRIES = new asp(uIModeArr);
        }

        public UIMode() {
            throw null;
        }

        public static UIMode valueOf(String str) {
            return (UIMode) Enum.valueOf(UIMode.class, str);
        }

        public static UIMode[] values() {
            return (UIMode[]) $VALUES.clone();
        }
    }

    /* compiled from: MainMenuView.kt */
    public static final class a {
        public static final UIMode a(TypedArray typedArray) {
            Class<?> loadClass;
            UIMode a;
            float f = MainMenuView.s;
            try {
                String string = typedArray.getString(3);
                try {
                    ClassLoader classLoader = a.class.getClassLoader();
                    if (classLoader != null && (loadClass = classLoader.loadClass(string)) != null) {
                        Object newInstance = loadClass.newInstance();
                        c cVar = newInstance instanceof c ? (c) newInstance : null;
                        if (cVar != null && (a = cVar.a()) != null) {
                            return a;
                        }
                    }
                    return UIMode.REGULAR;
                } catch (Throwable th) {
                    StringBuilder sb = new StringBuilder("Error on trying to select ui mode using  ");
                    sb.append(string);
                    sb.append(", default to ");
                    UIMode uIMode = UIMode.REGULAR;
                    sb.append(uIMode);
                    L.g(sb.toString(), th);
                    return uIMode;
                }
            } catch (Throwable th2) {
                StringBuilder sb2 = new StringBuilder("Can't get actions ui mode selector for main menu, default to ");
                UIMode uIMode2 = UIMode.REGULAR;
                sb2.append(uIMode2);
                L.e(sb2.toString(), th2);
                return uIMode2;
            }
        }
    }

    /* compiled from: MainMenuView.kt */
    public interface b {

        /* compiled from: MainMenuView.kt */
        public static final class a implements b {
            public static final a a = new a();
        }

        /* compiled from: MainMenuView.kt */
        /* renamed from: com.vk.voip.ui.menu.ui.MainMenuView$b$b, reason: collision with other inner class name */
        public static final class C2065b implements b {
            public static final C2065b a = new C2065b();
        }

        /* compiled from: MainMenuView.kt */
        public static final class c implements b {
            public static final c a = new c();
        }

        /* compiled from: MainMenuView.kt */
        public static final class d implements b {
            public final float a;

            public d(float f) {
                this.a = f;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && Float.compare(this.a, ((d) obj).a) == 0;
            }

            public final int hashCode() {
                return Float.hashCode(this.a);
            }

            public final String toString() {
                return xq.c(')', this.a, new StringBuilder("BottomSheetSlideOffsetChanged(offset="));
            }
        }
    }

    /* compiled from: MainMenuView.kt */
    public interface c {
        UIMode a();
    }

    /* compiled from: MainMenuView.kt */
    public static final /* synthetic */ class d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[UIMode.values().length];
            try {
                iArr[UIMode.REGULAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UIMode.FLYING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ExpandedState.values().length];
            try {
                iArr2[ExpandedState.EXPANDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ExpandedState.COLLAPSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* compiled from: MainMenuView.kt */
    public static final class e implements df00.a {
        public e() {
        }

        @Override // xsna.df00.a
        public final MainMenuView a() {
            return MainMenuView.this;
        }

        @Override // xsna.df00.a
        public final View b() {
            return MainMenuView.this.c;
        }
    }

    public MainMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        int i;
        this.h = new f<>();
        this.k = true;
        this.l = ExpandedState.COLLAPSED;
        this.r = UIMode.REGULAR;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.b, 0, 0);
        try {
            UIMode a2 = a.a(obtainStyledAttributes);
            this.r = a2;
            int resourceId = obtainStyledAttributes.getResourceId(1, 0);
            View view = null;
            Integer valueOf = resourceId == 0 ? null : Integer.valueOf(resourceId);
            int resourceId2 = obtainStyledAttributes.getResourceId(2, 0);
            Integer valueOf2 = resourceId2 == 0 ? null : Integer.valueOf(resourceId2);
            int resourceId3 = obtainStyledAttributes.getResourceId(0, 0);
            this.p = new s0p0.a(valueOf, resourceId3 == 0 ? null : Integer.valueOf(resourceId3), valueOf2);
            obtainStyledAttributes.recycle();
            LayoutInflater from = LayoutInflater.from(context);
            int i2 = d.$EnumSwitchMapping$0[a2.ordinal()];
            if (i2 == 1) {
                i = R.layout.voip_call_view_slide_up_menu_view;
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R.layout.voip_call_view_slide_up_menu_flying_view;
            }
            from.inflate(i, (ViewGroup) this, true);
            this.b = (ViewGroup) findViewById(R.id.voip_extended_options_content_box);
            this.j = findViewById(R.id.swipe_indicator);
            View findViewById = findViewById(R.id.bottom_sheet);
            this.c = findViewById;
            this.f = (PrimaryActionsView) findViewById(R.id.primary_buttons);
            this.d = (PortalView) findViewById(R.id.voip_extended_options_portal);
            this.e = findViewById(R.id.voip_extended_options_container_wall);
            View findViewById2 = findViewById(R.id.voip_extended_options_content_box_touch_interceptor);
            bwt0.i0(findViewById2, new gt(27));
            this.i = findViewById2;
            this.m = findViewById(R.id.voip_extended_options_container);
            View findViewById3 = findViewById(R.id.voip_extended_options_container_background);
            if (findViewById3 != null) {
                bwt0.p0(findViewById3, false);
            } else {
                findViewById3 = null;
            }
            this.n = findViewById3;
            View findViewById4 = findViewById(R.id.fade);
            if (findViewById4 != null) {
                findViewById4.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                bwt0.p0(findViewById4, true);
                view = findViewById4;
            }
            this.o = view;
            this.g = new com.vk.voip.ui.menu.ui.b(findViewById, new com.vk.voip.ui.menu.ui.c(1, this, MainMenuView.class, "publishEvent", "publishEvent(Lcom/vk/voip/ui/menu/ui/MainMenuView$Event;)V", 0));
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // xsna.qa9
    public final void a(float f) {
        PortalView portalView = this.d;
        if (portalView != null) {
            portalView.setAlpha(f);
        }
    }

    public final void b() {
        biq biqVar = new biq();
        View view = this.j;
        vlp0 addTarget = biqVar.addTarget(view);
        bwt0.p0(view, this.l != ExpandedState.EXPANDED || this.k);
        zmp0.a(this, addTarget);
    }

    public final t70 getActionsProvider$ui_release() {
        return this.q;
    }

    public final float getActionsTranslationY() {
        return this.f.getTranslationY();
    }

    public final df00.a getAnimatedViewsProvider$ui_release() {
        return new e();
    }

    @Override // xsna.tmg0
    public List<View> getAnimatedViewsToRotate() {
        return this.f.getAnimatedViewsToRotate();
    }

    public final int getBottomOffset$ui_release() {
        if (bwt0.K(this)) {
            ViewGroup.LayoutParams layoutParams = this.f.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                return marginLayoutParams.bottomMargin;
            }
        }
        return 0;
    }

    public final int getControlsHeight() {
        return cn70.b(this.r == UIMode.FLYING ? 80 : 108);
    }

    public final wu.a getToggleButtonConfig$ui_release() {
        return this.p;
    }

    public final UIMode getUiMode() {
        return this.r;
    }

    @Override // xsna.tmg0
    public List<View> getViewsToRotate() {
        return this.f.getViewsToRotate();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        if (windowInsets != null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                int i = bqx0.h(null, windowInsets).a.i(519).b;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (marginLayoutParams.topMargin != i) {
                    marginLayoutParams.topMargin = i;
                    setLayoutParams(layoutParams);
                }
            }
        }
        return super.onApplyWindowInsets(windowInsets);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return !(isEnabled() || motionEvent == null || motionEvent.getAction() != 0) || super.onInterceptTouchEvent(motionEvent);
    }

    public final void setActionsProvider$ui_release(t70 t70Var) {
        if (epx.f(this.q, t70Var)) {
            return;
        }
        this.q = t70Var;
        PrimaryActionsView primaryActionsView = this.f;
        if (t70Var != null) {
            t70Var.d(primaryActionsView);
        }
        t70 t70Var2 = this.q;
        if (t70Var2 == null) {
            t70Var2 = new t70.a();
        }
        primaryActionsView.a(t70Var2, false);
    }

    public final void setActionsTranslationY(float f) {
        this.f.setTranslationY(f);
        boolean z = f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        View view = this.c;
        View view2 = this.e;
        if (z) {
            if (view2 != null) {
                view2.setElevation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            view.setElevation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } else {
            float f2 = s;
            if (view2 != null) {
                view2.setElevation(f2);
            }
            view.setElevation(f2);
        }
    }

    public final void setExpandedFraction(float f) {
        double d2 = f;
        float pow = (float) Math.pow(d2, 2.0f);
        this.b.setAlpha(pow);
        View view = this.o;
        if (view != null) {
            view.setAlpha(pow);
        }
        this.j.setScaleY(d2 > 0.5d ? -1.0f : 1.0f);
    }

    public final void setExpandedState$ui_release(ExpandedState expandedState) {
        this.l = expandedState;
        bwt0.p0(this.i, expandedState != ExpandedState.EXPANDED);
        int i = d.$EnumSwitchMapping$1[expandedState.ordinal()];
        if (i == 1) {
            setExpandedFraction(1.0f);
        } else if (i == 2) {
            setExpandedFraction(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            com.vk.voip.ui.menu.ui.b bVar = this.g;
            bVar.b.X(4);
            bVar.a.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        b();
    }

    public final void setMenuBackgroundColor(int i) {
        View view = this.e;
        if (view != null) {
            view.setBackgroundColor(i);
        }
        View view2 = this.n;
        if (view2 != null) {
            view2.setBackgroundColor(i);
        }
        View view3 = this.c;
        Drawable mutate = view3.getBackground().mutate();
        GradientDrawable gradientDrawable = mutate instanceof GradientDrawable ? (GradientDrawable) mutate : null;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(i);
        }
        view3.setBackground(mutate);
    }

    public final void setMenuEnabled(boolean z) {
        View view = this.n;
        if (view != null) {
            bwt0.p0(view, !z);
        }
        this.f.setTranslationY(z ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : (-16.0f) * cn70.a());
        bwt0.p0(this.c, z);
    }

    public final void setPortalVisible(boolean z) {
        PortalView portalView = this.d;
        if (portalView != null) {
            bwt0.p0(portalView, z);
        }
    }

    public final void setShowingRoot(boolean z) {
        this.k = z;
        b();
    }

    public final void setSwipeIndicatorColor(int i) {
        ((ImageView) this.j).setColorFilter(i);
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        View view = this.o;
        if (view != null) {
            view.setTranslationY(-f);
        }
    }
}
