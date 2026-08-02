package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
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
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.f0;
import androidx.core.content.res.k;
import androidx.core.view.AbstractC2082d0;
import androidx.core.view.C2075a;
import ia.e;
import ia.f;
import ia.i;
import l.AbstractC5335a;
import n0.AbstractC5597a;
import xa.d;
import y0.z;

/* loaded from: classes3.dex */
public class NavigationMenuItemView extends d implements j.a {
    private static final int[] CHECKED_STATE_SET = {R.attr.state_checked};

    /* renamed from: A, reason: collision with root package name */
    public ColorStateList f35555A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f35556B;

    /* renamed from: C, reason: collision with root package name */
    public Drawable f35557C;

    /* renamed from: D, reason: collision with root package name */
    public final C2075a f35558D;

    /* renamed from: t, reason: collision with root package name */
    public int f35559t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f35560u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f35561v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f35562w;

    /* renamed from: x, reason: collision with root package name */
    public final CheckedTextView f35563x;

    /* renamed from: y, reason: collision with root package name */
    public FrameLayout f35564y;

    /* renamed from: z, reason: collision with root package name */
    public g f35565z;

    public class a extends C2075a {
        public a() {
        }

        @Override // androidx.core.view.C2075a
        public void onInitializeAccessibilityNodeInfo(View view, z zVar) {
            super.onInitializeAccessibilityNodeInfo(view, zVar);
            zVar.u0(NavigationMenuItemView.this.f35561v);
        }
    }

    public NavigationMenuItemView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f35564y == null) {
                this.f35564y = (FrameLayout) ((ViewStub) findViewById(ia.g.f48431g)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.f35564y.removeAllViews();
            this.f35564y.addView(view);
        }
    }

    public final StateListDrawable A() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(AbstractC5335a.f55005t, typedValue, true)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(CHECKED_STATE_SET, new ColorDrawable(typedValue.data));
        stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
        return stateListDrawable;
    }

    public final boolean B() {
        return this.f35565z.getTitle() == null && this.f35565z.getIcon() == null && this.f35565z.getActionView() != null;
    }

    @Override // androidx.appcompat.view.menu.j.a
    public void c(g gVar, int i10) {
        this.f35565z = gVar;
        if (gVar.getItemId() > 0) {
            setId(gVar.getItemId());
        }
        setVisibility(gVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            setBackground(A());
        }
        setCheckable(gVar.isCheckable());
        setChecked(gVar.isChecked());
        setEnabled(gVar.isEnabled());
        setTitle(gVar.getTitle());
        setIcon(gVar.getIcon());
        setActionView(gVar.getActionView());
        setContentDescription(gVar.getContentDescription());
        f0.a(this, gVar.getTooltipText());
        z();
    }

    @Override // androidx.appcompat.view.menu.j.a
    public boolean d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j.a
    public g getItemData() {
        return this.f35565z;
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        g gVar = this.f35565z;
        if (gVar != null && gVar.isCheckable() && this.f35565z.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, CHECKED_STATE_SET);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z10) {
        refreshDrawableState();
        if (this.f35561v != z10) {
            this.f35561v = z10;
            this.f35558D.sendAccessibilityEvent(this.f35563x, 2048);
        }
    }

    public void setChecked(boolean z10) {
        refreshDrawableState();
        this.f35563x.setChecked(z10);
        CheckedTextView checkedTextView = this.f35563x;
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z10 && this.f35562w) ? 1 : 0);
    }

    public void setHorizontalPadding(int i10) {
        setPadding(i10, getPaddingTop(), i10, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f35556B) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = AbstractC5597a.r(drawable).mutate();
                drawable.setTintList(this.f35555A);
            }
            int i10 = this.f35559t;
            drawable.setBounds(0, 0, i10, i10);
        } else if (this.f35560u) {
            if (this.f35557C == null) {
                Drawable f10 = k.f(getResources(), f.f48392k, getContext().getTheme());
                this.f35557C = f10;
                if (f10 != null) {
                    int i11 = this.f35559t;
                    f10.setBounds(0, 0, i11, i11);
                }
            }
            drawable = this.f35557C;
        }
        this.f35563x.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i10) {
        this.f35563x.setCompoundDrawablePadding(i10);
    }

    public void setIconSize(int i10) {
        this.f35559t = i10;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f35555A = colorStateList;
        this.f35556B = colorStateList != null;
        g gVar = this.f35565z;
        if (gVar != null) {
            setIcon(gVar.getIcon());
        }
    }

    public void setMaxLines(int i10) {
        this.f35563x.setMaxLines(i10);
    }

    public void setNeedsEmptyIcon(boolean z10) {
        this.f35560u = z10;
    }

    public void setTextAppearance(int i10) {
        C0.j.m(this.f35563x, i10);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f35563x.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f35563x.setText(charSequence);
    }

    public final void z() {
        if (B()) {
            this.f35563x.setVisibility(8);
            FrameLayout frameLayout = this.f35564y;
            if (frameLayout != null) {
                LinearLayoutCompat.a aVar = (LinearLayoutCompat.a) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) aVar).width = -1;
                this.f35564y.setLayoutParams(aVar);
                return;
            }
            return;
        }
        this.f35563x.setVisibility(0);
        FrameLayout frameLayout2 = this.f35564y;
        if (frameLayout2 != null) {
            LinearLayoutCompat.a aVar2 = (LinearLayoutCompat.a) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) aVar2).width = -2;
            this.f35564y.setLayoutParams(aVar2);
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f35562w = true;
        a aVar = new a();
        this.f35558D = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(i.f48474g, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(e.f48354m));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(ia.g.f48433h);
        this.f35563x = checkedTextView;
        AbstractC2082d0.l0(checkedTextView, aVar);
    }
}
