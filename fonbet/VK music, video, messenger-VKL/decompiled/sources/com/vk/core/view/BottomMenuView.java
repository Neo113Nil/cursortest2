package com.vk.core.view;

import android.R;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.vk.core.view.components.picture.VkImage;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.List;
import xsna.awt0;
import xsna.c58;
import xsna.dhr0;
import xsna.hfr;
import xsna.i58;
import xsna.iah0;
import xsna.izs;
import xsna.rl3;
import xsna.rli0;
import xsna.too0;
import xsna.u4q0;
import xsna.zik0;

/* compiled from: BottomMenuView.kt */
@SuppressLint({"RestrictedApi"})
/* loaded from: classes17.dex */
public final class BottomMenuView extends FrameLayout implements too0, CoordinatorLayout.b {
    public static final /* synthetic */ int k = 0;
    public int b;
    public int c;
    public int d;
    public List<i58> e;
    public int f;
    public int g;
    public Integer h;
    public ColorStateList i;
    public boolean j;

    /* compiled from: BottomMenuView.kt */
    public final class Behavior extends HideBottomViewOnScrollBehavior<BottomMenuView> {
        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean n(CoordinatorLayout coordinatorLayout, View view, int i) {
            BottomMenuView bottomMenuView = (BottomMenuView) view;
            new WeakReference(bottomMenuView);
            int i2 = BottomMenuView.k;
            ViewParent parent = bottomMenuView.getParent();
            CoordinatorLayout coordinatorLayout2 = parent instanceof CoordinatorLayout ? (CoordinatorLayout) parent : null;
            if (coordinatorLayout2 == null) {
                throw null;
            }
            for (View view2 : awt0.d(coordinatorLayout2)) {
                if (view2 instanceof FloatingActionButton) {
                    throw null;
                }
                if (view2 instanceof ExtendedFloatingActionButton) {
                    throw null;
                }
            }
            throw null;
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final /* bridge */ /* synthetic */ boolean z(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            return false;
        }
    }

    /* compiled from: BottomMenuView.kt */
    public static final class SavedState extends AbsSavedState {
        public static final a CREATOR = new a();
        public Integer b;

        /* compiled from: BottomMenuView.kt */
        public static final class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            Integer num = this.b;
            parcel.writeInt(num != null ? num.intValue() : 0);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            int readInt = parcel.readInt();
            this.b = readInt != 0 ? Integer.valueOf(readInt) : null;
        }

