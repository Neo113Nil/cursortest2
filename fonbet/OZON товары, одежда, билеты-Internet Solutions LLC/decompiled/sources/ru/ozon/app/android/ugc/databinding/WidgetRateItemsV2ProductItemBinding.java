package ru.ozon.app.android.ugc.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.ugc.R$id;
import ru.ozon.app.android.ugc.R$layout;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.productMedia.ProductMediaView;
import ru.ozon.uni.android.atom.rating.RatingView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;

/* loaded from: classes2.dex */
public final class WidgetRateItemsV2ProductItemBinding implements a {

    @NonNull
    public final BadgeView badge;

    @NonNull
    public final CellView cell;

    @NonNull
    public final IconButtonV3View hideButton;

    @NonNull
    public final LinearLayout hideCL;

    @NonNull
    public final TextAtomV2View hideTitle;

    @NonNull
    public final ProductMediaView productMedia;

    @NonNull
    public final RatingView rating;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextAtomV2View timer;

    @NonNull
    public final TextAtomV2View title;

    private WidgetRateItemsV2ProductItemBinding(@NonNull ConstraintLayout constraintLayout, @NonNull BadgeView badgeView, @NonNull CellView cellView, @NonNull IconButtonV3View iconButtonV3View, @NonNull LinearLayout linearLayout, @NonNull TextAtomV2View textAtomV2View, @NonNull ProductMediaView productMediaView, @NonNull RatingView ratingView, @NonNull TextAtomV2View textAtomV2View2, @NonNull TextAtomV2View textAtomV2View3) {
        this.rootView = constraintLayout;
        this.badge = badgeView;
        this.cell = cellView;
        this.hideButton = iconButtonV3View;
        this.hideCL = linearLayout;
        this.hideTitle = textAtomV2View;
        this.productMedia = productMediaView;
        this.rating = ratingView;
        this.timer = textAtomV2View2;
        this.title = textAtomV2View3;
    }

    @NonNull
    public static WidgetRateItemsV2ProductItemBinding bind(@NonNull View view) {
        int i11 = R$id.badge;
        BadgeView badgeView = (BadgeView) C2548q.d(i11, view);
        if (badgeView != null) {
            i11 = R$id.cell;
            CellView cellView = (CellView) C2548q.d(i11, view);
            if (cellView != null) {
                i11 = R$id.hideButton;
                IconButtonV3View iconButtonV3View = (IconButtonV3View) C2548q.d(i11, view);
                if (iconButtonV3View != null) {
                    i11 = R$id.hideCL;
                    LinearLayout linearLayout = (LinearLayout) C2548q.d(i11, view);
                    if (linearLayout != null) {
                        i11 = R$id.hideTitle;
                        TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                        if (textAtomV2View != null) {
                            i11 = R$id.productMedia;
                            ProductMediaView productMediaView = (ProductMediaView) C2548q.d(i11, view);
                            if (productMediaView != null) {
                                i11 = R$id.rating;
                                RatingView ratingView = (RatingView) C2548q.d(i11, view);
                                if (ratingView != null) {
                                    i11 = R$id.timer;
                                    TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(i11, view);
                                    if (textAtomV2View2 != null) {
                                        i11 = R$id.title;
                                        TextAtomV2View textAtomV2View3 = (TextAtomV2View) C2548q.d(i11, view);
                                        if (textAtomV2View3 != null) {
                                            return new WidgetRateItemsV2ProductItemBinding((ConstraintLayout) view, badgeView, cellView, iconButtonV3View, linearLayout, textAtomV2View, productMediaView, ratingView, textAtomV2View2, textAtomV2View3);
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

    @NonNull
    public static WidgetRateItemsV2ProductItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static WidgetRateItemsV2ProductItemBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.widget_rate_items_v2_product_item, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public ConstraintLayout getConstraintLayout() {
        return this.rootView;
    }
}
