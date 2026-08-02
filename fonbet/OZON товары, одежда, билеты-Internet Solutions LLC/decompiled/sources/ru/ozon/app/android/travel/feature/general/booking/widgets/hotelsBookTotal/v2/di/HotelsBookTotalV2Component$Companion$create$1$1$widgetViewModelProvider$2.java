package ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v2.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.composer.widgets.async.data.ComposerAsyncWidgetRepository;
import ru.ozon.app.android.composer.widgets.async.di.ComposerWidgetAsyncComponentApi;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v2.data.HotelsBookTotalV2Mapper;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v2.presentation.HotelsBookTotalV2WidgetViewModel;
import ru.ozon.app.android.utils.dispatcherprovider.di.CoroutineDispatchersComponentApi;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LPc/a;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v2/presentation/HotelsBookTotalV2WidgetViewModel;", "kotlin.jvm.PlatformType", "invoke", "()LPc/a;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes3.dex */
final class HotelsBookTotalV2Component$Companion$create$1$1$widgetViewModelProvider$2 extends AbstractC7737t implements Function0<Pc.a<HotelsBookTotalV2WidgetViewModel>> {
    final /* synthetic */ HotelsBookTotalV2Component$Companion$create$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsBookTotalV2Component$Companion$create$1$1$widgetViewModelProvider$2(HotelsBookTotalV2Component$Companion$create$1$1 hotelsBookTotalV2Component$Companion$create$1$1) {
        super(0);
        this.this$0 = hotelsBookTotalV2Component$Companion$create$1$1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HotelsBookTotalV2WidgetViewModel invoke$lambda$0(HotelsBookTotalV2Component$Companion$create$1$1 hotelsBookTotalV2Component$Companion$create$1$1) {
        ComposerWidgetAsyncComponentApi composerWidgetAsyncComponentApi;
        CoroutineDispatchersComponentApi coroutineDispatchersComponentApi;
        composerWidgetAsyncComponentApi = hotelsBookTotalV2Component$Companion$create$1$1.composerWidgetAsyncComponentApi;
        ComposerAsyncWidgetRepository composerAsyncWidgetRepository = composerWidgetAsyncComponentApi.getComposerAsyncWidgetRepository();
        HotelsBookTotalV2Mapper mapper = hotelsBookTotalV2Component$Companion$create$1$1.getMapper();
        coroutineDispatchersComponentApi = hotelsBookTotalV2Component$Companion$create$1$1.coroutineDispatchersComponentApi;
        return new HotelsBookTotalV2WidgetViewModel(composerAsyncWidgetRepository, mapper, coroutineDispatchersComponentApi.getDispatcherProvider());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Pc.a<HotelsBookTotalV2WidgetViewModel> invoke() {
        final HotelsBookTotalV2Component$Companion$create$1$1 hotelsBookTotalV2Component$Companion$create$1$1 = this.this$0;
        return new Pc.a() { // from class: ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v2.di.a
            @Override // Pc.a
            public final Object get() {
                HotelsBookTotalV2WidgetViewModel invoke$lambda$0;
                invoke$lambda$0 = HotelsBookTotalV2Component$Companion$create$1$1$widgetViewModelProvider$2.invoke$lambda$0(HotelsBookTotalV2Component$Companion$create$1$1.this);
                return invoke$lambda$0;
            }
        };
    }
}
