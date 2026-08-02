package ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.composer.widgets.async.data.ComposerAsyncWidgetRepository;
import ru.ozon.app.android.composer.widgets.async.di.ComposerWidgetAsyncComponentApi;
import ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.data.AdditionalLuggageV2Mapper;
import ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.presentation.AdditionalLuggageV2WidgetViewModel;
import ru.ozon.app.android.utils.dispatcherprovider.di.CoroutineDispatchersComponentApi;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LPc/a;", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2WidgetViewModel;", "invoke", "()LPc/a;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes10.dex */
final class AdditionalLuggageV2Component$Companion$create$1$1$additionalLuggageV2WidgetViewModelProvider$2 extends AbstractC7737t implements Function0<Pc.a<AdditionalLuggageV2WidgetViewModel>> {
    final /* synthetic */ AdditionalLuggageV2Component$Companion$create$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdditionalLuggageV2Component$Companion$create$1$1$additionalLuggageV2WidgetViewModelProvider$2(AdditionalLuggageV2Component$Companion$create$1$1 additionalLuggageV2Component$Companion$create$1$1) {
        super(0);
        this.this$0 = additionalLuggageV2Component$Companion$create$1$1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AdditionalLuggageV2WidgetViewModel invoke$lambda$0(AdditionalLuggageV2Component$Companion$create$1$1 additionalLuggageV2Component$Companion$create$1$1) {
        ComposerWidgetAsyncComponentApi composerWidgetAsyncComponentApi;
        CoroutineDispatchersComponentApi coroutineDispatchersComponentApi;
        composerWidgetAsyncComponentApi = additionalLuggageV2Component$Companion$create$1$1.composerWidgetAsyncComponentApi;
        ComposerAsyncWidgetRepository composerAsyncWidgetRepository = composerWidgetAsyncComponentApi.getComposerAsyncWidgetRepository();
        AdditionalLuggageV2Mapper mapper = additionalLuggageV2Component$Companion$create$1$1.getMapper();
        coroutineDispatchersComponentApi = additionalLuggageV2Component$Companion$create$1$1.coroutineDispatchersComponentApi;
        return new AdditionalLuggageV2WidgetViewModel(composerAsyncWidgetRepository, mapper, coroutineDispatchersComponentApi.getDispatcherProvider());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Pc.a<AdditionalLuggageV2WidgetViewModel> invoke() {
        final AdditionalLuggageV2Component$Companion$create$1$1 additionalLuggageV2Component$Companion$create$1$1 = this.this$0;
        return new Pc.a() { // from class: ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.di.a
            @Override // Pc.a
            public final Object get() {
                AdditionalLuggageV2WidgetViewModel invoke$lambda$0;
                invoke$lambda$0 = AdditionalLuggageV2Component$Companion$create$1$1$additionalLuggageV2WidgetViewModelProvider$2.invoke$lambda$0(AdditionalLuggageV2Component$Companion$create$1$1.this);
                return invoke$lambda$0;
            }
        };
    }
}
