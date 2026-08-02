package ru.ozon.app.android.travel.feature.general.main.widgets.priceCalendarFooter.v3.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.composer.widgets.async.data.ComposerAsyncWidgetRepository;
import ru.ozon.app.android.composer.widgets.async.di.ComposerWidgetAsyncComponentApi;
import ru.ozon.app.android.travel.feature.general.main.widgets.priceCalendarFooter.v3.data.PriceCalendarFooterV3Mapper;
import ru.ozon.app.android.travel.feature.general.main.widgets.priceCalendarFooter.v3.presentation.PriceCalendarFooterV3WidgetViewModel;
import ru.ozon.app.android.utils.dispatcherprovider.di.CoroutineDispatchersComponentApi;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LPc/a;", "Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarFooter/v3/presentation/PriceCalendarFooterV3WidgetViewModel;", "invoke", "()LPc/a;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class PriceCalendarFooterV3Component$Companion$create$1$1$widgetViewModelProvider$2 extends AbstractC7737t implements Function0<Pc.a<PriceCalendarFooterV3WidgetViewModel>> {
    final /* synthetic */ PriceCalendarFooterV3Component$Companion$create$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PriceCalendarFooterV3Component$Companion$create$1$1$widgetViewModelProvider$2(PriceCalendarFooterV3Component$Companion$create$1$1 priceCalendarFooterV3Component$Companion$create$1$1) {
        super(0);
        this.this$0 = priceCalendarFooterV3Component$Companion$create$1$1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PriceCalendarFooterV3WidgetViewModel invoke$lambda$0(PriceCalendarFooterV3Component$Companion$create$1$1 priceCalendarFooterV3Component$Companion$create$1$1) {
        ComposerWidgetAsyncComponentApi composerWidgetAsyncComponentApi;
        CoroutineDispatchersComponentApi coroutineDispatchersComponentApi;
        composerWidgetAsyncComponentApi = priceCalendarFooterV3Component$Companion$create$1$1.composerWidgetAsyncComponentApi;
        ComposerAsyncWidgetRepository composerAsyncWidgetRepository = composerWidgetAsyncComponentApi.getComposerAsyncWidgetRepository();
        PriceCalendarFooterV3Mapper mapper = priceCalendarFooterV3Component$Companion$create$1$1.getMapper();
        coroutineDispatchersComponentApi = priceCalendarFooterV3Component$Companion$create$1$1.coroutineDispatchersComponentApi;
        return new PriceCalendarFooterV3WidgetViewModel(composerAsyncWidgetRepository, mapper, coroutineDispatchersComponentApi.getDispatcherProvider());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Pc.a<PriceCalendarFooterV3WidgetViewModel> invoke() {
        final PriceCalendarFooterV3Component$Companion$create$1$1 priceCalendarFooterV3Component$Companion$create$1$1 = this.this$0;
        return new Pc.a() { // from class: ru.ozon.app.android.travel.feature.general.main.widgets.priceCalendarFooter.v3.di.b
            @Override // Pc.a
            public final Object get() {
                PriceCalendarFooterV3WidgetViewModel invoke$lambda$0;
                invoke$lambda$0 = PriceCalendarFooterV3Component$Companion$create$1$1$widgetViewModelProvider$2.invoke$lambda$0(PriceCalendarFooterV3Component$Companion$create$1$1.this);
                return invoke$lambda$0;
            }
        };
    }
}
