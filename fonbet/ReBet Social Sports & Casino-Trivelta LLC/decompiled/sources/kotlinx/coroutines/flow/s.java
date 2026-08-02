package kotlinx.coroutines.flow;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class s {

    /* renamed from: a, reason: collision with root package name */
    public static final int f54886a = Sh.H.b("kotlinx.coroutines.flow.defaultConcurrency", 16, 1, Integer.MAX_VALUE);

    public static final class a implements InterfaceC5321f {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC5321f f54887a;

        public a(InterfaceC5321f interfaceC5321f) {
            this.f54887a = interfaceC5321f;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC5321f
        public Object collect(InterfaceC5322g interfaceC5322g, Continuation continuation) {
            Object collect = this.f54887a.collect(new b(interfaceC5322g), continuation);
            return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
        }
    }

    public static final class b implements InterfaceC5322g {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC5322g f54888a;

        public static final class a extends ContinuationImpl {

            /* renamed from: n, reason: collision with root package name */
            public /* synthetic */ Object f54889n;

            /* renamed from: p, reason: collision with root package name */
            public int f54891p;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f54889n = obj;
                this.f54891p |= Integer.MIN_VALUE;
                return b.this.emit(null, this);
            }
        }

        public b(InterfaceC5322g interfaceC5322g) {
            this.f54888a = interfaceC5322g;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @Override // kotlinx.coroutines.flow.InterfaceC5322g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(InterfaceC5321f interfaceC5321f, Continuation continuation) {
            a aVar;
            int i10;
            if (continuation instanceof a) {
                aVar = (a) continuation;
                int i11 = aVar.f54891p;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    aVar.f54891p = i11 - Integer.MIN_VALUE;
                    Object obj = aVar.f54889n;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i10 = aVar.f54891p;
                    if (i10 != 0) {
                        ResultKt.throwOnFailure(obj);
                        InterfaceC5322g interfaceC5322g = this.f54888a;
                        aVar.f54891p = 1;
                        if (AbstractC5323h.p(interfaceC5322g, interfaceC5321f, aVar) == coroutine_suspended) {
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
            aVar = new a(continuation);
            Object obj2 = aVar.f54889n;
            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i10 = aVar.f54891p;
            if (i10 != 0) {
            }
            return Unit.INSTANCE;
        }
    }

    public static final class c extends SuspendLambda implements Function3 {

        /* renamed from: n, reason: collision with root package name */
        public int f54892n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f54893o;

        /* renamed from: p, reason: collision with root package name */
        public /* synthetic */ Object f54894p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Function2 f54895q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Function2 function2, Continuation continuation) {
            super(3, continuation);
            this.f54895q = function2;
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC5322g interfaceC5322g, Object obj, Continuation continuation) {
            c cVar = new c(this.f54895q, continuation);
            cVar.f54893o = interfaceC5322g;
            cVar.f54894p = obj;
            return cVar.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
        
            if (r1.emit(r6, r5) == r0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
        
            if (r6 == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            InterfaceC5322g interfaceC5322g;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f54892n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                interfaceC5322g = (InterfaceC5322g) this.f54893o;
                Object obj2 = this.f54894p;
                Function2 function2 = this.f54895q;
                this.f54893o = interfaceC5322g;
                this.f54892n = 1;
                obj = function2.invoke(obj2, this);
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                interfaceC5322g = (InterfaceC5322g) this.f54893o;
                ResultKt.throwOnFailure(obj);
            }
            this.f54893o = null;
            this.f54892n = 2;
        }
    }

    public static final InterfaceC5321f a(InterfaceC5321f interfaceC5321f) {
        return new a(interfaceC5321f);
    }

    public static final InterfaceC5321f b(InterfaceC5321f interfaceC5321f, int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException(("Expected positive concurrency level, but had " + i10).toString());
        }
        if (i10 == 1) {
            return AbstractC5323h.u(interfaceC5321f);
        }
        return new kotlinx.coroutines.flow.internal.g(interfaceC5321f, i10, null, 0, null, 28, null);
    }

    public static /* synthetic */ InterfaceC5321f c(InterfaceC5321f interfaceC5321f, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = f54886a;
        }
        return AbstractC5323h.v(interfaceC5321f, i10);
    }

    public static final InterfaceC5321f d(InterfaceC5321f interfaceC5321f, Function2 function2) {
        return AbstractC5323h.O(interfaceC5321f, new c(function2, null));
    }

    public static final InterfaceC5321f e(InterfaceC5321f interfaceC5321f, Function3 function3) {
        return new kotlinx.coroutines.flow.internal.j(function3, interfaceC5321f, null, 0, null, 28, null);
    }
}
