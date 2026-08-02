package kotlinx.coroutines.flow.internal;

import Ph.AbstractC1459k;
import Ph.C0;
import Ph.F0;
import Ph.P;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.InterfaceC5321f;
import kotlinx.coroutines.flow.InterfaceC5322g;

/* loaded from: classes5.dex */
public final class g extends e {

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC5321f f54719d;

    /* renamed from: e, reason: collision with root package name */
    public final int f54720e;

    public static final class a implements InterfaceC5322g {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C0 f54721a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Wh.h f54722b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Rh.y f54723c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ z f54724d;

        /* renamed from: kotlinx.coroutines.flow.internal.g$a$a, reason: collision with other inner class name */
        public static final class C0790a extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public int f54725n;

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ InterfaceC5321f f54726o;

            /* renamed from: p, reason: collision with root package name */
            public final /* synthetic */ z f54727p;

            /* renamed from: q, reason: collision with root package name */
            public final /* synthetic */ Wh.h f54728q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0790a(InterfaceC5321f interfaceC5321f, z zVar, Wh.h hVar, Continuation continuation) {
                super(2, continuation);
                this.f54726o = interfaceC5321f;
                this.f54727p = zVar;
                this.f54728q = hVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C0790a(this.f54726o, this.f54727p, this.f54728q, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(P p10, Continuation continuation) {
                return ((C0790a) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.f54725n;
                try {
                    if (i10 == 0) {
                        ResultKt.throwOnFailure(obj);
                        InterfaceC5321f interfaceC5321f = this.f54726o;
                        z zVar = this.f54727p;
                        this.f54725n = 1;
                        if (interfaceC5321f.collect(zVar, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    this.f54728q.release();
                    return Unit.INSTANCE;
                } catch (Throwable th2) {
                    this.f54728q.release();
                    throw th2;
                }
            }
        }

        public static final class b extends ContinuationImpl {

            /* renamed from: n, reason: collision with root package name */
            public Object f54729n;

            /* renamed from: o, reason: collision with root package name */
            public Object f54730o;

            /* renamed from: p, reason: collision with root package name */
            public /* synthetic */ Object f54731p;

            /* renamed from: r, reason: collision with root package name */
            public int f54733r;

            public b(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f54731p = obj;
                this.f54733r |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(C0 c02, Wh.h hVar, Rh.y yVar, z zVar) {
            this.f54721a = c02;
            this.f54722b = hVar;
            this.f54723c = yVar;
            this.f54724d = zVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @Override // kotlinx.coroutines.flow.InterfaceC5322g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(InterfaceC5321f interfaceC5321f, Continuation continuation) {
            b bVar;
            int i10;
            a aVar;
            if (continuation instanceof b) {
                bVar = (b) continuation;
                int i11 = bVar.f54733r;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    bVar.f54733r = i11 - Integer.MIN_VALUE;
                    Object obj = bVar.f54731p;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i10 = bVar.f54733r;
                    if (i10 != 0) {
                        ResultKt.throwOnFailure(obj);
                        C0 c02 = this.f54721a;
                        if (c02 != null) {
                            F0.l(c02);
                        }
                        Wh.h hVar = this.f54722b;
                        bVar.f54729n = this;
                        bVar.f54730o = interfaceC5321f;
                        bVar.f54733r = 1;
                        if (hVar.e(bVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        aVar = this;
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        interfaceC5321f = (InterfaceC5321f) bVar.f54730o;
                        aVar = (a) bVar.f54729n;
                        ResultKt.throwOnFailure(obj);
                    }
                    AbstractC1459k.d(aVar.f54723c, null, null, new C0790a(interfaceC5321f, aVar.f54724d, aVar.f54722b, null), 3, null);
                    return Unit.INSTANCE;
                }
            }
            bVar = new b(continuation);
            Object obj2 = bVar.f54731p;
            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i10 = bVar.f54733r;
            if (i10 != 0) {
            }
            AbstractC1459k.d(aVar.f54723c, null, null, new C0790a(interfaceC5321f, aVar.f54724d, aVar.f54722b, null), 3, null);
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ g(InterfaceC5321f interfaceC5321f, int i10, CoroutineContext coroutineContext, int i11, Rh.d dVar, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC5321f, i10, (i12 & 4) != 0 ? EmptyCoroutineContext.INSTANCE : coroutineContext, (i12 & 8) != 0 ? -2 : i11, (i12 & 16) != 0 ? Rh.d.f10307a : dVar);
    }

    @Override // kotlinx.coroutines.flow.internal.e
    public String c() {
        return "concurrency=" + this.f54720e;
    }

    @Override // kotlinx.coroutines.flow.internal.e
    public Object f(Rh.y yVar, Continuation continuation) {
        Object collect = this.f54719d.collect(new a((C0) continuation.get$context().get(C0.f9001U2), Wh.l.b(this.f54720e, 0, 2, null), yVar, new z(yVar)), continuation);
        return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.flow.internal.e
    public e i(CoroutineContext coroutineContext, int i10, Rh.d dVar) {
        return new g(this.f54719d, this.f54720e, coroutineContext, i10, dVar);
    }

    @Override // kotlinx.coroutines.flow.internal.e
    public Rh.A m(P p10) {
        return Rh.w.c(p10, this.f54709a, this.f54710b, k());
    }

    public g(InterfaceC5321f interfaceC5321f, int i10, CoroutineContext coroutineContext, int i11, Rh.d dVar) {
        super(coroutineContext, i11, dVar);
        this.f54719d = interfaceC5321f;
        this.f54720e = i10;
    }
}
