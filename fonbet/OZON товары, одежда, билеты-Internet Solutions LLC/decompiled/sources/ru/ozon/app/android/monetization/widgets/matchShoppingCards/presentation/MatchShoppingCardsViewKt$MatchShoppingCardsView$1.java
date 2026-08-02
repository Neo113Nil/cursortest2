package ru.ozon.app.android.monetization.widgets.matchShoppingCards.presentation;

import S0.A1;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import m0.C7980b;
import m0.C8008p;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/e;", "invoke", "(Landroidx/compose/ui/e;LS0/k;I)Landroidx/compose/ui/e;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes12.dex */
final class MatchShoppingCardsViewKt$MatchShoppingCardsView$1 extends AbstractC7737t implements InterfaceC6511n<e, InterfaceC3967k, Integer, e> {
    final /* synthetic */ C7980b<Float, C8008p> $bottomLightFraction;
    final /* synthetic */ A1<MatchShoppingCardsViewState> $viewState$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MatchShoppingCardsViewKt$MatchShoppingCardsView$1(C7980b<Float, C8008p> c7980b, A1<MatchShoppingCardsViewState> a12) {
        super(3);
        this.$bottomLightFraction = c7980b;
        this.$viewState$delegate = a12;
    }

    @Override // fd.InterfaceC6511n
    public /* bridge */ /* synthetic */ e invoke(e eVar, InterfaceC3967k interfaceC3967k, Integer num) {
        return invoke(eVar, interfaceC3967k, num.intValue());
    }

    public final e invoke(e composed, InterfaceC3967k interfaceC3967k, int i11) {
        MatchShoppingCardsViewState MatchShoppingCardsView$lambda$0;
        MatchShoppingCardsViewState MatchShoppingCardsView$lambda$02;
        e bottomLight;
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        interfaceC3967k.o(-127527022);
        MatchShoppingCardsView$lambda$0 = MatchShoppingCardsViewKt.MatchShoppingCardsView$lambda$0(this.$viewState$delegate);
        C7807Z c7807z = TokenParserKt.tokenToColor(MatchShoppingCardsView$lambda$0.getWidgetState().getLikeButton().getLightColor(), interfaceC3967k, 0);
        long w11 = c7807z != null ? c7807z.w() : C7807Z.f72259m;
        MatchShoppingCardsView$lambda$02 = MatchShoppingCardsViewKt.MatchShoppingCardsView$lambda$0(this.$viewState$delegate);
        C7807Z c7807z2 = TokenParserKt.tokenToColor(MatchShoppingCardsView$lambda$02.getWidgetState().getDislikeButton().getLightColor(), interfaceC3967k, 0);
        long w12 = c7807z2 != null ? c7807z2.w() : C7807Z.f72259m;
        interfaceC3967k.o(2006735639);
        boolean F11 = interfaceC3967k.F(this.$bottomLightFraction) | interfaceC3967k.s(w11) | interfaceC3967k.s(w12);
        C7980b<Float, C8008p> c7980b = this.$bottomLightFraction;
        Object C11 = interfaceC3967k.C();
        if (F11 || C11 == InterfaceC3967k.a.a()) {
            MatchShoppingCardsViewKt$MatchShoppingCardsView$1$1$1 matchShoppingCardsViewKt$MatchShoppingCardsView$1$1$1 = new MatchShoppingCardsViewKt$MatchShoppingCardsView$1$1$1(c7980b, w11, w12);
            interfaceC3967k.x(matchShoppingCardsViewKt$MatchShoppingCardsView$1$1$1);
            C11 = matchShoppingCardsViewKt$MatchShoppingCardsView$1$1$1;
        }
        Function0 function0 = (Function0) C11;
        interfaceC3967k.k();
        interfaceC3967k.o(2006738673);
        boolean F12 = interfaceC3967k.F(this.$bottomLightFraction);
        C7980b<Float, C8008p> c7980b2 = this.$bottomLightFraction;
        Object C12 = interfaceC3967k.C();
        if (F12 || C12 == InterfaceC3967k.a.a()) {
            C12 = new MatchShoppingCardsViewKt$MatchShoppingCardsView$1$2$1(c7980b2);
            interfaceC3967k.x(C12);
        }
        interfaceC3967k.k();
        bottomLight = MatchShoppingCardsViewKt.bottomLight(composed, function0, (Function0) C12);
        interfaceC3967k.k();
        return bottomLight;
    }
}
