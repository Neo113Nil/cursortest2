package ru.ozon.app.android.pdp.widgets.badgeListV3.presentation;

import a1.C4912a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.pdp.widgets.badgeListV3.presentation.BadgeListV3VO;
import ru.ozon.uni.atoms.af.AtomAction;
import v0.G;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv0/G;", "", "invoke", "(Lv0/G;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes13.dex */
final class BadgeListV3WidgetKt$BadgeListV3Content$1$1 extends AbstractC7737t implements Function1<G, Unit> {
    final /* synthetic */ Function1<AtomAction, Unit> $actionHandler;
    final /* synthetic */ BadgeListV3VO $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    BadgeListV3WidgetKt$BadgeListV3Content$1$1(BadgeListV3VO badgeListV3VO, Function1<? super AtomAction, Unit> function1) {
        super(1);
        this.$state = badgeListV3VO;
        this.$actionHandler = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(G g10) {
        invoke2(g10);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(G LazyRow) {
        Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
        List<BadgeListV3VO.BadgeWrapper> badges = this.$state.getBadges();
        Function1<AtomAction, Unit> function1 = this.$actionHandler;
        LazyRow.a(badges.size(), null, new BadgeListV3WidgetKt$BadgeListV3Content$1$1$invoke$$inlined$items$default$3(BadgeListV3WidgetKt$BadgeListV3Content$1$1$invoke$$inlined$items$default$1.INSTANCE, badges), new C4912a(true, -632812321, new BadgeListV3WidgetKt$BadgeListV3Content$1$1$invoke$$inlined$items$default$4(badges, function1)));
    }
}
