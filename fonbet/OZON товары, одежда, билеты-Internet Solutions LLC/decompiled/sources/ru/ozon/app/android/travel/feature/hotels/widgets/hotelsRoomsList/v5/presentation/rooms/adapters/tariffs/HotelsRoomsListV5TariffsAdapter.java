package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.presentation.rooms.adapters.tariffs;

import Ej.b;
import Sc.o;
import WZ.l;
import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import jk0.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.R$id;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.presentation.rooms.Placeholder;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.presentation.rooms.TariffState;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.presentation.rooms.TariffVO;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.presentation.view.HotelsRoomsListV5TariffLoaderView;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.presentation.view.HotelsRoomsListV5TariffView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001%B7\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\u0012\n\u0010\u000e\u001a\u00060\fj\u0002`\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\"R \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010#R\u0018\u0010\u000e\u001a\u00060\fj\u0002`\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010$¨\u0006&"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/rooms/adapters/tariffs/HotelsRoomsListV5TariffsAdapter;", "Ljk0/i;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/rooms/TariffState;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/rooms/adapters/tariffs/HotelsRoomsListV5TariffsStateViewHolder;", "Landroidx/lifecycle/J;", "lifecycleOwner", "Landroidx/recyclerview/widget/RecyclerView$u;", "recycledViewPool", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Landroidx/lifecycle/J;Landroidx/recyclerview/widget/RecyclerView$u;Lkotlin/jvm/functions/Function1;LWZ/l;)V", "holder", "onViewAttachedToWindow", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/rooms/adapters/tariffs/HotelsRoomsListV5TariffsStateViewHolder;)V", "onViewDetachedFromWindow", "", "position", "onBindViewHolder", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/rooms/adapters/tariffs/HotelsRoomsListV5TariffsStateViewHolder;I)V", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/rooms/adapters/tariffs/HotelsRoomsListV5TariffsStateViewHolder;", "getItemViewType", "(I)I", "Landroidx/recyclerview/widget/RecyclerView$u;", "getRecycledViewPool", "()Landroidx/recyclerview/widget/RecyclerView$u;", "Lkotlin/jvm/functions/Function1;", "LWZ/l;", "TariffsDiffUtil", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsRoomsListV5TariffsAdapter extends i<TariffState, HotelsRoomsListV5TariffsStateViewHolder> {

    @NotNull
    private final Function1<AtomAction, Unit> onAction;

    @NotNull
    private final RecyclerView.u recycledViewPool;

    @NotNull
    private final l tokenizedAnalytics;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/rooms/adapters/tariffs/HotelsRoomsListV5TariffsAdapter$TariffsDiffUtil;", "Landroidx/recyclerview/widget/i$d;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/rooms/TariffState;", "<init>", "()V", "oldItem", "newItem", "", "areItemsTheSame", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/rooms/TariffState;Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/rooms/TariffState;)Z", "areContentsTheSame", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class TariffsDiffUtil extends i.d<TariffState> {
        @Override // androidx.recyclerview.widget.i.d
        public boolean areContentsTheSame(@NotNull TariffState oldItem, @NotNull TariffState newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.d(oldItem, newItem);
        }

        @Override // androidx.recyclerview.widget.i.d
        public boolean areItemsTheSame(@NotNull TariffState oldItem, @NotNull TariffState newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return oldItem.getId() == newItem.getId();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HotelsRoomsListV5TariffsAdapter(@NotNull J lifecycleOwner, @NotNull RecyclerView.u recycledViewPool, @NotNull Function1<? super AtomAction, Unit> onAction, @NotNull l tokenizedAnalytics) {
        super(new TariffsDiffUtil(), lifecycleOwner, null, 4, null);
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(recycledViewPool, "recycledViewPool");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.recycledViewPool = recycledViewPool;
        this.onAction = onAction;
        this.tokenizedAnalytics = tokenizedAnalytics;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        TariffState item = getItem(position);
        if (item instanceof Placeholder) {
            return 1;
        }
        if (item instanceof TariffVO) {
            return R$id.hotelsRoomsListV5TariffsRv;
        }
        throw new o();
    }

    @NotNull
    public final RecyclerView.u getRecycledViewPool() {
        return this.recycledViewPool;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull HotelsRoomsListV5TariffsStateViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        TariffState item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.bind(item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public HotelsRoomsListV5TariffsStateViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == R$id.hotelsRoomsListV5TariffsRv) {
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            HotelsRoomsListV5TariffView hotelsRoomsListV5TariffView = new HotelsRoomsListV5TariffView(context);
            hotelsRoomsListV5TariffView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            return new HotelsRoomsListV5TariffsViewHolder(this.recycledViewPool, hotelsRoomsListV5TariffView, this.tokenizedAnalytics);
        }
        if (viewType != 1) {
            throw new IllegalArgumentException(b.a(viewType, "Unknown viewType: "));
        }
        Context context2 = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        HotelsRoomsListV5TariffLoaderView hotelsRoomsListV5TariffLoaderView = new HotelsRoomsListV5TariffLoaderView(context2);
        Context context3 = hotelsRoomsListV5TariffLoaderView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        hotelsRoomsListV5TariffLoaderView.setLayoutParams(new ViewGroup.LayoutParams(ResourceExtKt.toPx(294, context3), -2));
        return new HotelsRoomsListV5TariffLoaderViewHolder(hotelsRoomsListV5TariffLoaderView);
    }

    @Override // jk0.i
    public void onViewAttachedToWindow(@NotNull HotelsRoomsListV5TariffsStateViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onViewAttachedToWindow((HotelsRoomsListV5TariffsAdapter) holder);
        holder.setupOnAction(this.onAction);
    }

    @Override // jk0.i
    public void onViewDetachedFromWindow(@NotNull HotelsRoomsListV5TariffsStateViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.clearOnAction();
        super.onViewDetachedFromWindow((HotelsRoomsListV5TariffsAdapter) holder);
    }
}
