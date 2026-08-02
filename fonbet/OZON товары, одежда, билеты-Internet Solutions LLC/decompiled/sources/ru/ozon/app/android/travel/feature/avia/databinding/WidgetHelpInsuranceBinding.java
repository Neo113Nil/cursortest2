package ru.ozon.app.android.travel.feature.avia.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.travel.feature.avia.R$id;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes8.dex */
public final class WidgetHelpInsuranceBinding implements a {

    @NonNull
    public final TextAtomView caseSubtitleTAV;

    @NonNull
    public final TextAtomView caseTitleTAV;

    @NonNull
    public final LargeButtonView helpInsuranceCloseButtonLBV;

    @NonNull
    public final TextAtomView helpInsuranceTitleTAV;

    @NonNull
    public final RecyclerView insuranceInstructionsRV;

    @NonNull
    public final RecyclerView insuranceTabsRV;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final ImageView warningIconIV;

    @NonNull
    public final LinearLayout warningLayoutLL;

    @NonNull
    public final TextAtomView warningTitleTAV;

    private WidgetHelpInsuranceBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TextAtomView textAtomView, @NonNull TextAtomView textAtomView2, @NonNull LargeButtonView largeButtonView, @NonNull TextAtomView textAtomView3, @NonNull RecyclerView recyclerView, @NonNull RecyclerView recyclerView2, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout, @NonNull TextAtomView textAtomView4) {
        this.rootView = constraintLayout;
        this.caseSubtitleTAV = textAtomView;
        this.caseTitleTAV = textAtomView2;
        this.helpInsuranceCloseButtonLBV = largeButtonView;
        this.helpInsuranceTitleTAV = textAtomView3;
        this.insuranceInstructionsRV = recyclerView;
        this.insuranceTabsRV = recyclerView2;
        this.warningIconIV = imageView;
        this.warningLayoutLL = linearLayout;
        this.warningTitleTAV = textAtomView4;
    }

    @NonNull
    public static WidgetHelpInsuranceBinding bind(@NonNull View view) {
        int i11 = R$id.caseSubtitleTAV;
        TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
        if (textAtomView != null) {
            i11 = R$id.caseTitleTAV;
            TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
            if (textAtomView2 != null) {
                i11 = R$id.helpInsuranceCloseButtonLBV;
                LargeButtonView largeButtonView = (LargeButtonView) C2548q.d(i11, view);
                if (largeButtonView != null) {
                    i11 = R$id.helpInsuranceTitleTAV;
                    TextAtomView textAtomView3 = (TextAtomView) C2548q.d(i11, view);
                    if (textAtomView3 != null) {
                        i11 = R$id.insuranceInstructionsRV;
                        RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
                        if (recyclerView != null) {
                            i11 = R$id.insuranceTabsRV;
                            RecyclerView recyclerView2 = (RecyclerView) C2548q.d(i11, view);
                            if (recyclerView2 != null) {
                                i11 = R$id.warningIconIV;
                                ImageView imageView = (ImageView) C2548q.d(i11, view);
                                if (imageView != null) {
                                    i11 = R$id.warningLayoutLL;
                                    LinearLayout linearLayout = (LinearLayout) C2548q.d(i11, view);
                                    if (linearLayout != null) {
                                        i11 = R$id.warningTitleTAV;
                                        TextAtomView textAtomView4 = (TextAtomView) C2548q.d(i11, view);
                                        if (textAtomView4 != null) {
                                            return new WidgetHelpInsuranceBinding((ConstraintLayout) view, textAtomView, textAtomView2, largeButtonView, textAtomView3, recyclerView, recyclerView2, imageView, linearLayout, textAtomView4);
                                        }
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
