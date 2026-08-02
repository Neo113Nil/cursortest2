package com.vk.core.view.components.subnavigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.R$styleable;
import com.vk.core.view.components.counter.VkCounter;
import com.vk.core.view.components.subnavigation.SubnavigationButton;
import com.vk.core.view.components.subnavigation.b;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.a50;
import xsna.e3m;
import xsna.epx;
import xsna.krv0;
import xsna.rl3;
import xsna.s3q0;
import xsna.too0;
import xsna.z00;

/* compiled from: VkSubnavigationButton.kt */
/* loaded from: classes17.dex */
public final class VkSubnavigationButton extends ConstraintLayout implements SubnavigationButton, b.a, too0 {
    public b A;
    public final TextView t;
    public final ImageView u;
    public final VkCounter v;
    public final ImageView w;
    public SubnavigationButton.Mode x;
    public SubnavigationButton.Appearance y;
    public View.OnClickListener z;

    /* compiled from: VkSubnavigationButton.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[SubnavigationButton.Size.values().length];
            try {
                iArr[SubnavigationButton.Size.Small.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SubnavigationButton.Size.Medium.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SubnavigationButton.Size.Large.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[SubnavigationButton.Appearance.values().length];
            try {
                iArr2[SubnavigationButton.Appearance.Inherit.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[SubnavigationButton.Appearance.Neutral.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[SubnavigationButton.Appearance.Accent.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public VkSubnavigationButton(Context context) {
        this(context, null, 0, 14, 0);
    }

    private final SubnavigationBarAppearance getActualAppearance() {
        SubnavigationBarAppearance b;
        int i = a.$EnumSwitchMapping$1[this.y.ordinal()];
        if (i == 1) {
            b bVar = this.A;
            return (bVar == null || (b = bVar.b()) == null) ? SubnavigationBarAppearance.Neutral : b;
        }
        if (i == 2) {
            return SubnavigationBarAppearance.Neutral;
        }
        if (i == 3) {
            return SubnavigationBarAppearance.Accent;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.vk.core.view.components.subnavigation.SubnavigationButton
    public final void K1(Integer num) {
        P4(num != null ? getContext().getDrawable(num.intValue()) : null, true);
    }

    @Override // xsna.too0
    public final void Ng() {
        Q4();
    }

    public final void P4(Drawable drawable, boolean z) {
        ColorStateList colorStateList;
        int i;
        ImageView imageView = this.u;
        imageView.setImageDrawable(drawable);
        if (z) {
            Context context = getContext();
            boolean isSelected = isSelected();
            SubnavigationButton.Mode mode = this.x;
            SubnavigationBarAppearance actualAppearance = getActualAppearance();
            int i2 = R.attr.vk_ui_icon_accent;
            if (isSelected && (i = com.vk.core.view.components.subnavigation.a.$EnumSwitchMapping$1[actualAppearance.ordinal()]) != 1) {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                int i3 = com.vk.core.view.components.subnavigation.a.$EnumSwitchMapping$0[mode.ordinal()];
                if (i3 == 1 || i3 == 2 || i3 == 3) {
                    i2 = R.attr.vk_ui_icon_contrast_themed;
                } else if (i3 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            colorStateList = ColorStateList.valueOf(e3m.f(i2, context));
        } else {
            colorStateList = null;
        }
        imageView.setImageTintList(colorStateList);
        imageView.setVisibility(drawable == null ? 8 : 0);
    }

    @Override // com.vk.core.view.components.subnavigation.SubnavigationButton
    public final void Q0(Integer num) {
        int i;
        Drawable drawable = getContext().getDrawable(num.intValue());
        ImageView imageView = this.w;
        imageView.setImageDrawable(drawable);
        Context context = getContext();
        boolean isSelected = isSelected();
        SubnavigationButton.Mode mode = this.x;
        int i2 = com.vk.core.view.components.subnavigation.a.$EnumSwitchMapping$1[getActualAppearance().ordinal()];
        if (i2 == 1) {
            i = R.attr.vk_ui_icon_primary;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            int i3 = com.vk.core.view.components.subnavigation.a.$EnumSwitchMapping$0[mode.ordinal()];
            i = R.attr.vk_ui_icon_secondary;
            if (i3 == 1 || i3 == 2 || i3 == 3) {
                if (isSelected) {
                    i = R.attr.vk_ui_icon_contrast_themed;
                }
            } else if (i3 != 4) {
                throw new NoWhenBranchMatchedException();
            }
        }
        imageView.setImageTintList(ColorStateList.valueOf(e3m.f(i, context)));
        imageView.setVisibility(drawable == null ? 8 : 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0164, code lost:
    
        if (r8 != false) goto L92;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Q4() {
        int i;
        int i2;
        int i3;
        refreshDrawableState();
        SubnavigationBarAppearance actualAppearance = getActualAppearance();
        Context context = getContext();
        boolean isSelected = isSelected();
        SubnavigationButton.Mode mode = this.x;
        if (isSelected) {
            int i4 = com.vk.core.view.components.subnavigation.a.$EnumSwitchMapping$1[actualAppearance.ordinal()];
            i = R.drawable.ds_internal_subnavigation_button_neutral_active_background;
            if (i4 == 1) {
                int i5 = com.vk.core.view.components.subnavigation.a.$EnumSwitchMapping$0[mode.ordinal()];
                if (i5 == 1) {
                    i = R.drawable.ds_internal_subnavigation_button_primary_neutral_active_background;
                } else if (i5 == 2) {
                    i = R.drawable.ds_internal_subnavigation_button_secondary_neutral_active_background;
                } else if (i5 != 3 && i5 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                if (i4 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                int i6 = com.vk.core.view.components.subnavigation.a.$EnumSwitchMapping$0[mode.ordinal()];
                if (i6 == 1 || i6 == 2 || i6 == 3) {
                    i = R.drawable.ds_internal_subnavigation_button_accent_active_background;
                } else if (i6 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        } else {
            int i7 = com.vk.core.view.components.subnavigation.a.$EnumSwitchMapping$0[mode.ordinal()];
            if (i7 == 1) {
                i = R.drawable.ds_internal_subnavigation_button_primary_inactive_background;
            } else if (i7 == 2) {
                i = R.drawable.ds_internal_subnavigation_button_secondary_inactive_background;
            } else if (i7 == 3) {
                i = R.drawable.ds_internal_subnavigation_button_outline_inactive_background;
            } else {
                if (i7 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R.drawable.ds_internal_subnavigation_button_tertiary_inactive_background;
            }
        }
        setBackground(context.getDrawable(i));
        Context context2 = getContext();
        boolean isSelected2 = isSelected();
        SubnavigationButton.Mode mode2 = this.x;
        int i8 = R.attr.vk_ui_text_primary;
        if (isSelected2 && (i3 = com.vk.core.view.components.subnavigation.a.$EnumSwitchMapping$1[actualAppearance.ordinal()]) != 1) {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            int i9 = com.vk.core.view.components.subnavigation.a.$EnumSwitchMapping$0[mode2.ordinal()];
            if (i9 == 1 || i9 == 2 || i9 == 3) {
                i8 = R.attr.vk_ui_text_contrast_themed;
            } else if (i9 != 4) {
                throw new NoWhenBranchMatchedException();
            }
        }
        this.t.setTextColor(ColorStateList.valueOf(e3m.f(i8, context2)));
        ImageView imageView = this.u;
        ColorStateList imageTintList = imageView.getImageTintList();
        int i10 = R.attr.vk_ui_icon_contrast_themed;
        if (imageTintList != null) {
            Context context3 = getContext();
            boolean isSelected3 = isSelected();
            SubnavigationButton.Mode mode3 = this.x;
            int i11 = R.attr.vk_ui_icon_accent;
            if (isSelected3 && (i2 = com.vk.core.view.components.subnavigation.a.$EnumSwitchMapping$1[actualAppearance.ordinal()]) != 1) {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                int i12 = com.vk.core.view.components.subnavigation.a.$EnumSwitchMapping$0[mode3.ordinal()];
                if (i12 == 1 || i12 == 2 || i12 == 3) {
                    i11 = R.attr.vk_ui_icon_contrast_themed;
                } else if (i12 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            imageView.setImageTintList(ColorStateList.valueOf(e3m.f(i11, context3)));
        }
        ImageView imageView2 = this.w;
        if (imageView2.getImageTintList() != null) {
            Context context4 = getContext();
            boolean isSelected4 = isSelected();
            SubnavigationButton.Mode mode4 = this.x;
            int i13 = com.vk.core.view.components.subnavigation.a.$EnumSwitchMapping$1[actualAppearance.ordinal()];
            if (i13 == 1) {
                i10 = R.attr.vk_ui_icon_primary;
            } else {
                if (i13 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                int i14 = com.vk.core.view.components.subnavigation.a.$EnumSwitchMapping$0[mode4.ordinal()];
                if (i14 != 1 && i14 != 2 && i14 != 3) {
                    if (i14 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                i10 = R.attr.vk_ui_icon_secondary;
            }
            imageView2.setImageTintList(ColorStateList.valueOf(e3m.f(i10, context4)));
        }
        boolean isSelected5 = isSelected();
        SubnavigationButton.Mode mode5 = this.x;
        VkCounter vkCounter = this.v;
        if (isSelected5) {
            int i15 = com.vk.core.view.components.subnavigation.a.$EnumSwitchMapping$1[actualAppearance.ordinal()];
            if (i15 == 1) {
                vkCounter.setMode(VkCounter.Mode.Primary);
                vkCounter.setAppearance(VkCounter.CounterAppearance.Appearance.Accent);
            } else {
                if (i15 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                int i16 = com.vk.core.view.components.subnavigation.a.$EnumSwitchMapping$0[mode5.ordinal()];
                if (i16 == 1 || i16 == 2 || i16 == 3) {
                    TypedValue typedValue = krv0.a;
                    if (epx.f(krv0.i(vkCounter.getContext()), Boolean.TRUE)) {
                        vkCounter.setMode(VkCounter.Mode.Primary);
                        vkCounter.setAppearance(VkCounter.t);
                    } else {
                        vkCounter.setMode(VkCounter.Mode.Contrast);
                        vkCounter.setAppearance(VkCounter.CounterAppearance.Appearance.Accent);
                    }
                } else {
                    if (i16 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    vkCounter.setMode(VkCounter.Mode.Primary);
                    vkCounter.setAppearance(VkCounter.CounterAppearance.Appearance.Accent);
                }
            }
        } else {
            vkCounter.setMode(VkCounter.Mode.Primary);
            vkCounter.setAppearance(VkCounter.CounterAppearance.Appearance.Accent);
        }
        Context context5 = getContext();
        boolean isSelected6 = isSelected();
        SubnavigationButton.Mode mode6 = this.x;
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (!isSelected6) {
            int i17 = com.vk.core.view.components.subnavigation.a.$EnumSwitchMapping$0[mode6.ordinal()];
            if (i17 == 1) {
                f = context5.getResources().getDimension(R.dimen.ds_subnavigation_button_primary_elevation);
            } else if (i17 != 2 && i17 != 3 && i17 != 4) {
                throw new NoWhenBranchMatchedException();
            }
        }
        setElevation(f);
    }

    @Override // com.vk.core.view.components.subnavigation.b.a
    public final void c3() {
        Q4();
    }

    public final int getLabelMaxWidth() {
        return this.t.getMaxWidth();
    }

    @Override // com.vk.core.view.components.subnavigation.SubnavigationButton
    public final void l2(boolean z, Integer num) {
        VkCounter vkCounter = this.v;
        if (num == null) {
            vkCounter.setVisibility(8);
            return;
        }
        vkCounter.setVisibility(0);
        if (z) {
            vkCounter.setCounterWithAnimation(num.intValue());
        } else {
            vkCounter.setCounterWithoutAnimation(num.intValue());
        }
    }

    @Override // com.vk.core.view.components.subnavigation.SubnavigationButton
    public void setActive(boolean z) {
        setSelected(z);
        Q4();
    }

    @Override // com.vk.core.view.components.subnavigation.SubnavigationButton
    public void setAppearance(SubnavigationButton.Appearance appearance) {
        this.y = appearance;
        Q4();
    }

    @Override // com.vk.core.view.components.subnavigation.SubnavigationButton
    public void setClickListener(View.OnClickListener onClickListener) {
        this.z = onClickListener;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        setAlpha(z ? 1.0f : 0.64f);
        super.setEnabled(z);
    }

    @Override // com.vk.core.view.components.subnavigation.SubnavigationButton
    public void setLabel(CharSequence charSequence) {
        TextView textView = this.t;
        textView.setText(charSequence);
        textView.setVisibility(charSequence == null ? 8 : 0);
    }

    public final void setLabelMaxWidth(int i) {
        this.t.setMaxWidth(i);
    }

    public void setLabelResource(Integer num) {
        setLabel(num != null ? getContext().getString(num.intValue()) : null);
    }

    @Override // com.vk.core.view.components.subnavigation.SubnavigationButton
    public void setLeftIconVisible(boolean z) {
        this.u.setVisibility(z ? 0 : 8);
    }

    @Override // com.vk.core.view.components.subnavigation.SubnavigationButton
    public void setMode(SubnavigationButton.Mode mode) {
        this.x = mode;
        Q4();
    }

    @Override // com.vk.core.view.components.subnavigation.SubnavigationButton
    public void setParent(b bVar) {
        b bVar2 = this.A;
        if (bVar2 != null) {
            bVar2.c(this);
        }
        this.A = bVar;
    }

    @Override // com.vk.core.view.components.subnavigation.SubnavigationButton
    public void setRightIconVisible(boolean z) {
        this.w.setVisibility(z ? 0 : 8);
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        super.setSelected(z);
        Q4();
    }

    @Override // com.vk.core.view.components.subnavigation.SubnavigationButton
    public void setSize(SubnavigationButton.Size size) {
        int i;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        int i2 = a.$EnumSwitchMapping$0[size.ordinal()];
        if (i2 == 1) {
            i = R.dimen.vk_ui_button_small_height;
        } else if (i2 == 2) {
            i = R.dimen.vk_ui_button_medium_height;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = R.dimen.vk_ui_button_large_height;
        }
        layoutParams.height = getContext().getResources().getDimensionPixelOffset(i);
        setLayoutParams(layoutParams);
    }

    public VkSubnavigationButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
    }

    public VkSubnavigationButton(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8, 0);
    }

    public /* synthetic */ VkSubnavigationButton(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v20, types: [java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r13v24, types: [java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r13v28, types: [java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r9v0, types: [android.view.View, android.view.ViewGroup, androidx.constraintlayout.widget.ConstraintLayout, com.vk.core.view.components.subnavigation.VkSubnavigationButton, java.lang.Object] */
    public VkSubnavigationButton(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        int i3;
        SubnavigationButton.Size size = SubnavigationButton.Size.Small;
        this.x = SubnavigationButton.Mode.Primary;
        this.y = SubnavigationButton.Appearance.Inherit;
        e3m.b(context).inflate(R.layout.ds_internal_subnavigation_button_content, (ViewGroup) this, true);
        this.t = (TextView) findViewById(R.id.label);
        this.u = (ImageView) findViewById(R.id.icon_left);
        this.v = (VkCounter) findViewById(R.id.counter);
        ImageView imageView = (ImageView) findViewById(R.id.icon_right);
        this.w = imageView;
        int dimensionPixelOffset = getContext().getResources().getDimensionPixelOffset(R.dimen.vk_ui_spacing_size_m);
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.vk_ui_spacing_size_xs);
        setPaddingRelative(dimensionPixelOffset, getPaddingTop(), dimensionPixelOffset, getPaddingBottom());
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        int i4 = marginLayoutParams.topMargin;
        int i5 = marginLayoutParams.bottomMargin;
        marginLayoutParams.setMarginStart(dimensionPixelSize);
        marginLayoutParams.topMargin = i4;
        marginLayoutParams.setMarginEnd(dimensionPixelSize);
        marginLayoutParams.bottomMargin = i5;
        setLayoutParams(marginLayoutParams);
        int i6 = 13;
        setOnClickListener(new z00(this, i6));
        Context context2 = getContext();
        boolean isSelected = isSelected();
        SubnavigationButton.Mode mode = this.x;
        int i7 = com.vk.core.view.components.subnavigation.a.$EnumSwitchMapping$1[getActualAppearance().ordinal()];
        if (i7 == 1) {
            i3 = R.attr.vk_ui_icon_primary;
        } else if (i7 == 2) {
            int i8 = com.vk.core.view.components.subnavigation.a.$EnumSwitchMapping$0[mode.ordinal()];
            i3 = R.attr.vk_ui_icon_secondary;
            if (i8 == 1 || i8 == 2 || i8 == 3) {
                if (isSelected) {
                    i3 = R.attr.vk_ui_icon_contrast_themed;
                }
            } else if (i8 != 4) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        imageView.setImageTintList(ColorStateList.valueOf(e3m.f(i3, context2)));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.D);
        boolean z = obtainStyledAttributes.getBoolean(5, true);
        ?? r13 = (Enum) rl3.S(obtainStyledAttributes.getInt(9, size.ordinal()), SubnavigationButton.Size.values());
        setSize(r13 != 0 ? r13 : size);
        SubnavigationButton.Mode mode2 = this.x;
        ?? r132 = (Enum) rl3.S(obtainStyledAttributes.getInt(8, mode2.ordinal()), SubnavigationButton.Mode.values());
        setMode(r132 != 0 ? r132 : mode2);
        SubnavigationButton.Appearance appearance = this.y;
        ?? r133 = (Enum) rl3.S(obtainStyledAttributes.getInt(2, appearance.ordinal()), SubnavigationButton.Appearance.values());
        setAppearance(r133 != 0 ? r133 : appearance);
        setLabel(obtainStyledAttributes.getString(7));
        P4(obtainStyledAttributes.getDrawable(4), z);
        if (obtainStyledAttributes.hasValue(3)) {
            l2(false, Integer.valueOf(obtainStyledAttributes.getInt(3, 0)));
        } else {
            l2(false, null);
        }
        setRightIconVisible(obtainStyledAttributes.getBoolean(6, false));
        setMinWidth(obtainStyledAttributes.getDimensionPixelOffset(0, getResources().getDimensionPixelOffset(R.dimen.ds_subnavigation_button_min_width)));
        s3q0 s3q0Var = s3q0.a;
        obtainStyledAttributes.recycle();
        setOnClickListener(new a50(this, i6));
    }
}
