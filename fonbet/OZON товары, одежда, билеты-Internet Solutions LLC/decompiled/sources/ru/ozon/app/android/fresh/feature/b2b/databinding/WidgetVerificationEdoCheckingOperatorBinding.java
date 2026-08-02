package ru.ozon.app.android.fresh.feature.b2b.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.fresh.feature.b2b.R$id;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;

/* loaded from: classes12.dex */
public final class WidgetVerificationEdoCheckingOperatorBinding implements a {

    @NonNull
    public final ButtonV3View button;

    @NonNull
    public final CellView documentCell;

    @NonNull
    public final CellView fnsParticipantIdCell;

    @NonNull
    public final TextAtomV2View name;

    @NonNull
    private final LinearLayout rootView;

    private WidgetVerificationEdoCheckingOperatorBinding(@NonNull LinearLayout linearLayout, @NonNull ButtonV3View buttonV3View, @NonNull CellView cellView, @NonNull CellView cellView2, @NonNull TextAtomV2View textAtomV2View) {
        this.rootView = linearLayout;
        this.button = buttonV3View;
        this.documentCell = cellView;
        this.fnsParticipantIdCell = cellView2;
        this.name = textAtomV2View;
    }

    @NonNull
    public static WidgetVerificationEdoCheckingOperatorBinding bind(@NonNull View view) {
        int i11 = R$id.button;
        ButtonV3View buttonV3View = (ButtonV3View) C2548q.d(i11, view);
        if (buttonV3View != null) {
            i11 = R$id.documentCell;
            CellView cellView = (CellView) C2548q.d(i11, view);
            if (cellView != null) {
                i11 = R$id.fnsParticipantIdCell;
                CellView cellView2 = (CellView) C2548q.d(i11, view);
                if (cellView2 != null) {
                    i11 = R$id.name;
                    TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                    if (textAtomV2View != null) {
                        return new WidgetVerificationEdoCheckingOperatorBinding((LinearLayout) view, buttonV3View, cellView, cellView2, textAtomV2View);
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
