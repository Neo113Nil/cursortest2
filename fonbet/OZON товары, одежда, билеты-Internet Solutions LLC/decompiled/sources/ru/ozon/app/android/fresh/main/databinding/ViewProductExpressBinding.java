package ru.ozon.app.android.fresh.main.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.atoms.v3.containers.AtomBadgesLayout;
import ru.ozon.app.android.fresh.main.R$id;
import ru.ozon.app.android.fresh.main.widgets.product.common.views.ProductFavoriteExpressMoleculeView;
import ru.ozon.app.android.product.imagesswipeview.AdultImageView;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

/* loaded from: classes12.dex */
public final class ViewProductExpressBinding implements a {

    @NonNull
    public final Barrier barrier2;

    @NonNull
    public final AtomBadgesLayout bottomBadgesContainer;

    @NonNull
    public final AdultImageView imagesSwipeView;

    @NonNull
    public final ProductFavoriteExpressMoleculeView productFavMoleculeButton;

    @NonNull
    public final SingleAtom productSa;

    @NonNull
    public final ConstraintLayout rootLl;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final VerticalAtomsLayout stateVrc;

    @NonNull
    public final AtomBadgesLayout topBadgesContainer;

    private ViewProductExpressBinding(@NonNull ConstraintLayout constraintLayout, @NonNull Barrier barrier, @NonNull AtomBadgesLayout atomBadgesLayout, @NonNull AdultImageView adultImageView, @NonNull ProductFavoriteExpressMoleculeView productFavoriteExpressMoleculeView, @NonNull SingleAtom singleAtom, @NonNull ConstraintLayout constraintLayout2, @NonNull VerticalAtomsLayout verticalAtomsLayout, @NonNull AtomBadgesLayout atomBadgesLayout2) {
        this.rootView = constraintLayout;
        this.barrier2 = barrier;
        this.bottomBadgesContainer = atomBadgesLayout;
        this.imagesSwipeView = adultImageView;
        this.productFavMoleculeButton = productFavoriteExpressMoleculeView;
        this.productSa = singleAtom;
        this.rootLl = constraintLayout2;
        this.stateVrc = verticalAtomsLayout;
        this.topBadgesContainer = atomBadgesLayout2;
    }

    @NonNull
    public static ViewProductExpressBinding bind(@NonNull View view) {
        int i11 = R$id.barrier2;
        Barrier barrier = (Barrier) C2548q.d(i11, view);
        if (barrier != null) {
            i11 = R$id.bottomBadgesContainer;
            AtomBadgesLayout atomBadgesLayout = (AtomBadgesLayout) C2548q.d(i11, view);
            if (atomBadgesLayout != null) {
                i11 = R$id.imagesSwipeView;
                AdultImageView adultImageView = (AdultImageView) C2548q.d(i11, view);
                if (adultImageView != null) {
                    i11 = R$id.productFavMoleculeButton;
                    ProductFavoriteExpressMoleculeView productFavoriteExpressMoleculeView = (ProductFavoriteExpressMoleculeView) C2548q.d(i11, view);
                    if (productFavoriteExpressMoleculeView != null) {
                        i11 = R$id.productSa;
                        SingleAtom singleAtom = (SingleAtom) C2548q.d(i11, view);
                        if (singleAtom != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) view;
                            i11 = R$id.stateVrc;
                            VerticalAtomsLayout verticalAtomsLayout = (VerticalAtomsLayout) C2548q.d(i11, view);
                            if (verticalAtomsLayout != null) {
                                i11 = R$id.topBadgesContainer;
                                AtomBadgesLayout atomBadgesLayout2 = (AtomBadgesLayout) C2548q.d(i11, view);
                                if (atomBadgesLayout2 != null) {
                                    return new ViewProductExpressBinding(constraintLayout, barrier, atomBadgesLayout, adultImageView, productFavoriteExpressMoleculeView, singleAtom, constraintLayout, verticalAtomsLayout, atomBadgesLayout2);
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
