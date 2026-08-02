package com.vk.feed.design.view.newsfeed.overlay;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.vk.core.tool.view.vkblur.VkBlurContentView;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.core.view.components.spinner.VkSpinner;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;
import defpackage.q0;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.bpn0;
import xsna.bwt0;
import xsna.cn70;
import xsna.dko;
import xsna.drm0;
import xsna.e3m;
import xsna.epx;
import xsna.f4m;
import xsna.kcj0;
import xsna.l8g;
import xsna.qog0;
import xsna.tlo0;
import xsna.zrp;

/* compiled from: VkOverlayCircleButton.kt */
/* loaded from: classes18.dex */
public final class VkOverlayCircleButton extends FrameLayout {
    public static final /* synthetic */ int j = 0;
    public final View b;
    public final VkImageSimple c;
    public final VkText d;
    public final VkSpinner e;
    public final View f;
    public a g;
    public final bpn0 h;
    public boolean i;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkOverlayCircleButton.kt */
    public static final class ColorPalette {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ColorPalette[] $VALUES;
        public static final ColorPalette Reversed;
        public static final ColorPalette Standard;
        public static final ColorPalette Transparent;

        static {
            ColorPalette colorPalette = new ColorPalette("Standard", 0);
            Standard = colorPalette;
            ColorPalette colorPalette2 = new ColorPalette("Reversed", 1);
            Reversed = colorPalette2;
            ColorPalette colorPalette3 = new ColorPalette("Transparent", 2);
            Transparent = colorPalette3;
            ColorPalette[] colorPaletteArr = {colorPalette, colorPalette2, colorPalette3};
            $VALUES = colorPaletteArr;
            $ENTRIES = new asp(colorPaletteArr);
        }

        public ColorPalette() {
            throw null;
        }

        public static ColorPalette valueOf(String str) {
            return (ColorPalette) Enum.valueOf(ColorPalette.class, str);
        }

        public static ColorPalette[] values() {
            return (ColorPalette[]) $VALUES.clone();
        }
    }

    /* compiled from: VkOverlayCircleButton.kt */
    public static final class a {
        public final dko a;
        public final ImageView.ScaleType b;
        public final tlo0 c;
        public final ColorPalette d;
        public final boolean e;

        public a(dko dkoVar, ImageView.ScaleType scaleType, tlo0 tlo0Var, ColorPalette colorPalette, boolean z) {
            this.a = dkoVar;
            this.b = scaleType;
            this.c = tlo0Var;
            this.d = colorPalette;
            this.e = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b && epx.f(this.c, aVar.c) && this.d == aVar.d && this.e == aVar.e;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.e) + ((this.d.hashCode() + com.vk.movika.sdk.base.model.history.b.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("IconContent(drawableSource=");
            sb.append(this.a);
            sb.append(", drawableScaleType=");
            sb.append(this.b);
            sb.append(", contentDescription=");
            sb.append(this.c);
            sb.append(", colorPalette=");
            sb.append(this.d);
            sb.append(", isDisabled=");
            return q0.a(sb, this.e, ')');
        }
    }

    /* compiled from: VkOverlayCircleButton.kt */
    public final class b {
        public final long a;
        public final long b;
        public AnimatorSet c;

        public b() {
            throw null;
        }

        public b() {
            this.a = 300L;
            this.b = 2000L;
        }

        public final void a(tlo0.f fVar) {
            CharSequence a;
            CharSequence charSequence = null;
            VkOverlayCircleButton vkOverlayCircleButton = VkOverlayCircleButton.this;
            if (fVar != null && (a = tlo0.b.a(fVar, vkOverlayCircleButton.getContext())) != null && !drm0.N(a)) {
                charSequence = a;
            }
            VkText vkText = vkOverlayCircleButton.d;
            f4m.E(vkText, charSequence != null);
            vkText.setText(charSequence);
        }
    }

