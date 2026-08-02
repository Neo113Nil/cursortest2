package com.google.android.material.textfield;

import Ca.c;
import android.R;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.C2048c;
import androidx.appcompat.widget.M;
import com.google.android.material.shape.i;
import ia.m;
import java.util.List;
import l.AbstractC5335a;
import sa.AbstractC6344a;
import xa.e;
import xa.l;

/* loaded from: classes3.dex */
public class MaterialAutoCompleteTextView extends C2048c {

    /* renamed from: d, reason: collision with root package name */
    public final M f36226d;

    /* renamed from: e, reason: collision with root package name */
    public final AccessibilityManager f36227e;

    /* renamed from: f, reason: collision with root package name */
    public final Rect f36228f;

    /* renamed from: g, reason: collision with root package name */
    public final int f36229g;

    /* renamed from: h, reason: collision with root package name */
    public final float f36230h;

    /* renamed from: i, reason: collision with root package name */
    public ColorStateList f36231i;

    /* renamed from: j, reason: collision with root package name */
    public int f36232j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f36233k;

    public class a implements AdapterView.OnItemClickListener {
        public a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
            MaterialAutoCompleteTextView materialAutoCompleteTextView = MaterialAutoCompleteTextView.this;
            Object t10 = i10 < 0 ? materialAutoCompleteTextView.f36226d.t() : materialAutoCompleteTextView.getAdapter().getItem(i10);
            MaterialAutoCompleteTextView materialAutoCompleteTextView2 = MaterialAutoCompleteTextView.this;
            materialAutoCompleteTextView2.setText(materialAutoCompleteTextView2.convertSelectionToString(t10), false);
            AdapterView.OnItemClickListener onItemClickListener = MaterialAutoCompleteTextView.this.getOnItemClickListener();
            if (onItemClickListener != null) {
                if (view == null || i10 < 0) {
                    view = MaterialAutoCompleteTextView.this.f36226d.w();
                    i10 = MaterialAutoCompleteTextView.this.f36226d.v();
                    j10 = MaterialAutoCompleteTextView.this.f36226d.u();
                }
                onItemClickListener.onItemClick(MaterialAutoCompleteTextView.this.f36226d.n(), view, i10, j10);
            }
            MaterialAutoCompleteTextView.this.f36226d.dismiss();
        }
    }

    public class b extends ArrayAdapter {

        /* renamed from: a, reason: collision with root package name */
        public ColorStateList f36235a;

        /* renamed from: b, reason: collision with root package name */
        public ColorStateList f36236b;

        public b(Context context, int i10, String[] strArr) {
            super(context, i10, strArr);
            f();
        }

        public final ColorStateList a() {
            if (!c() || !d()) {
                return null;
            }
            int[] iArr = {R.attr.state_hovered, -16842919};
            int[] iArr2 = {R.attr.state_selected, -16842919};
            int colorForState = MaterialAutoCompleteTextView.this.f36233k.getColorForState(iArr2, 0);
            int colorForState2 = MaterialAutoCompleteTextView.this.f36233k.getColorForState(iArr, 0);
            return new ColorStateList(new int[][]{iArr2, iArr, new int[0]}, new int[]{AbstractC6344a.i(MaterialAutoCompleteTextView.this.f36232j, colorForState), AbstractC6344a.i(MaterialAutoCompleteTextView.this.f36232j, colorForState2), MaterialAutoCompleteTextView.this.f36232j});
        }

        public final Drawable b() {
            if (!c()) {
                return null;
            }
            ColorDrawable colorDrawable = new ColorDrawable(MaterialAutoCompleteTextView.this.f36232j);
            if (this.f36236b == null) {
                return colorDrawable;
            }
            colorDrawable.setTintList(this.f36235a);
            return new RippleDrawable(this.f36236b, colorDrawable, null);
        }

        public final boolean c() {
            return MaterialAutoCompleteTextView.this.f36232j != 0;
        }

        public final boolean d() {
            return MaterialAutoCompleteTextView.this.f36233k != null;
        }

        public final ColorStateList e() {
            if (!d()) {
                return null;
            }
            int[] iArr = {R.attr.state_pressed};
            return new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{MaterialAutoCompleteTextView.this.f36233k.getColorForState(iArr, 0), 0});
        }

        public void f() {
            this.f36236b = e();
            this.f36235a = a();
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            View view2 = super.getView(i10, view, viewGroup);
            if (view2 instanceof TextView) {
                TextView textView = (TextView) view2;
                textView.setBackground(MaterialAutoCompleteTextView.this.getText().toString().contentEquals(textView.getText()) ? b() : null);
            }
            return view2;
        }
    }

    public MaterialAutoCompleteTextView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC5335a.f54998m);
    }

    @Override // android.widget.AutoCompleteTextView
    public void dismissDropDown() {
        if (g()) {
            this.f36226d.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    public final TextInputLayout f() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public final boolean g() {
        return i() || h();
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.f36231i;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout f10 = f();
        return (f10 == null || !f10.T()) ? super.getHint() : f10.getHint();
    }

    public float getPopupElevation() {
        return this.f36230h;
    }

    public int getSimpleItemSelectedColor() {
        return this.f36232j;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.f36233k;
    }

    public final boolean h() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.f36227e;
        if (accessibilityManager != null && accessibilityManager.isEnabled() && (enabledAccessibilityServiceList = this.f36227e.getEnabledAccessibilityServiceList(16)) != null) {
            for (AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
                if (accessibilityServiceInfo.getSettingsActivityName() != null && accessibilityServiceInfo.getSettingsActivityName().contains("SwitchAccess")) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean i() {
        AccessibilityManager accessibilityManager = this.f36227e;
        return accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled();
    }

    public final int j() {
        ListAdapter adapter = getAdapter();
        TextInputLayout f10 = f();
        int i10 = 0;
        if (adapter == null || f10 == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int min = Math.min(adapter.getCount(), Math.max(0, this.f36226d.v()) + 15);
        View view = null;
        int i11 = 0;
        for (int max = Math.max(0, min - 15); max < min; max++) {
            int itemViewType = adapter.getItemViewType(max);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            view = adapter.getView(max, view, f10);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i11 = Math.max(i11, view.getMeasuredWidth());
        }
        Drawable f11 = this.f36226d.f();
        if (f11 != null) {
            f11.getPadding(this.f36228f);
            Rect rect = this.f36228f;
            i11 += rect.left + rect.right;
        }
        return i11 + f10.getEndIconView().getMeasuredWidth();
    }

    public final void k() {
        TextInputLayout f10 = f();
        if (f10 != null) {
            f10.s0();
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout f10 = f();
        if (f10 != null && f10.T() && super.getHint() == null && e.d()) {
            setHint("");
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f36226d.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), j()), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public void onWindowFocusChanged(boolean z10) {
        if (g()) {
            return;
        }
        super.onWindowFocusChanged(z10);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t10) {
        super.setAdapter(t10);
        this.f36226d.l(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        M m10 = this.f36226d;
        if (m10 != null) {
            m10.a(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i10) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i10));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.f36231i = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof i) {
            ((i) dropDownBackground).f0(this.f36231i);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f36226d.L(getOnItemSelectedListener());
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i10) {
        super.setRawInputType(i10);
        k();
    }

    public void setSimpleItemSelectedColor(int i10) {
        this.f36232j = i10;
        if (getAdapter() instanceof b) {
            ((b) getAdapter()).f();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.f36233k = colorStateList;
        if (getAdapter() instanceof b) {
            ((b) getAdapter()).f();
        }
    }

    public void setSimpleItems(int i10) {
        setSimpleItems(getResources().getStringArray(i10));
    }

    @Override // android.widget.AutoCompleteTextView
    public void showDropDown() {
        if (g()) {
            this.f36226d.show();
        } else {
            super.showDropDown();
        }
    }

    public MaterialAutoCompleteTextView(Context context, AttributeSet attributeSet, int i10) {
        super(La.a.d(context, attributeSet, i10, 0), attributeSet, i10);
        this.f36228f = new Rect();
        Context context2 = getContext();
        TypedArray i11 = l.i(context2, attributeSet, m.MaterialAutoCompleteTextView, i10, l.i.f55165i, new int[0]);
        if (i11.hasValue(m.f48751Q2) && i11.getInt(m.f48751Q2, 0) == 0) {
            setKeyListener(null);
        }
        this.f36229g = i11.getResourceId(m.f48780T2, ia.i.f48486s);
        this.f36230h = i11.getDimensionPixelOffset(m.f48761R2, ia.e.f48367s0);
        if (i11.hasValue(m.f48771S2)) {
            this.f36231i = ColorStateList.valueOf(i11.getColor(m.f48771S2, 0));
        }
        this.f36232j = i11.getColor(m.f48789U2, 0);
        this.f36233k = c.a(context2, i11, m.f48798V2);
        this.f36227e = (AccessibilityManager) context2.getSystemService("accessibility");
        M m10 = new M(context2);
        this.f36226d = m10;
        m10.I(true);
        m10.B(this);
        m10.H(2);
        m10.l(getAdapter());
        m10.K(new a());
        if (i11.hasValue(m.f48807W2)) {
            setSimpleItems(i11.getResourceId(m.f48807W2, 0));
        }
        i11.recycle();
    }

    public void setSimpleItems(@NonNull String[] strArr) {
        setAdapter(new b(getContext(), this.f36229g, strArr));
    }
}
