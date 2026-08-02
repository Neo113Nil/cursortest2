package kotlinx.coroutines.flow.internal;

import Sh.N;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.InterfaceC5322g;

/* loaded from: classes5.dex */
public final class C implements InterfaceC5322g {

    /* renamed from: a, reason: collision with root package name */
    public final CoroutineContext f54699a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f54700b;

    /* renamed from: c, reason: collision with root package name */
    public final Function2 f54701c;

    public static final class a extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f54702n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f54703o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ InterfaceC5322g f54704p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC5322g interfaceC5322g, Continuation continuation) {
            super(2, continuation);
            this.f54704p = interfaceC5322g;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            a aVar = new a(this.f54704p, continuation);
            aVar.f54703o = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object obj, Continuation continuation) {
            return ((a) create(obj, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f54702n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                Object obj2 = this.f54703o;
                InterfaceC5322g interfaceC5322g = this.f54704p;
                this.f54702n = 1;
                if (interfaceC5322g.emit(obj2, this) == coroutine_suspended) {
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

    public C(InterfaceC5322g interfaceC5322g, CoroutineContext coroutineContext) {
        this.f54699a = coroutineContext;
        this.f54700b = N.g(coroutineContext);
        this.f54701c = new a(interfaceC5322g, null);
    }

    @Override // kotlinx.coroutines.flow.InterfaceC5322g
    public Object emit(Object obj, Continuation continuation) {
        Object b10 = f.b(this.f54699a, obj, this.f54700b, this.f54701c, continuation);
        return b10 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? b10 : Unit.INSTANCE;
    }
}
