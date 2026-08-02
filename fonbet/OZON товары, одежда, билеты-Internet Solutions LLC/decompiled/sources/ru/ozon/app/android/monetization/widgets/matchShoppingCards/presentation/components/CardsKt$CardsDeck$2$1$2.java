package ru.ozon.app.android.monetization.widgets.matchShoppingCards.presentation.components;

import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.monetization.widgets.matchShoppingCards.presentation.MatchShoppingCardsVI;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/e;", "invoke", "(Landroidx/compose/ui/e;LS0/k;I)Landroidx/compose/ui/e;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes12.dex */
final class CardsKt$CardsDeck$2$1$2 extends AbstractC7737t implements InterfaceC6511n<e, InterfaceC3967k, Integer, e> {
    final /* synthetic */ MatchShoppingCardsVI.Card $card;
    final /* synthetic */ MatchShoppingCardsVI.Card $firstCard;
    final /* synthetic */ e $topCardModifier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CardsKt$CardsDeck$2$1$2(MatchShoppingCardsVI.Card card, MatchShoppingCardsVI.Card card2, e eVar) {
        super(3);
        this.$card = card;
        this.$firstCard = card2;
        this.$topCardModifier = eVar;
    }

    @Override // fd.InterfaceC6511n
    public /* bridge */ /* synthetic */ e invoke(e eVar, InterfaceC3967k interfaceC3967k, Integer num) {
        return invoke(eVar, interfaceC3967k, num.intValue());
    }

    public final e invoke(e composed, InterfaceC3967k interfaceC3967k, int i11) {
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        interfaceC3967k.o(-991578498);
        if (this.$card == this.$firstCard) {
            composed = CardsKt.m813cardShadowziNgDLE(composed.l0(this.$topCardModifier), 24, interfaceC3967k, 48);
        }
        interfaceC3967k.k();
        return composed;
    }
}
