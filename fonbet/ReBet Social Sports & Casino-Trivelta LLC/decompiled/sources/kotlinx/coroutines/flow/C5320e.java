package kotlinx.coroutines.flow;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* renamed from: kotlinx.coroutines.flow.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5320e implements InterfaceC5321f {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC5321f f54680a;

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f54681b;

    /* renamed from: c, reason: collision with root package name */
    public final Function2 f54682c;

    /* renamed from: kotlinx.coroutines.flow.e$a */
    public static final class a implements InterfaceC5322g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef f54684b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ InterfaceC5322g f54685c;

        /* renamed from: kotlinx.coroutines.flow.e$a$a, reason: collision with other inner class name */
        public static final class C0788a extends ContinuationImpl {

            /* renamed from: n, reason: collision with root package name */
            public /* synthetic */ Object f54686n;

            /* renamed from: p, reason: collision with root package name */
            public int f54688p;

            public C0788a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f54686n = obj;
                this.f54688p |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(Ref.ObjectRef objectRef, InterfaceC5322g interfaceC5322g) {
            this.f54684b = objectRef;
            this.f54685c = interfaceC5322g;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        /* JADX WARN: Type inference failed for: r7v4, types: [T, java.lang.Object] */
        @Override // kotlinx.coroutines.flow.InterfaceC5322g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            C0788a c0788a;
            int i10;
            if (continuation instanceof C0788a) {
                c0788a = (C0788a) continuation;
                int i11 = c0788a.f54688p;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    c0788a.f54688p = i11 - Integer.MIN_VALUE;
                    Object obj2 = c0788a.f54686n;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i10 = c0788a.f54688p;
                    if (i10 != 0) {
                        ResultKt.throwOnFailure(obj2);
                        ?? invoke = C5320e.this.f54681b.invoke(obj);
                        T t10 = this.f54684b.element;
                        if (t10 != kotlinx.coroutines.flow.internal.t.f54780a && ((Boolean) C5320e.this.f54682c.invoke(t10, invoke)).booleanValue()) {
                            return Unit.INSTANCE;
                        }
                        this.f54684b.element = invoke;
                        InterfaceC5322g interfaceC5322g = this.f54685c;
                        c0788a.f54688p = 1;
                        if (interfaceC5322g.emit(obj, c0788a) == coroutine_suspended) {
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
            c0788a = new C0788a(continuation);
            Object obj22 = c0788a.f54686n;
            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i10 = c0788a.f54688p;
            if (i10 != 0) {
            }
            return Unit.INSTANCE;
        }
    }

    public C5320e(InterfaceC5321f interfaceC5321f, Function1 function1, Function2 function2) {
        this.f54680a = interfaceC5321f;
        this.f54681b = function1;
        this.f54682c = function2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Sh.G, T] */
    @Override // kotlinx.coroutines.flow.InterfaceC5321f
    public Object collect(InterfaceC5322g interfaceC5322g, Continuation continuation) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = kotlinx.coroutines.flow.internal.t.f54780a;
        Object collect = this.f54680a.collect(new a(objectRef, interfaceC5322g), continuation);
        return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
    }
}
