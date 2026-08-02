package ru.ozon.app.android.orderdetails.databinding;

import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import ru.ozon.app.android.uikit.view.atoms.listelemets.IconWithTitleMediumListElementView;

/* loaded from: classes13.dex */
public final class OrderDiliveryDetailHeaderBinding implements a {

    @NonNull
    public final IconWithTitleMediumListElementView iconWithTitleItem;

    @NonNull
    private final IconWithTitleMediumListElementView rootView;

    private OrderDiliveryDetailHeaderBinding(@NonNull IconWithTitleMediumListElementView iconWithTitleMediumListElementView, @NonNull IconWithTitleMediumListElementView iconWithTitleMediumListElementView2) {
        this.rootView = iconWithTitleMediumListElementView;
        this.iconWithTitleItem = iconWithTitleMediumListElementView2;
    }

    @NonNull
    public static OrderDiliveryDetailHeaderBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        IconWithTitleMediumListElementView iconWithTitleMediumListElementView = (IconWithTitleMediumListElementView) view;
        return new OrderDiliveryDetailHeaderBinding(iconWithTitleMediumListElementView, iconWithTitleMediumListElementView);
    }

    @Override // X4.a
    @NonNull
    public IconWithTitleMediumListElementView getRoot() {
        return this.rootView;
    }
}
