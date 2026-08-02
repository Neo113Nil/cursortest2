package com.google.android.material.navigation;

import B90.C2613o;
import Y80.k;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.b0;
import androidx.core.view.Y;
import androidx.fragment.app.G;
import i7.C7017a;
import k7.C7597a;
import ru.ozon.app.android.R;
import s7.C9619n;
import w7.C10444a;
import y7.C10856g;
import y7.C10857h;

/* loaded from: classes9.dex */
public abstract class f extends FrameLayout {
    public static final int LABEL_VISIBILITY_AUTO = -1;
    public static final int LABEL_VISIBILITY_LABELED = 1;
    public static final int LABEL_VISIBILITY_SELECTED = 0;
    public static final int LABEL_VISIBILITY_UNLABELED = 2;
    private static final int MENU_PRESENTER_ID = 1;
    private ColorStateList itemRippleColor;

    @NonNull
    private final com.google.android.material.navigation.c menu;
    private MenuInflater menuInflater;

    @NonNull
    private final com.google.android.material.navigation.d menuView;

    @NonNull
    private final e presenter;
    private b reselectedListener;
    private c selectedListener;

    final class a implements g.a {
        a() {
        }

        @Override // androidx.appcompat.view.menu.g.a
        public final void a(g gVar) {
        }

        @Override // androidx.appcompat.view.menu.g.a
        public final boolean b(g gVar, @NonNull i iVar) {
            f fVar = f.this;
            if (fVar.reselectedListener == null || iVar.getItemId() != fVar.getSelectedItemId()) {
                if (fVar.selectedListener == null) {
                    return false;
                }
                k.c((k) ((C2613o) fVar.selectedListener).f3178b, iVar);
                return false;
            }
            Y80.i iVar2 = (Y80.i) fVar.reselectedListener;
            G g10 = iVar2.f34819c;
            k.a(iVar2.f34817a, iVar2.f34818b, g10, iVar2.f34820d, iVar);
            return true;
        }
    }

    public interface b {
    }

    public interface c {
    }

    static class d extends O2.a {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        Bundle f58507c;

