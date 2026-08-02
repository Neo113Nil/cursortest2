package kotlinx.coroutines.flow;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Ref;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class v {

    public static final class a implements InterfaceC5321f {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC5321f f54929a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Function2 f54930b;

        /* renamed from: kotlinx.coroutines.flow.v$a$a, reason: collision with other inner class name */
        public static final class C0798a implements InterfaceC5322g {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC5322g f54931a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Function2 f54932b;

            /* renamed from: kotlinx.coroutines.flow.v$a$a$a, reason: collision with other inner class name */
            public static final class C0799a extends ContinuationImpl {

                /* renamed from: n, reason: collision with root package name */
                public /* synthetic */ Object f54933n;

                /* renamed from: o, reason: collision with root package name */
                public int f54934o;

                /* renamed from: q, reason: collision with root package name */
                public Object f54936q;

                /* renamed from: r, reason: collision with root package name */
                public Object f54937r;

                public C0799a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f54933n = obj;
                    this.f54934o |= Integer.MIN_VALUE;
                    return C0798a.this.emit(null, this);
                }
            }

            public C0798a(InterfaceC5322g interfaceC5322g, Function2 function2) {
                this.f54931a = interfaceC5322g;
                this.f54932b = function2;
            }

            /* JADX WARN: Code restructure failed: missing block: B:18:0x0067, code lost:
            
                if (r6.emit(r2, r0) != r1) goto L23;
             */
            /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
            @Override // kotlinx.coroutines.flow.InterfaceC5322g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                C0799a c0799a;
                int i10;
                Object obj2;
                InterfaceC5322g interfaceC5322g;
                if (continuation instanceof C0799a) {
                    c0799a = (C0799a) continuation;
                    int i11 = c0799a.f54934o;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        c0799a.f54934o = i11 - Integer.MIN_VALUE;
                        Object obj3 = c0799a.f54933n;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i10 = c0799a.f54934o;
                        if (i10 != 0) {
                            ResultKt.throwOnFailure(obj3);
                            InterfaceC5322g interfaceC5322g2 = this.f54931a;
                            Function2 function2 = this.f54932b;
                            c0799a.f54936q = obj;
                            c0799a.f54937r = interfaceC5322g2;
                            c0799a.f54934o = 1;
                            InlineMarker.mark(6);
                            Object invoke = function2.invoke(obj, c0799a);
                            InlineMarker.mark(7);
                            if (invoke != coroutine_suspended) {
                                obj2 = obj;
                                interfaceC5322g = interfaceC5322g2;
                            }
                            return coroutine_suspended;
                        }
                        if (i10 != 1) {
                            if (i10 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj3);
                            return Unit.INSTANCE;
                        }
                        interfaceC5322g = (InterfaceC5322g) c0799a.f54937r;
                        obj2 = c0799a.f54936q;
                        ResultKt.throwOnFailure(obj3);
                        c0799a.f54936q = null;
                        c0799a.f54937r = null;
                        c0799a.f54934o = 2;
                    }
                }
                c0799a = new C0799a(continuation);
                Object obj32 = c0799a.f54933n;
                Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = c0799a.f54934o;
                if (i10 != 0) {
                }
                c0799a.f54936q = null;
                c0799a.f54937r = null;
                c0799a.f54934o = 2;
            }
        }

        public a(InterfaceC5321f interfaceC5321f, Function2 function2) {
            this.f54929a = interfaceC5321f;
            this.f54930b = function2;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC5321f
        public Object collect(InterfaceC5322g interfaceC5322g, Continuation continuation) {
            Object collect = this.f54929a.collect(new C0798a(interfaceC5322g, this.f54930b), continuation);
            return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
        }
    }

    public static final class b implements InterfaceC5321f {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f54938a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC5321f f54939b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Function3 f54940c;

        public static final class a extends ContinuationImpl {

            /* renamed from: n, reason: collision with root package name */
            public /* synthetic */ Object f54941n;

            /* renamed from: o, reason: collision with root package name */
            public int f54942o;

            /* renamed from: q, reason: collision with root package name */
            public Object f54944q;

            /* renamed from: r, reason: collision with root package name */
            public Object f54945r;

            /* renamed from: s, reason: collision with root package name */
            public Object f54946s;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f54941n = obj;
                this.f54942o |= Integer.MIN_VALUE;
                return b.this.collect(null, this);
            }
        }

        public b(Object obj, InterfaceC5321f interfaceC5321f, Function3 function3) {
            this.f54938a = obj;
            this.f54939b = interfaceC5321f;
            this.f54940c = function3;
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0078, code lost:
        
            if (r8.collect(r5, r0) != r1) goto L23;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Object] */
        @Override // kotlinx.coroutines.flow.InterfaceC5321f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object collect(InterfaceC5322g interfaceC5322g, Continuation continuation) {
            a aVar;
            int i10;
            b bVar;
            InterfaceC5322g interfaceC5322g2;
            Ref.ObjectRef objectRef;
            if (continuation instanceof a) {
                aVar = (a) continuation;
                int i11 = aVar.f54942o;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    aVar.f54942o = i11 - Integer.MIN_VALUE;
                    Object obj = aVar.f54941n;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i10 = aVar.f54942o;
                    if (i10 != 0) {
                        ResultKt.throwOnFailure(obj);
                        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                        ?? r22 = this.f54938a;
                        objectRef2.element = r22;
                        aVar.f54944q = this;
                        aVar.f54945r = interfaceC5322g;
                        aVar.f54946s = objectRef2;
                        aVar.f54942o = 1;
                        if (interfaceC5322g.emit(r22, aVar) != coroutine_suspended) {
                            bVar = this;
                            interfaceC5322g2 = interfaceC5322g;
                            objectRef = objectRef2;
                        }
                        return coroutine_suspended;
                    }
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    objectRef = (Ref.ObjectRef) aVar.f54946s;
                    interfaceC5322g2 = (InterfaceC5322g) aVar.f54945r;
                    bVar = (b) aVar.f54944q;
                    ResultKt.throwOnFailure(obj);
                    InterfaceC5321f interfaceC5321f = bVar.f54939b;
                    c cVar = new c(objectRef, bVar.f54940c, interfaceC5322g2);
                    aVar.f54944q = null;
                    aVar.f54945r = null;
                    aVar.f54946s = null;
                    aVar.f54942o = 2;
                }
            }
            aVar = new a(continuation);
            Object obj2 = aVar.f54941n;
            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i10 = aVar.f54942o;
            if (i10 != 0) {
            }
            InterfaceC5321f interfaceC5321f2 = bVar.f54939b;
            c cVar2 = new c(objectRef, bVar.f54940c, interfaceC5322g2);
            aVar.f54944q = null;
            aVar.f54945r = null;
            aVar.f54946s = null;
            aVar.f54942o = 2;
        }
    }

    public static final class c implements InterfaceC5322g {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef f54947a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Function3 f54948b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ InterfaceC5322g f54949c;

        public static final class a extends ContinuationImpl {

            /* renamed from: n, reason: collision with root package name */
            public Object f54950n;

            /* renamed from: o, reason: collision with root package name */
            public Object f54951o;

            /* renamed from: p, reason: collision with root package name */
            public /* synthetic */ Object f54952p;

            /* renamed from: r, reason: collision with root package name */
            public int f54954r;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f54952p = obj;
                this.f54954r |= Integer.MIN_VALUE;
                return c.this.emit(null, this);
            }
        }

        public c(Ref.ObjectRef objectRef, Function3 function3, InterfaceC5322g interfaceC5322g) {
            this.f54947a = objectRef;
            this.f54948b = function3;
            this.f54949c = interfaceC5322g;
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x006d, code lost:
        
            if (r7.emit(r8, r0) != r1) goto L23;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        @Override // kotlinx.coroutines.flow.InterfaceC5322g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            a aVar;
            int i10;
            T t10;
            Ref.ObjectRef objectRef;
            c cVar;
            if (continuation instanceof a) {
                aVar = (a) continuation;
                int i11 = aVar.f54954r;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    aVar.f54954r = i11 - Integer.MIN_VALUE;
                    Object obj2 = aVar.f54952p;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i10 = aVar.f54954r;
                    if (i10 != 0) {
                        ResultKt.throwOnFailure(obj2);
                        Ref.ObjectRef objectRef2 = this.f54947a;
                        Function3 function3 = this.f54948b;
                        T t11 = objectRef2.element;
                        aVar.f54950n = this;
                        aVar.f54951o = objectRef2;
                        aVar.f54954r = 1;
                        Object invoke = function3.invoke(t11, obj, aVar);
                        if (invoke != coroutine_suspended) {
                            t10 = invoke;
                            objectRef = objectRef2;
                            cVar = this;
                        }
                        return coroutine_suspended;
                    }
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                        return Unit.INSTANCE;
                    }
                    objectRef = (Ref.ObjectRef) aVar.f54951o;
                    cVar = (c) aVar.f54950n;
                    ResultKt.throwOnFailure(obj2);
                    t10 = obj2;
                    objectRef.element = t10;
                    InterfaceC5322g interfaceC5322g = cVar.f54949c;
                    Object obj3 = cVar.f54947a.element;
                    aVar.f54950n = null;
                    aVar.f54951o = null;
                    aVar.f54954r = 2;
                }
            }
            aVar = new a(continuation);
            Object obj22 = aVar.f54952p;
            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i10 = aVar.f54954r;
            if (i10 != 0) {
            }
            objectRef.element = t10;
            InterfaceC5322g interfaceC5322g2 = cVar.f54949c;
            Object obj32 = cVar.f54947a.element;
            aVar.f54950n = null;
            aVar.f54951o = null;
            aVar.f54954r = 2;
        }
    }

    public static final InterfaceC5321f a(InterfaceC5321f interfaceC5321f, Function2 function2) {
        return new a(interfaceC5321f, function2);
    }

    public static final InterfaceC5321f b(InterfaceC5321f interfaceC5321f, Object obj, Function3 function3) {
        return new b(obj, interfaceC5321f, function3);
    }

    public static final InterfaceC5321f c(InterfaceC5321f interfaceC5321f, Object obj, Function3 function3) {
        return AbstractC5323h.I(interfaceC5321f, obj, function3);
    }
}
