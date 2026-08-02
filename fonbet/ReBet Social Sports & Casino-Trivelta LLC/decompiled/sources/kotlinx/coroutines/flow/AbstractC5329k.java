package kotlinx.coroutines.flow;

import Ph.AbstractC1459k;
import Ph.C0;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: kotlinx.coroutines.flow.k, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class AbstractC5329k {

    /* renamed from: kotlinx.coroutines.flow.k$a */
    public static final class a extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f54798n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC5321f f54799o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC5321f interfaceC5321f, Continuation continuation) {
            super(2, continuation);
            this.f54799o = interfaceC5321f;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new a(this.f54799o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Ph.P p10, Continuation continuation) {
            return ((a) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f54798n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                InterfaceC5321f interfaceC5321f = this.f54799o;
                this.f54798n = 1;
                if (AbstractC5323h.g(interfaceC5321f, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final Object a(InterfaceC5321f interfaceC5321f, Continuation continuation) {
        Object collect = interfaceC5321f.collect(kotlinx.coroutines.flow.internal.s.f54779a, continuation);
        return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
    }

    public static final Object b(InterfaceC5321f interfaceC5321f, Function2 function2, Continuation continuation) {
        Object g10 = AbstractC5323h.g(AbstractC5330l.b(AbstractC5323h.D(interfaceC5321f, function2), 0, null, 2, null), continuation);
        return g10 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? g10 : Unit.INSTANCE;
    }

    public static final Object c(InterfaceC5322g interfaceC5322g, InterfaceC5321f interfaceC5321f, Continuation continuation) {
        AbstractC5323h.q(interfaceC5322g);
        Object collect = interfaceC5321f.collect(interfaceC5322g, continuation);
        return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
    }

    public static final C0 d(InterfaceC5321f interfaceC5321f, Ph.P p10) {
        C0 d10;
        d10 = AbstractC1459k.d(p10, null, null, new a(interfaceC5321f, null), 3, null);
        return d10;
    }
}
