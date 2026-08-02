package ru.ozon.app.android.travel.feature.railway.widgets.railwayTicketList.composable;

import e2.C6259c;
import e2.C6260d;
import e2.C6275s;
import e2.InterfaceC6255C;
import e2.InterfaceC6274r;
import e2.InterfaceC6277u;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.android.ds.compose.util.DsSpacings;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Le2/c;", "", "invoke", "(Le2/c;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class RailwayTicketListTicketSegmentKt$RailwayTicketListTicketSegment$1$2$6$1 extends AbstractC7737t implements Function1<C6259c, Unit> {
    final /* synthetic */ C6260d $arrDate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RailwayTicketListTicketSegmentKt$RailwayTicketListTicketSegment$1$2$6$1(C6260d c6260d) {
        super(1);
        this.$arrDate = c6260d;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C6259c c6259c) {
        invoke2(c6259c);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C6259c constrainAs) {
        Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
        InterfaceC6277u.a(constrainAs.g(), this.$arrDate.b());
        InterfaceC6255C.a(constrainAs.d(), constrainAs.e().c(), 0.0f, 6);
        C6275s a11 = InterfaceC6274r.a.a();
        a11.b().c(DsSpacings.INSTANCE.m1860getDp64D9Ej5fM());
        constrainAs.j(a11);
    }
}
