package ru.ozon.app.android.travel.feature.b2b.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.travel.feature.b2b.R$id;
import ru.ozon.app.android.uikit.view.input.MobilizationTextInputLayout;
import ru.ozon.uni.android.uikit.view.atoms.buttons.borderless.SmallBorderlessButtonView;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes12.dex */
public final class WidgetTravelDocumentsToEmailListBinding implements a {

    @NonNull
    public final RecyclerView documentsToEmailList;

    @NonNull
    public final AppCompatEditText documentsToEmailListEditText;

    @NonNull
    public final AppCompatTextView documentsToEmailListErrorTextView;

    @NonNull
    public final MobilizationTextInputLayout documentsToEmailListInputLayout;

    @NonNull
    public final LargeButtonView documentsToEmailListLargeButton;

    @NonNull
    public final SmallBorderlessButtonView documentsToEmailListSmallButton;

    @NonNull
    public final TextAtomView documentsToEmailListTitle;

    @NonNull
    private final ConstraintLayout rootView;

    private WidgetTravelDocumentsToEmailListBinding(@NonNull ConstraintLayout constraintLayout, @NonNull RecyclerView recyclerView, @NonNull AppCompatEditText appCompatEditText, @NonNull AppCompatTextView appCompatTextView, @NonNull MobilizationTextInputLayout mobilizationTextInputLayout, @NonNull LargeButtonView largeButtonView, @NonNull SmallBorderlessButtonView smallBorderlessButtonView, @NonNull TextAtomView textAtomView) {
        this.rootView = constraintLayout;
        this.documentsToEmailList = recyclerView;
        this.documentsToEmailListEditText = appCompatEditText;
        this.documentsToEmailListErrorTextView = appCompatTextView;
        this.documentsToEmailListInputLayout = mobilizationTextInputLayout;
        this.documentsToEmailListLargeButton = largeButtonView;
        this.documentsToEmailListSmallButton = smallBorderlessButtonView;
        this.documentsToEmailListTitle = textAtomView;
    }

    @NonNull
    public static WidgetTravelDocumentsToEmailListBinding bind(@NonNull View view) {
        int i11 = R$id.documentsToEmailList;
        RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
        if (recyclerView != null) {
            i11 = R$id.documentsToEmailListEditText;
            AppCompatEditText appCompatEditText = (AppCompatEditText) C2548q.d(i11, view);
            if (appCompatEditText != null) {
                i11 = R$id.documentsToEmailListErrorTextView;
                AppCompatTextView appCompatTextView = (AppCompatTextView) C2548q.d(i11, view);
                if (appCompatTextView != null) {
                    i11 = R$id.documentsToEmailListInputLayout;
                    MobilizationTextInputLayout mobilizationTextInputLayout = (MobilizationTextInputLayout) C2548q.d(i11, view);
                    if (mobilizationTextInputLayout != null) {
                        i11 = R$id.documentsToEmailListLargeButton;
                        LargeButtonView largeButtonView = (LargeButtonView) C2548q.d(i11, view);
                        if (largeButtonView != null) {
                            i11 = R$id.documentsToEmailListSmallButton;
                            SmallBorderlessButtonView smallBorderlessButtonView = (SmallBorderlessButtonView) C2548q.d(i11, view);
                            if (smallBorderlessButtonView != null) {
                                i11 = R$id.documentsToEmailListTitle;
                                TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
                                if (textAtomView != null) {
                                    return new WidgetTravelDocumentsToEmailListBinding((ConstraintLayout) view, recyclerView, appCompatEditText, appCompatTextView, mobilizationTextInputLayout, largeButtonView, smallBorderlessButtonView, textAtomView);
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
