package ru.ozon.app.android.fresh.cart.widgets.cartTabs.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.fresh.cart.widgets.cartTabs.presentation.CartTabsVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class CartTabKt$CartTab$3$4$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ CartTabsVO.CartTabItem $item;
    final /* synthetic */ Function2<Integer, AtomAction, Unit> $onClick;
    final /* synthetic */ int $position;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CartTabKt$CartTab$3$4$1(Function2<? super Integer, ? super AtomAction, Unit> function2, int i11, CartTabsVO.CartTabItem cartTabItem) {
        super(0);
        this.$onClick = function2;
        this.$position = i11;
        this.$item = cartTabItem;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Function2<Integer, AtomAction, Unit> function2 = this.$onClick;
        Integer valueOf = Integer.valueOf(this.$position);
        CommonControlSettings common = this.$item.getWrapper().getCommon();
        function2.invoke(valueOf, common != null ? common.toAtomAction() : null);
    }
}
