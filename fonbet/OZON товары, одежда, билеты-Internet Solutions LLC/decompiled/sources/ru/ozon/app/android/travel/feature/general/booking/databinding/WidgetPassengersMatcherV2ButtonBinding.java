package ru.ozon.app.android.travel.feature.general.booking.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.travel.feature.general.booking.R$id;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes3.dex */
public final class WidgetPassengersMatcherV2ButtonBinding implements a {

    @NonNull
    public final TextAtomView passengersMatcherV2AgreementTAV;

    @NonNull
    public final LargeButtonView passengersMatcherV2Button;

    @NonNull
    public final LinearLayout passengersMatcherV2LL;

    @NonNull
    private final LinearLayout rootView;

    private WidgetPassengersMatcherV2ButtonBinding(@NonNull LinearLayout linearLayout, @NonNull TextAtomView textAtomView, @NonNull LargeButtonView largeButtonView, @NonNull LinearLayout linearLayout2) {
        this.rootView = linearLayout;
        this.passengersMatcherV2AgreementTAV = textAtomView;
        this.passengersMatcherV2Button = largeButtonView;
        this.passengersMatcherV2LL = linearLayout2;
    }

    @NonNull
    public static WidgetPassengersMatcherV2ButtonBinding bind(@NonNull View view) {
        int i11 = R$id.passengersMatcherV2AgreementTAV;
        TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
        if (textAtomView != null) {
            i11 = R$id.passengersMatcherV2Button;
            LargeButtonView largeButtonView = (LargeButtonView) C2548q.d(i11, view);
            if (largeButtonView != null) {
                LinearLayout linearLayout = (LinearLayout) view;
                return new WidgetPassengersMatcherV2ButtonBinding(linearLayout, textAtomView, largeButtonView, linearLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
