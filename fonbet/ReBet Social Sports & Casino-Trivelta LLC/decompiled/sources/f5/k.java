package f5;

import Ph.AbstractC1440a0;
import Ph.AbstractC1459k;
import Ph.C0;
import Ph.P;
import Ph.Q;
import java.util.concurrent.atomic.AtomicBoolean;
import k5.InterfaceC5199a;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import r5.C6208b;
import r5.InterfaceC6207a;

/* loaded from: classes2.dex */
public abstract class k implements InterfaceC5199a {

    /* renamed from: a, reason: collision with root package name */
    public final long f46423a;

    /* renamed from: b, reason: collision with root package name */
    public final P f46424b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC6207a f46425c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f46426d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f46427e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f46428f;

    /* renamed from: g, reason: collision with root package name */
    public C0 f46429g;

    public static final class a extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f46430n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f46431o;

        public a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            a aVar = k.this.new a(continuation);
            aVar.f46431o = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((a) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            P p10;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f46430n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                P p11 = (P) this.f46431o;
                k.this.J();
                p10 = p11;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p10 = (P) this.f46431o;
                ResultKt.throwOnFailure(obj);
            }
            while (Q.i(p10) && k.this.B().get()) {
                if (!k.this.f46427e.get()) {
                    k.this.k1();
                }
                long j10 = k.this.f46423a;
                this.f46431o = p10;
                this.f46430n = 1;
                if (AbstractC1440a0.a(j10, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    public k(long j10, P scope, InterfaceC6207a clock) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.f46423a = j10;
        this.f46424b = scope;
        this.f46425c = clock;
        this.f46426d = new AtomicBoolean(false);
        this.f46427e = new AtomicBoolean(false);
        this.f46428f = new Object();
    }

    public final AtomicBoolean B() {
        return this.f46426d;
    }

    public abstract void U();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f46428f) {
            try {
                if (this.f46426d.getAndSet(false)) {
                    C0 c02 = this.f46429g;
                    if (c02 != null) {
                        C0.a.b(c02, null, 1, null);
                    }
                    this.f46429g = null;
                    U();
                    Unit unit = Unit.INSTANCE;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void pause() {
        synchronized (this.f46428f) {
            this.f46427e.set(true);
            w0();
            Unit unit = Unit.INSTANCE;
        }
    }

    public final InterfaceC6207a r() {
        return this.f46425c;
    }

    public final void resume() {
        synchronized (this.f46428f) {
            this.f46427e.set(false);
            z0();
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void start() {
        C0 d10;
        synchronized (this.f46428f) {
            if (this.f46426d.getAndSet(true)) {
                return;
            }
            A0();
            d10 = AbstractC1459k.d(this.f46424b, null, null, new a(null), 3, null);
            this.f46429g = d10;
            Unit unit = Unit.INSTANCE;
        }
    }

    public /* synthetic */ k(long j10, P p10, InterfaceC6207a interfaceC6207a, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, p10, (i10 & 4) != 0 ? new C6208b() : interfaceC6207a);
    }

    public void A0() {
    }

    public void J() {
    }

    public void w0() {
    }

    public void z0() {
    }
}
