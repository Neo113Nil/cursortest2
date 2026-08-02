package ru.ozon.app.android.travel.feature.general.order.widgets.travelOrderListMobile.presentation.timer;

import a00.j;
import androidx.lifecycle.w0;
import c20.r;
import d20.AbstractC6065b;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l10.i;
import l10.v;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.overlay.OverlayWidgetScreenViewItemMapper2;
import ru.ozon.app.android.travel.feature.general.order.widgets.travelOrderListMobile.data.TravelOrderListMobileDTO;
import ru.ozon.app.android.travel.feature.general.order.widgets.travelOrderListMobile.di.TravelOrderListTimerComponent;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\u00132\b\u0010\u0007\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0019j\b\u0012\u0004\u0012\u00020\u0002`\u001a2\n\u0010\u0018\u001a\u00060\u0016j\u0002`\u0017H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001e\u001a\u00020\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderListMobile/presentation/timer/TravelOrderListTimeViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/OverlayWidgetScreenViewItemMapper2;", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderListMobile/di/TravelOrderListTimerComponent;", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderListMobile/data/TravelOrderListMobileDTO;", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderListMobile/presentation/timer/TravelOrderListTimerVO;", "<init>", "()V", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderListMobile/data/TravelOrderListMobileDTO;Ll20/d;)Ljava/util/List;", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "", "", "canMap", "(Ljava/lang/Object;)Z", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TravelOrderListTimeViewMapper extends OverlayWidgetScreenViewItemMapper2<TravelOrderListTimerComponent, TravelOrderListMobileDTO, TravelOrderListTimerVO> {

    @NotNull
    private final r.a viewType = r.a.SINGLE;

    @Override // c20.r, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        if (!(state instanceof TravelOrderListMobileDTO)) {
            return false;
        }
        TravelOrderListMobileDTO travelOrderListMobileDTO = (TravelOrderListMobileDTO) state;
        return (travelOrderListMobileDTO.getTimerTimeLeft() == null || travelOrderListMobileDTO.getTimerAction() == null) ? false : true;
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<TravelOrderListTimerVO> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        v b02 = container.b0();
        return new TravelOrderListTimeWidgetViewHolder(container, (TravelOrderListTimerViewModel) ((w0) j.a(b02.a(), N.b(TravelOrderListTimerViewModel.class), new TravelOrderListTimeViewMapper$createHolder$1(this)).getValue()));
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<TravelOrderListTimerComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return TravelOrderListTimerComponent.INSTANCE.create();
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<TravelOrderListTimerVO> map(@NotNull TravelOrderListMobileDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return component().getMapper().invoke(state, info);
    }
}
