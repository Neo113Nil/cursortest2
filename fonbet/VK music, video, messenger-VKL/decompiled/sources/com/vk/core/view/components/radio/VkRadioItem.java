package com.vk.core.view.components.radio;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import com.vk.core.view.components.R$styleable;
import com.vk.core.view.components.control.selection.VkSelectionControlsMiddle;
import com.vk.core.view.components.control.selection.VkSelectionControlsTitleIconPosition;
import com.vk.core.view.components.radio.VkRadioItem;
import com.vkontakte.android.R;
import xsna.e3m;
import xsna.oq;
import xsna.tlo0;
import xsna.too0;
import xsna.xz5;

/* compiled from: VkRadioItem.kt */
/* loaded from: classes17.dex */
public final class VkRadioItem extends LinearLayout implements Checkable, too0 {
    public static final /* synthetic */ int e = 0;
    public final VkRadioButton b;
    public final VkSelectionControlsMiddle c;
    public boolean d;

    /* compiled from: VkRadioItem.kt */
    public interface a {
    }

    public VkRadioItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    @Override // xsna.too0
    public final void Ng() {
        this.c.setAdditionalVerticalPadding(getContext().getResources().getDimensionPixelOffset(R.dimen.vk_ui_spacing_size2_xs));
        a();
    }

    public final void a() {
        Resources resources = getContext().getResources();
        getContext();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.vk_ui_spacing_size_xl);
        VkSelectionControlsMiddle vkSelectionControlsMiddle = this.c;
        ViewGroup.LayoutParams layoutParams = vkSelectionControlsMiddle.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (this.d) {
            int i = marginLayoutParams.topMargin;
            int i2 = marginLayoutParams.bottomMargin;
            marginLayoutParams.setMarginStart(0);
            marginLayoutParams.topMargin = i;
            marginLayoutParams.setMarginEnd(dimensionPixelOffset);
            marginLayoutParams.bottomMargin = i2;
        } else {
            int i3 = marginLayoutParams.topMargin;
            int i4 = marginLayoutParams.bottomMargin;
            marginLayoutParams.setMarginStart(dimensionPixelOffset);
            marginLayoutParams.topMargin = i3;
            marginLayoutParams.setMarginEnd(0);
            marginLayoutParams.bottomMargin = i4;
        }
        vkSelectionControlsMiddle.setLayoutParams(marginLayoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "android.widget.RadioButton";
    }

    public final CharSequence getSubtitle() {
        return this.c.getSubtitle();
    }

    public final CharSequence getTitle() {
        return this.c.getTitle();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.b.isChecked();
    }

    @Override // android.view.View
    public final boolean isSelected() {
        return this.b.isSelected();
    }

    public final void setAlignRadioButtonToEnd(boolean z) {
        if (this.d == z) {
            return;
        }
        this.d = z;
        VkRadioButton vkRadioButton = this.b;
        removeView(vkRadioButton);
        if (z) {
            addView(vkRadioButton, 1);
        } else {
            addView(vkRadioButton, 0);
        }
        a();
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        this.b.setChecked(z);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.b.setEnabled(z);
        this.c.setEnabled(z);
    }

    public final void setListener(final a aVar) {
        this.b.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: xsna.bfv0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                int i = VkRadioItem.e;
                VkRadioItem.a aVar2 = VkRadioItem.a.this;
                if (aVar2 != null) {
                    nue0 nue0Var = (nue0) aVar2;
                    rg50 rg50Var = nue0Var.a;
                    int i2 = nue0Var.b;
                    if (z) {
                        rg50Var.C(i2);
                    }
                }
            }
        });
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        this.b.setSelected(z);
    }

    public final void setSubtitle(tlo0 tlo0Var) {
        this.c.setSubtitle(tlo0Var != null ? tlo0Var.a(getContext()) : null);
    }

    public final void setTitle(tlo0 tlo0Var) {
        this.c.setTitle(tlo0Var != null ? tlo0Var.a(getContext()) : null);
    }

    public final void setTitleIcon(Drawable drawable) {
        this.c.setTitleIcon(drawable);
    }

    public final void setTitleIconPosition(VkSelectionControlsTitleIconPosition vkSelectionControlsTitleIconPosition) {
        this.c.setTitleIconPosition(vkSelectionControlsTitleIconPosition);
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        this.b.toggle();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VkRadioItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        LayoutInflater.from(context).inflate(R.layout.ds_internal_radio_button_item, this);
        this.b = (VkRadioButton) findViewById(R.id.radio_button);
        this.c = (VkSelectionControlsMiddle) findViewById(R.id.middle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.w, 0, 0);
        String string = obtainStyledAttributes.getString(1);
        String string2 = obtainStyledAttributes.getString(0);
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.vk_ui_base_padding_horizontal);
        setTitle(string != null ? oq.d(tlo0.Companion, string) : null);
        setSubtitle(string2 != null ? oq.d(tlo0.Companion, string2) : null);
        setFocusable(true);
        setScreenReaderFocusable(true);
        setOnClickListener(new xz5(this, 16));
        Ng();
        obtainStyledAttributes.recycle();
        setOrientation(0);
        setGravity(16);
        setBackground(e3m.e(R.attr.selectableItemBackground, context));
        setPaddingRelative(dimensionPixelOffset, getPaddingTop(), dimensionPixelOffset, getPaddingBottom());
    }
}
