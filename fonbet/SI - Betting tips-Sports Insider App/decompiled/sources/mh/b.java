package mh;

import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.BufferedSink;
import okio.ForwardingTimeout;
import okio.Sink;
import okio.Timeout;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class b implements Sink {

    /* renamed from: a, reason: collision with root package name */
    public final ForwardingTimeout f20744a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f20745b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f20746c;

    public b(f fVar) {
        this.f20746c = fVar;
        this.f20744a = new ForwardingTimeout(((BufferedSink) fVar.f20756c.f366d).getTimeout());
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f20745b) {
            return;
        }
        this.f20745b = true;
        ((BufferedSink) this.f20746c.f20756c.f366d).writeUtf8("0\r\n\r\n");
        f.k(this.f20746c, this.f20744a);
        this.f20746c.f20757d = 3;
    }

    @Override // okio.Sink, java.io.Flushable
    public final synchronized void flush() {
        if (this.f20745b) {
            return;
        }
        ((BufferedSink) this.f20746c.f20756c.f366d).flush();
    }

    @Override // okio.Sink
    /* renamed from: timeout */
    public final Timeout getTimeout() {
        return this.f20744a;
    }

    @Override // okio.Sink
    public final void write(Buffer source, long j) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (this.f20745b) {
            throw new IllegalStateException("closed");
        }
        if (j == 0) {
            return;
        }
        BufferedSink bufferedSink = (BufferedSink) this.f20746c.f20756c.f366d;
        bufferedSink.writeHexadecimalUnsignedLong(j);
        bufferedSink.writeUtf8("\r\n");
        bufferedSink.write(source, j);
        bufferedSink.writeUtf8("\r\n");
    }
}
