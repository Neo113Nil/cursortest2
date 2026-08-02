package ru.ozon.app.android.travel.feature.b2b.widgets.b2bUpcomingTrips.presentation.card;

import S0.InterfaceC3967k;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.travel.feature.b2b.widgets.b2bUpcomingTrips.data.B2BUpcomingTripsDTO;
import ru.ozon.uni.android.ds.compose.component.icon.DsIconAtomKt;
import ru.ozon.uni.atoms.data.icon.IconDTO;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes13.dex */
final class B2BUpcomingTripsCardItemContentKt$TripItem$2$1$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ B2BUpcomingTripsDTO.UpcomingTrip $trip;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    B2BUpcomingTripsCardItemContentKt$TripItem$2$1$2(B2BUpcomingTripsDTO.UpcomingTrip upcomingTrip) {
        super(2);
        this.$trip = upcomingTrip;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        if ((i11 & 3) == 2 && interfaceC3967k.b()) {
            interfaceC3967k.j();
            return;
        }
        List<IconDTO> icons = this.$trip.getIcons();
        if (icons == null) {
            return;
        }
        Iterator<T> it = icons.iterator();
        while (it.hasNext()) {
            DsIconAtomKt.DsIconAtom((IconDTO) it.next(), null, interfaceC3967k, IconDTO.$stable, 2);
        }
    }
}
