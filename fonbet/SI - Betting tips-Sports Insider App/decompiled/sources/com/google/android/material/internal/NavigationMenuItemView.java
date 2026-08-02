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
import androidx.appcompat.view.menu.a0;
import androidx.appcompat.view.menu.p;
import androidx.appcompat.widget.k2;
import androidx.core.view.z0;
import f0.l;
import m4.g;
import q0.c;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class NavigationMenuItemView extends ForegroundLinearLayout implements a0 {
    private static final int[] CHECKED_STATE_SET = {R.attr.state_checked};
    private final androidx.core.view.b accessibilityDelegate;
    private FrameLayout actionArea;
    boolean checkable;
    private Drawable emptyDrawable;
    private boolean hasIconTintList;
    private int iconSize;
    private ColorStateList iconTintList;
    boolean isBold;
    private p itemData;
    private boolean needsEmptyIcon;
    private final CheckedTextView textView;

    public NavigationMenuItemView(@NonNull Context context) {
        this(context, null);
    }

    private void adjustAppearance() {
        if (shouldExpandActionArea()) {
            this.textView.setVisibility(8);
            FrameLayout frameLayout = this.actionArea;
            if (frameLayout != null) {
                k2 k2Var = (k2) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) k2Var).width = -1;
                this.actionArea.setLayoutParams(k2Var);
                return;
            }
            return;
        }
        this.textView.setVisibility(0);
        FrameLayout frameLayout2 = this.actionArea;
        if (frameLayout2 != null) {
            k2 k2Var2 = (k2) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) k2Var2).width = -2;
            this.actionArea.setLayoutParams(k2Var2);
        }
    }

    private StateListDrawable createDefaultBackground() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(com.sports.insider.R.attr.colorControlHighlight, typedValue, true)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(CHECKED_STATE_SET, new ColorDrawable(typedValue.data));
        stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
        return stateListDrawable;
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.actionArea == null) {
                this.actionArea = (FrameLayout) ((ViewStub) findViewById(com.google.android.material.R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.actionArea.removeAllViews();
            this.actionArea.addView(view);
        }
    }

    private boolean shouldExpandActionArea() {
        p pVar = this.itemData;
        return pVar.f521e == null && pVar.getIcon() == null && this.itemData.getActionView() != null;
    }

    @Override // androidx.appcompat.view.menu.a0
    public p getItemData() {
        return this.itemData;
    }

    @Override // androidx.appcompat.view.menu.a0
    public void initialize(@NonNull p pVar, int i5) {
        this.itemData = pVar;
        int i10 = pVar.f517a;
        if (i10 > 0) {
            setId(i10);
        }
        setVisibility(pVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            setBackground(createDefaultBackground());
        }
        setCheckable(pVar.isCheckable());
        setChecked(pVar.isChecked());
        setEnabled(pVar.isEnabled());
        setTitle(pVar.f521e);
        setIcon(pVar.getIcon());
        setActionView(pVar.getActionView());
        setContentDescription(pVar.q);
        g.v(this, pVar.f532r);
        adjustAppearance();
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i5) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i5 + 1);
        p pVar = this.itemData;
        if (pVar != null && pVar.isCheckable() && this.itemData.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, CHECKED_STATE_SET);
        }
        return onCreateDrawableState;
    }

    public boolean prefersCondensedTitle() {
        return false;
    }

    public void recycle() {
        FrameLayout frameLayout = this.actionArea;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        this.textView.setCompoundDrawables(null, null, null, null);
    }

    public void setCheckable(boolean z5) {
        refreshDrawableState();
        if (this.checkable != z5) {
            this.checkable = z5;
            this.accessibilityDelegate.sendAccessibilityEvent(this.textView, 2048);
        }
    }

    public void setChecked(boolean z5) {
        refreshDrawableState();
        this.textView.setChecked(z5);
        CheckedTextView checkedTextView = this.textView;
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z5 && this.isBold) ? 1 : 0);
    }

    public void setHorizontalPadding(int i5) {
        setPadding(i5, getPaddingTop(), i5, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.hasIconTintList) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                drawable.setTintList(this.iconTintList);
            }
            int i5 = this.iconSize;
            drawable.setBounds(0, 0, i5, i5);
        } else if (this.needsEmptyIcon) {
            if (this.emptyDrawable == null) {
                Resources resources = getResources();
                int i10 = com.google.android.material.R.drawable.navigation_empty_icon;
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = l.f9293a;
                Drawable drawable2 = resources.getDrawable(i10, theme);
                this.emptyDrawable = drawable2;
                if (drawable2 != null) {
                    int i11 = this.iconSize;
                    drawable2.setBounds(0, 0, i11, i11);
                }
            }
            drawable = this.emptyDrawable;
        }
        this.textView.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i5) {
        this.textView.setCompoundDrawablePadding(i5);
    }

    public void setIconSize(int i5) {
        this.iconSize = i5;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.iconTintList = colorStateList;
        this.hasIconTintList = colorStateList != null;
        p pVar = this.itemData;
        if (pVar != null) {
            setIcon(pVar.getIcon());
        }
    }

    public void setMaxLines(int i5) {
        this.textView.setMaxLines(i5);
    }

    public void setNeedsEmptyIcon(boolean z5) {
        this.needsEmptyIcon = z5;
    }

    public void setTextAppearance(int i5) {
        this.textView.setTextAppearance(i5);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.textView.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.textView.setText(charSequence);
    }

    public boolean showsIcon() {
        return true;
    }

    public NavigationMenuItemView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(@NonNull Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        this.isBold = true;
        androidx.core.view.b bVar = new androidx.core.view.b() { // from class: com.google.android.material.internal.NavigationMenuItemView.1
            @Override // androidx.core.view.b
            public void onInitializeAccessibilityNodeInfo(View view, @NonNull c cVar) {
                super.onInitializeAccessibilityNodeInfo(view, cVar);
                cVar.f21914a.setCheckable(NavigationMenuItemView.this.checkable);
            }
        };
        this.accessibilityDelegate = bVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(com.google.android.material.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(com.google.android.material.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.google.android.material.R.id.design_menu_item_text);
        this.textView = checkedTextView;
        z0.o(checkedTextView, bVar);
    }

    public void initialize(@NonNull p pVar, boolean z5) {
        this.isBold = z5;
        initialize(pVar, 0);
    }

    public void setShortcut(boolean z5, char c2) {
    }
}
