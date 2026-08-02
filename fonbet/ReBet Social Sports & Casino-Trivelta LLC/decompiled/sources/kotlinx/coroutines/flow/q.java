package kotlinx.coroutines.flow;

import Ph.C0;
import java.util.concurrent.CancellationException;
import kotlin.ExceptionsKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class q {

    public static final class a extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f54820n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f54821o;

        /* renamed from: p, reason: collision with root package name */
        public int f54822p;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f54821o = obj;
            this.f54822p |= Integer.MIN_VALUE;
            return AbstractC5323h.f(null, null, this);
        }
    }

    public static final class b implements InterfaceC5322g {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC5322g f54823a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef f54824b;

        public static final class a extends ContinuationImpl {

            /* renamed from: n, reason: collision with root package name */
            public Object f54825n;

            /* renamed from: o, reason: collision with root package name */
            public /* synthetic */ Object f54826o;

            /* renamed from: q, reason: collision with root package name */
            public int f54828q;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f54826o = obj;
                this.f54828q |= Integer.MIN_VALUE;
                return b.this.emit(null, this);
            }
        }

        public b(InterfaceC5322g interfaceC5322g, Ref.ObjectRef objectRef) {
            this.f54823a = interfaceC5322g;
            this.f54824b = objectRef;
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Throwable] */
        /* JADX WARN: Type inference failed for: r6v4, types: [T, java.lang.Throwable] */
        /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Throwable] */
        @Override // kotlinx.coroutines.flow.InterfaceC5322g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            a aVar;
            int i10;
            b bVar;
            if (continuation instanceof a) {
                aVar = (a) continuation;
                int i11 = aVar.f54828q;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    aVar.f54828q = i11 - Integer.MIN_VALUE;
                    Object obj2 = aVar.f54826o;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i10 = aVar.f54828q;
                    if (i10 != 0) {
                        ResultKt.throwOnFailure(obj2);
                        try {
                            InterfaceC5322g interfaceC5322g = this.f54823a;
                            aVar.f54825n = this;
                            aVar.f54828q = 1;
                            if (interfaceC5322g.emit(obj, aVar) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            bVar = this;
                            bVar.f54824b.element = th;
                            throw th;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar = (b) aVar.f54825n;
                        try {
                            ResultKt.throwOnFailure(obj2);
                        } catch (Throwable th3) {
                            th = th3;
                            bVar.f54824b.element = th;
                            throw th;
                        }
                    }
                    return Unit.INSTANCE;
                }
            }
            aVar = new a(continuation);
            Object obj22 = aVar.f54826o;
            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i10 = aVar.f54828q;
            if (i10 != 0) {
            }
            return Unit.INSTANCE;
        }
    }

    public static final class c implements InterfaceC5321f {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC5321f f54829a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Function4 f54830b;

        public static final class a extends ContinuationImpl {

            /* renamed from: n, reason: collision with root package name */
            public /* synthetic */ Object f54831n;

            /* renamed from: o, reason: collision with root package name */
            public int f54832o;

            /* renamed from: q, reason: collision with root package name */
            public Object f54834q;

            /* renamed from: r, reason: collision with root package name */
            public Object f54835r;

            /* renamed from: s, reason: collision with root package name */
            public Object f54836s;

            /* renamed from: t, reason: collision with root package name */
            public long f54837t;

            /* renamed from: u, reason: collision with root package name */
            public int f54838u;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f54831n = obj;
                this.f54832o |= Integer.MIN_VALUE;
                return c.this.collect(null, this);
            }
        }

        public c(InterfaceC5321f interfaceC5321f, Function4 function4) {
            this.f54829a = interfaceC5321f;
            this.f54830b = function4;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x00a2  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x00ab  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x00ae  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0078  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00a8  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0076 -> B:14:0x00a6). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0097 -> B:11:0x009a). Please report as a decompilation issue!!! */
        @Override // kotlinx.coroutines.flow.InterfaceC5321f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object collect(InterfaceC5322g interfaceC5322g, Continuation continuation) {
            a aVar;
            int i10;
            long j10;
            c cVar;
            int i11;
            c cVar2;
            InterfaceC5322g interfaceC5322g2;
            Throwable th2;
            Object f10;
            if (continuation instanceof a) {
                aVar = (a) continuation;
                int i12 = aVar.f54832o;
                if ((i12 & Integer.MIN_VALUE) != 0) {
                    aVar.f54832o = i12 - Integer.MIN_VALUE;
                    Object obj = aVar.f54831n;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i10 = aVar.f54832o;
                    if (i10 != 0) {
                        ResultKt.throwOnFailure(obj);
                        j10 = 0;
                        cVar = this;
                        InterfaceC5321f interfaceC5321f = cVar.f54829a;
                        aVar.f54834q = cVar;
                        aVar.f54835r = interfaceC5322g;
                        aVar.f54836s = null;
                        aVar.f54837t = j10;
                        aVar.f54838u = 0;
                        aVar.f54832o = 1;
                        f10 = AbstractC5323h.f(interfaceC5321f, interfaceC5322g, aVar);
                        if (f10 != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    }
                    if (i10 == 1) {
                        i11 = aVar.f54838u;
                        j10 = aVar.f54837t;
                        interfaceC5322g2 = (InterfaceC5322g) aVar.f54835r;
                        cVar2 = (c) aVar.f54834q;
                        ResultKt.throwOnFailure(obj);
                        th2 = (Throwable) obj;
                        if (th2 != null) {
                        }
                        cVar = cVar2;
                        if (i11 == 0) {
                        }
                    } else {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j10 = aVar.f54837t;
                        Throwable th3 = (Throwable) aVar.f54836s;
                        interfaceC5322g2 = (InterfaceC5322g) aVar.f54835r;
                        cVar2 = (c) aVar.f54834q;
                        ResultKt.throwOnFailure(obj);
                        if (!((Boolean) obj).booleanValue()) {
                            j10++;
                            i11 = 1;
                            cVar = cVar2;
                            if (i11 == 0) {
                                return Unit.INSTANCE;
                            }
                            interfaceC5322g = interfaceC5322g2;
                            InterfaceC5321f interfaceC5321f2 = cVar.f54829a;
                            aVar.f54834q = cVar;
                            aVar.f54835r = interfaceC5322g;
                            aVar.f54836s = null;
                            aVar.f54837t = j10;
                            aVar.f54838u = 0;
                            aVar.f54832o = 1;
                            f10 = AbstractC5323h.f(interfaceC5321f2, interfaceC5322g, aVar);
                            if (f10 != coroutine_suspended) {
                                interfaceC5322g2 = interfaceC5322g;
                                i11 = 0;
                                cVar2 = cVar;
                                obj = f10;
                                th2 = (Throwable) obj;
                                if (th2 != null) {
                                    Function4 function4 = cVar2.f54830b;
                                    Long boxLong = Boxing.boxLong(j10);
                                    aVar.f54834q = cVar2;
                                    aVar.f54835r = interfaceC5322g2;
                                    aVar.f54836s = th2;
                                    aVar.f54837t = j10;
                                    aVar.f54832o = 2;
                                    InlineMarker.mark(6);
                                    Object invoke = function4.invoke(interfaceC5322g2, th2, boxLong, aVar);
                                    InlineMarker.mark(7);
                                    if (invoke != coroutine_suspended) {
                                        obj = invoke;
                                        th3 = th2;
                                        if (!((Boolean) obj).booleanValue()) {
                                            throw th3;
                                        }
                                    }
                                }
                                cVar = cVar2;
                                if (i11 == 0) {
                                }
                            }
                            return coroutine_suspended;
                        }
                    }
                }
            }
            aVar = new a(continuation);
            Object obj2 = aVar.f54831n;
            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i10 = aVar.f54832o;
            if (i10 != 0) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(InterfaceC5321f interfaceC5321f, InterfaceC5322g interfaceC5322g, Continuation continuation) {
        a aVar;
        int i10;
        Ref.ObjectRef objectRef;
        Throwable th2;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i11 = aVar.f54822p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f54822p = i11 - Integer.MIN_VALUE;
                Object obj = aVar.f54821o;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = aVar.f54822p;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                    try {
                        InterfaceC5322g bVar = new b(interfaceC5322g, objectRef2);
                        aVar.f54820n = objectRef2;
                        aVar.f54822p = 1;
                        if (interfaceC5321f.collect(bVar, aVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return null;
                    } catch (Throwable th3) {
                        th = th3;
                        objectRef = objectRef2;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    objectRef = (Ref.ObjectRef) aVar.f54820n;
                    try {
                        ResultKt.throwOnFailure(obj);
                        return null;
                    } catch (Throwable th4) {
                        th = th4;
                    }
                }
                th2 = (Throwable) objectRef.element;
                if (!c(th, th2) || b(th, aVar.get$context())) {
                    throw th;
                }
                if (th2 == null) {
                    return th;
                }
                if (th instanceof CancellationException) {
                    ExceptionsKt.addSuppressed(th2, th);
                    throw th2;
                }
                ExceptionsKt.addSuppressed(th, th2);
                throw th;
            }
        }
        aVar = new a(continuation);
        Object obj2 = aVar.f54821o;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = aVar.f54822p;
        if (i10 != 0) {
        }
        th2 = (Throwable) objectRef.element;
        if (c(th, th2)) {
        }
        throw th;
    }

    public static final boolean b(Throwable th2, CoroutineContext coroutineContext) {
        C0 c02 = (C0) coroutineContext.get(C0.f9001U2);
        if (c02 == null || !c02.isCancelled()) {
            return false;
        }
        return c(th2, c02.getCancellationException());
    }

    public static final boolean c(Throwable th2, Throwable th3) {
        return th3 != null && Intrinsics.areEqual(th3, th2);
    }

    public static final InterfaceC5321f d(InterfaceC5321f interfaceC5321f, Function4 function4) {
        return new c(interfaceC5321f, function4);
    }
}
