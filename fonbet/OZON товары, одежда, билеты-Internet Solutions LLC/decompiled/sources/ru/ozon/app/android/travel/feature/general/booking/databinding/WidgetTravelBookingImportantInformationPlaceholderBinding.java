package ru.ozon.app.android.travel.feature.general.booking.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import ru.ozon.app.android.travel.feature.general.booking.R$id;
import ru.ozon.app.android.uikit.view.atoms.cells.subtitled.CellWithSubtitle24IconView;

/* loaded from: classes3.dex */
public final class WidgetTravelBookingImportantInformationPlaceholderBinding implements a {

    @NonNull
    public final CellWithSubtitle24IconView bookingImportantInfoCell;

    @NonNull
    private final CardView rootView;

    private WidgetTravelBookingImportantInformationPlaceholderBinding(@NonNull CardView cardView, @NonNull CellWithSubtitle24IconView cellWithSubtitle24IconView) {
        this.rootView = cardView;
        this.bookingImportantInfoCell = cellWithSubtitle24IconView;
    }

    @NonNull
    public static WidgetTravelBookingImportantInformationPlaceholderBinding bind(@NonNull View view) {
        int i11 = R$id.bookingImportantInfoCell;
        CellWithSubtitle24IconView cellWithSubtitle24IconView = (CellWithSubtitle24IconView) C2548q.d(i11, view);
        if (cellWithSubtitle24IconView != null) {
            return new WidgetTravelBookingImportantInformationPlaceholderBinding((CardView) view, cellWithSubtitle24IconView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public CardView getRoot() {
        return this.rootView;
    }
}
