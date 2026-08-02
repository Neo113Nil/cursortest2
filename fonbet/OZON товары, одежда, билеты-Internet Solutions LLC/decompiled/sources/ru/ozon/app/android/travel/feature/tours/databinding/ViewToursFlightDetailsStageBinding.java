package ru.ozon.app.android.travel.feature.tours.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Barrier;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.imageview.ShapeableImageView;
import ru.ozon.app.android.travel.feature.tours.R$id;
import ru.ozon.app.android.travel.feature.tours.R$layout;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes4.dex */
public final class ViewToursFlightDetailsStageBinding implements a {

    @NonNull
    private final View rootView;

    @NonNull
    public final TextAtomView toursFlightDetailsAirlineTAV;

    @NonNull
    public final RecyclerView toursFlightDetailsBadgesRv;

    @NonNull
    public final ShapeableImageView toursFlightDetailsCompanySIV;

    @NonNull
    public final Barrier toursFlightDetailsDateBarrierR;

    @NonNull
    public final TextAtomView toursFlightDetailsFromAirportTAV;

    @NonNull
    public final TextAtomView toursFlightDetailsFromCityTAV;

    @NonNull
    public final TextAtomView toursFlightDetailsFromDateTAV;

    @NonNull
    public final TextAtomView toursFlightDetailsFromTimeTAV;

    @NonNull
    public final Barrier toursFlightDetailsHeaderBarrierR;

    @NonNull
    public final TextAtomView toursFlightDetailsSubtitleTAV;

    @NonNull
    public final TextAtomView toursFlightDetailsToAirportTAV;

    @NonNull
    public final TextAtomView toursFlightDetailsToCityTAV;

    @NonNull
    public final TextAtomView toursFlightDetailsToDateTAV;

    @NonNull
    public final TextAtomView toursFlightDetailsToTimeTAV;

    private ViewToursFlightDetailsStageBinding(@NonNull View view, @NonNull TextAtomView textAtomView, @NonNull RecyclerView recyclerView, @NonNull ShapeableImageView shapeableImageView, @NonNull Barrier barrier, @NonNull TextAtomView textAtomView2, @NonNull TextAtomView textAtomView3, @NonNull TextAtomView textAtomView4, @NonNull TextAtomView textAtomView5, @NonNull Barrier barrier2, @NonNull TextAtomView textAtomView6, @NonNull TextAtomView textAtomView7, @NonNull TextAtomView textAtomView8, @NonNull TextAtomView textAtomView9, @NonNull TextAtomView textAtomView10) {
        this.rootView = view;
        this.toursFlightDetailsAirlineTAV = textAtomView;
        this.toursFlightDetailsBadgesRv = recyclerView;
        this.toursFlightDetailsCompanySIV = shapeableImageView;
        this.toursFlightDetailsDateBarrierR = barrier;
        this.toursFlightDetailsFromAirportTAV = textAtomView2;
        this.toursFlightDetailsFromCityTAV = textAtomView3;
        this.toursFlightDetailsFromDateTAV = textAtomView4;
        this.toursFlightDetailsFromTimeTAV = textAtomView5;
        this.toursFlightDetailsHeaderBarrierR = barrier2;
        this.toursFlightDetailsSubtitleTAV = textAtomView6;
        this.toursFlightDetailsToAirportTAV = textAtomView7;
        this.toursFlightDetailsToCityTAV = textAtomView8;
        this.toursFlightDetailsToDateTAV = textAtomView9;
        this.toursFlightDetailsToTimeTAV = textAtomView10;
    }

    @NonNull
    public static ViewToursFlightDetailsStageBinding bind(@NonNull View view) {
        int i11 = R$id.toursFlightDetailsAirlineTAV;
        TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
        if (textAtomView != null) {
            i11 = R$id.toursFlightDetailsBadgesRv;
            RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
            if (recyclerView != null) {
                i11 = R$id.toursFlightDetailsCompanySIV;
                ShapeableImageView shapeableImageView = (ShapeableImageView) C2548q.d(i11, view);
                if (shapeableImageView != null) {
                    i11 = R$id.toursFlightDetailsDateBarrierR;
                    Barrier barrier = (Barrier) C2548q.d(i11, view);
                    if (barrier != null) {
                        i11 = R$id.toursFlightDetailsFromAirportTAV;
                        TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
                        if (textAtomView2 != null) {
                            i11 = R$id.toursFlightDetailsFromCityTAV;
                            TextAtomView textAtomView3 = (TextAtomView) C2548q.d(i11, view);
                            if (textAtomView3 != null) {
                                i11 = R$id.toursFlightDetailsFromDateTAV;
                                TextAtomView textAtomView4 = (TextAtomView) C2548q.d(i11, view);
                                if (textAtomView4 != null) {
                                    i11 = R$id.toursFlightDetailsFromTimeTAV;
                                    TextAtomView textAtomView5 = (TextAtomView) C2548q.d(i11, view);
                                    if (textAtomView5 != null) {
                                        i11 = R$id.toursFlightDetailsHeaderBarrierR;
                                        Barrier barrier2 = (Barrier) C2548q.d(i11, view);
                                        if (barrier2 != null) {
                                            i11 = R$id.toursFlightDetailsSubtitleTAV;
                                            TextAtomView textAtomView6 = (TextAtomView) C2548q.d(i11, view);
                                            if (textAtomView6 != null) {
                                                i11 = R$id.toursFlightDetailsToAirportTAV;
                                                TextAtomView textAtomView7 = (TextAtomView) C2548q.d(i11, view);
                                                if (textAtomView7 != null) {
                                                    i11 = R$id.toursFlightDetailsToCityTAV;
                                                    TextAtomView textAtomView8 = (TextAtomView) C2548q.d(i11, view);
                                                    if (textAtomView8 != null) {
                                                        i11 = R$id.toursFlightDetailsToDateTAV;
                                                        TextAtomView textAtomView9 = (TextAtomView) C2548q.d(i11, view);
                                                        if (textAtomView9 != null) {
                                                            i11 = R$id.toursFlightDetailsToTimeTAV;
                                                            TextAtomView textAtomView10 = (TextAtomView) C2548q.d(i11, view);
                                                            if (textAtomView10 != null) {
                                                                return new ViewToursFlightDetailsStageBinding(view, textAtomView, recyclerView, shapeableImageView, barrier, textAtomView2, textAtomView3, textAtomView4, textAtomView5, barrier2, textAtomView6, textAtomView7, textAtomView8, textAtomView9, textAtomView10);
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
    public static ViewToursFlightDetailsStageBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.view_tours_flight_details_stage, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public View getConstraintLayout() {
        return this.rootView;
    }
}
