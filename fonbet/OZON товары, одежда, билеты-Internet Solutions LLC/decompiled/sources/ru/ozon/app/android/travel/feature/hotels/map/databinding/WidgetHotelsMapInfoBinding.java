package ru.ozon.app.android.travel.feature.hotels.map.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import ru.ozon.app.android.travel.feature.hotels.map.R$id;
import ru.ozon.app.android.travel.feature.hotels.map.R$layout;
import ru.ozon.app.android.travel.molecules.view.travelFiltersButton.TravelFiltersButtonView;
import ru.ozon.mapsdk.OzonMapView;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.SmallIconButtonView;

/* loaded from: classes4.dex */
public final class WidgetHotelsMapInfoBinding implements a {

    @NonNull
    public final SmallIconButtonView hotelsMapInfoBackButtonSibv;

    @NonNull
    public final Guideline hotelsMapInfoCenterHorizontalGuideline;

    @NonNull
    public final ConstraintLayout hotelsMapInfoCl;

    @NonNull
    public final TravelFiltersButtonView hotelsMapInfoFiltersButtonTfbv;

    @NonNull
    public final SmallIconButtonView hotelsMapInfoLocationButtonSibv;

    @NonNull
    public final OzonMapView hotelsMapInfoMap;

    @NonNull
    public final Barrier hotelsMapInfoZoomControlsBottomBarrier;

    @NonNull
    public final SmallIconButtonView hotelsMapInfoZoomInLocationButtonSibv;

    @NonNull
    public final SmallIconButtonView hotelsMapInfoZoomOutButtonSibv;

    @NonNull
    private final ConstraintLayout rootView;

    private WidgetHotelsMapInfoBinding(@NonNull ConstraintLayout constraintLayout, @NonNull SmallIconButtonView smallIconButtonView, @NonNull Guideline guideline, @NonNull ConstraintLayout constraintLayout2, @NonNull TravelFiltersButtonView travelFiltersButtonView, @NonNull SmallIconButtonView smallIconButtonView2, @NonNull OzonMapView ozonMapView, @NonNull Barrier barrier, @NonNull SmallIconButtonView smallIconButtonView3, @NonNull SmallIconButtonView smallIconButtonView4) {
        this.rootView = constraintLayout;
        this.hotelsMapInfoBackButtonSibv = smallIconButtonView;
        this.hotelsMapInfoCenterHorizontalGuideline = guideline;
        this.hotelsMapInfoCl = constraintLayout2;
        this.hotelsMapInfoFiltersButtonTfbv = travelFiltersButtonView;
        this.hotelsMapInfoLocationButtonSibv = smallIconButtonView2;
        this.hotelsMapInfoMap = ozonMapView;
        this.hotelsMapInfoZoomControlsBottomBarrier = barrier;
        this.hotelsMapInfoZoomInLocationButtonSibv = smallIconButtonView3;
        this.hotelsMapInfoZoomOutButtonSibv = smallIconButtonView4;
    }

    @NonNull
    public static WidgetHotelsMapInfoBinding bind(@NonNull View view) {
        int i11 = R$id.hotelsMapInfoBackButtonSibv;
        SmallIconButtonView smallIconButtonView = (SmallIconButtonView) C2548q.d(i11, view);
        if (smallIconButtonView != null) {
            i11 = R$id.hotelsMapInfoCenterHorizontalGuideline;
            Guideline guideline = (Guideline) C2548q.d(i11, view);
            if (guideline != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i11 = R$id.hotelsMapInfoFiltersButtonTfbv;
                TravelFiltersButtonView travelFiltersButtonView = (TravelFiltersButtonView) C2548q.d(i11, view);
                if (travelFiltersButtonView != null) {
                    i11 = R$id.hotelsMapInfoLocationButtonSibv;
                    SmallIconButtonView smallIconButtonView2 = (SmallIconButtonView) C2548q.d(i11, view);
                    if (smallIconButtonView2 != null) {
                        i11 = R$id.hotelsMapInfoMap;
                        OzonMapView ozonMapView = (OzonMapView) C2548q.d(i11, view);
                        if (ozonMapView != null) {
                            i11 = R$id.hotelsMapInfoZoomControlsBottomBarrier;
                            Barrier barrier = (Barrier) C2548q.d(i11, view);
                            if (barrier != null) {
                                i11 = R$id.hotelsMapInfoZoomInLocationButtonSibv;
                                SmallIconButtonView smallIconButtonView3 = (SmallIconButtonView) C2548q.d(i11, view);
                                if (smallIconButtonView3 != null) {
                                    i11 = R$id.hotelsMapInfoZoomOutButtonSibv;
                                    SmallIconButtonView smallIconButtonView4 = (SmallIconButtonView) C2548q.d(i11, view);
                                    if (smallIconButtonView4 != null) {
                                        return new WidgetHotelsMapInfoBinding(constraintLayout, smallIconButtonView, guideline, constraintLayout, travelFiltersButtonView, smallIconButtonView2, ozonMapView, barrier, smallIconButtonView3, smallIconButtonView4);
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
    public static WidgetHotelsMapInfoBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.widget_hotels_map_info, viewGroup, false);
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
