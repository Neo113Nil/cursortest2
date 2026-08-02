package ru.ozon.app.android.monetization.widgets.matchShoppingCards.presentation;

import S0.A1;
import S0.InterfaceC3967k;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import m0.C7980b;
import m0.C8008p;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.monetization.widgets.matchShoppingCards.presentation.MatchShoppingCardsVI;
import ru.ozon.app.android.monetization.widgets.matchShoppingCards.presentation.components.ReactionButtonKt;
import xe.M;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes12.dex */
final class MatchShoppingCardsViewKt$MatchShoppingCardsView$4 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ C7980b<Float, C8008p> $bottomLightFraction;
    final /* synthetic */ M $coroutineScope;
    final /* synthetic */ Function1<TokenizedTrackingInfo, Unit> $onEvent;
    final /* synthetic */ InterfaceC6511n<M, SwipeDirection, d<? super Unit>, Object> $swipeOut;
    final /* synthetic */ A1<MatchShoppingCardsViewState> $viewState$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    MatchShoppingCardsViewKt$MatchShoppingCardsView$4(C7980b<Float, C8008p> c7980b, A1<MatchShoppingCardsViewState> a12, Function1<? super TokenizedTrackingInfo, Unit> function1, M m11, InterfaceC6511n<? super M, ? super SwipeDirection, ? super d<? super Unit>, ? extends Object> interfaceC6511n) {
        super(2);
        this.$bottomLightFraction = c7980b;
        this.$viewState$delegate = a12;
        this.$onEvent = function1;
        this.$coroutineScope = m11;
        this.$swipeOut = interfaceC6511n;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        MatchShoppingCardsViewState MatchShoppingCardsView$lambda$0;
        if ((i11 & 3) == 2 && interfaceC3967k.b()) {
            interfaceC3967k.j();
            return;
        }
        MatchShoppingCardsView$lambda$0 = MatchShoppingCardsViewKt.MatchShoppingCardsView$lambda$0(this.$viewState$delegate);
        MatchShoppingCardsVI.ReactionButton likeButton = MatchShoppingCardsView$lambda$0.getWidgetState().getLikeButton();
        interfaceC3967k.o(2006867140);
        boolean F11 = interfaceC3967k.F(this.$bottomLightFraction);
        C7980b<Float, C8008p> c7980b = this.$bottomLightFraction;
        Object C11 = interfaceC3967k.C();
        if (F11 || C11 == InterfaceC3967k.a.a()) {
            C11 = new MatchShoppingCardsViewKt$MatchShoppingCardsView$4$1$1(c7980b);
            interfaceC3967k.x(C11);
        }
        Function0 function0 = (Function0) C11;
        interfaceC3967k.k();
        interfaceC3967k.o(2006869718);
        boolean n11 = interfaceC3967k.n(this.$viewState$delegate) | interfaceC3967k.n(this.$onEvent) | interfaceC3967k.F(this.$coroutineScope) | interfaceC3967k.F(this.$swipeOut);
        Function1<TokenizedTrackingInfo, Unit> function1 = this.$onEvent;
        M m11 = this.$coroutineScope;
        A1<MatchShoppingCardsViewState> a12 = this.$viewState$delegate;
        InterfaceC6511n<M, SwipeDirection, d<? super Unit>, Object> interfaceC6511n = this.$swipeOut;
        Object C12 = interfaceC3967k.C();
        if (n11 || C12 == InterfaceC3967k.a.a()) {
            C12 = new MatchShoppingCardsViewKt$MatchShoppingCardsView$4$2$1(function1, m11, a12, interfaceC6511n);
            interfaceC3967k.x(C12);
        }
        interfaceC3967k.k();
        ReactionButtonKt.ReactionButton(likeButton, function0, (Function0) C12, interfaceC3967k, 0, 0);
    }
}
