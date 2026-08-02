package ru.ozon.app.android.travel.feature.tours.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.atoms.v3.molecules.DisclaimerContainer;
import ru.ozon.app.android.travel.feature.tours.R$id;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;

/* loaded from: classes4.dex */
public final class WidgetTouristCountSelectorBinding implements a {

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final LinearLayout touristAgeSelectorContainerLL;

    @NonNull
    public final DisclaimerContainer touristCountSelectorAnnotation;

    @NonNull
    public final LargeButtonView touristCountSelectorButtonLbv;

    @NonNull
    public final LinearLayout touristCountSelectorContainerLL;

    @NonNull
    public final LinearLayout touristCountSelectorRv;

    private WidgetTouristCountSelectorBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull DisclaimerContainer disclaimerContainer, @NonNull LargeButtonView largeButtonView, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4) {
        this.rootView = linearLayout;
        this.touristAgeSelectorContainerLL = linearLayout2;
        this.touristCountSelectorAnnotation = disclaimerContainer;
        this.touristCountSelectorButtonLbv = largeButtonView;
        this.touristCountSelectorContainerLL = linearLayout3;
        this.touristCountSelectorRv = linearLayout4;
    }

    @NonNull
    public static WidgetTouristCountSelectorBinding bind(@NonNull View view) {
        int i11 = R$id.touristAgeSelectorContainerLL;
        LinearLayout linearLayout = (LinearLayout) C2548q.d(i11, view);
        if (linearLayout != null) {
            i11 = R$id.touristCountSelectorAnnotation;
            DisclaimerContainer disclaimerContainer = (DisclaimerContainer) C2548q.d(i11, view);
            if (disclaimerContainer != null) {
                i11 = R$id.touristCountSelectorButtonLbv;
                LargeButtonView largeButtonView = (LargeButtonView) C2548q.d(i11, view);
                if (largeButtonView != null) {
                    i11 = R$id.touristCountSelectorContainerLL;
                    LinearLayout linearLayout2 = (LinearLayout) C2548q.d(i11, view);
                    if (linearLayout2 != null) {
                        LinearLayout linearLayout3 = (LinearLayout) view;
                        return new WidgetTouristCountSelectorBinding(linearLayout3, linearLayout, disclaimerContainer, largeButtonView, linearLayout2, linearLayout3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public LinearLayout getConstraintLayout() {
        return this.rootView;
    }
}
