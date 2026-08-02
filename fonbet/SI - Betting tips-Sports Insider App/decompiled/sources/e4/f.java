package e4;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.BufferedSink;
import okio.ForwardingTimeout;
import okio.Sink;
import okio.Timeout;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f implements Sink {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8607a = 1;

    /* renamed from: b, reason: collision with root package name */
    public boolean f8608b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f8609c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f8610d;

    public f(Sink sink, a2.f fVar) {
        this.f8609c = sink;
        this.f8610d = fVar;
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f8607a) {
            case 0:
                try {
                    ((Sink) this.f8609c).close();
                    break;
                } catch (IOException e7) {
                    this.f8608b = true;
                    ((a2.f) this.f8610d).invoke(e7);
                    return;
                }
            default:
                mh.f fVar = (mh.f) this.f8610d;
                if (!this.f8608b) {
                    this.f8608b = true;
                    mh.f.k(fVar, (ForwardingTimeout) this.f8609c);
                    fVar.f20757d = 3;
                    break;
                }
                break;
        }
    }

    @Override // okio.Sink, java.io.Flushable
    public final void flush() {
        switch (this.f8607a) {
            case 0:
                try {
                    ((Sink) this.f8609c).flush();
                    break;
                } catch (IOException e7) {
                    this.f8608b = true;
                    ((a2.f) this.f8610d).invoke(e7);
                    return;
                }
            default:
                if (!this.f8608b) {
                    ((BufferedSink) ((mh.f) this.f8610d).f20756c.f366d).flush();
                    break;
                }
                break;
        }
    }

    @Override // okio.Sink
    /* renamed from: timeout */
    public final Timeout getTimeout() {
        switch (this.f8607a) {
            case 0:
                return ((Sink) this.f8609c).getTimeout();
            default:
                return (ForwardingTimeout) this.f8609c;
        }
    }

    @Override // okio.Sink
    public final void write(Buffer source, long j) {
        switch (this.f8607a) {
            case 0:
                if (this.f8608b) {
                    source.skip(j);
                    return;
                }
                try {
                    ((Sink) this.f8609c).write(source, j);
                    return;
                } catch (IOException e7) {
                    this.f8608b = true;
                    ((a2.f) this.f8610d).invoke(e7);
                    return;
                }
            default:
                Intrinsics.checkNotNullParameter(source, "source");
                if (this.f8608b) {
                    throw new IllegalStateException("closed");
                }
                hh.e.a(source.size(), 0L, j);
                ((BufferedSink) ((mh.f) this.f8610d).f20756c.f366d).write(source, j);
                return;
        }
    }

    public f(mh.f fVar) {
        this.f8610d = fVar;
        this.f8609c = new ForwardingTimeout(((BufferedSink) fVar.f20756c.f366d).getTimeout());
    }
}
