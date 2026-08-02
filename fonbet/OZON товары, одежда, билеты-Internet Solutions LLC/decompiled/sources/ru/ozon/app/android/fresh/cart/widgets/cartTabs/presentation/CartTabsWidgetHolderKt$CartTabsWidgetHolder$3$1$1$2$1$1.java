package ru.ozon.app.android.fresh.cart.widgets.cartTabs.presentation;

import WZ.l;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import l10.InterfaceC7851b;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.fresh.cart.widgets.cartTabs.presentation.CartTabsVO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "clickPosition", "", "atomAction", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class CartTabsWidgetHolderKt$CartTabsWidgetHolder$3$1$1$2$1$1 extends AbstractC7737t implements Function2<Integer, AtomAction, Unit> {
    final /* synthetic */ Function1<AtomAction, Unit> $actionHandler;
    final /* synthetic */ InterfaceC7851b $controller;
    final /* synthetic */ List<CartTabsVO.CartTabItem> $elements;
    final /* synthetic */ CartTabsVO $item;
    final /* synthetic */ int $position;
    final /* synthetic */ l $tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CartTabsWidgetHolderKt$CartTabsWidgetHolder$3$1$1$2$1$1(CartTabsVO cartTabsVO, InterfaceC7851b interfaceC7851b, int i11, Function1<? super AtomAction, Unit> function1, List<CartTabsVO.CartTabItem> list, l lVar) {
        super(2);
        this.$item = cartTabsVO;
        this.$controller = interfaceC7851b;
        this.$position = i11;
        this.$actionHandler = function1;
        this.$elements = list;
        this.$tokenizedAnalytics = lVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Integer num, AtomAction atomAction) {
        invoke(num.intValue(), atomAction);
        return Unit.f71690a;
    }

    public final void invoke(int i11, AtomAction atomAction) {
        if (i11 != this.$item.getCurrentSelectedTab()) {
            this.$controller.update(new TabChangedEvent(this.$item.getCurrentSelectedTab(), this.$position));
            if (atomAction != null) {
                this.$actionHandler.invoke(atomAction);
            }
            t tokenizedEvent = this.$elements.get(this.$position).getTokenizedEvent();
            if (tokenizedEvent != null) {
                TokenizedAnalyticsExtensionsKt.processClickEvents$default(this.$tokenizedAnalytics, tokenizedEvent, null, 2, null);
            }
        }
    }
}
