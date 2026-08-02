package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import defpackage.bgc;
import defpackage.bsk;
import defpackage.efc;
import defpackage.euk;
import defpackage.hm8;
import defpackage.qkj;
import defpackage.z1g;
import defpackage.z7b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class NavigationMenuItemView extends hm8 implements bgc {
    public static final int[] r = {R.attr.state_checked};
    public int g;
    public boolean h;
    public boolean i;
    public final boolean j;
    public final CheckedTextView k;
    public FrameLayout l;
    public efc m;
    public ColorStateList n;
    public boolean o;
    public Drawable p;
    public final euk q;

    public NavigationMenuItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.j = true;
        euk eukVar = new euk(this, 6);
        this.q = eukVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(com.sofascore.results.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(com.sofascore.results.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.sofascore.results.R.id.design_menu_item_text);
        this.k = checkedTextView;
        bsk.q(checkedTextView, eukVar);
    }

    private void setActionView(@Nullable View view) {
        if (view != null) {
            if (this.l == null) {
                this.l = (FrameLayout) ((ViewStub) findViewById(com.sofascore.results.R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.l.removeAllViews();
            this.l.addView(view);
        }
    }

    @Override // defpackage.bgc
    public final void b(efc efcVar) {
        StateListDrawable stateListDrawable;
        this.m = efcVar;
        int i = efcVar.a;
        if (i > 0) {
            setId(i);
        }
        setVisibility(efcVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(com.sofascore.results.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(r, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            setBackground(stateListDrawable);
        }
        setCheckable(efcVar.isCheckable());
        setChecked(efcVar.isChecked());
        setEnabled(efcVar.isEnabled());
        setTitle(efcVar.e);
        setIcon(efcVar.getIcon());
        setActionView(efcVar.getActionView());
        setContentDescription(efcVar.q);
        qkj.a(this, efcVar.r);
        efc efcVar2 = this.m;
        CharSequence charSequence = efcVar2.e;
        CheckedTextView checkedTextView = this.k;
        if (charSequence == null && efcVar2.getIcon() == null && this.m.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.l;
            if (frameLayout != null) {
                z7b z7bVar = (z7b) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) z7bVar).width = -1;
                this.l.setLayoutParams(z7bVar);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.l;
        if (frameLayout2 != null) {
            z7b z7bVar2 = (z7b) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) z7bVar2).width = -2;
            this.l.setLayoutParams(z7bVar2);
        }
    }

    @Override // defpackage.bgc
    public efc getItemData() {
        return this.m;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        efc efcVar = this.m;
        if (efcVar != null && efcVar.isCheckable() && this.m.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, r);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.i != z) {
            this.i = z;
            this.q.h(this.k, com.ironsource.mediationsdk.metadata.a.o);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.k;
        checkedTextView.setChecked(z);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z && this.j) ? 1 : 0);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIcon(@Nullable Drawable drawable) {
        if (drawable != null) {
            if (this.o) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                drawable.setTintList(this.n);
            }
            int i = this.g;
            drawable.setBounds(0, 0, i, i);
        } else if (this.h) {
            if (this.p == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = z1g.a;
                Drawable drawable2 = resources.getDrawable(com.sofascore.results.R.drawable.navigation_empty_icon, theme);
                this.p = drawable2;
                if (drawable2 != null) {
                    int i2 = this.g;
                    drawable2.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.p;
        }
        this.k.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.k.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.g = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.n = colorStateList;
        this.o = colorStateList != null;
        efc efcVar = this.m;
        if (efcVar != null) {
            setIcon(efcVar.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.k.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.h = z;
    }

    public void setTextAppearance(int i) {
        this.k.setTextAppearance(i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.k.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.k.setText(charSequence);
    }
}
