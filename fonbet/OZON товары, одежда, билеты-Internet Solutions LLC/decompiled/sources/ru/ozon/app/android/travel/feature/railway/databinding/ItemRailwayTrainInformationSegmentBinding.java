package ru.ozon.app.android.travel.feature.railway.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import ru.ozon.app.android.travel.feature.railway.R$id;
import ru.ozon.app.android.travel.feature.railway.R$layout;
import ru.ozon.app.android.travel.molecules.view.linkButton.LinkButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes4.dex */
public final class ItemRailwayTrainInformationSegmentBinding implements a {

    @NonNull
    public final View railwayTrainInformationArrivalLineView;

    @NonNull
    public final TextAtomView railwayTrainInformationArrivalStationAdditionalNameTav;

    @NonNull
    public final TextAtomView railwayTrainInformationArrivalStationDateTav;

    @NonNull
    public final TextAtomView railwayTrainInformationArrivalStationNameTav;

    @NonNull
    public final TextAtomView railwayTrainInformationArrivalStationTimeTav;

    @NonNull
    public final TextAtomView railwayTrainInformationCarriageInfoTav;

    @NonNull
    public final Guideline railwayTrainInformationCenterGuideline;

    @NonNull
    public final View railwayTrainInformationDepartureLineView;

    @NonNull
    public final TextAtomView railwayTrainInformationDepartureStationAdditionalNameTav;

    @NonNull
    public final TextAtomView railwayTrainInformationDepartureStationDateTav;

    @NonNull
    public final TextAtomView railwayTrainInformationDepartureStationNameTav;

    @NonNull
    public final TextAtomView railwayTrainInformationDepartureStationTimeTav;

    @NonNull
    public final TextAtomView railwayTrainInformationDurationTav;

    @NonNull
    public final LinkButtonView railwayTrainInformationRouteButtonLbv;

    @NonNull
    public final Barrier railwayTrainInformationSegmentBottomBarrier;

    @NonNull
    public final TextAtomView railwayTrainInformationTitleTav;

    @NonNull
    private final ConstraintLayout rootView;

    private ItemRailwayTrainInformationSegmentBinding(@NonNull ConstraintLayout constraintLayout, @NonNull View view, @NonNull TextAtomView textAtomView, @NonNull TextAtomView textAtomView2, @NonNull TextAtomView textAtomView3, @NonNull TextAtomView textAtomView4, @NonNull TextAtomView textAtomView5, @NonNull Guideline guideline, @NonNull View view2, @NonNull TextAtomView textAtomView6, @NonNull TextAtomView textAtomView7, @NonNull TextAtomView textAtomView8, @NonNull TextAtomView textAtomView9, @NonNull TextAtomView textAtomView10, @NonNull LinkButtonView linkButtonView, @NonNull Barrier barrier, @NonNull TextAtomView textAtomView11) {
        this.rootView = constraintLayout;
        this.railwayTrainInformationArrivalLineView = view;
        this.railwayTrainInformationArrivalStationAdditionalNameTav = textAtomView;
        this.railwayTrainInformationArrivalStationDateTav = textAtomView2;
        this.railwayTrainInformationArrivalStationNameTav = textAtomView3;
        this.railwayTrainInformationArrivalStationTimeTav = textAtomView4;
        this.railwayTrainInformationCarriageInfoTav = textAtomView5;
        this.railwayTrainInformationCenterGuideline = guideline;
        this.railwayTrainInformationDepartureLineView = view2;
        this.railwayTrainInformationDepartureStationAdditionalNameTav = textAtomView6;
        this.railwayTrainInformationDepartureStationDateTav = textAtomView7;
        this.railwayTrainInformationDepartureStationNameTav = textAtomView8;
        this.railwayTrainInformationDepartureStationTimeTav = textAtomView9;
        this.railwayTrainInformationDurationTav = textAtomView10;
        this.railwayTrainInformationRouteButtonLbv = linkButtonView;
        this.railwayTrainInformationSegmentBottomBarrier = barrier;
        this.railwayTrainInformationTitleTav = textAtomView11;
    }

    @NonNull
    public static ItemRailwayTrainInformationSegmentBinding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.railwayTrainInformationArrivalLineView;
        View d12 = C2548q.d(i11, view);
        if (d12 != null) {
            i11 = R$id.railwayTrainInformationArrivalStationAdditionalNameTav;
            TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
            if (textAtomView != null) {
                i11 = R$id.railwayTrainInformationArrivalStationDateTav;
                TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
                if (textAtomView2 != null) {
                    i11 = R$id.railwayTrainInformationArrivalStationNameTav;
                    TextAtomView textAtomView3 = (TextAtomView) C2548q.d(i11, view);
                    if (textAtomView3 != null) {
                        i11 = R$id.railwayTrainInformationArrivalStationTimeTav;
                        TextAtomView textAtomView4 = (TextAtomView) C2548q.d(i11, view);
                        if (textAtomView4 != null) {
                            i11 = R$id.railwayTrainInformationCarriageInfoTav;
                            TextAtomView textAtomView5 = (TextAtomView) C2548q.d(i11, view);
                            if (textAtomView5 != null) {
                                i11 = R$id.railwayTrainInformationCenterGuideline;
                                Guideline guideline = (Guideline) C2548q.d(i11, view);
                                if (guideline != null && (d11 = C2548q.d((i11 = R$id.railwayTrainInformationDepartureLineView), view)) != null) {
                                    i11 = R$id.railwayTrainInformationDepartureStationAdditionalNameTav;
                                    TextAtomView textAtomView6 = (TextAtomView) C2548q.d(i11, view);
                                    if (textAtomView6 != null) {
                                        i11 = R$id.railwayTrainInformationDepartureStationDateTav;
                                        TextAtomView textAtomView7 = (TextAtomView) C2548q.d(i11, view);
                                        if (textAtomView7 != null) {
                                            i11 = R$id.railwayTrainInformationDepartureStationNameTav;
                                            TextAtomView textAtomView8 = (TextAtomView) C2548q.d(i11, view);
                                            if (textAtomView8 != null) {
                                                i11 = R$id.railwayTrainInformationDepartureStationTimeTav;
                                                TextAtomView textAtomView9 = (TextAtomView) C2548q.d(i11, view);
                                                if (textAtomView9 != null) {
                                                    i11 = R$id.railwayTrainInformationDurationTav;
                                                    TextAtomView textAtomView10 = (TextAtomView) C2548q.d(i11, view);
                                                    if (textAtomView10 != null) {
                                                        i11 = R$id.railwayTrainInformationRouteButtonLbv;
                                                        LinkButtonView linkButtonView = (LinkButtonView) C2548q.d(i11, view);
                                                        if (linkButtonView != null) {
                                                            i11 = R$id.railwayTrainInformationSegmentBottomBarrier;
                                                            Barrier barrier = (Barrier) C2548q.d(i11, view);
                                                            if (barrier != null) {
                                                                i11 = R$id.railwayTrainInformationTitleTav;
                                                                TextAtomView textAtomView11 = (TextAtomView) C2548q.d(i11, view);
                                                                if (textAtomView11 != null) {
                                                                    return new ItemRailwayTrainInformationSegmentBinding((ConstraintLayout) view, d12, textAtomView, textAtomView2, textAtomView3, textAtomView4, textAtomView5, guideline, d11, textAtomView6, textAtomView7, textAtomView8, textAtomView9, textAtomView10, linkButtonView, barrier, textAtomView11);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ItemRailwayTrainInformationSegmentBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_railway_train_information_segment, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