        final class a implements Parcelable.ClassLoaderCreator<d> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            @NonNull
            public final d createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                return new d(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            public final Object[] newArray(int i11) {
                return new d[i11];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(@NonNull Parcel parcel) {
                return new d(parcel, null);
            }
        }

        public d(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // O2.a, android.os.Parcelable
        public final void writeToParcel(@NonNull Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeBundle(this.f58507c);
        }

        public d(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f58507c = parcel.readBundle(classLoader == null ? d.class.getClassLoader() : classLoader);
        }
    }

    public f(@NonNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(B7.a.a(context, attributeSet, i11, i12), attributeSet, i11);
        e eVar = new e();
        this.presenter = eVar;
        Context context2 = getContext();
        b0 f7 = C9619n.f(context2, attributeSet, C7017a.f65923G, i11, i12, 10, 9);
        com.google.android.material.navigation.c cVar = new com.google.android.material.navigation.c(context2, getClass(), getMaxItemCount());
        this.menu = cVar;
        com.google.android.material.navigation.d createNavigationBarMenuView = createNavigationBarMenuView(context2);
        this.menuView = createNavigationBarMenuView;
        eVar.h(createNavigationBarMenuView);
        eVar.a();
        createNavigationBarMenuView.V(eVar);
        cVar.b(eVar);
        eVar.g(getContext(), cVar);
        if (f7.s(5)) {
            createNavigationBarMenuView.E(f7.c(5));
        } else {
            createNavigationBarMenuView.E(createNavigationBarMenuView.e());
        }
        setItemIconSize(f7.f(4, getResources().getDimensionPixelSize(R.dimen.mtrl_navigation_bar_item_default_icon_size)));
        if (f7.s(10)) {
            setItemTextAppearanceInactive(f7.n(10, 0));
        }
        if (f7.s(9)) {
            setItemTextAppearanceActive(f7.n(9, 0));
        }
        if (f7.s(11)) {
            setItemTextColor(f7.c(11));
        }
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            C10856g createMaterialShapeDrawableBackground = createMaterialShapeDrawableBackground(context2);
            int i13 = Y.f42258g;
            setBackground(createMaterialShapeDrawableBackground);
        }
        if (f7.s(7)) {
            setItemPaddingTop(f7.f(7, 0));
        }
        if (f7.s(6)) {
            setItemPaddingBottom(f7.f(6, 0));
        }
        if (f7.s(1)) {
            setElevation(f7.f(1, 0));
        }
        androidx.core.graphics.drawable.a.j(getBackground().mutate(), v7.c.b(context2, f7, 0));
        setLabelVisibilityMode(f7.l(12, -1));
        int n11 = f7.n(3, 0);
        if (n11 != 0) {
            createNavigationBarMenuView.M(n11);
        } else {
            setItemRippleColor(v7.c.b(context2, f7, 8));
        }
        int n12 = f7.n(2, 0);
        if (n12 != 0) {
            setItemActiveIndicatorEnabled(true);
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(n12, C7017a.f65922F);
            setItemActiveIndicatorWidth(obtainStyledAttributes.getDimensionPixelSize(1, 0));
            setItemActiveIndicatorHeight(obtainStyledAttributes.getDimensionPixelSize(0, 0));
            setItemActiveIndicatorMarginHorizontal(obtainStyledAttributes.getDimensionPixelOffset(3, 0));
            setItemActiveIndicatorColor(v7.c.a(context2, obtainStyledAttributes, 2));
            setItemActiveIndicatorShapeAppearance(y7.k.a(obtainStyledAttributes.getResourceId(4, 0), 0, context2).a());
            obtainStyledAttributes.recycle();
        }
        if (f7.s(13)) {
            inflateMenu(f7.n(13, 0));
        }
        f7.x();
        addView(createNavigationBarMenuView);
        cVar.F(new a());
    }

    @NonNull
    private C10856g createMaterialShapeDrawableBackground(Context context) {
        C10856g c10856g = new C10856g();
        Drawable background = getBackground();
        if (background instanceof ColorDrawable) {
            c10856g.B(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
        }
        c10856g.v(context);
        return c10856g;
    }

    private MenuInflater getMenuInflater() {
        if (this.menuInflater == null) {
            this.menuInflater = new androidx.appcompat.view.g(getContext());
        }
        return this.menuInflater;
    }

    @NonNull
    protected abstract com.google.android.material.navigation.d createNavigationBarMenuView(@NonNull Context context);

    public C7597a getBadge(int i11) {
        return this.menuView.g(i11);
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.menuView.j();
    }

    public int getItemActiveIndicatorHeight() {
        return this.menuView.l();
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.menuView.m();
    }

    public y7.k getItemActiveIndicatorShapeAppearance() {
        return this.menuView.n();
    }

    public int getItemActiveIndicatorWidth() {
        return this.menuView.o();
    }

    public Drawable getItemBackground() {
        return this.menuView.p();
    }

    @Deprecated
    public int getItemBackgroundResource() {
        return this.menuView.q();
    }

    public int getItemIconSize() {
        return this.menuView.r();
    }

    public ColorStateList getItemIconTintList() {
        return this.menuView.i();
    }

    public int getItemPaddingBottom() {
        return this.menuView.s();
    }

    public int getItemPaddingTop() {
        return this.menuView.t();
    }

    public ColorStateList getItemRippleColor() {
        return this.itemRippleColor;
    }

    public int getItemTextAppearanceActive() {
        return this.menuView.u();
    }

    public int getItemTextAppearanceInactive() {
        return this.menuView.v();
    }

    public ColorStateList getItemTextColor() {
        return this.menuView.w();
    }

    public int getLabelVisibilityMode() {
        return this.menuView.x();
    }

    public abstract int getMaxItemCount();

    @NonNull
    public Menu getMenu() {
        return this.menu;
    }

    @NonNull
    public n getMenuView() {
        return this.menuView;
    }

    @NonNull
    public C7597a getOrCreateBadge(int i11) {
        return this.menuView.z(i11);
    }

    @NonNull
    public e getPresenter() {
        return this.presenter;
    }

    public int getSelectedItemId() {
        return this.menuView.A();
    }

    public void inflateMenu(int i11) {
        this.presenter.m(true);
        getMenuInflater().inflate(i11, this.menu);
        this.presenter.m(false);
        this.presenter.e(true);
    }

    public boolean isItemActiveIndicatorEnabled() {
        return this.menuView.k();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C10857h.d(this);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.a());
        this.menu.C(dVar.f58507c);
    }

