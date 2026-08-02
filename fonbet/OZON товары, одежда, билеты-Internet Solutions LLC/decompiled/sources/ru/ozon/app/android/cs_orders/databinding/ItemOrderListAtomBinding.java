package ru.ozon.app.android.cs_orders.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.atoms.atom2.TextAtom;
import ru.ozon.app.android.cs_orders.R$id;
import ru.ozon.app.android.uikit.view.atoms.progressbar.ProgressBarView;
import ru.ozon.app.android.uikit.view.discount.ProgressiveDiscountView;
import ru.ozon.app.android.uikit.view.recycler.UntouchableRecyclerView;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.uikit.view.atoms.price.PriceView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes11.dex */
public final class ItemOrderListAtomBinding implements a {

    @NonNull
    public final ConstraintLayout cardContainer;

    @NonNull
    public final ImageView iconIv;

    @NonNull
    public final UntouchableRecyclerView orderItems;

    @NonNull
    public final AppCompatTextView orderNumberTv;

    @NonNull
    public final AppCompatTextView orderTitleTv;

    @NonNull
    public final ProgressBarView progressPBV;

    @NonNull
    public final LinearLayout progressRootLl;

    @NonNull
    public final TextAtomView progressTitleTv;

    @NonNull
    public final PriceView progressiveDiscountPa;

    @NonNull
    public final ProgressiveDiscountView progressiveDiscountRv;

    @NonNull
    private final CardView rootView;

    @NonNull
    public final BadgeView statusTv;

    @NonNull
    public final TextAtom subtitleTa;

    private ItemOrderListAtomBinding(@NonNull CardView cardView, @NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull UntouchableRecyclerView untouchableRecyclerView, @NonNull AppCompatTextView appCompatTextView, @NonNull AppCompatTextView appCompatTextView2, @NonNull ProgressBarView progressBarView, @NonNull LinearLayout linearLayout, @NonNull TextAtomView textAtomView, @NonNull PriceView priceView, @NonNull ProgressiveDiscountView progressiveDiscountView, @NonNull BadgeView badgeView, @NonNull TextAtom textAtom) {
        this.rootView = cardView;
        this.cardContainer = constraintLayout;
        this.iconIv = imageView;
        this.orderItems = untouchableRecyclerView;
        this.orderNumberTv = appCompatTextView;
        this.orderTitleTv = appCompatTextView2;
        this.progressPBV = progressBarView;
        this.progressRootLl = linearLayout;
        this.progressTitleTv = textAtomView;
        this.progressiveDiscountPa = priceView;
        this.progressiveDiscountRv = progressiveDiscountView;
        this.statusTv = badgeView;
        this.subtitleTa = textAtom;
    }

    @NonNull
    public static ItemOrderListAtomBinding bind(@NonNull View view) {
        int i11 = R$id.cardContainer;
        ConstraintLayout constraintLayout = (ConstraintLayout) C2548q.d(i11, view);
        if (constraintLayout != null) {
            i11 = R$id.iconIv;
            ImageView imageView = (ImageView) C2548q.d(i11, view);
            if (imageView != null) {
                i11 = R$id.orderItems;
                UntouchableRecyclerView untouchableRecyclerView = (UntouchableRecyclerView) C2548q.d(i11, view);
                if (untouchableRecyclerView != null) {
                    i11 = R$id.orderNumberTv;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) C2548q.d(i11, view);
                    if (appCompatTextView != null) {
                        i11 = R$id.orderTitleTv;
                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) C2548q.d(i11, view);
                        if (appCompatTextView2 != null) {
                            i11 = R$id.progressPBV;
                            ProgressBarView progressBarView = (ProgressBarView) C2548q.d(i11, view);
                            if (progressBarView != null) {
                                i11 = R$id.progressRootLl;
                                LinearLayout linearLayout = (LinearLayout) C2548q.d(i11, view);
                                if (linearLayout != null) {
                                    i11 = R$id.progressTitleTv;
                                    TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
                                    if (textAtomView != null) {
                                        i11 = R$id.progressiveDiscountPa;
                                        PriceView priceView = (PriceView) C2548q.d(i11, view);
                                        if (priceView != null) {
                                            i11 = R$id.progressiveDiscountRv;
                                            ProgressiveDiscountView progressiveDiscountView = (ProgressiveDiscountView) C2548q.d(i11, view);
                                            if (progressiveDiscountView != null) {
                                                i11 = R$id.statusTv;
                                                BadgeView badgeView = (BadgeView) C2548q.d(i11, view);
                                                if (badgeView != null) {
                                                    i11 = R$id.subtitleTa;
                                                    TextAtom textAtom = (TextAtom) C2548q.d(i11, view);
                                                    if (textAtom != null) {
                                                        return new ItemOrderListAtomBinding((CardView) view, constraintLayout, imageView, untouchableRecyclerView, appCompatTextView, appCompatTextView2, progressBarView, linearLayout, textAtomView, priceView, progressiveDiscountView, badgeView, textAtom);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public CardView getConstraintLayout() {
        return this.rootView;
    }
}
