package ru.ozon.app.android.travel.feature.tours.widgets.toursRoomsList.v2.presentation.polling;

import A00.a;
import c20.r;
import d20.AbstractC6065b;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.actionhandler.utils.TravelResultActionV2ErrorUpdate;
import ru.ozon.app.android.travel.feature.tours.widgets.toursRoomsList.v2.data.ToursRoomsListV2DTO;
import ru.ozon.app.android.travel.feature.tours.widgets.toursRoomsList.v2.data.ToursRoomsListV2PollingMapper;
import ru.ozon.app.android.travel.feature.tours.widgets.toursRoomsList.v2.di.ToursRoomsListV2Component;
import ru.ozon.app.android.travel.feature.tours.widgets.toursRoomsList.v2.presentation.polling.ToursRoomsListV2PollingVO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u00142\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u001a\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\u001a\u0010\u001e\u001a\u00020\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R&\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"0\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0014\u0010+\u001a\u00020(8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursRoomsList/v2/presentation/polling/ToursRoomsListV2PollingViewMapper;", "Lc20/r;", "Lru/ozon/app/android/travel/feature/tours/widgets/toursRoomsList/v2/data/ToursRoomsListV2DTO;", "Lru/ozon/app/android/travel/feature/tours/widgets/toursRoomsList/v2/presentation/polling/ToursRoomsListV2PollingVO;", "Lru/ozon/app/android/travel/feature/tours/widgets/toursRoomsList/v2/di/ToursRoomsListV2Component;", "component", "<init>", "(Lru/ozon/app/android/travel/feature/tours/widgets/toursRoomsList/v2/di/ToursRoomsListV2Component;)V", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/travel/feature/tours/widgets/toursRoomsList/v2/data/ToursRoomsListV2DTO;Ll20/d;)Ljava/util/List;", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/travel/feature/tours/widgets/toursRoomsList/v2/presentation/polling/ToursRoomsListV2PollingVO;)Lru/ozon/app/android/travel/feature/tours/widgets/toursRoomsList/v2/presentation/polling/ToursRoomsListV2PollingVO;", "Lru/ozon/app/android/travel/feature/tours/widgets/toursRoomsList/v2/di/ToursRoomsListV2Component;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "Ljava/lang/Class;", "Lru/ozon/app/android/travel/actionhandler/utils/TravelResultActionV2ErrorUpdate;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Lru/ozon/app/android/travel/feature/tours/widgets/toursRoomsList/v2/data/ToursRoomsListV2PollingMapper;", "getMapper", "()Lru/ozon/app/android/travel/feature/tours/widgets/toursRoomsList/v2/data/ToursRoomsListV2PollingMapper;", "mapper", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ToursRoomsListV2PollingViewMapper extends r<ToursRoomsListV2DTO, ToursRoomsListV2PollingVO> {

    @NotNull
    private final ToursRoomsListV2Component component;

    @NotNull
    private final List<Class<TravelResultActionV2ErrorUpdate>> supportedUpdates;

    @NotNull
    private final r.a viewType;

    public ToursRoomsListV2PollingViewMapper(@NotNull ToursRoomsListV2Component component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
        this.viewType = r.a.SINGLE;
        this.supportedUpdates = C7714v.a0(TravelResultActionV2ErrorUpdate.class);
    }

    private final ToursRoomsListV2PollingMapper getMapper() {
        return this.component.getToursRoomsListV2PollingMapper();
    }

    @Override // c20.r, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return (state instanceof ToursRoomsListV2DTO) && ((ToursRoomsListV2DTO) state).getBehaviorType() != ToursRoomsListV2DTO.BehaviorType.NO_ACTION;
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<ToursRoomsListV2PollingVO> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return new ToursRoomsListV2PollingViewHolder(container, this.component.getCustomActionHandlersStoreFactory());
    }

    @Override // c20.r, I00.d
    @NotNull
    public List<Class<TravelResultActionV2ErrorUpdate>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // c20.r, I00.d
    public ToursRoomsListV2PollingVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull ToursRoomsListV2PollingVO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (update instanceof TravelResultActionV2ErrorUpdate) {
            String actionName = ((TravelResultActionV2ErrorUpdate) update).getActionName();
            AtomAction lazyRefreshAction = oldItem.getLazyRefreshAction();
            AtomAction.ComposerAction composerAction = lazyRefreshAction instanceof AtomAction.ComposerAction ? (AtomAction.ComposerAction) lazyRefreshAction : null;
            if (Intrinsics.d(actionName, composerAction != null ? composerAction.getActionName() : null)) {
                return ToursRoomsListV2PollingVO.copy$default(oldItem, 0L, null, 0L, false, oldItem.getIsRoomsListEmpty() ? ToursRoomsListV2PollingVO.BehaviorType.SHOW_EMPTY_STATE : ToursRoomsListV2PollingVO.BehaviorType.REMOVE_SKELETON, 15, null);
            }
        }
        return null;
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<ToursRoomsListV2PollingVO> map(@NotNull ToursRoomsListV2DTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return getMapper().invoke(state, info);
    }
}
