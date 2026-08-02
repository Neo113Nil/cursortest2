package ru.ozon.app.android.travel.feature.general.common.widgets.totalPriceWithButton.v2.di;

import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.travel.feature.general.common.widgets.totalPriceWithButton.v2.data.TotalPriceWithButtonV2Mapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.totalPriceWithButton.v2.data.TotalPriceWithButtonV2StickyMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.totalPriceWithButton.v2.data.TotalPriceWithButtonV2TimerMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.totalPriceWithButton.v2.presentation.TotalPriceWithButtonV2ViewModel;
import ru.ozon.app.android.travel.utils.timerFormatter.TimerFormatterImpl;

@Metadata(d1 = {"\u0000M\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001b\u0010\r\u001a\u00020\b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0012\u001a\u00020\u000e8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00138VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00188VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\n\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010!\u001a\u00060\u001dj\u0002`\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"ru/ozon/app/android/travel/feature/general/common/widgets/totalPriceWithButton/v2/di/TotalPriceWithButtonV2Component$Companion$create$1$1", "Lru/ozon/app/android/travel/feature/general/common/widgets/totalPriceWithButton/v2/di/TotalPriceWithButtonV2Component;", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "customActionHandlersComponentApi", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "Lru/ozon/app/android/travel/utils/timerFormatter/TimerFormatterImpl;", "timerFormatter", "Lru/ozon/app/android/travel/utils/timerFormatter/TimerFormatterImpl;", "Lru/ozon/app/android/travel/feature/general/common/widgets/totalPriceWithButton/v2/data/TotalPriceWithButtonV2Mapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/travel/feature/general/common/widgets/totalPriceWithButton/v2/data/TotalPriceWithButtonV2Mapper;", "mapper", "Lru/ozon/app/android/travel/feature/general/common/widgets/totalPriceWithButton/v2/data/TotalPriceWithButtonV2StickyMapper;", "stickyMapper$delegate", "getStickyMapper", "()Lru/ozon/app/android/travel/feature/general/common/widgets/totalPriceWithButton/v2/data/TotalPriceWithButtonV2StickyMapper;", "stickyMapper", "Lru/ozon/app/android/travel/feature/general/common/widgets/totalPriceWithButton/v2/data/TotalPriceWithButtonV2TimerMapper;", "timerMapper$delegate", "getTimerMapper", "()Lru/ozon/app/android/travel/feature/general/common/widgets/totalPriceWithButton/v2/data/TotalPriceWithButtonV2TimerMapper;", "timerMapper", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "inhibitor$delegate", "getInhibitor", "()Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "inhibitor", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/travel/feature/general/common/widgets/totalPriceWithButton/v2/presentation/TotalPriceWithButtonV2ViewModel;", "getWidgetViewModel", "()Lru/ozon/app/android/travel/feature/general/common/widgets/totalPriceWithButton/v2/presentation/TotalPriceWithButtonV2ViewModel;", "widgetViewModel", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TotalPriceWithButtonV2Component$Companion$create$1$1 implements TotalPriceWithButtonV2Component {
    private final CustomActionHandlersComponentApi customActionHandlersComponentApi;
    private final TimerFormatterImpl timerFormatter = new TimerFormatterImpl(null, null, 3, null);

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(new TotalPriceWithButtonV2Component$Companion$create$1$1$mapper$2(this));

    /* renamed from: stickyMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j stickyMapper = k.b(new TotalPriceWithButtonV2Component$Companion$create$1$1$stickyMapper$2(this));

    /* renamed from: timerMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j timerMapper = k.b(TotalPriceWithButtonV2Component$Companion$create$1$1$timerMapper$2.INSTANCE);

    /* renamed from: inhibitor$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j inhibitor = k.b(TotalPriceWithButtonV2Component$Companion$create$1$1$inhibitor$2.INSTANCE);

    TotalPriceWithButtonV2Component$Companion$create$1$1(C7475g c7475g) {
        this.customActionHandlersComponentApi = (CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class);
    }

    @Override // ru.ozon.app.android.travel.feature.general.common.widgets.totalPriceWithButton.v2.di.TotalPriceWithButtonV2Component
    public d getCustomActionHandlersStoreFactory() {
        return this.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
    }

    @Override // ru.ozon.app.android.travel.feature.general.common.widgets.totalPriceWithButton.v2.di.TotalPriceWithButtonV2Component
    public HandlersInhibitor getInhibitor() {
        return (HandlersInhibitor) this.inhibitor.getValue();
    }

    @Override // ru.ozon.app.android.travel.feature.general.common.widgets.totalPriceWithButton.v2.di.TotalPriceWithButtonV2Component
    public TotalPriceWithButtonV2Mapper getMapper() {
        return (TotalPriceWithButtonV2Mapper) this.mapper.getValue();
    }

    @Override // ru.ozon.app.android.travel.feature.general.common.widgets.totalPriceWithButton.v2.di.TotalPriceWithButtonV2Component
    public TotalPriceWithButtonV2StickyMapper getStickyMapper() {
        return (TotalPriceWithButtonV2StickyMapper) this.stickyMapper.getValue();
    }

    @Override // ru.ozon.app.android.travel.feature.general.common.widgets.totalPriceWithButton.v2.di.TotalPriceWithButtonV2Component
    public TotalPriceWithButtonV2TimerMapper getTimerMapper() {
        return (TotalPriceWithButtonV2TimerMapper) this.timerMapper.getValue();
    }

    @Override // ru.ozon.app.android.travel.feature.general.common.widgets.totalPriceWithButton.v2.di.TotalPriceWithButtonV2Component
    public TotalPriceWithButtonV2ViewModel getWidgetViewModel() {
        return new TotalPriceWithButtonV2ViewModel(getMapper());
    }
}
