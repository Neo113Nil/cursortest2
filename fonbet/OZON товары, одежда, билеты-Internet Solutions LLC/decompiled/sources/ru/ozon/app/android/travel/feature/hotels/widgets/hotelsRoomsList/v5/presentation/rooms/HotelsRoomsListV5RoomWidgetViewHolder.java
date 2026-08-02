package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.presentation.rooms;

import Vg.d;
import WZ.l;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.presentation.rooms.adapters.images.HotelsRoomsListV5ImagesAdapter;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.presentation.rooms.adapters.roomBadges.HotelsRoomsListV5RoomBadgesAdapter;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.presentation.rooms.adapters.tariffs.HotelsRoomsListV5TariffsAdapter;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.presentation.view.HotelsRoomsListV5View;
import ru.ozon.app.android.travel.utils.fontScaleProvider.FontScaleProvider;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B7\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t\u0012\n\u0010\r\u001a\u00060\u000bj\u0002`\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J'\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u001b\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R \u0010$\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00120\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00062"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/rooms/HotelsRoomsListV5RoomWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/rooms/HotelsRoomsListV5RoomVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/view/HotelsRoomsListV5View;", "hotelsRoomsListView", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lru/ozon/app/android/travel/utils/fontScaleProvider/FontScaleProvider;", "fontScaleProvider", "<init>", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/view/HotelsRoomsListV5View;Lru/ozon/app/android/composer/ComposerReferences;LVg/d;LWZ/l;Lru/ozon/app/android/travel/utils/fontScaleProvider/FontScaleProvider;)V", "", "onAttach", "()V", "onDetach", "item", "Ll20/d;", "info", "", "payload", "bind", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/rooms/HotelsRoomsListV5RoomVO;Ll20/d;Ljava/lang/Object;)V", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/rooms/HotelsRoomsListV5RoomVO;Ll20/d;)V", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/view/HotelsRoomsListV5View;", "Landroidx/recyclerview/widget/RecyclerView$u;", "recycledViewPool", "Landroidx/recyclerview/widget/RecyclerView$u;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/rooms/adapters/images/HotelsRoomsListV5ImagesAdapter;", "imagesAdapter", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/rooms/adapters/images/HotelsRoomsListV5ImagesAdapter;", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "accommodationAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/rooms/adapters/roomBadges/HotelsRoomsListV5RoomBadgesAdapter;", "roomBadgesAdapter", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/rooms/adapters/roomBadges/HotelsRoomsListV5RoomBadgesAdapter;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/rooms/adapters/tariffs/HotelsRoomsListV5TariffsAdapter;", "tariffsAdapter", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/rooms/adapters/tariffs/HotelsRoomsListV5TariffsAdapter;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsRoomsListV5RoomWidgetViewHolder extends k<HotelsRoomsListV5RoomVO> {

    @NotNull
    private final AtomsAdapter accommodationAdapter;

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final HotelsRoomsListV5View hotelsRoomsListView;

    @NotNull
    private final HotelsRoomsListV5ImagesAdapter imagesAdapter;

    @NotNull
    private final RecyclerView.u recycledViewPool;

    @NotNull
    private final HotelsRoomsListV5RoomBadgesAdapter roomBadgesAdapter;

    @NotNull
    private final HotelsRoomsListV5TariffsAdapter tariffsAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelsRoomsListV5RoomWidgetViewHolder(@NotNull HotelsRoomsListV5View hotelsRoomsListView, @NotNull ComposerReferences references, @NotNull d customActionHandlersStoreFactory, @NotNull l tokenizedAnalytics, @NotNull FontScaleProvider fontScaleProvider) {
        super(hotelsRoomsListView);
        Intrinsics.checkNotNullParameter(hotelsRoomsListView, "hotelsRoomsListView");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(fontScaleProvider, "fontScaleProvider");
        this.hotelsRoomsListView = hotelsRoomsListView;
        RecyclerView.u viewPool = references.getComposerViewPoolProvider().getViewPool();
        this.recycledViewPool = viewPool;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(references, this).customActionHandlers(new HotelsRoomsListV5RoomWidgetViewHolder$actionHandler$1(customActionHandlersStoreFactory)).buildHandler();
        this.actionHandler = buildHandler;
        HotelsRoomsListV5ImagesAdapter hotelsRoomsListV5ImagesAdapter = new HotelsRoomsListV5ImagesAdapter(getContext(), new HotelsRoomsListV5RoomWidgetViewHolder$imagesAdapter$1(this, tokenizedAnalytics, references));
        this.imagesAdapter = hotelsRoomsListV5ImagesAdapter;
        AtomsAdapter atomsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
        this.accommodationAdapter = atomsAdapter;
        HotelsRoomsListV5RoomBadgesAdapter hotelsRoomsListV5RoomBadgesAdapter = new HotelsRoomsListV5RoomBadgesAdapter();
        this.roomBadgesAdapter = hotelsRoomsListV5RoomBadgesAdapter;
        HotelsRoomsListV5TariffsAdapter hotelsRoomsListV5TariffsAdapter = new HotelsRoomsListV5TariffsAdapter(this, viewPool, buildHandler, tokenizedAnalytics);
        this.tariffsAdapter = hotelsRoomsListV5TariffsAdapter;
        hotelsRoomsListView.setImageAdapter(hotelsRoomsListV5ImagesAdapter, viewPool);
        hotelsRoomsListView.setRoomBadgesAdapter(hotelsRoomsListV5RoomBadgesAdapter, viewPool);
        hotelsRoomsListView.setAccommodationAdapter(atomsAdapter);
        hotelsRoomsListView.setTariffsAdapter(hotelsRoomsListV5TariffsAdapter);
        hotelsRoomsListView.setFontScaleProvider(fontScaleProvider);
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        this.hotelsRoomsListView.onAttach(getBoundData());
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        this.hotelsRoomsListView.onDetach(getBoundData());
        super.onDetach();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull HotelsRoomsListV5RoomVO item, @NotNull l20.d info, @NotNull Object payload) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(payload, "payload");
        HotelsRoomsListV5View hotelsRoomsListV5View = this.hotelsRoomsListView;
        if (!(payload instanceof HotelsRoomsListV5Payload)) {
            super.bind((HotelsRoomsListV5RoomWidgetViewHolder) item, info, payload);
            return;
        }
        HotelsRoomsListV5Payload hotelsRoomsListV5Payload = (HotelsRoomsListV5Payload) payload;
        if (hotelsRoomsListV5Payload.areImagesChanged()) {
            hotelsRoomsListV5View.bindImages(item.getImages(), true);
        }
        if (hotelsRoomsListV5Payload.areTagsChanged()) {
            hotelsRoomsListV5View.bindTags(item.getTags(), item.getAreTagsVisible());
        }
        if (hotelsRoomsListV5Payload.isNameChanged()) {
            hotelsRoomsListV5View.bindName(item.getName(), this.actionHandler);
        }
        if (hotelsRoomsListV5Payload.isDetailBadgeChanged()) {
            hotelsRoomsListV5View.bindDetailBadge(item.getDetailBadge(), item.getOpenDetailAction(), this.actionHandler);
        }
        if (hotelsRoomsListV5Payload.isAccommodationChanged()) {
            hotelsRoomsListV5View.bindAccommodation(item.getAccommodation(), item.getAreAccommodationVisible());
        }
        if (hotelsRoomsListV5Payload.areRoomBadgesChanged()) {
            hotelsRoomsListV5View.bindRoomBadges(item.getRoomBadges(), item.getAreRoomBadgesVisible());
        }
        if (hotelsRoomsListV5Payload.areTariffsChanged()) {
            hotelsRoomsListV5View.bindTariffs(item.getTariffs(), getLifecycle(), item.getTariffLayoutCache(), item.getIsTariffsLoaderVisible());
        }
        if (hotelsRoomsListV5Payload.areButtonChanged()) {
            hotelsRoomsListV5View.bindButton(item.getButton(), this.actionHandler);
        }
        if (hotelsRoomsListV5Payload.isRoomsLeftBadgeChanged()) {
            hotelsRoomsListV5View.bindRoomsLeftBadge(item.getRoomsLeftBadge(), this.actionHandler);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull HotelsRoomsListV5RoomVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        HotelsRoomsListV5View hotelsRoomsListV5View = this.hotelsRoomsListView;
        HotelsRoomsListV5View.bindImages$default(hotelsRoomsListV5View, item.getImages(), false, 2, null);
        hotelsRoomsListV5View.bindTags(item.getTags(), item.getAreTagsVisible());
        hotelsRoomsListV5View.bindName(item.getName(), this.actionHandler);
        hotelsRoomsListV5View.bindDetailBadge(item.getDetailBadge(), item.getOpenDetailAction(), this.actionHandler);
        hotelsRoomsListV5View.bindAccommodation(item.getAccommodation(), item.getAreAccommodationVisible());
        hotelsRoomsListV5View.bindRoomBadges(item.getRoomBadges(), item.getAreRoomBadgesVisible());
        hotelsRoomsListV5View.bindTariffs(item.getTariffs(), getLifecycle(), item.getTariffLayoutCache(), item.getIsTariffsLoaderVisible());
        hotelsRoomsListV5View.bindButton(item.getButton(), this.actionHandler);
        hotelsRoomsListV5View.bindRoomsLeftBadge(item.getRoomsLeftBadge(), this.actionHandler);
    }
}
