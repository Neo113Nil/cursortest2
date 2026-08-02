package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.ArrayAdapter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.C5059d;
import androidx.appcompat.widget.M;
import i7.C7017a;
import java.util.Locale;
import ru.ozon.app.android.R;
import s7.C9619n;

/* loaded from: classes9.dex */
public class MaterialAutoCompleteTextView extends C5059d {

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    private final M f58607e;

    /* renamed from: f, reason: collision with root package name */
    private final AccessibilityManager f58608f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    private final Rect f58609g;

    public MaterialAutoCompleteTextView(@NonNull Context context, AttributeSet attributeSet) {
        super(B7.a.a(context, attributeSet, R.attr.autoCompleteTextViewStyle, 0), attributeSet, 0);
        this.f58609g = new Rect();
        Context context2 = getContext();
        TypedArray e11 = C9619n.e(context2, attributeSet, C7017a.f65953s, R.attr.autoCompleteTextViewStyle, R.style.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        if (e11.hasValue(0) && e11.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        int resourceId = e11.getResourceId(1, R.layout.mtrl_auto_complete_simple_item);
        this.f58608f = (AccessibilityManager) context2.getSystemService("accessibility");
        M m11 = new M(context2, null, R.attr.listPopupWindowStyle);
        this.f58607e = m11;
        m11.C();
        m11.w(this);
        m11.B();
        m11.n(getAdapter());
        m11.E(new p(this));
        if (e11.hasValue(2)) {
            setAdapter(new ArrayAdapter(getContext(), resourceId, getResources().getStringArray(e11.getResourceId(2, 0))));
        }
        e11.recycle();
    }

    static void b(MaterialAutoCompleteTextView materialAutoCompleteTextView, Object obj) {
        materialAutoCompleteTextView.setText(materialAutoCompleteTextView.convertSelectionToString(obj), false);
    }

    private TextInputLayout c() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    @Override // android.widget.TextView
    public final CharSequence getHint() {
        TextInputLayout c11 = c();
        return (c11 == null || !c11.F()) ? super.getHint() : c11.w();
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout c11 = c();
        if (c11 != null && c11.F() && super.getHint() == null && Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu")) {
            setHint("");
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        if (View.MeasureSpec.getMode(i11) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout c11 = c();
            int i13 = 0;
            if (adapter != null && c11 != null) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                M m11 = this.f58607e;
                int min = Math.min(adapter.getCount(), Math.max(0, m11.s()) + 15);
                View view = null;
                int i14 = 0;
                for (int max = Math.max(0, min - 15); max < min; max++) {
                    int itemViewType = adapter.getItemViewType(max);
                    if (itemViewType != i13) {
                        view = null;
                        i13 = itemViewType;
                    }
                    view = adapter.getView(max, view, c11);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i14 = Math.max(i14, view.getMeasuredWidth());
                }
                Drawable b11 = m11.b();
                if (b11 != null) {
                    Rect rect = this.f58609g;
                    b11.getPadding(rect);
                    i14 += rect.left + rect.right;
                }
                i13 = c11.u().getMeasuredWidth() + i14;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, i13), View.MeasureSpec.getSize(i11)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public final <T extends ListAdapter & Filterable> void setAdapter(T t2) {
        super.setAdapter(t2);
        this.f58607e.n(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        AccessibilityManager accessibilityManager = this.f58608f;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.showDropDown();
        } else {
            this.f58607e.show();
        }
    }
}
