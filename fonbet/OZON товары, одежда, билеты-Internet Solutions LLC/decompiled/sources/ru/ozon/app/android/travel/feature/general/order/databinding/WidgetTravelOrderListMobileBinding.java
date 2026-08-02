package ru.ozon.app.android.travel.feature.general.order.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Guideline;
import ru.ozon.app.android.travel.feature.general.order.R$id;
import ru.ozon.app.android.travel.molecules.view.travelBadge.v1.TravelBadgeListView;
import ru.ozon.app.android.travel.utils.view.constraintLayoutWithBorder.ConstraintLayoutWithBorder;
import ru.ozon.app.android.uikit.view.badge.SimpleBadgeView;
import ru.ozon.uni.android.uikit.view.atoms.rating.VectorRatingBar;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;

/* loaded from: classes4.dex */
public final class WidgetTravelOrderListMobileBinding implements a {

    @NonNull
    public final View dividerView;

    @NonNull
    public final Guideline endGuideline;

    @NonNull
    public final ImageView iconIv;

    @NonNull
    public final VerticalAtomsLayout orderAtomsVal;

    @NonNull
    public final TravelBadgeListView orderBadgesTBLV;

    @NonNull
    public final AppCompatTextView orderNumberTv;

    @NonNull
    public final VectorRatingBar orderRatingVrb;

    @NonNull
    public final SimpleBadgeView orderStatusBv;

    @NonNull
    public final AppCompatTextView orderTypeTv;

    @NonNull
    private final ConstraintLayoutWithBorder rootView;

    @NonNull
    public final Guideline startGuideline;

    @NonNull
    public final AppCompatTextView subtitleTv;

    @NonNull
    public final AppCompatTextView titleTv;

    private WidgetTravelOrderListMobileBinding(@NonNull ConstraintLayoutWithBorder constraintLayoutWithBorder, @NonNull View view, @NonNull Guideline guideline, @NonNull ImageView imageView, @NonNull VerticalAtomsLayout verticalAtomsLayout, @NonNull TravelBadgeListView travelBadgeListView, @NonNull AppCompatTextView appCompatTextView, @NonNull VectorRatingBar vectorRatingBar, @NonNull SimpleBadgeView simpleBadgeView, @NonNull AppCompatTextView appCompatTextView2, @NonNull Guideline guideline2, @NonNull AppCompatTextView appCompatTextView3, @NonNull AppCompatTextView appCompatTextView4) {
        this.rootView = constraintLayoutWithBorder;
        this.dividerView = view;
        this.endGuideline = guideline;
        this.iconIv = imageView;
        this.orderAtomsVal = verticalAtomsLayout;
        this.orderBadgesTBLV = travelBadgeListView;
        this.orderNumberTv = appCompatTextView;
        this.orderRatingVrb = vectorRatingBar;
        this.orderStatusBv = simpleBadgeView;
        this.orderTypeTv = appCompatTextView2;
        this.startGuideline = guideline2;
        this.subtitleTv = appCompatTextView3;
        this.titleTv = appCompatTextView4;
    }

    @NonNull
    public static WidgetTravelOrderListMobileBinding bind(@NonNull View view) {
        int i11 = R$id.dividerView;
        View d11 = C2548q.d(i11, view);
        if (d11 != null) {
            i11 = R$id.endGuideline;
            Guideline guideline = (Guideline) C2548q.d(i11, view);
            if (guideline != null) {
                i11 = R$id.iconIv;
                ImageView imageView = (ImageView) C2548q.d(i11, view);
                if (imageView != null) {
                    i11 = R$id.orderAtomsVal;
                    VerticalAtomsLayout verticalAtomsLayout = (VerticalAtomsLayout) C2548q.d(i11, view);
                    if (verticalAtomsLayout != null) {
                        i11 = R$id.orderBadgesTBLV;
                        TravelBadgeListView travelBadgeListView = (TravelBadgeListView) C2548q.d(i11, view);
                        if (travelBadgeListView != null) {
                            i11 = R$id.orderNumberTv;
                            AppCompatTextView appCompatTextView = (AppCompatTextView) C2548q.d(i11, view);
                            if (appCompatTextView != null) {
                                i11 = R$id.orderRatingVrb;
                                VectorRatingBar vectorRatingBar = (VectorRatingBar) C2548q.d(i11, view);
                                if (vectorRatingBar != null) {
                                    i11 = R$id.orderStatusBv;
                                    SimpleBadgeView simpleBadgeView = (SimpleBadgeView) C2548q.d(i11, view);
                                    if (simpleBadgeView != null) {
                                        i11 = R$id.orderTypeTv;
                                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) C2548q.d(i11, view);
                                        if (appCompatTextView2 != null) {
                                            i11 = R$id.startGuideline;
                                            Guideline guideline2 = (Guideline) C2548q.d(i11, view);
                                            if (guideline2 != null) {
                                                i11 = R$id.subtitleTv;
                                                AppCompatTextView appCompatTextView3 = (AppCompatTextView) C2548q.d(i11, view);
                                                if (appCompatTextView3 != null) {
                                                    i11 = R$id.titleTv;
                                                    AppCompatTextView appCompatTextView4 = (AppCompatTextView) C2548q.d(i11, view);
                                                    if (appCompatTextView4 != null) {
                                                        return new WidgetTravelOrderListMobileBinding((ConstraintLayoutWithBorder) view, d11, guideline, imageView, verticalAtomsLayout, travelBadgeListView, appCompatTextView, vectorRatingBar, simpleBadgeView, appCompatTextView2, guideline2, appCompatTextView3, appCompatTextView4);
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
    public ConstraintLayoutWithBorder getConstraintLayout() {
        return this.rootView;
    }
}
