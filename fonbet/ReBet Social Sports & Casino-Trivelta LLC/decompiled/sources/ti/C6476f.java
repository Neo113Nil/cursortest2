package ti;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: ti.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C6476f extends H {

    @NotNull
    public static final a Companion = new a(null);
    private static final long IDLE_TIMEOUT_MILLIS;
    private static final long IDLE_TIMEOUT_NANOS;
    private static final int TIMEOUT_WRITE_SIZE = 65536;

    @NotNull
    private static final Condition condition;

    @Nullable
    private static C6476f head;

    @NotNull
    private static final ReentrantLock lock;
    private boolean inQueue;

    @Nullable
    private C6476f next;
    private long timeoutAt;

    /* renamed from: ti.f$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C6476f c() {
            C6476f c6476f = C6476f.head;
            Intrinsics.checkNotNull(c6476f);
            C6476f c6476f2 = c6476f.next;
            if (c6476f2 == null) {
                long nanoTime = System.nanoTime();
                e().await(C6476f.IDLE_TIMEOUT_MILLIS, TimeUnit.MILLISECONDS);
                C6476f c6476f3 = C6476f.head;
                Intrinsics.checkNotNull(c6476f3);
                if (c6476f3.next != null || System.nanoTime() - nanoTime < C6476f.IDLE_TIMEOUT_NANOS) {
                    return null;
                }
                return C6476f.head;
            }
            long a10 = c6476f2.a(System.nanoTime());
            if (a10 > 0) {
                e().await(a10, TimeUnit.NANOSECONDS);
                return null;
            }
            C6476f c6476f4 = C6476f.head;
            Intrinsics.checkNotNull(c6476f4);
            c6476f4.next = c6476f2.next;
            c6476f2.next = null;
            return c6476f2;
        }

        public final boolean d(C6476f c6476f) {
            ReentrantLock f10 = C6476f.Companion.f();
            f10.lock();
            try {
                if (!c6476f.inQueue) {
                    return false;
                }
                c6476f.inQueue = false;
                for (C6476f c6476f2 = C6476f.head; c6476f2 != null; c6476f2 = c6476f2.next) {
                    if (c6476f2.next == c6476f) {
                        c6476f2.next = c6476f.next;
                        c6476f.next = null;
                        return false;
                    }
                }
                f10.unlock();
                return true;
            } finally {
                f10.unlock();
            }
        }

        public final Condition e() {
            return C6476f.condition;
        }

        public final ReentrantLock f() {
            return C6476f.lock;
        }

        public final void g(C6476f c6476f, long j10, boolean z10) {
            ReentrantLock f10 = C6476f.Companion.f();
            f10.lock();
            try {
                if (c6476f.inQueue) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                c6476f.inQueue = true;
                if (C6476f.head == null) {
                    C6476f.head = new C6476f();
                    new b().start();
                }
                long nanoTime = System.nanoTime();
                if (j10 != 0 && z10) {
                    c6476f.timeoutAt = Math.min(j10, c6476f.deadlineNanoTime() - nanoTime) + nanoTime;
                } else if (j10 != 0) {
                    c6476f.timeoutAt = j10 + nanoTime;
                } else {
                    if (!z10) {
                        throw new AssertionError();
                    }
                    c6476f.timeoutAt = c6476f.deadlineNanoTime();
                }
                long a10 = c6476f.a(nanoTime);
                C6476f c6476f2 = C6476f.head;
                Intrinsics.checkNotNull(c6476f2);
                while (c6476f2.next != null) {
                    C6476f c6476f3 = c6476f2.next;
                    Intrinsics.checkNotNull(c6476f3);
                    if (a10 < c6476f3.a(nanoTime)) {
                        break;
                    }
                    c6476f2 = c6476f2.next;
                    Intrinsics.checkNotNull(c6476f2);
                }
                c6476f.next = c6476f2.next;
                c6476f2.next = c6476f;
                if (c6476f2 == C6476f.head) {
                    C6476f.Companion.e().signal();
                }
                Unit unit = Unit.INSTANCE;
                f10.unlock();
            } catch (Throwable th2) {
                f10.unlock();
                throw th2;
            }
        }

        public a() {
        }
    }

    /* renamed from: ti.f$b */
    public static final class b extends Thread {
        public b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            ReentrantLock f10;
            C6476f c10;
            while (true) {
                try {
                    a aVar = C6476f.Companion;
                    f10 = aVar.f();
                    f10.lock();
                    try {
                        c10 = aVar.c();
                    } finally {
                        f10.unlock();
                    }
                } catch (InterruptedException unused) {
                }
                if (c10 == C6476f.head) {
                    C6476f.head = null;
                    return;
                }
                Unit unit = Unit.INSTANCE;
                f10.unlock();
                if (c10 != null) {
                    c10.timedOut();
                }
            }
        }
    }

    /* renamed from: ti.f$c */
    public static final class c implements E {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ E f65854b;

        public c(E e10) {
            this.f65854b = e10;
        }

        @Override // ti.E, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            C6476f c6476f = C6476f.this;
            E e10 = this.f65854b;
            c6476f.enter();
            try {
                e10.close();
                Unit unit = Unit.INSTANCE;
                if (c6476f.exit()) {
                    throw c6476f.access$newTimeoutException(null);
                }
            } catch (IOException e11) {
                if (!c6476f.exit()) {
                    throw e11;
                }
                throw c6476f.access$newTimeoutException(e11);
            } finally {
                c6476f.exit();
            }
        }

        @Override // ti.E
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public C6476f timeout() {
            return C6476f.this;
        }

        @Override // ti.E, java.io.Flushable
        public void flush() {
            C6476f c6476f = C6476f.this;
            E e10 = this.f65854b;
            c6476f.enter();
            try {
                e10.flush();
                Unit unit = Unit.INSTANCE;
                if (c6476f.exit()) {
                    throw c6476f.access$newTimeoutException(null);
                }
            } catch (IOException e11) {
                if (!c6476f.exit()) {
                    throw e11;
                }
                throw c6476f.access$newTimeoutException(e11);
            } finally {
                c6476f.exit();
            }
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.f65854b + ')';
        }

        @Override // ti.E
        public void write(C6478h source, long j10) {
            Intrinsics.checkNotNullParameter(source, "source");
            AbstractC6475e.b(source.size(), 0L, j10);
            while (true) {
                long j11 = 0;
                if (j10 <= 0) {
                    return;
                }
                C6468B c6468b = source.f65857a;
                Intrinsics.checkNotNull(c6468b);
                while (true) {
                    if (j11 >= 65536) {
                        break;
                    }
                    j11 += c6468b.f65836b - c6468b.f65835a;
                    if (j11 >= j10) {
                        j11 = j10;
                        break;
                    } else {
                        c6468b = c6468b.f65839e;
                        Intrinsics.checkNotNull(c6468b);
                    }
                }
                C6476f c6476f = C6476f.this;
                E e10 = this.f65854b;
                c6476f.enter();
                try {
                    try {
                        e10.write(source, j11);
                        Unit unit = Unit.INSTANCE;
                        if (c6476f.exit()) {
                            throw c6476f.access$newTimeoutException(null);
                        }
                        j10 -= j11;
                    } catch (IOException e11) {
                        if (!c6476f.exit()) {
                            throw e11;
                        }
                        throw c6476f.access$newTimeoutException(e11);
                    }
                } catch (Throwable th2) {
                    c6476f.exit();
                    throw th2;
                }
            }
        }
    }

    /* renamed from: ti.f$d */
    public static final class d implements G {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ G f65856b;

        public d(G g10) {
            this.f65856b = g10;
        }

        @Override // ti.G, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            C6476f c6476f = C6476f.this;
            G g10 = this.f65856b;
            c6476f.enter();
            try {
                g10.close();
                Unit unit = Unit.INSTANCE;
                if (c6476f.exit()) {
                    throw c6476f.access$newTimeoutException(null);
                }
            } catch (IOException e10) {
                if (!c6476f.exit()) {
                    throw e10;
                }
                throw c6476f.access$newTimeoutException(e10);
            } finally {
                c6476f.exit();
            }
        }

        @Override // ti.G
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public C6476f timeout() {
            return C6476f.this;
        }

        @Override // ti.G
        public long read(C6478h sink, long j10) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            C6476f c6476f = C6476f.this;
            G g10 = this.f65856b;
            c6476f.enter();
            try {
                long read = g10.read(sink, j10);
                if (c6476f.exit()) {
                    throw c6476f.access$newTimeoutException(null);
                }
                return read;
            } catch (IOException e10) {
                if (c6476f.exit()) {
                    throw c6476f.access$newTimeoutException(e10);
                }
                throw e10;
            } finally {
                c6476f.exit();
            }
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.f65856b + ')';
        }
    }

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        lock = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        Intrinsics.checkNotNullExpressionValue(newCondition, "newCondition(...)");
        condition = newCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        IDLE_TIMEOUT_MILLIS = millis;
        IDLE_TIMEOUT_NANOS = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final long a(long j10) {
        return this.timeoutAt - j10;
    }

    @PublishedApi
    @NotNull
    public final IOException access$newTimeoutException(@Nullable IOException iOException) {
        return newTimeoutException(iOException);
    }

    public final void enter() {
        long timeoutNanos = timeoutNanos();
        boolean hasDeadline = hasDeadline();
        if (timeoutNanos != 0 || hasDeadline) {
            Companion.g(this, timeoutNanos, hasDeadline);
        }
    }

    public final boolean exit() {
        return Companion.d(this);
    }

    @NotNull
    public IOException newTimeoutException(@Nullable IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    @NotNull
    public final E sink(@NotNull E sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        return new c(sink);
    }

    @NotNull
    public final G source(@NotNull G source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return new d(source);
    }

    public final <T> T withTimeout(@NotNull Function0<? extends T> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        enter();
        try {
            try {
                T invoke = block.invoke();
                InlineMarker.finallyStart(1);
                if (exit()) {
                    throw access$newTimeoutException(null);
                }
                InlineMarker.finallyEnd(1);
                return invoke;
            } catch (IOException e10) {
                if (exit()) {
                    throw access$newTimeoutException(e10);
                }
                throw e10;
            }
        } catch (Throwable th2) {
            InlineMarker.finallyStart(1);
            exit();
            InlineMarker.finallyEnd(1);
            throw th2;
        }
    }

    public void timedOut() {
    }
}
