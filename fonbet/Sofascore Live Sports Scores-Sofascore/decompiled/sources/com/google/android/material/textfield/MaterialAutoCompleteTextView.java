package com.google.android.material.textfield;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.sofascore.results.R;
import defpackage.bb0;
import defpackage.ec0;
import defpackage.gyb;
import defpackage.m6k;
import defpackage.nc0;
import defpackage.oyn;
import defpackage.pjf;
import defpackage.qcb;
import defpackage.qzb;
import defpackage.w3a;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class MaterialAutoCompleteTextView extends bb0 {
    public final qcb e;
    public final AccessibilityManager f;
    public final int[] g;
    public final Rect h;
    public final int i;
    public final float j;
    public ColorStateList k;
    public int l;
    public ColorStateList m;

    public MaterialAutoCompleteTextView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(oyn.U(context, attributeSet, R.attr.autoCompleteTextViewStyle, 0), attributeSet);
        this.g = new int[]{android.R.attr.state_selected};
        this.h = new Rect();
        Context context2 = getContext();
        TypedArray Y = m6k.Y(context2, attributeSet, pjf.t, R.attr.autoCompleteTextViewStyle, R.style.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        if (Y.hasValue(0) && Y.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        this.i = Y.getResourceId(3, R.layout.mtrl_auto_complete_simple_item);
        int i = 1;
        this.j = Y.getDimensionPixelOffset(1, R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        if (Y.hasValue(2)) {
            this.k = ColorStateList.valueOf(Y.getColor(2, 0));
        }
        this.l = Y.getColor(4, 0);
        this.m = w3a.x(context2, Y, 5);
        this.f = (AccessibilityManager) context2.getSystemService("accessibility");
        qcb qcbVar = new qcb(context2, null, R.attr.listPopupWindowStyle, 0);
        this.e = qcbVar;
        qcbVar.y = true;
        ec0 ec0Var = qcbVar.z;
        ec0Var.setFocusable(true);
        qcbVar.o = this;
        ec0Var.setInputMethodMode(2);
        qcbVar.m(getAdapter());
        qcbVar.p = new nc0(this, i);
        if (Y.hasValue(6)) {
            setSimpleItems(Y.getResourceId(6, 0));
        }
        Y.recycle();
    }

    public final TextInputLayout b() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public final boolean c() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.f;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            return true;
        }
        if (accessibilityManager == null || !accessibilityManager.isEnabled() || (enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16)) == null) {
            return false;
        }
        for (AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
            if (accessibilityServiceInfo.getSettingsActivityName() != null && accessibilityServiceInfo.getSettingsActivityName().contains("SwitchAccess")) {
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.AutoCompleteTextView
    public final void dismissDropDown() {
        if (c()) {
            this.e.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    @Nullable
    public ColorStateList getDropDownBackgroundTintList() {
        return this.k;
    }

    @Override // android.widget.TextView
    @Nullable
    public CharSequence getHint() {
        TextInputLayout b = b();
        return (b == null || !b.F) ? super.getHint() : b.getHint();
    }

    public float getPopupElevation() {
        return this.j;
    }

    public int getSimpleItemSelectedColor() {
        return this.l;
    }

    @Nullable
    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.m;
    }

    @Override // android.widget.AutoCompleteTextView
    public final boolean isPopupShowing() {
        qcb qcbVar = this.e;
        if (qcbVar == null || !qcbVar.z.isShowing()) {
            return super.isPopupShowing();
        }
        return true;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout b = b();
        if (b != null && b.F && super.getHint() == null) {
            String str = Build.MANUFACTURER;
            if ((str != null ? str.toLowerCase(Locale.ENGLISH) : "").equals("meizu")) {
                setHint("");
            }
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e.dismiss();
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (isPopupShowing()) {
            return super.onKeyDown(i, keyEvent);
        }
        boolean z = i == 66 || i == 23;
        boolean z2 = i == 62;
        if (getKeyListener() == null ? !(z || z2) : !(z && getMaxLines() == 1)) {
            return super.onKeyDown(i, keyEvent);
        }
        TextInputLayout b = b();
        if (b != null) {
            b.getEndIconView().performClick();
        }
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout b = b();
            int i3 = 0;
            if (adapter != null && b != null) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                qcb qcbVar = this.e;
                int min = Math.min(adapter.getCount(), Math.max(0, !qcbVar.z.isShowing() ? -1 : qcbVar.c.getSelectedItemPosition()) + 15);
                View view = null;
                int i4 = 0;
                for (int max = Math.max(0, min - 15); max < min; max++) {
                    int itemViewType = adapter.getItemViewType(max);
                    if (itemViewType != i3) {
                        view = null;
                        i3 = itemViewType;
                    }
                    view = adapter.getView(max, view, b);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i4 = Math.max(i4, view.getMeasuredWidth());
                }
                Drawable background = qcbVar.z.getBackground();
                if (background != null) {
                    Rect rect = this.h;
                    background.getPadding(rect);
                    i4 += rect.left + rect.right;
                }
                i3 = b.getEndIconView().getMeasuredWidth() + i4;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, i3), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        if (c()) {
            return;
        }
        super.onWindowFocusChanged(z);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(@Nullable T t) {
        super.setAdapter(t);
        this.e.m(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        qcb qcbVar = this.e;
        if (qcbVar != null) {
            qcbVar.o(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i));
    }

    public void setDropDownBackgroundTintList(@Nullable ColorStateList colorStateList) {
        this.k = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof qzb) {
            ((qzb) dropDownBackground).t(this.k);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(@Nullable AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.e.q = getOnItemSelectedListener();
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i) {
        super.setRawInputType(i);
        TextInputLayout b = b();
        if (b != null) {
            b.u();
        }
    }

    public void setSimpleItemSelectedColor(int i) {
        this.l = i;
        if (getAdapter() instanceof gyb) {
            ((gyb) getAdapter()).a();
        }
    }

    public void setSimpleItemSelectedRippleColor(@Nullable ColorStateList colorStateList) {
        this.m = colorStateList;
        if (getAdapter() instanceof gyb) {
            ((gyb) getAdapter()).a();
        }
    }

    public void setSimpleItems(@NonNull String[] strArr) {
        setAdapter(new gyb(this, getContext(), this.i, strArr));
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        if (c()) {
            this.e.show();
        } else {
            super.showDropDown();
        }
    }

    public void setSimpleItems(int i) {
        setSimpleItems(getResources().getStringArray(i));
    }
}
