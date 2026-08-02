package ru.ozon.app.android.travel.feature.b2b.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.travel.feature.b2b.R$id;
import ru.ozon.app.android.travel.feature.b2b.widgets.travelPersonalAccountReplenishment.v2.view.CursorObservableEditText;
import ru.ozon.app.android.uikit.view.input.MobilizationTextInputLayout;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes12.dex */
public final class WidgetPersonalAccountReplenishmentBinding implements a {

    @NonNull
    public final TextAtomView agreementTextView;

    @NonNull
    public final TextAtomView descriptionTextView;

    @NonNull
    public final AppCompatTextView errorView;

    @NonNull
    public final MobilizationTextInputLayout inputLayout;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final LargeButtonView submitButton;

    @NonNull
    public final CursorObservableEditText sumEditText;

    @NonNull
    public final RecyclerView tagList;

    @NonNull
    public final TextAtomView titleView;

    private WidgetPersonalAccountReplenishmentBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TextAtomView textAtomView, @NonNull TextAtomView textAtomView2, @NonNull AppCompatTextView appCompatTextView, @NonNull MobilizationTextInputLayout mobilizationTextInputLayout, @NonNull LargeButtonView largeButtonView, @NonNull CursorObservableEditText cursorObservableEditText, @NonNull RecyclerView recyclerView, @NonNull TextAtomView textAtomView3) {
        this.rootView = constraintLayout;
        this.agreementTextView = textAtomView;
        this.descriptionTextView = textAtomView2;
        this.errorView = appCompatTextView;
        this.inputLayout = mobilizationTextInputLayout;
        this.submitButton = largeButtonView;
        this.sumEditText = cursorObservableEditText;
        this.tagList = recyclerView;
        this.titleView = textAtomView3;
    }

    @NonNull
    public static WidgetPersonalAccountReplenishmentBinding bind(@NonNull View view) {
        int i11 = R$id.agreementTextView;
        TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
        if (textAtomView != null) {
            i11 = R$id.descriptionTextView;
            TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
            if (textAtomView2 != null) {
                i11 = R$id.errorView;
                AppCompatTextView appCompatTextView = (AppCompatTextView) C2548q.d(i11, view);
                if (appCompatTextView != null) {
                    i11 = R$id.inputLayout;
                    MobilizationTextInputLayout mobilizationTextInputLayout = (MobilizationTextInputLayout) C2548q.d(i11, view);
                    if (mobilizationTextInputLayout != null) {
                        i11 = R$id.submitButton;
                        LargeButtonView largeButtonView = (LargeButtonView) C2548q.d(i11, view);
                        if (largeButtonView != null) {
                            i11 = R$id.sumEditText;
                            CursorObservableEditText cursorObservableEditText = (CursorObservableEditText) C2548q.d(i11, view);
                            if (cursorObservableEditText != null) {
                                i11 = R$id.tagList;
                                RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
                                if (recyclerView != null) {
                                    i11 = R$id.titleView;
                                    TextAtomView textAtomView3 = (TextAtomView) C2548q.d(i11, view);
                                    if (textAtomView3 != null) {
                                        return new WidgetPersonalAccountReplenishmentBinding((ConstraintLayout) view, textAtomView, textAtomView2, appCompatTextView, mobilizationTextInputLayout, largeButtonView, cursorObservableEditText, recyclerView, textAtomView3);
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
