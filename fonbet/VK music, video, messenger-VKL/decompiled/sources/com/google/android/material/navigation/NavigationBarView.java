package com.google.android.material.navigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.R$dimen;
import com.google.android.material.R$styleable;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import xsna.b0u0;
import xsna.bdl;
import xsna.fpo0;
import xsna.iut0;
import xsna.lin0;
import xsna.qm10;
import xsna.qw50;
import xsna.rw50;
import xsna.tko;
import xsna.yyo0;
import xsna.zm10;

/* loaded from: classes13.dex */
public abstract class NavigationBarView extends FrameLayout {
    public static final /* synthetic */ int f = 0;

    @NonNull
    public final qw50 b;

    @NonNull
    public final rw50 c;

    @NonNull
    public final NavigationBarPresenter d;
    public lin0 e;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        @Nullable
        public Bundle d;

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            @NonNull
            public final SavedState createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            public final Object[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.Creator
            @Nullable
            public final Object createFromParcel(@NonNull Parcel parcel) {
                return new SavedState(parcel, null);
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(@NonNull Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.d);
        }

        public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.d = parcel.readBundle(classLoader == null ? getClass().getClassLoader() : classLoader);
        }
    }

    public interface b {
    }

    public interface c {
    }

    public NavigationBarView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(zm10.a(context, attributeSet, i, i2), attributeSet, i);
        NavigationBarPresenter navigationBarPresenter = new NavigationBarPresenter();
        navigationBarPresenter.c = false;
        this.d = navigationBarPresenter;
        Context context2 = getContext();
        yyo0 e = fpo0.e(context2, attributeSet, R$styleable.NavigationBarView, i, i2, R$styleable.NavigationBarView_itemTextAppearanceInactive, R$styleable.NavigationBarView_itemTextAppearanceActive);
        qw50 qw50Var = new qw50(context2, getClass(), getMaxItemCount());
        this.b = qw50Var;
        rw50 a2 = a(context2);
        this.c = a2;
        navigationBarPresenter.b = a2;
        navigationBarPresenter.d = 1;
        a2.setPresenter(navigationBarPresenter);
        qw50Var.b(navigationBarPresenter, qw50Var.a);
        getContext();
        navigationBarPresenter.b.F = qw50Var;
        int i3 = R$styleable.NavigationBarView_itemIconTint;
        TypedArray typedArray = e.b;
        if (typedArray.hasValue(i3)) {
            a2.setIconTintList(e.a(R$styleable.NavigationBarView_itemIconTint));
        } else {
            a2.setIconTintList(a2.c());
        }
        setItemIconSize(typedArray.getDimensionPixelSize(R$styleable.NavigationBarView_itemIconSize, getResources().getDimensionPixelSize(R$dimen.mtrl_navigation_bar_item_default_icon_size)));
        if (typedArray.hasValue(R$styleable.NavigationBarView_itemTextAppearanceInactive)) {
            setItemTextAppearanceInactive(typedArray.getResourceId(R$styleable.NavigationBarView_itemTextAppearanceInactive, 0));
        }
        if (typedArray.hasValue(R$styleable.NavigationBarView_itemTextAppearanceActive)) {
            setItemTextAppearanceActive(typedArray.getResourceId(R$styleable.NavigationBarView_itemTextAppearanceActive, 0));
        }
        setItemTextAppearanceActiveBoldEnabled(typedArray.getBoolean(R$styleable.NavigationBarView_itemTextAppearanceActiveBoldEnabled, true));
        if (typedArray.hasValue(R$styleable.NavigationBarView_itemTextColor)) {
            setItemTextColor(e.a(R$styleable.NavigationBarView_itemTextColor));
        }
        Drawable background = getBackground();
        ColorStateList d = tko.d(background);
        if (background == null || d != null) {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(com.google.android.material.shape.a.c(context2, attributeSet, i, i2).a());
            if (d != null) {
                materialShapeDrawable.setFillColor(d);
            }
            materialShapeDrawable.initializeElevationOverlay(context2);
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            setBackground(materialShapeDrawable);
        }
        if (typedArray.hasValue(R$styleable.NavigationBarView_itemPaddingTop)) {
            setItemPaddingTop(typedArray.getDimensionPixelSize(R$styleable.NavigationBarView_itemPaddingTop, 0));
        }
        if (typedArray.hasValue(R$styleable.NavigationBarView_itemPaddingBottom)) {
            setItemPaddingBottom(typedArray.getDimensionPixelSize(R$styleable.NavigationBarView_itemPaddingBottom, 0));
        }
        if (typedArray.hasValue(R$styleable.NavigationBarView_activeIndicatorLabelPadding)) {
            setActiveIndicatorLabelPadding(typedArray.getDimensionPixelSize(R$styleable.NavigationBarView_activeIndicatorLabelPadding, 0));
        }
        if (typedArray.hasValue(R$styleable.NavigationBarView_elevation)) {
            setElevation(typedArray.getDimensionPixelSize(R$styleable.NavigationBarView_elevation, 0));
        }
        getBackground().mutate().setTintList(qm10.b(context2, e, R$styleable.NavigationBarView_backgroundTint));
        setLabelVisibilityMode(typedArray.getInteger(R$styleable.NavigationBarView_labelVisibilityMode, -1));
        int resourceId = typedArray.getResourceId(R$styleable.NavigationBarView_itemBackground, 0);
        if (resourceId != 0) {
            a2.setItemBackgroundRes(resourceId);
        } else {
            setItemRippleColor(qm10.b(context2, e, R$styleable.NavigationBarView_itemRippleColor));
        }
        int resourceId2 = typedArray.getResourceId(R$styleable.NavigationBarView_itemActiveIndicatorStyle, 0);
        if (resourceId2 != 0) {
            setItemActiveIndicatorEnabled(true);
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(resourceId2, R$styleable.NavigationBarActiveIndicator);
            setItemActiveIndicatorWidth(obtainStyledAttributes.getDimensionPixelSize(R$styleable.NavigationBarActiveIndicator_android_width, 0));
            setItemActiveIndicatorHeight(obtainStyledAttributes.getDimensionPixelSize(R$styleable.NavigationBarActiveIndicator_android_height, 0));
            setItemActiveIndicatorMarginHorizontal(obtainStyledAttributes.getDimensionPixelOffset(R$styleable.NavigationBarActiveIndicator_marginHorizontal, 0));
            setItemActiveIndicatorColor(qm10.a(context2, obtainStyledAttributes, R$styleable.NavigationBarActiveIndicator_android_color));
            setItemActiveIndicatorShapeAppearance(com.google.android.material.shape.a.a(obtainStyledAttributes.getResourceId(R$styleable.NavigationBarActiveIndicator_shapeAppearance, 0), 0, context2).a());
            obtainStyledAttributes.recycle();
        }
        if (typedArray.hasValue(R$styleable.NavigationBarView_menu)) {
            int resourceId3 = typedArray.getResourceId(R$styleable.NavigationBarView_menu, 0);
            navigationBarPresenter.c = true;
            getMenuInflater().inflate(resourceId3, qw50Var);
            navigationBarPresenter.c = false;
            navigationBarPresenter.c(true);
        }
        e.f();
        addView(a2);
        qw50Var.e = new a();
    }

    private MenuInflater getMenuInflater() {
        if (this.e == null) {
            this.e = new lin0(getContext());
        }
        return this.e;
    }

    @NonNull
    public abstract rw50 a(@NonNull Context context);

    public int getActiveIndicatorLabelPadding() {
        return this.c.getActiveIndicatorLabelPadding();
    }

    @Nullable
    public ColorStateList getItemActiveIndicatorColor() {
        return this.c.getItemActiveIndicatorColor();
    }

    public int getItemActiveIndicatorHeight() {
        return this.c.getItemActiveIndicatorHeight();
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.c.getItemActiveIndicatorMarginHorizontal();
    }

    @Nullable
    public com.google.android.material.shape.a getItemActiveIndicatorShapeAppearance() {
        return this.c.getItemActiveIndicatorShapeAppearance();
    }

    public int getItemActiveIndicatorWidth() {
        return this.c.getItemActiveIndicatorWidth();
    }

    @Nullable
    public Drawable getItemBackground() {
        return this.c.getItemBackground();
    }

    @Deprecated
    public int getItemBackgroundResource() {
        return this.c.getItemBackgroundRes();
    }

    public int getItemIconSize() {
        return this.c.getItemIconSize();
    }

    @Nullable
    public ColorStateList getItemIconTintList() {
        return this.c.getIconTintList();
    }

    public int getItemPaddingBottom() {
        return this.c.getItemPaddingBottom();
    }

    public int getItemPaddingTop() {
        return this.c.getItemPaddingTop();
    }

    @Nullable
    public ColorStateList getItemRippleColor() {
        return this.c.getItemRippleColor();
    }

    public int getItemTextAppearanceActive() {
        return this.c.getItemTextAppearanceActive();
    }

    public int getItemTextAppearanceInactive() {
        return this.c.getItemTextAppearanceInactive();
    }

    @Nullable
    public ColorStateList getItemTextColor() {
        return this.c.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.c.getLabelVisibilityMode();
    }

    public abstract int getMaxItemCount();

    @NonNull
    public Menu getMenu() {
        return this.b;
    }

    @NonNull
    public k getMenuView() {
        return this.c;
    }

    @NonNull
    public NavigationBarPresenter getPresenter() {
        return this.d;
    }

    public int getSelectedItemId() {
        return this.c.getSelectedItemId();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        bdl.f(this);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(@Nullable Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.b);
        Bundle bundle = savedState.d;
        CopyOnWriteArrayList<WeakReference<j>> copyOnWriteArrayList = this.b.u;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray == null || copyOnWriteArrayList.isEmpty()) {
            return;
        }
        Iterator<WeakReference<j>> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar = next.get();
            if (jVar == null) {
                copyOnWriteArrayList.remove(next);
            } else {
                int id = jVar.getId();
                if (id > 0 && (parcelable2 = (Parcelable) sparseParcelableArray.get(id)) != null) {
                    jVar.j(parcelable2);
                }
            }
        }
    }

    @Override // android.view.View
    @NonNull
    public final Parcelable onSaveInstanceState() {
        Parcelable b2;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.d = bundle;
        CopyOnWriteArrayList<WeakReference<j>> copyOnWriteArrayList = this.b.u;
        if (copyOnWriteArrayList.isEmpty()) {
            return savedState;
        }
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        Iterator<WeakReference<j>> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar = next.get();
            if (jVar == null) {
                copyOnWriteArrayList.remove(next);
            } else {
                int id = jVar.getId();
                if (id > 0 && (b2 = jVar.b()) != null) {
                    sparseArray.put(id, b2);
                }
            }
        }
        bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
        return savedState;
    }

    public void setActiveIndicatorLabelPadding(int i) {
        this.c.setActiveIndicatorLabelPadding(i);
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        bdl.d(this, f2);
    }

    public void setItemActiveIndicatorColor(@Nullable ColorStateList colorStateList) {
        this.c.setItemActiveIndicatorColor(colorStateList);
    }

    public void setItemActiveIndicatorEnabled(boolean z) {
        this.c.setItemActiveIndicatorEnabled(z);
    }

    public void setItemActiveIndicatorHeight(int i) {
        this.c.setItemActiveIndicatorHeight(i);
    }

    public void setItemActiveIndicatorMarginHorizontal(int i) {
        this.c.setItemActiveIndicatorMarginHorizontal(i);
    }

    public void setItemActiveIndicatorShapeAppearance(@Nullable com.google.android.material.shape.a aVar) {
        this.c.setItemActiveIndicatorShapeAppearance(aVar);
    }

    public void setItemActiveIndicatorWidth(int i) {
        this.c.setItemActiveIndicatorWidth(i);
    }

    public void setItemBackground(@Nullable Drawable drawable) {
        this.c.setItemBackground(drawable);
    }

    public void setItemBackgroundResource(int i) {
        this.c.setItemBackgroundRes(i);
    }

    public void setItemIconSize(int i) {
        this.c.setItemIconSize(i);
    }

    public void setItemIconSizeRes(int i) {
        setItemIconSize(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconTintList(@Nullable ColorStateList colorStateList) {
        this.c.setIconTintList(colorStateList);
    }

    public void setItemPaddingBottom(int i) {
        this.c.setItemPaddingBottom(i);
    }

    public void setItemPaddingTop(int i) {
        this.c.setItemPaddingTop(i);
    }

    public void setItemRippleColor(@Nullable ColorStateList colorStateList) {
        this.c.setItemRippleColor(colorStateList);
    }

    public void setItemTextAppearanceActive(int i) {
        this.c.setItemTextAppearanceActive(i);
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z) {
        this.c.setItemTextAppearanceActiveBoldEnabled(z);
    }

    public void setItemTextAppearanceInactive(int i) {
        this.c.setItemTextAppearanceInactive(i);
    }

    public void setItemTextColor(@Nullable ColorStateList colorStateList) {
        this.c.setItemTextColor(colorStateList);
    }

    public void setLabelVisibilityMode(int i) {
        rw50 rw50Var = this.c;
        if (rw50Var.getLabelVisibilityMode() != i) {
            rw50Var.setLabelVisibilityMode(i);
            this.d.c(false);
        }
    }

    public void setSelectedItemId(int i) {
        qw50 qw50Var = this.b;
        MenuItem findItem = qw50Var.findItem(i);
        if (findItem == null || qw50Var.q(findItem, this.d, 0)) {
            return;
        }
        findItem.setChecked(true);
    }

    public class a implements f.a {
        public a() {
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final boolean b(f fVar, @NonNull MenuItem menuItem) {
            int i = NavigationBarView.f;
            NavigationBarView navigationBarView = NavigationBarView.this;
            navigationBarView.getClass();
            navigationBarView.getClass();
            return false;
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final void a(f fVar) {
        }
    }

    public void setOnItemReselectedListener(@Nullable b bVar) {
    }

    public void setOnItemSelectedListener(@Nullable c cVar) {
    }
}
