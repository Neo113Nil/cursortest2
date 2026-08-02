package ru.ozon.app.android.travel.feature.railway.widgets.railwayTicketList.composable;

import e2.AbstractC6263g;
import e2.C6259c;
import e2.C6260d;
import e2.C6275s;
import e2.InterfaceC6255C;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.android.ds.compose.util.DsSpacings;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Le2/c;", "", "invoke", "(Le2/c;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class RailwayTicketListTicketSegmentKt$RailwayTicketListTicketSegment$1$2$11$1 extends AbstractC7737t implements Function1<C6259c, Unit> {
    final /* synthetic */ C6260d $arrTime;
    final /* synthetic */ C6260d $totalTimeText;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RailwayTicketListTicketSegmentKt$RailwayTicketListTicketSegment$1$2$11$1(C6260d c6260d, C6260d c6260d2) {
        super(1);
        this.$totalTimeText = c6260d;
        this.$arrTime = c6260d2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C6259c c6259c) {
        invoke2(c6259c);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C6259c constrainAs) {
        Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
        InterfaceC6255C f7 = constrainAs.f();
        AbstractC6263g.b c11 = this.$totalTimeText.c();
        DsSpacings dsSpacings = DsSpacings.INSTANCE;
        InterfaceC6255C.a(f7, c11, dsSpacings.m1861getDp8D9Ej5fM(), 4);
        InterfaceC6255C.a(constrainAs.d(), this.$arrTime.d(), dsSpacings.m1845getDp16D9Ej5fM(), 4);
        C6259c.b(constrainAs, this.$totalTimeText);
        constrainAs.j(new C6275s("spread"));
    }
}
