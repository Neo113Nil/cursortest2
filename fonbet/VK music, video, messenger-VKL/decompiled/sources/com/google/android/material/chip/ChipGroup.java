package com.google.android.material.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.R$attr;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.internal.FlowLayout;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import xsna.am;
import xsna.b0u0;
import xsna.cm10;
import xsna.fpo0;
import xsna.iut0;
import xsna.q1c;
import xsna.r1c;
import xsna.zm10;

/* loaded from: classes13.dex */
public class ChipGroup extends FlowLayout {
    public static final int l = R$style.Widget_MaterialComponents_ChipGroup;
    public int f;
    public int g;

    @Nullable
    public e h;
    public final r1c<Chip> i;
    public final int j;

    @NonNull
    public final f k;

    public final class a {
        public a() {
        }
    }

    public class b implements e {
        public b() {
        }
    }

    public static class c extends ViewGroup.MarginLayoutParams {
    }

    @Deprecated
    public interface d {
    }

    public interface e {
    }

    public class f implements ViewGroup.OnHierarchyChangeListener {
        public ViewGroup.OnHierarchyChangeListener b;

        public f() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewAdded(View view, View view2) {
            ChipGroup chipGroup = ChipGroup.this;
            if (view == chipGroup && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                    view2.setId(View.generateViewId());
                }
                r1c<Chip> r1cVar = chipGroup.i;
                Chip chip = (Chip) view2;
                r1cVar.a.put(Integer.valueOf(chip.getId()), chip);
                if (chip.isChecked()) {
                    r1cVar.a(chip);
                }
                chip.setInternalOnCheckedChangeListener(new q1c(r1cVar));
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.b;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewRemoved(View view, View view2) {
            ChipGroup chipGroup = ChipGroup.this;
            if (view == chipGroup && (view2 instanceof Chip)) {
                r1c<Chip> r1cVar = chipGroup.i;
                Chip chip = (Chip) view2;
                r1cVar.getClass();
                chip.setInternalOnCheckedChangeListener(null);
                r1cVar.a.remove(Integer.valueOf(chip.getId()));
                r1cVar.b.remove(Integer.valueOf(chip.getId()));
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.b;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ChipGroup(Context context, AttributeSet attributeSet) {
        super(zm10.a(context, attributeSet, r3, r4), attributeSet, r3);
        int i = R$attr.chipGroupStyle;
        int i2 = l;
        r1c<Chip> r1cVar = new r1c<>();
        this.i = r1cVar;
        f fVar = new f();
        this.k = fVar;
        TypedArray d2 = fpo0.d(getContext(), attributeSet, R$styleable.ChipGroup, i, i2, new int[0]);
        int dimensionPixelOffset = d2.getDimensionPixelOffset(R$styleable.ChipGroup_chipSpacing, 0);
        setChipSpacingHorizontal(d2.getDimensionPixelOffset(R$styleable.ChipGroup_chipSpacingHorizontal, dimensionPixelOffset));
        setChipSpacingVertical(d2.getDimensionPixelOffset(R$styleable.ChipGroup_chipSpacingVertical, dimensionPixelOffset));
        setSingleLine(d2.getBoolean(R$styleable.ChipGroup_singleLine, false));
        setSingleSelection(d2.getBoolean(R$styleable.ChipGroup_singleSelection, false));
        setSelectionRequired(d2.getBoolean(R$styleable.ChipGroup_selectionRequired, false));
        this.j = d2.getResourceId(R$styleable.ChipGroup_checkedChip, -1);
        d2.recycle();
        r1cVar.c = new a();
        super.setOnHierarchyChangeListener(fVar);
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        setImportantForAccessibility(1);
    }

    private int getVisibleChipCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof Chip) && getChildAt(i2).getVisibility() == 0) {
                i++;
            }
        }
        return i;
    }

    @Override // com.google.android.material.internal.FlowLayout
    public final boolean a() {
        return this.d;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof c);
    }

    @Override // android.view.ViewGroup
    @NonNull
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new c(-2, -2);
    }

    @Override // android.view.ViewGroup
    @NonNull
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    public int getCheckedChipId() {
        return this.i.c();
    }

    @NonNull
    public List<Integer> getCheckedChipIds() {
        return this.i.b(this);
    }

    public int getChipSpacingHorizontal() {
        return this.f;
    }

    public int getChipSpacingVertical() {
        return this.g;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.j;
        if (i != -1) {
            r1c<Chip> r1cVar = this.i;
            cm10<Chip> cm10Var = (cm10) r1cVar.a.get(Integer.valueOf(i));
            if (cm10Var != null && r1cVar.a(cm10Var)) {
                r1cVar.d();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) am.g.a(getRowCount(), this.d ? getVisibleChipCount() : -1, this.i.d ? 1 : 2, false).a);
    }

    public void setChipSpacing(int i) {
        setChipSpacingHorizontal(i);
        setChipSpacingVertical(i);
    }

    public void setChipSpacingHorizontal(int i) {
        if (this.f != i) {
            this.f = i;
            setItemSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingResource(int i) {
        setChipSpacing(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingVertical(int i) {
        if (this.g != i) {
            this.g = i;
            setLineSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(@Nullable Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    @Deprecated
    public void setOnCheckedChangeListener(@Nullable d dVar) {
        if (dVar == null) {
            setOnCheckedStateChangeListener(null);
        } else {
            setOnCheckedStateChangeListener(new b());
        }
    }

    public void setOnCheckedStateChangeListener(@Nullable e eVar) {
        this.h = eVar;
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.k.b = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z) {
        this.i.e = z;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Override // com.google.android.material.internal.FlowLayout
    public void setSingleLine(boolean z) {
        super.setSingleLine(z);
    }

    public void setSingleSelection(boolean z) {
        r1c<Chip> r1cVar = this.i;
        if (r1cVar.d != z) {
            r1cVar.d = z;
            boolean isEmpty = r1cVar.b.isEmpty();
            Iterator it = r1cVar.a.values().iterator();
            while (it.hasNext()) {
                r1cVar.e((cm10) it.next(), false);
            }
            if (isEmpty) {
                return;
            }
            r1cVar.d();
        }
    }

    public void setSingleLine(int i) {
        setSingleLine(getResources().getBoolean(i));
    }

    @Override // android.view.ViewGroup
    @NonNull
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new c(layoutParams);
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
