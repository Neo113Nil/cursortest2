package com.google.android.material.internal;

import android.R;
import android.content.Context;
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
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.g0;
import androidx.core.view.C5305a;
import androidx.core.view.Y;
import s7.C9611f;
import y2.q;

/* loaded from: classes9.dex */
public class NavigationMenuItemView extends C9611f implements n.a {

    /* renamed from: q, reason: collision with root package name */
    private static final int[] f58428q = {R.attr.state_checked};

    /* renamed from: k, reason: collision with root package name */
    private int f58429k;

    /* renamed from: l, reason: collision with root package name */
    boolean f58430l;

    /* renamed from: m, reason: collision with root package name */
    private final CheckedTextView f58431m;

    /* renamed from: n, reason: collision with root package name */
    private FrameLayout f58432n;

    /* renamed from: o, reason: collision with root package name */
    private i f58433o;

    /* renamed from: p, reason: collision with root package name */
    private final C5305a f58434p;

    final class a extends C5305a {
        a() {
        }

        @Override // androidx.core.view.C5305a
        public final void onInitializeAccessibilityNodeInfo(View view, @NonNull q qVar) {
            super.onInitializeAccessibilityNodeInfo(view, qVar);
            qVar.I(NavigationMenuItemView.this.f58430l);
        }
    }

    public NavigationMenuItemView(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a aVar = new a();
        this.f58434p = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(ru.ozon.app.android.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        this.f58429k = context.getResources().getDimensionPixelSize(ru.ozon.app.android.R.dimen.design_navigation_icon_size);
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(ru.ozon.app.android.R.id.design_menu_item_text);
        this.f58431m = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        Y.C(checkedTextView, aVar);
    }

    @Override // androidx.appcompat.view.menu.n.a
    public final boolean c() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n.a
    public final void e(@NonNull i iVar) {
        StateListDrawable stateListDrawable;
        this.f58433o = iVar;
        if (iVar.getItemId() > 0) {
            setId(iVar.getItemId());
        }
        setVisibility(iVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(ru.ozon.app.android.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f58428q, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            int i11 = Y.f42258g;
            setBackground(stateListDrawable);
        }
        boolean isCheckable = iVar.isCheckable();
        refreshDrawableState();
        boolean z11 = this.f58430l;
        CheckedTextView checkedTextView = this.f58431m;
        if (z11 != isCheckable) {
            this.f58430l = isCheckable;
            this.f58434p.sendAccessibilityEvent(checkedTextView, 2048);
        }
        boolean isChecked = iVar.isChecked();
        refreshDrawableState();
        checkedTextView.setChecked(isChecked);
        setEnabled(iVar.isEnabled());
        checkedTextView.setText(iVar.getTitle());
        Drawable icon = iVar.getIcon();
        if (icon != null) {
            int i12 = this.f58429k;
            icon.setBounds(0, 0, i12, i12);
        }
        checkedTextView.setCompoundDrawablesRelative(icon, null, null, null);
        View actionView = iVar.getActionView();
        if (actionView != null) {
            if (this.f58432n == null) {
                this.f58432n = (FrameLayout) ((ViewStub) findViewById(ru.ozon.app.android.R.id.design_menu_item_action_area_stub)).inflate();
            }
            this.f58432n.removeAllViews();
            this.f58432n.addView(actionView);
        }
        setContentDescription(iVar.getContentDescription());
        g0.a(this, iVar.getTooltipText());
        if (this.f58433o.getTitle() == null && this.f58433o.getIcon() == null && this.f58433o.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.f58432n;
            if (frameLayout != null) {
                LinearLayoutCompat.a aVar = (LinearLayoutCompat.a) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) aVar).width = -1;
                this.f58432n.setLayoutParams(aVar);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.f58432n;
        if (frameLayout2 != null) {
            LinearLayoutCompat.a aVar2 = (LinearLayoutCompat.a) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) aVar2).width = -2;
            this.f58432n.setLayoutParams(aVar2);
        }
    }

    @Override // androidx.appcompat.view.menu.n.a
    public final i g() {
        return this.f58433o;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final int[] onCreateDrawableState(int i11) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i11 + 1);
        i iVar = this.f58433o;
        if (iVar != null && iVar.isCheckable() && this.f58433o.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f58428q);
        }
        return onCreateDrawableState;
    }
}
