package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.composer.widgets.async.data.ComposerAsyncWidgetRepository;
import ru.ozon.app.android.composer.widgets.async.di.ComposerWidgetAsyncComponentApi;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.data.FlightSeatsSchemeV2Mapper;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.FlightSeatsSchemeV2AsyncViewModel;
import ru.ozon.app.android.utils.dispatcherprovider.di.CoroutineDispatchersComponentApi;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LPc/a;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/FlightSeatsSchemeV2AsyncViewModel;", "invoke", "()LPc/a;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes10.dex */
final class FlightSeatsSchemeV2Component$asyncWidgetViewModelProvider$2 extends AbstractC7737t implements Function0<Pc.a<FlightSeatsSchemeV2AsyncViewModel>> {
    final /* synthetic */ FlightSeatsSchemeV2Component this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlightSeatsSchemeV2Component$asyncWidgetViewModelProvider$2(FlightSeatsSchemeV2Component flightSeatsSchemeV2Component) {
        super(0);
        this.this$0 = flightSeatsSchemeV2Component;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FlightSeatsSchemeV2AsyncViewModel invoke$lambda$0(FlightSeatsSchemeV2Component flightSeatsSchemeV2Component) {
        ComposerWidgetAsyncComponentApi composerWidgetAsyncComponentApi;
        CoroutineDispatchersComponentApi coroutineDispatchersComponentApi;
        composerWidgetAsyncComponentApi = flightSeatsSchemeV2Component.composerWidgetAsyncComponentApi;
        ComposerAsyncWidgetRepository composerAsyncWidgetRepository = composerWidgetAsyncComponentApi.getComposerAsyncWidgetRepository();
        FlightSeatsSchemeV2Mapper flightSeatsSchemeMapper = flightSeatsSchemeV2Component.getFlightSeatsSchemeMapper();
        coroutineDispatchersComponentApi = flightSeatsSchemeV2Component.coroutineDispatchersComponentApi;
        return new FlightSeatsSchemeV2AsyncViewModel(composerAsyncWidgetRepository, flightSeatsSchemeMapper, coroutineDispatchersComponentApi.getDispatcherProvider());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Pc.a<FlightSeatsSchemeV2AsyncViewModel> invoke() {
        final FlightSeatsSchemeV2Component flightSeatsSchemeV2Component = this.this$0;
        return new Pc.a() { // from class: ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.di.a
            @Override // Pc.a
            public final Object get() {
                FlightSeatsSchemeV2AsyncViewModel invoke$lambda$0;
                invoke$lambda$0 = FlightSeatsSchemeV2Component$asyncWidgetViewModelProvider$2.invoke$lambda$0(FlightSeatsSchemeV2Component.this);
                return invoke$lambda$0;
            }
        };
    }
}