        @TargetApi(24)
        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel);
            int readInt = parcel.readInt();
            this.b = readInt != 0 ? Integer.valueOf(readInt) : null;
        }
    }

    /* compiled from: BottomMenuView.kt */
    public static final class a {
    }

    /* compiled from: BottomMenuView.kt */
    public interface b {
    }

    /* compiled from: BottomMenuView.kt */
    public static class c {
    }

    /* compiled from: _Sequences.kt */
    public static final class d implements izs<Object, Boolean> {
        public static final d b = new d();

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof com.vk.core.view.a);
        }
    }

    public static void a(BottomMenuView bottomMenuView, Integer num, List list, int i) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            list = null;
        }
        int a2 = iah0.a(28);
        if (num == null || !num.equals(Integer.valueOf(a2)) || list == null || !list.equals(bottomMenuView.e)) {
            new ArrayDeque(bottomMenuView.e.size());
            throw null;
        }
    }

    public static void b(Integer num) {
        hfr.a aVar = new hfr.a(rli0.j(rl3.D(awt0.d(null)), d.b));
        if (aVar.hasNext()) {
            com.vk.core.view.a aVar2 = (com.vk.core.view.a) aVar.next();
            boolean z = num != null && aVar2.getId() == num.intValue();
            aVar2.getTitleView().setSelected(z);
            aVar2.getIconView().setSelected(z);
            aVar2.getId();
            throw null;
        }
    }

    private final Behavior get_behavior() {
        throw null;
    }

    private final void setDynamicAttributes(AttributeSet attributeSet) {
        int A = dhr0.A("defaultTintColor", attributeSet);
        dhr0.a.getClass();
        if (dhr0.J(A)) {
            setDefaultTintAttr(A);
        }
        int A2 = dhr0.A("selectedTintColor", attributeSet);
        if (dhr0.J(A2)) {
            setSelectedTintAttr(A2);
        }
    }

    @Override // xsna.too0
    public final void Ng() {
        int i = this.f;
        if (i != 0) {
            setDefaultTintColor(dhr0.t.c(i));
        }
        int i2 = this.g;
        if (i2 != 0) {
            setSelectedTintColor(dhr0.t.c(i2));
        }
    }

    @Override // android.view.View
    public final VkImage getBackground() {
        return null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c<?> getBehavior() {
        return get_behavior();
    }

    public final c58 getBottomMenuViewPreloader() {
        return null;
    }

    public final ColorStateList getColorStateList() {
        return this.i;
    }

    public final a getConfig() {
        return null;
    }

    public final LinearLayout getContent() {
        return null;
    }

    public final int getDefaultTintAttr() {
        return this.f;
    }

    public final int getDefaultTintColor() {
        return this.b;
    }

    public final int getIconSize() {
        return this.d;
    }

    public final List<i58> getItems() {
        return this.e;
    }

    public final c getItemsFactory() {
        return null;
    }

    public final b getListener() {
        return null;
    }

    public final i58 getSelectedItem() {
        Object obj;
        Iterator<T> it = this.e.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            ((i58) obj).getClass();
            Integer num = this.h;
            if (num != null && num.intValue() == 0) {
                break;
            }
        }
        return (i58) obj;
    }

    public final int getSelectedTintAttr() {
        return this.g;
    }

    public final int getSelectedTintColor() {
        return this.c;
    }

    public final boolean getShouldDrawBackground() {
        return this.j;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        Integer num = savedState.b;
        this.h = num;
        b(num);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.b = this.h;
        return savedState;
    }

    public final void setDefaultTintAttr(int i) {
        setDefaultTintColor(dhr0.t.c(i));
        this.f = i;
    }

    public final void setDefaultTintColor(int i) {
        this.b = i;
        this.i = new ColorStateList(new int[][]{new int[]{R.attr.state_selected}, new int[0]}, new int[]{this.c, this.b});
        Integer num = this.h;
        this.h = num;
        b(num);
    }

    public final void setDot(int i) {
        u4q0 u4q0Var = zik0.a;
        throw null;
    }

    public final void setIconSize(int i) {
        int i2 = this.d;
        this.d = i;
        a(this, Integer.valueOf(i2), null, 2);
    }

    public final void setItems(List<i58> list) {
        List<i58> list2 = this.e;
        this.e = list;
        a(this, null, list2, 1);
    }

    public final void setSelectedItemId(int i) {
        Integer valueOf = Integer.valueOf(i);
        this.h = valueOf;
        b(valueOf);
    }

    public void setSelectedItemIdAndNotify(int i) {
        b(Integer.valueOf(i));
        Integer num = this.h;
        if (num != null && i == num.intValue()) {
            throw null;
        }
        this.h = Integer.valueOf(i);
        throw null;
    }

    public final void setSelectedTintAttr(int i) {
        setSelectedTintColor(dhr0.t.c(i));
        this.g = i;
    }

    public final void setSelectedTintColor(int i) {
        this.c = i;
        this.i = new ColorStateList(new int[][]{new int[]{R.attr.state_selected}, new int[0]}, new int[]{this.c, this.b});
        Integer num = this.h;
        this.h = num;
        b(num);
    }

    public final void setShouldDrawBackground(boolean z) {
        this.j = z;
        throw null;
    }

    public final void setBottomMenuViewPreloader(c58 c58Var) {
    }

    public final void setConfig(a aVar) {
    }

    public final void setItemsFactory(c cVar) {
    }

    public final void setListener(b bVar) {
    }
}
