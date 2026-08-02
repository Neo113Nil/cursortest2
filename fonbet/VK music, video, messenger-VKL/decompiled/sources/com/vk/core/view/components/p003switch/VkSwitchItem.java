package com.vk.core.view.components.p003switch;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import android.widget.LinearLayout;
import androidx.appcompat.widget.SwitchCompat;
import com.vk.core.view.components.R$styleable;
import com.vk.core.view.components.control.selection.VkSelectionControlsMiddle;
import com.vk.core.view.components.control.selection.VkSelectionControlsTitleIconPosition;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import xsna.drm0;
import xsna.e3m;
import xsna.e43;
import xsna.j5g;
import xsna.oq;
import xsna.q3;
import xsna.tlo0;
import xsna.too0;

/* compiled from: VkSwitchItem.kt */
/* loaded from: classes17.dex */
public final class VkSwitchItem extends LinearLayout implements Checkable, too0 {
    public static final /* synthetic */ int f = 0;
    public final SwitchCompat b;
    public final VkSelectionControlsMiddle c;
    public a d;
    public boolean e;

    /* compiled from: VkSwitchItem.kt */
    public interface a {
        void b(boolean z);
    }

    public VkSwitchItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    @Override // xsna.too0
    public final void Ng() {
        int dimensionPixelOffset = getContext().getResources().getDimensionPixelOffset(R.dimen.vk_ui_spacing_size2_xs);
        setPadding(getPaddingLeft(), dimensionPixelOffset, getPaddingRight(), dimensionPixelOffset);
        this.c.setAdditionalVerticalPadding(getContext().getResources().getDimensionPixelOffset(R.dimen.vk_ui_spacing_size_m));
        a();
    }

    public final void a() {
        int dimensionPixelOffset = getContext().getResources().getDimensionPixelOffset(R.dimen.vk_ui_spacing_size_xl);
        VkSelectionControlsMiddle vkSelectionControlsMiddle = this.c;
        ViewGroup.LayoutParams layoutParams = vkSelectionControlsMiddle.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (this.e) {
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

    public final void b() {
        SwitchCompat switchCompat = this.b;
        CharSequence textOn = switchCompat.isChecked() ? switchCompat.getTextOn() : switchCompat.getTextOff();
        VkSelectionControlsMiddle vkSelectionControlsMiddle = this.c;
        CharSequence title = vkSelectionControlsMiddle.getTitle();
        if (title == null) {
            title = "";
        }
        CharSequence subtitle = vkSelectionControlsMiddle.getSubtitle();
        List l = e43.l(textOn, title, subtitle != null ? subtitle : "");
        ArrayList arrayList = new ArrayList();
        for (Object obj : l) {
            CharSequence charSequence = (CharSequence) obj;
            if (charSequence != null && !drm0.N(charSequence)) {
                arrayList.add(obj);
            }
        }
        String g0 = j5g.g0(arrayList, ", ", null, null, 0, null, 62);
        if (g0.length() <= 0) {
            g0 = null;
        }
        setContentDescription(g0);
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
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        SwitchCompat switchCompat = this.b;
        CharSequence textOn = switchCompat.isChecked() ? switchCompat.getTextOn() : switchCompat.getTextOff();
        VkSelectionControlsMiddle vkSelectionControlsMiddle = this.c;
        CharSequence title = vkSelectionControlsMiddle.getTitle();
        if (title == null) {
            title = "";
        }
        CharSequence subtitle = vkSelectionControlsMiddle.getSubtitle();
        List l = e43.l(textOn, title, subtitle != null ? subtitle : "");
        ArrayList arrayList = new ArrayList();
        for (Object obj : l) {
            CharSequence charSequence = (CharSequence) obj;
            if (charSequence != null && !drm0.N(charSequence)) {
                arrayList.add(obj);
            }
        }
        String g0 = j5g.g0(arrayList, ", ", null, null, 0, null, 62);
        if (g0.length() > 0) {
            accessibilityEvent.getText().add(g0);
        }
    }

    public final void setAlignSwitchToEnd(boolean z) {
        if (this.e == z) {
            return;
        }
        this.e = z;
        SwitchCompat switchCompat = this.b;
        removeView(switchCompat);
        if (z) {
            addView(switchCompat, 1);
        } else {
            addView(switchCompat, 0);
        }
        a();
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        this.b.setChecked(z);
        b();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.b.setEnabled(z);
        this.c.setEnabled(z);
    }

    public final void setListener(a aVar) {
        this.d = aVar;
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
        SwitchCompat switchCompat = this.b;
        switchCompat.toggle();
        a aVar = this.d;
        if (aVar != null) {
            aVar.b(switchCompat.isChecked());
        }
        b();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VkSwitchItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        LayoutInflater.from(context).inflate(R.layout.ds_internal_switch_item, this);
        SwitchCompat switchCompat = (SwitchCompat) findViewById(R.id.switch_button);
        this.b = switchCompat;
        this.c = (VkSelectionControlsMiddle) findViewById(R.id.middle);
        switchCompat.setClickable(false);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.E, 0, 0);
        String string = obtainStyledAttributes.getString(1);
        String string2 = obtainStyledAttributes.getString(0);
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.vk_ui_base_padding_horizontal);
        setTitle(string != null ? oq.d(tlo0.Companion, string) : null);
        setSubtitle(string2 != null ? oq.d(tlo0.Companion, string2) : null);
        setFocusable(true);
        setScreenReaderFocusable(true);
        setOnClickListener(new q3(this, 16));
        Ng();
        obtainStyledAttributes.recycle();
        setOrientation(0);
        setGravity(16);
        setBackground(e3m.e(R.attr.selectableItemBackground, context));
        setPaddingRelative(dimensionPixelOffset, getPaddingTop(), dimensionPixelOffset, getPaddingBottom());
    }
}
