package com.vk.core.view.components.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.tool.view.vkblur.VkBlurContentView;
import com.vk.core.view.components.R$styleable;
import com.vk.core.view.components.button.VkButton;
import xsna.avj;
import xsna.dfu0;
import xsna.epx;
import xsna.gaz;
import xsna.gpo0;
import xsna.hbh0;
import xsna.his0;
import xsna.hp8;
import xsna.r890;
import xsna.ro;
import xsna.too0;

/* compiled from: VkSimpleButton.kt */
/* loaded from: classes.dex */
public final class VkSimpleButton extends AppCompatButton implements too0 {
    public VkButton.Size e;
    public VkButton.Mode f;
    public VkButton.Appearance g;
    public boolean h;
    public boolean i;
    public final GradientDrawable j;
    public final gaz k;
    public dfu0 l;
    public final RippleDrawable m;
    public int n;
    public int o;
    public ColorStateList p;
    public boolean q;

    public VkSimpleButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    private final a getDefaults() {
        getContext();
        return c.a;
    }

    @Override // xsna.too0
    public final void Ng() {
        a();
    }

    public final void a() {
        int d;
        ColorStateList colorStateList;
        this.q = false;
        Integer e = getDefaults().e(this.f, this.g);
        hp8 m = getDefaults().m(this.f, this.g);
        if (this.i) {
            gpo0.i(this, m.b);
        }
        if (this.f == VkButton.Mode.Link) {
            setBackground(this.k);
            return;
        }
        if (this.h) {
            d = gpo0.d(m.a, this);
        } else {
            int i = this.n;
            if (i == -1) {
                return;
            } else {
                d = gpo0.d(i, this);
            }
        }
        int defaultColor = (this.h || (colorStateList = this.p) == null) ? d : colorStateList.getDefaultColor();
        int d2 = e != null ? gpo0.d(e.intValue(), this) : 0;
        float c = getDefaults().c(getContext(), this.f, this.g);
        a defaults = getDefaults();
        getContext();
        defaults.getClass();
        GradientDrawable gradientDrawable = this.j;
        gradientDrawable.setColor(d);
        gradientDrawable.setStroke((int) c, d2);
        RippleDrawable rippleDrawable = this.m;
        if (!epx.f(rippleDrawable.getDrawable(0), gradientDrawable)) {
            rippleDrawable.setDrawable(0, gradientDrawable);
        }
        rippleDrawable.setColor(ro.c(defaultColor, null));
        setBackground(rippleDrawable);
        this.q = true;
    }

    public final void b() {
        int intValue;
        ColorStateList colorStateList = this.p;
        if (colorStateList != null) {
            intValue = colorStateList.getDefaultColor();
        } else {
            int i = this.n;
            Integer valueOf = Integer.valueOf(i);
            if (i == -1) {
                valueOf = null;
            }
            if (valueOf != null) {
                intValue = gpo0.d(valueOf.intValue(), this);
            } else {
                int i2 = this.o;
                Integer valueOf2 = Integer.valueOf(i2);
                if (i2 == -1) {
                    valueOf2 = null;
                }
                if (valueOf2 == null) {
                    return;
                } else {
                    intValue = valueOf2.intValue();
                }
            }
        }
        this.m.setColor(ro.c(intValue, null));
    }

    public final VkButton.Appearance getAppearance() {
        return this.g;
    }

    public final boolean getBackgroundColorful() {
        return this.h;
    }

    public final VkButton.Mode getMode() {
        return this.f;
    }

    public final VkButton.Size getSize() {
        return this.e;
    }

    public final boolean getTextColorful() {
        return this.i;
    }

    public final void setAppearance(VkButton.Appearance appearance) {
        this.g = appearance;
        a();
        invalidate();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.j.setColor(i);
        dfu0 dfu0Var = this.l;
        if (dfu0Var != null) {
            dfu0Var.d(Integer.valueOf(i));
        }
        this.o = i;
        this.p = null;
        this.n = -1;
        if (this.q) {
            setBackgroundColorful(false);
        }
        b();
    }

    public final void setBackgroundColorful(boolean z) {
        this.h = z;
        a();
        invalidate();
    }

    public final void setBackgroundTint(int i) {
        this.j.setColor(gpo0.d(i, this));
        dfu0 dfu0Var = this.l;
        if (dfu0Var != null) {
            dfu0Var.d(Integer.valueOf(gpo0.d(i, this)));
        }
        this.n = i;
        this.p = null;
        this.o = -1;
        if (this.q) {
            setBackgroundColorful(false);
        }
        b();
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTint(colorStateList);
    }

