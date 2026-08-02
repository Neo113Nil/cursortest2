package ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelScrollPriceCalendar.v1.di;

import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelScrollPriceCalendar.v1.data.TravelScrollPriceCalendarMapper;
import ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelScrollPriceCalendar.v1.presentation.TravelScrollPriceCalendarViewModel;

@Metadata(d1 = {"\u00009\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001b\u0010\r\u001a\u00020\b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR!\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0018\u001a\u00060\u0014j\u0002`\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"ru/ozon/app/android/travel/feature/oldwidgets/widgets/travelScrollPriceCalendar/v1/di/TravelScrollPriceCalendarComponent$Companion$create$1$1", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelScrollPriceCalendar/v1/di/TravelScrollPriceCalendarComponent;", "Lru/ozon/app/android/action/di/ActionComponentApi;", "actionComponentApi", "Lru/ozon/app/android/action/di/ActionComponentApi;", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "retainComposerComponentApi", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelScrollPriceCalendar/v1/data/TravelScrollPriceCalendarMapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelScrollPriceCalendar/v1/data/TravelScrollPriceCalendarMapper;", "mapper", "LPc/a;", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelScrollPriceCalendar/v1/presentation/TravelScrollPriceCalendarViewModel;", "widgetViewModelProvider$delegate", "getWidgetViewModelProvider", "()LPc/a;", "widgetViewModelProvider", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelScrollPriceCalendarComponent$Companion$create$1$1 implements TravelScrollPriceCalendarComponent {
    private final ActionComponentApi actionComponentApi;
    private final RetainComposerComponentApi retainComposerComponentApi;

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(TravelScrollPriceCalendarComponent$Companion$create$1$1$mapper$2.INSTANCE);

    /* renamed from: widgetViewModelProvider$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j widgetViewModelProvider = k.b(new TravelScrollPriceCalendarComponent$Companion$create$1$1$widgetViewModelProvider$2(this));

    TravelScrollPriceCalendarComponent$Companion$create$1$1(C7475g c7475g) {
        this.actionComponentApi = (ActionComponentApi) c7475g.getComponent(ActionComponentApi.class);
        this.retainComposerComponentApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
    }

    @Override // ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelScrollPriceCalendar.v1.di.TravelScrollPriceCalendarComponent
    public TravelScrollPriceCalendarMapper getMapper() {
        return (TravelScrollPriceCalendarMapper) this.mapper.getValue();
    }

    @Override // ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelScrollPriceCalendar.v1.di.TravelScrollPriceCalendarComponent
    public l getTokenizedAnalytics() {
        return this.retainComposerComponentApi.getTokenizedAnalytics();
    }

    @Override // ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelScrollPriceCalendar.v1.di.TravelScrollPriceCalendarComponent
    public Pc.a<TravelScrollPriceCalendarViewModel> getWidgetViewModelProvider() {
        return (Pc.a) this.widgetViewModelProvider.getValue();
    }
}
