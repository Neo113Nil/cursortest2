package Fj;

import Ph.F0;
import java.util.concurrent.TimeUnit;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.AbstractC5323h;
import kotlinx.coroutines.flow.InterfaceC5321f;
import kotlinx.coroutines.flow.InterfaceC5322g;

/* renamed from: Fj.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1158d {

    /* renamed from: c, reason: collision with root package name */
    public static final a f3733c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final Ej.j f3734a;

    /* renamed from: b, reason: collision with root package name */
    public final Ej.n f3735b;

    /* renamed from: Fj.d$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    /* renamed from: Fj.d$b */
    public static final class b implements InterfaceC5321f {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC5321f f3736a;

        /* renamed from: Fj.d$b$a */
        public static final class a implements InterfaceC5322g {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC5322g f3737a;

            /* renamed from: Fj.d$b$a$a, reason: collision with other inner class name */
            public static final class C0081a extends ContinuationImpl {

                /* renamed from: n, reason: collision with root package name */
                public /* synthetic */ Object f3738n;

                /* renamed from: o, reason: collision with root package name */
                public int f3739o;

                public C0081a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f3738n = obj;
                    this.f3739o |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC5322g interfaceC5322g) {
                this.f3737a = interfaceC5322g;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            @Override // kotlinx.coroutines.flow.InterfaceC5322g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                C0081a c0081a;
                int i10;
                if (continuation instanceof C0081a) {
                    c0081a = (C0081a) continuation;
                    int i11 = c0081a.f3739o;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        c0081a.f3739o = i11 - Integer.MIN_VALUE;
                        Object obj2 = c0081a.f3738n;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i10 = c0081a.f3739o;
                        if (i10 != 0) {
                            ResultKt.throwOnFailure(obj2);
                            InterfaceC5322g interfaceC5322g = this.f3737a;
                            Long boxLong = Boxing.boxLong(TimeUnit.MILLISECONDS.toSeconds(((Number) obj).longValue()));
                            c0081a.f3739o = 1;
                            if (interfaceC5322g.emit(boxLong, c0081a) == coroutine_suspended) {
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
                c0081a = new C0081a(continuation);
                Object obj22 = c0081a.f3738n;
                Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = c0081a.f3739o;
                if (i10 != 0) {
                }
                return Unit.INSTANCE;
            }
        }

        public b(InterfaceC5321f interfaceC5321f) {
            this.f3736a = interfaceC5321f;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC5321f
        public Object collect(InterfaceC5322g interfaceC5322g, Continuation continuation) {
            Object collect = this.f3736a.collect(new a(interfaceC5322g), continuation);
            return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
        }
    }

    /* renamed from: Fj.d$c */
    public static final class c extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public long f3741n;

        /* renamed from: o, reason: collision with root package name */
        public int f3742o;

        /* renamed from: p, reason: collision with root package name */
        public /* synthetic */ Object f3743p;

        public c(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            c cVar = C1158d.this.new c(continuation);
            cVar.f3743p = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC5322g interfaceC5322g, Continuation continuation) {
            return ((c) create(interfaceC5322g, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x006f, code lost:
        
            if (Ph.AbstractC1440a0.a(200, r8) != r0) goto L7;
         */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0072  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0046  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x006f -> B:6:0x0017). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            InterfaceC5322g interfaceC5322g;
            long a10;
            InterfaceC5322g interfaceC5322g2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f3742o;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                interfaceC5322g = (InterfaceC5322g) this.f3743p;
                a10 = C1158d.this.f3735b.a();
                if (F0.q(getContext())) {
                }
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a10 = this.f3741n;
                    interfaceC5322g2 = (InterfaceC5322g) this.f3743p;
                    ResultKt.throwOnFailure(obj);
                    interfaceC5322g = interfaceC5322g2;
                    if (F0.q(getContext())) {
                        return Unit.INSTANCE;
                    }
                    Long boxLong = Boxing.boxLong(C1158d.this.f3735b.a() - a10);
                    this.f3743p = interfaceC5322g;
                    this.f3741n = a10;
                    this.f3742o = 1;
                    if (interfaceC5322g.emit(boxLong, this) != coroutine_suspended) {
                        interfaceC5322g2 = interfaceC5322g;
                        this.f3743p = interfaceC5322g2;
                        this.f3741n = a10;
                        this.f3742o = 2;
                    }
                    return coroutine_suspended;
                }
                a10 = this.f3741n;
                interfaceC5322g2 = (InterfaceC5322g) this.f3743p;
                ResultKt.throwOnFailure(obj);
                this.f3743p = interfaceC5322g2;
                this.f3741n = a10;
                this.f3742o = 2;
            }
        }
    }

    public C1158d(Ej.j coroutinesDispatchers, Ej.n systemTimeProvider) {
        Intrinsics.checkNotNullParameter(coroutinesDispatchers, "coroutinesDispatchers");
        Intrinsics.checkNotNullParameter(systemTimeProvider, "systemTimeProvider");
        this.f3734a = coroutinesDispatchers;
        this.f3735b = systemTimeProvider;
    }

    public final InterfaceC5321f b() {
        return AbstractC5323h.B(AbstractC5323h.k(new b(c())), this.f3734a.getDefault());
    }

    public final InterfaceC5321f c() {
        return AbstractC5323h.x(new c(null));
    }
}
