package Yh;

import Ph.InterfaceC1456i0;
import Ph.InterfaceC1465n;
import Ph.L;
import Ph.M0;
import Ph.W;
import Ph.Z;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class c extends M0 implements Z {

    /* renamed from: d, reason: collision with root package name */
    public static final a f14266d = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public final Lazy f14267b;

    /* renamed from: c, reason: collision with root package name */
    public b f14268c = new b(null, "Dispatchers.Main");

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public static final class b {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f14269b = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "reader$volatile");

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f14270c = AtomicIntegerFieldUpdater.newUpdater(b.class, "readers$volatile");

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f14271d = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "writer$volatile");

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f14272e = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "exceptionWhenReading$volatile");

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f14273f = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_value$volatile");
        private volatile /* synthetic */ Object _value$volatile;

        /* renamed from: a, reason: collision with root package name */
        public final String f14274a;
        private volatile /* synthetic */ Object exceptionWhenReading$volatile;
        private volatile /* synthetic */ Object reader$volatile;
        private volatile /* synthetic */ int readers$volatile;
        private volatile /* synthetic */ Object writer$volatile;

        public b(Object obj, String str) {
            this.f14274a = str;
            this._value$volatile = obj;
        }

        public final IllegalStateException a(Throwable th2) {
            return new IllegalStateException(this.f14274a + " is used concurrently with setting it", th2);
        }

        public final Object e() {
            f14269b.set(this, new Throwable("reader location"));
            f14270c.incrementAndGet(this);
            Throwable th2 = (Throwable) f14271d.get(this);
            if (th2 != null) {
                f14272e.set(this, a(th2));
            }
            Object obj = f14273f.get(this);
            f14270c.decrementAndGet(this);
            return obj;
        }
    }

    public c(Function0 function0) {
        this.f14267b = LazyKt.lazy(function0);
    }

    private final L R1() {
        L l10 = (L) this.f14268c.e();
        return l10 == null ? h2() : l10;
    }

    @Override // Ph.Z
    public InterfaceC1456i0 J(long j10, Runnable runnable, CoroutineContext coroutineContext) {
        return g2().J(j10, runnable, coroutineContext);
    }

    @Override // Ph.L
    public void Y1(CoroutineContext coroutineContext, Runnable runnable) {
        R1().Y1(coroutineContext, runnable);
    }

    @Override // Ph.L
    public void Z1(CoroutineContext coroutineContext, Runnable runnable) {
        R1().Z1(coroutineContext, runnable);
    }

    @Override // Ph.L
    public boolean a2(CoroutineContext coroutineContext) {
        return R1().a2(coroutineContext);
    }

    @Override // Ph.M0
    public M0 e2() {
        M0 e22;
        L R12 = R1();
        M0 m02 = R12 instanceof M0 ? (M0) R12 : null;
        return (m02 == null || (e22 = m02.e2()) == null) ? this : e22;
    }

    public final Z g2() {
        CoroutineContext.Element R12 = R1();
        Z z10 = R12 instanceof Z ? (Z) R12 : null;
        return z10 == null ? W.a() : z10;
    }

    public final L h2() {
        return (L) this.f14267b.getValue();
    }

    @Override // Ph.Z
    public void w0(long j10, InterfaceC1465n interfaceC1465n) {
        g2().w0(j10, interfaceC1465n);
    }
}
