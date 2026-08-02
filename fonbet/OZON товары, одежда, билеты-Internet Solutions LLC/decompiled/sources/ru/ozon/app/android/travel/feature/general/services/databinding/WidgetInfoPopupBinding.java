package ru.ozon.app.android.travel.feature.general.services.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.travel.feature.general.services.R$id;
import ru.ozon.app.android.travel.molecules.view.textInfoCells.TextInfoCellsView;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;

/* loaded from: classes4.dex */
public final class WidgetInfoPopupBinding implements a {

    @NonNull
    public final View infoPopupBackgroundView;

    @NonNull
    public final VerticalAtomsLayout infoPopupButtonsVAL;

    @NonNull
    public final VerticalAtomsLayout infoPopupCellsVAL;

    @NonNull
    public final AppCompatImageView infoPopupImageIV;

    @NonNull
    public final TextInfoCellsView infoPopupInfoCellListTICV;

    @NonNull
    private final ConstraintLayout rootView;

    private WidgetInfoPopupBinding(@NonNull ConstraintLayout constraintLayout, @NonNull View view, @NonNull VerticalAtomsLayout verticalAtomsLayout, @NonNull VerticalAtomsLayout verticalAtomsLayout2, @NonNull AppCompatImageView appCompatImageView, @NonNull TextInfoCellsView textInfoCellsView) {
        this.rootView = constraintLayout;
        this.infoPopupBackgroundView = view;
        this.infoPopupButtonsVAL = verticalAtomsLayout;
        this.infoPopupCellsVAL = verticalAtomsLayout2;
        this.infoPopupImageIV = appCompatImageView;
        this.infoPopupInfoCellListTICV = textInfoCellsView;
    }

    @NonNull
    public static WidgetInfoPopupBinding bind(@NonNull View view) {
        int i11 = R$id.infoPopupBackgroundView;
        View d11 = C2548q.d(i11, view);
        if (d11 != null) {
            i11 = R$id.infoPopupButtonsVAL;
            VerticalAtomsLayout verticalAtomsLayout = (VerticalAtomsLayout) C2548q.d(i11, view);
            if (verticalAtomsLayout != null) {
                i11 = R$id.infoPopupCellsVAL;
                VerticalAtomsLayout verticalAtomsLayout2 = (VerticalAtomsLayout) C2548q.d(i11, view);
                if (verticalAtomsLayout2 != null) {
                    i11 = R$id.infoPopupImageIV;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(i11, view);
                    if (appCompatImageView != null) {
                        i11 = R$id.infoPopupInfoCellListTICV;
                        TextInfoCellsView textInfoCellsView = (TextInfoCellsView) C2548q.d(i11, view);
                        if (textInfoCellsView != null) {
                            return new WidgetInfoPopupBinding((ConstraintLayout) view, d11, verticalAtomsLayout, verticalAtomsLayout2, appCompatImageView, textInfoCellsView);
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
