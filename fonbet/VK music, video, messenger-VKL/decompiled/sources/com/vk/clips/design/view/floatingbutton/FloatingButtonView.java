package com.vk.clips.design.view.floatingbutton;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.b;
import com.vk.core.view.components.spinner.VkSpinner;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.csr;
import xsna.dsr;
import xsna.e3m;
import xsna.e43;
import xsna.esr;
import xsna.f4m;
import xsna.gko;
import xsna.gpo0;
import xsna.krv0;
import xsna.rrr;
import xsna.srr;
import xsna.tg;
import xsna.tlo0;
import xsna.trr;
import xsna.urr;
import xsna.zmp0;

/* compiled from: FloatingButtonView.kt */
/* loaded from: classes16.dex */
public final class FloatingButtonView extends ConstraintLayout {
    public static final int[] C = {R.id.fb_internal_left_slot, R.id.fb_internal_middle_slot, R.id.fb_internal_right_slot};
    public boolean A;
    public b B;
    public rrr t;
    public trr u;
    public srr v;
    public csr w;
    public dsr x;
    public esr y;
    public final int z;

    public FloatingButtonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        int a = e3m.a(R.dimen.floating_button_height, context);
        this.z = a;
        setClipToPadding(false);
        setClipChildren(false);
        setClickable(true);
        setFocusable(true);
        float f = a / 2.0f;
        ColorStateList valueOf = ColorStateList.valueOf(0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(f);
        gradientDrawable.setColor(-1);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadius(f);
        gradientDrawable2.setColor(-1);
        setBackground(new RippleDrawable(valueOf, gradientDrawable, gradientDrawable2));
        P4(R.id.fb_internal_left_slot);
        P4(R.id.fb_internal_middle_slot);
        P4(R.id.fb_internal_right_slot);
        Q4();
        X4();
    }

    public static void U4(FloatingButtonView floatingButtonView, int i, FrameLayout frameLayout) {
        ConstraintLayout.b bVar = new ConstraintLayout.b(-2, -2);
        int i2 = 0;
        int i3 = 0;
        while (i3 < floatingButtonView.getChildCount()) {
            int i4 = i3 + 1;
            View childAt = floatingButtonView.getChildAt(i3);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            int i5 = i2 + 1;
            if (i2 < 0) {
                e43.t();
                throw null;
            }
            if (childAt.getId() == i) {
                b bVar2 = new b();
                bVar2.i(floatingButtonView);
                frameLayout.setId(i);
                floatingButtonView.removeViewAt(i2);
                floatingButtonView.addView(frameLayout, i2, bVar);
                bVar2.b(floatingButtonView);
                return;
            }
            i3 = i4;
            i2 = i5;
        }
    }

    public final void P4(int i) {
        View view = new View(getContext());
        view.setId(i);
        view.setVisibility(8);
        addView(view, new ConstraintLayout.b(-2, -2));
    }

    public final void Q4() {
        b bVar = new b();
        bVar.i(this);
        int[] iArr = C;
        bVar.s(0, 6, 0, 7, iArr);
        for (int i = 0; i < 3; i++) {
            int i2 = iArr[i];
            bVar.f(i2, 0);
            bVar.n(i2, -2);
        }
        bVar.G(R.id.fb_internal_left_slot, 6, 0);
        bVar.G(R.id.fb_internal_left_slot, 7, 0);
        bVar.G(R.id.fb_internal_middle_slot, 6, 0);
        bVar.G(R.id.fb_internal_middle_slot, 7, 0);
        bVar.G(R.id.fb_internal_right_slot, 6, 0);
        bVar.G(R.id.fb_internal_right_slot, 7, 0);
        bVar.J(R.id.fb_internal_left_slot, this.t != null ? 0 : 8);
        bVar.J(R.id.fb_internal_middle_slot, this.v != null ? 0 : 8);
        bVar.J(R.id.fb_internal_right_slot, this.u == null ? 8 : 0);
        bVar.G(R.id.fb_internal_left_slot, 7, e3m.a(R.dimen.middle_text_margin, getContext()));
        bVar.p(getId(), -2);
        bVar.n(getId(), this.z);
        bVar.b(this);
        X4();
    }

    public final csr T4() {
        csr csrVar = this.w;
        if (csrVar != null) {
            return csrVar;
        }
        csr csrVar2 = new csr(getContext(), null, 0);
        csrVar2.setClipToPadding(false);
        csrVar2.setClipChildren(false);
        this.w = csrVar2;
        U4(this, R.id.fb_internal_left_slot, csrVar2);
        return csrVar2;
    }

    public final void V4(boolean z) {
        if (this.A == z) {
            return;
        }
        this.A = z;
        zmp0.a(this, null);
        if (!z) {
            Q4();
            return;
        }
        b bVar = this.B;
        if (bVar == null) {
            bVar = new b();
            bVar.i(this);
            bVar.h(R.id.fb_internal_middle_slot, 6);
            bVar.h(R.id.fb_internal_middle_slot, 7);
            bVar.h(R.id.fb_internal_right_slot, 6);
            bVar.h(R.id.fb_internal_right_slot, 7);
            bVar.h(R.id.fb_internal_left_slot, 6);
            bVar.h(R.id.fb_internal_left_slot, 7);
            bVar.k(R.id.fb_internal_left_slot, 6, 0, 6);
            bVar.k(R.id.fb_internal_left_slot, 7, 0, 7);
            bVar.f(R.id.fb_internal_left_slot, 0);
            bVar.J(R.id.fb_internal_left_slot, 0);
            bVar.J(R.id.fb_internal_middle_slot, 8);
            bVar.J(R.id.fb_internal_right_slot, 8);
            int id = getId();
            int i = this.z;
            bVar.p(id, i);
            bVar.n(getId(), i);
            this.B = bVar;
        }
        bVar.b(this);
        X4();
    }

