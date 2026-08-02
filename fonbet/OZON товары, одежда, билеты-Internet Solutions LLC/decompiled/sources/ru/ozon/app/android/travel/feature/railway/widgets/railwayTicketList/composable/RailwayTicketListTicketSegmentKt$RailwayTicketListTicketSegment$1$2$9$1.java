package ru.ozon.app.android.travel.feature.railway.widgets.railwayTicketList.composable;

import e2.C6259c;
import e2.C6260d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Le2/c;", "", "invoke", "(Le2/c;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class RailwayTicketListTicketSegmentKt$RailwayTicketListTicketSegment$1$2$9$1 extends AbstractC7737t implements Function1<C6259c, Unit> {
    final /* synthetic */ C6260d $depTime;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RailwayTicketListTicketSegmentKt$RailwayTicketListTicketSegment$1$2$9$1(C6260d c6260d) {
        super(1);
        this.$depTime = c6260d;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C6259c c6259c) {
        invoke2(c6259c);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C6259c constrainAs) {
        Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
        C6259c.a(constrainAs, constrainAs.e());
        C6259c.b(constrainAs, this.$depTime);
    }
}
