package com.vk.im.ui.views.settings;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.common.view.settings.a;
import com.vk.ui.R$styleable;
import com.vkontakte.android.R;
import xsna.bwt0;
import xsna.dhr0;

/* compiled from: CheckableLabelSettingsView.kt */
/* loaded from: classes2.dex */
public final class CheckableLabelSettingsView extends LabelSettingsView implements a {
    public a.InterfaceC0721a A;
    public Integer B;
    public final AppCompatImageView y;
    public boolean z;

    public CheckableLabelSettingsView(Context context) {
        this(context, null, 0, 14, 0);
    }

    @Override // com.vk.im.ui.views.settings.LabelSettingsView, xsna.too0
    public final void Ng() {
        super.Ng();
        Integer num = this.B;
        if (num != null) {
            setTint(num.intValue());
        }
    }

    public final Rect getCheckIconVisibleRect() {
        return bwt0.F(this.y);
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.z;
    }

    @Override // android.view.View
    public final boolean performClick() {
        boolean z = this.z;
        if (!z) {
            boolean z2 = !z;
            this.z = z2;
            a.InterfaceC0721a interfaceC0721a = this.A;
            if (interfaceC0721a != null) {
                interfaceC0721a.a(this, z2, true);
            }
            bwt0.p0(this.y, this.z);
        }
        return super.performClick();
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        boolean z2 = this.z;
        if (z2 == z) {
            return;
        }
        boolean z3 = !z2;
        this.z = z3;
        a.InterfaceC0721a interfaceC0721a = this.A;
        if (interfaceC0721a != null) {
            interfaceC0721a.a(this, z3, false);
        }
        bwt0.p0(this.y, this.z);
    }

    @Override // com.vk.common.view.settings.a
    public void setOnCheckedChangeListener(a.InterfaceC0721a interfaceC0721a) {
        this.A = interfaceC0721a;
    }

    public final void setTint(int i) {
        this.B = Integer.valueOf(i);
        bwt0.o0(this.y, dhr0.t.c(i));
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        boolean z = !this.z;
        this.z = z;
        a.InterfaceC0721a interfaceC0721a = this.A;
        if (interfaceC0721a != null) {
            interfaceC0721a.a(this, z, false);
        }
        bwt0.p0(this.y, this.z);
    }

    public CheckableLabelSettingsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
    }

    public CheckableLabelSettingsView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8, 0);
    }

    public /* synthetic */ CheckableLabelSettingsView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, 0);
    }

    public CheckableLabelSettingsView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, null, R.attr.vkim_checkableLabelSettingsStyle);
        appCompatImageView.setId(View.generateViewId());
        ConstraintLayout.b bVar = new ConstraintLayout.b(-2, -2);
        bVar.i = 0;
        bVar.l = 0;
        bVar.h = 0;
        appCompatImageView.setLayoutParams(bVar);
        this.y = appCompatImageView;
        TextView subtitleView = getSubtitleView();
        ViewGroup.LayoutParams layoutParams = subtitleView.getLayoutParams();
        if (layoutParams != null) {
            ConstraintLayout.b bVar2 = (ConstraintLayout.b) layoutParams;
            bVar2.h = -1;
            bVar2.g = appCompatImageView.getId();
            subtitleView.setLayoutParams(bVar2);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.b, i, i2);
            bwt0.o0(appCompatImageView, obtainStyledAttributes.getColor(0, -16777216));
            bwt0.p0(appCompatImageView, false);
            addView(appCompatImageView);
            obtainStyledAttributes.recycle();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
    }
}
