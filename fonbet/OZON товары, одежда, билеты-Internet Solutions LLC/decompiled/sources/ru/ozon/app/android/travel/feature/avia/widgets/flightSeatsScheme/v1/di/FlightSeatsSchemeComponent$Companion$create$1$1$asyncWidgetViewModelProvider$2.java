package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.composer.widgets.async.data.ComposerAsyncWidgetRepository;
import ru.ozon.app.android.composer.widgets.async.di.ComposerWidgetAsyncComponentApi;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.data.FlightSeatsSchemeMapper;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.FlightSeatsSchemeAsyncViewModel;
import ru.ozon.app.android.utils.dispatcherprovider.di.CoroutineDispatchersComponentApi;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LPc/a;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/FlightSeatsSchemeAsyncViewModel;", "invoke", "()LPc/a;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes10.dex */
final class FlightSeatsSchemeComponent$Companion$create$1$1$asyncWidgetViewModelProvider$2 extends AbstractC7737t implements Function0<Pc.a<FlightSeatsSchemeAsyncViewModel>> {
    final /* synthetic */ FlightSeatsSchemeComponent$Companion$create$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlightSeatsSchemeComponent$Companion$create$1$1$asyncWidgetViewModelProvider$2(FlightSeatsSchemeComponent$Companion$create$1$1 flightSeatsSchemeComponent$Companion$create$1$1) {
        super(0);
        this.this$0 = flightSeatsSchemeComponent$Companion$create$1$1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FlightSeatsSchemeAsyncViewModel invoke$lambda$0(FlightSeatsSchemeComponent$Companion$create$1$1 flightSeatsSchemeComponent$Companion$create$1$1) {
        ComposerWidgetAsyncComponentApi composerWidgetAsyncComponentApi;
        CoroutineDispatchersComponentApi coroutineDispatchersComponentApi;
        composerWidgetAsyncComponentApi = flightSeatsSchemeComponent$Companion$create$1$1.composerWidgetAsyncComponentApi;
        ComposerAsyncWidgetRepository composerAsyncWidgetRepository = composerWidgetAsyncComponentApi.getComposerAsyncWidgetRepository();
        FlightSeatsSchemeMapper flightSeatsSchemeMapper = flightSeatsSchemeComponent$Companion$create$1$1.getFlightSeatsSchemeMapper();
        coroutineDispatchersComponentApi = flightSeatsSchemeComponent$Companion$create$1$1.coroutineDispatchersComponentApi;
        return new FlightSeatsSchemeAsyncViewModel(composerAsyncWidgetRepository, flightSeatsSchemeMapper, coroutineDispatchersComponentApi.getDispatcherProvider());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Pc.a<FlightSeatsSchemeAsyncViewModel> invoke() {
        final FlightSeatsSchemeComponent$Companion$create$1$1 flightSeatsSchemeComponent$Companion$create$1$1 = this.this$0;
        return new Pc.a() { // from class: ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.di.a
            @Override // Pc.a
            public final Object get() {
                FlightSeatsSchemeAsyncViewModel invoke$lambda$0;
                invoke$lambda$0 = FlightSeatsSchemeComponent$Companion$create$1$1$asyncWidgetViewModelProvider$2.invoke$lambda$0(FlightSeatsSchemeComponent$Companion$create$1$1.this);
                return invoke$lambda$0;
            }
        };
    }
}
