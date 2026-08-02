package ru.ozon.app.android.marketing.databinding;

import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes12.dex */
public final class WidgetPdpCouponListV2Binding implements a {

    @NonNull
    public final RecyclerView pdpCouponList;

    @NonNull
    private final RecyclerView rootView;

    private WidgetPdpCouponListV2Binding(@NonNull RecyclerView recyclerView, @NonNull RecyclerView recyclerView2) {
        this.rootView = recyclerView;
        this.pdpCouponList = recyclerView2;
    }

    @NonNull
    public static WidgetPdpCouponListV2Binding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        RecyclerView recyclerView = (RecyclerView) view;
        return new WidgetPdpCouponListV2Binding(recyclerView, recyclerView);
    }

    @Override // X4.a
    @NonNull
    public RecyclerView getRoot() {
        return this.rootView;
    }
}
