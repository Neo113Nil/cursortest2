package ru.ozon.app.android.cart.feature.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.cart.feature.R$id;
import ru.ozon.app.android.cart.ui.quantityInput.QuantityInput;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.buttonview.ProductFavoriteMoleculeButtonView;

/* loaded from: classes11.dex */
public final class WidgetCartSplitV2ItemBinding implements a {

    @NonNull
    public final ViewStub accessoriesViewStub;

    @NonNull
    public final Barrier bottomBarrier;

    @NonNull
    public final FrameLayout checkboxContainerFL;

    @NonNull
    public final View checkboxV;

    @NonNull
    public final AppCompatImageView decreaseQuantityBtn;

    @NonNull
    public final RecyclerView dynamicElementsRv;

    @NonNull
    public final ProductFavoriteMoleculeButtonView favBtn;

    @NonNull
    public final AppCompatImageView increaseQuantityBtn;

    @NonNull
    public final ItemCommonProductBinding productInclude;

    @NonNull
    public final QuantityInput quantityEt;

    @NonNull
    public final Group quantityGroup;

    @NonNull
    public final AppCompatImageView removeButton;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final ConstraintLayout splitV2ItemRootCl;

    private WidgetCartSplitV2ItemBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ViewStub viewStub, @NonNull Barrier barrier, @NonNull FrameLayout frameLayout, @NonNull View view, @NonNull AppCompatImageView appCompatImageView, @NonNull RecyclerView recyclerView, @NonNull ProductFavoriteMoleculeButtonView productFavoriteMoleculeButtonView, @NonNull AppCompatImageView appCompatImageView2, @NonNull ItemCommonProductBinding itemCommonProductBinding, @NonNull QuantityInput quantityInput, @NonNull Group group, @NonNull AppCompatImageView appCompatImageView3, @NonNull ConstraintLayout constraintLayout2) {
        this.rootView = constraintLayout;
        this.accessoriesViewStub = viewStub;
        this.bottomBarrier = barrier;
        this.checkboxContainerFL = frameLayout;
        this.checkboxV = view;
        this.decreaseQuantityBtn = appCompatImageView;
        this.dynamicElementsRv = recyclerView;
        this.favBtn = productFavoriteMoleculeButtonView;
        this.increaseQuantityBtn = appCompatImageView2;
        this.productInclude = itemCommonProductBinding;
        this.quantityEt = quantityInput;
        this.quantityGroup = group;
        this.removeButton = appCompatImageView3;
        this.splitV2ItemRootCl = constraintLayout2;
    }

    @NonNull
    public static WidgetCartSplitV2ItemBinding bind(@NonNull View view) {
        View d11;
        View d12;
        int i11 = R$id.accessoriesViewStub;
        ViewStub viewStub = (ViewStub) C2548q.d(i11, view);
        if (viewStub != null) {
            i11 = R$id.bottomBarrier;
            Barrier barrier = (Barrier) C2548q.d(i11, view);
            if (barrier != null) {
                i11 = R$id.checkboxContainerFL;
                FrameLayout frameLayout = (FrameLayout) C2548q.d(i11, view);
                if (frameLayout != null && (d11 = C2548q.d((i11 = R$id.checkboxV), view)) != null) {
                    i11 = R$id.decreaseQuantityBtn;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(i11, view);
                    if (appCompatImageView != null) {
                        i11 = R$id.dynamicElementsRv;
                        RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
                        if (recyclerView != null) {
                            i11 = R$id.favBtn;
                            ProductFavoriteMoleculeButtonView productFavoriteMoleculeButtonView = (ProductFavoriteMoleculeButtonView) C2548q.d(i11, view);
                            if (productFavoriteMoleculeButtonView != null) {
                                i11 = R$id.increaseQuantityBtn;
                                AppCompatImageView appCompatImageView2 = (AppCompatImageView) C2548q.d(i11, view);
                                if (appCompatImageView2 != null && (d12 = C2548q.d((i11 = R$id.productInclude), view)) != null) {
                                    ItemCommonProductBinding bind = ItemCommonProductBinding.bind(d12);
                                    i11 = R$id.quantityEt;
                                    QuantityInput quantityInput = (QuantityInput) C2548q.d(i11, view);
                                    if (quantityInput != null) {
                                        i11 = R$id.quantityGroup;
                                        Group group = (Group) C2548q.d(i11, view);
                                        if (group != null) {
                                            i11 = R$id.removeButton;
                                            AppCompatImageView appCompatImageView3 = (AppCompatImageView) C2548q.d(i11, view);
                                            if (appCompatImageView3 != null) {
                                                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                                return new WidgetCartSplitV2ItemBinding(constraintLayout, viewStub, barrier, frameLayout, d11, appCompatImageView, recyclerView, productFavoriteMoleculeButtonView, appCompatImageView2, bind, quantityInput, group, appCompatImageView3, constraintLayout);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public ConstraintLayout getConstraintLayout() {
        return this.rootView;
    }
}
