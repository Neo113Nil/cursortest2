package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.presentation.rooms.adapters.tariffs;

import WZ.l;
import WZ.t;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.presentation.rooms.TariffBadge;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.presentation.rooms.TariffState;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.presentation.rooms.TariffVO;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.presentation.view.HotelsRoomsListV5TariffView;
import ru.ozon.app.android.travel.molecules.view.starsBadge.v1.StarsBadgeVI;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0012\u001a\u00020\u000b2\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000b0\u000ej\u0002`\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\rJ\u0017\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019R\u0018\u0010\b\u001a\u00060\u0006j\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001aR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/rooms/adapters/tariffs/HotelsRoomsListV5TariffsViewHolder;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/rooms/adapters/tariffs/HotelsRoomsListV5TariffsStateViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$u;", "recycledViewPool", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/view/HotelsRoomsListV5TariffView;", "view", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Landroidx/recyclerview/widget/RecyclerView$u;Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/view/HotelsRoomsListV5TariffView;LWZ/l;)V", "", "onViewInVisibleBounds", "()V", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/action/BuildedActionHandler;", "onAction", "setupOnAction", "(Lkotlin/jvm/functions/Function1;)V", "clearOnAction", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/rooms/TariffState;", "item", "bind", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/rooms/TariffState;)V", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/view/HotelsRoomsListV5TariffView;", "LWZ/l;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/rooms/TariffVO;", "boundData", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/rooms/TariffVO;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsRoomsListV5TariffsViewHolder extends HotelsRoomsListV5TariffsStateViewHolder {
    private TariffVO boundData;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final HotelsRoomsListV5TariffView view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelsRoomsListV5TariffsViewHolder(@NotNull RecyclerView.u recycledViewPool, @NotNull HotelsRoomsListV5TariffView view, @NotNull l tokenizedAnalytics) {
        super(view);
        Intrinsics.checkNotNullParameter(recycledViewPool, "recycledViewPool");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.view = view;
        this.tokenizedAnalytics = tokenizedAnalytics;
        view.setRecyclerViewPool(recycledViewPool);
    }

    @Override // ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.presentation.rooms.adapters.tariffs.HotelsRoomsListV5TariffsStateViewHolder
    public void bind(@NotNull TariffState item) {
        Intrinsics.checkNotNullParameter(item, "item");
        TariffVO tariffVO = item instanceof TariffVO ? (TariffVO) item : null;
        if (tariffVO != null) {
            this.view.bind(tariffVO);
            this.boundData = tariffVO;
        }
    }

    @Override // ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.presentation.rooms.adapters.tariffs.HotelsRoomsListV5TariffsStateViewHolder
    public void clearOnAction() {
        this.view.setOnAction(null);
    }

    @Override // jk0.j, lk0.b
    public void onViewInVisibleBounds() {
        StarsBadgeVI starsBadge;
        t tokenizedEvent;
        t tokenizedEvent2;
        super.onViewInVisibleBounds();
        TariffVO tariffVO = this.boundData;
        if (tariffVO != null && (tokenizedEvent2 = tariffVO.getTokenizedEvent()) != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent2, null, 2, null);
        }
        TariffVO tariffVO2 = this.boundData;
        TariffBadge badge = tariffVO2 != null ? tariffVO2.getBadge() : null;
        TariffBadge.StarsBadge starsBadge2 = badge instanceof TariffBadge.StarsBadge ? (TariffBadge.StarsBadge) badge : null;
        if (starsBadge2 == null || (starsBadge = starsBadge2.getStarsBadge()) == null || (tokenizedEvent = starsBadge.getTokenizedEvent()) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent, null, 2, null);
    }

    @Override // ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.presentation.rooms.adapters.tariffs.HotelsRoomsListV5TariffsStateViewHolder
    public void setupOnAction(@NotNull Function1<? super AtomAction, Unit> onAction) {
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        this.view.setOnAction(onAction);
    }
}
