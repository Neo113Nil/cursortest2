package ru.ozon.app.android.travel.feature.railway.widgets.railwayTicketList.composable;

import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.Q;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import e2.AbstractC6263g;
import e2.C6260d;
import e2.C6267k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import l1.y0;
import ru.ozon.app.android.travel.feature.railway.widgets.railwayTicketList.presentation.RailwayTicketListVI;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.android.ds.compose.util.DsSpacings;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
public final class RailwayTicketListTicketSegmentKt$RailwayTicketListTicketSegment$lambda$16$$inlined$ConstraintLayout$5 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ InterfaceC3978p0 $contentTracker;
    final /* synthetic */ Function0 $onHelpersChanged;
    final /* synthetic */ C6267k $scope;
    final /* synthetic */ RailwayTicketListVI.TicketSegmentVI $segment$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RailwayTicketListTicketSegmentKt$RailwayTicketListTicketSegment$lambda$16$$inlined$ConstraintLayout$5(InterfaceC3978p0 interfaceC3978p0, C6267k c6267k, Function0 function0, RailwayTicketListVI.TicketSegmentVI ticketSegmentVI) {
        super(2);
        this.$contentTracker = interfaceC3978p0;
        this.$scope = c6267k;
        this.$onHelpersChanged = function0;
        this.$segment$inlined = ticketSegmentVI;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        e b11;
        e b12;
        if ((i11 & 3) == 2 && interfaceC3967k.b()) {
            interfaceC3967k.j();
            return;
        }
        this.$contentTracker.setValue(Unit.f71690a);
        int d11 = this.$scope.d();
        this.$scope.e();
        C6267k c6267k = this.$scope;
        interfaceC3967k.o(-81598649);
        AbstractC6263g.b c11 = c6267k.c();
        C6267k.b h11 = c6267k.h();
        C6260d a11 = h11.a();
        C6260d b13 = h11.b();
        C6260d c12 = h11.c();
        C6267k.b h12 = c6267k.h();
        C6260d a12 = h12.a();
        C6260d b14 = h12.b();
        C6260d c13 = h12.c();
        C6267k.b h13 = c6267k.h();
        C6260d a13 = h13.a();
        C6260d b15 = h13.b();
        C6267k.b h14 = c6267k.h();
        C6260d a14 = h14.a();
        C6260d b16 = h14.b();
        C6260d c14 = h14.c();
        TextDTO date = this.$segment$inlined.getDepartureStop().getDate();
        e.a aVar = e.f40358c0;
        interfaceC3967k.o(-1526643506);
        Object C11 = interfaceC3967k.C();
        if (C11 == InterfaceC3967k.a.a()) {
            C11 = RailwayTicketListTicketSegmentKt$RailwayTicketListTicketSegment$1$2$1$1.INSTANCE;
            interfaceC3967k.x(C11);
        }
        interfaceC3967k.k();
        DsTextAtomKt.DsTextAtom(date, C6267k.f(aVar, a11, (Function1) C11), interfaceC3967k, 0, 0);
        TextDTO time = this.$segment$inlined.getDepartureStop().getTime();
        interfaceC3967k.o(-1526635205);
        boolean n11 = interfaceC3967k.n(a11);
        Object C12 = interfaceC3967k.C();
        if (n11 || C12 == InterfaceC3967k.a.a()) {
            C12 = new RailwayTicketListTicketSegmentKt$RailwayTicketListTicketSegment$1$2$2$1(a11);
            interfaceC3967k.x(C12);
        }
        interfaceC3967k.k();
        DsTextAtomKt.DsTextAtom(time, C6267k.f(aVar, b13, (Function1) C12), interfaceC3967k, 0, 0);
        TextDTO city = this.$segment$inlined.getDepartureStop().getCity();
        interfaceC3967k.o(-1526627149);
        if (city != null) {
            interfaceC3967k.o(-875991702);
            boolean n12 = interfaceC3967k.n(b13) | interfaceC3967k.n(c11);
            Object C13 = interfaceC3967k.C();
            if (n12 || C13 == InterfaceC3967k.a.a()) {
                C13 = new RailwayTicketListTicketSegmentKt$RailwayTicketListTicketSegment$1$2$3$1$1(b13, c11);
                interfaceC3967k.x(C13);
            }
            interfaceC3967k.k();
            DsTextAtomKt.DsTextAtom(city, C6267k.f(aVar, c12, (Function1) C13), interfaceC3967k, 0, 0);
        }
        interfaceC3967k.k();
        TextDTO station = this.$segment$inlined.getDepartureStop().getStation();
        interfaceC3967k.o(-1526610788);
        if (station != null) {
            interfaceC3967k.o(-875975062);
            boolean n13 = interfaceC3967k.n(c12) | interfaceC3967k.n(c11);
            Object C14 = interfaceC3967k.C();
            if (n13 || C14 == InterfaceC3967k.a.a()) {
                C14 = new RailwayTicketListTicketSegmentKt$RailwayTicketListTicketSegment$1$2$4$1$1(c12, c11);
                interfaceC3967k.x(C14);
            }
            interfaceC3967k.k();
            DsTextAtomKt.DsTextAtom(station, C6267k.f(aVar, a13, (Function1) C14), interfaceC3967k, 0, 0);
        }
        interfaceC3967k.k();
        TextDTO date2 = this.$segment$inlined.getArrivalStop().getDate();
        interfaceC3967k.o(-1526591766);
        Object C15 = interfaceC3967k.C();
        if (C15 == InterfaceC3967k.a.a()) {
            C15 = RailwayTicketListTicketSegmentKt$RailwayTicketListTicketSegment$1$2$5$1.INSTANCE;
            interfaceC3967k.x(C15);
        }
        interfaceC3967k.k();
        DsTextAtomKt.DsTextAtom(date2, C6267k.f(aVar, a12, (Function1) C15), interfaceC3967k, 0, 0);
        TextDTO time2 = this.$segment$inlined.getArrivalStop().getTime();
        interfaceC3967k.o(-1526583657);
        boolean n14 = interfaceC3967k.n(a12);
        Object C16 = interfaceC3967k.C();
        if (n14 || C16 == InterfaceC3967k.a.a()) {
            C16 = new RailwayTicketListTicketSegmentKt$RailwayTicketListTicketSegment$1$2$6$1(a12);
            interfaceC3967k.x(C16);
        }
        interfaceC3967k.k();
        DsTextAtomKt.DsTextAtom(time2, C6267k.f(aVar, b14, (Function1) C16), interfaceC3967k, 0, 0);
        TextDTO city2 = this.$segment$inlined.getArrivalStop().getCity();
        interfaceC3967k.o(-1526575791);
        if (city2 != null) {
            interfaceC3967k.o(-875940344);
            boolean n15 = interfaceC3967k.n(b14) | interfaceC3967k.n(c11);
            Object C17 = interfaceC3967k.C();
            if (n15 || C17 == InterfaceC3967k.a.a()) {
                C17 = new RailwayTicketListTicketSegmentKt$RailwayTicketListTicketSegment$1$2$7$1$1(b14, c11);
                interfaceC3967k.x(C17);
            }
            interfaceC3967k.k();
            DsTextAtomKt.DsTextAtom(city2, C6267k.f(aVar, c13, (Function1) C17), interfaceC3967k, 0, 0);
        }
        interfaceC3967k.k();
        TextDTO station2 = this.$segment$inlined.getArrivalStop().getStation();
        interfaceC3967k.o(-1526559558);
        if (station2 != null) {
            interfaceC3967k.o(-875923832);
            boolean n16 = interfaceC3967k.n(c13) | interfaceC3967k.n(c11);
            Object C18 = interfaceC3967k.C();
            if (n16 || C18 == InterfaceC3967k.a.a()) {
                C18 = new RailwayTicketListTicketSegmentKt$RailwayTicketListTicketSegment$1$2$8$1$1(c13, c11);
                interfaceC3967k.x(C18);
            }
            interfaceC3967k.k();
            DsTextAtomKt.DsTextAtom(station2, C6267k.f(aVar, b15, (Function1) C18), interfaceC3967k, 0, 0);
        }
        interfaceC3967k.k();
        TextDTO totalTravelTime = this.$segment$inlined.getTotalTravelTime();
        interfaceC3967k.o(-1526540427);
        boolean n17 = interfaceC3967k.n(b13);
        Object C19 = interfaceC3967k.C();
        if (n17 || C19 == InterfaceC3967k.a.a()) {
            C19 = new RailwayTicketListTicketSegmentKt$RailwayTicketListTicketSegment$1$2$9$1(b13);
            interfaceC3967k.x(C19);
        }
        interfaceC3967k.k();
        DsTextAtomKt.DsTextAtom(totalTravelTime, C6267k.f(aVar, a14, (Function1) C19), interfaceC3967k, 0, 0);
        DsSpacings dsSpacings = DsSpacings.INSTANCE;
        e f7 = a0.f(aVar, dsSpacings.m1839getDp1D9Ej5fM());
        UniTheme uniTheme = UniTheme.INSTANCE;
        int i12 = UniTheme.$stable;
        b11 = androidx.compose.foundation.e.b(f7, uniTheme.getColors(interfaceC3967k, i12).getGraphicNeutral(), y0.a());
        interfaceC3967k.o(-1526529835);
        boolean n18 = interfaceC3967k.n(b13) | interfaceC3967k.n(a14);
        Object C21 = interfaceC3967k.C();
        if (n18 || C21 == InterfaceC3967k.a.a()) {
            C21 = new RailwayTicketListTicketSegmentKt$RailwayTicketListTicketSegment$1$2$10$1(b13, a14);
            interfaceC3967k.x(C21);
        }
        interfaceC3967k.k();
        C5185h.a(C6267k.f(b11, b16, (Function1) C21), interfaceC3967k, 0);
        b12 = androidx.compose.foundation.e.b(a0.f(aVar, dsSpacings.m1839getDp1D9Ej5fM()), uniTheme.getColors(interfaceC3967k, i12).getGraphicNeutral(), y0.a());
        interfaceC3967k.o(-1526514251);
        boolean n19 = interfaceC3967k.n(a14) | interfaceC3967k.n(b14);
        Object C22 = interfaceC3967k.C();
        if (n19 || C22 == InterfaceC3967k.a.a()) {
            C22 = new RailwayTicketListTicketSegmentKt$RailwayTicketListTicketSegment$1$2$11$1(a14, b14);
            interfaceC3967k.x(C22);
        }
        interfaceC3967k.k();
        C5185h.a(C6267k.f(b12, c14, (Function1) C22), interfaceC3967k, 0);
        interfaceC3967k.k();
        if (this.$scope.d() != d11) {
            Function0<Unit> function0 = this.$onHelpersChanged;
            int i13 = Q.f25307b;
            interfaceC3967k.g(function0);
        }
    }
}