    public final void X4() {
        int a;
        int a2;
        if (this.A) {
            rrr rrrVar = this.t;
            if (rrrVar == null || (rrrVar instanceof rrr.a)) {
                a2 = e3m.a(R.dimen.collapsed_left_padding_icon, getContext());
            } else {
                if (!(rrrVar instanceof rrr.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                a2 = e3m.a(R.dimen.collapsed_left_padding_picture, getContext());
            }
            f4m.l(a2, a2, this);
            return;
        }
        rrr rrrVar2 = this.t;
        if (rrrVar2 == null || (rrrVar2 instanceof rrr.a)) {
            a = e3m.a(R.dimen.expanded_padding_default, getContext());
        } else {
            if (!(rrrVar2 instanceof rrr.b)) {
                throw new NoWhenBranchMatchedException();
            }
            a = e3m.a(R.dimen.expanded_left_padding_picture, getContext());
        }
        f4m.x(a, this);
        f4m.w(this.u == null ? e3m.a(R.dimen.expanded_padding_default, getContext()) : e3m.a(R.dimen.expanded_right_padding, getContext()), this);
    }

    @Override // android.view.View
    public final rrr getLeft() {
        return this.t;
    }

    public final srr getMiddle() {
        return this.v;
    }

    @Override // android.view.View
    public final trr getRight() {
        return this.u;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(this.z, 1073741824));
    }

    public final void setLeft(rrr rrrVar) {
        this.t = rrrVar;
        csr T4 = T4();
        T4.setVisibility(rrrVar != null ? 0 : 8);
        if (rrrVar != null) {
            T4.a(rrrVar);
        }
        X4();
    }

    public final void setLeftMainPictureController(urr urrVar) {
        T4().setLeftPictureController(urrVar);
    }

    public final void setMiddle(srr srrVar) {
        this.v = srrVar;
        dsr dsrVar = this.x;
        if (dsrVar == null) {
            dsrVar = new dsr(getContext(), null, 0);
            dsrVar.setClipToPadding(false);
            dsrVar.setClipChildren(false);
            this.x = dsrVar;
            U4(this, R.id.fb_internal_middle_slot, dsrVar);
        }
        dsrVar.setVisibility((srrVar == null || this.A) ? 8 : 0);
        if (srrVar != null) {
            if (!(srrVar instanceof srr.a)) {
                throw new NoWhenBranchMatchedException();
            }
            tlo0 tlo0Var = ((srr.a) srrVar).a;
            VkText vkText = dsrVar.b;
            if (vkText == null) {
                vkText = new VkText(dsrVar.getContext(), null, 6, 0);
                vkText.setId(R.id.fb_internal_middle_title);
                vkText.setMaxLines(1);
                vkText.setEllipsize(TextUtils.TruncateAt.END);
                vkText.setTextAppearance(R.style.VkUiTypography_Title3SemiBold);
                vkText.setTextColor(krv0.l(R.attr.vk_ui_text_primary_invariably));
                dsrVar.addView(vkText, new FrameLayout.LayoutParams(-2, -2));
                dsrVar.b = vkText;
            }
            vkText.setText(tlo0Var.a(vkText.getContext()));
            vkText.setVisibility(0);
            VkSpinner vkSpinner = dsrVar.c;
            if (vkSpinner == null) {
                vkSpinner = new VkSpinner(dsrVar.getContext(), null, 6, 0);
                dsrVar.addView(vkSpinner, new FrameLayout.LayoutParams(-2, -2));
                vkSpinner.setId(R.id.fb_internal_middle_progress);
                vkSpinner.setSpinnerSize(VkSpinner.SpinnerSize.Size24);
                dsrVar.c = vkSpinner;
            }
            f4m.j(vkSpinner);
        }
    }

    public final void setRight(trr trrVar) {
        this.u = trrVar;
        esr esrVar = this.y;
        if (esrVar == null) {
            esrVar = new esr(getContext(), null, 0);
            esrVar.setClipToPadding(false);
            esrVar.setClipChildren(false);
            this.y = esrVar;
            U4(this, R.id.fb_internal_right_slot, esrVar);
        }
        esrVar.setVisibility((trrVar == null || this.A) ? 8 : 0);
        if (trrVar != null) {
            trr.a aVar = (trr.a) trrVar;
            ImageView imageView = esrVar.b;
            if (imageView == null) {
                imageView = new ImageView(esrVar.getContext());
                imageView.setId(R.id.fb_internal_right_icon);
                imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                int a = (e3m.a(R.dimen.expanded_right_padding, esrVar.getContext()) * 2) + e3m.a(R.dimen.right_slot_icon_size, esrVar.getContext());
                esrVar.addView(imageView, new FrameLayout.LayoutParams(a, a));
                esrVar.b = imageView;
            }
            imageView.setVisibility(0);
            imageView.setImageDrawable(gko.b(aVar.a.a, imageView.getContext()));
            imageView.setContentDescription(null);
            gpo0.f(imageView, aVar.b);
            imageView.setOnClickListener(new tg(trrVar, 3));
        }
        X4();
    }
}
