package ru.ozon.app.android.travel.ui.molecules.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import ru.ozon.app.android.travel.molecules.view.tripRoute.TravelVerticalAirlineIconViewGroup;
import ru.ozon.app.android.travel.ui.molecules.R$id;
import ru.ozon.app.android.travel.ui.molecules.R$layout;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes2.dex */
public final class ViewTripRouteBinding implements a {

    @NonNull
    private final View rootView;

    @NonNull
    public final TravelVerticalAirlineIconViewGroup tripRouteArlineIconViewGroup;

    @NonNull
    public final AppCompatTextView tripRouteDayCountTv;

    @NonNull
    public final TextAtomView tripRouteInfoTv;

    @NonNull
    public final ImageView tripRouteTransferIconIv;

    @NonNull
    public final TextAtomView tripRouteTransferInfoTv;

    @NonNull
    public final TextAtomView tripRouteTransferTimeTv;

    @NonNull
    public final TextAtomView tripRouteTripDurationTv;

    @NonNull
    public final TextAtomView tripRouteTripTimeTv;

    private ViewTripRouteBinding(@NonNull View view, @NonNull TravelVerticalAirlineIconViewGroup travelVerticalAirlineIconViewGroup, @NonNull AppCompatTextView appCompatTextView, @NonNull TextAtomView textAtomView, @NonNull ImageView imageView, @NonNull TextAtomView textAtomView2, @NonNull TextAtomView textAtomView3, @NonNull TextAtomView textAtomView4, @NonNull TextAtomView textAtomView5) {
        this.rootView = view;
        this.tripRouteArlineIconViewGroup = travelVerticalAirlineIconViewGroup;
        this.tripRouteDayCountTv = appCompatTextView;
        this.tripRouteInfoTv = textAtomView;
        this.tripRouteTransferIconIv = imageView;
        this.tripRouteTransferInfoTv = textAtomView2;
        this.tripRouteTransferTimeTv = textAtomView3;
        this.tripRouteTripDurationTv = textAtomView4;
        this.tripRouteTripTimeTv = textAtomView5;
    }

    @NonNull
    public static ViewTripRouteBinding bind(@NonNull View view) {
        int i11 = R$id.tripRouteArlineIconViewGroup;
        TravelVerticalAirlineIconViewGroup travelVerticalAirlineIconViewGroup = (TravelVerticalAirlineIconViewGroup) C2548q.d(i11, view);
        if (travelVerticalAirlineIconViewGroup != null) {
            i11 = R$id.tripRouteDayCountTv;
            AppCompatTextView appCompatTextView = (AppCompatTextView) C2548q.d(i11, view);
            if (appCompatTextView != null) {
                i11 = R$id.tripRouteInfoTv;
                TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
                if (textAtomView != null) {
                    i11 = R$id.tripRouteTransferIconIv;
                    ImageView imageView = (ImageView) C2548q.d(i11, view);
                    if (imageView != null) {
                        i11 = R$id.tripRouteTransferInfoTv;
                        TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
                        if (textAtomView2 != null) {
                            i11 = R$id.tripRouteTransferTimeTv;
                            TextAtomView textAtomView3 = (TextAtomView) C2548q.d(i11, view);
                            if (textAtomView3 != null) {
                                i11 = R$id.tripRouteTripDurationTv;
                                TextAtomView textAtomView4 = (TextAtomView) C2548q.d(i11, view);
                                if (textAtomView4 != null) {
                                    i11 = R$id.tripRouteTripTimeTv;
                                    TextAtomView textAtomView5 = (TextAtomView) C2548q.d(i11, view);
                                    if (textAtomView5 != null) {
                                        return new ViewTripRouteBinding(view, travelVerticalAirlineIconViewGroup, appCompatTextView, textAtomView, imageView, textAtomView2, textAtomView3, textAtomView4, textAtomView5);
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
    public static ViewTripRouteBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.view_trip_route, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public View getConstraintLayout() {
        return this.rootView;
    }
}
