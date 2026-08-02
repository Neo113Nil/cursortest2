package ru.ozon.app.android.monetization.widgets.matchShoppingCards.presentation.components;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.monetization.widgets.matchShoppingCards.presentation.MatchShoppingCardsVI;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class CardsKt$CardsDeck$3 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ List<MatchShoppingCardsVI.Card> $cards;
    final /* synthetic */ e $modifier;
    final /* synthetic */ Function1<AtomAction, Unit> $onAction;
    final /* synthetic */ Function1<TokenizedTrackingInfo, Unit> $onEvent;
    final /* synthetic */ e $topCardModifier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CardsKt$CardsDeck$3(List<MatchShoppingCardsVI.Card> list, Function1<? super AtomAction, Unit> function1, Function1<? super TokenizedTrackingInfo, Unit> function12, e eVar, e eVar2, int i11, int i12) {
        super(2);
        this.$cards = list;
        this.$onAction = function1;
        this.$onEvent = function12;
        this.$modifier = eVar;
        this.$topCardModifier = eVar2;
        this.$$changed = i11;
        this.$$default = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        CardsKt.CardsDeck(this.$cards, this.$onAction, this.$onEvent, this.$modifier, this.$topCardModifier, interfaceC3967k, C2652m.e(this.$$changed | 1), this.$$default);
    }
}
