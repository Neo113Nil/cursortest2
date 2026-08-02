package ru.ozon.app.android.travel.feature.railway.widgets.railwayTicketList.composable;

import S0.InterfaceC3967k;
import fd.InterfaceC6511n;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.railway.widgets.railwayTicketList.presentation.RailwayTicketListVI;
import ru.ozon.uni.android.ds.compose.component.badge.DsBadgeAtomKt;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import u0.InterfaceC9904m;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lu0/m;", "", "invoke", "(Lu0/m;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class RailwayTicketListTicketSegmentKt$RailwayTicketListTicketSegment$1$3 extends AbstractC7737t implements InterfaceC6511n<InterfaceC9904m, InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ RailwayTicketListVI.TicketSegmentVI $segment;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RailwayTicketListTicketSegmentKt$RailwayTicketListTicketSegment$1$3(RailwayTicketListVI.TicketSegmentVI ticketSegmentVI) {
        super(3);
        this.$segment = ticketSegmentVI;
    }

    @Override // fd.InterfaceC6511n
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC9904m interfaceC9904m, InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC9904m, interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC9904m FlowRow, InterfaceC3967k interfaceC3967k, int i11) {
        Intrinsics.checkNotNullParameter(FlowRow, "$this$FlowRow");
        if ((i11 & 17) == 16 && interfaceC3967k.b()) {
            interfaceC3967k.j();
            return;
        }
        Iterator<T> it = this.$segment.getPlacesInfo().iterator();
        while (it.hasNext()) {
            DsBadgeAtomKt.DsBadgeAtom((BadgeDTO) it.next(), null, null, interfaceC3967k, 0, 6);
        }
    }
}
