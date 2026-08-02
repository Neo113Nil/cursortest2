package com.vk.core.view.components.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.tool.view.vkblur.VkBlurContentView;
import com.vk.core.view.components.R$styleable;
import com.vk.core.view.components.counter.VkCounter;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;
import java.util.Iterator;
import kotlin.Pair;
import xsna.asp;
import xsna.avj;
import xsna.dfu0;
import xsna.e3m;
import xsna.e43;
import xsna.epx;
import xsna.exj;
import xsna.f4m;
import xsna.gaz;
import xsna.gpo0;
import xsna.hbh0;
import xsna.his0;
import xsna.hp8;
import xsna.krv0;
import xsna.kxt0;
import xsna.mxt0;
import xsna.r890;
import xsna.ro;
import xsna.s3q0;
import xsna.sex0;
import xsna.stw;
import xsna.too0;
import xsna.zrp;

/* compiled from: VkButton.kt */
/* loaded from: classes.dex */
public class VkButton extends ConstraintLayout implements too0 {
    public static final int[] W = {R.id.ds_internal_button_progress_indicator, R.id.ds_internal_button_icon, R.id.ds_internal_title_container, R.id.ds_internal_button_counter, R.id.ds_internal_button_trailing_icon};
    public exj A;
    public hp8 B;
    public Integer C;
    public Integer D;
    public Integer E;
    public final Float F;
    public final GradientDrawable G;
    public final gaz H;
    public dfu0 I;
    public final RippleDrawable J;
    public final VkText K;
    public final FrameLayout L;
    public AppCompatImageView M;
    public AppCompatImageView N;
    public VkCounter O;
    public VkCounter.Size P;
    public ProgressBar Q;
    public int R;
    public Integer S;
    public boolean T;
    public boolean U;
    public boolean V;
    public Size t;
    public Mode u;
    public Appearance v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkButton.kt */
    public static final class Appearance {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Appearance[] $VALUES;
        public static final Appearance Accent;
        public static final Appearance Negative;
        public static final Appearance Neutral;
        public static final Appearance Overlay;
        public static final Appearance Positive;

        static {
            Appearance appearance = new Appearance("Accent", 0);
            Accent = appearance;
            Appearance appearance2 = new Appearance("Positive", 1);
            Positive = appearance2;
            Appearance appearance3 = new Appearance("Negative", 2);
            Negative = appearance3;
            Appearance appearance4 = new Appearance("Neutral", 3);
            Neutral = appearance4;
            Appearance appearance5 = new Appearance("Overlay", 4);
            Overlay = appearance5;
            Appearance[] appearanceArr = {appearance, appearance2, appearance3, appearance4, appearance5};
            $VALUES = appearanceArr;
            $ENTRIES = new asp(appearanceArr);
        }

        public Appearance() {
            throw null;
        }

        public static zrp<Appearance> h() {
            return $ENTRIES;
        }

        public static Appearance valueOf(String str) {
            return (Appearance) Enum.valueOf(Appearance.class, str);
        }

