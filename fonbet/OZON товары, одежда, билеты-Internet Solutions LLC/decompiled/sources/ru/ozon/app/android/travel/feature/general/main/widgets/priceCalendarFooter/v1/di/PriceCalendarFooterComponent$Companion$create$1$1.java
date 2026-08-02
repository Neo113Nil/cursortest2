package ru.ozon.app.android.travel.feature.general.main.widgets.priceCalendarFooter.v1.di;

import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.travel.calendar.viewModel.CalendarViewModel;
import ru.ozon.app.android.travel.feature.general.main.widgets.priceCalendarFooter.v1.data.PriceCalendarFooterApi;
import ru.ozon.app.android.travel.feature.general.main.widgets.priceCalendarFooter.v1.data.PriceCalendarFooterMapper;
import ru.ozon.app.android.travel.feature.general.main.widgets.priceCalendarFooter.v1.presentation.PriceCalendarFooterViewModel;

@Metadata(d1 = {"\u0000Q\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001b\u0010\r\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0015\u001a\u00020\u00118VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\n\u001a\u0004\b\u0013\u0010\u0014R!\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\n\u001a\u0004\b\u0019\u0010\u001aR!\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00168VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\n\u001a\u0004\b\u001e\u0010\u001aR\u0018\u0010$\u001a\u00060 j\u0002`!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"ru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarFooter/v1/di/PriceCalendarFooterComponent$Companion$create$1$1", "Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarFooter/v1/di/PriceCalendarFooterComponent;", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "customActionHandlersComponentApi", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarFooter/v1/data/PriceCalendarFooterApi;", "priceCalendarFooterApi$delegate", "LSc/j;", "getPriceCalendarFooterApi", "()Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarFooter/v1/data/PriceCalendarFooterApi;", "priceCalendarFooterApi", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "retainComposerComponentApi", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarFooter/v1/data/PriceCalendarFooterMapper;", "mapper$delegate", "getMapper", "()Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarFooter/v1/data/PriceCalendarFooterMapper;", "mapper", "LPc/a;", "Lru/ozon/app/android/travel/calendar/viewModel/CalendarViewModel;", "calendarViewModelProvider$delegate", "getCalendarViewModelProvider", "()LPc/a;", "calendarViewModelProvider", "Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarFooter/v1/presentation/PriceCalendarFooterViewModel;", "priceCalendarFooterViewModelProvider$delegate", "getPriceCalendarFooterViewModelProvider", "priceCalendarFooterViewModelProvider", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PriceCalendarFooterComponent$Companion$create$1$1 implements PriceCalendarFooterComponent {
    private final CustomActionHandlersComponentApi customActionHandlersComponentApi;
    private final NetworkComponentApi networkComponentApi;
    private final RetainComposerComponentApi retainComposerComponentApi;

    /* renamed from: priceCalendarFooterApi$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j priceCalendarFooterApi = k.b(new PriceCalendarFooterComponent$Companion$create$1$1$priceCalendarFooterApi$2(this));

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(PriceCalendarFooterComponent$Companion$create$1$1$mapper$2.INSTANCE);

    /* renamed from: calendarViewModelProvider$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j calendarViewModelProvider = k.b(PriceCalendarFooterComponent$Companion$create$1$1$calendarViewModelProvider$2.INSTANCE);

    /* renamed from: priceCalendarFooterViewModelProvider$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j priceCalendarFooterViewModelProvider = k.b(new PriceCalendarFooterComponent$Companion$create$1$1$priceCalendarFooterViewModelProvider$2(this));

    PriceCalendarFooterComponent$Companion$create$1$1(C7475g c7475g) {
        this.networkComponentApi = (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class);
        this.customActionHandlersComponentApi = (CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class);
        this.retainComposerComponentApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PriceCalendarFooterApi getPriceCalendarFooterApi() {
        Object value = this.priceCalendarFooterApi.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (PriceCalendarFooterApi) value;
    }

    @Override // ru.ozon.app.android.travel.feature.general.main.widgets.priceCalendarFooter.v1.di.PriceCalendarFooterComponent
    public Pc.a<CalendarViewModel> getCalendarViewModelProvider() {
        return (Pc.a) this.calendarViewModelProvider.getValue();
    }

    @Override // ru.ozon.app.android.travel.feature.general.main.widgets.priceCalendarFooter.v1.di.PriceCalendarFooterComponent
    public d getCustomActionHandlersStoreFactory() {
        return this.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
    }

    @Override // ru.ozon.app.android.travel.feature.general.main.widgets.priceCalendarFooter.v1.di.PriceCalendarFooterComponent
    public PriceCalendarFooterMapper getMapper() {
        return (PriceCalendarFooterMapper) this.mapper.getValue();
    }

    @Override // ru.ozon.app.android.travel.feature.general.main.widgets.priceCalendarFooter.v1.di.PriceCalendarFooterComponent
    public Pc.a<PriceCalendarFooterViewModel> getPriceCalendarFooterViewModelProvider() {
        return (Pc.a) this.priceCalendarFooterViewModelProvider.getValue();
    }
}