    @Override // android.view.View
    @NonNull
    protected Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        dVar.f58507c = bundle;
        this.menu.E(bundle);
        return dVar;
    }

    public void removeBadge(int i11) {
        this.menuView.C(i11);
    }

    @Override // android.view.View
    public void setElevation(float f7) {
        super.setElevation(f7);
        C10857h.b(f7, this);
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.menuView.F(colorStateList);
    }

    public void setItemActiveIndicatorEnabled(boolean z11) {
        this.menuView.G(z11);
    }

    public void setItemActiveIndicatorHeight(int i11) {
        this.menuView.H(i11);
    }

    public void setItemActiveIndicatorMarginHorizontal(int i11) {
        this.menuView.I(i11);
    }

    public void setItemActiveIndicatorShapeAppearance(y7.k kVar) {
        this.menuView.J(kVar);
    }

    public void setItemActiveIndicatorWidth(int i11) {
        this.menuView.K(i11);
    }

    public void setItemBackground(Drawable drawable) {
        this.menuView.L(drawable);
        this.itemRippleColor = null;
    }

    public void setItemBackgroundResource(int i11) {
        this.menuView.M(i11);
        this.itemRippleColor = null;
    }

    public void setItemIconSize(int i11) {
        this.menuView.N(i11);
    }

    public void setItemIconSizeRes(int i11) {
        setItemIconSize(getResources().getDimensionPixelSize(i11));
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.menuView.E(colorStateList);
    }

    public void setItemOnTouchListener(int i11, View.OnTouchListener onTouchListener) {
        this.menuView.O(i11, onTouchListener);
    }

    public void setItemPaddingBottom(int i11) {
        this.menuView.P(i11);
    }

    public void setItemPaddingTop(int i11) {
        this.menuView.Q(i11);
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        if (this.itemRippleColor == colorStateList) {
            if (colorStateList != null || this.menuView.p() == null) {
                return;
            }
            this.menuView.L(null);
            return;
        }
        this.itemRippleColor = colorStateList;
        if (colorStateList == null) {
            this.menuView.L(null);
        } else {
            this.menuView.L(new RippleDrawable(C10444a.a(colorStateList), null, null));
        }
    }

    public void setItemTextAppearanceActive(int i11) {
        this.menuView.R(i11);
    }

    public void setItemTextAppearanceInactive(int i11) {
        this.menuView.S(i11);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.menuView.T(colorStateList);
    }

    public void setLabelVisibilityMode(int i11) {
        if (this.menuView.x() != i11) {
            this.menuView.U(i11);
            this.presenter.e(false);
        }
    }

    public void setOnItemReselectedListener(b bVar) {
        this.reselectedListener = bVar;
    }

    public void setOnItemSelectedListener(c cVar) {
        this.selectedListener = cVar;
    }

    public void setSelectedItemId(int i11) {
        MenuItem findItem = this.menu.findItem(i11);
        if (findItem == null || this.menu.z(findItem, this.presenter, 0)) {
            return;
        }
        findItem.setChecked(true);
    }
}
