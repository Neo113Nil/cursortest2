package ru.ozon.app.android.dialog.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import ru.ozon.app.android.dialog.R$id;
import ru.ozon.app.android.dialog.R$layout;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.button.ButtonView;

/* loaded from: classes11.dex */
public final class SheetViewDialogBinding implements a {

    @NonNull
    public final ButtonView cancelButton;

    @NonNull
    public final Guideline endGuideline;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final Guideline startGuideline;

    @NonNull
    public final ButtonView submitButton;

    @NonNull
    public final TextAtomV2View subtitleTextAtomView;

    @NonNull
    public final TextAtomV2View titleTextAtomView;

    private SheetViewDialogBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ButtonView buttonView, @NonNull Guideline guideline, @NonNull Guideline guideline2, @NonNull ButtonView buttonView2, @NonNull TextAtomV2View textAtomV2View, @NonNull TextAtomV2View textAtomV2View2) {
        this.rootView = constraintLayout;
        this.cancelButton = buttonView;
        this.endGuideline = guideline;
        this.startGuideline = guideline2;
        this.submitButton = buttonView2;
        this.subtitleTextAtomView = textAtomV2View;
        this.titleTextAtomView = textAtomV2View2;
    }

    @NonNull
    public static SheetViewDialogBinding bind(@NonNull View view) {
        int i11 = R$id.cancelButton;
        ButtonView buttonView = (ButtonView) C2548q.d(i11, view);
        if (buttonView != null) {
            i11 = R$id.endGuideline;
            Guideline guideline = (Guideline) C2548q.d(i11, view);
            if (guideline != null) {
                i11 = R$id.startGuideline;
                Guideline guideline2 = (Guideline) C2548q.d(i11, view);
                if (guideline2 != null) {
                    i11 = R$id.submitButton;
                    ButtonView buttonView2 = (ButtonView) C2548q.d(i11, view);
                    if (buttonView2 != null) {
                        i11 = R$id.subtitleTextAtomView;
                        TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                        if (textAtomV2View != null) {
                            i11 = R$id.titleTextAtomView;
                            TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(i11, view);
                            if (textAtomV2View2 != null) {
                                return new SheetViewDialogBinding((ConstraintLayout) view, buttonView, guideline, guideline2, buttonView2, textAtomV2View, textAtomV2View2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static SheetViewDialogBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static SheetViewDialogBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.sheet_view_dialog, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public ConstraintLayout getConstraintLayout() {
        return this.rootView;
    }
}