    /* compiled from: VkOverlayCircleButton.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ColorPalette.values().length];
            try {
                iArr[ColorPalette.Standard.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ColorPalette.Reversed.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ColorPalette.Transparent.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public VkOverlayCircleButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.h = new bpn0(new kcj0(context, 27));
        LayoutInflater.from(context).inflate(R.layout.pds_overlay_circle_button, (ViewGroup) this, true);
        this.b = findViewById(R.id.pds_overlay_circle_button_root);
        this.c = (VkImageSimple) findViewById(R.id.pds_overlay_circle_button_icon);
        this.d = (VkText) findViewById(R.id.pds_overlay_circle_button_text);
        this.e = (VkSpinner) findViewById(R.id.pds_overlay_circle_button_progress);
        View findViewById = findViewById(R.id.pds_overlay_circle_button_layout);
        this.f = findViewById;
        setLoading(false);
        findViewById.setMinimumHeight(cn70.b(24));
        findViewById.setMinimumWidth(cn70.b(24));
    }

    public static void a(VkOverlayCircleButton vkOverlayCircleButton, dko dkoVar, tlo0.f fVar, ColorPalette colorPalette, Boolean bool, int i) {
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_INSIDE;
        a aVar = null;
        dko dkoVar2 = (i & 1) != 0 ? null : dkoVar;
        if ((i & 2) != 0) {
            scaleType = null;
        }
        tlo0 tlo0Var = fVar;
        if ((i & 4) != 0) {
            tlo0Var = null;
        }
        ColorPalette colorPalette2 = (i & 8) != 0 ? null : colorPalette;
        Boolean bool2 = (i & 16) != 0 ? null : bool;
        a aVar2 = vkOverlayCircleButton.g;
        if (colorPalette2 == null) {
            colorPalette2 = aVar2 != null ? aVar2.d : null;
            if (colorPalette2 == null) {
                colorPalette2 = ColorPalette.Standard;
            }
        }
        ColorPalette colorPalette3 = colorPalette2;
        if (aVar2 != null) {
            if (dkoVar2 == null) {
                dkoVar2 = aVar2.a;
            }
            dko dkoVar3 = dkoVar2;
            if (scaleType == null) {
                scaleType = aVar2.b;
            }
            if (tlo0Var == null) {
                tlo0Var = aVar2.c;
            }
            aVar = new a(dkoVar3, scaleType, tlo0Var, colorPalette3, bool2 != null ? bool2.booleanValue() : aVar2.e);
        } else if (dkoVar2 != null) {
            if (scaleType == null) {
                scaleType = ImageView.ScaleType.CENTER;
            }
            ImageView.ScaleType scaleType2 = scaleType;
            tlo0 tlo0Var2 = tlo0Var;
            if (tlo0Var == null) {
                tlo0.Companion.getClass();
                tlo0Var2 = tlo0.c.a;
            }
            aVar = new a(dkoVar2, scaleType2, tlo0Var2, colorPalette3, bool2 != null ? bool2.booleanValue() : false);
        }
        if (aVar == null) {
            return;
        }
        vkOverlayCircleButton.g = aVar;
        vkOverlayCircleButton.setUpIconContent(aVar);
    }

    private final int getOverlaySecondaryColor() {
        return ((Number) this.h.getValue()).intValue();
    }

    private final int getReversedBackgroundColor() {
        return getContext().getColor(R.color.vk_white);
    }

    private final int getStandardBackgroundColor() {
        Context context = getContext();
        e3m.a aVar = e3m.a;
        return l8g.f(0.7f, context.getColor(R.color.vk_gray_800));
    }

    private final void setUpIconContent(a aVar) {
        int color;
        int standardBackgroundColor;
        if (aVar == null) {
            return;
        }
        ColorPalette colorPalette = aVar.d;
        dko dkoVar = aVar.a;
        VkImageSimple vkImageSimple = this.c;
        vkImageSimple.setImageDrawable(dkoVar.a(vkImageSimple.getContext()));
        vkImageSimple.setScaleType(aVar.b);
        vkImageSimple.setContentDescription(aVar.c.a(vkImageSimple.getContext()));
        vkImageSimple.setAlpha(aVar.e ? 0.5f : 1.0f);
        int[] iArr = c.$EnumSwitchMapping$0;
        int i = iArr[colorPalette.ordinal()];
        if (i == 1) {
            Context context = getContext();
            e3m.a aVar2 = e3m.a;
            color = context.getColor(R.color.vk_white);
        } else if (i == 2) {
            Context context2 = getContext();
            e3m.a aVar3 = e3m.a;
            color = context2.getColor(R.color.vk_black);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            Context context3 = getContext();
            e3m.a aVar4 = e3m.a;
            color = context3.getColor(R.color.vk_white);
        }
        bwt0.o0(vkImageSimple, color);
        int i2 = iArr[colorPalette.ordinal()];
        if (i2 == 1) {
            standardBackgroundColor = getStandardBackgroundColor();
        } else if (i2 == 2) {
            standardBackgroundColor = getReversedBackgroundColor();
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            standardBackgroundColor = 0;
        }
        ColorPalette colorPalette2 = ColorPalette.Transparent;
        View view = this.f;
        if (colorPalette == colorPalette2) {
            view.setBackground(null);
        } else {
            view.setBackground(new qog0(cn70.a() * 12.0f, standardBackgroundColor));
        }
    }

    private final void setUpIsLoading(boolean z) {
        f4m.E(this.c, !z);
        VkSpinner vkSpinner = this.e;
        f4m.E(vkSpinner, z);
        vkSpinner.setSpinnerSize(VkSpinner.SpinnerSize.Size16);
        vkSpinner.setIndeterminateTintList(ColorStateList.valueOf(vkSpinner.getContext().getColor(R.color.vk_white)));
    }

    public final void setLoading(boolean z) {
        this.i = z;
        setUpIsLoading(z);
    }

    public final void setupBlurContent(VkBlurContentView vkBlurContentView) {
    }
}
