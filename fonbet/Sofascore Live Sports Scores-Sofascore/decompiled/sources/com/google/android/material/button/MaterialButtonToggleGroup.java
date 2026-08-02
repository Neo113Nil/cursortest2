package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.timepicker.d;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import defpackage.bsk;
import defpackage.ca;
import defpackage.euk;
import defpackage.idi;
import defpackage.m6k;
import defpackage.oyn;
import defpackage.pjf;
import defpackage.q0;
import defpackage.ryb;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class MaterialButtonToggleGroup extends ryb {
    public static final /* synthetic */ int s = 0;
    public final LinkedHashSet m;
    public boolean n;
    public boolean o;
    public boolean p;
    public final int q;
    public HashSet r;

    public MaterialButtonToggleGroup(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(oyn.U(context, attributeSet, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup), attributeSet);
        this.m = new LinkedHashSet();
        this.n = false;
        this.r = new HashSet();
        TypedArray Y = m6k.Y(getContext(), attributeSet, pjf.x, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup, new int[0]);
        setSingleSelection(Y.getBoolean(7, false));
        this.q = Y.getResourceId(2, -1);
        this.p = Y.getBoolean(4, false);
        if (this.f == null) {
            this.f = idi.b(new q0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        }
        setEnabled(Y.getBoolean(0, true));
        Y.recycle();
        setImportantForAccessibility(1);
    }

    @NonNull
    private String getChildrenA11yClassName() {
        return (this.o ? RadioButton.class : ToggleButton.class).getName();
    }

    private int getVisibleButtonCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof MaterialButton) && getChildAt(i2).getVisibility() != 8) {
                i++;
            }
        }
        return i;
    }

    private void setupButtonChild(@NonNull MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setA11yClassName(getChildrenA11yClassName());
    }

    @Override // defpackage.ryb, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof MaterialButton) {
            super.addView(view, i, layoutParams);
            MaterialButton materialButton = (MaterialButton) view;
            setupButtonChild(materialButton);
            l(materialButton.getId(), materialButton.u);
            bsk.q(materialButton, new euk(this, 4));
        }
    }

    public int getCheckedButtonId() {
        if (!this.o || this.r.isEmpty()) {
            return -1;
        }
        return ((Integer) this.r.iterator().next()).intValue();
    }

    @NonNull
    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            int id = ((MaterialButton) getChildAt(i)).getId();
            if (this.r.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    public final void l(int i, boolean z) {
        if (i == -1) {
            return;
        }
        HashSet hashSet = new HashSet(this.r);
        if (z && !hashSet.contains(Integer.valueOf(i))) {
            if (this.o && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i));
        } else {
            if (z || !hashSet.contains(Integer.valueOf(i))) {
                return;
            }
            if (!this.p || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i));
            }
        }
        m(hashSet);
    }

    public final void m(Set set) {
        HashSet hashSet = this.r;
        this.r = new HashSet(set);
        for (int i = 0; i < getChildCount(); i++) {
            int id = ((MaterialButton) getChildAt(i)).getId();
            boolean contains = set.contains(Integer.valueOf(id));
            View findViewById = findViewById(id);
            if (findViewById instanceof MaterialButton) {
                this.n = true;
                ((MaterialButton) findViewById).setChecked(contains);
                this.n = false;
            }
            if (hashSet.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                set.contains(Integer.valueOf(id));
                Iterator it = this.m.iterator();
                while (it.hasNext()) {
                    ((d) it.next()).a();
                }
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.q;
        if (i != -1) {
            m(Collections.singleton(Integer.valueOf(i)));
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) ca.b(1, getVisibleButtonCount(), this.o ? 1 : 2, false).a);
    }

    public void setSelectionRequired(boolean z) {
        this.p = z;
    }

    public void setSingleSelection(boolean z) {
        if (this.o != z) {
            this.o = z;
            m(new HashSet());
        }
        String childrenA11yClassName = getChildrenA11yClassName();
        for (int i = 0; i < getChildCount(); i++) {
            ((MaterialButton) getChildAt(i)).setA11yClassName(childrenA11yClassName);
        }
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
