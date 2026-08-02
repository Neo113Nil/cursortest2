package ru.ozon.app.android.fresh.feature.b2b.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.fresh.feature.b2b.R$id;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.cell.text.TextFieldCellView;
import ru.ozon.uni.android.controls.button.ButtonView;

/* loaded from: classes12.dex */
public final class WidgetLegalDetailsEditorBinding implements a {

    @NonNull
    public final TextFieldCellView addressInputLayout;

    @NonNull
    public final ConstraintLayout attachFieldBlock;

    @NonNull
    public final TextAtomV2View attachFieldTitle;

    @NonNull
    public final RecyclerView fileFieldRecyclerView;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextAtomV2View sendPolicyText;

    @NonNull
    public final ButtonView submitButton;

    @NonNull
    public final LinearLayout textFieldBlock;

    @NonNull
    public final TextAtomV2View textFieldTitle;

    private WidgetLegalDetailsEditorBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TextFieldCellView textFieldCellView, @NonNull ConstraintLayout constraintLayout2, @NonNull TextAtomV2View textAtomV2View, @NonNull RecyclerView recyclerView, @NonNull TextAtomV2View textAtomV2View2, @NonNull ButtonView buttonView, @NonNull LinearLayout linearLayout, @NonNull TextAtomV2View textAtomV2View3) {
        this.rootView = constraintLayout;
        this.addressInputLayout = textFieldCellView;
        this.attachFieldBlock = constraintLayout2;
        this.attachFieldTitle = textAtomV2View;
        this.fileFieldRecyclerView = recyclerView;
        this.sendPolicyText = textAtomV2View2;
        this.submitButton = buttonView;
        this.textFieldBlock = linearLayout;
        this.textFieldTitle = textAtomV2View3;
    }

    @NonNull
    public static WidgetLegalDetailsEditorBinding bind(@NonNull View view) {
        int i11 = R$id.addressInputLayout;
        TextFieldCellView textFieldCellView = (TextFieldCellView) C2548q.d(i11, view);
        if (textFieldCellView != null) {
            i11 = R$id.attachFieldBlock;
            ConstraintLayout constraintLayout = (ConstraintLayout) C2548q.d(i11, view);
            if (constraintLayout != null) {
                i11 = R$id.attachFieldTitle;
                TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                if (textAtomV2View != null) {
                    i11 = R$id.fileFieldRecyclerView;
                    RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
                    if (recyclerView != null) {
                        i11 = R$id.sendPolicyText;
                        TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(i11, view);
                        if (textAtomV2View2 != null) {
                            i11 = R$id.submitButton;
                            ButtonView buttonView = (ButtonView) C2548q.d(i11, view);
                            if (buttonView != null) {
                                i11 = R$id.textFieldBlock;
                                LinearLayout linearLayout = (LinearLayout) C2548q.d(i11, view);
                                if (linearLayout != null) {
                                    i11 = R$id.textFieldTitle;
                                    TextAtomV2View textAtomV2View3 = (TextAtomV2View) C2548q.d(i11, view);
                                    if (textAtomV2View3 != null) {
                                        return new WidgetLegalDetailsEditorBinding((ConstraintLayout) view, textFieldCellView, constraintLayout, textAtomV2View, recyclerView, textAtomV2View2, buttonView, linearLayout, textAtomV2View3);
                                    }
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
