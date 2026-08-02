package Qg;

import Ph.A;
import Ph.C0;
import Ph.O;
import Qg.b;
import ch.o;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public abstract class c implements Qg.b {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f9729c = AtomicIntegerFieldUpdater.newUpdater(c.class, "closed");

    /* renamed from: a, reason: collision with root package name */
    public final String f9730a;

    /* renamed from: b, reason: collision with root package name */
    public final Lazy f9731b;

    @NotNull
    private volatile /* synthetic */ int closed;

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(Throwable th2) {
            d.b(c.this.R1());
        }
    }

    public static final class b extends Lambda implements Function0 {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CoroutineContext invoke() {
            return o.b(null, 1, null).plus(c.this.R1()).plus(new O(c.this.f9730a + "-context"));
        }
    }

    public c(String engineName) {
        Intrinsics.checkNotNullParameter(engineName, "engineName");
        this.f9730a = engineName;
        this.closed = 0;
        this.f9731b = LazyKt.lazy(new b());
    }

    @Override // Qg.b
    public Set Z0() {
        return b.a.g(this);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (f9729c.compareAndSet(this, 0, 1)) {
            CoroutineContext.Element element = getCoroutineContext().get(C0.f9001U2);
            A a10 = element instanceof A ? (A) element : null;
            if (a10 == null) {
                return;
            }
            a10.y1();
            a10.invokeOnCompletion(new a());
        }
    }

    @Override // Ph.P
    public CoroutineContext getCoroutineContext() {
        return (CoroutineContext) this.f9731b.getValue();
    }

    @Override // Qg.b
    public void k0(Ng.a aVar) {
        b.a.h(this, aVar);
    }
}
