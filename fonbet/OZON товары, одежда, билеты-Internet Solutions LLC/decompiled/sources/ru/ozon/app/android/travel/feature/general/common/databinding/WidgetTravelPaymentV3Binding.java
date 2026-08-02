package ru.ozon.app.android.travel.feature.general.common.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.travel.feature.general.common.R$id;
import ru.ozon.app.android.travel.molecules.view.disclaimer.TravelDisclaimerView;
import ru.ozon.uni.android.uikit.view.atoms.buttons.borderless.SmallBorderlessButtonView;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;

/* loaded from: classes3.dex */
public final class WidgetTravelPaymentV3Binding implements a {

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TravelDisclaimerView travelPaymentV3AnnotationDC;

    @NonNull
    public final LargeButtonView travelPaymentV3ButtonLBV;

    @NonNull
    public final SmallBorderlessButtonView travelPaymentV3MilesButtonSBV;

    @NonNull
    public final TextAtomView travelPaymentV3OptionsTitleTV;

    @NonNull
    public final VerticalAtomsLayout travelPaymentV3PaymentOptionsVAL;

    @NonNull
    public final RecyclerView travelPaymentV3PaymentsRV;

    @NonNull
    public final TextAtomView travelPaymentV3TitleTV;

    private WidgetTravelPaymentV3Binding(@NonNull ConstraintLayout constraintLayout, @NonNull TravelDisclaimerView travelDisclaimerView, @NonNull LargeButtonView largeButtonView, @NonNull SmallBorderlessButtonView smallBorderlessButtonView, @NonNull TextAtomView textAtomView, @NonNull VerticalAtomsLayout verticalAtomsLayout, @NonNull RecyclerView recyclerView, @NonNull TextAtomView textAtomView2) {
        this.rootView = constraintLayout;
        this.travelPaymentV3AnnotationDC = travelDisclaimerView;
        this.travelPaymentV3ButtonLBV = largeButtonView;
        this.travelPaymentV3MilesButtonSBV = smallBorderlessButtonView;
        this.travelPaymentV3OptionsTitleTV = textAtomView;
        this.travelPaymentV3PaymentOptionsVAL = verticalAtomsLayout;
        this.travelPaymentV3PaymentsRV = recyclerView;
        this.travelPaymentV3TitleTV = textAtomView2;
    }

    @NonNull
    public static WidgetTravelPaymentV3Binding bind(@NonNull View view) {
        int i11 = R$id.travelPaymentV3AnnotationDC;
        TravelDisclaimerView travelDisclaimerView = (TravelDisclaimerView) C2548q.d(i11, view);
        if (travelDisclaimerView != null) {
            i11 = R$id.travelPaymentV3ButtonLBV;
            LargeButtonView largeButtonView = (LargeButtonView) C2548q.d(i11, view);
            if (largeButtonView != null) {
                i11 = R$id.travelPaymentV3MilesButtonSBV;
                SmallBorderlessButtonView smallBorderlessButtonView = (SmallBorderlessButtonView) C2548q.d(i11, view);
                if (smallBorderlessButtonView != null) {
                    i11 = R$id.travelPaymentV3OptionsTitleTV;
                    TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
                    if (textAtomView != null) {
                        i11 = R$id.travelPaymentV3PaymentOptionsVAL;
                        VerticalAtomsLayout verticalAtomsLayout = (VerticalAtomsLayout) C2548q.d(i11, view);
                        if (verticalAtomsLayout != null) {
                            i11 = R$id.travelPaymentV3PaymentsRV;
                            RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
                            if (recyclerView != null) {
                                i11 = R$id.travelPaymentV3TitleTV;
                                TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
                                if (textAtomView2 != null) {
                                    return new WidgetTravelPaymentV3Binding((ConstraintLayout) view, travelDisclaimerView, largeButtonView, smallBorderlessButtonView, textAtomView, verticalAtomsLayout, recyclerView, textAtomView2);
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
