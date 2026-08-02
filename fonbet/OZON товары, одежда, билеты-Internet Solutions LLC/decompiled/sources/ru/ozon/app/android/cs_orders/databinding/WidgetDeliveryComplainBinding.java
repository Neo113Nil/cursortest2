package ru.ozon.app.android.cs_orders.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.cs_orders.R$id;
import ru.ozon.app.android.cs_orders.R$layout;

/* loaded from: classes11.dex */
public final class WidgetDeliveryComplainBinding implements a {

    @NonNull
    public final WidgetComplainDeliveryCompletedStateBinding completedStateInclude;

    @NonNull
    public final WidgetComplainDeliveryEnterStateBinding enterStateInclude;

    @NonNull
    private final ConstraintLayout rootView;

    private WidgetDeliveryComplainBinding(@NonNull ConstraintLayout constraintLayout, @NonNull WidgetComplainDeliveryCompletedStateBinding widgetComplainDeliveryCompletedStateBinding, @NonNull WidgetComplainDeliveryEnterStateBinding widgetComplainDeliveryEnterStateBinding) {
        this.rootView = constraintLayout;
        this.completedStateInclude = widgetComplainDeliveryCompletedStateBinding;
        this.enterStateInclude = widgetComplainDeliveryEnterStateBinding;
    }

    @NonNull
    public static WidgetDeliveryComplainBinding bind(@NonNull View view) {
        int i11 = R$id.completedStateInclude;
        View d11 = C2548q.d(i11, view);
        if (d11 != null) {
            WidgetComplainDeliveryCompletedStateBinding bind = WidgetComplainDeliveryCompletedStateBinding.bind(d11);
            int i12 = R$id.enterStateInclude;
            View d12 = C2548q.d(i12, view);
            if (d12 != null) {
                return new WidgetDeliveryComplainBinding((ConstraintLayout) view, bind, WidgetComplainDeliveryEnterStateBinding.bind(d12));
            }
            i11 = i12;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static WidgetDeliveryComplainBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.widget_delivery_complain, viewGroup, false);
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
