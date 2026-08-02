package ti;

import java.io.OutputStream;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class x implements E {

    /* renamed from: a, reason: collision with root package name */
    public final OutputStream f65893a;

    /* renamed from: b, reason: collision with root package name */
    public final H f65894b;

    public x(OutputStream out, H timeout) {
        Intrinsics.checkNotNullParameter(out, "out");
        Intrinsics.checkNotNullParameter(timeout, "timeout");
        this.f65893a = out;
        this.f65894b = timeout;
    }

    @Override // ti.E, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f65893a.close();
    }

    @Override // ti.E, java.io.Flushable
    public void flush() {
        this.f65893a.flush();
    }

    @Override // ti.E
    public H timeout() {
        return this.f65894b;
    }

    public String toString() {
        return "sink(" + this.f65893a + ')';
    }

    @Override // ti.E
    public void write(C6478h source, long j10) {
        Intrinsics.checkNotNullParameter(source, "source");
        AbstractC6475e.b(source.size(), 0L, j10);
        while (j10 > 0) {
            this.f65894b.throwIfReached();
            C6468B c6468b = source.f65857a;
            Intrinsics.checkNotNull(c6468b);
            int min = (int) Math.min(j10, c6468b.f65836b - c6468b.f65835a);
            this.f65893a.write(c6468b.data, c6468b.f65835a, min);
            c6468b.f65835a += min;
            long j11 = min;
            j10 -= j11;
            source.e2(source.size() - j11);
            if (c6468b.f65835a == c6468b.f65836b) {
                source.f65857a = c6468b.b();
                C6469C.b(c6468b);
            }
        }
    }
}
