package ru.ozon.app.android.travel.feature.b2b.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.atoms.v3.molecules.DisclaimerContainer;
import ru.ozon.app.android.travel.feature.b2b.R$id;
import ru.ozon.app.android.uikit.view.atoms.cells.subtitled.CellWithSubtitleToggleView;

/* loaded from: classes12.dex */
public final class WidgetTravelDocumentsToEmailHeaderBinding implements a {

    @NonNull
    public final DisclaimerContainer documentsToEmailHeaderAnnotation;

    @NonNull
    public final CellWithSubtitleToggleView documentsToEmailHeaderEmailToggle;

    @NonNull
    private final LinearLayout rootView;

    private WidgetTravelDocumentsToEmailHeaderBinding(@NonNull LinearLayout linearLayout, @NonNull DisclaimerContainer disclaimerContainer, @NonNull CellWithSubtitleToggleView cellWithSubtitleToggleView) {
        this.rootView = linearLayout;
        this.documentsToEmailHeaderAnnotation = disclaimerContainer;
        this.documentsToEmailHeaderEmailToggle = cellWithSubtitleToggleView;
    }

    @NonNull
    public static WidgetTravelDocumentsToEmailHeaderBinding bind(@NonNull View view) {
        int i11 = R$id.documentsToEmailHeaderAnnotation;
        DisclaimerContainer disclaimerContainer = (DisclaimerContainer) C2548q.d(i11, view);
        if (disclaimerContainer != null) {
            i11 = R$id.documentsToEmailHeaderEmailToggle;
            CellWithSubtitleToggleView cellWithSubtitleToggleView = (CellWithSubtitleToggleView) C2548q.d(i11, view);
            if (cellWithSubtitleToggleView != null) {
                return new WidgetTravelDocumentsToEmailHeaderBinding((LinearLayout) view, disclaimerContainer, cellWithSubtitleToggleView);
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
