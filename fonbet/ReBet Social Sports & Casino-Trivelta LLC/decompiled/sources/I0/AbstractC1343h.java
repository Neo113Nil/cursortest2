package I0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ExceptionsKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* renamed from: I0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1343h {

    /* renamed from: a, reason: collision with root package name */
    public static final a f5086a = new a(null);

    /* renamed from: I0.h$a */
    public static final class a {

        /* renamed from: I0.h$a$a, reason: collision with other inner class name */
        public static final class C0107a extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public int f5087n;

            /* renamed from: o, reason: collision with root package name */
            public /* synthetic */ Object f5088o;

            /* renamed from: p, reason: collision with root package name */
            public final /* synthetic */ List f5089p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0107a(List list, Continuation continuation) {
                super(2, continuation);
                this.f5089p = list;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                C0107a c0107a = new C0107a(this.f5089p, continuation);
                c0107a.f5088o = obj;
                return c0107a;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public final Object invoke(s sVar, Continuation continuation) {
                return ((C0107a) create(sVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.f5087n;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    s sVar = (s) this.f5088o;
                    a aVar = AbstractC1343h.f5086a;
                    List list = this.f5089p;
                    this.f5087n = 1;
                    if (aVar.c(list, sVar, this) == coroutine_suspended) {
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

        /* renamed from: I0.h$a$b */
        public static final class b extends ContinuationImpl {

            /* renamed from: n, reason: collision with root package name */
            public Object f5090n;

            /* renamed from: o, reason: collision with root package name */
            public Object f5091o;

            /* renamed from: p, reason: collision with root package name */
            public /* synthetic */ Object f5092p;

            /* renamed from: r, reason: collision with root package name */
            public int f5094r;

            public b(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f5092p = obj;
                this.f5094r |= Integer.MIN_VALUE;
                return a.this.c(null, null, this);
            }
        }

        /* renamed from: I0.h$a$c */
        public static final class c extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public Object f5095n;

            /* renamed from: o, reason: collision with root package name */
            public Object f5096o;

            /* renamed from: p, reason: collision with root package name */
            public Object f5097p;

            /* renamed from: q, reason: collision with root package name */
            public int f5098q;

            /* renamed from: r, reason: collision with root package name */
            public /* synthetic */ Object f5099r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ List f5100s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ List f5101t;

            /* renamed from: I0.h$a$c$a, reason: collision with other inner class name */
            public static final class C0108a extends SuspendLambda implements Function1 {

                /* renamed from: n, reason: collision with root package name */
                public int f5102n;

                /* renamed from: o, reason: collision with root package name */
                public final /* synthetic */ InterfaceC1342g f5103o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0108a(InterfaceC1342g interfaceC1342g, Continuation continuation) {
                    super(1, continuation);
                    this.f5103o = interfaceC1342g;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Continuation continuation) {
                    return new C0108a(this.f5103o, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i10 = this.f5102n;
                    if (i10 == 0) {
                        ResultKt.throwOnFailure(obj);
                        InterfaceC1342g interfaceC1342g = this.f5103o;
                        this.f5102n = 1;
                        if (interfaceC1342g.b(this) == coroutine_suspended) {
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

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Continuation continuation) {
                    return ((C0108a) create(continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(List list, List list2, Continuation continuation) {
                super(2, continuation);
                this.f5100s = list;
                this.f5101t = list2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                c cVar = new c(this.f5100s, this.f5101t, continuation);
                cVar.f5099r = obj;
                return cVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Object obj, Continuation continuation) {
                return ((c) create(obj, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Removed duplicated region for block: B:13:0x0070  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x008c  */
            /* JADX WARN: Removed duplicated region for block: B:20:0x008e A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:8:0x004c  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                List list;
                Iterator it;
                InterfaceC1342g interfaceC1342g;
                Iterator it2;
                Object obj2;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.f5098q;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    obj = this.f5099r;
                    List list2 = this.f5100s;
                    list = this.f5101t;
                    it = list2.iterator();
                } else if (i10 == 1) {
                    obj2 = this.f5097p;
                    InterfaceC1342g interfaceC1342g2 = (InterfaceC1342g) this.f5096o;
                    it2 = (Iterator) this.f5095n;
                    List list3 = (List) this.f5099r;
                    ResultKt.throwOnFailure(obj);
                    interfaceC1342g = interfaceC1342g2;
                    list = list3;
                    if (!((Boolean) obj).booleanValue()) {
                        list.add(new C0108a(interfaceC1342g, null));
                        this.f5099r = list;
                        this.f5095n = it2;
                        this.f5096o = null;
                        this.f5097p = null;
                        this.f5098q = 2;
                        obj = interfaceC1342g.c(obj2, this);
                        if (obj != coroutine_suspended) {
                            it = it2;
                        }
                        return coroutine_suspended;
                    }
                    obj = obj2;
                    it = it2;
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (Iterator) this.f5095n;
                    list = (List) this.f5099r;
                    ResultKt.throwOnFailure(obj);
                }
                if (!it.hasNext()) {
                    InterfaceC1342g interfaceC1342g3 = (InterfaceC1342g) it.next();
                    this.f5099r = list;
                    this.f5095n = it;
                    this.f5096o = interfaceC1342g3;
                    this.f5097p = obj;
                    this.f5098q = 1;
                    Object a10 = interfaceC1342g3.a(obj, this);
                    if (a10 != coroutine_suspended) {
                        Iterator it3 = it;
                        obj2 = obj;
                        obj = a10;
                        interfaceC1342g = interfaceC1342g3;
                        it2 = it3;
                        if (!((Boolean) obj).booleanValue()) {
                        }
                        if (!it.hasNext()) {
                            return obj;
                        }
                    }
                    return coroutine_suspended;
                }
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Function2 b(List migrations) {
            Intrinsics.checkNotNullParameter(migrations, "migrations");
            return new C0107a(migrations, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0071  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        /* JADX WARN: Type inference failed for: r9v3, types: [T, java.lang.Throwable] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0088 -> B:13:0x006b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x008b -> B:13:0x006b). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object c(List list, s sVar, Continuation continuation) {
            b bVar;
            int i10;
            List list2;
            Ref.ObjectRef objectRef;
            Iterator it;
            Throwable th2;
            if (continuation instanceof b) {
                bVar = (b) continuation;
                int i11 = bVar.f5094r;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    bVar.f5094r = i11 - Integer.MIN_VALUE;
                    Object obj = bVar.f5092p;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i10 = bVar.f5094r;
                    if (i10 != 0) {
                        ResultKt.throwOnFailure(obj);
                        ArrayList arrayList = new ArrayList();
                        Function2 cVar = new c(list, arrayList, null);
                        bVar.f5090n = arrayList;
                        bVar.f5094r = 1;
                        if (sVar.a(cVar, bVar) != coroutine_suspended) {
                            list2 = arrayList;
                        }
                        return coroutine_suspended;
                    }
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        it = (Iterator) bVar.f5091o;
                        objectRef = (Ref.ObjectRef) bVar.f5090n;
                        try {
                            ResultKt.throwOnFailure(obj);
                        } catch (Throwable th3) {
                            T t10 = objectRef.element;
                            if (t10 == 0) {
                                objectRef.element = th3;
                            } else {
                                Intrinsics.checkNotNull(t10);
                                ExceptionsKt.addSuppressed((Throwable) t10, th3);
                            }
                        }
                        while (it.hasNext()) {
                            Function1 function1 = (Function1) it.next();
                            bVar.f5090n = objectRef;
                            bVar.f5091o = it;
                            bVar.f5094r = 2;
                            if (function1.invoke(bVar) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        th2 = (Throwable) objectRef.element;
                        if (th2 == null) {
                            return Unit.INSTANCE;
                        }
                        throw th2;
                    }
                    list2 = (List) bVar.f5090n;
                    ResultKt.throwOnFailure(obj);
                    objectRef = new Ref.ObjectRef();
                    it = list2.iterator();
                    while (it.hasNext()) {
                    }
                    th2 = (Throwable) objectRef.element;
                    if (th2 == null) {
                    }
                }
            }
            bVar = new b(continuation);
            Object obj2 = bVar.f5092p;
            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i10 = bVar.f5094r;
            if (i10 != 0) {
            }
            objectRef = new Ref.ObjectRef();
            it = list2.iterator();
            while (it.hasNext()) {
            }
            th2 = (Throwable) objectRef.element;
            if (th2 == null) {
            }
        }

        public a() {
        }
    }
}
