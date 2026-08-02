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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.h;
import l0.l0;
import m0.C;
import m0.C7980b;
import m0.C8008p;
import m0.InterfaceC7976A;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.monetization.widgets.matchShoppingCards.presentation.MatchShoppingCardsVI;
import ru.ozon.app.android.monetization.widgets.matchShoppingCards.presentation.MatchShoppingCardsViewIntent;
import xe.B0;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lxe/M;", "", "velocity", "", "<anonymous>", "(Lxe/M;F)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.monetization.widgets.matchShoppingCards.presentation.MatchShoppingCardsViewKt$MatchShoppingCardsView$3$3$1", f = "MatchShoppingCardsView.kt", l = {144, 149, 153, 157}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class MatchShoppingCardsViewKt$MatchShoppingCardsView$3$3$1 extends j implements InterfaceC6511n<M, Float, d<? super Unit>, Object> {
    final /* synthetic */ C7980b<Float, C8008p> $bottomLightFraction;
    final /* synthetic */ C7980b<Float, C8008p> $currentCardOffset;
    final /* synthetic */ Z1.d $density;
    final /* synthetic */ Function1<TokenizedTrackingInfo, Unit> $onEvent;
    final /* synthetic */ Function1<MatchShoppingCardsViewIntent, Unit> $onViewIntent;
    final /* synthetic */ SwipeConfiguration $swipeConfig;
    final /* synthetic */ InterfaceC6511n<M, SwipeDirection, d<? super Unit>, Object> $swipeOut;
    final /* synthetic */ A1<MatchShoppingCardsViewState> $viewState$delegate;
    /* synthetic */ float F$0;
    private /* synthetic */ Object L$0;
    int label;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.monetization.widgets.matchShoppingCards.presentation.MatchShoppingCardsViewKt$MatchShoppingCardsView$3$3$1$1", f = "MatchShoppingCardsView.kt", l = {158}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.monetization.widgets.matchShoppingCards.presentation.MatchShoppingCardsViewKt$MatchShoppingCardsView$3$3$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<M, d<? super Unit>, Object> {
        final /* synthetic */ C7980b<Float, C8008p> $currentCardOffset;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(C7980b<Float, C8008p> c7980b, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$currentCardOffset = c7980b;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.$currentCardOffset, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                s.b(obj);
                C7980b<Float, C8008p> c7980b = this.$currentCardOffset;
                Float f7 = new Float(0.0f);
                this.label = 1;
                if (C7980b.f(c7980b, f7, null, null, this, 14) == aVar) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.monetization.widgets.matchShoppingCards.presentation.MatchShoppingCardsViewKt$MatchShoppingCardsView$3$3$1$2", f = "MatchShoppingCardsView.kt", l = {159}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.monetization.widgets.matchShoppingCards.presentation.MatchShoppingCardsViewKt$MatchShoppingCardsView$3$3$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends j implements Function2<M, d<? super Unit>, Object> {
        final /* synthetic */ C7980b<Float, C8008p> $bottomLightFraction;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(C7980b<Float, C8008p> c7980b, d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.$bottomLightFraction = c7980b;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass2(this.$bottomLightFraction, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                s.b(obj);
                C7980b<Float, C8008p> c7980b = this.$bottomLightFraction;
                Float f7 = new Float(0.0f);
                this.label = 1;
                if (C7980b.f(c7980b, f7, null, null, this, 14) == aVar) {
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
            return ((AnonymousClass2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    MatchShoppingCardsViewKt$MatchShoppingCardsView$3$3$1(SwipeConfiguration swipeConfiguration, C7980b<Float, C8008p> c7980b, Function1<? super MatchShoppingCardsViewIntent, Unit> function1, Function1<? super TokenizedTrackingInfo, Unit> function12, InterfaceC6511n<? super M, ? super SwipeDirection, ? super d<? super Unit>, ? extends Object> interfaceC6511n, Z1.d dVar, A1<MatchShoppingCardsViewState> a12, C7980b<Float, C8008p> c7980b2, d<? super MatchShoppingCardsViewKt$MatchShoppingCardsView$3$3$1> dVar2) {
        super(3, dVar2);
        this.$swipeConfig = swipeConfiguration;
        this.$currentCardOffset = c7980b;
        this.$onViewIntent = function1;
        this.$onEvent = function12;
        this.$swipeOut = interfaceC6511n;
        this.$density = dVar;
        this.$viewState$delegate = a12;
        this.$bottomLightFraction = c7980b2;
    }

    @Override // fd.InterfaceC6511n
    public /* bridge */ /* synthetic */ Object invoke(M m11, Float f7, d<? super Unit> dVar) {
        return invoke(m11, f7.floatValue(), dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x015d, code lost:
    
        if (xe.C10721f.d(r2, r11) == r3) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c4, code lost:
    
        if (r12.invoke(r4, r0, r11) == r3) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0103, code lost:
    
        if (r12.invoke(r4, r0, r11) == r3) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0135, code lost:
    
        if (m0.C7980b.e(r7, r12, r8, r11) == r3) goto L61;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        M m11;
        MatchShoppingCardsViewState MatchShoppingCardsView$lambda$0;
        MatchShoppingCardsViewState MatchShoppingCardsView$lambda$02;
        MatchShoppingCardsViewState MatchShoppingCardsView$lambda$03;
        MatchShoppingCardsVI.Card.TrackingInfo trackingInfo;
        TokenizedTrackingInfo swipeLeft;
        MatchShoppingCardsViewState MatchShoppingCardsView$lambda$04;
        MatchShoppingCardsVI.Card.TrackingInfo trackingInfo2;
        TokenizedTrackingInfo swipeRight;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1 && i11 != 2) {
                if (i11 == 3) {
                    m11 = (M) this.L$0;
                    s.b(obj);
                    B0[] b0Arr = {C10727i.c(m11, null, null, new AnonymousClass1(this.$currentCardOffset, null), 3), C10727i.c(m11, null, null, new AnonymousClass2(this.$bottomLightFraction, null), 3)};
                    this.L$0 = null;
                    this.label = 4;
                } else if (i11 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            s.b(obj);
            return Unit.f71690a;
        }
        s.b(obj);
        m11 = (M) this.L$0;
        float f7 = this.F$0;
        boolean z11 = f7 > this.$swipeConfig.getVelocityThreshold() || this.$currentCardOffset.k().floatValue() >= this.$swipeConfig.getOffsetThreshold();
        boolean z12 = f7 < (-this.$swipeConfig.getVelocityThreshold()) || this.$currentCardOffset.k().floatValue() <= (-this.$swipeConfig.getOffsetThreshold());
        if (z12 || z11) {
            this.$onViewIntent.invoke(MatchShoppingCardsViewIntent.SwipeAttempt.INSTANCE);
        }
        MatchShoppingCardsView$lambda$0 = MatchShoppingCardsViewKt.MatchShoppingCardsView$lambda$0(this.$viewState$delegate);
        if (MatchShoppingCardsView$lambda$0.getSwipeOutEnabled() && z11) {
            MatchShoppingCardsView$lambda$04 = MatchShoppingCardsViewKt.MatchShoppingCardsView$lambda$0(this.$viewState$delegate);
            MatchShoppingCardsVI.Card card = (MatchShoppingCardsVI.Card) C7714v.M(MatchShoppingCardsView$lambda$04.getVisibleCards());
            if (card != null && (trackingInfo2 = card.getTrackingInfo()) != null && (swipeRight = trackingInfo2.getSwipeRight()) != null) {
                this.$onEvent.invoke(swipeRight);
            }
            InterfaceC6511n<M, SwipeDirection, d<? super Unit>, Object> interfaceC6511n = this.$swipeOut;
            SwipeDirection swipeDirection = SwipeDirection.RIGHT;
            this.label = 1;
        } else {
            MatchShoppingCardsView$lambda$02 = MatchShoppingCardsViewKt.MatchShoppingCardsView$lambda$0(this.$viewState$delegate);
            if (MatchShoppingCardsView$lambda$02.getSwipeOutEnabled() && z12) {
                MatchShoppingCardsView$lambda$03 = MatchShoppingCardsViewKt.MatchShoppingCardsView$lambda$0(this.$viewState$delegate);
                MatchShoppingCardsVI.Card card2 = (MatchShoppingCardsVI.Card) C7714v.M(MatchShoppingCardsView$lambda$03.getVisibleCards());
                if (card2 != null && (trackingInfo = card2.getTrackingInfo()) != null && (swipeLeft = trackingInfo.getSwipeLeft()) != null) {
                    this.$onEvent.invoke(swipeLeft);
                }
                InterfaceC6511n<M, SwipeDirection, d<? super Unit>, Object> interfaceC6511n2 = this.$swipeOut;
                SwipeDirection swipeDirection2 = SwipeDirection.LEFT;
                this.label = 2;
            } else {
                C7980b<Float, C8008p> c7980b = this.$currentCardOffset;
                Comparable i12 = h.i(new Float(f7), h.l(-this.$swipeConfig.getVelocityThreshold(), this.$swipeConfig.getVelocityThreshold()));
                InterfaceC7976A b11 = C.b(new l0(this.$density));
                this.L$0 = m11;
                this.label = 3;
            }
        }
        return aVar;
    }

    public final Object invoke(M m11, float f7, d<? super Unit> dVar) {
        MatchShoppingCardsViewKt$MatchShoppingCardsView$3$3$1 matchShoppingCardsViewKt$MatchShoppingCardsView$3$3$1 = new MatchShoppingCardsViewKt$MatchShoppingCardsView$3$3$1(this.$swipeConfig, this.$currentCardOffset, this.$onViewIntent, this.$onEvent, this.$swipeOut, this.$density, this.$viewState$delegate, this.$bottomLightFraction, dVar);
        matchShoppingCardsViewKt$MatchShoppingCardsView$3$3$1.L$0 = m11;
        matchShoppingCardsViewKt$MatchShoppingCardsView$3$3$1.F$0 = f7;
        return matchShoppingCardsViewKt$MatchShoppingCardsView$3$3$1.invokeSuspend(Unit.f71690a);
    }
}
