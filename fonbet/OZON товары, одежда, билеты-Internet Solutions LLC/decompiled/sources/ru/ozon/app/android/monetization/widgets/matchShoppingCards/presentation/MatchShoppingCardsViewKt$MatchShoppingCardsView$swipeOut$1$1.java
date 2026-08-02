package ru.ozon.app.android.monetization.widgets.matchShoppingCards.presentation;

import Sc.o;
import Sc.s;
import Wc.a;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import m0.C7980b;
import m0.C8008p;
import m0.T0;
import ru.ozon.app.android.monetization.widgets.matchShoppingCards.presentation.MatchShoppingCardsViewIntent;
import t1.InterfaceC9723a;
import xe.B0;
import xe.C10721f;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lxe/M;", "Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/SwipeDirection;", "direction", "", "<anonymous>", "(Lxe/M;Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/SwipeDirection;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.monetization.widgets.matchShoppingCards.presentation.MatchShoppingCardsViewKt$MatchShoppingCardsView$swipeOut$1$1", f = "MatchShoppingCardsView.kt", l = {88, 92}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class MatchShoppingCardsViewKt$MatchShoppingCardsView$swipeOut$1$1 extends j implements InterfaceC6511n<M, SwipeDirection, d<? super Unit>, Object> {
    final /* synthetic */ C7980b<Float, C8008p> $bottomLightFraction;
    final /* synthetic */ C7980b<Float, C8008p> $currentCardOffset;
    final /* synthetic */ InterfaceC9723a $hapticFeedback;
    final /* synthetic */ Function1<MatchShoppingCardsViewIntent, Unit> $onViewIntent;
    final /* synthetic */ SwipeConfiguration $swipeConfig;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.monetization.widgets.matchShoppingCards.presentation.MatchShoppingCardsViewKt$MatchShoppingCardsView$swipeOut$1$1$1", f = "MatchShoppingCardsView.kt", l = {89}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.monetization.widgets.matchShoppingCards.presentation.MatchShoppingCardsViewKt$MatchShoppingCardsView$swipeOut$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<M, d<? super Unit>, Object> {
        final /* synthetic */ C7980b<Float, C8008p> $currentCardOffset;
        final /* synthetic */ int $offsetSign;
        final /* synthetic */ SwipeConfiguration $swipeConfig;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(C7980b<Float, C8008p> c7980b, SwipeConfiguration swipeConfiguration, int i11, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$currentCardOffset = c7980b;
            this.$swipeConfig = swipeConfiguration;
            this.$offsetSign = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.$currentCardOffset, this.$swipeConfig, this.$offsetSign, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                s.b(obj);
                C7980b<Float, C8008p> c7980b = this.$currentCardOffset;
                Float f7 = new Float(this.$swipeConfig.getMaxOffset() * this.$offsetSign);
                T0<Float> cardSwipeOut = AnimationSpecs.INSTANCE.getCardSwipeOut();
                this.label = 1;
                if (C7980b.f(c7980b, f7, cardSwipeOut, null, this, 12) == aVar) {
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
    @e(c = "ru.ozon.app.android.monetization.widgets.matchShoppingCards.presentation.MatchShoppingCardsViewKt$MatchShoppingCardsView$swipeOut$1$1$2", f = "MatchShoppingCardsView.kt", l = {90}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.monetization.widgets.matchShoppingCards.presentation.MatchShoppingCardsViewKt$MatchShoppingCardsView$swipeOut$1$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends j implements Function2<M, d<? super Unit>, Object> {
        final /* synthetic */ C7980b<Float, C8008p> $bottomLightFraction;
        final /* synthetic */ int $offsetSign;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(C7980b<Float, C8008p> c7980b, int i11, d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.$bottomLightFraction = c7980b;
            this.$offsetSign = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass2(this.$bottomLightFraction, this.$offsetSign, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                s.b(obj);
                C7980b<Float, C8008p> c7980b = this.$bottomLightFraction;
                Float f7 = new Float(this.$offsetSign * 1.0f);
                T0<Float> cardSwipeOut = AnimationSpecs.INSTANCE.getCardSwipeOut();
                this.label = 1;
                if (C7980b.f(c7980b, f7, cardSwipeOut, null, this, 12) == aVar) {
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

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SwipeDirection.values().length];
            try {
                iArr[SwipeDirection.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SwipeDirection.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    MatchShoppingCardsViewKt$MatchShoppingCardsView$swipeOut$1$1(InterfaceC9723a interfaceC9723a, Function1<? super MatchShoppingCardsViewIntent, Unit> function1, C7980b<Float, C8008p> c7980b, C7980b<Float, C8008p> c7980b2, SwipeConfiguration swipeConfiguration, d<? super MatchShoppingCardsViewKt$MatchShoppingCardsView$swipeOut$1$1> dVar) {
        super(3, dVar);
        this.$hapticFeedback = interfaceC9723a;
        this.$onViewIntent = function1;
        this.$bottomLightFraction = c7980b;
        this.$currentCardOffset = c7980b2;
        this.$swipeConfig = swipeConfiguration;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0096, code lost:
    
        if (m0.C7980b.f(r4, r5, r6, null, r8, 12) == r3) goto L25;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i11;
        MatchShoppingCardsViewKt$MatchShoppingCardsView$swipeOut$1$1 matchShoppingCardsViewKt$MatchShoppingCardsView$swipeOut$1$1;
        a aVar = a.COROUTINE_SUSPENDED;
        int i12 = this.label;
        if (i12 == 0) {
            s.b(obj);
            M m11 = (M) this.L$0;
            SwipeDirection swipeDirection = (SwipeDirection) this.L$1;
            if (swipeDirection == SwipeDirection.RIGHT) {
                this.$hapticFeedback.a(0);
            }
            this.$onViewIntent.invoke(new MatchShoppingCardsViewIntent.SwipeOutStart(swipeDirection));
            int i13 = WhenMappings.$EnumSwitchMapping$0[swipeDirection.ordinal()];
            if (i13 == 1) {
                i11 = -1;
            } else {
                if (i13 != 2) {
                    throw new o();
                }
                i11 = 1;
            }
            B0[] b0Arr = {C10727i.c(m11, null, null, new AnonymousClass1(this.$currentCardOffset, this.$swipeConfig, i11, null), 3), C10727i.c(m11, null, null, new AnonymousClass2(this.$bottomLightFraction, i11, null), 3)};
            this.L$0 = null;
            this.label = 1;
            if (C10721f.d(b0Arr, this) == aVar) {
                return aVar;
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                matchShoppingCardsViewKt$MatchShoppingCardsView$swipeOut$1$1 = this;
                matchShoppingCardsViewKt$MatchShoppingCardsView$swipeOut$1$1.$onViewIntent.invoke(MatchShoppingCardsViewIntent.SwipeOutEnd.INSTANCE);
                return Unit.f71690a;
            }
            s.b(obj);
        }
        C7980b<Float, C8008p> c7980b = this.$bottomLightFraction;
        Float f7 = new Float(0.0f);
        T0<Float> bottomLightReturn = AnimationSpecs.INSTANCE.getBottomLightReturn();
        this.label = 2;
        matchShoppingCardsViewKt$MatchShoppingCardsView$swipeOut$1$1 = this;
    }

    @Override // fd.InterfaceC6511n
    public final Object invoke(M m11, SwipeDirection swipeDirection, d<? super Unit> dVar) {
        MatchShoppingCardsViewKt$MatchShoppingCardsView$swipeOut$1$1 matchShoppingCardsViewKt$MatchShoppingCardsView$swipeOut$1$1 = new MatchShoppingCardsViewKt$MatchShoppingCardsView$swipeOut$1$1(this.$hapticFeedback, this.$onViewIntent, this.$bottomLightFraction, this.$currentCardOffset, this.$swipeConfig, dVar);
        matchShoppingCardsViewKt$MatchShoppingCardsView$swipeOut$1$1.L$0 = m11;
        matchShoppingCardsViewKt$MatchShoppingCardsView$swipeOut$1$1.L$1 = swipeDirection;
        return matchShoppingCardsViewKt$MatchShoppingCardsView$swipeOut$1$1.invokeSuspend(Unit.f71690a);
    }
}
