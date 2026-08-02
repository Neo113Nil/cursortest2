package ru.ozon.app.android.ads.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.ads.R$id;
import ru.ozon.app.android.uikit.view.atoms.cells.subtitled.CellWithSubtitle24IconView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes11.dex */
public final class WidgetAdvInfoBinding implements a {

    @NonNull
    public final CellWithSubtitle24IconView advAboutInfoAdvertiserRegularCellView;

    @NonNull
    public final CellWithSubtitle24IconView advAboutInfoCopyLinkCellView;

    @NonNull
    public final TextAtomView advAboutInfoDescriptionTV;

    @NonNull
    public final TextAtomView advAboutInfoTitleTV;

    @NonNull
    private final ConstraintLayout rootView;

    private WidgetAdvInfoBinding(@NonNull ConstraintLayout constraintLayout, @NonNull CellWithSubtitle24IconView cellWithSubtitle24IconView, @NonNull CellWithSubtitle24IconView cellWithSubtitle24IconView2, @NonNull TextAtomView textAtomView, @NonNull TextAtomView textAtomView2) {
        this.rootView = constraintLayout;
        this.advAboutInfoAdvertiserRegularCellView = cellWithSubtitle24IconView;
        this.advAboutInfoCopyLinkCellView = cellWithSubtitle24IconView2;
        this.advAboutInfoDescriptionTV = textAtomView;
        this.advAboutInfoTitleTV = textAtomView2;
    }

    @NonNull
    public static WidgetAdvInfoBinding bind(@NonNull View view) {
        int i11 = R$id.advAboutInfoAdvertiserRegularCellView;
        CellWithSubtitle24IconView cellWithSubtitle24IconView = (CellWithSubtitle24IconView) C2548q.d(i11, view);
        if (cellWithSubtitle24IconView != null) {
            i11 = R$id.advAboutInfoCopyLinkCellView;
            CellWithSubtitle24IconView cellWithSubtitle24IconView2 = (CellWithSubtitle24IconView) C2548q.d(i11, view);
            if (cellWithSubtitle24IconView2 != null) {
                i11 = R$id.advAboutInfoDescriptionTV;
                TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
                if (textAtomView != null) {
                    i11 = R$id.advAboutInfoTitleTV;
                    TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
                    if (textAtomView2 != null) {
                        return new WidgetAdvInfoBinding((ConstraintLayout) view, cellWithSubtitle24IconView, cellWithSubtitle24IconView2, textAtomView, textAtomView2);
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
