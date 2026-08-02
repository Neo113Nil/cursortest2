package ru.ozon.app.android.cart.ui.tooltip;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class CartTooltipShowService$showTooltipIfNeed$showAction$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ Function1<AtomAction, Unit> $actionHandler;
    final /* synthetic */ View $anchor;
    final /* synthetic */ boolean $centerAboutAnchor;
    final /* synthetic */ Long $dismissTimeout;
    final /* synthetic */ int $marginFromAnchor;
    final /* synthetic */ CartTooltipVO $tooltip;
    final /* synthetic */ CartTooltipShowService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CartTooltipShowService$showTooltipIfNeed$showAction$1(CartTooltipShowService cartTooltipShowService, CartTooltipVO cartTooltipVO, View view, int i11, boolean z11, Long l11, Function1<? super AtomAction, Unit> function1) {
        super(0);
        this.this$0 = cartTooltipShowService;
        this.$tooltip = cartTooltipVO;
        this.$anchor = view;
        this.$marginFromAnchor = i11;
        this.$centerAboutAnchor = z11;
        this.$dismissTimeout = l11;
        this.$actionHandler = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.this$0.doShowTooltip(this.$tooltip, this.$anchor, this.$marginFromAnchor, this.$centerAboutAnchor, this.$dismissTimeout, this.$actionHandler);
    }
}
