package ru.ozon.app.android.monetization.widgets.matchShoppingCards.presentation.components;

import A0.g;
import S0.InterfaceC3967k;
import androidx.compose.foundation.layout.C5182e;
import androidx.compose.ui.e;
import androidx.compose.ui.graphics.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.monetization.widgets.matchShoppingCards.presentation.MatchShoppingCardsVI;
import ru.ozon.uni.android.ds.compose.component.image.DsImageAtomKt;
import ru.ozon.uni.atoms.data.image.ImageDTO;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes12.dex */
final class CardsKt$Card$1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ MatchShoppingCardsVI.Card $card;
    final /* synthetic */ g $cardShape;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CardsKt$Card$1(MatchShoppingCardsVI.Card card, g gVar) {
        super(2);
        this.$card = card;
        this.$cardShape = gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        if ((i11 & 3) == 2 && interfaceC3967k.b()) {
            interfaceC3967k.j();
            return;
        }
        ImageDTO image = this.$card.getProductInfo().getImage();
        e a11 = C5182e.a(e.f40358c0, 0.75f, false);
        interfaceC3967k.o(2096951522);
        g gVar = this.$cardShape;
        Object C11 = interfaceC3967k.C();
        if (C11 == InterfaceC3967k.a.a()) {
            C11 = new CardsKt$Card$1$1$1(gVar);
            interfaceC3967k.x(C11);
        }
        interfaceC3967k.k();
        DsImageAtomKt.DsImageAtom(image, a.a(a11, (Function1) C11), interfaceC3967k, 48, 0);
    }
}
