package ru.ozon.app.android.travel.feature.general.services.widgets.additionalReturnServiceCell.v2.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.composer.widgets.async.data.ComposerAsyncWidgetRepository;
import ru.ozon.app.android.composer.widgets.async.di.ComposerWidgetAsyncComponentApi;
import ru.ozon.app.android.travel.feature.general.services.widgets.additionalReturnServiceCell.v2.data.AdditionalReturnServiceCellV2Mapper;
import ru.ozon.app.android.travel.feature.general.services.widgets.additionalReturnServiceCell.v2.presentation.AdditionalReturnServiceCellV2ViewModel;
import ru.ozon.app.android.utils.dispatcherprovider.di.CoroutineDispatchersComponentApi;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LPc/a;", "Lru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v2/presentation/AdditionalReturnServiceCellV2ViewModel;", "kotlin.jvm.PlatformType", "invoke", "()LPc/a;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class AdditionalReturnServiceCellV2Component$widgetViewModelProvider$2 extends AbstractC7737t implements Function0<Pc.a<AdditionalReturnServiceCellV2ViewModel>> {
    final /* synthetic */ AdditionalReturnServiceCellV2Component this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdditionalReturnServiceCellV2Component$widgetViewModelProvider$2(AdditionalReturnServiceCellV2Component additionalReturnServiceCellV2Component) {
        super(0);
        this.this$0 = additionalReturnServiceCellV2Component;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AdditionalReturnServiceCellV2ViewModel invoke$lambda$0(AdditionalReturnServiceCellV2Component additionalReturnServiceCellV2Component) {
        ComposerWidgetAsyncComponentApi composerWidgetAsyncComponentApi;
        CoroutineDispatchersComponentApi coroutineDispatchersComponentApi;
        composerWidgetAsyncComponentApi = additionalReturnServiceCellV2Component.asyncApi;
        ComposerAsyncWidgetRepository composerAsyncWidgetRepository = composerWidgetAsyncComponentApi.getComposerAsyncWidgetRepository();
        AdditionalReturnServiceCellV2Mapper additionalReturnServiceCellMapper = additionalReturnServiceCellV2Component.getAdditionalReturnServiceCellMapper();
        coroutineDispatchersComponentApi = additionalReturnServiceCellV2Component.coroutineDispatchersComponentApi;
        return new AdditionalReturnServiceCellV2ViewModel(composerAsyncWidgetRepository, additionalReturnServiceCellMapper, coroutineDispatchersComponentApi.getDispatcherProvider());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Pc.a<AdditionalReturnServiceCellV2ViewModel> invoke() {
        final AdditionalReturnServiceCellV2Component additionalReturnServiceCellV2Component = this.this$0;
        return new Pc.a() { // from class: ru.ozon.app.android.travel.feature.general.services.widgets.additionalReturnServiceCell.v2.di.a
            @Override // Pc.a
            public final Object get() {
                AdditionalReturnServiceCellV2ViewModel invoke$lambda$0;
                invoke$lambda$0 = AdditionalReturnServiceCellV2Component$widgetViewModelProvider$2.invoke$lambda$0(AdditionalReturnServiceCellV2Component.this);
                return invoke$lambda$0;
            }
        };
    }
}
