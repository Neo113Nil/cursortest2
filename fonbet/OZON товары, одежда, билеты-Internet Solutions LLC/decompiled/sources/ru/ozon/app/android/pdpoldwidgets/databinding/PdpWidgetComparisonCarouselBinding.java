package ru.ozon.app.android.pdpoldwidgets.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.pdpoldwidgets.R$id;

/* loaded from: classes13.dex */
public final class PdpWidgetComparisonCarouselBinding implements a {

    @NonNull
    public final ConstraintLayout compareProductsCarouselContainerCL;

    @NonNull
    public final RecyclerView firstColumnRV;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final RecyclerView secondColumnRV;

    private PdpWidgetComparisonCarouselBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull RecyclerView recyclerView, @NonNull RecyclerView recyclerView2) {
        this.rootView = constraintLayout;
        this.compareProductsCarouselContainerCL = constraintLayout2;
        this.firstColumnRV = recyclerView;
        this.secondColumnRV = recyclerView2;
    }

    @NonNull
    public static PdpWidgetComparisonCarouselBinding bind(@NonNull View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i11 = R$id.firstColumnRV;
        RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
        if (recyclerView != null) {
            i11 = R$id.secondColumnRV;
            RecyclerView recyclerView2 = (RecyclerView) C2548q.d(i11, view);
            if (recyclerView2 != null) {
                return new PdpWidgetComparisonCarouselBinding(constraintLayout, constraintLayout, recyclerView, recyclerView2);
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
