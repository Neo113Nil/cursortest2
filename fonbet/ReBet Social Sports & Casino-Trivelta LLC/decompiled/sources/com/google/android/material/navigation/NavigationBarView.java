package com.google.android.material.navigation;

import Aa.f;
import Aa.i;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.view.g;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.a0;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.shape.n;
import ia.m;
import ua.d;
import xa.l;

/* loaded from: classes3.dex */
public abstract class NavigationBarView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final f f35573a;

    /* renamed from: b, reason: collision with root package name */
    public final i f35574b;

    /* renamed from: c, reason: collision with root package name */
    public final NavigationBarPresenter f35575c;

    /* renamed from: d, reason: collision with root package name */
    public MenuInflater f35576d;

    /* renamed from: e, reason: collision with root package name */
    public c f35577e;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        public Bundle f35578c;

        public class a implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public final void b(Parcel parcel, ClassLoader classLoader) {
            this.f35578c = parcel.readBundle(classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeBundle(this.f35578c);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            b(parcel, classLoader == null ? getClass().getClassLoader() : classLoader);
        }
    }

    public class a implements e.a {
        public a() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(e eVar, MenuItem menuItem) {
            NavigationBarView.a(NavigationBarView.this);
            return (NavigationBarView.this.f35577e == null || NavigationBarView.this.f35577e.a(menuItem)) ? false : true;
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(e eVar) {
        }
    }

    public interface b {
    }

    public interface c {
        boolean a(MenuItem menuItem);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x024a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public NavigationBarView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(La.a.d(context, attributeSet, i10, i11), attributeSet, i10);
        NavigationBarPresenter navigationBarPresenter = new NavigationBarPresenter();
        this.f35575c = navigationBarPresenter;
        Context context2 = getContext();
        a0 j10 = l.j(context2, attributeSet, m.NavigationBarView, i10, i11, m.f48946k5, m.f48926i5);
        f fVar = new f(context2, getClass(), getMaxItemCount(), g());
        this.f35573a = fVar;
        i c10 = c(context2);
        this.f35574b = c10;
        c10.setMinimumHeight(getSuggestedMinimumHeight());
        c10.setCollapsedMaxItemCount(getCollapsedMaxItemCount());
        navigationBarPresenter.l(c10);
        navigationBarPresenter.k(1);
        c10.setPresenter(navigationBarPresenter);
        fVar.b(navigationBarPresenter);
        navigationBarPresenter.j(getContext(), fVar);
        if (j10.s(m.f48886e5)) {
            c10.setIconTintList(j10.c(m.f48886e5));
        } else {
            c10.setIconTintList(c10.e(R.attr.textColorSecondary));
        }
        setItemIconSize(j10.f(m.f48876d5, getResources().getDimensionPixelSize(ia.e.f48375w0)));
        if (j10.s(m.f48946k5)) {
            setItemTextAppearanceInactive(j10.n(m.f48946k5, 0));
        }
        if (j10.s(m.f48926i5)) {
            setItemTextAppearanceActive(j10.n(m.f48926i5, 0));
        }
        if (j10.s(m.f48818X4)) {
            setHorizontalItemTextAppearanceInactive(j10.n(m.f48818X4, 0));
        }
        if (j10.s(m.f48809W4)) {
            setHorizontalItemTextAppearanceActive(j10.n(m.f48809W4, 0));
        }
        setItemTextAppearanceActiveBoldEnabled(j10.a(m.f48936j5, true));
        if (j10.s(m.f48956l5)) {
            setItemTextColor(j10.c(m.f48956l5));
        }
        Drawable background = getBackground();
        ColorStateList f10 = d.f(background);
        if (background == null || f10 != null) {
            com.google.android.material.shape.i iVar = new com.google.android.material.shape.i(n.e(context2, attributeSet, i10, i11).m());
            if (f10 != null) {
                iVar.f0(f10);
            }
            iVar.T(context2);
            setBackground(iVar);
        }
        if (j10.s(m.f48906g5)) {
            setItemPaddingTop(j10.f(m.f48906g5, 0));
        }
        if (j10.s(m.f48896f5)) {
            setItemPaddingBottom(j10.f(m.f48896f5, 0));
        }
        if (j10.s(m.f48782T4)) {
            setActiveIndicatorLabelPadding(j10.f(m.f48782T4, 0));
        }
        if (j10.s(m.f48827Y4)) {
            setIconLabelHorizontalSpacing(j10.f(m.f48827Y4, 0));
        }
        if (j10.s(m.f48800V4)) {
            setElevation(j10.f(m.f48800V4, 0));
        }
        getBackground().mutate().setTintList(Ca.c.b(context2, j10, m.f48791U4));
        int i12 = -1;
        setLabelVisibilityMode(j10.l(m.f48986o5, -1));
        setItemIconGravity(j10.l(m.f48866c5, 0));
        setItemGravity(j10.l(m.f48856b5, 49));
        int n10 = j10.n(m.f48846a5, 0);
        if (n10 != 0) {
            c10.setItemBackgroundRes(n10);
        } else {
            setItemRippleColor(Ca.c.b(context2, j10, m.f48916h5));
        }
        setMeasureBottomPaddingFromLabelBaseline(j10.a(m.f48996p5, true));
        setLabelFontScalingEnabled(j10.a(m.f48966m5, false));
        setLabelMaxLines(j10.l(m.f48976n5, 1));
        int n11 = j10.n(m.f48836Z4, 0);
        if (n11 != 0) {
            setItemActiveIndicatorEnabled(true);
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(n11, m.NavigationBarActiveIndicator);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(m.f48673I4, 0);
            setItemActiveIndicatorWidth(dimensionPixelSize);
            setItemActiveIndicatorHeight(obtainStyledAttributes.getDimensionPixelSize(m.f48663H4, 0));
            int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(m.f48763R4, 0);
            setItemActiveIndicatorMarginHorizontal(dimensionPixelOffset);
            String string = obtainStyledAttributes.getString(m.f48753Q4);
            if (string != null) {
                if (!String.valueOf(-1).equals(string)) {
                    if (!String.valueOf(-2).equals(string)) {
                        i12 = obtainStyledAttributes.getDimensionPixelSize(m.f48753Q4, -2);
                    }
                }
                setItemActiveIndicatorExpandedWidth(i12);
                setItemActiveIndicatorExpandedHeight(obtainStyledAttributes.getDimensionPixelSize(m.f48733O4, dimensionPixelSize));
                setItemActiveIndicatorExpandedMarginHorizontal(obtainStyledAttributes.getDimensionPixelOffset(m.f48743P4, dimensionPixelOffset));
                int dimensionPixelSize2 = getResources().getDimensionPixelSize(ia.e.f48303H);
                int dimensionPixelOffset2 = obtainStyledAttributes.getDimensionPixelOffset(m.f48713M4, dimensionPixelSize2);
                int dimensionPixelOffset3 = obtainStyledAttributes.getDimensionPixelOffset(m.f48703L4, dimensionPixelSize2);
                h(getLayoutDirection() != 1 ? dimensionPixelOffset3 : dimensionPixelOffset2, obtainStyledAttributes.getDimensionPixelOffset(m.f48723N4, 0), getLayoutDirection() != 1 ? dimensionPixelOffset3 : dimensionPixelOffset2, obtainStyledAttributes.getDimensionPixelOffset(m.f48693K4, 0));
                setItemActiveIndicatorColor(Ca.c.a(context2, obtainStyledAttributes, m.f48683J4));
                setItemActiveIndicatorShapeAppearance(n.b(context2, obtainStyledAttributes.getResourceId(m.f48773S4, 0), 0).m());
                obtainStyledAttributes.recycle();
            }
            i12 = -2;
            setItemActiveIndicatorExpandedWidth(i12);
            setItemActiveIndicatorExpandedHeight(obtainStyledAttributes.getDimensionPixelSize(m.f48733O4, dimensionPixelSize));
            setItemActiveIndicatorExpandedMarginHorizontal(obtainStyledAttributes.getDimensionPixelOffset(m.f48743P4, dimensionPixelOffset));
            int dimensionPixelSize22 = getResources().getDimensionPixelSize(ia.e.f48303H);
            int dimensionPixelOffset22 = obtainStyledAttributes.getDimensionPixelOffset(m.f48713M4, dimensionPixelSize22);
            int dimensionPixelOffset32 = obtainStyledAttributes.getDimensionPixelOffset(m.f48703L4, dimensionPixelSize22);
            h(getLayoutDirection() != 1 ? dimensionPixelOffset32 : dimensionPixelOffset22, obtainStyledAttributes.getDimensionPixelOffset(m.f48723N4, 0), getLayoutDirection() != 1 ? dimensionPixelOffset32 : dimensionPixelOffset22, obtainStyledAttributes.getDimensionPixelOffset(m.f48693K4, 0));
            setItemActiveIndicatorColor(Ca.c.a(context2, obtainStyledAttributes, m.f48683J4));
            setItemActiveIndicatorShapeAppearance(n.b(context2, obtainStyledAttributes.getResourceId(m.f48773S4, 0), 0).m());
            obtainStyledAttributes.recycle();
        }
        if (j10.s(m.f49006q5)) {
            f(j10.n(m.f49006q5, 0));
        }
        j10.x();
        if (!i()) {
            addView(c10);
        }
        fVar.W(new a());
    }

    public static /* synthetic */ b a(NavigationBarView navigationBarView) {
        navigationBarView.getClass();
        return null;
    }

    private MenuInflater getMenuInflater() {
        if (this.f35576d == null) {
            this.f35576d = new g(getContext());
        }
        return this.f35576d;
    }

    private void setMeasureBottomPaddingFromLabelBaseline(boolean z10) {
        this.f35574b.setMeasurePaddingFromLabelBaseline(z10);
    }

    public abstract i c(Context context);

    public com.google.android.material.badge.a d(int i10) {
        return this.f35574b.j(i10);
    }

    public com.google.android.material.badge.a e(int i10) {
        return this.f35574b.k(i10);
    }

    public void f(int i10) {
        this.f35575c.m(true);
        getMenuInflater().inflate(i10, this.f35573a);
        this.f35575c.m(false);
        this.f35575c.g(true);
    }

    public boolean g() {
        return false;
    }

    public int getActiveIndicatorLabelPadding() {
        return this.f35574b.getActiveIndicatorLabelPadding();
    }

    public int getCollapsedMaxItemCount() {
        return getMaxItemCount();
    }

    public int getHorizontalItemTextAppearanceActive() {
        return this.f35574b.getHorizontalItemTextAppearanceActive();
    }

    public int getHorizontalItemTextAppearanceInactive() {
        return this.f35574b.getHorizontalItemTextAppearanceInactive();
    }

    public int getIconLabelHorizontalSpacing() {
        return this.f35574b.getIconLabelHorizontalSpacing();
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.f35574b.getItemActiveIndicatorColor();
    }

    public int getItemActiveIndicatorExpandedHeight() {
        return this.f35574b.getItemActiveIndicatorExpandedHeight();
    }

    public int getItemActiveIndicatorExpandedMarginHorizontal() {
        return this.f35574b.getItemActiveIndicatorExpandedMarginHorizontal();
    }

    public int getItemActiveIndicatorExpandedWidth() {
        return this.f35574b.getItemActiveIndicatorExpandedWidth();
    }

    public int getItemActiveIndicatorHeight() {
        return this.f35574b.getItemActiveIndicatorHeight();
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.f35574b.getItemActiveIndicatorMarginHorizontal();
    }

    public n getItemActiveIndicatorShapeAppearance() {
        return this.f35574b.getItemActiveIndicatorShapeAppearance();
    }

    public int getItemActiveIndicatorWidth() {
        return this.f35574b.getItemActiveIndicatorWidth();
    }

    public Drawable getItemBackground() {
        return this.f35574b.getItemBackground();
    }

    @Deprecated
    public int getItemBackgroundResource() {
        return this.f35574b.getItemBackgroundRes();
    }

    public int getItemGravity() {
        return this.f35574b.getItemGravity();
    }

    public int getItemIconGravity() {
        return this.f35574b.getItemIconGravity();
    }

    public int getItemIconSize() {
        return this.f35574b.getItemIconSize();
    }

    public ColorStateList getItemIconTintList() {
        return this.f35574b.getIconTintList();
    }

    public int getItemPaddingBottom() {
        return this.f35574b.getItemPaddingBottom();
    }

    public int getItemPaddingTop() {
        return this.f35574b.getItemPaddingTop();
    }

    public ColorStateList getItemRippleColor() {
        return this.f35574b.getItemRippleColor();
    }

    public int getItemTextAppearanceActive() {
        return this.f35574b.getItemTextAppearanceActive();
    }

    public int getItemTextAppearanceInactive() {
        return this.f35574b.getItemTextAppearanceInactive();
    }

    public ColorStateList getItemTextColor() {
        return this.f35574b.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.f35574b.getLabelVisibilityMode();
    }

    public abstract int getMaxItemCount();

    @NonNull
    public Menu getMenu() {
        return this.f35573a;
    }

    @NonNull
    public j getMenuView() {
        return this.f35574b;
    }

    @NonNull
    public ViewGroup getMenuViewGroup() {
        return this.f35574b;
    }

    @NonNull
    public NavigationBarPresenter getPresenter() {
        return this.f35575c;
    }

    public boolean getScaleLabelTextWithFont() {
        return this.f35574b.getScaleLabelTextWithFont();
    }

    public int getSelectedItemId() {
        return this.f35574b.getSelectedItemId();
    }

    public void h(int i10, int i11, int i12, int i13) {
        this.f35574b.r(i10, i11, i12, i13);
    }

    public boolean i() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.google.android.material.shape.j.e(this);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        this.f35573a.T(savedState.f35578c);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.f35578c = bundle;
        this.f35573a.V(bundle);
        return savedState;
    }

    public void setActiveIndicatorLabelPadding(int i10) {
        this.f35574b.setActiveIndicatorLabelPadding(i10);
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        com.google.android.material.shape.j.d(this, f10);
    }

    public void setHorizontalItemTextAppearanceActive(int i10) {
        this.f35574b.setHorizontalItemTextAppearanceActive(i10);
    }

    public void setHorizontalItemTextAppearanceInactive(int i10) {
        this.f35574b.setHorizontalItemTextAppearanceInactive(i10);
    }

    public void setIconLabelHorizontalSpacing(int i10) {
        this.f35574b.setIconLabelHorizontalSpacing(i10);
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.f35574b.setItemActiveIndicatorColor(colorStateList);
    }

    public void setItemActiveIndicatorEnabled(boolean z10) {
        this.f35574b.setItemActiveIndicatorEnabled(z10);
    }

    public void setItemActiveIndicatorExpandedHeight(int i10) {
        this.f35574b.setItemActiveIndicatorExpandedHeight(i10);
    }

    public void setItemActiveIndicatorExpandedMarginHorizontal(int i10) {
        this.f35574b.setItemActiveIndicatorExpandedMarginHorizontal(i10);
    }

    public void setItemActiveIndicatorExpandedWidth(int i10) {
        this.f35574b.setItemActiveIndicatorExpandedWidth(i10);
    }

    public void setItemActiveIndicatorHeight(int i10) {
        this.f35574b.setItemActiveIndicatorHeight(i10);
    }

    public void setItemActiveIndicatorMarginHorizontal(int i10) {
        this.f35574b.setItemActiveIndicatorMarginHorizontal(i10);
    }

    public void setItemActiveIndicatorShapeAppearance(n nVar) {
        this.f35574b.setItemActiveIndicatorShapeAppearance(nVar);
    }

    public void setItemActiveIndicatorWidth(int i10) {
        this.f35574b.setItemActiveIndicatorWidth(i10);
    }

    public void setItemBackground(Drawable drawable) {
        this.f35574b.setItemBackground(drawable);
    }

    public void setItemBackgroundResource(int i10) {
        this.f35574b.setItemBackgroundRes(i10);
    }

    public void setItemGravity(int i10) {
        if (this.f35574b.getItemGravity() != i10) {
            this.f35574b.setItemGravity(i10);
            this.f35575c.g(false);
        }
    }

    public void setItemIconGravity(int i10) {
        if (this.f35574b.getItemIconGravity() != i10) {
            this.f35574b.setItemIconGravity(i10);
            this.f35575c.g(false);
        }
    }

    public void setItemIconSize(int i10) {
        this.f35574b.setItemIconSize(i10);
    }

    public void setItemIconSizeRes(int i10) {
        setItemIconSize(getResources().getDimensionPixelSize(i10));
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f35574b.setIconTintList(colorStateList);
    }

    public void setItemPaddingBottom(int i10) {
        this.f35574b.setItemPaddingBottom(i10);
    }

    public void setItemPaddingTop(int i10) {
        this.f35574b.setItemPaddingTop(i10);
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f35574b.setItemRippleColor(colorStateList);
    }

    public void setItemTextAppearanceActive(int i10) {
        this.f35574b.setItemTextAppearanceActive(i10);
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z10) {
        this.f35574b.setItemTextAppearanceActiveBoldEnabled(z10);
    }

    public void setItemTextAppearanceInactive(int i10) {
        this.f35574b.setItemTextAppearanceInactive(i10);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f35574b.setItemTextColor(colorStateList);
    }

    public void setLabelFontScalingEnabled(boolean z10) {
        this.f35574b.setLabelFontScalingEnabled(z10);
    }

    public void setLabelMaxLines(int i10) {
        this.f35574b.setLabelMaxLines(i10);
    }

    public void setLabelVisibilityMode(int i10) {
        if (this.f35574b.getLabelVisibilityMode() != i10) {
            this.f35574b.setLabelVisibilityMode(i10);
            this.f35575c.g(false);
        }
    }

    public void setOnItemReselectedListener(b bVar) {
    }

    public void setOnItemSelectedListener(c cVar) {
        this.f35577e = cVar;
    }

    public void setSelectedItemId(int i10) {
        MenuItem findItem = this.f35573a.findItem(i10);
        if (findItem != null) {
            boolean P10 = this.f35573a.P(findItem, this.f35575c, 0);
            if (findItem.isCheckable()) {
                if (!P10 || findItem.isChecked()) {
                    this.f35574b.setCheckedItem(findItem);
                }
            }
        }
    }
}
