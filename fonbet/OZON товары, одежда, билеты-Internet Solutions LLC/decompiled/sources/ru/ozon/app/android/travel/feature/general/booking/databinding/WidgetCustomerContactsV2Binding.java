package ru.ozon.app.android.travel.feature.general.booking.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.travel.feature.general.booking.R$id;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes3.dex */
public final class WidgetCustomerContactsV2Binding implements a {

    @NonNull
    public final CellView contactsFormCellInfo;

    @NonNull
    public final RecyclerView contactsFormInputsRv;

    @NonNull
    public final TextAtomView contactsFormSubtitleTav;

    @NonNull
    public final TextAtomView contactsFormTitleTav;

    @NonNull
    private final LinearLayout rootView;

    private WidgetCustomerContactsV2Binding(@NonNull LinearLayout linearLayout, @NonNull CellView cellView, @NonNull RecyclerView recyclerView, @NonNull TextAtomView textAtomView, @NonNull TextAtomView textAtomView2) {
        this.rootView = linearLayout;
        this.contactsFormCellInfo = cellView;
        this.contactsFormInputsRv = recyclerView;
        this.contactsFormSubtitleTav = textAtomView;
        this.contactsFormTitleTav = textAtomView2;
    }

    @NonNull
    public static WidgetCustomerContactsV2Binding bind(@NonNull View view) {
        int i11 = R$id.contactsFormCellInfo;
        CellView cellView = (CellView) C2548q.d(i11, view);
        if (cellView != null) {
            i11 = R$id.contactsFormInputsRv;
            RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
            if (recyclerView != null) {
                i11 = R$id.contactsFormSubtitleTav;
                TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
                if (textAtomView != null) {
                    i11 = R$id.contactsFormTitleTav;
                    TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
                    if (textAtomView2 != null) {
                        return new WidgetCustomerContactsV2Binding((LinearLayout) view, cellView, recyclerView, textAtomView, textAtomView2);
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
