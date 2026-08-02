package ru.ozon.app.android.cart.domain.prefetch.controller;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.cart.common.domain.delegate.CartModeManager;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.cart.domain.prefetch.controller.CartPrefetchControllerImpl$waitActionIfNeedThenDo$1", f = "CartPrefetchControllerImpl.kt", l = {243}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class CartPrefetchControllerImpl$waitActionIfNeedThenDo$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ Function0<Object> $then;
    int label;
    final /* synthetic */ CartPrefetchControllerImpl this$0;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "it"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "ru.ozon.app.android.cart.domain.prefetch.controller.CartPrefetchControllerImpl$waitActionIfNeedThenDo$1$1", f = "CartPrefetchControllerImpl.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.cart.domain.prefetch.controller.CartPrefetchControllerImpl$waitActionIfNeedThenDo$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<Boolean, d<? super Boolean>, Object> {
        /* synthetic */ boolean Z$0;
        int label;

        AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(dVar);
            anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, d<? super Boolean> dVar) {
            return invoke(bool.booleanValue(), dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return Boolean.valueOf(!this.Z$0);
        }

        public final Object invoke(boolean z11, d<? super Boolean> dVar) {
            return ((AnonymousClass1) create(Boolean.valueOf(z11), dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CartPrefetchControllerImpl$waitActionIfNeedThenDo$1(CartPrefetchControllerImpl cartPrefetchControllerImpl, Function0<? extends Object> function0, d<? super CartPrefetchControllerImpl$waitActionIfNeedThenDo$1> dVar) {
        super(2, dVar);
        this.this$0 = cartPrefetchControllerImpl;
        this.$then = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new CartPrefetchControllerImpl$waitActionIfNeedThenDo$1(this.this$0, this.$then, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CartModeManager cartModeManager;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            cartModeManager = this.this$0.cartModeManager;
            InterfaceC2395h<Boolean> processingResetAction = cartModeManager.getProcessingResetAction();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
            this.label = 1;
            if (C2399j.v(processingResetAction, anonymousClass1, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        this.$then.invoke();
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((CartPrefetchControllerImpl$waitActionIfNeedThenDo$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
