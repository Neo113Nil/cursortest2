package ti;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r implements G {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC6480j f65885a;

    /* renamed from: b, reason: collision with root package name */
    public final Inflater f65886b;

    /* renamed from: c, reason: collision with root package name */
    public int f65887c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f65888d;

    public r(InterfaceC6480j source, Inflater inflater) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this.f65885a = source;
        this.f65886b = inflater;
    }

    @Override // ti.G, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f65888d) {
            return;
        }
        this.f65886b.end();
        this.f65888d = true;
        this.f65885a.close();
    }

    public final long d(C6478h sink, long j10) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (this.f65888d) {
            throw new IllegalStateException("closed");
        }
        if (j10 == 0) {
            return 0L;
        }
        try {
            C6468B h22 = sink.h2(1);
            int min = (int) Math.min(j10, 8192 - h22.f65836b);
            k();
            int inflate = this.f65886b.inflate(h22.data, h22.f65836b, min);
            r();
            if (inflate > 0) {
                h22.f65836b += inflate;
                long j11 = inflate;
                sink.e2(sink.size() + j11);
                return j11;
            }
            if (h22.f65835a == h22.f65836b) {
                sink.f65857a = h22.b();
                C6469C.b(h22);
            }
            return 0L;
        } catch (DataFormatException e10) {
            throw new IOException(e10);
        }
    }

    public final boolean k() {
        if (!this.f65886b.needsInput()) {
            return false;
        }
        if (this.f65885a.X0()) {
            return true;
        }
        C6468B c6468b = this.f65885a.h().f65857a;
        Intrinsics.checkNotNull(c6468b);
        int i10 = c6468b.f65836b;
        int i11 = c6468b.f65835a;
        int i12 = i10 - i11;
        this.f65887c = i12;
        this.f65886b.setInput(c6468b.data, i11, i12);
        return false;
    }

    public final void r() {
        int i10 = this.f65887c;
        if (i10 == 0) {
            return;
        }
        int remaining = i10 - this.f65886b.getRemaining();
        this.f65887c -= remaining;
        this.f65885a.skip(remaining);
    }

    @Override // ti.G
    public long read(C6478h sink, long j10) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        do {
            long d10 = d(sink, j10);
            if (d10 > 0) {
                return d10;
            }
            if (this.f65886b.finished() || this.f65886b.needsDictionary()) {
                return -1L;
            }
        } while (!this.f65885a.X0());
        throw new EOFException("source exhausted prematurely");
    }

    @Override // ti.G
    public H timeout() {
        return this.f65885a.timeout();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public r(G source, Inflater inflater) {
        this(t.d(source), inflater);
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
    }
}
