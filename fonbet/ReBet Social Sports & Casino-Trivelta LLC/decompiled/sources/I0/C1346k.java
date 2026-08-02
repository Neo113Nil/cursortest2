package I0;

import I0.J;
import I0.w;
import Ph.AbstractC1455i;
import Ph.AbstractC1459k;
import Ph.AbstractC1488z;
import Ph.C0;
import Ph.InterfaceC1484x;
import Ph.P;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.ExceptionsKt;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.AbstractC5323h;
import kotlinx.coroutines.flow.InterfaceC5321f;
import kotlinx.coroutines.flow.InterfaceC5322g;

/* renamed from: I0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1346k implements InterfaceC1344i {

    /* renamed from: m, reason: collision with root package name */
    public static final a f5105m = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final E f5106a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1340e f5107b;

    /* renamed from: c, reason: collision with root package name */
    public final P f5108c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC5321f f5109d;

    /* renamed from: e, reason: collision with root package name */
    public final Wh.a f5110e;

    /* renamed from: f, reason: collision with root package name */
    public int f5111f;

    /* renamed from: g, reason: collision with root package name */
    public C0 f5112g;

    /* renamed from: h, reason: collision with root package name */
    public final I0.l f5113h;

    /* renamed from: i, reason: collision with root package name */
    public final b f5114i;

    /* renamed from: j, reason: collision with root package name */
    public final Lazy f5115j;

    /* renamed from: k, reason: collision with root package name */
    public final Lazy f5116k;

    /* renamed from: l, reason: collision with root package name */
    public final B f5117l;

    /* renamed from: I0.k$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    /* renamed from: I0.k$b */
    public final class b extends z {

        /* renamed from: c, reason: collision with root package name */
        public List f5118c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ C1346k f5119d;

        /* renamed from: I0.k$b$a */
        public static final class a extends ContinuationImpl {

            /* renamed from: n, reason: collision with root package name */
            public Object f5120n;

            /* renamed from: o, reason: collision with root package name */
            public /* synthetic */ Object f5121o;

            /* renamed from: q, reason: collision with root package name */
            public int f5123q;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f5121o = obj;
                this.f5123q |= Integer.MIN_VALUE;
                return b.this.b(this);
            }
        }

        /* renamed from: I0.k$b$b, reason: collision with other inner class name */
        public static final class C0109b extends SuspendLambda implements Function1 {

            /* renamed from: n, reason: collision with root package name */
            public Object f5124n;

            /* renamed from: o, reason: collision with root package name */
            public Object f5125o;

            /* renamed from: p, reason: collision with root package name */
            public Object f5126p;

            /* renamed from: q, reason: collision with root package name */
            public Object f5127q;

            /* renamed from: r, reason: collision with root package name */
            public Object f5128r;

            /* renamed from: s, reason: collision with root package name */
            public int f5129s;

            /* renamed from: t, reason: collision with root package name */
            public int f5130t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ C1346k f5131u;

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ b f5132v;

            /* renamed from: I0.k$b$b$a */
            public static final class a implements I0.s {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ Wh.a f5133a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ Ref.BooleanRef f5134b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ Ref.ObjectRef f5135c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ C1346k f5136d;

                /* renamed from: I0.k$b$b$a$a, reason: collision with other inner class name */
                public static final class C0110a extends ContinuationImpl {

                    /* renamed from: n, reason: collision with root package name */
                    public Object f5137n;

                    /* renamed from: o, reason: collision with root package name */
                    public Object f5138o;

                    /* renamed from: p, reason: collision with root package name */
                    public Object f5139p;

                    /* renamed from: q, reason: collision with root package name */
                    public Object f5140q;

                    /* renamed from: r, reason: collision with root package name */
                    public Object f5141r;

                    /* renamed from: s, reason: collision with root package name */
                    public /* synthetic */ Object f5142s;

                    /* renamed from: u, reason: collision with root package name */
                    public int f5144u;

                    public C0110a(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f5142s = obj;
                        this.f5144u |= Integer.MIN_VALUE;
                        return a.this.a(null, this);
                    }
                }

                public a(Wh.a aVar, Ref.BooleanRef booleanRef, Ref.ObjectRef objectRef, C1346k c1346k) {
                    this.f5133a = aVar;
                    this.f5134b = booleanRef;
                    this.f5135c = objectRef;
                    this.f5136d = c1346k;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:30:0x00ba A[Catch: all -> 0x0056, TRY_LEAVE, TryCatch #0 {all -> 0x0056, blocks: (B:27:0x0052, B:28:0x00b2, B:30:0x00ba), top: B:26:0x0052 }] */
                /* JADX WARN: Removed duplicated region for block: B:35:0x00d1  */
                /* JADX WARN: Removed duplicated region for block: B:42:0x009a A[Catch: all -> 0x00d8, TRY_LEAVE, TryCatch #1 {all -> 0x00d8, blocks: (B:40:0x0096, B:42:0x009a, B:45:0x00db, B:46:0x00e2), top: B:39:0x0096 }] */
                /* JADX WARN: Removed duplicated region for block: B:45:0x00db A[Catch: all -> 0x00d8, TRY_ENTER, TryCatch #1 {all -> 0x00d8, blocks: (B:40:0x0096, B:42:0x009a, B:45:0x00db, B:46:0x00e2), top: B:39:0x0096 }] */
                /* JADX WARN: Removed duplicated region for block: B:49:0x0076  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
                @Override // I0.s
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public Object a(Function2 function2, Continuation continuation) {
                    C0110a c0110a;
                    int i10;
                    Wh.a aVar;
                    C1346k c1346k;
                    Ref.BooleanRef booleanRef;
                    Ref.ObjectRef objectRef;
                    Wh.a aVar2;
                    Wh.a aVar3;
                    C1346k c1346k2;
                    T t10;
                    Ref.ObjectRef objectRef2;
                    try {
                        if (continuation instanceof C0110a) {
                            c0110a = (C0110a) continuation;
                            int i11 = c0110a.f5144u;
                            if ((i11 & Integer.MIN_VALUE) != 0) {
                                c0110a.f5144u = i11 - Integer.MIN_VALUE;
                                Object obj = c0110a.f5142s;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                i10 = c0110a.f5144u;
                                if (i10 != 0) {
                                    ResultKt.throwOnFailure(obj);
                                    aVar = this.f5133a;
                                    Ref.BooleanRef booleanRef2 = this.f5134b;
                                    Ref.ObjectRef objectRef3 = this.f5135c;
                                    c1346k = this.f5136d;
                                    c0110a.f5137n = function2;
                                    c0110a.f5138o = aVar;
                                    c0110a.f5139p = booleanRef2;
                                    c0110a.f5140q = objectRef3;
                                    c0110a.f5141r = c1346k;
                                    c0110a.f5144u = 1;
                                    if (aVar.f(null, c0110a) != coroutine_suspended) {
                                        booleanRef = booleanRef2;
                                        objectRef = objectRef3;
                                    }
                                    return coroutine_suspended;
                                }
                                if (i10 != 1) {
                                    if (i10 != 2) {
                                        if (i10 != 3) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        Object obj2 = c0110a.f5139p;
                                        objectRef2 = (Ref.ObjectRef) c0110a.f5138o;
                                        aVar2 = (Wh.a) c0110a.f5137n;
                                        try {
                                            ResultKt.throwOnFailure(obj);
                                            t10 = obj2;
                                            objectRef2.element = t10;
                                            objectRef = objectRef2;
                                            T t11 = objectRef.element;
                                            aVar2.g(null);
                                            return t11;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            aVar2.g(null);
                                            throw th;
                                        }
                                    }
                                    c1346k2 = (C1346k) c0110a.f5139p;
                                    objectRef = (Ref.ObjectRef) c0110a.f5138o;
                                    aVar3 = (Wh.a) c0110a.f5137n;
                                    try {
                                        ResultKt.throwOnFailure(obj);
                                        if (!Intrinsics.areEqual(obj, objectRef.element)) {
                                            aVar2 = aVar3;
                                            T t112 = objectRef.element;
                                            aVar2.g(null);
                                            return t112;
                                        }
                                        c0110a.f5137n = aVar3;
                                        c0110a.f5138o = objectRef;
                                        c0110a.f5139p = obj;
                                        c0110a.f5144u = 3;
                                        if (c1346k2.B(obj, false, c0110a) != coroutine_suspended) {
                                            t10 = obj;
                                            objectRef2 = objectRef;
                                            aVar2 = aVar3;
                                            objectRef2.element = t10;
                                            objectRef = objectRef2;
                                            T t1122 = objectRef.element;
                                            aVar2.g(null);
                                            return t1122;
                                        }
                                        return coroutine_suspended;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        aVar2 = aVar3;
                                        aVar2.g(null);
                                        throw th;
                                    }
                                }
                                C1346k c1346k3 = (C1346k) c0110a.f5141r;
                                objectRef = (Ref.ObjectRef) c0110a.f5140q;
                                booleanRef = (Ref.BooleanRef) c0110a.f5139p;
                                Wh.a aVar4 = (Wh.a) c0110a.f5138o;
                                Function2 function22 = (Function2) c0110a.f5137n;
                                ResultKt.throwOnFailure(obj);
                                c1346k = c1346k3;
                                function2 = function22;
                                aVar = aVar4;
                                if (!booleanRef.element) {
                                    throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
                                }
                                T t12 = objectRef.element;
                                c0110a.f5137n = aVar;
                                c0110a.f5138o = objectRef;
                                c0110a.f5139p = c1346k;
                                c0110a.f5140q = null;
                                c0110a.f5141r = null;
                                c0110a.f5144u = 2;
                                Object invoke = function2.invoke(t12, c0110a);
                                if (invoke != coroutine_suspended) {
                                    aVar3 = aVar;
                                    obj = invoke;
                                    c1346k2 = c1346k;
                                    if (!Intrinsics.areEqual(obj, objectRef.element)) {
                                    }
                                }
                                return coroutine_suspended;
                            }
                        }
                        if (!booleanRef.element) {
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        aVar2 = aVar;
                        aVar2.g(null);
                        throw th;
                    }
                    c0110a = new C0110a(continuation);
                    Object obj3 = c0110a.f5142s;
                    Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i10 = c0110a.f5144u;
                    if (i10 != 0) {
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0109b(C1346k c1346k, b bVar, Continuation continuation) {
                super(1, continuation);
                this.f5131u = c1346k;
                this.f5132v = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Continuation continuation) {
                return new C0109b(this.f5131u, this.f5132v, continuation);
            }

            /* JADX WARN: Removed duplicated region for block: B:18:0x00f4  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x010f  */
            /* JADX WARN: Removed duplicated region for block: B:31:0x00b1  */
            /* JADX WARN: Removed duplicated region for block: B:39:0x00e8  */
            /* JADX WARN: Type inference failed for: r13v5, types: [T, java.lang.Object] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Wh.a b10;
                Ref.BooleanRef booleanRef;
                Ref.ObjectRef objectRef;
                Ref.ObjectRef objectRef2;
                Ref.BooleanRef booleanRef2;
                Wh.a aVar;
                Iterator it;
                Wh.a aVar2;
                Ref.BooleanRef booleanRef3;
                Ref.ObjectRef objectRef3;
                a aVar3;
                Ref.ObjectRef objectRef4;
                Object obj2;
                int i10;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f5130t;
                if (i11 == 0) {
                    ResultKt.throwOnFailure(obj);
                    b10 = Wh.g.b(false, 1, null);
                    booleanRef = new Ref.BooleanRef();
                    objectRef = new Ref.ObjectRef();
                    C1346k c1346k = this.f5131u;
                    this.f5124n = b10;
                    this.f5125o = booleanRef;
                    this.f5126p = objectRef;
                    this.f5127q = objectRef;
                    this.f5130t = 1;
                    obj = c1346k.y(true, this);
                    if (obj != coroutine_suspended) {
                        objectRef2 = objectRef;
                    }
                    return coroutine_suspended;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            i10 = this.f5129s;
                            obj2 = this.f5124n;
                            ResultKt.throwOnFailure(obj);
                            return new C1341f(obj2, i10, ((Number) obj).intValue());
                        }
                        aVar = (Wh.a) this.f5126p;
                        objectRef4 = (Ref.ObjectRef) this.f5125o;
                        booleanRef2 = (Ref.BooleanRef) this.f5124n;
                        ResultKt.throwOnFailure(obj);
                        try {
                            booleanRef2.element = true;
                            Unit unit = Unit.INSTANCE;
                            aVar.g(null);
                            obj2 = objectRef4.element;
                            int hashCode = obj2 != null ? obj2.hashCode() : 0;
                            I0.t r10 = this.f5131u.r();
                            this.f5124n = obj2;
                            this.f5125o = null;
                            this.f5126p = null;
                            this.f5129s = hashCode;
                            this.f5130t = 4;
                            obj = r10.a(this);
                            if (obj != coroutine_suspended) {
                                i10 = hashCode;
                                return new C1341f(obj2, i10, ((Number) obj).intValue());
                            }
                            return coroutine_suspended;
                        } catch (Throwable th2) {
                            aVar.g(null);
                            throw th2;
                        }
                    }
                    it = (Iterator) this.f5128r;
                    aVar3 = (a) this.f5127q;
                    objectRef3 = (Ref.ObjectRef) this.f5126p;
                    booleanRef3 = (Ref.BooleanRef) this.f5125o;
                    aVar2 = (Wh.a) this.f5124n;
                    ResultKt.throwOnFailure(obj);
                    while (it.hasNext()) {
                        Function2 function2 = (Function2) it.next();
                        this.f5124n = aVar2;
                        this.f5125o = booleanRef3;
                        this.f5126p = objectRef3;
                        this.f5127q = aVar3;
                        this.f5128r = it;
                        this.f5130t = 2;
                        if (function2.invoke(aVar3, this) == coroutine_suspended) {
                            break;
                        }
                    }
                    objectRef2 = objectRef3;
                    booleanRef2 = booleanRef3;
                    aVar = aVar2;
                    this.f5132v.f5118c = null;
                    this.f5124n = booleanRef2;
                    this.f5125o = objectRef2;
                    this.f5126p = aVar;
                    this.f5127q = null;
                    this.f5128r = null;
                    this.f5130t = 3;
                    if (aVar.f(null, this) != coroutine_suspended) {
                        objectRef4 = objectRef2;
                        booleanRef2.element = true;
                        Unit unit2 = Unit.INSTANCE;
                        aVar.g(null);
                        obj2 = objectRef4.element;
                        if (obj2 != null) {
                        }
                        I0.t r102 = this.f5131u.r();
                        this.f5124n = obj2;
                        this.f5125o = null;
                        this.f5126p = null;
                        this.f5129s = hashCode;
                        this.f5130t = 4;
                        obj = r102.a(this);
                        if (obj != coroutine_suspended) {
                        }
                    }
                    return coroutine_suspended;
                }
                objectRef = (Ref.ObjectRef) this.f5127q;
                objectRef2 = (Ref.ObjectRef) this.f5126p;
                booleanRef = (Ref.BooleanRef) this.f5125o;
                b10 = (Wh.a) this.f5124n;
                ResultKt.throwOnFailure(obj);
                objectRef.element = ((C1341f) obj).c();
                a aVar4 = new a(b10, booleanRef, objectRef2, this.f5131u);
                List list = this.f5132v.f5118c;
                if (list == null) {
                    booleanRef2 = booleanRef;
                    aVar = b10;
                    this.f5132v.f5118c = null;
                    this.f5124n = booleanRef2;
                    this.f5125o = objectRef2;
                    this.f5126p = aVar;
                    this.f5127q = null;
                    this.f5128r = null;
                    this.f5130t = 3;
                    if (aVar.f(null, this) != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                it = list.iterator();
                aVar2 = b10;
                booleanRef3 = booleanRef;
                objectRef3 = objectRef2;
                aVar3 = aVar4;
                while (it.hasNext()) {
                }
                objectRef2 = objectRef3;
                booleanRef2 = booleanRef3;
                aVar = aVar2;
                this.f5132v.f5118c = null;
                this.f5124n = booleanRef2;
                this.f5125o = objectRef2;
                this.f5126p = aVar;
                this.f5127q = null;
                this.f5128r = null;
                this.f5130t = 3;
                if (aVar.f(null, this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Continuation continuation) {
                return ((C0109b) create(continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public b(C1346k c1346k, List initTasksList) {
            Intrinsics.checkNotNullParameter(initTasksList, "initTasksList");
            this.f5119d = c1346k;
            this.f5118c = CollectionsKt.toList(initTasksList);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        @Override // I0.z
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object b(Continuation continuation) {
            a aVar;
            int i10;
            b bVar;
            C1341f c1341f;
            if (continuation instanceof a) {
                aVar = (a) continuation;
                int i11 = aVar.f5123q;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    aVar.f5123q = i11 - Integer.MIN_VALUE;
                    Object obj = aVar.f5121o;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i10 = aVar.f5123q;
                    if (i10 != 0) {
                        ResultKt.throwOnFailure(obj);
                        List list = this.f5118c;
                        if (list != null) {
                            Intrinsics.checkNotNull(list);
                            if (!list.isEmpty()) {
                                I0.t r10 = this.f5119d.r();
                                C0109b c0109b = new C0109b(this.f5119d, this, null);
                                aVar.f5120n = this;
                                aVar.f5123q = 2;
                                obj = r10.b(c0109b, aVar);
                                if (obj != coroutine_suspended) {
                                    bVar = this;
                                    c1341f = (C1341f) obj;
                                }
                                return coroutine_suspended;
                            }
                        }
                        C1346k c1346k = this.f5119d;
                        aVar.f5120n = this;
                        aVar.f5123q = 1;
                        obj = c1346k.y(false, aVar);
                        if (obj != coroutine_suspended) {
                            bVar = this;
                            c1341f = (C1341f) obj;
                        }
                        return coroutine_suspended;
                    }
                    if (i10 == 1) {
                        bVar = (b) aVar.f5120n;
                        ResultKt.throwOnFailure(obj);
                        c1341f = (C1341f) obj;
                    } else {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar = (b) aVar.f5120n;
                        ResultKt.throwOnFailure(obj);
                        c1341f = (C1341f) obj;
                    }
                    bVar.f5119d.f5113h.c(c1341f);
                    return Unit.INSTANCE;
                }
            }
            aVar = new a(continuation);
            Object obj2 = aVar.f5121o;
            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i10 = aVar.f5123q;
            if (i10 != 0) {
            }
            bVar.f5119d.f5113h.c(c1341f);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: I0.k$c */
    public static final class c extends Lambda implements Function0 {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final I0.t invoke() {
            return C1346k.this.s().e();
        }
    }

    /* renamed from: I0.k$d */
    public static final class d extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public Object f5146n;

        /* renamed from: o, reason: collision with root package name */
        public int f5147o;

        /* renamed from: p, reason: collision with root package name */
        public /* synthetic */ Object f5148p;

        /* renamed from: I0.k$d$a */
        public static final class a extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public int f5150n;

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ C1346k f5151o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C1346k c1346k, Continuation continuation) {
                super(2, continuation);
                this.f5151o = c1346k;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.f5151o, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC5322g interfaceC5322g, Continuation continuation) {
                return ((a) create(interfaceC5322g, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.f5150n;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    C1346k c1346k = this.f5151o;
                    this.f5150n = 1;
                    if (c1346k.u(this) == coroutine_suspended) {
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

        /* renamed from: I0.k$d$b */
        public static final class b extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public int f5152n;

            /* renamed from: o, reason: collision with root package name */
            public /* synthetic */ Object f5153o;

            public b(Continuation continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                b bVar = new b(continuation);
                bVar.f5153o = obj;
                return bVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public final Object invoke(D d10, Continuation continuation) {
                return ((b) create(d10, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f5152n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Boxing.boxBoolean(!(((D) this.f5153o) instanceof I0.r));
            }
        }

        /* renamed from: I0.k$d$c */
        public static final class c extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public int f5154n;

            /* renamed from: o, reason: collision with root package name */
            public /* synthetic */ Object f5155o;

            /* renamed from: p, reason: collision with root package name */
            public final /* synthetic */ D f5156p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(D d10, Continuation continuation) {
                super(2, continuation);
                this.f5156p = d10;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                c cVar = new c(this.f5156p, continuation);
                cVar.f5155o = obj;
                return cVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public final Object invoke(D d10, Continuation continuation) {
                return ((c) create(d10, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f5154n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                D d10 = (D) this.f5155o;
                return Boxing.boxBoolean((d10 instanceof C1341f) && d10.a() <= this.f5156p.a());
            }
        }

        /* renamed from: I0.k$d$d, reason: collision with other inner class name */
        public static final class C0111d extends SuspendLambda implements Function3 {

            /* renamed from: n, reason: collision with root package name */
            public int f5157n;

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ C1346k f5158o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0111d(C1346k c1346k, Continuation continuation) {
                super(3, continuation);
                this.f5158o = c1346k;
            }

            @Override // kotlin.jvm.functions.Function3
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC5322g interfaceC5322g, Throwable th2, Continuation continuation) {
                return new C0111d(this.f5158o, continuation).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.f5157n;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    C1346k c1346k = this.f5158o;
                    this.f5157n = 1;
                    if (c1346k.p(this) == coroutine_suspended) {
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

        /* renamed from: I0.k$d$e */
        public static final class e implements InterfaceC5321f {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC5321f f5159a;

            /* renamed from: I0.k$d$e$a */
            public static final class a implements InterfaceC5322g {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ InterfaceC5322g f5160a;

                /* renamed from: I0.k$d$e$a$a, reason: collision with other inner class name */
                public static final class C0112a extends ContinuationImpl {

                    /* renamed from: n, reason: collision with root package name */
                    public /* synthetic */ Object f5161n;

                    /* renamed from: o, reason: collision with root package name */
                    public int f5162o;

                    public C0112a(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f5161n = obj;
                        this.f5162o |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(InterfaceC5322g interfaceC5322g) {
                    this.f5160a = interfaceC5322g;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.InterfaceC5322g
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    C0112a c0112a;
                    int i10;
                    if (continuation instanceof C0112a) {
                        c0112a = (C0112a) continuation;
                        int i11 = c0112a.f5162o;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            c0112a.f5162o = i11 - Integer.MIN_VALUE;
                            Object obj2 = c0112a.f5161n;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i10 = c0112a.f5162o;
                            if (i10 != 0) {
                                ResultKt.throwOnFailure(obj2);
                                InterfaceC5322g interfaceC5322g = this.f5160a;
                                D d10 = (D) obj;
                                if (d10 instanceof I0.x) {
                                    throw ((I0.x) d10).b();
                                }
                                if (!(d10 instanceof C1341f)) {
                                    if (d10 instanceof I0.r ? true : d10 instanceof H) {
                                        throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                                    }
                                    throw new NoWhenBranchMatchedException();
                                }
                                Object c10 = ((C1341f) d10).c();
                                c0112a.f5162o = 1;
                                if (interfaceC5322g.emit(c10, c0112a) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i10 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    c0112a = new C0112a(continuation);
                    Object obj22 = c0112a.f5161n;
                    Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i10 = c0112a.f5162o;
                    if (i10 != 0) {
                    }
                    return Unit.INSTANCE;
                }
            }

            public e(InterfaceC5321f interfaceC5321f) {
                this.f5159a = interfaceC5321f;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC5321f
            public Object collect(InterfaceC5322g interfaceC5322g, Continuation continuation) {
                Object collect = this.f5159a.collect(new a(interfaceC5322g), continuation);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }
        }

        public d(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            d dVar = C1346k.this.new d(continuation);
            dVar.f5148p = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC5322g interfaceC5322g, Continuation continuation) {
            return ((d) create(interfaceC5322g, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x00bb, code lost:
        
            if (kotlinx.coroutines.flow.AbstractC5323h.p(r1, r9, r8) == r0) goto L33;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            InterfaceC5322g interfaceC5322g;
            D d10;
            InterfaceC5322g interfaceC5322g2;
            D d11;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f5147o;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                InterfaceC5322g interfaceC5322g3 = (InterfaceC5322g) this.f5148p;
                C1346k c1346k = C1346k.this;
                this.f5148p = interfaceC5322g3;
                this.f5147o = 1;
                Object z10 = c1346k.z(false, this);
                if (z10 != coroutine_suspended) {
                    interfaceC5322g = interfaceC5322g3;
                    obj = z10;
                }
                return coroutine_suspended;
            }
            if (i10 == 1) {
                interfaceC5322g = (InterfaceC5322g) this.f5148p;
                ResultKt.throwOnFailure(obj);
            } else {
                if (i10 != 2) {
                    if (i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                d11 = (D) this.f5146n;
                interfaceC5322g2 = (InterfaceC5322g) this.f5148p;
                ResultKt.throwOnFailure(obj);
                d10 = d11;
                interfaceC5322g = interfaceC5322g2;
                InterfaceC5321f E10 = AbstractC5323h.E(new e(AbstractC5323h.n(AbstractC5323h.N(AbstractC5323h.G(C1346k.this.f5113h.b(), new a(C1346k.this, null)), new b(null)), new c(d10, null))), new C0111d(C1346k.this, null));
                this.f5148p = null;
                this.f5146n = null;
                this.f5147o = 3;
            }
            d10 = (D) obj;
            if (d10 instanceof C1341f) {
                Object c10 = ((C1341f) d10).c();
                this.f5148p = interfaceC5322g;
                this.f5146n = d10;
                this.f5147o = 2;
                if (interfaceC5322g.emit(c10, this) != coroutine_suspended) {
                    interfaceC5322g2 = interfaceC5322g;
                    d11 = d10;
                    d10 = d11;
                    interfaceC5322g = interfaceC5322g2;
                    InterfaceC5321f E102 = AbstractC5323h.E(new e(AbstractC5323h.n(AbstractC5323h.N(AbstractC5323h.G(C1346k.this.f5113h.b(), new a(C1346k.this, null)), new b(null)), new c(d10, null))), new C0111d(C1346k.this, null));
                    this.f5148p = null;
                    this.f5146n = null;
                    this.f5147o = 3;
                }
                return coroutine_suspended;
            }
            if (d10 instanceof H) {
                throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
            }
            if (d10 instanceof I0.x) {
                throw ((I0.x) d10).b();
            }
            if (d10 instanceof I0.r) {
                return Unit.INSTANCE;
            }
            InterfaceC5321f E1022 = AbstractC5323h.E(new e(AbstractC5323h.n(AbstractC5323h.N(AbstractC5323h.G(C1346k.this.f5113h.b(), new a(C1346k.this, null)), new b(null)), new c(d10, null))), new C0111d(C1346k.this, null));
            this.f5148p = null;
            this.f5146n = null;
            this.f5147o = 3;
        }
    }

    /* renamed from: I0.k$e */
    public static final class e extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f5164n;

        /* renamed from: o, reason: collision with root package name */
        public Object f5165o;

        /* renamed from: p, reason: collision with root package name */
        public /* synthetic */ Object f5166p;

        /* renamed from: r, reason: collision with root package name */
        public int f5168r;

        public e(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f5166p = obj;
            this.f5168r |= Integer.MIN_VALUE;
            return C1346k.this.p(this);
        }
    }

    /* renamed from: I0.k$f */
    public static final class f extends SuspendLambda implements Function1 {

        /* renamed from: n, reason: collision with root package name */
        public int f5169n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Function1 f5170o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Function1 function1, Continuation continuation) {
            super(1, continuation);
            this.f5170o = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new f(this.f5170o, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f5169n;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            Function1 function1 = this.f5170o;
            this.f5169n = 1;
            Object invoke = function1.invoke(this);
            return invoke == coroutine_suspended ? coroutine_suspended : invoke;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation continuation) {
            return ((f) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* renamed from: I0.k$g */
    public static final class g extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f5171n;

        /* renamed from: o, reason: collision with root package name */
        public Object f5172o;

        /* renamed from: p, reason: collision with root package name */
        public Object f5173p;

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f5174q;

        /* renamed from: s, reason: collision with root package name */
        public int f5176s;

        public g(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f5174q = obj;
            this.f5176s |= Integer.MIN_VALUE;
            return C1346k.this.t(null, this);
        }
    }

    /* renamed from: I0.k$h */
    public static final class h extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f5177n;

        /* renamed from: o, reason: collision with root package name */
        public Object f5178o;

        /* renamed from: p, reason: collision with root package name */
        public /* synthetic */ Object f5179p;

        /* renamed from: r, reason: collision with root package name */
        public int f5181r;

        public h(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f5179p = obj;
            this.f5181r |= Integer.MIN_VALUE;
            return C1346k.this.u(this);
        }
    }

    /* renamed from: I0.k$i */
    public static final class i extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f5182n;

        /* renamed from: I0.k$i$a */
        public static final class a implements InterfaceC5322g {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ C1346k f5184a;

            public a(C1346k c1346k) {
                this.f5184a = c1346k;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC5322g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(Unit unit, Continuation continuation) {
                if (this.f5184a.f5113h.a() instanceof I0.r) {
                    return Unit.INSTANCE;
                }
                Object w10 = this.f5184a.w(true, continuation);
                return w10 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? w10 : Unit.INSTANCE;
            }
        }

        public i(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C1346k.this.new i(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((i) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
        
            if (r5.collect(r1, r4) == r0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:
        
            if (r5.a(r4) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f5182n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                b bVar = C1346k.this.f5114i;
                this.f5182n = 1;
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            }
            InterfaceC5321f i11 = AbstractC5323h.i(C1346k.this.r().c());
            a aVar = new a(C1346k.this);
            this.f5182n = 2;
        }
    }

    /* renamed from: I0.k$j */
    public static final class j extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f5185n;

        /* renamed from: o, reason: collision with root package name */
        public int f5186o;

        /* renamed from: p, reason: collision with root package name */
        public /* synthetic */ Object f5187p;

        /* renamed from: r, reason: collision with root package name */
        public int f5189r;

        public j(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f5187p = obj;
            this.f5189r |= Integer.MIN_VALUE;
            return C1346k.this.v(this);
        }
    }

    /* renamed from: I0.k$k, reason: collision with other inner class name */
    public static final class C0113k extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f5190n;

        /* renamed from: o, reason: collision with root package name */
        public Object f5191o;

        /* renamed from: p, reason: collision with root package name */
        public boolean f5192p;

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f5193q;

        /* renamed from: s, reason: collision with root package name */
        public int f5195s;

        public C0113k(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f5193q = obj;
            this.f5195s |= Integer.MIN_VALUE;
            return C1346k.this.w(false, this);
        }
    }

    /* renamed from: I0.k$l */
    public static final class l extends SuspendLambda implements Function1 {

        /* renamed from: n, reason: collision with root package name */
        public Object f5196n;

        /* renamed from: o, reason: collision with root package name */
        public int f5197o;

        public l(Continuation continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return C1346k.this.new l(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Throwable th2;
            D d10;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f5197o;
            try {
            } catch (Throwable th3) {
                I0.t r10 = C1346k.this.r();
                this.f5196n = th3;
                this.f5197o = 2;
                Object a10 = r10.a(this);
                if (a10 != coroutine_suspended) {
                    th2 = th3;
                    obj = a10;
                }
            }
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                C1346k c1346k = C1346k.this;
                this.f5197o = 1;
                obj = c1346k.y(true, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    th2 = (Throwable) this.f5196n;
                    ResultKt.throwOnFailure(obj);
                    d10 = new I0.x(th2, ((Number) obj).intValue());
                    return TuplesKt.to(d10, Boxing.boxBoolean(true));
                }
                ResultKt.throwOnFailure(obj);
            }
            d10 = (D) obj;
            return TuplesKt.to(d10, Boxing.boxBoolean(true));
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation continuation) {
            return ((l) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* renamed from: I0.k$m */
    public static final class m extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public Object f5199n;

        /* renamed from: o, reason: collision with root package name */
        public int f5200o;

        /* renamed from: p, reason: collision with root package name */
        public /* synthetic */ boolean f5201p;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ int f5203r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(int i10, Continuation continuation) {
            super(2, continuation);
            this.f5203r = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            m mVar = C1346k.this.new m(this.f5203r, continuation);
            mVar.f5201p = ((Boolean) obj).booleanValue();
            return mVar;
        }

        public final Object i(boolean z10, Continuation continuation) {
            return ((m) create(Boolean.valueOf(z10), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return i(((Boolean) obj).booleanValue(), (Continuation) obj2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v14 */
        /* JADX WARN: Type inference failed for: r1v15 */
        /* JADX WARN: Type inference failed for: r1v9 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Throwable th2;
            int i10;
            boolean z10;
            D d10;
            boolean z11;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            boolean z12 = this.f5200o;
            try {
            } catch (Throwable th3) {
                if (z12 != 0) {
                    I0.t r10 = C1346k.this.r();
                    this.f5199n = th3;
                    this.f5201p = z12;
                    this.f5200o = 2;
                    Object a10 = r10.a(this);
                    if (a10 != coroutine_suspended) {
                        z10 = z12;
                        th2 = th3;
                        obj = a10;
                    }
                } else {
                    boolean z13 = z12;
                    th2 = th3;
                    i10 = this.f5203r;
                    z10 = z13;
                }
            }
            if (z12 == 0) {
                ResultKt.throwOnFailure(obj);
                boolean z14 = this.f5201p;
                C1346k c1346k = C1346k.this;
                this.f5201p = z14;
                this.f5200o = 1;
                obj = c1346k.y(z14, this);
                z12 = z14;
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (z12 != 1) {
                    if (z12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z10 = this.f5201p;
                    th2 = (Throwable) this.f5199n;
                    ResultKt.throwOnFailure(obj);
                    i10 = ((Number) obj).intValue();
                    I0.x xVar = new I0.x(th2, i10);
                    z11 = z10;
                    d10 = xVar;
                    return TuplesKt.to(d10, Boxing.boxBoolean(z11));
                }
                boolean z15 = this.f5201p;
                ResultKt.throwOnFailure(obj);
                z12 = z15;
            }
            d10 = (D) obj;
            z11 = z12;
            return TuplesKt.to(d10, Boxing.boxBoolean(z11));
        }
    }

    /* renamed from: I0.k$n */
    public static final class n extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f5204n;

        /* renamed from: o, reason: collision with root package name */
        public Object f5205o;

        /* renamed from: p, reason: collision with root package name */
        public Object f5206p;

        /* renamed from: q, reason: collision with root package name */
        public Object f5207q;

        /* renamed from: r, reason: collision with root package name */
        public boolean f5208r;

        /* renamed from: s, reason: collision with root package name */
        public int f5209s;

        /* renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f5210t;

        /* renamed from: v, reason: collision with root package name */
        public int f5212v;

        public n(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f5210t = obj;
            this.f5212v |= Integer.MIN_VALUE;
            return C1346k.this.y(false, this);
        }
    }

    /* renamed from: I0.k$o */
    public static final class o extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public Object f5213n;

        /* renamed from: o, reason: collision with root package name */
        public int f5214o;

        /* renamed from: p, reason: collision with root package name */
        public /* synthetic */ boolean f5215p;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ int f5217r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(int i10, Continuation continuation) {
            super(2, continuation);
            this.f5217r = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            o oVar = C1346k.this.new o(this.f5217r, continuation);
            oVar.f5215p = ((Boolean) obj).booleanValue();
            return oVar;
        }

        public final Object i(boolean z10, Continuation continuation) {
            return ((o) create(Boolean.valueOf(z10), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return i(((Boolean) obj).booleanValue(), (Continuation) obj2);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0031, code lost:
        
            if (r6 == r0) goto L16;
         */
        /* JADX WARN: Removed duplicated region for block: B:13:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0059  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            boolean z10;
            Object obj2;
            int i10;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f5214o;
            if (i11 == 0) {
                ResultKt.throwOnFailure(obj);
                z10 = this.f5215p;
                C1346k c1346k = C1346k.this;
                this.f5215p = z10;
                this.f5214o = 1;
                obj = c1346k.x(this);
            } else {
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj2 = this.f5213n;
                    ResultKt.throwOnFailure(obj);
                    i10 = ((Number) obj).intValue();
                    return new C1341f(obj2, obj2 != null ? obj2.hashCode() : 0, i10);
                }
                z10 = this.f5215p;
                ResultKt.throwOnFailure(obj);
            }
            if (!z10) {
                obj2 = obj;
                i10 = this.f5217r;
                return new C1341f(obj2, obj2 != null ? obj2.hashCode() : 0, i10);
            }
            I0.t r10 = C1346k.this.r();
            this.f5213n = obj;
            this.f5214o = 2;
            Object a10 = r10.a(this);
            if (a10 != coroutine_suspended) {
                obj2 = obj;
                obj = a10;
                i10 = ((Number) obj).intValue();
                return new C1341f(obj2, obj2 != null ? obj2.hashCode() : 0, i10);
            }
            return coroutine_suspended;
        }
    }

    /* renamed from: I0.k$p */
    public static final class p extends SuspendLambda implements Function1 {

        /* renamed from: n, reason: collision with root package name */
        public Object f5218n;

        /* renamed from: o, reason: collision with root package name */
        public int f5219o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef f5220p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ C1346k f5221q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ Ref.IntRef f5222r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(Ref.ObjectRef objectRef, C1346k c1346k, Ref.IntRef intRef, Continuation continuation) {
            super(1, continuation);
            this.f5220p = objectRef;
            this.f5221q = c1346k;
            this.f5222r = intRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new p(this.f5220p, this.f5221q, this.f5222r, continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Ref.IntRef intRef;
            Object obj2;
            Ref.ObjectRef objectRef;
            T t10;
            Ref.IntRef intRef2;
            Object obj3;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f5219o;
            try {
            } catch (C1339d unused) {
                Ref.IntRef intRef3 = this.f5222r;
                C1346k c1346k = this.f5221q;
                Object obj4 = this.f5220p.element;
                this.f5218n = intRef3;
                this.f5219o = 3;
                Object B10 = c1346k.B(obj4, true, this);
                if (B10 != coroutine_suspended) {
                    intRef = intRef3;
                    obj2 = B10;
                }
            }
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                objectRef = this.f5220p;
                C1346k c1346k2 = this.f5221q;
                this.f5218n = objectRef;
                this.f5219o = 1;
                Object x10 = c1346k2.x(this);
                t10 = x10;
                if (x10 == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    if (i10 == 2) {
                        intRef2 = (Ref.IntRef) this.f5218n;
                        ResultKt.throwOnFailure(obj);
                        obj3 = obj;
                        intRef2.element = ((Number) obj3).intValue();
                        return Unit.INSTANCE;
                    }
                    if (i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    intRef = (Ref.IntRef) this.f5218n;
                    ResultKt.throwOnFailure(obj);
                    obj2 = obj;
                    intRef.element = ((Number) obj2).intValue();
                    return Unit.INSTANCE;
                }
                objectRef = (Ref.ObjectRef) this.f5218n;
                ResultKt.throwOnFailure(obj);
                t10 = obj;
            }
            objectRef.element = t10;
            intRef2 = this.f5222r;
            I0.t r10 = this.f5221q.r();
            this.f5218n = intRef2;
            this.f5219o = 2;
            Object a10 = r10.a(this);
            obj3 = a10;
            if (a10 == coroutine_suspended) {
                return coroutine_suspended;
            }
            intRef2.element = ((Number) obj3).intValue();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation continuation) {
            return ((p) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* renamed from: I0.k$q */
    public static final class q extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f5223n;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ boolean f5225p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(boolean z10, Continuation continuation) {
            super(2, continuation);
            this.f5225p = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C1346k.this.new q(this.f5225p, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((q) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
        
            if (r5 == r0) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0044, code lost:
        
            if (r5.v(r4) == r0) goto L22;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f5223n;
            try {
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (C1346k.this.f5113h.a() instanceof I0.r) {
                        return C1346k.this.f5113h.a();
                    }
                    C1346k c1346k = C1346k.this;
                    this.f5223n = 1;
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return (D) obj;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                C1346k c1346k2 = C1346k.this;
                boolean z10 = this.f5225p;
                this.f5223n = 2;
                obj = c1346k2.w(z10, this);
            } catch (Throwable th2) {
                return new I0.x(th2, -1);
            }
        }
    }

    /* renamed from: I0.k$r */
    public static final class r extends Lambda implements Function0 {
        public r() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final F invoke() {
            return C1346k.this.f5106a.a();
        }
    }

    /* renamed from: I0.k$s */
    public static final class s extends SuspendLambda implements Function1 {

        /* renamed from: n, reason: collision with root package name */
        public Object f5227n;

        /* renamed from: o, reason: collision with root package name */
        public int f5228o;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ CoroutineContext f5230q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ Function2 f5231r;

        /* renamed from: I0.k$s$a */
        public static final class a extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public int f5232n;

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ Function2 f5233o;

            /* renamed from: p, reason: collision with root package name */
            public final /* synthetic */ C1341f f5234p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Function2 function2, C1341f c1341f, Continuation continuation) {
                super(2, continuation);
                this.f5233o = function2;
                this.f5234p = c1341f;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.f5233o, this.f5234p, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(P p10, Continuation continuation) {
                return ((a) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.f5232n;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                ResultKt.throwOnFailure(obj);
                Function2 function2 = this.f5233o;
                Object c10 = this.f5234p.c();
                this.f5232n = 1;
                Object invoke = function2.invoke(c10, this);
                return invoke == coroutine_suspended ? coroutine_suspended : invoke;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(CoroutineContext coroutineContext, Function2 function2, Continuation continuation) {
            super(1, continuation);
            this.f5230q = coroutineContext;
            this.f5231r = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return C1346k.this.new s(this.f5230q, this.f5231r, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x004e, code lost:
        
            if (r9 == r0) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0036, code lost:
        
            if (r9 == r0) goto L23;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            C1341f c1341f;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f5228o;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                C1346k c1346k = C1346k.this;
                this.f5228o = 1;
                obj = c1346k.y(true, this);
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Object obj2 = this.f5227n;
                        ResultKt.throwOnFailure(obj);
                        return obj2;
                    }
                    c1341f = (C1341f) this.f5227n;
                    ResultKt.throwOnFailure(obj);
                    c1341f.b();
                    if (!Intrinsics.areEqual(c1341f.c(), obj)) {
                        C1346k c1346k2 = C1346k.this;
                        this.f5227n = obj;
                        this.f5228o = 3;
                        if (c1346k2.B(obj, true, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return obj;
                }
                ResultKt.throwOnFailure(obj);
            }
            c1341f = (C1341f) obj;
            CoroutineContext coroutineContext = this.f5230q;
            a aVar = new a(this.f5231r, c1341f, null);
            this.f5227n = c1341f;
            this.f5228o = 2;
            obj = AbstractC1455i.g(coroutineContext, aVar, this);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation continuation) {
            return ((s) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* renamed from: I0.k$t */
    public static final class t extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f5235n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f5236o;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Function2 f5238q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(Function2 function2, Continuation continuation) {
            super(2, continuation);
            this.f5238q = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            t tVar = C1346k.this.new t(this.f5238q, continuation);
            tVar.f5236o = obj;
            return tVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((t) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f5235n;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            P p10 = (P) this.f5236o;
            InterfaceC1484x b10 = AbstractC1488z.b(null, 1, null);
            C1346k.this.f5117l.e(new w.a(this.f5238q, b10, C1346k.this.f5113h.a(), p10.getCoroutineContext()));
            this.f5235n = 1;
            Object await = b10.await(this);
            return await == coroutine_suspended ? coroutine_suspended : await;
        }
    }

    /* renamed from: I0.k$u */
    public static final class u extends Lambda implements Function1 {
        public u() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(Throwable th2) {
            if (th2 != null) {
                C1346k.this.f5113h.c(new I0.r(th2));
            }
            if (C1346k.this.f5115j.isInitialized()) {
                C1346k.this.s().close();
            }
        }
    }

    /* renamed from: I0.k$v */
    public static final class v extends Lambda implements Function2 {

        /* renamed from: d, reason: collision with root package name */
        public static final v f5240d = new v();

        public v() {
            super(2);
        }

        public final void a(w.a msg, Throwable th2) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            InterfaceC1484x a10 = msg.a();
            if (th2 == null) {
                th2 = new CancellationException("DataStore scope was cancelled before updateData could complete");
            }
            a10.k(th2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((w.a) obj, (Throwable) obj2);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: I0.k$w */
    public static final class w extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f5241n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f5242o;

        public w(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            w wVar = C1346k.this.new w(continuation);
            wVar.f5242o = obj;
            return wVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(w.a aVar, Continuation continuation) {
            return ((w) create(aVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f5241n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                w.a aVar = (w.a) this.f5242o;
                C1346k c1346k = C1346k.this;
                this.f5241n = 1;
                if (c1346k.t(aVar, this) == coroutine_suspended) {
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

    /* renamed from: I0.k$x */
    public static final class x extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f5244n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f5245o;

        /* renamed from: q, reason: collision with root package name */
        public int f5247q;

        public x(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f5245o = obj;
            this.f5247q |= Integer.MIN_VALUE;
            return C1346k.this.B(null, false, this);
        }
    }

    /* renamed from: I0.k$y */
    public static final class y extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public Object f5248n;

        /* renamed from: o, reason: collision with root package name */
        public int f5249o;

        /* renamed from: p, reason: collision with root package name */
        public /* synthetic */ Object f5250p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Ref.IntRef f5251q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ C1346k f5252r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Object f5253s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ boolean f5254t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(Ref.IntRef intRef, C1346k c1346k, Object obj, boolean z10, Continuation continuation) {
            super(2, continuation);
            this.f5251q = intRef;
            this.f5252r = c1346k;
            this.f5253s = obj;
            this.f5254t = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            y yVar = new y(this.f5251q, this.f5252r, this.f5253s, this.f5254t, continuation);
            yVar.f5250p = obj;
            return yVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(K k10, Continuation continuation) {
            return ((y) create(k10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x005a, code lost:
        
            if (r3.a(r7, r6) == r0) goto L16;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Ref.IntRef intRef;
            K k10;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f5249o;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                K k11 = (K) this.f5250p;
                intRef = this.f5251q;
                I0.t r10 = this.f5252r.r();
                this.f5250p = k11;
                this.f5248n = intRef;
                this.f5249o = 1;
                Object e10 = r10.e(this);
                if (e10 != coroutine_suspended) {
                    k10 = k11;
                    obj = e10;
                }
                return coroutine_suspended;
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (this.f5254t) {
                    I0.l lVar = this.f5252r.f5113h;
                    Object obj2 = this.f5253s;
                    lVar.c(new C1341f(obj2, obj2 != null ? obj2.hashCode() : 0, this.f5251q.element));
                }
                return Unit.INSTANCE;
            }
            intRef = (Ref.IntRef) this.f5248n;
            k10 = (K) this.f5250p;
            ResultKt.throwOnFailure(obj);
            intRef.element = ((Number) obj).intValue();
            Object obj3 = this.f5253s;
            this.f5250p = null;
            this.f5248n = null;
            this.f5249o = 2;
        }
    }

    public C1346k(E storage, List initTasksList, InterfaceC1340e corruptionHandler, P scope) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(initTasksList, "initTasksList");
        Intrinsics.checkNotNullParameter(corruptionHandler, "corruptionHandler");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f5106a = storage;
        this.f5107b = corruptionHandler;
        this.f5108c = scope;
        this.f5109d = AbstractC5323h.x(new d(null));
        this.f5110e = Wh.g.b(false, 1, null);
        this.f5113h = new I0.l();
        this.f5114i = new b(this, initTasksList);
        this.f5115j = LazyKt.lazy(new r());
        this.f5116k = LazyKt.lazy(new c());
        this.f5117l = new B(scope, new u(), v.f5240d, new w(null));
    }

    public final Object A(Function2 function2, CoroutineContext coroutineContext, Continuation continuation) {
        return r().b(new s(coroutineContext, function2, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object B(Object obj, boolean z10, Continuation continuation) {
        x xVar;
        int i10;
        Ref.IntRef intRef;
        if (continuation instanceof x) {
            xVar = (x) continuation;
            int i11 = xVar.f5247q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                xVar.f5247q = i11 - Integer.MIN_VALUE;
                Object obj2 = xVar.f5245o;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = xVar.f5247q;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj2);
                    Ref.IntRef intRef2 = new Ref.IntRef();
                    F s10 = s();
                    y yVar = new y(intRef2, this, obj, z10, null);
                    xVar.f5244n = intRef2;
                    xVar.f5247q = 1;
                    if (s10.b(yVar, xVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    intRef = intRef2;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    intRef = (Ref.IntRef) xVar.f5244n;
                    ResultKt.throwOnFailure(obj2);
                }
                return Boxing.boxInt(intRef.element);
            }
        }
        xVar = new x(continuation);
        Object obj22 = xVar.f5245o;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = xVar.f5247q;
        if (i10 != 0) {
        }
        return Boxing.boxInt(intRef.element);
    }

    @Override // I0.InterfaceC1344i
    public Object a(Function2 function2, Continuation continuation) {
        J j10 = (J) continuation.get$context().get(J.a.C0106a.f5081a);
        if (j10 != null) {
            j10.a(this);
        }
        return AbstractC1455i.g(new J(j10, this), new t(function2, null), continuation);
    }

    @Override // I0.InterfaceC1344i
    public InterfaceC5321f getData() {
        return this.f5109d;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0056 A[Catch: all -> 0x005e, TryCatch #0 {all -> 0x005e, blocks: (B:11:0x004e, B:13:0x0056, B:15:0x005a, B:16:0x0060, B:17:0x0062), top: B:10:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object p(Continuation continuation) {
        e eVar;
        int i10;
        C1346k c1346k;
        Wh.a aVar;
        int i11;
        try {
            if (continuation instanceof e) {
                eVar = (e) continuation;
                int i12 = eVar.f5168r;
                if ((i12 & Integer.MIN_VALUE) != 0) {
                    eVar.f5168r = i12 - Integer.MIN_VALUE;
                    Object obj = eVar.f5166p;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i10 = eVar.f5168r;
                    if (i10 != 0) {
                        ResultKt.throwOnFailure(obj);
                        Wh.a aVar2 = this.f5110e;
                        eVar.f5164n = this;
                        eVar.f5165o = aVar2;
                        eVar.f5168r = 1;
                        if (aVar2.f(null, eVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        c1346k = this;
                        aVar = aVar2;
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        aVar = (Wh.a) eVar.f5165o;
                        c1346k = (C1346k) eVar.f5164n;
                        ResultKt.throwOnFailure(obj);
                    }
                    i11 = c1346k.f5111f - 1;
                    c1346k.f5111f = i11;
                    if (i11 == 0) {
                        C0 c02 = c1346k.f5112g;
                        if (c02 != null) {
                            C0.a.b(c02, null, 1, null);
                        }
                        c1346k.f5112g = null;
                    }
                    Unit unit = Unit.INSTANCE;
                    aVar.g(null);
                    return Unit.INSTANCE;
                }
            }
            i11 = c1346k.f5111f - 1;
            c1346k.f5111f = i11;
            if (i11 == 0) {
            }
            Unit unit2 = Unit.INSTANCE;
            aVar.g(null);
            return Unit.INSTANCE;
        } catch (Throwable th2) {
            aVar.g(null);
            throw th2;
        }
        eVar = new e(continuation);
        Object obj2 = eVar.f5166p;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = eVar.f5168r;
        if (i10 != 0) {
        }
    }

    public final Object q(boolean z10, Function1 function1, Continuation continuation) {
        return z10 ? function1.invoke(continuation) : r().b(new f(function1, null), continuation);
    }

    public final I0.t r() {
        return (I0.t) this.f5116k.getValue();
    }

    public final F s() {
        return (F) this.f5115j.getValue();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(5:5|6|7|(6:(1:(1:(2:12|13))(3:15|16|17))|26|27|21|22|23)(5:28|29|30|(6:32|(1:34)|20|21|22|23)(3:35|(1:37)(1:53)|(2:39|(2:41|(1:43)(1:44))(2:45|46))(2:47|(2:49|50)(2:51|52)))|25)|18))|58|6|7|(0)(0)|18|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b4, code lost:
    
        if (r9 != r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0034, code lost:
    
        r10 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r9v21, types: [Ph.x] */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v3, types: [Ph.x] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object t(w.a aVar, Continuation continuation) {
        g gVar;
        int i10;
        Object m147constructorimpl;
        ?? r92;
        InterfaceC1484x a10;
        D a11;
        C1346k c1346k;
        Object A10;
        w.a aVar2;
        if (continuation instanceof g) {
            gVar = (g) continuation;
            int i11 = gVar.f5176s;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                gVar.f5176s = i11 - Integer.MIN_VALUE;
                Object obj = gVar.f5174q;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = gVar.f5176s;
                boolean z10 = true;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            InterfaceC1484x interfaceC1484x = (InterfaceC1484x) gVar.f5173p;
                            c1346k = (C1346k) gVar.f5172o;
                            w.a aVar3 = (w.a) gVar.f5171n;
                            ResultKt.throwOnFailure(obj);
                            a10 = interfaceC1484x;
                            aVar2 = aVar3;
                        } else if (i10 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }
                    ?? r93 = (InterfaceC1484x) gVar.f5171n;
                    ResultKt.throwOnFailure(obj);
                    aVar = r93;
                    m147constructorimpl = Result.m147constructorimpl(obj);
                    r92 = aVar;
                    AbstractC1488z.c(r92, m147constructorimpl);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                a10 = aVar.a();
                try {
                    Result.Companion companion = Result.INSTANCE;
                    a11 = this.f5113h.a();
                } catch (Throwable th2) {
                    th = th2;
                    aVar = a10;
                    Result.Companion companion2 = Result.INSTANCE;
                    m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th));
                    r92 = aVar;
                    AbstractC1488z.c(r92, m147constructorimpl);
                    return Unit.INSTANCE;
                }
                if (a11 instanceof C1341f) {
                    Function2 d10 = aVar.d();
                    CoroutineContext b10 = aVar.b();
                    gVar.f5171n = a10;
                    gVar.f5176s = 1;
                    A10 = A(d10, b10, gVar);
                    if (A10 == coroutine_suspended) {
                    }
                    w.a aVar4 = a10;
                    obj = A10;
                    aVar = aVar4;
                    m147constructorimpl = Result.m147constructorimpl(obj);
                    r92 = aVar;
                    AbstractC1488z.c(r92, m147constructorimpl);
                    return Unit.INSTANCE;
                }
                if (!(a11 instanceof I0.x)) {
                    z10 = a11 instanceof H;
                }
                if (!z10) {
                    if (a11 instanceof I0.r) {
                        throw ((I0.r) a11).b();
                    }
                    throw new NoWhenBranchMatchedException();
                }
                if (a11 != aVar.c()) {
                    Intrinsics.checkNotNull(a11, "null cannot be cast to non-null type androidx.datastore.core.ReadException<T of androidx.datastore.core.DataStoreImpl.handleUpdate$lambda$2>");
                    throw ((I0.x) a11).b();
                }
                gVar.f5171n = aVar;
                gVar.f5172o = this;
                gVar.f5173p = a10;
                gVar.f5176s = 2;
                if (v(gVar) != coroutine_suspended) {
                    c1346k = this;
                    aVar2 = aVar;
                }
                return coroutine_suspended;
                Function2 d11 = aVar2.d();
                CoroutineContext b11 = aVar2.b();
                gVar.f5171n = a10;
                gVar.f5172o = null;
                gVar.f5173p = null;
                gVar.f5176s = 3;
                A10 = c1346k.A(d11, b11, gVar);
            }
        }
        gVar = new g(continuation);
        Object obj2 = gVar.f5174q;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = gVar.f5176s;
        boolean z102 = true;
        if (i10 == 0) {
        }
        Function2 d112 = aVar2.d();
        CoroutineContext b112 = aVar2.b();
        gVar.f5171n = a10;
        gVar.f5172o = null;
        gVar.f5173p = null;
        gVar.f5176s = 3;
        A10 = c1346k.A(d112, b112, gVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0055 A[Catch: all -> 0x0067, TryCatch #0 {all -> 0x0067, blocks: (B:11:0x004e, B:13:0x0055, B:14:0x006a), top: B:10:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object u(Continuation continuation) {
        h hVar;
        int i10;
        C1346k c1346k;
        Wh.a aVar;
        int i11;
        C0 d10;
        try {
            if (continuation instanceof h) {
                hVar = (h) continuation;
                int i12 = hVar.f5181r;
                if ((i12 & Integer.MIN_VALUE) != 0) {
                    hVar.f5181r = i12 - Integer.MIN_VALUE;
                    Object obj = hVar.f5179p;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i10 = hVar.f5181r;
                    if (i10 != 0) {
                        ResultKt.throwOnFailure(obj);
                        Wh.a aVar2 = this.f5110e;
                        hVar.f5177n = this;
                        hVar.f5178o = aVar2;
                        hVar.f5181r = 1;
                        if (aVar2.f(null, hVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        c1346k = this;
                        aVar = aVar2;
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        aVar = (Wh.a) hVar.f5178o;
                        c1346k = (C1346k) hVar.f5177n;
                        ResultKt.throwOnFailure(obj);
                    }
                    i11 = c1346k.f5111f + 1;
                    c1346k.f5111f = i11;
                    if (i11 == 1) {
                        d10 = AbstractC1459k.d(c1346k.f5108c, null, null, c1346k.new i(null), 3, null);
                        c1346k.f5112g = d10;
                    }
                    Unit unit = Unit.INSTANCE;
                    aVar.g(null);
                    return Unit.INSTANCE;
                }
            }
            i11 = c1346k.f5111f + 1;
            c1346k.f5111f = i11;
            if (i11 == 1) {
            }
            Unit unit2 = Unit.INSTANCE;
            aVar.g(null);
            return Unit.INSTANCE;
        } catch (Throwable th2) {
            aVar.g(null);
            throw th2;
        }
        hVar = new h(continuation);
        Object obj2 = hVar.f5179p;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = hVar.f5181r;
        if (i10 != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0069, code lost:
    
        if (r4.c(r0) != r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Continuation continuation) {
        j jVar;
        int i10;
        C1346k c1346k;
        int intValue;
        int i11;
        Throwable th2;
        C1346k c1346k2;
        try {
            if (continuation instanceof j) {
                jVar = (j) continuation;
                int i12 = jVar.f5189r;
                if ((i12 & Integer.MIN_VALUE) != 0) {
                    jVar.f5189r = i12 - Integer.MIN_VALUE;
                    Object obj = jVar.f5187p;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i10 = jVar.f5189r;
                    if (i10 != 0) {
                        ResultKt.throwOnFailure(obj);
                        I0.t r10 = r();
                        jVar.f5185n = this;
                        jVar.f5189r = 1;
                        obj = r10.a(jVar);
                        if (obj != coroutine_suspended) {
                            c1346k = this;
                        }
                        return coroutine_suspended;
                    }
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i11 = jVar.f5186o;
                        c1346k2 = (C1346k) jVar.f5185n;
                        try {
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        } catch (Throwable th3) {
                            th2 = th3;
                            c1346k2.f5113h.c(new I0.x(th2, i11));
                            throw th2;
                        }
                    }
                    c1346k = (C1346k) jVar.f5185n;
                    ResultKt.throwOnFailure(obj);
                    intValue = ((Number) obj).intValue();
                    b bVar = c1346k.f5114i;
                    jVar.f5185n = c1346k;
                    jVar.f5186o = intValue;
                    jVar.f5189r = 2;
                }
            }
            b bVar2 = c1346k.f5114i;
            jVar.f5185n = c1346k;
            jVar.f5186o = intValue;
            jVar.f5189r = 2;
        } catch (Throwable th4) {
            i11 = intValue;
            th2 = th4;
            c1346k2 = c1346k;
            c1346k2.f5113h.c(new I0.x(th2, i11));
            throw th2;
        }
        jVar = new j(continuation);
        Object obj2 = jVar.f5187p;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = jVar.f5189r;
        if (i10 != 0) {
        }
        intValue = ((Number) obj2).intValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a7, code lost:
    
        if (r11 == r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c0, code lost:
    
        if (r11 == r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object w(boolean z10, Continuation continuation) {
        C0113k c0113k;
        Object coroutine_suspended;
        int i10;
        D d10;
        Object obj;
        boolean z11;
        C1346k c1346k;
        boolean z12;
        Pair pair;
        if (continuation instanceof C0113k) {
            c0113k = (C0113k) continuation;
            int i11 = c0113k.f5195s;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c0113k.f5195s = i11 - Integer.MIN_VALUE;
                Object obj2 = c0113k.f5193q;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = c0113k.f5195s;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj2);
                    D a10 = this.f5113h.a();
                    if (a10 instanceof H) {
                        throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                    }
                    I0.t r10 = r();
                    c0113k.f5190n = this;
                    c0113k.f5191o = a10;
                    c0113k.f5192p = z10;
                    c0113k.f5195s = 1;
                    Object a11 = r10.a(c0113k);
                    if (a11 != coroutine_suspended) {
                        d10 = a10;
                        obj = a11;
                        z11 = z10;
                        c1346k = this;
                    }
                    return coroutine_suspended;
                }
                if (i10 != 1) {
                    if (i10 == 2) {
                        c1346k = (C1346k) c0113k.f5190n;
                        ResultKt.throwOnFailure(obj2);
                        pair = (Pair) obj2;
                        D d11 = (D) pair.component1();
                        if (((Boolean) pair.component2()).booleanValue()) {
                        }
                        return d11;
                    }
                    if (i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c1346k = (C1346k) c0113k.f5190n;
                    ResultKt.throwOnFailure(obj2);
                    pair = (Pair) obj2;
                    D d112 = (D) pair.component1();
                    if (((Boolean) pair.component2()).booleanValue()) {
                        c1346k.f5113h.c(d112);
                    }
                    return d112;
                }
                boolean z13 = c0113k.f5192p;
                D d12 = (D) c0113k.f5191o;
                C1346k c1346k2 = (C1346k) c0113k.f5190n;
                ResultKt.throwOnFailure(obj2);
                z11 = z13;
                c1346k = c1346k2;
                d10 = d12;
                obj = obj2;
                int intValue = ((Number) obj).intValue();
                z12 = d10 instanceof C1341f;
                int a12 = !z12 ? d10.a() : -1;
                if (!z12 && intValue == a12) {
                    return d10;
                }
                if (z11) {
                    I0.t r11 = c1346k.r();
                    m mVar = c1346k.new m(a12, null);
                    c0113k.f5190n = c1346k;
                    c0113k.f5191o = null;
                    c0113k.f5195s = 3;
                    obj2 = r11.d(mVar, c0113k);
                } else {
                    I0.t r12 = c1346k.r();
                    l lVar = c1346k.new l(null);
                    c0113k.f5190n = c1346k;
                    c0113k.f5191o = null;
                    c0113k.f5195s = 2;
                    obj2 = r12.b(lVar, c0113k);
                }
                return coroutine_suspended;
            }
        }
        c0113k = new C0113k(continuation);
        Object obj22 = c0113k.f5193q;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = c0113k.f5195s;
        if (i10 != 0) {
        }
        int intValue2 = ((Number) obj).intValue();
        z12 = d10 instanceof C1341f;
        if (!z12) {
        }
        if (!z12) {
        }
        if (z11) {
        }
        return coroutine_suspended;
    }

    public final Object x(Continuation continuation) {
        return G.a(s(), continuation);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(4:5|6|7|8))|83|6|7|8|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0066, code lost:
    
        r11 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0067, code lost:
    
        r7 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object y(boolean z10, Continuation continuation) {
        n nVar;
        ?? r22;
        C1346k c1346k;
        Ref.ObjectRef objectRef;
        Object a10;
        C1339d c1339d;
        T t10;
        Ref.ObjectRef objectRef2;
        C1339d c1339d2;
        p pVar;
        Ref.IntRef intRef;
        Ref.ObjectRef objectRef3;
        C1346k c1346k2;
        C1346k c1346k3;
        Object obj;
        int hashCode;
        Object a11;
        boolean z11;
        int i10;
        Object obj2;
        Object obj3;
        Object obj4;
        Object d10;
        Object obj5;
        if (continuation instanceof n) {
            nVar = (n) continuation;
            int i11 = nVar.f5212v;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                nVar.f5212v = i11 - Integer.MIN_VALUE;
                Object obj6 = nVar.f5210t;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                r22 = nVar.f5212v;
                switch (r22) {
                    case 0:
                        ResultKt.throwOnFailure(obj6);
                        try {
                            if (z10) {
                                nVar.f5204n = this;
                                nVar.f5208r = z10;
                                nVar.f5212v = 1;
                                Object x10 = x(nVar);
                                if (x10 != coroutine_suspended) {
                                    c1346k3 = this;
                                    obj = x10;
                                    if (obj == null) {
                                        try {
                                            hashCode = obj.hashCode();
                                        } catch (C1339d e10) {
                                            e = e10;
                                            c1346k = c1346k3;
                                            objectRef = new Ref.ObjectRef();
                                            InterfaceC1340e interfaceC1340e = c1346k.f5107b;
                                            nVar.f5204n = c1346k;
                                            nVar.f5205o = e;
                                            nVar.f5206p = objectRef;
                                            nVar.f5207q = objectRef;
                                            nVar.f5208r = z10;
                                            nVar.f5212v = 5;
                                            a10 = interfaceC1340e.a(e, nVar);
                                            if (a10 != coroutine_suspended) {
                                            }
                                            return coroutine_suspended;
                                        }
                                    } else {
                                        hashCode = 0;
                                    }
                                    I0.t r10 = c1346k3.r();
                                    nVar.f5204n = c1346k3;
                                    nVar.f5205o = obj;
                                    nVar.f5208r = z10;
                                    nVar.f5209s = hashCode;
                                    nVar.f5212v = 2;
                                    a11 = r10.a(nVar);
                                    if (a11 != coroutine_suspended) {
                                        int i12 = hashCode;
                                        z11 = z10;
                                        i10 = i12;
                                        obj2 = obj;
                                        obj3 = a11;
                                        return new C1341f(obj2, i10, ((Number) obj3).intValue());
                                    }
                                }
                            } else {
                                I0.t r11 = r();
                                nVar.f5204n = this;
                                nVar.f5208r = z10;
                                nVar.f5212v = 3;
                                Object a12 = r11.a(nVar);
                                if (a12 != coroutine_suspended) {
                                    c1346k2 = this;
                                    obj4 = a12;
                                    int intValue = ((Number) obj4).intValue();
                                    I0.t r12 = c1346k2.r();
                                    o oVar = c1346k2.new o(intValue, null);
                                    nVar.f5204n = c1346k2;
                                    nVar.f5208r = z10;
                                    nVar.f5212v = 4;
                                    d10 = r12.d(oVar, nVar);
                                    obj5 = d10;
                                    if (d10 == coroutine_suspended) {
                                    }
                                    return (C1341f) obj5;
                                }
                            }
                        } catch (C1339d e11) {
                            e = e11;
                            c1346k = this;
                            objectRef = new Ref.ObjectRef();
                            InterfaceC1340e interfaceC1340e2 = c1346k.f5107b;
                            nVar.f5204n = c1346k;
                            nVar.f5205o = e;
                            nVar.f5206p = objectRef;
                            nVar.f5207q = objectRef;
                            nVar.f5208r = z10;
                            nVar.f5212v = 5;
                            a10 = interfaceC1340e2.a(e, nVar);
                            if (a10 != coroutine_suspended) {
                            }
                            return coroutine_suspended;
                        }
                        return coroutine_suspended;
                    case 1:
                        z10 = nVar.f5208r;
                        C1346k c1346k4 = (C1346k) nVar.f5204n;
                        ResultKt.throwOnFailure(obj6);
                        c1346k3 = c1346k4;
                        obj = obj6;
                        if (obj == null) {
                        }
                        I0.t r102 = c1346k3.r();
                        nVar.f5204n = c1346k3;
                        nVar.f5205o = obj;
                        nVar.f5208r = z10;
                        nVar.f5209s = hashCode;
                        nVar.f5212v = 2;
                        a11 = r102.a(nVar);
                        if (a11 != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    case 2:
                        i10 = nVar.f5209s;
                        z11 = nVar.f5208r;
                        obj2 = nVar.f5205o;
                        c1346k3 = (C1346k) nVar.f5204n;
                        try {
                            ResultKt.throwOnFailure(obj6);
                            obj3 = obj6;
                            return new C1341f(obj2, i10, ((Number) obj3).intValue());
                        } catch (C1339d e12) {
                            e = e12;
                            z10 = z11;
                            c1346k = c1346k3;
                            objectRef = new Ref.ObjectRef();
                            InterfaceC1340e interfaceC1340e22 = c1346k.f5107b;
                            nVar.f5204n = c1346k;
                            nVar.f5205o = e;
                            nVar.f5206p = objectRef;
                            nVar.f5207q = objectRef;
                            nVar.f5208r = z10;
                            nVar.f5212v = 5;
                            a10 = interfaceC1340e22.a(e, nVar);
                            if (a10 != coroutine_suspended) {
                                c1339d = e;
                                t10 = a10;
                                objectRef2 = objectRef;
                                objectRef2.element = t10;
                                Ref.IntRef intRef2 = new Ref.IntRef();
                                try {
                                    pVar = new p(objectRef, c1346k, intRef2, null);
                                    nVar.f5204n = c1339d;
                                    nVar.f5205o = objectRef;
                                    nVar.f5206p = intRef2;
                                    nVar.f5207q = null;
                                    nVar.f5212v = 6;
                                    if (c1346k.q(z10, pVar, nVar) != coroutine_suspended) {
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    c1339d2 = c1339d;
                                    ExceptionsKt.addSuppressed(c1339d2, th);
                                    throw c1339d2;
                                }
                            }
                            return coroutine_suspended;
                        }
                    case 3:
                        z10 = nVar.f5208r;
                        c1346k2 = (C1346k) nVar.f5204n;
                        ResultKt.throwOnFailure(obj6);
                        obj4 = obj6;
                        int intValue2 = ((Number) obj4).intValue();
                        I0.t r122 = c1346k2.r();
                        o oVar2 = c1346k2.new o(intValue2, null);
                        nVar.f5204n = c1346k2;
                        nVar.f5208r = z10;
                        nVar.f5212v = 4;
                        d10 = r122.d(oVar2, nVar);
                        obj5 = d10;
                        if (d10 == coroutine_suspended) {
                        }
                        return (C1341f) obj5;
                    case 4:
                        boolean z12 = nVar.f5208r;
                        ResultKt.throwOnFailure(obj6);
                        obj5 = obj6;
                        return (C1341f) obj5;
                    case 5:
                        z10 = nVar.f5208r;
                        Ref.ObjectRef objectRef4 = (Ref.ObjectRef) nVar.f5207q;
                        Ref.ObjectRef objectRef5 = (Ref.ObjectRef) nVar.f5206p;
                        c1339d = (C1339d) nVar.f5205o;
                        c1346k = (C1346k) nVar.f5204n;
                        ResultKt.throwOnFailure(obj6);
                        objectRef2 = objectRef4;
                        objectRef = objectRef5;
                        t10 = obj6;
                        objectRef2.element = t10;
                        Ref.IntRef intRef22 = new Ref.IntRef();
                        pVar = new p(objectRef, c1346k, intRef22, null);
                        nVar.f5204n = c1339d;
                        nVar.f5205o = objectRef;
                        nVar.f5206p = intRef22;
                        nVar.f5207q = null;
                        nVar.f5212v = 6;
                        if (c1346k.q(z10, pVar, nVar) != coroutine_suspended) {
                            intRef = intRef22;
                            objectRef3 = objectRef;
                            T t11 = objectRef3.element;
                            return new C1341f(t11, t11 != 0 ? t11.hashCode() : 0, intRef.element);
                        }
                        return coroutine_suspended;
                    case 6:
                        intRef = (Ref.IntRef) nVar.f5206p;
                        objectRef3 = (Ref.ObjectRef) nVar.f5205o;
                        c1339d2 = (C1339d) nVar.f5204n;
                        try {
                            ResultKt.throwOnFailure(obj6);
                            T t112 = objectRef3.element;
                            return new C1341f(t112, t112 != 0 ? t112.hashCode() : 0, intRef.element);
                        } catch (Throwable th3) {
                            th = th3;
                            ExceptionsKt.addSuppressed(c1339d2, th);
                            throw c1339d2;
                        }
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        nVar = new n(continuation);
        Object obj62 = nVar.f5210t;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r22 = nVar.f5212v;
        switch (r22) {
        }
    }

    public final Object z(boolean z10, Continuation continuation) {
        return AbstractC1455i.g(this.f5108c.getCoroutineContext(), new q(z10, null), continuation);
    }
}
