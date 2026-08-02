package ru.ozon.app.android.monetization.widgets.matchShoppingCards.presentation;

import S0.A1;
import Sc.s;
import Wc.a;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.monetization.widgets.matchShoppingCards.presentation.MatchShoppingCardsVI;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class MatchShoppingCardsViewKt$MatchShoppingCardsView$5$2$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ M $coroutineScope;
    final /* synthetic */ Function1<TokenizedTrackingInfo, Unit> $onEvent;
    final /* synthetic */ InterfaceC6511n<M, SwipeDirection, d<? super Unit>, Object> $swipeOut;
    final /* synthetic */ A1<MatchShoppingCardsViewState> $viewState$delegate;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.monetization.widgets.matchShoppingCards.presentation.MatchShoppingCardsViewKt$MatchShoppingCardsView$5$2$1$1", f = "MatchShoppingCardsView.kt", l = {191}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.monetization.widgets.matchShoppingCards.presentation.MatchShoppingCardsViewKt$MatchShoppingCardsView$5$2$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<M, d<? super Unit>, Object> {
        final /* synthetic */ InterfaceC6511n<M, SwipeDirection, d<? super Unit>, Object> $swipeOut;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(InterfaceC6511n<? super M, ? super SwipeDirection, ? super d<? super Unit>, ? extends Object> interfaceC6511n, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$swipeOut = interfaceC6511n;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$swipeOut, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                s.b(obj);
                M m11 = (M) this.L$0;
                InterfaceC6511n<M, SwipeDirection, d<? super Unit>, Object> interfaceC6511n = this.$swipeOut;
                SwipeDirection swipeDirection = SwipeDirection.LEFT;
                this.label = 1;
                if (interfaceC6511n.invoke(m11, swipeDirection, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    MatchShoppingCardsViewKt$MatchShoppingCardsView$5$2$1(Function1<? super TokenizedTrackingInfo, Unit> function1, M m11, A1<MatchShoppingCardsViewState> a12, InterfaceC6511n<? super M, ? super SwipeDirection, ? super d<? super Unit>, ? extends Object> interfaceC6511n) {
        super(0);
        this.$onEvent = function1;
        this.$coroutineScope = m11;
        this.$viewState$delegate = a12;
        this.$swipeOut = interfaceC6511n;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        MatchShoppingCardsViewState MatchShoppingCardsView$lambda$0;
        MatchShoppingCardsViewState MatchShoppingCardsView$lambda$02;
        MatchShoppingCardsVI.Card.TrackingInfo trackingInfo;
        TokenizedTrackingInfo dislike;
        MatchShoppingCardsView$lambda$0 = MatchShoppingCardsViewKt.MatchShoppingCardsView$lambda$0(this.$viewState$delegate);
        MatchShoppingCardsVI.Card card = (MatchShoppingCardsVI.Card) C7714v.M(MatchShoppingCardsView$lambda$0.getVisibleCards());
        if (card != null && (trackingInfo = card.getTrackingInfo()) != null && (dislike = trackingInfo.getDislike()) != null) {
            this.$onEvent.invoke(dislike);
        }
        MatchShoppingCardsView$lambda$02 = MatchShoppingCardsViewKt.MatchShoppingCardsView$lambda$0(this.$viewState$delegate);
        if (MatchShoppingCardsView$lambda$02.getReactionButtonsEnabled()) {
            C10727i.c(this.$coroutineScope, null, null, new AnonymousClass1(this.$swipeOut, null), 3);
        }
    }
}
