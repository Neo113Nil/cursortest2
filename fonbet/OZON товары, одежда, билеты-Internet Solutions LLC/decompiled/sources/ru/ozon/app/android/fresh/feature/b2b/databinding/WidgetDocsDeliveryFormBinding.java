package ru.ozon.app.android.fresh.feature.b2b.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.atoms.v3.molecules.DisclaimerContainer;
import ru.ozon.app.android.fresh.feature.b2b.R$id;
import ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.view.B2BTextWithErrorInputLayout;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

/* loaded from: classes12.dex */
public final class WidgetDocsDeliveryFormBinding implements a {

    @NonNull
    public final B2BTextWithErrorInputLayout addressTIL;

    @NonNull
    public final RecyclerView inputsRV;

    @NonNull
    public final TextAtomV2View orderTAV;

    @NonNull
    private final NestedScrollView rootView;

    @NonNull
    public final DisclaimerContainer tipDC;

    @NonNull
    public final TextAtomV2View titleTAV;

    private WidgetDocsDeliveryFormBinding(@NonNull NestedScrollView nestedScrollView, @NonNull B2BTextWithErrorInputLayout b2BTextWithErrorInputLayout, @NonNull RecyclerView recyclerView, @NonNull TextAtomV2View textAtomV2View, @NonNull DisclaimerContainer disclaimerContainer, @NonNull TextAtomV2View textAtomV2View2) {
        this.rootView = nestedScrollView;
        this.addressTIL = b2BTextWithErrorInputLayout;
        this.inputsRV = recyclerView;
        this.orderTAV = textAtomV2View;
        this.tipDC = disclaimerContainer;
        this.titleTAV = textAtomV2View2;
    }

    @NonNull
    public static WidgetDocsDeliveryFormBinding bind(@NonNull View view) {
        int i11 = R$id.addressTIL;
        B2BTextWithErrorInputLayout b2BTextWithErrorInputLayout = (B2BTextWithErrorInputLayout) C2548q.d(i11, view);
        if (b2BTextWithErrorInputLayout != null) {
            i11 = R$id.inputsRV;
            RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
            if (recyclerView != null) {
                i11 = R$id.orderTAV;
                TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                if (textAtomV2View != null) {
                    i11 = R$id.tipDC;
                    DisclaimerContainer disclaimerContainer = (DisclaimerContainer) C2548q.d(i11, view);
                    if (disclaimerContainer != null) {
                        i11 = R$id.titleTAV;
                        TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(i11, view);
                        if (textAtomV2View2 != null) {
                            return new WidgetDocsDeliveryFormBinding((NestedScrollView) view, b2BTextWithErrorInputLayout, recyclerView, textAtomV2View, disclaimerContainer, textAtomV2View2);
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
    public NestedScrollView getConstraintLayout() {
        return this.rootView;
    }
}
