package sf;

import I0.C3173b;
import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: sf.l, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC9686l implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f98726a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f98727b;

    /* renamed from: c, reason: collision with root package name */
    private int f98728c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final ReentrantLock f98729d = new ReentrantLock();

    /* renamed from: sf.l$a */
    private static final class a implements K {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final AbstractC9686l f98730a;

        /* renamed from: b, reason: collision with root package name */
        private long f98731b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f98732c;

        public a(@NotNull AbstractC9686l fileHandle) {
            Intrinsics.checkNotNullParameter(fileHandle, "fileHandle");
            this.f98730a = fileHandle;
            this.f98731b = 0L;
        }

        @Override // sf.K, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f98732c) {
                return;
            }
            this.f98732c = true;
            AbstractC9686l abstractC9686l = this.f98730a;
            ReentrantLock k11 = abstractC9686l.k();
            k11.lock();
            try {
                abstractC9686l.f98728c--;
                if (abstractC9686l.f98728c == 0 && abstractC9686l.f98727b) {
                    Unit unit = Unit.f71690a;
                    k11.unlock();
                    abstractC9686l.m();
                }
            } finally {
                k11.unlock();
            }
        }

        @Override // sf.K, java.io.Flushable
        public final void flush() {
            if (this.f98732c) {
                throw new IllegalStateException("closed");
            }
            this.f98730a.o();
        }

        @Override // sf.K
        @NotNull
        public final N timeout() {
            return N.f98683d;
        }

        @Override // sf.K
        public final void z0(@NotNull C9681g source, long j11) {
            Intrinsics.checkNotNullParameter(source, "source");
            if (this.f98732c) {
                throw new IllegalStateException("closed");
            }
            long j12 = this.f98731b;
            AbstractC9686l abstractC9686l = this.f98730a;
            abstractC9686l.getClass();
            C9676b.b(source.size(), 0L, j11);
            long j13 = j12 + j11;
            long j14 = j12;
            while (j14 < j13) {
                H h11 = source.f98708a;
                Intrinsics.f(h11);
                int min = (int) Math.min(j13 - j14, h11.f98672c - h11.f98671b);
                abstractC9686l.r(j14, h11.f98670a, h11.f98671b, min);
                h11.f98671b += min;
                long j15 = min;
                j14 += j15;
                source.O(source.size() - j15);
                if (h11.f98671b == h11.f98672c) {
                    source.f98708a = h11.a();
                    I.a(h11);
                }
            }
            this.f98731b += j11;
        }
    }

    /* renamed from: sf.l$b */
    private static final class b implements M {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final AbstractC9686l f98733a;

        /* renamed from: b, reason: collision with root package name */
        private long f98734b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f98735c;

        public b(@NotNull AbstractC9686l fileHandle, long j11) {
            Intrinsics.checkNotNullParameter(fileHandle, "fileHandle");
            this.f98733a = fileHandle;
            this.f98734b = j11;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f98735c) {
                return;
            }
            this.f98735c = true;
            AbstractC9686l abstractC9686l = this.f98733a;
            ReentrantLock k11 = abstractC9686l.k();
            k11.lock();
            try {
                abstractC9686l.f98728c--;
                if (abstractC9686l.f98728c == 0 && abstractC9686l.f98727b) {
                    Unit unit = Unit.f71690a;
                    k11.unlock();
                    abstractC9686l.m();
                }
            } finally {
                k11.unlock();
            }
        }

        @Override // sf.M
        public final long read(@NotNull C9681g sink, long j11) {
            long j12;
            long j13;
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (this.f98735c) {
                throw new IllegalStateException("closed");
            }
            long j14 = this.f98734b;
            AbstractC9686l abstractC9686l = this.f98733a;
            abstractC9686l.getClass();
            if (j11 < 0) {
                throw new IllegalArgumentException(C3173b.b(j11, "byteCount < 0: ").toString());
            }
            long j15 = j11 + j14;
            long j16 = j14;
            while (true) {
                if (j16 >= j15) {
                    j12 = -1;
                    break;
                }
                H W11 = sink.W(1);
                j12 = -1;
                long j17 = j15;
                int p11 = abstractC9686l.p(j16, W11.f98670a, W11.f98672c, (int) Math.min(j15 - j16, 8192 - r10));
                if (p11 == -1) {
                    if (W11.f98671b == W11.f98672c) {
                        sink.f98708a = W11.a();
                        I.a(W11);
                    }
                    if (j14 == j16) {
                        j13 = -1;
                    }
                } else {
                    W11.f98672c += p11;
                    long j18 = p11;
                    j16 += j18;
                    sink.O(sink.size() + j18);
                    j15 = j17;
                }
            }
            j13 = j16 - j14;
            if (j13 != j12) {
                this.f98734b += j13;
            }
            return j13;
        }

        @Override // sf.M
        @NotNull
        public final N timeout() {
            return N.f98683d;
        }
    }

    public AbstractC9686l(boolean z11) {
        this.f98726a = z11;
    }

    public static K s(AbstractC9686l abstractC9686l) throws IOException {
        if (!abstractC9686l.f98726a) {
            throw new IllegalStateException("file handle is read-only");
        }
        ReentrantLock reentrantLock = abstractC9686l.f98729d;
        reentrantLock.lock();
        try {
            if (abstractC9686l.f98727b) {
                throw new IllegalStateException("closed");
            }
            abstractC9686l.f98728c++;
            reentrantLock.unlock();
            return new a(abstractC9686l);
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ReentrantLock reentrantLock = this.f98729d;
        reentrantLock.lock();
        try {
            if (this.f98727b) {
                return;
            }
            this.f98727b = true;
            if (this.f98728c != 0) {
                return;
            }
            Unit unit = Unit.f71690a;
            reentrantLock.unlock();
            m();
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void flush() throws IOException {
        if (!this.f98726a) {
            throw new IllegalStateException("file handle is read-only");
        }
        ReentrantLock reentrantLock = this.f98729d;
        reentrantLock.lock();
        try {
            if (this.f98727b) {
                throw new IllegalStateException("closed");
            }
            Unit unit = Unit.f71690a;
            reentrantLock.unlock();
            o();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @NotNull
    public final ReentrantLock k() {
        return this.f98729d;
    }

    protected abstract void m() throws IOException;

    protected abstract void o() throws IOException;

    protected abstract int p(long j11, @NotNull byte[] bArr, int i11, int i12) throws IOException;

    protected abstract long q() throws IOException;

    protected abstract void r(long j11, @NotNull byte[] bArr, int i11, int i12) throws IOException;

    public final long size() throws IOException {
        ReentrantLock reentrantLock = this.f98729d;
        reentrantLock.lock();
        try {
            if (this.f98727b) {
                throw new IllegalStateException("closed");
            }
            Unit unit = Unit.f71690a;
            reentrantLock.unlock();
            return q();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @NotNull
    public final M t(long j11) throws IOException {
        ReentrantLock reentrantLock = this.f98729d;
        reentrantLock.lock();
        try {
            if (this.f98727b) {
                throw new IllegalStateException("closed");
            }
            this.f98728c++;
            reentrantLock.unlock();
            return new b(this, j11);
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }
}