    public final void setCornerRadius(float f) {
        setOutlineProvider(new avj(f));
        this.j.setCornerRadius(f);
        dfu0 dfu0Var = this.l;
        if (dfu0Var != null) {
            dfu0Var.c(f);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        setAlpha(his0.r(z));
    }

    public final void setMode(VkButton.Mode mode) {
        this.f = mode;
        r890 k = getDefaults().k(getContext(), this.e, this.f);
        int i = k.a;
        setPadding(i, k.b + ((int) hbh0.a(getContext(), 0.5f)), i, k.d + ((int) hbh0.a(getContext(), 1.5f)));
        a();
        requestLayout();
        invalidate();
    }

    public final void setSize(VkButton.Size size) {
        this.e = size;
        int h = getDefaults().h(getContext(), this.e);
        int a = getDefaults().a(getContext(), this.e);
        r890 k = getDefaults().k(getContext(), this.e, this.f);
        float p = getDefaults().p(getContext(), this.e);
        setMinimumHeight(a);
        setTextAppearance(h);
        setPadding(k.a, k.b + ((int) hbh0.a(getContext(), 0.5f)), k.c, k.d + ((int) hbh0.a(getContext(), 1.5f)));
        setCornerRadius(p);
        requestLayout();
        invalidate();
    }

    @Override // android.widget.TextView
    public void setTextColor(int i) {
        super.setTextColor(i);
        if (this.q) {
            setTextColorful(false);
        }
    }

    public final void setTextColorful(boolean z) {
        this.i = z;
        a();
        invalidate();
    }

    public final void setTextTint(int i) {
        super.setTextColor(gpo0.d(i, this));
        if (this.q) {
            setTextColorful(false);
        }
    }

    public final void setupBlur(VkBlurContentView vkBlurContentView) {
        if (vkBlurContentView == null && this.l == null) {
            return;
        }
        dfu0 dfu0Var = this.l;
        if (dfu0Var == null) {
            dfu0Var = new dfu0(this);
            this.l = dfu0Var;
        }
        dfu0Var.b(vkBlurContentView);
        a defaults = getDefaults();
        getContext();
        defaults.getClass();
        dfu0Var.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        dfu0Var.c(this.j.getCornerRadius());
        a();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VkSimpleButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        this.e = VkButton.Size.Medium;
        this.f = VkButton.Mode.Primary;
        this.g = VkButton.Appearance.Accent;
        this.h = true;
        this.i = true;
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.j = gradientDrawable;
        this.k = new gaz(this);
        this.m = new RippleDrawable(ColorStateList.valueOf(0), gradientDrawable, new ColorDrawable(-1));
        this.n = -1;
        this.o = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.y, 0, 0);
        float dimension = obtainStyledAttributes.getDimension(3, -1.0f);
        Float valueOf = dimension != -1.0f ? Float.valueOf(dimension) : null;
        setClipToOutline(true);
        if (valueOf != null) {
            setCornerRadius(valueOf.floatValue());
        }
        setEllipsize(TextUtils.TruncateAt.END);
        setMaxLines(1);
        setGravity(17);
        setSize((VkButton.Size) VkButton.Size.h().get(obtainStyledAttributes.getInteger(5, 1)));
        setMode((VkButton.Mode) VkButton.Mode.h().get(obtainStyledAttributes.getInteger(4, 0)));
        setAppearance((VkButton.Appearance) VkButton.Appearance.h().get(obtainStyledAttributes.getInteger(2, 0)));
        setBackgroundColorful(obtainStyledAttributes.getBoolean(1, true));
        setTextColorful(obtainStyledAttributes.getBoolean(6, true));
        obtainStyledAttributes.recycle();
        this.q = true;
    }

    @Override // android.widget.TextView
    public void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        if (this.q) {
            setTextColorful(false);
        }
    }

    public final void setBackgroundTint(ColorStateList colorStateList) {
        this.j.setColor(colorStateList);
        this.p = colorStateList;
        dfu0 dfu0Var = this.l;
        if (dfu0Var != null) {
            dfu0Var.d(colorStateList != null ? Integer.valueOf(colorStateList.getDefaultColor()) : null);
        }
        this.n = -1;
        this.o = -1;
        if (this.q) {
            setBackgroundColorful(false);
        }
        b();
    }
}
