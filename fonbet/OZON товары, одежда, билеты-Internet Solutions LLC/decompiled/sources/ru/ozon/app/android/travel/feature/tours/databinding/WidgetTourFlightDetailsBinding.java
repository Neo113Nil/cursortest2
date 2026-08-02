package ru.ozon.app.android.travel.feature.tours.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.travel.feature.tours.R$id;
import ru.ozon.app.android.travel.feature.tours.widgets.toursFlightDetails.view.ToursFlightDetailsStageView;
import ru.ozon.app.android.travel.feature.tours.widgets.toursFlightDetails.view.ToursFlightDetailsTransferView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes4.dex */
public final class WidgetTourFlightDetailsBinding implements a {

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextAtomView toursFlightDetailsCaptionTAV;

    @NonNull
    public final TextAtomView toursFlightDetailsHeaderTimeTAV;

    @NonNull
    public final TextAtomView toursFlightDetailsHeaderTitleTAV;

    @NonNull
    public final ConstraintLayout toursFlightDetailsRootCL;

    @NonNull
    public final ToursFlightDetailsStageView toursFlightDetailsStageTFDSV;

    @NonNull
    public final ToursFlightDetailsTransferView toursFlightDetailsTransferTFDSV;

    private WidgetTourFlightDetailsBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TextAtomView textAtomView, @NonNull TextAtomView textAtomView2, @NonNull TextAtomView textAtomView3, @NonNull ConstraintLayout constraintLayout2, @NonNull ToursFlightDetailsStageView toursFlightDetailsStageView, @NonNull ToursFlightDetailsTransferView toursFlightDetailsTransferView) {
        this.rootView = constraintLayout;
        this.toursFlightDetailsCaptionTAV = textAtomView;
        this.toursFlightDetailsHeaderTimeTAV = textAtomView2;
        this.toursFlightDetailsHeaderTitleTAV = textAtomView3;
        this.toursFlightDetailsRootCL = constraintLayout2;
        this.toursFlightDetailsStageTFDSV = toursFlightDetailsStageView;
        this.toursFlightDetailsTransferTFDSV = toursFlightDetailsTransferView;
    }

    @NonNull
    public static WidgetTourFlightDetailsBinding bind(@NonNull View view) {
        int i11 = R$id.toursFlightDetailsCaptionTAV;
        TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
        if (textAtomView != null) {
            i11 = R$id.toursFlightDetailsHeaderTimeTAV;
            TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
            if (textAtomView2 != null) {
                i11 = R$id.toursFlightDetailsHeaderTitleTAV;
                TextAtomView textAtomView3 = (TextAtomView) C2548q.d(i11, view);
                if (textAtomView3 != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                    i11 = R$id.toursFlightDetailsStageTFDSV;
                    ToursFlightDetailsStageView toursFlightDetailsStageView = (ToursFlightDetailsStageView) C2548q.d(i11, view);
                    if (toursFlightDetailsStageView != null) {
                        i11 = R$id.toursFlightDetailsTransferTFDSV;
                        ToursFlightDetailsTransferView toursFlightDetailsTransferView = (ToursFlightDetailsTransferView) C2548q.d(i11, view);
                        if (toursFlightDetailsTransferView != null) {
                            return new WidgetTourFlightDetailsBinding(constraintLayout, textAtomView, textAtomView2, textAtomView3, constraintLayout, toursFlightDetailsStageView, toursFlightDetailsTransferView);
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
