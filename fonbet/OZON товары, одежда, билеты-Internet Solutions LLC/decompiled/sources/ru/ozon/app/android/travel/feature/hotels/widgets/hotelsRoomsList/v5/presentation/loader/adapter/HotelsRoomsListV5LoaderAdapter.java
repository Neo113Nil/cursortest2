package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.presentation.loader.adapter;

import Ej.b;
import Sc.o;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.presentation.loader.HotelsRoomsListV5LoaderVO;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.presentation.view.HotelsRoomListV5RoomLoaderView;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.presentation.view.HotelsRoomsListV5TariffLoaderView;
import ru.ozon.app.android.travel.molecules.view.shimmer.RoundedShimmerView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0017\u001a\u00020\b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0007¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/loader/adapter/HotelsRoomsListV5LoaderAdapter;", "Landroidx/recyclerview/widget/RecyclerView$g;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/loader/adapter/HotelsRoomsListV5LoaderViewHolder;", "<init>", "()V", "holder", "", "position", "", "onBindViewHolder", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/loader/adapter/HotelsRoomsListV5LoaderViewHolder;I)V", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/loader/adapter/HotelsRoomsListV5LoaderViewHolder;", "getItemViewType", "(I)I", "getItemCount", "()I", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/loader/HotelsRoomsListV5LoaderVO$PlaceholderVO;", "list", "submitList", "(Ljava/util/List;)V", "", "items", "Ljava/util/List;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsRoomsListV5LoaderAdapter extends RecyclerView.g<HotelsRoomsListV5LoaderViewHolder> {

    @NotNull
    private final List<HotelsRoomsListV5LoaderVO.PlaceholderVO> items = new ArrayList();

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: getItemCount */
    public int getShimmersCount() {
        return this.items.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        HotelsRoomsListV5LoaderVO.PlaceholderVO placeholderVO = this.items.get(position);
        if (placeholderVO instanceof HotelsRoomsListV5LoaderVO.PlaceholderVO.Room) {
            return 1;
        }
        if (placeholderVO instanceof HotelsRoomsListV5LoaderVO.PlaceholderVO.RoomBadge) {
            return 2;
        }
        if (placeholderVO instanceof HotelsRoomsListV5LoaderVO.PlaceholderVO.Tariff) {
            return 3;
        }
        throw new o();
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void submitList(@NotNull List<? extends HotelsRoomsListV5LoaderVO.PlaceholderVO> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        List<HotelsRoomsListV5LoaderVO.PlaceholderVO> list2 = this.items;
        list2.clear();
        list2.addAll(list);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull HotelsRoomsListV5LoaderViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.items.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public HotelsRoomsListV5LoaderViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == 1) {
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            HotelsRoomListV5RoomLoaderView hotelsRoomListV5RoomLoaderView = new HotelsRoomListV5RoomLoaderView(context);
            hotelsRoomListV5RoomLoaderView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            return new HotelsRoomsListV5RoomLoaderViewHolder(hotelsRoomListV5RoomLoaderView);
        }
        if (viewType == 2) {
            Context context2 = parent.getContext();
            Intrinsics.f(context2);
            RoundedShimmerView roundedShimmerView = new RoundedShimmerView(context2, null, 0, 0, 14, null);
            roundedShimmerView.setLayoutParams(new ViewGroup.LayoutParams(ResourceExtKt.toPx(100, context2), ResourceExtKt.toPx(24, context2)));
            return new HotelsRoomsListV5RoomBadgeLoaderViewHolder(roundedShimmerView);
        }
        if (viewType != 3) {
            throw new IllegalArgumentException(b.a(viewType, "Unknown viewType: "));
        }
        Context context3 = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        HotelsRoomsListV5TariffLoaderView hotelsRoomsListV5TariffLoaderView = new HotelsRoomsListV5TariffLoaderView(context3);
        Context context4 = hotelsRoomsListV5TariffLoaderView.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        hotelsRoomsListV5TariffLoaderView.setLayoutParams(new ViewGroup.LayoutParams(ResourceExtKt.toPx(294, context4), -2));
        return new HotelsRoomsListV5TariffLoaderViewHolder(hotelsRoomsListV5TariffLoaderView);
    }
}
