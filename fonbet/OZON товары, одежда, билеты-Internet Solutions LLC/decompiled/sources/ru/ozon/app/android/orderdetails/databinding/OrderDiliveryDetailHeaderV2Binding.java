package ru.ozon.app.android.orderdetails.databinding;

import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import ru.ozon.app.android.atoms.v3.holders.listelements.ListElementView;

/* loaded from: classes13.dex */
public final class OrderDiliveryDetailHeaderV2Binding implements a {

    @NonNull
    public final ListElementView iconWithTitleItem;

    @NonNull
    private final ListElementView rootView;

    private OrderDiliveryDetailHeaderV2Binding(@NonNull ListElementView listElementView, @NonNull ListElementView listElementView2) {
        this.rootView = listElementView;
        this.iconWithTitleItem = listElementView2;
    }

    @NonNull
    public static OrderDiliveryDetailHeaderV2Binding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        ListElementView listElementView = (ListElementView) view;
        return new OrderDiliveryDetailHeaderV2Binding(listElementView, listElementView);
    }

    @Override // X4.a
    @NonNull
    public ListElementView getRoot() {
        return this.rootView;
    }
}
