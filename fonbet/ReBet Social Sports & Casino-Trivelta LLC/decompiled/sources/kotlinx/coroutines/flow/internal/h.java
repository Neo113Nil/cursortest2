package kotlinx.coroutines.flow.internal;

import Ph.J;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.InterfaceC5321f;
import kotlinx.coroutines.flow.InterfaceC5322g;

/* loaded from: classes5.dex */
public abstract class h extends e {

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC5321f f54734d;

    public static final class a extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f54735n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f54736o;

        public a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            a aVar = h.this.new a(continuation);
            aVar.f54736o = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC5322g interfaceC5322g, Continuation continuation) {
            return ((a) create(interfaceC5322g, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f54735n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                InterfaceC5322g interfaceC5322g = (InterfaceC5322g) this.f54736o;
                h hVar = h.this;
                this.f54735n = 1;
                if (hVar.q(interfaceC5322g, this) == coroutine_suspended) {
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

    public h(InterfaceC5321f interfaceC5321f, CoroutineContext coroutineContext, int i10, Rh.d dVar) {
        super(coroutineContext, i10, dVar);
        this.f54734d = interfaceC5321f;
    }

    public static /* synthetic */ Object n(h hVar, InterfaceC5322g interfaceC5322g, Continuation continuation) {
        if (hVar.f54710b == -3) {
            CoroutineContext coroutineContext = continuation.get$context();
            CoroutineContext k10 = J.k(coroutineContext, hVar.f54709a);
            if (Intrinsics.areEqual(k10, coroutineContext)) {
                Object q10 = hVar.q(interfaceC5322g, continuation);
                return q10 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? q10 : Unit.INSTANCE;
            }
            ContinuationInterceptor.Companion companion = ContinuationInterceptor.INSTANCE;
            if (Intrinsics.areEqual(k10.get(companion), coroutineContext.get(companion))) {
                Object p10 = hVar.p(interfaceC5322g, k10, continuation);
                return p10 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? p10 : Unit.INSTANCE;
            }
        }
        Object collect = super.collect(interfaceC5322g, continuation);
        return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
    }

    public static /* synthetic */ Object o(h hVar, Rh.y yVar, Continuation continuation) {
        Object q10 = hVar.q(new z(yVar), continuation);
        return q10 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? q10 : Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.flow.internal.e, kotlinx.coroutines.flow.InterfaceC5321f
    public Object collect(InterfaceC5322g interfaceC5322g, Continuation continuation) {
        return n(this, interfaceC5322g, continuation);
    }

    @Override // kotlinx.coroutines.flow.internal.e
    public Object f(Rh.y yVar, Continuation continuation) {
        return o(this, yVar, continuation);
    }

    public final Object p(InterfaceC5322g interfaceC5322g, CoroutineContext coroutineContext, Continuation continuation) {
        InterfaceC5322g d10;
        d10 = f.d(interfaceC5322g, continuation.get$context());
        return f.c(coroutineContext, d10, null, new a(null), continuation, 4, null);
    }

    public abstract Object q(InterfaceC5322g interfaceC5322g, Continuation continuation);

    @Override // kotlinx.coroutines.flow.internal.e
    public String toString() {
        return this.f54734d + " -> " + super.toString();
    }
}
