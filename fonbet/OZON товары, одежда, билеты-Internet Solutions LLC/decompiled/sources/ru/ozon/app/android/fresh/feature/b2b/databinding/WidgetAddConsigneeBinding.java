package ru.ozon.app.android.fresh.feature.b2b.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.fresh.feature.b2b.R$id;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.cell.text.TextFieldCellView;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;

/* loaded from: classes12.dex */
public final class WidgetAddConsigneeBinding implements a {

    @NonNull
    public final View addressClickableArea;

    @NonNull
    public final TextFieldCellView addressInput;

    @NonNull
    public final TextFieldCellView branchNameInput;

    @NonNull
    public final ButtonV3View button;

    @NonNull
    public final TextAtomV2View description;

    @NonNull
    public final TextFieldCellView kppInput;

    @NonNull
    public final RecyclerView requisitesCellsList;

    @NonNull
    private final ConstraintLayout rootView;

    private WidgetAddConsigneeBinding(@NonNull ConstraintLayout constraintLayout, @NonNull View view, @NonNull TextFieldCellView textFieldCellView, @NonNull TextFieldCellView textFieldCellView2, @NonNull ButtonV3View buttonV3View, @NonNull TextAtomV2View textAtomV2View, @NonNull TextFieldCellView textFieldCellView3, @NonNull RecyclerView recyclerView) {
        this.rootView = constraintLayout;
        this.addressClickableArea = view;
        this.addressInput = textFieldCellView;
        this.branchNameInput = textFieldCellView2;
        this.button = buttonV3View;
        this.description = textAtomV2View;
        this.kppInput = textFieldCellView3;
        this.requisitesCellsList = recyclerView;
    }

    @NonNull
    public static WidgetAddConsigneeBinding bind(@NonNull View view) {
        int i11 = R$id.addressClickableArea;
        View d11 = C2548q.d(i11, view);
        if (d11 != null) {
            i11 = R$id.addressInput;
            TextFieldCellView textFieldCellView = (TextFieldCellView) C2548q.d(i11, view);
            if (textFieldCellView != null) {
                i11 = R$id.branchNameInput;
                TextFieldCellView textFieldCellView2 = (TextFieldCellView) C2548q.d(i11, view);
                if (textFieldCellView2 != null) {
                    i11 = R$id.button;
                    ButtonV3View buttonV3View = (ButtonV3View) C2548q.d(i11, view);
                    if (buttonV3View != null) {
                        i11 = R$id.description;
                        TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                        if (textAtomV2View != null) {
                            i11 = R$id.kppInput;
                            TextFieldCellView textFieldCellView3 = (TextFieldCellView) C2548q.d(i11, view);
                            if (textFieldCellView3 != null) {
                                i11 = R$id.requisitesCellsList;
                                RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
                                if (recyclerView != null) {
                                    return new WidgetAddConsigneeBinding((ConstraintLayout) view, d11, textFieldCellView, textFieldCellView2, buttonV3View, textAtomV2View, textFieldCellView3, recyclerView);
                                }
                            }
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
