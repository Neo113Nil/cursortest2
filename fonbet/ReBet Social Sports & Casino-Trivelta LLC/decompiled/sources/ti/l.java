package ti;

import java.io.IOException;
import java.util.zip.Deflater;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l implements E {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC6479i f65871a;

    /* renamed from: b, reason: collision with root package name */
    public final Deflater f65872b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f65873c;

    public l(InterfaceC6479i sink, Deflater deflater) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(deflater, "deflater");
        this.f65871a = sink;
        this.f65872b = deflater;
    }

    @Override // ti.E, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f65873c) {
            return;
        }
        try {
            k();
            th = null;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.f65872b.end();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        try {
            this.f65871a.close();
        } catch (Throwable th4) {
            if (th == null) {
                th = th4;
            }
        }
        this.f65873c = true;
        if (th != null) {
            throw th;
        }
    }

    public final void d(boolean z10) {
        C6468B h22;
        int deflate;
        C6478h h10 = this.f65871a.h();
        while (true) {
            h22 = h10.h2(1);
            if (z10) {
                try {
                    Deflater deflater = this.f65872b;
                    byte[] bArr = h22.data;
                    int i10 = h22.f65836b;
                    deflate = deflater.deflate(bArr, i10, 8192 - i10, 2);
                } catch (NullPointerException e10) {
                    throw new IOException("Deflater already closed", e10);
                }
            } else {
                Deflater deflater2 = this.f65872b;
                byte[] bArr2 = h22.data;
                int i11 = h22.f65836b;
                deflate = deflater2.deflate(bArr2, i11, 8192 - i11);
            }
            if (deflate > 0) {
                h22.f65836b += deflate;
                h10.e2(h10.size() + deflate);
                this.f65871a.W();
            } else if (this.f65872b.needsInput()) {
                break;
            }
        }
        if (h22.f65835a == h22.f65836b) {
            h10.f65857a = h22.b();
            C6469C.b(h22);
        }
    }

    @Override // ti.E, java.io.Flushable
    public void flush() {
        d(true);
        this.f65871a.flush();
    }

    public final void k() {
        this.f65872b.finish();
        d(false);
    }

    @Override // ti.E
    public H timeout() {
        return this.f65871a.timeout();
    }

    public String toString() {
        return "DeflaterSink(" + this.f65871a + ')';
    }

    @Override // ti.E
    public void write(C6478h source, long j10) {
        Intrinsics.checkNotNullParameter(source, "source");
        AbstractC6475e.b(source.size(), 0L, j10);
        while (j10 > 0) {
            C6468B c6468b = source.f65857a;
            Intrinsics.checkNotNull(c6468b);
            int min = (int) Math.min(j10, c6468b.f65836b - c6468b.f65835a);
            this.f65872b.setInput(c6468b.data, c6468b.f65835a, min);
            d(false);
            long j11 = min;
            source.e2(source.size() - j11);
            int i10 = c6468b.f65835a + min;
            c6468b.f65835a = i10;
            if (i10 == c6468b.f65836b) {
                source.f65857a = c6468b.b();
                C6469C.b(c6468b);
            }
            j10 -= j11;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l(E sink, Deflater deflater) {
        this(t.c(sink), deflater);
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(deflater, "deflater");
    }
}
