package ru.ozon.app.android.fresh.feature.b2b.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.fresh.feature.b2b.R$id;
import ru.ozon.app.android.fresh.feature.b2b.R$layout;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.cell.text.TextFieldCellView;

/* loaded from: classes12.dex */
public final class WidgetReconciliationActsDeclinerTextFieldItemBinding implements a {

    @NonNull
    public final TextFieldCellView inputField;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextAtomV2View title;

    private WidgetReconciliationActsDeclinerTextFieldItemBinding(@NonNull LinearLayout linearLayout, @NonNull TextFieldCellView textFieldCellView, @NonNull TextAtomV2View textAtomV2View) {
        this.rootView = linearLayout;
        this.inputField = textFieldCellView;
        this.title = textAtomV2View;
    }

    @NonNull
    public static WidgetReconciliationActsDeclinerTextFieldItemBinding bind(@NonNull View view) {
        int i11 = R$id.inputField;
        TextFieldCellView textFieldCellView = (TextFieldCellView) C2548q.d(i11, view);
        if (textFieldCellView != null) {
            i11 = R$id.title;
            TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
            if (textAtomV2View != null) {
                return new WidgetReconciliationActsDeclinerTextFieldItemBinding((LinearLayout) view, textFieldCellView, textAtomV2View);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static WidgetReconciliationActsDeclinerTextFieldItemBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.widget_reconciliation_acts_decliner_text_field_item, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public LinearLayout getConstraintLayout() {
        return this.rootView;
    }
}
