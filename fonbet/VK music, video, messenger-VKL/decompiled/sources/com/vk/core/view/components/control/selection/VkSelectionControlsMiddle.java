package com.vk.core.view.components.control.selection;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.b;
import com.vkontakte.android.R;
import xsna.e3m;
import xsna.krv0;
import xsna.l8g;
import xsna.too0;

/* compiled from: VkSelectionControlsMiddle.kt */
/* loaded from: classes17.dex */
public final class VkSelectionControlsMiddle extends ConstraintLayout implements too0 {
    public CharSequence t;
    public Drawable u;
    public CharSequence v;
    public final TextView w;
    public final ImageView x;
    public final TextView y;
    public int z;

    public VkSelectionControlsMiddle(Context context) {
        this(context, null, 0, 14, 0);
    }

    @Override // xsna.too0
    public final void Ng() {
        Q4();
    }

    public final void P4() {
        this.w.setVisibility(this.t != null ? 0 : 8);
        this.y.setVisibility(this.v != null ? 0 : 8);
        this.x.setVisibility(this.u != null ? 0 : 8);
    }

    public final void Q4() {
        int i = this.z;
        setPadding(getPaddingLeft(), i, getPaddingRight(), i);
        setTitleStyle(e3m.g(R.attr.vk_ui_typography_text_normal, getContext()));
        setTitleColor(R.attr.vk_ui_text_primary);
        setSubtitleStyle(e3m.g(R.attr.vk_ui_typography_footnote_normal, getContext()));
        getContext();
        setSubtitleColor(R.attr.vk_ui_text_secondary);
    }

    public final CharSequence getSubtitle() {
        return this.v;
    }

    public final CharSequence getTitle() {
        return this.t;
    }

    public final Drawable getTitleIcon() {
        return this.u;
    }

    public final void setAdditionalVerticalPadding(int i) {
        this.z = i;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.w.setEnabled(z);
        this.y.setEnabled(z);
    }

    public final void setSubtitle(CharSequence charSequence) {
        this.v = charSequence;
        this.y.setText(charSequence);
        P4();
    }

    public final void setSubtitleColor(int i) {
        int m = krv0.m(i, getContext());
        this.y.setTextColor(new ColorStateList(new int[][]{new int[]{android.R.attr.state_enabled}, new int[0]}, new int[]{m, l8g.f(0.64f, m)}));
    }

    public final void setSubtitleStyle(int i) {
        this.y.setTextAppearance(i);
    }

    public final void setTitle(CharSequence charSequence) {
        this.t = charSequence;
        this.w.setText(charSequence);
        P4();
    }

    public final void setTitleColor(int i) {
        int m = krv0.m(i, getContext());
        this.w.setTextColor(new ColorStateList(new int[][]{new int[]{android.R.attr.state_enabled}, new int[0]}, new int[]{m, l8g.f(0.64f, m)}));
    }

    public final void setTitleIcon(Drawable drawable) {
        this.u = drawable;
        this.x.setImageDrawable(drawable);
        P4();
    }

    public final void setTitleIconPosition(VkSelectionControlsTitleIconPosition vkSelectionControlsTitleIconPosition) {
        b bVar = new b();
        bVar.i(this);
        bVar.h(R.id.title_icon, 6);
        if (vkSelectionControlsTitleIconPosition == VkSelectionControlsTitleIconPosition.AfterTitleText) {
            b.a v = bVar.v(R.id.title_icon);
            b.C0021b c0021b = v.e;
            c0021b.t = R.id.title;
            c0021b.L = e3m.a(R.dimen.vk_ui_spacing_size_xs, getContext());
            v.e.S = 0;
        }
        bVar.b(this);
    }

    public final void setTitleStyle(int i) {
        this.w.setTextAppearance(i);
    }

    public VkSelectionControlsMiddle(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
    }

    public VkSelectionControlsMiddle(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8, 0);
    }

    public /* synthetic */ VkSelectionControlsMiddle(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, 0);
    }

    public VkSelectionControlsMiddle(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        VkSelectionControlsTitleIconPosition vkSelectionControlsTitleIconPosition = VkSelectionControlsTitleIconPosition.AfterTitleText;
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.vk_ui_spacing_size2_xs);
        View inflate = LayoutInflater.from(context).inflate(R.layout.ds_internal_selection_controls_middle, (ViewGroup) this, true);
        this.w = (TextView) inflate.findViewById(R.id.title);
        this.y = (TextView) inflate.findViewById(R.id.subtitle);
        this.x = (ImageView) inflate.findViewById(R.id.title_icon);
        setPadding(getPaddingLeft(), dimensionPixelOffset, getPaddingRight(), dimensionPixelOffset);
        Q4();
    }
}
