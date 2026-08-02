package ru.ozon.app.android.monetization.widgets.matchShoppingCards.presentation;

import S0.A1;
import S0.InterfaceC3967k;
import Z1.d;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import androidx.compose.ui.graphics.a;
import fd.InterfaceC6511n;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import m0.C7980b;
import m0.C8008p;
import r0.C9135o;
import r0.EnumC9142v;
import r0.InterfaceC9137q;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.monetization.widgets.matchShoppingCards.presentation.MatchShoppingCardsVI;
import ru.ozon.app.android.monetization.widgets.matchShoppingCards.presentation.components.CardsKt;
import u0.InterfaceC9895d;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lu0/d;", "", "invoke", "(Lu0/d;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes12.dex */
final class MatchShoppingCardsViewKt$MatchShoppingCardsView$3 extends AbstractC7737t implements InterfaceC6511n<InterfaceC9895d, InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ C7980b<Float, C8008p> $bottomLightFraction;
    final /* synthetic */ M $coroutineScope;
    final /* synthetic */ C7980b<Float, C8008p> $currentCardOffset;
    final /* synthetic */ d $density;
    final /* synthetic */ Function1<TokenizedTrackingInfo, Unit> $onEvent;
    final /* synthetic */ Function1<MatchShoppingCardsViewIntent, Unit> $onViewIntent;
    final /* synthetic */ SwipeConfiguration $swipeConfig;
    final /* synthetic */ InterfaceC6511n<M, SwipeDirection, kotlin.coroutines.d<? super Unit>, Object> $swipeOut;
    final /* synthetic */ A1<MatchShoppingCardsViewState> $viewState$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    MatchShoppingCardsViewKt$MatchShoppingCardsView$3(Function1<? super MatchShoppingCardsViewIntent, Unit> function1, Function1<? super TokenizedTrackingInfo, Unit> function12, M m11, C7980b<Float, C8008p> c7980b, C7980b<Float, C8008p> c7980b2, SwipeConfiguration swipeConfiguration, A1<MatchShoppingCardsViewState> a12, InterfaceC6511n<? super M, ? super SwipeDirection, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> interfaceC6511n, d dVar) {
        super(3);
        this.$onViewIntent = function1;
        this.$onEvent = function12;
        this.$coroutineScope = m11;
        this.$currentCardOffset = c7980b;
        this.$bottomLightFraction = c7980b2;
        this.$swipeConfig = swipeConfiguration;
        this.$viewState$delegate = a12;
        this.$swipeOut = interfaceC6511n;
        this.$density = dVar;
    }

    @Override // fd.InterfaceC6511n
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC9895d interfaceC9895d, InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC9895d, interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC9895d ScreenLayout, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        MatchShoppingCardsViewState MatchShoppingCardsView$lambda$0;
        MatchShoppingCardsViewState MatchShoppingCardsView$lambda$02;
        Intrinsics.checkNotNullParameter(ScreenLayout, "$this$ScreenLayout");
        if ((i11 & 6) == 0) {
            i12 = i11 | (interfaceC3967k.n(ScreenLayout) ? 4 : 2);
        } else {
            i12 = i11;
        }
        if ((i12 & 19) == 18 && interfaceC3967k.b()) {
            interfaceC3967k.j();
            return;
        }
        MatchShoppingCardsView$lambda$0 = MatchShoppingCardsViewKt.MatchShoppingCardsView$lambda$0(this.$viewState$delegate);
        List<MatchShoppingCardsVI.Card> visibleCards = MatchShoppingCardsView$lambda$0.getVisibleCards();
        interfaceC3967k.o(2006758491);
        boolean n11 = interfaceC3967k.n(this.$onViewIntent);
        Function1<MatchShoppingCardsViewIntent, Unit> function1 = this.$onViewIntent;
        Object C11 = interfaceC3967k.C();
        if (n11 || C11 == InterfaceC3967k.a.a()) {
            C11 = new MatchShoppingCardsViewKt$MatchShoppingCardsView$3$1$1(function1);
            interfaceC3967k.x(C11);
        }
        Function1 function12 = (Function1) C11;
        interfaceC3967k.k();
        Function1<TokenizedTrackingInfo, Unit> function13 = this.$onEvent;
        e.a aVar = e.f40358c0;
        e j11 = T.j(ScreenLayout.a(a0.e(aVar, 1.0f), false), 0.0f, 0.0f, 0.0f, 20, 7);
        interfaceC3967k.o(2006769169);
        boolean F11 = interfaceC3967k.F(this.$coroutineScope) | interfaceC3967k.F(this.$currentCardOffset) | interfaceC3967k.F(this.$bottomLightFraction) | interfaceC3967k.n(this.$swipeConfig);
        M m11 = this.$coroutineScope;
        C7980b<Float, C8008p> c7980b = this.$currentCardOffset;
        C7980b<Float, C8008p> c7980b2 = this.$bottomLightFraction;
        SwipeConfiguration swipeConfiguration = this.$swipeConfig;
        Object C12 = interfaceC3967k.C();
        if (F11 || C12 == InterfaceC3967k.a.a()) {
            C12 = new MatchShoppingCardsViewKt$MatchShoppingCardsView$3$2$1(m11, c7980b, c7980b2, swipeConfiguration);
            interfaceC3967k.x(C12);
        }
        interfaceC3967k.k();
        InterfaceC9137q d11 = C9135o.d(interfaceC3967k, (Function1) C12);
        MatchShoppingCardsView$lambda$02 = MatchShoppingCardsViewKt.MatchShoppingCardsView$lambda$0(this.$viewState$delegate);
        boolean dragEnabled = MatchShoppingCardsView$lambda$02.getDragEnabled();
        EnumC9142v enumC9142v = EnumC9142v.Horizontal;
        interfaceC3967k.o(2006786086);
        boolean n12 = interfaceC3967k.n(this.$swipeConfig) | interfaceC3967k.F(this.$currentCardOffset) | interfaceC3967k.n(this.$onViewIntent) | interfaceC3967k.n(this.$viewState$delegate) | interfaceC3967k.n(this.$onEvent) | interfaceC3967k.F(this.$swipeOut) | interfaceC3967k.n(this.$density) | interfaceC3967k.F(this.$bottomLightFraction);
        SwipeConfiguration swipeConfiguration2 = this.$swipeConfig;
        C7980b<Float, C8008p> c7980b3 = this.$currentCardOffset;
        Function1<MatchShoppingCardsViewIntent, Unit> function14 = this.$onViewIntent;
        Function1<TokenizedTrackingInfo, Unit> function15 = this.$onEvent;
        InterfaceC6511n<M, SwipeDirection, kotlin.coroutines.d<? super Unit>, Object> interfaceC6511n = this.$swipeOut;
        d dVar = this.$density;
        A1<MatchShoppingCardsViewState> a12 = this.$viewState$delegate;
        C7980b<Float, C8008p> c7980b4 = this.$bottomLightFraction;
        Object C13 = interfaceC3967k.C();
        if (n12 || C13 == InterfaceC3967k.a.a()) {
            C13 = new MatchShoppingCardsViewKt$MatchShoppingCardsView$3$3$1(swipeConfiguration2, c7980b3, function14, function15, interfaceC6511n, dVar, a12, c7980b4, null);
            interfaceC3967k.x(C13);
        }
        interfaceC3967k.k();
        e c11 = C9135o.c(j11, d11, enumC9142v, dragEnabled, null, false, (InterfaceC6511n) C13, false, 184);
        interfaceC3967k.o(2006850109);
        boolean F12 = interfaceC3967k.F(this.$currentCardOffset);
        C7980b<Float, C8008p> c7980b5 = this.$currentCardOffset;
        Object C14 = interfaceC3967k.C();
        if (F12 || C14 == InterfaceC3967k.a.a()) {
            C14 = new MatchShoppingCardsViewKt$MatchShoppingCardsView$3$4$1(c7980b5);
            interfaceC3967k.x(C14);
        }
        interfaceC3967k.k();
        CardsKt.CardsDeck(visibleCards, function12, function13, c11, a.a(aVar, (Function1) C14), interfaceC3967k, 0, 0);
    }
}
