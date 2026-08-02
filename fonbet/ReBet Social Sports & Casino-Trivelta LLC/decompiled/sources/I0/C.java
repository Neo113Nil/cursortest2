package I0;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.AbstractC5323h;
import kotlinx.coroutines.flow.InterfaceC5321f;
import kotlinx.coroutines.flow.InterfaceC5322g;

/* loaded from: classes.dex */
public final class C implements t {

    /* renamed from: a, reason: collision with root package name */
    public final String f5057a;

    /* renamed from: b, reason: collision with root package name */
    public final Wh.a f5058b;

    /* renamed from: c, reason: collision with root package name */
    public final C1337b f5059c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC5321f f5060d;

    public static final class a extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f5061n;

        /* renamed from: o, reason: collision with root package name */
        public Object f5062o;

        /* renamed from: p, reason: collision with root package name */
        public /* synthetic */ Object f5063p;

        /* renamed from: r, reason: collision with root package name */
        public int f5065r;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f5063p = obj;
            this.f5065r |= Integer.MIN_VALUE;
            return C.this.b(null, this);
        }
    }

    public static final class b extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f5066n;

        /* renamed from: o, reason: collision with root package name */
        public boolean f5067o;

        /* renamed from: p, reason: collision with root package name */
        public /* synthetic */ Object f5068p;

        /* renamed from: r, reason: collision with root package name */
        public int f5070r;

        public b(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f5068p = obj;
            this.f5070r |= Integer.MIN_VALUE;
            return C.this.d(null, this);
        }
    }

    public static final class c extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f5071n;

        public c(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new c(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC5322g interfaceC5322g, Continuation continuation) {
            return ((c) create(interfaceC5322g, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f5071n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
    }

    public C(String filePath) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        this.f5057a = filePath;
        this.f5058b = Wh.g.b(false, 1, null);
        this.f5059c = new C1337b(0);
        this.f5060d = AbstractC5323h.x(new c(null));
    }

    @Override // I0.t
    public Object a(Continuation continuation) {
        return Boxing.boxInt(this.f5059c.b());
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0058, code lost:
    
        if (r9.f(null, r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // I0.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b(Function1 function1, Continuation continuation) {
        a aVar;
        Object coroutine_suspended;
        int i10;
        Wh.a aVar2;
        Throwable th2;
        Wh.a aVar3;
        Object invoke;
        try {
            if (continuation instanceof a) {
                aVar = (a) continuation;
                int i11 = aVar.f5065r;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    aVar.f5065r = i11 - Integer.MIN_VALUE;
                    Object obj = aVar.f5063p;
                    coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i10 = aVar.f5065r;
                    if (i10 != 0) {
                        ResultKt.throwOnFailure(obj);
                        aVar2 = this.f5058b;
                        aVar.f5061n = function1;
                        aVar.f5062o = aVar2;
                        aVar.f5065r = 1;
                    } else {
                        if (i10 != 1) {
                            if (i10 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            aVar3 = (Wh.a) aVar.f5061n;
                            try {
                                ResultKt.throwOnFailure(obj);
                                aVar3.g(null);
                                return obj;
                            } catch (Throwable th3) {
                                th2 = th3;
                                aVar3.g(null);
                                throw th2;
                            }
                        }
                        Wh.a aVar4 = (Wh.a) aVar.f5062o;
                        Function1 function12 = (Function1) aVar.f5061n;
                        ResultKt.throwOnFailure(obj);
                        aVar2 = aVar4;
                        function1 = function12;
                    }
                    aVar.f5061n = aVar2;
                    aVar.f5062o = null;
                    aVar.f5065r = 2;
                    invoke = function1.invoke(aVar);
                    if (invoke != coroutine_suspended) {
                        Wh.a aVar5 = aVar2;
                        obj = invoke;
                        aVar3 = aVar5;
                        aVar3.g(null);
                        return obj;
                    }
                    return coroutine_suspended;
                }
            }
            aVar.f5061n = aVar2;
            aVar.f5062o = null;
            aVar.f5065r = 2;
            invoke = function1.invoke(aVar);
            if (invoke != coroutine_suspended) {
            }
            return coroutine_suspended;
        } catch (Throwable th4) {
            Wh.a aVar6 = aVar2;
            th2 = th4;
            aVar3 = aVar6;
            aVar3.g(null);
            throw th2;
        }
        aVar = new a(continuation);
        Object obj2 = aVar.f5063p;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = aVar.f5065r;
        if (i10 != 0) {
        }
    }

    @Override // I0.t
    public InterfaceC5321f c() {
        return this.f5060d;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // I0.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object d(Function2 function2, Continuation continuation) {
        b bVar;
        int i10;
        Wh.a aVar;
        Throwable th2;
        boolean z10;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i11 = bVar.f5070r;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.f5070r = i11 - Integer.MIN_VALUE;
                Object obj = bVar.f5068p;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = bVar.f5070r;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Wh.a aVar2 = this.f5058b;
                    boolean c10 = aVar2.c(null);
                    try {
                        Boolean boxBoolean = Boxing.boxBoolean(c10);
                        bVar.f5066n = aVar2;
                        bVar.f5067o = c10;
                        bVar.f5070r = 1;
                        Object invoke = function2.invoke(boxBoolean, bVar);
                        if (invoke == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        aVar = aVar2;
                        obj = invoke;
                        z10 = c10;
                    } catch (Throwable th3) {
                        aVar = aVar2;
                        th2 = th3;
                        z10 = c10;
                        if (z10) {
                        }
                        throw th2;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z10 = bVar.f5067o;
                    aVar = (Wh.a) bVar.f5066n;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Throwable th4) {
                        th2 = th4;
                        if (z10) {
                            aVar.g(null);
                        }
                        throw th2;
                    }
                }
                if (z10) {
                    aVar.g(null);
                }
                return obj;
            }
        }
        bVar = new b(continuation);
        Object obj2 = bVar.f5068p;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = bVar.f5070r;
        if (i10 != 0) {
        }
        if (z10) {
        }
        return obj2;
    }

    @Override // I0.t
    public Object e(Continuation continuation) {
        return Boxing.boxInt(this.f5059c.d());
    }
}
