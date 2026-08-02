package ru.ozon.app.android.monetization.widgets.matchShoppingCards.presentation;

import Sc.s;
import Wc.a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import m0.C7980b;
import m0.C8008p;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "delta", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class MatchShoppingCardsViewKt$MatchShoppingCardsView$3$2$1 extends AbstractC7737t implements Function1<Float, Unit> {
    final /* synthetic */ C7980b<Float, C8008p> $bottomLightFraction;
    final /* synthetic */ M $coroutineScope;
    final /* synthetic */ C7980b<Float, C8008p> $currentCardOffset;
    final /* synthetic */ SwipeConfiguration $swipeConfig;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.monetization.widgets.matchShoppingCards.presentation.MatchShoppingCardsViewKt$MatchShoppingCardsView$3$2$1$1", f = "MatchShoppingCardsView.kt", l = {127, UserVerificationMethods.USER_VERIFY_PATTERN}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.monetization.widgets.matchShoppingCards.presentation.MatchShoppingCardsViewKt$MatchShoppingCardsView$3$2$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<M, d<? super Unit>, Object> {
        final /* synthetic */ C7980b<Float, C8008p> $bottomLightFraction;
        final /* synthetic */ C7980b<Float, C8008p> $currentCardOffset;
        final /* synthetic */ float $delta;
        final /* synthetic */ SwipeConfiguration $swipeConfig;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(C7980b<Float, C8008p> c7980b, float f7, C7980b<Float, C8008p> c7980b2, SwipeConfiguration swipeConfiguration, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$currentCardOffset = c7980b;
            this.$delta = f7;
            this.$bottomLightFraction = c7980b2;
            this.$swipeConfig = swipeConfiguration;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.$currentCardOffset, this.$delta, this.$bottomLightFraction, this.$swipeConfig, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x005c, code lost:
        
            if (r6.m(r3, r5) == r0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x005e, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
        
            if (r6.m(r4, r5) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                s.b(obj);
                C7980b<Float, C8008p> c7980b = this.$currentCardOffset;
                Float f7 = new Float(c7980b.k().floatValue() + this.$delta);
                this.label = 1;
            } else {
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return Unit.f71690a;
                }
                s.b(obj);
            }
            C7980b<Float, C8008p> c7980b2 = this.$bottomLightFraction;
            Float f11 = new Float(this.$currentCardOffset.k().floatValue() / this.$swipeConfig.getMaxOffset());
            this.label = 2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MatchShoppingCardsViewKt$MatchShoppingCardsView$3$2$1(M m11, C7980b<Float, C8008p> c7980b, C7980b<Float, C8008p> c7980b2, SwipeConfiguration swipeConfiguration) {
        super(1);
        this.$coroutineScope = m11;
        this.$currentCardOffset = c7980b;
        this.$bottomLightFraction = c7980b2;
        this.$swipeConfig = swipeConfiguration;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Float f7) {
        invoke(f7.floatValue());
        return Unit.f71690a;
    }

    public final void invoke(float f7) {
        C10727i.c(this.$coroutineScope, null, null, new AnonymousClass1(this.$currentCardOffset, f7, this.$bottomLightFraction, this.$swipeConfig, null), 3);
    }
}
