package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import androidx.annotation.NonNull;
import androidx.core.view.AbstractC2082d0;
import androidx.core.view.C2075a;
import com.google.android.material.shape.r;
import ia.c;
import ia.l;
import ia.m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import y0.z;

/* loaded from: classes3.dex */
public class MaterialButtonToggleGroup extends com.google.android.material.button.a {

    /* renamed from: q, reason: collision with root package name */
    public static final int f35054q = l.f48553E;

    /* renamed from: k, reason: collision with root package name */
    public final LinkedHashSet f35055k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f35056l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f35057m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f35058n;

    /* renamed from: o, reason: collision with root package name */
    public final int f35059o;

    /* renamed from: p, reason: collision with root package name */
    public Set f35060p;

    public class a extends C2075a {
        public a() {
        }

        @Override // androidx.core.view.C2075a
        public void onInitializeAccessibilityNodeInfo(View view, z zVar) {
            super.onInitializeAccessibilityNodeInfo(view, zVar);
            zVar.z0(z.g.b(0, 1, MaterialButtonToggleGroup.this.v(view), 1, false, ((MaterialButton) view).isChecked()));
        }
    }

    public interface b {
        void a(MaterialButtonToggleGroup materialButtonToggleGroup, int i10, boolean z10);
    }

    public MaterialButtonToggleGroup(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.f48203H);
    }

    @NonNull
    private String getChildrenA11yClassName() {
        return (this.f35057m ? RadioButton.class : ToggleButton.class).getName();
    }

    private int getVisibleButtonCount() {
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if ((getChildAt(i11) instanceof MaterialButton) && j(i11)) {
                i10++;
            }
        }
        return i10;
    }

    private void setupButtonChild(@NonNull MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setA11yClassName(getChildrenA11yClassName());
    }

    public final void A() {
        String childrenA11yClassName = getChildrenA11yClassName();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            f(i10).setA11yClassName(childrenA11yClassName);
        }
    }

    @Override // com.google.android.material.button.a, android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i10, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setupButtonChild(materialButton);
        s(materialButton.getId(), materialButton.isChecked());
        AbstractC2082d0.l0(materialButton, new a());
    }

    public int getCheckedButtonId() {
        if (!this.f35057m || this.f35060p.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f35060p.iterator().next()).intValue();
    }

    @NonNull
    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            int id2 = f(i10).getId();
            if (this.f35060p.contains(Integer.valueOf(id2))) {
                arrayList.add(Integer.valueOf(id2));
            }
        }
        return arrayList;
    }

    public final boolean j(int i10) {
        return getChildAt(i10).getVisibility() != 8;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        int i10 = this.f35059o;
        if (i10 != -1) {
            z(Collections.singleton(Integer.valueOf(i10)));
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        z.f1(accessibilityNodeInfo).y0(z.f.b(1, getVisibleButtonCount(), false, w() ? 1 : 2));
    }

    public void q(b bVar) {
        this.f35055k.add(bVar);
    }

    public void r(int i10) {
        s(i10, true);
    }

    public final void s(int i10, boolean z10) {
        if (i10 == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i10);
            return;
        }
        HashSet hashSet = new HashSet(this.f35060p);
        if (z10 && !hashSet.contains(Integer.valueOf(i10))) {
            if (this.f35057m && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i10));
        } else {
            if (z10 || !hashSet.contains(Integer.valueOf(i10))) {
                return;
            }
            if (!this.f35058n || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i10));
            }
        }
        z(hashSet);
    }

    public void setSelectionRequired(boolean z10) {
        this.f35058n = z10;
    }

    public void setSingleSelection(boolean z10) {
        if (this.f35057m != z10) {
            this.f35057m = z10;
            t();
        }
        A();
    }

    public void t() {
        z(new HashSet());
    }

    public final void u(int i10, boolean z10) {
        Iterator it = this.f35055k.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a(this, i10, z10);
        }
    }

    public final int v(View view) {
        if (!(view instanceof MaterialButton)) {
            return -1;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if (getChildAt(i11) == view) {
                return i10;
            }
            if ((getChildAt(i11) instanceof MaterialButton) && j(i11)) {
                i10++;
            }
        }
        return -1;
    }

    public boolean w() {
        return this.f35057m;
    }

    public void x(MaterialButton materialButton, boolean z10) {
        if (this.f35056l) {
            return;
        }
        s(materialButton.getId(), z10);
    }

    public final void y(int i10, boolean z10) {
        View findViewById = findViewById(i10);
        if (findViewById instanceof MaterialButton) {
            this.f35056l = true;
            ((MaterialButton) findViewById).setChecked(z10);
            this.f35056l = false;
        }
    }

    public final void z(Set set) {
        Set set2 = this.f35060p;
        this.f35060p = new HashSet(set);
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            int id2 = f(i10).getId();
            y(id2, set.contains(Integer.valueOf(id2)));
            if (set2.contains(Integer.valueOf(id2)) != set.contains(Integer.valueOf(id2))) {
                u(id2, set.contains(Integer.valueOf(id2)));
            }
        }
        invalidate();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet, int i10) {
        super(La.a.d(context, attributeSet, i10, r4), attributeSet, i10);
        int i11 = f35054q;
        this.f35055k = new LinkedHashSet();
        this.f35056l = false;
        this.f35060p = new HashSet();
        TypedArray i12 = xa.l.i(getContext(), attributeSet, m.MaterialButtonToggleGroup, i10, i11, new int[0]);
        setSingleSelection(i12.getBoolean(m.f48622D3, false));
        this.f35059o = i12.getResourceId(m.f48602B3, -1);
        this.f35058n = i12.getBoolean(m.f48612C3, false);
        if (this.f35067e == null) {
            this.f35067e = r.c(new com.google.android.material.shape.a(0.0f));
        }
        setEnabled(i12.getBoolean(m.f48592A3, true));
        i12.recycle();
        setImportantForAccessibility(1);
    }

    public void setSingleSelection(int i10) {
        setSingleSelection(getResources().getBoolean(i10));
    }
}
