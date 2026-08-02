package ru.ozon.app.android.travel.feature.tours.widgets.toursRoomsList.v2.presentation.polling;

import Sc.o;
import Vg.d;
import android.view.View;
import d20.AbstractC6065b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.travel.feature.tours.widgets.toursRoomsList.v2.presentation.polling.ToursRoomsListV2PollingVO;
import ru.ozon.uni.atoms.af.AtomAction;
import z00.f;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000eR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000b0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursRoomsList/v2/presentation/polling/ToursRoomsListV2PollingViewHolder;", "Ld20/b;", "Lru/ozon/app/android/travel/feature/tours/widgets/toursRoomsList/v2/presentation/polling/ToursRoomsListV2PollingVO;", "Ll10/i;", "container", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "<init>", "(Ll10/i;LVg/d;)V", "item", "", "bind", "(Lru/ozon/app/android/travel/feature/tours/widgets/toursRoomsList/v2/presentation/polling/ToursRoomsListV2PollingVO;)V", "Ll10/i;", "Landroid/view/View;", "metricView", "Landroid/view/View;", "getMetricView", "()Landroid/view/View;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ToursRoomsListV2PollingViewHolder extends AbstractC6065b<ToursRoomsListV2PollingVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final i container;
    private final View metricView;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ToursRoomsListV2PollingVO.BehaviorType.values().length];
            try {
                iArr[ToursRoomsListV2PollingVO.BehaviorType.REMOVE_SKELETON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ToursRoomsListV2PollingVO.BehaviorType.SHOW_EMPTY_STATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ToursRoomsListV2PollingVO.BehaviorType.FETCH_STATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ToursRoomsListV2PollingViewHolder(@NotNull i container, @NotNull d customActionHandlersStoreFactory) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        this.container = container;
        this.actionHandler = new ActionHandler.Builder(container, this).customActionHandlers(new ToursRoomsListV2PollingViewHolder$actionHandler$1(customActionHandlersStoreFactory)).buildHandler();
    }

    @Override // d20.AbstractC6065b
    public View getMetricView() {
        return this.metricView;
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull ToursRoomsListV2PollingVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        int i11 = WhenMappings.$EnumSwitchMapping$0[item.getBehaviorType().ordinal()];
        if (i11 == 1) {
            this.container.M().m(item.getFirstSkeletonId());
        } else if (i11 == 2) {
            this.container.M().h(f.a.f106883a);
        } else {
            if (i11 != 3) {
                throw new o();
            }
            this.actionHandler.invoke(item.getLazyRefreshAction());
        }
    }
}
