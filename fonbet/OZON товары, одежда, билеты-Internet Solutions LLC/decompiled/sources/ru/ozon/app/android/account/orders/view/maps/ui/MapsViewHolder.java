package ru.ozon.app.android.account.orders.view.maps.ui;

import android.content.Context;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cs_orders.databinding.ItemMapsRouteBinding;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/account/orders/view/maps/ui/MapsViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/app/android/cs_orders/databinding/ItemMapsRouteBinding;", "binding", "<init>", "(Lru/ozon/app/android/cs_orders/databinding/ItemMapsRouteBinding;)V", "Lru/ozon/app/android/account/orders/view/maps/ui/MapItem;", "mapItem", "", "bind", "(Lru/ozon/app/android/account/orders/view/maps/ui/MapItem;)V", "Lru/ozon/app/android/cs_orders/databinding/ItemMapsRouteBinding;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MapsViewHolder extends RecyclerView.C {

    @NotNull
    private final ItemMapsRouteBinding binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapsViewHolder(@NotNull ItemMapsRouteBinding binding) {
        super(binding.getConstraintLayout());
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.binding = binding;
    }

    public final void bind(@NotNull MapItem mapItem) {
        Intrinsics.checkNotNullParameter(mapItem, "mapItem");
        TextView constraintLayout = this.binding.getConstraintLayout();
        constraintLayout.setText(mapItem.getTitle());
        constraintLayout.setClickable(mapItem.getIsClickable());
        Context context = constraintLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        constraintLayout.setTextColor(ThemeExtKt.themeColor(context, mapItem.getTextColor()));
    }
}
