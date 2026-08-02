package ru.ozon.app.android.monetization.widgets.matchShoppingCards.presentation;

import S0.A1;
import S0.InterfaceC3967k;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.monetization.widgets.matchShoppingCards.presentation.MatchShoppingCardsVI;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes12.dex */
final class MatchShoppingCardsViewKt$MatchShoppingCardsView$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ Function1<MatchShoppingCardsViewIntent, Unit> $onViewIntent;
    final /* synthetic */ A1<MatchShoppingCardsViewState> $viewState$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    MatchShoppingCardsViewKt$MatchShoppingCardsView$2(Function1<? super MatchShoppingCardsViewIntent, Unit> function1, A1<MatchShoppingCardsViewState> a12) {
        super(2);
        this.$onViewIntent = function1;
        this.$viewState$delegate = a12;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        MatchShoppingCardsViewState MatchShoppingCardsView$lambda$0;
        MatchShoppingCardsViewState MatchShoppingCardsView$lambda$02;
        if ((i11 & 3) == 2 && interfaceC3967k.b()) {
            interfaceC3967k.j();
            return;
        }
        MatchShoppingCardsView$lambda$0 = MatchShoppingCardsViewKt.MatchShoppingCardsView$lambda$0(this.$viewState$delegate);
        MatchShoppingCardsVI.Header header = MatchShoppingCardsView$lambda$0.getWidgetState().getHeader();
        MatchShoppingCardsView$lambda$02 = MatchShoppingCardsViewKt.MatchShoppingCardsView$lambda$0(this.$viewState$delegate);
        boolean headerBadgeEnabled = MatchShoppingCardsView$lambda$02.getHeaderBadgeEnabled();
        interfaceC3967k.o(2006750907);
        boolean n11 = interfaceC3967k.n(this.$onViewIntent);
        Function1<MatchShoppingCardsViewIntent, Unit> function1 = this.$onViewIntent;
        Object C11 = interfaceC3967k.C();
        if (n11 || C11 == InterfaceC3967k.a.a()) {
            C11 = new MatchShoppingCardsViewKt$MatchShoppingCardsView$2$1$1(function1);
            interfaceC3967k.x(C11);
        }
        interfaceC3967k.k();
        MatchShoppingCardsViewKt.Header(header, headerBadgeEnabled, (Function1) C11, a0.e(e.f40358c0, 1.0f), interfaceC3967k, 3072, 0);
    }
}
