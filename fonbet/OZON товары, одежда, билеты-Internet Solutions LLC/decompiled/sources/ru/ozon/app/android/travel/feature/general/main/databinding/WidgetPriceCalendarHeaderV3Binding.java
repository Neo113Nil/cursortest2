package ru.ozon.app.android.travel.feature.general.main.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.travel.feature.general.main.R$id;

/* loaded from: classes4.dex */
public final class WidgetPriceCalendarHeaderV3Binding implements a {

    @NonNull
    public final ItemPriceCalendarHeaderV3FieldBinding priceCalendarHeaderReturnDateField;

    @NonNull
    public final ItemPriceCalendarHeaderV3FieldBinding priceCalendarHeaderStartDateField;

    @NonNull
    private final LinearLayout rootView;

    private WidgetPriceCalendarHeaderV3Binding(@NonNull LinearLayout linearLayout, @NonNull ItemPriceCalendarHeaderV3FieldBinding itemPriceCalendarHeaderV3FieldBinding, @NonNull ItemPriceCalendarHeaderV3FieldBinding itemPriceCalendarHeaderV3FieldBinding2) {
        this.rootView = linearLayout;
        this.priceCalendarHeaderReturnDateField = itemPriceCalendarHeaderV3FieldBinding;
        this.priceCalendarHeaderStartDateField = itemPriceCalendarHeaderV3FieldBinding2;
    }

    @NonNull
    public static WidgetPriceCalendarHeaderV3Binding bind(@NonNull View view) {
        int i11 = R$id.priceCalendarHeaderReturnDateField;
        View d11 = C2548q.d(i11, view);
        if (d11 != null) {
            ItemPriceCalendarHeaderV3FieldBinding bind = ItemPriceCalendarHeaderV3FieldBinding.bind(d11);
            int i12 = R$id.priceCalendarHeaderStartDateField;
            View d12 = C2548q.d(i12, view);
            if (d12 != null) {
                return new WidgetPriceCalendarHeaderV3Binding((LinearLayout) view, bind, ItemPriceCalendarHeaderV3FieldBinding.bind(d12));
            }
            i11 = i12;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
