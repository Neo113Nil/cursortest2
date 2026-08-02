package ru.ozon.app.android.travel.feature.tours.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.flexbox.FlexboxLayout;
import ru.ozon.app.android.travel.feature.tours.R$id;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;

/* loaded from: classes4.dex */
public final class WidgetToursHotelInfoCardBinding implements a {

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final VerticalAtomsLayout toursHotelInfoCellLayout;

    @NonNull
    public final AppCompatTextView toursHotelInfoDescriptionTextView;

    @NonNull
    public final FlexboxLayout toursHotelInfoFeaturesLayout;

    @NonNull
    public final LinearLayout toursHotelInfoRoot;

    @NonNull
    public final TextAtomView toursHotelInfoTitleTextView;

    private WidgetToursHotelInfoCardBinding(@NonNull LinearLayout linearLayout, @NonNull VerticalAtomsLayout verticalAtomsLayout, @NonNull AppCompatTextView appCompatTextView, @NonNull FlexboxLayout flexboxLayout, @NonNull LinearLayout linearLayout2, @NonNull TextAtomView textAtomView) {
        this.rootView = linearLayout;
        this.toursHotelInfoCellLayout = verticalAtomsLayout;
        this.toursHotelInfoDescriptionTextView = appCompatTextView;
        this.toursHotelInfoFeaturesLayout = flexboxLayout;
        this.toursHotelInfoRoot = linearLayout2;
        this.toursHotelInfoTitleTextView = textAtomView;
    }

    @NonNull
    public static WidgetToursHotelInfoCardBinding bind(@NonNull View view) {
        int i11 = R$id.toursHotelInfoCellLayout;
        VerticalAtomsLayout verticalAtomsLayout = (VerticalAtomsLayout) C2548q.d(i11, view);
        if (verticalAtomsLayout != null) {
            i11 = R$id.toursHotelInfoDescriptionTextView;
            AppCompatTextView appCompatTextView = (AppCompatTextView) C2548q.d(i11, view);
            if (appCompatTextView != null) {
                i11 = R$id.toursHotelInfoFeaturesLayout;
                FlexboxLayout flexboxLayout = (FlexboxLayout) C2548q.d(i11, view);
                if (flexboxLayout != null) {
                    LinearLayout linearLayout = (LinearLayout) view;
                    i11 = R$id.toursHotelInfoTitleTextView;
                    TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
                    if (textAtomView != null) {
                        return new WidgetToursHotelInfoCardBinding(linearLayout, verticalAtomsLayout, appCompatTextView, flexboxLayout, linearLayout, textAtomView);
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
