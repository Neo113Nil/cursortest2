package ru.ozon.app.android.travel.feature.avia.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.travel.feature.avia.R$id;
import ru.ozon.app.android.travel.molecules.view.linkButton.LinkButtonView;
import ru.ozon.uni.android.uikit.view.atoms.buttons.borderless.LargeBorderlessButtonView;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes8.dex */
public final class WidgetInsurancePanelBinding implements a {

    @NonNull
    public final LargeBorderlessButtonView cancelButtonLBBV;

    @NonNull
    public final RecyclerView insurancesRV;

    @NonNull
    public final LinkButtonView moreInfoButtonLBV;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final LargeButtonView selectButtonLBV;

    @NonNull
    public final TextAtomView titleTAV;

    private WidgetInsurancePanelBinding(@NonNull ConstraintLayout constraintLayout, @NonNull LargeBorderlessButtonView largeBorderlessButtonView, @NonNull RecyclerView recyclerView, @NonNull LinkButtonView linkButtonView, @NonNull LargeButtonView largeButtonView, @NonNull TextAtomView textAtomView) {
        this.rootView = constraintLayout;
        this.cancelButtonLBBV = largeBorderlessButtonView;
        this.insurancesRV = recyclerView;
        this.moreInfoButtonLBV = linkButtonView;
        this.selectButtonLBV = largeButtonView;
        this.titleTAV = textAtomView;
    }

    @NonNull
    public static WidgetInsurancePanelBinding bind(@NonNull View view) {
        int i11 = R$id.cancelButtonLBBV;
        LargeBorderlessButtonView largeBorderlessButtonView = (LargeBorderlessButtonView) C2548q.d(i11, view);
        if (largeBorderlessButtonView != null) {
            i11 = R$id.insurancesRV;
            RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
            if (recyclerView != null) {
                i11 = R$id.moreInfoButtonLBV;
                LinkButtonView linkButtonView = (LinkButtonView) C2548q.d(i11, view);
                if (linkButtonView != null) {
                    i11 = R$id.selectButtonLBV;
                    LargeButtonView largeButtonView = (LargeButtonView) C2548q.d(i11, view);
                    if (largeButtonView != null) {
                        i11 = R$id.titleTAV;
                        TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
                        if (textAtomView != null) {
                            return new WidgetInsurancePanelBinding((ConstraintLayout) view, largeBorderlessButtonView, recyclerView, linkButtonView, largeButtonView, textAtomView);
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
