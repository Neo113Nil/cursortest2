package ru.ozon.app.android.account.orders.view.maps.ui;

import OD.a;
import Sc.o;
import Ve.C4636t5;
import Ve.ViewOnClickListenerC4465n7;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.orders.view.maps.MapSelectorAnalytics;
import ru.ozon.app.android.cs_orders.databinding.ItemMapsRouteBinding;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0003\b\u0007\u0018\u0000 %2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001%B1\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001e\u001a\u00020\u00052\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b¢\u0006\u0004\b\u001e\u0010\u001fR \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010 R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010!R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\"R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010$¨\u0006&"}, d2 = {"Lru/ozon/app/android/account/orders/view/maps/ui/MapsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$g;", "Lru/ozon/app/android/account/orders/view/maps/ui/MapsViewHolder;", "Lkotlin/Function1;", "Landroid/content/Intent;", "", "clickListener", "Lkotlin/Function0;", "cancelListener", "Lru/ozon/app/android/account/orders/view/maps/MapSelectorAnalytics;", "mapSelectorAnalytics", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lru/ozon/app/android/account/orders/view/maps/MapSelectorAnalytics;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/account/orders/view/maps/ui/MapsViewHolder;", "getItemCount", "()I", "holder", "position", "onBindViewHolder", "(Lru/ozon/app/android/account/orders/view/maps/ui/MapsViewHolder;I)V", "getItemViewType", "(I)I", "", "Lru/ozon/app/android/account/orders/view/maps/ui/MapItem;", "items", "submitList", "(Ljava/util/List;)V", "Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function0;", "Lru/ozon/app/android/account/orders/view/maps/MapSelectorAnalytics;", "", "Ljava/util/List;", "Companion", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MapsAdapter extends RecyclerView.g<MapsViewHolder> {

    @NotNull
    private final Function0<Unit> cancelListener;

    @NotNull
    private final Function1<Intent, Unit> clickListener;

    @NotNull
    private final List<MapItem> items;

    @NotNull
    private final MapSelectorAnalytics mapSelectorAnalytics;
    public static final int $stable = 8;

    /* JADX WARN: Multi-variable type inference failed */
    public MapsAdapter(@NotNull Function1<? super Intent, Unit> clickListener, @NotNull Function0<Unit> cancelListener, @NotNull MapSelectorAnalytics mapSelectorAnalytics) {
        Intrinsics.checkNotNullParameter(clickListener, "clickListener");
        Intrinsics.checkNotNullParameter(cancelListener, "cancelListener");
        Intrinsics.checkNotNullParameter(mapSelectorAnalytics, "mapSelectorAnalytics");
        this.clickListener = clickListener;
        this.cancelListener = cancelListener;
        this.mapSelectorAnalytics = mapSelectorAnalytics;
        this.items = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateViewHolder$lambda$0(MapsAdapter mapsAdapter, View view) {
        mapsAdapter.cancelListener.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateViewHolder$lambda$1(MapsAdapter mapsAdapter, MapsViewHolder mapsViewHolder, View view) {
        MapItem mapItem = mapsAdapter.items.get(mapsViewHolder.getAdapterPosition());
        Intrinsics.g(mapItem, "null cannot be cast to non-null type ru.ozon.app.android.account.orders.view.maps.ui.MapRouteVO");
        MapRouteVO mapRouteVO = (MapRouteVO) mapItem;
        mapsAdapter.mapSelectorAnalytics.toMaps(mapRouteVO.getRouteType());
        mapsAdapter.clickListener.invoke(mapRouteVO.getIntent());
        mapsAdapter.cancelListener.invoke();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: getItemCount */
    public int getCardsCount() {
        return this.items.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        MapItem mapItem = this.items.get(position);
        if (mapItem instanceof MapTitle) {
            return 1;
        }
        if (mapItem instanceof MapRouteVO) {
            return 2;
        }
        if (mapItem instanceof MapCancel) {
            return 3;
        }
        throw new o();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public MapsViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        ItemMapsRouteBinding inflate = ItemMapsRouteBinding.inflate(C4636t5.a(parent, "parent"), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        MapsViewHolder mapsViewHolder = new MapsViewHolder(inflate);
        if (viewType == 3) {
            mapsViewHolder.itemView.setOnClickListener(new a(this, 7));
            return mapsViewHolder;
        }
        mapsViewHolder.itemView.setOnClickListener(new ViewOnClickListenerC4465n7(4, this, mapsViewHolder));
        return mapsViewHolder;
    }

    public final void submitList(@NotNull List<? extends MapItem> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.items.clear();
        this.items.addAll(items);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull MapsViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.items.get(position));
    }
}
