package ru.ozon.app.android.messenger.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.messenger.R$id;
import ru.ozon.app.android.messenger.R$layout;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes12.dex */
public final class MReportBottomSheetBinding implements a {

    @NonNull
    public final ImageView closeIV;

    @NonNull
    public final TextAtomView descriptionTAV;

    @NonNull
    public final TextAtomView reportTitleTAV;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final View sheetHandleView;

    @NonNull
    public final LargeButtonView submitButton;

    private MReportBottomSheetBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull TextAtomView textAtomView, @NonNull TextAtomView textAtomView2, @NonNull View view, @NonNull LargeButtonView largeButtonView) {
        this.rootView = constraintLayout;
        this.closeIV = imageView;
        this.descriptionTAV = textAtomView;
        this.reportTitleTAV = textAtomView2;
        this.sheetHandleView = view;
        this.submitButton = largeButtonView;
    }

    @NonNull
    public static MReportBottomSheetBinding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.closeIV;
        ImageView imageView = (ImageView) C2548q.d(i11, view);
        if (imageView != null) {
            i11 = R$id.descriptionTAV;
            TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
            if (textAtomView != null) {
                i11 = R$id.reportTitleTAV;
                TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
                if (textAtomView2 != null && (d11 = C2548q.d((i11 = R$id.sheetHandleView), view)) != null) {
                    i11 = R$id.submitButton;
                    LargeButtonView largeButtonView = (LargeButtonView) C2548q.d(i11, view);
                    if (largeButtonView != null) {
                        return new MReportBottomSheetBinding((ConstraintLayout) view, imageView, textAtomView, textAtomView2, d11, largeButtonView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static MReportBottomSheetBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.m_report_bottom_sheet, viewGroup, false);
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
