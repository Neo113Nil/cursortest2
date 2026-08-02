package ru.ozon.app.android.travel.feature.railway.widgets.railwayTicketList.presentation;

import e2.C6259c;
import e2.C6260d;
import e2.C6275s;
import e2.InterfaceC6255C;
import e2.InterfaceC6277u;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.data.common.Paddings;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Le2/c;", "", "invoke", "(Le2/c;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class RailwayTicketListWidgetKt$RailwayTicketListWidget$1$1$1$1 extends AbstractC7737t implements Function1<C6259c, Unit> {
    final /* synthetic */ C6260d $routeInfo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RailwayTicketListWidgetKt$RailwayTicketListWidget$1$1$1$1(C6260d c6260d) {
        super(1);
        this.$routeInfo = c6260d;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C6259c c6259c) {
        invoke2(c6259c);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C6259c constrainAs) {
        Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
        constrainAs.j(new C6275s("spread"));
        InterfaceC6255C.a(constrainAs.f(), constrainAs.e().d(), 0.0f, 6);
        InterfaceC6277u.a(constrainAs.g(), constrainAs.e().e());
        InterfaceC6255C.a(constrainAs.d(), this.$routeInfo.d(), Paddings.PADDING_200.m1867getDpD9Ej5fM(), 4);
    }
}
