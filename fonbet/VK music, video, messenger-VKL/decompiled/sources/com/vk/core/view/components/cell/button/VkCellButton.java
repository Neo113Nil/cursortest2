package com.vk.core.view.components.cell.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.vk.core.view.components.R$styleable;
import com.vk.core.view.components.cell.slot.Slot;
import com.vk.movika.sdk.base.ui.k;
import kotlin.NoWhenBranchMatchedException;
import xsna.bpn0;
import xsna.dp0;
import xsna.giu0;
import xsna.riu0;
import xsna.siu0;
import xsna.too0;

/* compiled from: VkCellButton.kt */
/* loaded from: classes17.dex */
public final class VkCellButton extends ViewGroup implements too0 {
    public static final /* synthetic */ int l = 0;
    public final bpn0 b;
    public final bpn0 c;
    public boolean d;
    public IconSize e;
    public CellSize f;
    public IconBackgroundStyle g;
    public Appearance h;
    public boolean i;
    public IconAlign j;
    public String k;

    /* compiled from: VkCellButton.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IconSize.values().length];
            try {
                iArr[IconSize.Small.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IconSize.Medium.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IconSize.Large.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public VkCellButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    private final siu0 getMilkshakeButton() {
        return (siu0) this.c.getValue();
    }

    private final riu0 getSexyCellButton() {
        return (riu0) this.b.getValue();
    }

    @Override // xsna.too0
    public final void Ng() {
        getContext();
        getMilkshakeButton().Ng();
    }

    public final void a(boolean z, Integer num) {
        giu0 giu0Var = (num == null || num.intValue() == 0) ? null : new giu0(num.intValue());
        this.d = z;
        getContext();
        if (giu0Var == null) {
            getMilkshakeButton().b(this.d, null);
        } else {
            getMilkshakeButton().b(this.d, Integer.valueOf(giu0Var.a));
        }
    }

    public final Appearance getAppearance() {
        return this.h;
    }

    public final CellSize getCellSize() {
        return this.f;
    }

    public final IconAlign getIconAlign() {
        return this.j;
    }

    public final IconBackgroundStyle getIconBackgroundStyle() {
        return this.g;
    }

    public final boolean getIconColorful() {
        return this.i;
    }

    public final IconSize getIconSize() {
        return this.e;
    }

    public final String getTestTag() {
        return this.k;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        getContext();
        siu0 milkshakeButton = getMilkshakeButton();
        milkshakeButton.layout(0, 0, milkshakeButton.getMeasuredWidth(), milkshakeButton.getMeasuredHeight());
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        getContext();
        siu0 milkshakeButton = getMilkshakeButton();
        measureChild(milkshakeButton, i, i2);
        setMeasuredDimension(View.resolveSize(View.MeasureSpec.getSize(i), i), View.resolveSize(milkshakeButton.getMeasuredHeight(), i2));
    }

    public final void setAppearance(Appearance appearance) {
        this.h = appearance;
        getContext();
        getMilkshakeButton().setAppearance(this.h);
        getMilkshakeButton().setIconColorful(this.i);
    }

    public final void setCellSize(CellSize cellSize) {
        this.f = cellSize;
        getContext();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        getContext();
        getMilkshakeButton().setEnabled(z);
    }

    public final void setIconAlign(IconAlign iconAlign) {
        this.j = iconAlign;
        getMilkshakeButton().setIconAlign(iconAlign);
    }

    public final void setIconBackgroundStyle(IconBackgroundStyle iconBackgroundStyle) {
        this.g = iconBackgroundStyle;
        getContext();
        getMilkshakeButton().setIconBackgroundStyle(this.g);
    }

    public final void setIconColorful(boolean z) {
        this.i = z;
        getContext();
        getMilkshakeButton().setAppearance(this.h);
        getMilkshakeButton().setIconColorful(this.i);
    }

    public final void setIconSize(IconSize iconSize) {
        this.e = iconSize;
        int i = a.$EnumSwitchMapping$0[iconSize.ordinal()];
        if (i == 1) {
            Slot.Size size = Slot.Size.S;
        } else if (i == 2) {
            Slot.Size size2 = Slot.Size.S;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            Slot.Size size3 = Slot.Size.S;
        }
        getContext();
        getMilkshakeButton().setIconSize(this.e);
    }

    public final void setIconTint(int i) {
        getContext();
        getMilkshakeButton().setIconTint(i);
        setIconColorful(false);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        getContext();
        getMilkshakeButton().setOnClickListener(onClickListener);
    }

    public final void setSubtitle(CharSequence charSequence) {
        getContext();
        getMilkshakeButton().setSubtitle(charSequence);
    }

    public final void setSubtitleMaxLines(int i) {
        getContext();
        getMilkshakeButton().setSubtitleMaxLines(i);
    }

    public final void setTestTag(String str) {
        this.k = str;
        getMilkshakeButton().setTestTag(str);
    }

    public final void setTitle(CharSequence charSequence) {
        getContext();
        getMilkshakeButton().setTitle(charSequence);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VkCellButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        this.b = new bpn0(new dp0(26, context, attributeSet));
        this.c = new bpn0(new k(28, context, attributeSet));
        this.d = true;
        Slot.Size size = Slot.Size.S;
        this.e = IconSize.Medium;
        this.f = CellSize.Large;
        this.g = IconBackgroundStyle.None;
        this.h = Appearance.Accent;
        this.i = true;
        this.j = IconAlign.Center;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.g, 0, 0);
        String string = obtainStyledAttributes.getString(7);
        String string2 = obtainStyledAttributes.getString(6);
        int resourceId = obtainStyledAttributes.getResourceId(3, 0);
        setIconAlign((IconAlign) IconAlign.h().get(obtainStyledAttributes.getResourceId(4, 1)));
        setIconSize((IconSize) IconSize.h().get(obtainStyledAttributes.getInteger(2, 1)));
        setIconBackgroundStyle((IconBackgroundStyle) IconBackgroundStyle.h().get(obtainStyledAttributes.getInteger(1, 0)));
        setAppearance((Appearance) Appearance.h().get(obtainStyledAttributes.getInteger(0, 0)));
        setIconColorful(obtainStyledAttributes.getBoolean(5, true));
        obtainStyledAttributes.recycle();
        setTitle(string);
        setSubtitle(string2);
        a(this.i, Integer.valueOf(resourceId));
        addView(getMilkshakeButton());
    }

    public final void setSubtitle(int i) {
        getContext();
        getMilkshakeButton().setSubtitle(i);
    }

    public final void setTitle(int i) {
        getContext();
        getMilkshakeButton().setTitle(i);
    }

    public final void setIconTint(ColorStateList colorStateList) {
        getContext();
        getMilkshakeButton().setIconTint(colorStateList);
        setIconColorful(false);
    }

    private static /* synthetic */ void getSexyCellButton$annotations() {
    }
}
