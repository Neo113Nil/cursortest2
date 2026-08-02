package ru.ozon.app.android.travel.feature.railway.widgets.railwayTicketList.presentation;

import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.Q;
import androidx.compose.ui.e;
import e2.C6260d;
import e2.C6267k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.android.ds.compose.component.badge.DsBadgeAtomKt;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
public final class RailwayTicketListWidgetKt$RailwayTicketListWidget$lambda$6$$inlined$ConstraintLayout$5 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ Function1 $actionHandler$inlined;
    final /* synthetic */ InterfaceC3978p0 $contentTracker;
    final /* synthetic */ Function0 $onHelpersChanged;
    final /* synthetic */ C6267k $scope;
    final /* synthetic */ RailwayTicketListVI $state$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RailwayTicketListWidgetKt$RailwayTicketListWidget$lambda$6$$inlined$ConstraintLayout$5(InterfaceC3978p0 interfaceC3978p0, C6267k c6267k, Function0 function0, RailwayTicketListVI railwayTicketListVI, Function1 function1) {
        super(2);
        this.$contentTracker = interfaceC3978p0;
        this.$scope = c6267k;
        this.$onHelpersChanged = function0;
        this.$state$inlined = railwayTicketListVI;
        this.$actionHandler$inlined = function1;
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
        this.$contentTracker.setValue(Unit.f71690a);
        int d11 = this.$scope.d();
        this.$scope.e();
        C6267k c6267k = this.$scope;
        interfaceC3967k.o(861735655);
        C6267k.b h11 = c6267k.h();
        C6260d a11 = h11.a();
        C6260d b11 = h11.b();
        TextDTO title = this.$state$inlined.getTitle();
        e.a aVar = e.f40358c0;
        interfaceC3967k.o(-249291787);
        boolean n11 = interfaceC3967k.n(b11);
        Object C11 = interfaceC3967k.C();
        if (n11 || C11 == InterfaceC3967k.a.a()) {
            C11 = new RailwayTicketListWidgetKt$RailwayTicketListWidget$1$1$1$1(b11);
            interfaceC3967k.x(C11);
        }
        interfaceC3967k.k();
        DsTextAtomKt.DsTextAtom(title, C6267k.f(aVar, a11, (Function1) C11), interfaceC3967k, 0, 0);
        BadgeDTO routeInfo = this.$state$inlined.getRouteInfo();
        interfaceC3967k.o(-249277101);
        boolean F11 = interfaceC3967k.F(this.$state$inlined);
        Object C12 = interfaceC3967k.C();
        if (F11 || C12 == InterfaceC3967k.a.a()) {
            C12 = new RailwayTicketListWidgetKt$RailwayTicketListWidget$1$1$2$1(this.$state$inlined);
            interfaceC3967k.x(C12);
        }
        interfaceC3967k.k();
        DsBadgeAtomKt.DsBadgeAtom(routeInfo, C6267k.f(aVar, b11, (Function1) C12), this.$actionHandler$inlined, interfaceC3967k, 0, 0);
        interfaceC3967k.k();
        if (this.$scope.d() != d11) {
            Function0<Unit> function0 = this.$onHelpersChanged;
            int i12 = Q.f25307b;
            interfaceC3967k.g(function0);
        }
    }
}
