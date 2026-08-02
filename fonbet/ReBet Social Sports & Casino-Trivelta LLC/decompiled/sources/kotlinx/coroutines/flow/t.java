package kotlinx.coroutines.flow;

import Ph.F0;
import java.util.NoSuchElementException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.internal.C5325a;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class t {

    public static final class a implements InterfaceC5322g {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef f54896a;

        public a(Ref.ObjectRef objectRef) {
            this.f54896a = objectRef;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlinx.coroutines.flow.InterfaceC5322g
        public Object emit(Object obj, Continuation continuation) {
            this.f54896a.element = obj;
            throw new C5325a(this);
        }
    }

    public static final class b implements InterfaceC5322g {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function2 f54897a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef f54898b;

        public static final class a extends ContinuationImpl {

            /* renamed from: n, reason: collision with root package name */
            public Object f54899n;

            /* renamed from: o, reason: collision with root package name */
            public /* synthetic */ Object f54900o;

            /* renamed from: p, reason: collision with root package name */
            public int f54901p;

            /* renamed from: r, reason: collision with root package name */
            public Object f54903r;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f54900o = obj;
                this.f54901p |= Integer.MIN_VALUE;
                return b.this.emit(null, this);
            }
        }

        public b(Function2 function2, Ref.ObjectRef objectRef) {
            this.f54897a = function2;
            this.f54898b = objectRef;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x005d  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @Override // kotlinx.coroutines.flow.InterfaceC5322g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object emit(Object obj, Continuation continuation) {
            a aVar;
            Object obj2;
            int i10;
            b bVar;
            T t10;
            if (continuation instanceof a) {
                aVar = (a) continuation;
                int i11 = aVar.f54901p;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    aVar.f54901p = i11 - Integer.MIN_VALUE;
                    obj2 = aVar.f54900o;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i10 = aVar.f54901p;
                    if (i10 != 0) {
                        ResultKt.throwOnFailure(obj2);
                        Function2 function2 = this.f54897a;
                        aVar.f54899n = this;
                        aVar.f54903r = obj;
                        aVar.f54901p = 1;
                        InlineMarker.mark(6);
                        obj2 = function2.invoke(obj, aVar);
                        InlineMarker.mark(7);
                        if (obj2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        bVar = this;
                        t10 = obj;
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Object obj3 = aVar.f54903r;
                        bVar = (b) aVar.f54899n;
                        ResultKt.throwOnFailure(obj2);
                        t10 = obj3;
                    }
                    if (((Boolean) obj2).booleanValue()) {
                        return Unit.INSTANCE;
                    }
                    bVar.f54898b.element = t10;
                    throw new C5325a(bVar);
                }
            }
            aVar = new a(continuation);
            obj2 = aVar.f54900o;
            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i10 = aVar.f54901p;
            if (i10 != 0) {
            }
            if (((Boolean) obj2).booleanValue()) {
            }
        }
    }

    public static final class c extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f54904n;

        /* renamed from: o, reason: collision with root package name */
        public Object f54905o;

        /* renamed from: p, reason: collision with root package name */
        public /* synthetic */ Object f54906p;

        /* renamed from: q, reason: collision with root package name */
        public int f54907q;

        public c(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f54906p = obj;
            this.f54907q |= Integer.MIN_VALUE;
            return AbstractC5323h.r(null, this);
        }
    }

    public static final class d extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f54908n;

        /* renamed from: o, reason: collision with root package name */
        public Object f54909o;

        /* renamed from: p, reason: collision with root package name */
        public /* synthetic */ Object f54910p;

        /* renamed from: q, reason: collision with root package name */
        public int f54911q;

        public d(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f54910p = obj;
            this.f54911q |= Integer.MIN_VALUE;
            return AbstractC5323h.s(null, null, this);
        }
    }

    public static final class e implements InterfaceC5322g {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef f54912a;

        public e(Ref.ObjectRef objectRef) {
            this.f54912a = objectRef;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlinx.coroutines.flow.InterfaceC5322g
        public Object emit(Object obj, Continuation continuation) {
            this.f54912a.element = obj;
            throw new C5325a(this);
        }
    }

    public static final class f extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f54913n;

        /* renamed from: o, reason: collision with root package name */
        public Object f54914o;

        /* renamed from: p, reason: collision with root package name */
        public /* synthetic */ Object f54915p;

        /* renamed from: q, reason: collision with root package name */
        public int f54916q;

        public f(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f54915p = obj;
            this.f54916q |= Integer.MIN_VALUE;
            return AbstractC5323h.t(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r2v1, types: [Sh.G, T] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(InterfaceC5321f interfaceC5321f, Continuation continuation) {
        c cVar;
        int i10;
        Ref.ObjectRef objectRef;
        C5325a e10;
        InterfaceC5322g interfaceC5322g;
        T t10;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i11 = cVar.f54907q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar.f54907q = i11 - Integer.MIN_VALUE;
                Object obj = cVar.f54906p;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = cVar.f54907q;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                    objectRef2.element = kotlinx.coroutines.flow.internal.t.f54780a;
                    InterfaceC5322g aVar = new a(objectRef2);
                    try {
                        cVar.f54904n = objectRef2;
                        cVar.f54905o = aVar;
                        cVar.f54907q = 1;
                        if (interfaceC5321f.collect(aVar, cVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        objectRef = objectRef2;
                    } catch (C5325a e11) {
                        objectRef = objectRef2;
                        e10 = e11;
                        interfaceC5322g = aVar;
                        kotlinx.coroutines.flow.internal.p.a(e10, interfaceC5322g);
                        F0.m(cVar.get$context());
                        t10 = objectRef.element;
                        if (t10 == kotlinx.coroutines.flow.internal.t.f54780a) {
                        }
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC5322g = (a) cVar.f54905o;
                    objectRef = (Ref.ObjectRef) cVar.f54904n;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (C5325a e12) {
                        e10 = e12;
                        kotlinx.coroutines.flow.internal.p.a(e10, interfaceC5322g);
                        F0.m(cVar.get$context());
                        t10 = objectRef.element;
                        if (t10 == kotlinx.coroutines.flow.internal.t.f54780a) {
                        }
                    }
                }
                t10 = objectRef.element;
                if (t10 == kotlinx.coroutines.flow.internal.t.f54780a) {
                    return t10;
                }
                throw new NoSuchElementException("Expected at least one element");
            }
        }
        cVar = new c(continuation);
        Object obj2 = cVar.f54906p;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = cVar.f54907q;
        if (i10 != 0) {
        }
        t10 = objectRef.element;
        if (t10 == kotlinx.coroutines.flow.internal.t.f54780a) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r2v1, types: [Sh.G, T] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(InterfaceC5321f interfaceC5321f, Function2 function2, Continuation continuation) {
        d dVar;
        int i10;
        Ref.ObjectRef objectRef;
        C5325a e10;
        InterfaceC5322g interfaceC5322g;
        T t10;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i11 = dVar.f54911q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dVar.f54911q = i11 - Integer.MIN_VALUE;
                Object obj = dVar.f54910p;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = dVar.f54911q;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                    objectRef2.element = kotlinx.coroutines.flow.internal.t.f54780a;
                    InterfaceC5322g bVar = new b(function2, objectRef2);
                    try {
                        dVar.f54908n = objectRef2;
                        dVar.f54909o = bVar;
                        dVar.f54911q = 1;
                        if (interfaceC5321f.collect(bVar, dVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        objectRef = objectRef2;
                    } catch (C5325a e11) {
                        objectRef = objectRef2;
                        e10 = e11;
                        interfaceC5322g = bVar;
                        kotlinx.coroutines.flow.internal.p.a(e10, interfaceC5322g);
                        F0.m(dVar.get$context());
                        t10 = objectRef.element;
                        if (t10 == kotlinx.coroutines.flow.internal.t.f54780a) {
                        }
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC5322g = (b) dVar.f54909o;
                    objectRef = (Ref.ObjectRef) dVar.f54908n;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (C5325a e12) {
                        e10 = e12;
                        kotlinx.coroutines.flow.internal.p.a(e10, interfaceC5322g);
                        F0.m(dVar.get$context());
                        t10 = objectRef.element;
                        if (t10 == kotlinx.coroutines.flow.internal.t.f54780a) {
                        }
                    }
                }
                t10 = objectRef.element;
                if (t10 == kotlinx.coroutines.flow.internal.t.f54780a) {
                    return t10;
                }
                throw new NoSuchElementException("Expected at least one element matching the predicate");
            }
        }
        dVar = new d(continuation);
        Object obj2 = dVar.f54910p;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = dVar.f54911q;
        if (i10 != 0) {
        }
        t10 = objectRef.element;
        if (t10 == kotlinx.coroutines.flow.internal.t.f54780a) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(InterfaceC5321f interfaceC5321f, Continuation continuation) {
        f fVar;
        int i10;
        Ref.ObjectRef objectRef;
        C5325a e10;
        InterfaceC5322g interfaceC5322g;
        if (continuation instanceof f) {
            fVar = (f) continuation;
            int i11 = fVar.f54916q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                fVar.f54916q = i11 - Integer.MIN_VALUE;
                Object obj = fVar.f54915p;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = fVar.f54916q;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                    InterfaceC5322g eVar = new e(objectRef2);
                    try {
                        fVar.f54913n = objectRef2;
                        fVar.f54914o = eVar;
                        fVar.f54916q = 1;
                        if (interfaceC5321f.collect(eVar, fVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        objectRef = objectRef2;
                    } catch (C5325a e11) {
                        objectRef = objectRef2;
                        e10 = e11;
                        interfaceC5322g = eVar;
                        kotlinx.coroutines.flow.internal.p.a(e10, interfaceC5322g);
                        F0.m(fVar.get$context());
                        return objectRef.element;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC5322g = (e) fVar.f54914o;
                    objectRef = (Ref.ObjectRef) fVar.f54913n;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (C5325a e12) {
                        e10 = e12;
                        kotlinx.coroutines.flow.internal.p.a(e10, interfaceC5322g);
                        F0.m(fVar.get$context());
                        return objectRef.element;
                    }
                }
                return objectRef.element;
            }
        }
        fVar = new f(continuation);
        Object obj2 = fVar.f54915p;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = fVar.f54916q;
        if (i10 != 0) {
        }
        return objectRef.element;
    }
}
