package ru.ozon.app.android.pdp.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.buttonview.ProductFavoriteMoleculeButtonView;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.SmallButtonView;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;

/* loaded from: classes13.dex */
public final class PdpWidgetSellerBinding implements a {

    @NonNull
    public final SmallButtonView askQuestionBtn;

    @NonNull
    public final ImageView bannerIv;

    @NonNull
    public final VerticalAtomsLayout cellsVAL;

    @NonNull
    public final ProductFavoriteMoleculeButtonView favoriteButtonPfmbv;

    @NonNull
    public final ImageView logoIv;

    @NonNull
    public final TextView logoTv;

    @NonNull
    public final TextAtomV2View nameTv;

    @NonNull
    public final BadgeView premiumBadgeBv;

    @NonNull
    public final ConstraintLayout rootCl;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final RecyclerView tagsRv;

    @NonNull
    public final TextAtomV2View titleTav;

    private PdpWidgetSellerBinding(@NonNull ConstraintLayout constraintLayout, @NonNull SmallButtonView smallButtonView, @NonNull ImageView imageView, @NonNull VerticalAtomsLayout verticalAtomsLayout, @NonNull ProductFavoriteMoleculeButtonView productFavoriteMoleculeButtonView, @NonNull ImageView imageView2, @NonNull TextView textView, @NonNull TextAtomV2View textAtomV2View, @NonNull BadgeView badgeView, @NonNull ConstraintLayout constraintLayout2, @NonNull RecyclerView recyclerView, @NonNull TextAtomV2View textAtomV2View2) {
        this.rootView = constraintLayout;
        this.askQuestionBtn = smallButtonView;
        this.bannerIv = imageView;
        this.cellsVAL = verticalAtomsLayout;
        this.favoriteButtonPfmbv = productFavoriteMoleculeButtonView;
        this.logoIv = imageView2;
        this.logoTv = textView;
        this.nameTv = textAtomV2View;
        this.premiumBadgeBv = badgeView;
        this.rootCl = constraintLayout2;
        this.tagsRv = recyclerView;
        this.titleTav = textAtomV2View2;
    }

    @NonNull
    public static PdpWidgetSellerBinding bind(@NonNull View view) {
        int i11 = R$id.askQuestionBtn;
        SmallButtonView smallButtonView = (SmallButtonView) C2548q.d(i11, view);
        if (smallButtonView != null) {
            i11 = R$id.bannerIv;
            ImageView imageView = (ImageView) C2548q.d(i11, view);
            if (imageView != null) {
                i11 = R$id.cellsVAL;
                VerticalAtomsLayout verticalAtomsLayout = (VerticalAtomsLayout) C2548q.d(i11, view);
                if (verticalAtomsLayout != null) {
                    i11 = R$id.favoriteButtonPfmbv;
                    ProductFavoriteMoleculeButtonView productFavoriteMoleculeButtonView = (ProductFavoriteMoleculeButtonView) C2548q.d(i11, view);
                    if (productFavoriteMoleculeButtonView != null) {
                        i11 = R$id.logoIv;
                        ImageView imageView2 = (ImageView) C2548q.d(i11, view);
                        if (imageView2 != null) {
                            i11 = R$id.logoTv;
                            TextView textView = (TextView) C2548q.d(i11, view);
                            if (textView != null) {
                                i11 = R$id.nameTv;
                                TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                                if (textAtomV2View != null) {
                                    i11 = R$id.premiumBadgeBv;
                                    BadgeView badgeView = (BadgeView) C2548q.d(i11, view);
                                    if (badgeView != null) {
                                        ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                        i11 = R$id.tagsRv;
                                        RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
                                        if (recyclerView != null) {
                                            i11 = R$id.titleTav;
                                            TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(i11, view);
                                            if (textAtomV2View2 != null) {
                                                return new PdpWidgetSellerBinding(constraintLayout, smallButtonView, imageView, verticalAtomsLayout, productFavoriteMoleculeButtonView, imageView2, textView, textAtomV2View, badgeView, constraintLayout, recyclerView, textAtomV2View2);
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
