package ru.ozon.app.android.travel.feature.oldwidgets.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import ru.ozon.app.android.travel.feature.oldwidgets.R$id;
import ru.ozon.app.android.travel.molecules.view.commonInput.v1.view.CommonDateInputView;
import ru.ozon.app.android.travel.molecules.view.commonInput.v1.view.CommonTextInputView;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes4.dex */
public final class WidgetReportDocumentBinding implements a {

    @NonNull
    public final Group dateGroupG;

    @NonNull
    public final LargeButtonView reportDocumentButtonLBV;

    @NonNull
    public final CommonTextInputView reportDocumentEmailCDIV;

    @NonNull
    public final CommonDateInputView reportDocumentFromDateCDIV;

    @NonNull
    public final View reportDocumentSeparatorV;

    @NonNull
    public final TextAtomView reportDocumentTextTAV;

    @NonNull
    public final TextAtomView reportDocumentTitleTAV;

    @NonNull
    public final CommonDateInputView reportDocumentToDateCDIV;

    @NonNull
    private final ConstraintLayout rootView;

    private WidgetReportDocumentBinding(@NonNull ConstraintLayout constraintLayout, @NonNull Group group, @NonNull LargeButtonView largeButtonView, @NonNull CommonTextInputView commonTextInputView, @NonNull CommonDateInputView commonDateInputView, @NonNull View view, @NonNull TextAtomView textAtomView, @NonNull TextAtomView textAtomView2, @NonNull CommonDateInputView commonDateInputView2) {
        this.rootView = constraintLayout;
        this.dateGroupG = group;
        this.reportDocumentButtonLBV = largeButtonView;
        this.reportDocumentEmailCDIV = commonTextInputView;
        this.reportDocumentFromDateCDIV = commonDateInputView;
        this.reportDocumentSeparatorV = view;
        this.reportDocumentTextTAV = textAtomView;
        this.reportDocumentTitleTAV = textAtomView2;
        this.reportDocumentToDateCDIV = commonDateInputView2;
    }

    @NonNull
    public static WidgetReportDocumentBinding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.dateGroupG;
        Group group = (Group) C2548q.d(i11, view);
        if (group != null) {
            i11 = R$id.reportDocumentButtonLBV;
            LargeButtonView largeButtonView = (LargeButtonView) C2548q.d(i11, view);
            if (largeButtonView != null) {
                i11 = R$id.reportDocumentEmailCDIV;
                CommonTextInputView commonTextInputView = (CommonTextInputView) C2548q.d(i11, view);
                if (commonTextInputView != null) {
                    i11 = R$id.reportDocumentFromDateCDIV;
                    CommonDateInputView commonDateInputView = (CommonDateInputView) C2548q.d(i11, view);
                    if (commonDateInputView != null && (d11 = C2548q.d((i11 = R$id.reportDocumentSeparatorV), view)) != null) {
                        i11 = R$id.reportDocumentTextTAV;
                        TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
                        if (textAtomView != null) {
                            i11 = R$id.reportDocumentTitleTAV;
                            TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
                            if (textAtomView2 != null) {
                                i11 = R$id.reportDocumentToDateCDIV;
                                CommonDateInputView commonDateInputView2 = (CommonDateInputView) C2548q.d(i11, view);
                                if (commonDateInputView2 != null) {
                                    return new WidgetReportDocumentBinding((ConstraintLayout) view, group, largeButtonView, commonTextInputView, commonDateInputView, d11, textAtomView, textAtomView2, commonDateInputView2);
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
