package ru.ozon.app.android.fresh.feature.b2b.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.fresh.feature.b2b.R$id;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legaldocs.presentation.order.LegalDocsOrderStatusView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.SmallIconButtonView;

/* loaded from: classes12.dex */
public final class WidgetLegalDocsOrderBinding implements a {

    @NonNull
    public final SmallIconButtonView downloadButtonBV;

    @NonNull
    public final TextAtomV2View orderDateTAV;

    @NonNull
    public final TextAtomV2View orderPriceTAV;

    @NonNull
    public final LegalDocsOrderStatusView orderStatusView;

    @NonNull
    public final TextAtomV2View orderTitleTAV;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextAtomV2View sectionHeaderTAV;

    @NonNull
    public final View separator;

    private WidgetLegalDocsOrderBinding(@NonNull ConstraintLayout constraintLayout, @NonNull SmallIconButtonView smallIconButtonView, @NonNull TextAtomV2View textAtomV2View, @NonNull TextAtomV2View textAtomV2View2, @NonNull LegalDocsOrderStatusView legalDocsOrderStatusView, @NonNull TextAtomV2View textAtomV2View3, @NonNull TextAtomV2View textAtomV2View4, @NonNull View view) {
        this.rootView = constraintLayout;
        this.downloadButtonBV = smallIconButtonView;
        this.orderDateTAV = textAtomV2View;
        this.orderPriceTAV = textAtomV2View2;
        this.orderStatusView = legalDocsOrderStatusView;
        this.orderTitleTAV = textAtomV2View3;
        this.sectionHeaderTAV = textAtomV2View4;
        this.separator = view;
    }

    @NonNull
    public static WidgetLegalDocsOrderBinding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.downloadButtonBV;
        SmallIconButtonView smallIconButtonView = (SmallIconButtonView) C2548q.d(i11, view);
        if (smallIconButtonView != null) {
            i11 = R$id.orderDateTAV;
            TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
            if (textAtomV2View != null) {
                i11 = R$id.orderPriceTAV;
                TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(i11, view);
                if (textAtomV2View2 != null) {
                    i11 = R$id.orderStatusView;
                    LegalDocsOrderStatusView legalDocsOrderStatusView = (LegalDocsOrderStatusView) C2548q.d(i11, view);
                    if (legalDocsOrderStatusView != null) {
                        i11 = R$id.orderTitleTAV;
                        TextAtomV2View textAtomV2View3 = (TextAtomV2View) C2548q.d(i11, view);
                        if (textAtomV2View3 != null) {
                            i11 = R$id.sectionHeaderTAV;
                            TextAtomV2View textAtomV2View4 = (TextAtomV2View) C2548q.d(i11, view);
                            if (textAtomV2View4 != null && (d11 = C2548q.d((i11 = R$id.separator), view)) != null) {
                                return new WidgetLegalDocsOrderBinding((ConstraintLayout) view, smallIconButtonView, textAtomV2View, textAtomV2View2, legalDocsOrderStatusView, textAtomV2View3, textAtomV2View4, d11);
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
