package kotlinx.coroutines.flow.internal;

import Ph.AbstractC1459k;
import Ph.C0;
import Ph.P;
import Ph.Q;
import Ph.S;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.InterfaceC5321f;
import kotlinx.coroutines.flow.InterfaceC5322g;

/* loaded from: classes5.dex */
public final class j extends h {

    /* renamed from: e, reason: collision with root package name */
    public final Function3 f54738e;

    public static final class a extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f54739n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f54740o;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ InterfaceC5322g f54742q;

        /* renamed from: kotlinx.coroutines.flow.internal.j$a$a, reason: collision with other inner class name */
        public static final class C0791a implements InterfaceC5322g {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Ref.ObjectRef f54743a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ P f54744b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ j f54745c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ InterfaceC5322g f54746d;

            /* renamed from: kotlinx.coroutines.flow.internal.j$a$a$a, reason: collision with other inner class name */
            public static final class C0792a extends SuspendLambda implements Function2 {

                /* renamed from: n, reason: collision with root package name */
                public int f54747n;

                /* renamed from: o, reason: collision with root package name */
                public final /* synthetic */ j f54748o;

                /* renamed from: p, reason: collision with root package name */
                public final /* synthetic */ InterfaceC5322g f54749p;

                /* renamed from: q, reason: collision with root package name */
                public final /* synthetic */ Object f54750q;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0792a(j jVar, InterfaceC5322g interfaceC5322g, Object obj, Continuation continuation) {
                    super(2, continuation);
                    this.f54748o = jVar;
                    this.f54749p = interfaceC5322g;
                    this.f54750q = obj;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new C0792a(this.f54748o, this.f54749p, this.f54750q, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(P p10, Continuation continuation) {
                    return ((C0792a) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i10 = this.f54747n;
                    if (i10 == 0) {
                        ResultKt.throwOnFailure(obj);
                        Function3 function3 = this.f54748o.f54738e;
                        InterfaceC5322g interfaceC5322g = this.f54749p;
                        Object obj2 = this.f54750q;
                        this.f54747n = 1;
                        if (function3.invoke(interfaceC5322g, obj2, this) == coroutine_suspended) {
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

            /* renamed from: kotlinx.coroutines.flow.internal.j$a$a$b */
            public static final class b extends ContinuationImpl {

                /* renamed from: n, reason: collision with root package name */
                public Object f54751n;

                /* renamed from: o, reason: collision with root package name */
                public Object f54752o;

                /* renamed from: p, reason: collision with root package name */
                public Object f54753p;

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f54754q;

                /* renamed from: s, reason: collision with root package name */
                public int f54756s;

                public b(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f54754q = obj;
                    this.f54756s |= Integer.MIN_VALUE;
                    return C0791a.this.emit(null, this);
                }
            }

            public C0791a(Ref.ObjectRef objectRef, P p10, j jVar, InterfaceC5322g interfaceC5322g) {
                this.f54743a = objectRef;
                this.f54744b = p10;
                this.f54745c = jVar;
                this.f54746d = interfaceC5322g;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            /* JADX WARN: Type inference failed for: r8v2, types: [Ph.C0, T] */
            @Override // kotlinx.coroutines.flow.InterfaceC5322g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                b bVar;
                int i10;
                C0791a c0791a;
                ?? d10;
                if (continuation instanceof b) {
                    bVar = (b) continuation;
                    int i11 = bVar.f54756s;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        bVar.f54756s = i11 - Integer.MIN_VALUE;
                        Object obj2 = bVar.f54754q;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i10 = bVar.f54756s;
                        if (i10 != 0) {
                            ResultKt.throwOnFailure(obj2);
                            C0 c02 = (C0) this.f54743a.element;
                            if (c02 != null) {
                                c02.cancel((CancellationException) new k());
                                bVar.f54751n = this;
                                bVar.f54752o = obj;
                                bVar.f54753p = c02;
                                bVar.f54756s = 1;
                                if (c02.join(bVar) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            c0791a = this;
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            obj = bVar.f54752o;
                            c0791a = (C0791a) bVar.f54751n;
                            ResultKt.throwOnFailure(obj2);
                        }
                        Ref.ObjectRef objectRef = c0791a.f54743a;
                        d10 = AbstractC1459k.d(c0791a.f54744b, null, S.f9050d, new C0792a(c0791a.f54745c, c0791a.f54746d, obj, null), 1, null);
                        objectRef.element = d10;
                        return Unit.INSTANCE;
                    }
                }
                bVar = new b(continuation);
                Object obj22 = bVar.f54754q;
                Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = bVar.f54756s;
                if (i10 != 0) {
                }
                Ref.ObjectRef objectRef2 = c0791a.f54743a;
                d10 = AbstractC1459k.d(c0791a.f54744b, null, S.f9050d, new C0792a(c0791a.f54745c, c0791a.f54746d, obj, null), 1, null);
                objectRef2.element = d10;
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC5322g interfaceC5322g, Continuation continuation) {
            super(2, continuation);
            this.f54742q = interfaceC5322g;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            a aVar = j.this.new a(this.f54742q, continuation);
            aVar.f54740o = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((a) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f54739n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                P p10 = (P) this.f54740o;
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                j jVar = j.this;
                InterfaceC5321f interfaceC5321f = jVar.f54734d;
                C0791a c0791a = new C0791a(objectRef, p10, jVar, this.f54742q);
                this.f54739n = 1;
                if (interfaceC5321f.collect(c0791a, this) == coroutine_suspended) {
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

    public /* synthetic */ j(Function3 function3, InterfaceC5321f interfaceC5321f, CoroutineContext coroutineContext, int i10, Rh.d dVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(function3, interfaceC5321f, (i11 & 4) != 0 ? EmptyCoroutineContext.INSTANCE : coroutineContext, (i11 & 8) != 0 ? -2 : i10, (i11 & 16) != 0 ? Rh.d.f10307a : dVar);
    }

    @Override // kotlinx.coroutines.flow.internal.e
    public e i(CoroutineContext coroutineContext, int i10, Rh.d dVar) {
        return new j(this.f54738e, this.f54734d, coroutineContext, i10, dVar);
    }

    @Override // kotlinx.coroutines.flow.internal.h
    public Object q(InterfaceC5322g interfaceC5322g, Continuation continuation) {
        Object g10 = Q.g(new a(interfaceC5322g, null), continuation);
        return g10 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? g10 : Unit.INSTANCE;
    }

    public j(Function3 function3, InterfaceC5321f interfaceC5321f, CoroutineContext coroutineContext, int i10, Rh.d dVar) {
        super(interfaceC5321f, coroutineContext, i10, dVar);
        this.f54738e = function3;
    }
}
