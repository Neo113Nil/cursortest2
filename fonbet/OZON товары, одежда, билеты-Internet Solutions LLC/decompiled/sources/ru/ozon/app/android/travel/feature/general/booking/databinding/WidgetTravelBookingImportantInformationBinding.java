package ru.ozon.app.android.travel.feature.general.booking.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.travel.feature.general.booking.R$id;

/* loaded from: classes3.dex */
public final class WidgetTravelBookingImportantInformationBinding implements a {

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final AppCompatTextView travelImportantInfoDescriptionTextView;

    @NonNull
    public final AppCompatTextView travelImportantInfoTitleTextView;

    private WidgetTravelBookingImportantInformationBinding(@NonNull ConstraintLayout constraintLayout, @NonNull AppCompatTextView appCompatTextView, @NonNull AppCompatTextView appCompatTextView2) {
        this.rootView = constraintLayout;
        this.travelImportantInfoDescriptionTextView = appCompatTextView;
        this.travelImportantInfoTitleTextView = appCompatTextView2;
    }

    @NonNull
    public static WidgetTravelBookingImportantInformationBinding bind(@NonNull View view) {
        int i11 = R$id.travelImportantInfoDescriptionTextView;
        AppCompatTextView appCompatTextView = (AppCompatTextView) C2548q.d(i11, view);
        if (appCompatTextView != null) {
            i11 = R$id.travelImportantInfoTitleTextView;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) C2548q.d(i11, view);
            if (appCompatTextView2 != null) {
                return new WidgetTravelBookingImportantInformationBinding((ConstraintLayout) view, appCompatTextView, appCompatTextView2);
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
