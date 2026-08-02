package ru.ozon.app.android.travel.feature.general.common.widgets.timeoutAndAction.v2.presentation;

import A00.a;
import Vg.d;
import c20.r;
import d20.AbstractC6065b;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.widgets.timeoutAndAction.v2.data.TimeoutAndActionV2DTO;
import ru.ozon.app.android.travel.feature.general.common.widgets.timeoutAndAction.v2.di.TimeoutAndActionV2Component;
import ru.ozon.app.android.travel.feature.general.common.widgets.timeoutAndAction.v2.presentation.TimeoutAndActionV2VO;
import ru.ozon.app.android.travel.feature.general.common.widgets.timeoutAndAction.v2.presentation.update.TimeoutAndActionV2Update;
import ru.ozon.app.android.travel.feature.general.common.widgets.timeoutAndAction.v2.presentation.viewmodel.TimeoutAndActionV2AsyncWidgetViewModel;
import ru.ozon.app.android.travel.utils.timeoutAndAction.TimeoutAndActionV2StartPollingUpdate;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u0006\u0010\b\u001a\u00020\u00022\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0017\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019R\u001a\u0010\u001b\u001a\u00020\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR(\u0010 \u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u001f0\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/timeoutAndAction/v2/presentation/TimeoutAndActionV2ViewMapper;", "Lc20/r;", "Lru/ozon/app/android/travel/feature/general/common/widgets/timeoutAndAction/v2/data/TimeoutAndActionV2DTO;", "Lru/ozon/app/android/travel/feature/general/common/widgets/timeoutAndAction/v2/presentation/TimeoutAndActionV2VO;", "Lru/ozon/app/android/travel/feature/general/common/widgets/timeoutAndAction/v2/di/TimeoutAndActionV2Component;", "component", "<init>", "(Lru/ozon/app/android/travel/feature/general/common/widgets/timeoutAndAction/v2/di/TimeoutAndActionV2Component;)V", "state", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "map", "(Lru/ozon/app/android/travel/feature/general/common/widgets/timeoutAndAction/v2/data/TimeoutAndActionV2DTO;Ll20/d;)Ljava/util/List;", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/travel/feature/general/common/widgets/timeoutAndAction/v2/presentation/TimeoutAndActionV2VO;)Lru/ozon/app/android/travel/feature/general/common/widgets/timeoutAndAction/v2/presentation/TimeoutAndActionV2VO;", "Lru/ozon/app/android/travel/feature/general/common/widgets/timeoutAndAction/v2/di/TimeoutAndActionV2Component;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "Ljava/lang/Class;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TimeoutAndActionV2ViewMapper extends r<TimeoutAndActionV2DTO, TimeoutAndActionV2VO> {

    @NotNull
    private final TimeoutAndActionV2Component component;

    @NotNull
    private final List<Class<? extends a.J.InterfaceC0007a>> supportedUpdates;

    @NotNull
    private final r.a viewType;

    public TimeoutAndActionV2ViewMapper(@NotNull TimeoutAndActionV2Component component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
        this.viewType = r.a.MULTIPLE;
        this.supportedUpdates = C7714v.b0(TimeoutAndActionV2Update.class, TimeoutAndActionV2StartPollingUpdate.class);
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<TimeoutAndActionV2VO> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        d customActionHandlersStoreFactory = this.component.getCustomActionHandlersStoreFactory();
        TimeoutAndActionV2AsyncWidgetViewModel timeoutAndActionV2AsyncWidgetViewModel = this.component.getWidgetViewModelProvider().get();
        Intrinsics.checkNotNullExpressionValue(timeoutAndActionV2AsyncWidgetViewModel, "get(...)");
        return new TimeoutAndActionV2WidgetHolder(container, customActionHandlersStoreFactory, timeoutAndActionV2AsyncWidgetViewModel, this.component.getPerformanceTrackerDelegate());
    }

    @Override // c20.r, I00.d
    @NotNull
    public List<Class<? extends a.J.InterfaceC0007a>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // c20.r, I00.d
    public TimeoutAndActionV2VO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull TimeoutAndActionV2VO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (update instanceof TimeoutAndActionV2Update) {
            TimeoutAndActionV2Update timeoutAndActionV2Update = (TimeoutAndActionV2Update) update;
            if (oldItem.getId() == timeoutAndActionV2Update.getNewState().getId()) {
                return timeoutAndActionV2Update.getNewState();
            }
        }
        if ((update instanceof TimeoutAndActionV2StartPollingUpdate) && oldItem.getState().getTimerMode() == TimeoutAndActionV2VO.TimerMode.PENDING) {
            return TimeoutAndActionV2VO.copy$default(oldItem, 0L, TimeoutAndActionV2VO.State.copy$default(oldItem.getState(), TimeoutAndActionV2VO.TimerMode.POLLING, 0L, 0L, null, null, 30, null), null, 5, null);
        }
        return null;
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<TimeoutAndActionV2VO> map(@NotNull TimeoutAndActionV2DTO state, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return this.component.getMapper().invoke(state, info);
    }
}
