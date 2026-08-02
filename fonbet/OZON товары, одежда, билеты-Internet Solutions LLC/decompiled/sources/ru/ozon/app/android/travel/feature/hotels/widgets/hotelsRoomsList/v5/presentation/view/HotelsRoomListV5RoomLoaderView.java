package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.presentation.view;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.presentation.loader.HotelsRoomsListV5LoaderVO;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.presentation.loader.adapter.HotelsRoomsListV5LoaderAdapter;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.presentation.rooms.adapters.HotelsRoomsListV5HorizontalItemDecoration;
import ru.ozon.app.android.travel.molecules.view.shimmer.RoundedShimmerView;
import ru.ozon.app.android.travel.utils.RoundedBackgroundProducer;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"J\b\u0010#\u001a\u00020 H\u0002J\b\u0010$\u001a\u00020 H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/view/HotelsRoomListV5RoomLoaderView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dp2", "", "dp8", "dp10", "dp12", "dp16", "dp24", "dp206", "dp208", "dp198", "dpf20", "", "roomBadgesLoaderAdapter", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/loader/adapter/HotelsRoomsListV5LoaderAdapter;", "tariffLoaderAdapter", "itemDecoration", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/rooms/adapters/HotelsRoomsListV5HorizontalItemDecoration;", "hotelsRoomsListV5ImagePlaceholderSv", "Lru/ozon/app/android/travel/molecules/view/shimmer/RoundedShimmerView;", "hotelsRoomsListV5NamePlaceholderSv", "hotelsRoomsListV5DetailPlaceholderSv", "hotelsRoomsListV5AccommodationPlaceholderSv", "hotelsRoomsListV5RoomBadgesPlaceholderRv", "Landroidx/recyclerview/widget/RecyclerView;", "hotelsRoomsListV5TariffsPlaceholderRv", "bind", "", "item", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/loader/HotelsRoomsListV5LoaderVO$PlaceholderVO;", "setupPadding", "setupConstraints", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsRoomListV5RoomLoaderView extends ConstraintLayout {
    private final int dp10;
    private final int dp12;
    private final int dp16;
    private final int dp198;
    private final int dp2;
    private final int dp206;
    private final int dp208;
    private final int dp24;
    private final int dp8;
    private final float dpf20;

    @NotNull
    private final RoundedShimmerView hotelsRoomsListV5AccommodationPlaceholderSv;

    @NotNull
    private final RoundedShimmerView hotelsRoomsListV5DetailPlaceholderSv;

    @NotNull
    private final RoundedShimmerView hotelsRoomsListV5ImagePlaceholderSv;

    @NotNull
    private final RoundedShimmerView hotelsRoomsListV5NamePlaceholderSv;

    @NotNull
    private final RecyclerView hotelsRoomsListV5RoomBadgesPlaceholderRv;

    @NotNull
    private final RecyclerView hotelsRoomsListV5TariffsPlaceholderRv;

    @NotNull
    private final HotelsRoomsListV5HorizontalItemDecoration itemDecoration;

    @NotNull
    private final HotelsRoomsListV5LoaderAdapter roomBadgesLoaderAdapter;

    @NotNull
    private final HotelsRoomsListV5LoaderAdapter tariffLoaderAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelsRoomListV5RoomLoaderView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.dp2 = ResourceExtKt.toPx(2, context);
        this.dp8 = ResourceExtKt.toPx(8, context);
        this.dp10 = ResourceExtKt.toPx(10, context);
        this.dp12 = ResourceExtKt.toPx(12, context);
        this.dp16 = ResourceExtKt.toPx(16, context);
        int px = ResourceExtKt.toPx(24, context);
        this.dp24 = px;
        int px2 = ResourceExtKt.toPx(206, context);
        this.dp206 = px2;
        int px3 = ResourceExtKt.toPx(208, context);
        this.dp208 = px3;
        int px4 = ResourceExtKt.toPx(198, context);
        this.dp198 = px4;
        float pxF = ResourceExtKt.toPxF(20, context);
        this.dpf20 = pxF;
        HotelsRoomsListV5LoaderAdapter hotelsRoomsListV5LoaderAdapter = new HotelsRoomsListV5LoaderAdapter();
        this.roomBadgesLoaderAdapter = hotelsRoomsListV5LoaderAdapter;
        HotelsRoomsListV5LoaderAdapter hotelsRoomsListV5LoaderAdapter2 = new HotelsRoomsListV5LoaderAdapter();
        this.tariffLoaderAdapter = hotelsRoomsListV5LoaderAdapter2;
        HotelsRoomsListV5HorizontalItemDecoration hotelsRoomsListV5HorizontalItemDecoration = new HotelsRoomsListV5HorizontalItemDecoration(context);
        this.itemDecoration = hotelsRoomsListV5HorizontalItemDecoration;
        RoundedShimmerView roundedShimmerView = new RoundedShimmerView(context, null, 0, 0, 14, null);
        roundedShimmerView.setId(View.generateViewId());
        roundedShimmerView.setLayoutParams(new ConstraintLayout.b(0, px2));
        roundedShimmerView.setCornerRadius(pxF);
        addView(roundedShimmerView);
        this.hotelsRoomsListV5ImagePlaceholderSv = roundedShimmerView;
        RoundedShimmerView roundedShimmerView2 = new RoundedShimmerView(context, null, 0, 0, 14, null);
        roundedShimmerView2.setId(View.generateViewId());
        roundedShimmerView2.setLayoutParams(new ConstraintLayout.b(0, px));
        addView(roundedShimmerView2);
        this.hotelsRoomsListV5NamePlaceholderSv = roundedShimmerView2;
        RoundedShimmerView roundedShimmerView3 = new RoundedShimmerView(context, null, 0, 0, 14, null);
        roundedShimmerView3.setId(View.generateViewId());
        roundedShimmerView3.setLayoutParams(new ConstraintLayout.b(px, px));
        addView(roundedShimmerView3);
        this.hotelsRoomsListV5DetailPlaceholderSv = roundedShimmerView3;
        RoundedShimmerView roundedShimmerView4 = new RoundedShimmerView(context, null, 0, 0, 14, null);
        roundedShimmerView4.setId(View.generateViewId());
        roundedShimmerView4.setLayoutParams(new ConstraintLayout.b(px3, px));
        addView(roundedShimmerView4);
        this.hotelsRoomsListV5AccommodationPlaceholderSv = roundedShimmerView4;
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setId(View.generateViewId());
        recyclerView.setLayoutParams(new ConstraintLayout.b(0, px));
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setAdapter(hotelsRoomsListV5LoaderAdapter);
        recyclerView.addItemDecoration(hotelsRoomsListV5HorizontalItemDecoration);
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
        addView(recyclerView);
        this.hotelsRoomsListV5RoomBadgesPlaceholderRv = recyclerView;
        RecyclerView recyclerView2 = new RecyclerView(context);
        recyclerView2.setId(View.generateViewId());
        recyclerView2.setLayoutParams(new ConstraintLayout.b(0, px4));
        recyclerView2.setNestedScrollingEnabled(false);
        recyclerView2.setAdapter(hotelsRoomsListV5LoaderAdapter2);
        recyclerView2.addItemDecoration(hotelsRoomsListV5HorizontalItemDecoration);
        recyclerView2.setLayoutManager(new LinearLayoutManager(context, 0, false));
        addView(recyclerView2);
        this.hotelsRoomsListV5TariffsPlaceholderRv = recyclerView2;
        setBackground(RoundedBackgroundProducer.produce$default(new RoundedBackgroundProducer(), ThemeExtKt.themeColor(context, R$attr.layerFloor1), 0.0f, 0.0f, 0.0f, 0.0f, 30, null));
        setupPadding();
        setupConstraints();
    }

    private final void setupConstraints() {
        ConstraintLayoutExtensionsKt.applyConstraint(this, new HotelsRoomListV5RoomLoaderView$setupConstraints$1(this));
    }

    private final void setupPadding() {
        setPadding(0, this.dp8, 0, this.dp16);
    }

    public final void bind(@NotNull HotelsRoomsListV5LoaderVO.PlaceholderVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        HotelsRoomsListV5LoaderVO.PlaceholderVO.Room room = item instanceof HotelsRoomsListV5LoaderVO.PlaceholderVO.Room ? (HotelsRoomsListV5LoaderVO.PlaceholderVO.Room) item : null;
        if (room != null) {
            this.roomBadgesLoaderAdapter.submitList(room.getRoomBadgePlaceholders());
            this.tariffLoaderAdapter.submitList(room.getTariffPlaceholders());
        }
    }
}