        public static Appearance[] values() {
            return (Appearance[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkButton.kt */
    public static final class Mode {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Mode[] $VALUES;
        public static final Mode Link;
        public static final Mode Outline;
        public static final Mode Primary;
        public static final Mode Secondary;
        public static final Mode Tertiary;

        static {
            Mode mode = new Mode("Primary", 0);
            Primary = mode;
            Mode mode2 = new Mode("Secondary", 1);
            Secondary = mode2;
            Mode mode3 = new Mode("Tertiary", 2);
            Tertiary = mode3;
            Mode mode4 = new Mode("Outline", 3);
            Outline = mode4;
            Mode mode5 = new Mode("Link", 4);
            Link = mode5;
            Mode[] modeArr = {mode, mode2, mode3, mode4, mode5};
            $VALUES = modeArr;
            $ENTRIES = new asp(modeArr);
        }

        public Mode() {
            throw null;
        }

        public static zrp<Mode> h() {
            return $ENTRIES;
        }

        public static Mode valueOf(String str) {
            return (Mode) Enum.valueOf(Mode.class, str);
        }

        public static Mode[] values() {
            return (Mode[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkButton.kt */
    public static final class Size {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Size[] $VALUES;
        public static final Size Large;
        public static final Size Medium;
        public static final Size Small;

        static {
            Size size = new Size("Small", 0);
            Small = size;
            Size size2 = new Size("Medium", 1);
            Medium = size2;
            Size size3 = new Size("Large", 2);
            Large = size3;
            Size[] sizeArr = {size, size2, size3};
            $VALUES = sizeArr;
            $ENTRIES = new asp(sizeArr);
        }

        public Size() {
            throw null;
        }

        public static zrp<Size> h() {
            return $ENTRIES;
        }

        public static Size valueOf(String str) {
            return (Size) Enum.valueOf(Size.class, str);
        }

        public static Size[] values() {
            return (Size[]) $VALUES.clone();
        }
    }

    public VkButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public static void T4(VkButton vkButton, Integer num, Drawable drawable, int i) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            drawable = null;
        }
        if (vkButton.N == null) {
            if (num != null && num.intValue() == 0 && drawable == null) {
                return;
            }
            AppCompatImageView appCompatImageView = new AppCompatImageView(vkButton.getContext());
            appCompatImageView.setImportantForAccessibility(2);
            appCompatImageView.setVisibility(8);
            vkButton.Y4(R.id.ds_internal_button_icon, appCompatImageView);
            vkButton.N = appCompatImageView;
        }
    }

    public static void U4(VkButton vkButton, Integer num, Drawable drawable, int i) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            drawable = null;
        }
        if (vkButton.M == null) {
            if (num != null && num.intValue() == 0 && drawable == null) {
                return;
            }
            AppCompatImageView appCompatImageView = new AppCompatImageView(vkButton.getContext());
            appCompatImageView.setVisibility(8);
            appCompatImageView.setImportantForAccessibility(2);
            vkButton.Y4(R.id.ds_internal_button_trailing_icon, appCompatImageView);
            vkButton.M = appCompatImageView;
        }
    }

    private final a getDefaults() {
        getContext();
        return c.a;
    }

    @Override // xsna.too0
    public final void Ng() {
        g5();
        X4();
    }

    public final void P4(int i) {
        View view = new View(getContext());
        view.setId(i);
        view.setVisibility(8);
        addView(view, new ConstraintLayout.b(hbh0.b(24, getContext()), hbh0.b(24, getContext())));
    }

    public final void Q4() {
        X4();
        invalidate();
    }

    public final void V4() {
        ProgressBar progressBar = this.Q;
        Drawable indeterminateDrawable = progressBar != null ? progressBar.getIndeterminateDrawable() : null;
        stw stwVar = indeterminateDrawable instanceof stw ? (stw) indeterminateDrawable : null;
        if (stwVar != null) {
            int j = getDefaults().j(getContext(), this.t);
            stwVar.a(getDefaults().r(getContext(), this.t));
            stwVar.c = j;
            stwVar.invalidateSelf();
        }
    }

    public final void X4() {
        Pair pair;
        int d;
        AppCompatImageView appCompatImageView;
        AppCompatImageView appCompatImageView2;
        Integer num = this.C;
        if (num == null) {
            num = getDefaults().e(this.u, this.v);
        }
        hp8 hp8Var = this.B;
        if (hp8Var == null) {
            hp8Var = getDefaults().m(this.u, this.v);
        }
        if (this.z) {
            gpo0.i(this.K, hp8Var.b);
        }
        if (this.w && (appCompatImageView2 = this.N) != null) {
            gpo0.f(appCompatImageView2, Integer.valueOf(hp8Var.c));
        }
        if (this.x && (appCompatImageView = this.M) != null) {
            gpo0.f(appCompatImageView, Integer.valueOf(hp8Var.c));
        }
        ProgressBar progressBar = this.Q;
        if (progressBar != null) {
            progressBar.setIndeterminateTintList(ColorStateList.valueOf(gpo0.d(hp8Var.c, this)));
        }
        exj exjVar = this.A;
        if (exjVar != null) {
            getContext();
            int a = com.vk.core.view.components.counter.a.a(exjVar.b(), exjVar.a());
            getContext();
            pair = new Pair(Integer.valueOf(a), Integer.valueOf(com.vk.core.view.components.counter.a.c(exjVar.b(), exjVar.a())));
        } else {
            pair = new Pair(Integer.valueOf(hp8Var.e), Integer.valueOf(hp8Var.d));
        }
        int intValue = ((Number) pair.d()).intValue();
        int intValue2 = ((Number) pair.g()).intValue();
        VkCounter vkCounter = this.O;
        if (vkCounter != null) {
            gpo0.e(intValue, vkCounter);
        }
        VkCounter vkCounter2 = this.O;
        if (vkCounter2 != null) {
            vkCounter2.setTextColor$foundation_release(intValue2);
        }
        if (this.u == Mode.Link) {
            setBackground(this.H);
            return;
        }
        if (this.y) {
            d = gpo0.d(hp8Var.a, this);
        } else {
            int i = this.R;
            if (i == -1) {
                return;
            } else {
                d = gpo0.d(i, this);
            }
        }
        int d2 = num != null ? gpo0.d(num.intValue(), this) : 0;
        float c = getDefaults().c(getContext(), this.u, this.v);
        if (this.I != null) {
            a defaults = getDefaults();
            getContext();
            defaults.getClass();
        }
        GradientDrawable gradientDrawable = this.G;
        gradientDrawable.setColor(d);
        gradientDrawable.setStroke((int) c, d2);
        RippleDrawable rippleDrawable = this.J;
        if (!epx.f(rippleDrawable.getDrawable(0), gradientDrawable)) {
            rippleDrawable.setDrawable(0, gradientDrawable);
        }
        rippleDrawable.setColor(ro.c(d, null));
        setBackground(rippleDrawable);
    }

    public final void Y4(int i, View view) {
        Iterator<View> it = mxt0.b(this).iterator();
        int i2 = 0;
        while (true) {
            kxt0 kxt0Var = (kxt0) it;
            if (!kxt0Var.hasNext()) {
                return;
            }
            Object next = kxt0Var.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                e43.t();
                throw null;
            }
            if (((View) next).getId() == i) {
                androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
                bVar.i(this);
                view.setId(i);
                removeViewAt(i2);
                addView(view, i2);
                bVar.b(this);
            }
            i2 = i3;
        }
    }

    public final void Z4(Drawable drawable, boolean z) {
        AppCompatImageView appCompatImageView;
        T4(this, null, drawable, 1);
        if (!z && (appCompatImageView = this.N) != null) {
            gpo0.a(appCompatImageView);
        }
        AppCompatImageView appCompatImageView2 = this.N;
        if (appCompatImageView2 != null) {
            appCompatImageView2.setImageDrawable(drawable);
        }
        AppCompatImageView appCompatImageView3 = this.N;
        if (appCompatImageView3 != null) {
            appCompatImageView3.setVisibility(0);
        }
        setIconColorful(z);
        g5();
    }

    public final void a5(boolean z, Integer num) {
        AppCompatImageView appCompatImageView;
        T4(this, num, null, 2);
        if (!z && (appCompatImageView = this.N) != null) {
            gpo0.a(appCompatImageView);
        }
        AppCompatImageView appCompatImageView2 = this.N;
        if (appCompatImageView2 != null) {
            sex0.j(appCompatImageView2, num);
        }
        setIconColorful(z);
        g5();
    }

    public final void c5(Drawable drawable, boolean z) {
        AppCompatImageView appCompatImageView;
        U4(this, null, drawable, 1);
        if (!z && (appCompatImageView = this.M) != null) {
            gpo0.a(appCompatImageView);
        }
        AppCompatImageView appCompatImageView2 = this.M;
        if (appCompatImageView2 != null) {
            appCompatImageView2.setImageDrawable(drawable);
        }
        setTrailingIconColorful(z);
        AppCompatImageView appCompatImageView3 = this.M;
        if (appCompatImageView3 != null) {
            appCompatImageView3.setVisibility(0);
        }
        g5();
    }

    public final void d5(Integer num) {
        U4(this, num, null, 2);
        AppCompatImageView appCompatImageView = this.M;
        if (appCompatImageView != null) {
            sex0.j(appCompatImageView, num);
        }
        setTrailingIconColorful(true);
        g5();
    }

    public final void e5() {
        int i = this.R;
        Integer valueOf = Integer.valueOf(i);
        if (i == -1) {
            valueOf = null;
        }
        if (valueOf != null) {
            this.J.setColor(ro.c(gpo0.d(valueOf.intValue(), this), null));
        }
    }

    public final void f5() {
        VkCounter vkCounter;
        AppCompatImageView appCompatImageView;
        AppCompatImageView appCompatImageView2 = this.N;
        this.V = ((appCompatImageView2 != null && appCompatImageView2.getVisibility() == 0) || this.T) && this.K.getText().length() == 0 && ((vkCounter = this.O) == null || vkCounter.getVisibility() != 0) && ((appCompatImageView = this.M) == null || appCompatImageView.getVisibility() != 0);
    }

    public final void g5() {
        f5();
        if (this.V) {
            getContext();
        }
        setMinHeight(getDefaults().a(getContext(), this.t));
        r890 k = getDefaults().k(getContext(), this.t, this.u);
        int d = k.a - (getDefaults().d(getContext()) / 2);
        setPadding(d, k.b, d, k.d);
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "android.widget.Button";
    }

    public final Appearance getAppearance() {
        return this.v;
    }

    public final boolean getBackgroundColorful() {
        return this.y;
    }

    public final GradientDrawable getBackgroundDrawable() {
        return this.G;
    }

    public final exj getCounterAttributesOverride() {
        return this.A;
    }

    public final Integer getCustomBorderColor() {
        return this.C;
    }

    public final hp8 getCustomButtonColors() {
        return this.B;
    }

    public final boolean getIconColorful() {
        return this.w;
    }

    public final Mode getMode() {
        return this.u;
    }

    public final Size getSize() {
        return this.t;
    }

    public final boolean getTextColorful() {
        return this.z;
    }

    public final boolean getTrailingIconColorful() {
        return this.x;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        Integer num;
        f5();
        if (!this.T || (num = this.S) == null || this.V) {
            super.onMeasure(i, i2);
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(num.intValue(), 1073741824), i2);
        }
    }

    public final void setAppearance(Appearance appearance) {
        this.v = appearance;
        Q4();
    }

    public final void setBackgroundColorful(boolean z) {
        this.y = z;
        Q4();
    }

    public final void setBackgroundTint(int i) {
        this.G.setColor(gpo0.d(i, this));
        dfu0 dfu0Var = this.I;
        if (dfu0Var != null) {
            dfu0Var.d(Integer.valueOf(gpo0.d(i, this)));
        }
        this.R = i;
        setBackgroundColorful(false);
        e5();
    }

    public final void setCornerRadius(Float f) {
        float floatValue = f != null ? f.floatValue() : getDefaults().p(getContext(), this.t);
        setOutlineProvider(new avj(floatValue));
        this.G.setCornerRadius(floatValue);
        dfu0 dfu0Var = this.I;
        if (dfu0Var != null) {
            dfu0Var.c(floatValue);
        }
    }

    public final void setCount(Integer num) {
        if (num != null) {
            if (this.O == null) {
                VkCounter vkCounter = new VkCounter(getContext());
                VkCounter.Size size = this.P;
                if (size == null) {
                    size = getDefaults().n(this.t);
                }
                vkCounter.setSize(size);
                Y4(R.id.ds_internal_button_counter, vkCounter);
                this.O = vkCounter;
                X4();
            }
            VkCounter vkCounter2 = this.O;
            if (vkCounter2 == null || vkCounter2.getVisibility() != 0) {
                VkCounter vkCounter3 = this.O;
                if (vkCounter3 != null) {
                    vkCounter3.setCounterWithoutAnimation(num.intValue());
                }
            } else {
                VkCounter vkCounter4 = this.O;
                if (vkCounter4 != null) {
                    vkCounter4.setCounterWithAnimation(num.intValue());
                }
            }
        }
        VkCounter vkCounter5 = this.O;
        if (vkCounter5 != null) {
            f4m.E(vkCounter5, num != null);
        }
        g5();
    }

    public final void setCounterAttributesOverride(exj exjVar) {
        this.A = exjVar;
        Q4();
    }

    public final void setCounterSize(VkCounter.Size size) {
        this.P = size;
        if (size == null) {
            size = getDefaults().n(this.t);
        }
        VkCounter vkCounter = this.O;
        if (vkCounter != null) {
            vkCounter.setSize(size);
        }
    }

    public final void setCustomBorderColor(Integer num) {
        this.C = num;
        X4();
    }

    public final void setCustomButtonColors(hp8 hp8Var) {
        this.B = hp8Var;
        X4();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        setAlpha(his0.r(z));
    }

    public final void setHideContentOnLoading(boolean z) {
        this.U = z;
    }

    public final void setIconColorful(boolean z) {
        this.w = z;
        Q4();
    }

    public final void setIconSize(Integer num) {
        this.D = num;
        int intValue = num != null ? num.intValue() : getDefaults().i(getContext(), this.t);
        AppCompatImageView appCompatImageView = this.N;
        if (appCompatImageView != null) {
            ViewGroup.LayoutParams layoutParams = appCompatImageView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.height = intValue;
            layoutParams.width = intValue;
            appCompatImageView.setLayoutParams(layoutParams);
        }
    }

    public final void setIconTint(int i) {
        AppCompatImageView appCompatImageView = this.N;
        if (appCompatImageView != null) {
            gpo0.f(appCompatImageView, Integer.valueOf(i));
        }
        setIconColorful(false);
    }

    public final void setIconVisible(boolean z) {
        AppCompatImageView appCompatImageView = this.N;
        if (appCompatImageView != null) {
            appCompatImageView.setVisibility(z ? 0 : 8);
        }
    }

    public final void setLoading(boolean z) {
        if (this.T != z) {
            FrameLayout frameLayout = this.L;
            int i = 8;
            if (z) {
                if (getWidth() > 0) {
                    this.S = Integer.valueOf(getWidth());
                }
                if (this.U) {
                    AppCompatImageView appCompatImageView = this.N;
                    if (appCompatImageView != null) {
                        appCompatImageView.setVisibility(8);
                    }
                    AppCompatImageView appCompatImageView2 = this.M;
                    if (appCompatImageView2 != null) {
                        appCompatImageView2.setVisibility(8);
                    }
                    VkCounter vkCounter = this.O;
                    if (vkCounter != null) {
                        vkCounter.setVisibility(8);
                    }
                    frameLayout.setVisibility(8);
                }
            } else {
                this.S = null;
                AppCompatImageView appCompatImageView3 = this.N;
                if (appCompatImageView3 != null) {
                    appCompatImageView3.setVisibility(0);
                }
                AppCompatImageView appCompatImageView4 = this.M;
                if (appCompatImageView4 != null) {
                    appCompatImageView4.setVisibility(0);
                }
                VkCounter vkCounter2 = this.O;
                if (vkCounter2 != null) {
                    vkCounter2.setVisibility(0);
                }
                CharSequence text = this.K.getText();
                if (text != null && text.length() != 0) {
                    i = 0;
                }
                frameLayout.setVisibility(i);
            }
            this.T = z;
        }
        if (this.Q == null && z) {
            ProgressBar progressBar = new ProgressBar(getContext());
            progressBar.setIndeterminate(true);
            progressBar.setIndeterminateDrawable(new stw(progressBar));
            Y4(R.id.ds_internal_button_progress_indicator, progressBar);
            this.Q = progressBar;
            V4();
            int j = getDefaults().j(getContext(), this.t);
            ProgressBar progressBar2 = this.Q;
            if (progressBar2 != null) {
                ViewGroup.LayoutParams layoutParams = progressBar2.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams.height = j;
                layoutParams.width = j;
                progressBar2.setLayoutParams(layoutParams);
            }
            X4();
        }
        ProgressBar progressBar3 = this.Q;
        if (progressBar3 != null) {
            f4m.E(progressBar3, z);
        }
        g5();
    }

    public final void setMode(Mode mode) {
        this.u = mode;
        g5();
        X4();
        requestLayout();
        invalidate();
    }

    public final void setSize(Size size) {
        this.t = size;
        int h = getDefaults().h(getContext(), this.t);
        int a = getDefaults().a(getContext(), this.t);
        Integer num = this.D;
        int intValue = num != null ? num.intValue() : getDefaults().i(getContext(), this.t);
        Integer num2 = this.E;
        int intValue2 = num2 != null ? num2.intValue() : getDefaults().i(getContext(), this.t);
        int d = getDefaults().d(getContext());
        VkCounter.Size size2 = this.P;
        if (size2 == null) {
            size2 = getDefaults().n(this.t);
        }
        int j = getDefaults().j(getContext(), this.t);
        setMinHeight(a);
        this.K.setTextAppearance(h);
        AppCompatImageView appCompatImageView = this.N;
        if (appCompatImageView != null) {
            ViewGroup.LayoutParams layoutParams = appCompatImageView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.height = intValue;
            layoutParams.width = intValue;
            appCompatImageView.setLayoutParams(layoutParams);
        }
        AppCompatImageView appCompatImageView2 = this.M;
        if (appCompatImageView2 != null) {
            ViewGroup.LayoutParams layoutParams2 = appCompatImageView2.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams2.height = intValue2;
            layoutParams2.width = intValue2;
            appCompatImageView2.setLayoutParams(layoutParams2);
        }
        ProgressBar progressBar = this.Q;
        if (progressBar != null) {
            ViewGroup.LayoutParams layoutParams3 = progressBar.getLayoutParams();
            if (layoutParams3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams3.height = j;
            layoutParams3.width = j;
            progressBar.setLayoutParams(layoutParams3);
        }
        V4();
        androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
        bVar.i(this);
        for (int i = 0; i < 5; i++) {
            int i2 = W[i];
            int i3 = d / 2;
            bVar.G(i2, 6, i3);
            bVar.G(i2, 7, i3);
        }
        bVar.b(this);
        g5();
        VkCounter vkCounter = this.O;
        if (vkCounter != null) {
            vkCounter.setSize(size2);
        }
        setCornerRadius(this.F);
        X4();
        requestLayout();
        invalidate();
    }

    public final void setText(CharSequence charSequence) {
        this.K.setText(charSequence);
        boolean z = this.T;
        FrameLayout frameLayout = this.L;
        if (z && this.U) {
            frameLayout.setVisibility(8);
        } else {
            frameLayout.setVisibility(charSequence == null || charSequence.length() == 0 ? 8 : 0);
        }
        g5();
    }

    public final void setTextColorful(boolean z) {
        this.z = z;
        Q4();
    }

    public final void setTextMaxWidth(int i) {
        this.K.setMaxWidth(i);
    }

    public final void setTextTint(int i) {
        gpo0.i(this.K, i);
        setTextColorful(false);
    }

    public final void setTextVisibility(boolean z) {
        this.L.setVisibility(!z ? 8 : 0);
    }

    public final void setTrailingIconColorful(boolean z) {
        this.x = z;
        Q4();
    }

    public final void setTrailingIconSize(Integer num) {
        this.E = num;
        int intValue = num != null ? num.intValue() : getDefaults().i(getContext(), this.t);
        AppCompatImageView appCompatImageView = this.M;
        if (appCompatImageView != null) {
            ViewGroup.LayoutParams layoutParams = appCompatImageView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.height = intValue;
            layoutParams.width = intValue;
            appCompatImageView.setLayoutParams(layoutParams);
        }
    }

    public final void setTrailingIconTint(int i) {
        AppCompatImageView appCompatImageView = this.M;
        if (appCompatImageView != null) {
            gpo0.f(appCompatImageView, Integer.valueOf(i));
        }
        ProgressBar progressBar = this.Q;
        if (progressBar != null) {
            progressBar.setIndeterminateTintList(ColorStateList.valueOf(gpo0.d(i, this)));
        }
        setTrailingIconColorful(false);
    }

    public final void setTrailingIconVisible(boolean z) {
        AppCompatImageView appCompatImageView = this.M;
        if (appCompatImageView != null) {
            appCompatImageView.setVisibility(z ? 0 : 8);
        }
    }

    public final void setupBlur(VkBlurContentView vkBlurContentView) {
        if (vkBlurContentView == null && this.I == null) {
            return;
        }
        dfu0 dfu0Var = this.I;
        if (dfu0Var == null) {
            dfu0Var = new dfu0(this);
            this.I = dfu0Var;
        }
        dfu0Var.b(vkBlurContentView);
        a defaults = getDefaults();
        getContext();
        defaults.getClass();
        dfu0Var.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        dfu0Var.c(this.G.getCornerRadius());
        X4();
    }

    public /* synthetic */ VkButton(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VkButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.t = Size.Medium;
        this.u = Mode.Primary;
        this.v = Appearance.Accent;
        this.w = true;
        this.x = true;
        this.y = true;
        this.z = true;
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.G = gradientDrawable;
        this.H = new gaz(this);
        this.J = new RippleDrawable(ColorStateList.valueOf(0), gradientDrawable, new ColorDrawable(-1));
        this.R = -1;
        setClipToPadding(false);
        setClipChildren(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.ds_internal_title_container);
        frameLayout.setClipToPadding(false);
        frameLayout.setClipChildren(false);
        this.L = frameLayout;
        VkText vkText = new VkText(context, null, 6, 0);
        vkText.setId(R.id.ds_internal_button_title);
        vkText.setEllipsize(TextUtils.TruncateAt.END);
        vkText.setMaxLines(1);
        vkText.setTextAppearance(e3m.g(R.attr.vk_ui_typography_headline1_medium, context));
        vkText.setTextColor(krv0.l(R.attr.vk_ui_text_secondary));
        this.K = vkText;
        ConstraintLayout.b bVar = new ConstraintLayout.b(-2, -2);
        bVar.setMargins(0, (int) hbh0.a(context, 0.5f), 0, (int) hbh0.a(context, 1.5f));
        s3q0 s3q0Var = s3q0.a;
        frameLayout.addView(vkText, bVar);
        P4(R.id.ds_internal_button_progress_indicator);
        P4(R.id.ds_internal_button_icon);
        addView(frameLayout);
        P4(R.id.ds_internal_button_counter);
        P4(R.id.ds_internal_button_trailing_icon);
        androidx.constraintlayout.widget.b bVar2 = new androidx.constraintlayout.widget.b();
        bVar2.i(this);
        int[] iArr = W;
        bVar2.s(0, 6, 0, 7, iArr);
        for (int i2 = 0; i2 < 5; i2++) {
            bVar2.f(iArr[i2], 0);
        }
        bVar2.u(R.id.ds_internal_title_container).e.m0 = true;
        bVar2.b(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.f, 0, 0);
        CharSequence string = obtainStyledAttributes.getString(11);
        string = string == null ? obtainStyledAttributes.getString(0) : string;
        int resourceId = obtainStyledAttributes.getResourceId(7, 0);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(9, -1);
        this.D = dimensionPixelSize == -1 ? null : Integer.valueOf(dimensionPixelSize);
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(15, -1);
        Integer valueOf = dimensionPixelSize2 == -1 ? null : Integer.valueOf(dimensionPixelSize2);
        if (valueOf == null) {
            int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(9, -1);
            valueOf = Integer.valueOf(dimensionPixelSize3);
            if (dimensionPixelSize3 == -1) {
                valueOf = null;
            }
        }
        this.E = valueOf;
        int integer = obtainStyledAttributes.getInteger(6, -1);
        Integer valueOf2 = integer != -1 ? Integer.valueOf(integer) : null;
        boolean z = obtainStyledAttributes.getBoolean(10, false);
        int resourceId2 = obtainStyledAttributes.getResourceId(13, 0);
        Float valueOf3 = Float.valueOf(obtainStyledAttributes.getDimension(3, getDefaults().p(context, this.t)));
        this.F = valueOf3;
        setClipToOutline(true);
        setCornerRadius(valueOf3);
        setSize((Size) Size.h().get(obtainStyledAttributes.getInteger(5, 1)));
        setMode((Mode) Mode.h().get(obtainStyledAttributes.getInteger(4, 0)));
        setAppearance((Appearance) Appearance.h().get(obtainStyledAttributes.getInteger(2, 0)));
        setIconColorful(obtainStyledAttributes.getBoolean(8, true));
        setTrailingIconColorful(obtainStyledAttributes.getBoolean(14, true));
        setBackgroundColorful(obtainStyledAttributes.getBoolean(1, true));
        setTextColorful(obtainStyledAttributes.getBoolean(12, true));
        setText(string);
        a5(true, Integer.valueOf(resourceId));
        setIconSize(this.D);
        setCount(valueOf2);
        setLoading(z);
        d5(Integer.valueOf(resourceId2));
        setTrailingIconSize(this.E);
        obtainStyledAttributes.recycle();
    }

    public final void setIconTint(ColorStateList colorStateList) {
        AppCompatImageView appCompatImageView = this.N;
        if (appCompatImageView != null) {
            appCompatImageView.setImageTintList(colorStateList);
        }
        setIconColorful(false);
    }

    public final void setTextTint(ColorStateList colorStateList) {
        this.K.setTextColor(colorStateList);
        setTextColorful(false);
    }

    public final void setBackgroundTint(ColorStateList colorStateList) {
        this.G.setColor(colorStateList);
        dfu0 dfu0Var = this.I;
        if (dfu0Var != null) {
            dfu0Var.d(colorStateList != null ? Integer.valueOf(colorStateList.getDefaultColor()) : null);
        }
        this.R = -1;
        setBackgroundColorful(false);
        e5();
    }

    public final void setTrailingIconTint(ColorStateList colorStateList) {
        AppCompatImageView appCompatImageView = this.M;
        if (appCompatImageView != null) {
            appCompatImageView.setImageTintList(colorStateList);
        }
        ProgressBar progressBar = this.Q;
        if (progressBar != null) {
            progressBar.setIndeterminateTintList(colorStateList);
        }
        setTrailingIconColorful(false);
    }

    public final void setText(int i) {
        VkText vkText = this.K;
        vkText.setText(i);
        boolean z = this.T;
        FrameLayout frameLayout = this.L;
        if (z && this.U) {
            frameLayout.setVisibility(8);
        } else {
            CharSequence text = vkText.getText();
            frameLayout.setVisibility(text == null || text.length() == 0 ? 8 : 0);
        }
        g5();
    }
}
