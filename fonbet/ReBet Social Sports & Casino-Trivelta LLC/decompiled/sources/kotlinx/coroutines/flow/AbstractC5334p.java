package kotlinx.coroutines.flow;

import kotlin.ExceptionsKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.InlineMarker;

/* renamed from: kotlinx.coroutines.flow.p, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class AbstractC5334p {

    /* renamed from: kotlinx.coroutines.flow.p$a */
    public static final class a extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f54802n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f54803o;

        /* renamed from: p, reason: collision with root package name */
        public int f54804p;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f54803o = obj;
            this.f54804p |= Integer.MIN_VALUE;
            return AbstractC5334p.c(null, null, null, this);
        }
    }

    /* renamed from: kotlinx.coroutines.flow.p$b */
    public static final class b implements InterfaceC5321f {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC5321f f54805a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Function3 f54806b;

        /* renamed from: kotlinx.coroutines.flow.p$b$a */
        public static final class a extends ContinuationImpl {

            /* renamed from: n, reason: collision with root package name */
            public /* synthetic */ Object f54807n;

            /* renamed from: o, reason: collision with root package name */
            public int f54808o;

            /* renamed from: q, reason: collision with root package name */
            public Object f54810q;

            /* renamed from: r, reason: collision with root package name */
            public Object f54811r;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f54807n = obj;
                this.f54808o |= Integer.MIN_VALUE;
                return b.this.collect(null, this);
            }
        }

        public b(InterfaceC5321f interfaceC5321f, Function3 function3) {
            this.f54805a = interfaceC5321f;
            this.f54806b = function3;
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x0088  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00ac A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0055  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
        @Override // kotlinx.coroutines.flow.InterfaceC5321f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object collect(InterfaceC5322g interfaceC5322g, Continuation continuation) {
            a aVar;
            Object coroutine_suspended;
            int i10;
            b bVar;
            P p10;
            Function3 function3;
            kotlinx.coroutines.flow.internal.v vVar;
            Throwable th2;
            kotlinx.coroutines.flow.internal.v vVar2;
            Object invoke;
            try {
                if (continuation instanceof a) {
                    aVar = (a) continuation;
                    int i11 = aVar.f54808o;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        aVar.f54808o = i11 - Integer.MIN_VALUE;
                        Object obj = aVar.f54807n;
                        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i10 = aVar.f54808o;
                        if (i10 != 0) {
                            ResultKt.throwOnFailure(obj);
                            try {
                                InterfaceC5321f interfaceC5321f = this.f54805a;
                                aVar.f54810q = this;
                                aVar.f54811r = interfaceC5322g;
                                aVar.f54808o = 1;
                                if (interfaceC5321f.collect(interfaceC5322g, aVar) != coroutine_suspended) {
                                    bVar = this;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                bVar = this;
                                p10 = new P(th);
                                function3 = bVar.f54806b;
                                aVar.f54810q = th;
                                aVar.f54811r = null;
                                aVar.f54808o = 2;
                                if (AbstractC5334p.c(p10, function3, th, aVar) != coroutine_suspended) {
                                }
                            }
                            return coroutine_suspended;
                        }
                        if (i10 != 1) {
                            if (i10 == 2) {
                                Throwable th4 = (Throwable) aVar.f54810q;
                                ResultKt.throwOnFailure(obj);
                                throw th4;
                            }
                            if (i10 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            vVar2 = (kotlinx.coroutines.flow.internal.v) aVar.f54810q;
                            try {
                                ResultKt.throwOnFailure(obj);
                                vVar2.releaseIntercepted();
                                return Unit.INSTANCE;
                            } catch (Throwable th5) {
                                th2 = th5;
                                vVar2.releaseIntercepted();
                                throw th2;
                            }
                        }
                        interfaceC5322g = (InterfaceC5322g) aVar.f54811r;
                        bVar = (b) aVar.f54810q;
                        try {
                            ResultKt.throwOnFailure(obj);
                        } catch (Throwable th6) {
                            th = th6;
                            p10 = new P(th);
                            function3 = bVar.f54806b;
                            aVar.f54810q = th;
                            aVar.f54811r = null;
                            aVar.f54808o = 2;
                            if (AbstractC5334p.c(p10, function3, th, aVar) != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            throw th;
                        }
                        vVar = new kotlinx.coroutines.flow.internal.v(interfaceC5322g, aVar.get$context());
                        Function3 function32 = bVar.f54806b;
                        aVar.f54810q = vVar;
                        aVar.f54811r = null;
                        aVar.f54808o = 3;
                        InlineMarker.mark(6);
                        invoke = function32.invoke(vVar, null, aVar);
                        InlineMarker.mark(7);
                        if (invoke != coroutine_suspended) {
                            vVar2 = vVar;
                            vVar2.releaseIntercepted();
                            return Unit.INSTANCE;
                        }
                        return coroutine_suspended;
                    }
                }
                Function3 function322 = bVar.f54806b;
                aVar.f54810q = vVar;
                aVar.f54811r = null;
                aVar.f54808o = 3;
                InlineMarker.mark(6);
                invoke = function322.invoke(vVar, null, aVar);
                InlineMarker.mark(7);
                if (invoke != coroutine_suspended) {
                }
                return coroutine_suspended;
            } catch (Throwable th7) {
                th2 = th7;
                vVar2 = vVar;
                vVar2.releaseIntercepted();
                throw th2;
            }
            aVar = new a(continuation);
            Object obj2 = aVar.f54807n;
            coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i10 = aVar.f54808o;
            if (i10 != 0) {
            }
            vVar = new kotlinx.coroutines.flow.internal.v(interfaceC5322g, aVar.get$context());
        }
    }

    /* renamed from: kotlinx.coroutines.flow.p$c */
    public static final class c implements InterfaceC5321f {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function2 f54812a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC5321f f54813b;

        /* renamed from: kotlinx.coroutines.flow.p$c$a */
        public static final class a extends ContinuationImpl {

            /* renamed from: n, reason: collision with root package name */
            public /* synthetic */ Object f54814n;

            /* renamed from: o, reason: collision with root package name */
            public int f54815o;

            /* renamed from: q, reason: collision with root package name */
            public Object f54817q;

            /* renamed from: r, reason: collision with root package name */
            public Object f54818r;

            /* renamed from: s, reason: collision with root package name */
            public Object f54819s;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f54814n = obj;
                this.f54815o |= Integer.MIN_VALUE;
                return c.this.collect(null, this);
            }
        }

        public c(Function2 function2, InterfaceC5321f interfaceC5321f) {
            this.f54812a = function2;
            this.f54813b = interfaceC5321f;
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0080, code lost:
        
            if (r7.collect(r2, r0) != r1) goto L28;
         */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        @Override // kotlinx.coroutines.flow.InterfaceC5321f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object collect(InterfaceC5322g interfaceC5322g, Continuation continuation) {
            a aVar;
            int i10;
            Throwable th2;
            kotlinx.coroutines.flow.internal.v vVar;
            c cVar;
            InterfaceC5322g interfaceC5322g2;
            if (continuation instanceof a) {
                aVar = (a) continuation;
                int i11 = aVar.f54815o;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    aVar.f54815o = i11 - Integer.MIN_VALUE;
                    Object obj = aVar.f54814n;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i10 = aVar.f54815o;
                    if (i10 != 0) {
                        ResultKt.throwOnFailure(obj);
                        kotlinx.coroutines.flow.internal.v vVar2 = new kotlinx.coroutines.flow.internal.v(interfaceC5322g, aVar.get$context());
                        try {
                            Function2 function2 = this.f54812a;
                            aVar.f54817q = this;
                            aVar.f54818r = interfaceC5322g;
                            aVar.f54819s = vVar2;
                            aVar.f54815o = 1;
                            InlineMarker.mark(6);
                            Object invoke = function2.invoke(vVar2, aVar);
                            InlineMarker.mark(7);
                            if (invoke != coroutine_suspended) {
                                cVar = this;
                                interfaceC5322g2 = interfaceC5322g;
                                vVar = vVar2;
                            }
                            return coroutine_suspended;
                        } catch (Throwable th3) {
                            th2 = th3;
                            vVar = vVar2;
                            vVar.releaseIntercepted();
                            throw th2;
                        }
                    }
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    vVar = (kotlinx.coroutines.flow.internal.v) aVar.f54819s;
                    interfaceC5322g2 = (InterfaceC5322g) aVar.f54818r;
                    cVar = (c) aVar.f54817q;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Throwable th4) {
                        th2 = th4;
                        vVar.releaseIntercepted();
                        throw th2;
                    }
                    vVar.releaseIntercepted();
                    InterfaceC5321f interfaceC5321f = cVar.f54813b;
                    aVar.f54817q = null;
                    aVar.f54818r = null;
                    aVar.f54819s = null;
                    aVar.f54815o = 2;
                }
            }
            aVar = new a(continuation);
            Object obj2 = aVar.f54814n;
            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i10 = aVar.f54815o;
            if (i10 != 0) {
            }
            vVar.releaseIntercepted();
            InterfaceC5321f interfaceC5321f2 = cVar.f54813b;
            aVar.f54817q = null;
            aVar.f54818r = null;
            aVar.f54819s = null;
            aVar.f54815o = 2;
        }
    }

    public static final void b(InterfaceC5322g interfaceC5322g) {
        if (interfaceC5322g instanceof P) {
            throw ((P) interfaceC5322g).f54666a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(InterfaceC5322g interfaceC5322g, Function3 function3, Throwable th2, Continuation continuation) {
        a aVar;
        int i10;
        try {
            if (continuation instanceof a) {
                aVar = (a) continuation;
                int i11 = aVar.f54804p;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    aVar.f54804p = i11 - Integer.MIN_VALUE;
                    Object obj = aVar.f54803o;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i10 = aVar.f54804p;
                    if (i10 != 0) {
                        ResultKt.throwOnFailure(obj);
                        aVar.f54802n = th2;
                        aVar.f54804p = 1;
                        if (function3.invoke(interfaceC5322g, th2, aVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        th2 = (Throwable) aVar.f54802n;
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
            }
            if (i10 != 0) {
            }
            return Unit.INSTANCE;
        } catch (Throwable th3) {
            if (th2 != null && th2 != th3) {
                ExceptionsKt.addSuppressed(th3, th2);
            }
            throw th3;
        }
        aVar = new a(continuation);
        Object obj2 = aVar.f54803o;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = aVar.f54804p;
    }

    public static final InterfaceC5321f d(InterfaceC5321f interfaceC5321f, Function3 function3) {
        return new b(interfaceC5321f, function3);
    }

    public static final InterfaceC5321f e(InterfaceC5321f interfaceC5321f, Function2 function2) {
        return new c(function2, interfaceC5321f);
    }
}
