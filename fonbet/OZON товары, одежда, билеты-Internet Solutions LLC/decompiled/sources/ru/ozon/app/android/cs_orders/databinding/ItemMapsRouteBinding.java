package ru.ozon.app.android.cs_orders.databinding;

import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import ru.ozon.app.android.cs_orders.R$layout;

/* loaded from: classes11.dex */
public final class ItemMapsRouteBinding implements a {

    @NonNull
    private final TextView rootView;

    private ItemMapsRouteBinding(@NonNull TextView textView) {
        this.rootView = textView;
    }

    @NonNull
    public static ItemMapsRouteBinding bind(@NonNull View view) {
        if (view != null) {
            return new ItemMapsRouteBinding((TextView) view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static ItemMapsRouteBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_maps_route, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public TextView getRoot() {
        return this.rootView;
    }
}
