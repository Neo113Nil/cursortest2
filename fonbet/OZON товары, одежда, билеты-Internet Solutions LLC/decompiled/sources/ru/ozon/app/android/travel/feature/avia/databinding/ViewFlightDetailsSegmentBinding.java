package ru.ozon.app.android.travel.feature.avia.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import ru.ozon.app.android.travel.feature.avia.R$id;
import ru.ozon.app.android.travel.feature.avia.R$layout;
import ru.ozon.app.android.travel.feature.avia.shared.flightDetails.FlightDetailsSegmentInfoView;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.af.layout.HorizontalFlexAtomsLayout;

/* loaded from: classes8.dex */
public final class ViewFlightDetailsSegmentBinding implements a {

    @NonNull
    public final IconView aviaDetailedInfoV3AirlineLogoIV;

    @NonNull
    public final TextAtomV2View aviaDetailedInfoV3AirlineTAV;

    @NonNull
    public final BadgeView aviaDetailedInfoV3BadgeVB;

    @NonNull
    public final HorizontalFlexAtomsLayout aviaDetailedInfoV3LuggageBadgesHFAL;

    @NonNull
    public final TextAtomV2View aviaDetailedInfoV3SegmentAirplaneTAV;

    @NonNull
    public final FlightDetailsSegmentInfoView aviaDetailedInfoV3SegmentArrival;

    @NonNull
    public final FlightDetailsSegmentInfoView aviaDetailedInfoV3SegmentDeparture;

    @NonNull
    public final TextAtomV2View aviaDetailedInfoV3SegmentDurationTAV;

    @NonNull
    public final IconView aviaDetailedInfoV3SubAirlineLogoIV;

    @NonNull
    private final View rootView;

    private ViewFlightDetailsSegmentBinding(@NonNull View view, @NonNull IconView iconView, @NonNull TextAtomV2View textAtomV2View, @NonNull BadgeView badgeView, @NonNull HorizontalFlexAtomsLayout horizontalFlexAtomsLayout, @NonNull TextAtomV2View textAtomV2View2, @NonNull FlightDetailsSegmentInfoView flightDetailsSegmentInfoView, @NonNull FlightDetailsSegmentInfoView flightDetailsSegmentInfoView2, @NonNull TextAtomV2View textAtomV2View3, @NonNull IconView iconView2) {
        this.rootView = view;
        this.aviaDetailedInfoV3AirlineLogoIV = iconView;
        this.aviaDetailedInfoV3AirlineTAV = textAtomV2View;
        this.aviaDetailedInfoV3BadgeVB = badgeView;
        this.aviaDetailedInfoV3LuggageBadgesHFAL = horizontalFlexAtomsLayout;
        this.aviaDetailedInfoV3SegmentAirplaneTAV = textAtomV2View2;
        this.aviaDetailedInfoV3SegmentArrival = flightDetailsSegmentInfoView;
        this.aviaDetailedInfoV3SegmentDeparture = flightDetailsSegmentInfoView2;
        this.aviaDetailedInfoV3SegmentDurationTAV = textAtomV2View3;
        this.aviaDetailedInfoV3SubAirlineLogoIV = iconView2;
    }

    @NonNull
    public static ViewFlightDetailsSegmentBinding bind(@NonNull View view) {
        int i11 = R$id.aviaDetailedInfoV3AirlineLogoIV;
        IconView iconView = (IconView) C2548q.d(i11, view);
        if (iconView != null) {
            i11 = R$id.aviaDetailedInfoV3AirlineTAV;
            TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
            if (textAtomV2View != null) {
                i11 = R$id.aviaDetailedInfoV3BadgeVB;
                BadgeView badgeView = (BadgeView) C2548q.d(i11, view);
                if (badgeView != null) {
                    i11 = R$id.aviaDetailedInfoV3LuggageBadgesHFAL;
                    HorizontalFlexAtomsLayout horizontalFlexAtomsLayout = (HorizontalFlexAtomsLayout) C2548q.d(i11, view);
                    if (horizontalFlexAtomsLayout != null) {
                        i11 = R$id.aviaDetailedInfoV3SegmentAirplaneTAV;
                        TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(i11, view);
                        if (textAtomV2View2 != null) {
                            i11 = R$id.aviaDetailedInfoV3SegmentArrival;
                            FlightDetailsSegmentInfoView flightDetailsSegmentInfoView = (FlightDetailsSegmentInfoView) C2548q.d(i11, view);
                            if (flightDetailsSegmentInfoView != null) {
                                i11 = R$id.aviaDetailedInfoV3SegmentDeparture;
                                FlightDetailsSegmentInfoView flightDetailsSegmentInfoView2 = (FlightDetailsSegmentInfoView) C2548q.d(i11, view);
                                if (flightDetailsSegmentInfoView2 != null) {
                                    i11 = R$id.aviaDetailedInfoV3SegmentDurationTAV;
                                    TextAtomV2View textAtomV2View3 = (TextAtomV2View) C2548q.d(i11, view);
                                    if (textAtomV2View3 != null) {
                                        i11 = R$id.aviaDetailedInfoV3SubAirlineLogoIV;
                                        IconView iconView2 = (IconView) C2548q.d(i11, view);
                                        if (iconView2 != null) {
                                            return new ViewFlightDetailsSegmentBinding(view, iconView, textAtomV2View, badgeView, horizontalFlexAtomsLayout, textAtomV2View2, flightDetailsSegmentInfoView, flightDetailsSegmentInfoView2, textAtomV2View3, iconView2);
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
    public static ViewFlightDetailsSegmentBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.view_flight_details_segment, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public View getConstraintLayout() {
        return this.rootView;
    }
}
