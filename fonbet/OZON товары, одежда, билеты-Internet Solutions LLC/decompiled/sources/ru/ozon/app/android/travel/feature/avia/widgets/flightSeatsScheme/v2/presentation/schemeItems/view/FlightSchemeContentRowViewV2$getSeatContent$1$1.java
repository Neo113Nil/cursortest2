package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.schemeItems.view;

import Tc.d;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.airplaneSeat.AirplaneSeatTypeV2VI;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.schemeItems.FlightSchemeSeatContentV2;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/airplaneSeat/AirplaneSeatTypeV2VI;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class FlightSchemeContentRowViewV2$getSeatContent$1$1 extends AbstractC7737t implements Function1<AirplaneSeatTypeV2VI, Unit> {
    final /* synthetic */ Function1<AtomAction, Unit> $emergencySeatsActionHandler;
    final /* synthetic */ FlightSchemeSeatContentV2 $item;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FlightSchemeContentRowViewV2$getSeatContent$1$1(FlightSchemeSeatContentV2 flightSchemeSeatContentV2, Function1<? super AtomAction, Unit> function1) {
        super(1);
        this.$item = flightSchemeSeatContentV2;
        this.$emergencySeatsActionHandler = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AirplaneSeatTypeV2VI airplaneSeatTypeV2VI) {
        invoke2(airplaneSeatTypeV2VI);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AirplaneSeatTypeV2VI it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (!(this.$item.getAction() instanceof AtomAction.ComposerAction)) {
            Function1<AtomAction, Unit> function1 = this.$emergencySeatsActionHandler;
            if (function1 != null) {
                function1.invoke(this.$item.getAction());
                return;
            }
            return;
        }
        FlightSchemeSeatContentV2 flightSchemeSeatContentV2 = this.$item;
        d builder = new d();
        Map<String, String> params = ((AtomAction.ComposerAction) flightSchemeSeatContentV2.getAction()).getParams();
        if (params != null) {
            builder.putAll(params);
        }
        builder.put("seatNumber", String.valueOf(flightSchemeSeatContentV2.getSeat().getNumber()));
        Intrinsics.checkNotNullParameter(builder, "builder");
        d u11 = builder.u();
        Function1<AtomAction, Unit> function12 = this.$emergencySeatsActionHandler;
        if (function12 != null) {
            function12.invoke(AtomAction.ComposerAction.copy$default((AtomAction.ComposerAction) this.$item.getAction(), null, null, u11, null, null, 27, null));
        }
    }
}
