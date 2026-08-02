package kh;

import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.ForwardingSink;
import okio.Sink;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class e extends ForwardingSink {

    /* renamed from: a, reason: collision with root package name */
    public final long f19099a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f19100b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f19101c;

    /* renamed from: d, reason: collision with root package name */
    public long f19102d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f19103e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f19104f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ h f19105g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h hVar, Sink delegate, long j, boolean z5) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f19105g = hVar;
        this.f19099a = j;
        this.f19100b = z5;
        this.f19103e = z5;
    }

    public final IOException c(IOException iOException) {
        if (this.f19101c) {
            return iOException;
        }
        this.f19101c = true;
        return h.a(this.f19105g, this.f19102d, this.f19100b, iOException, 4);
    }

    @Override // okio.ForwardingSink, okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f19104f) {
            return;
        }
        this.f19104f = true;
        long j = this.f19099a;
        if (j != -1 && this.f19102d != j) {
            throw new ProtocolException("unexpected end of stream");
        }
        try {
            super.close();
            c(null);
        } catch (IOException e7) {
            IOException c2 = c(e7);
            Intrinsics.checkNotNull(c2);
            throw c2;
        }
    }

    @Override // okio.ForwardingSink, okio.Sink, java.io.Flushable
    public final void flush() {
        try {
            super.flush();
        } catch (IOException e7) {
            IOException c2 = c(e7);
            Intrinsics.checkNotNull(c2);
            throw c2;
        }
    }

    @Override // okio.ForwardingSink, okio.Sink
    public final void write(Buffer source, long j) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (this.f19104f) {
            throw new IllegalStateException("closed");
        }
        long j6 = this.f19099a;
        if (j6 != -1 && this.f19102d + j > j6) {
            StringBuilder p10 = r4.k.p(j6, "expected ", " bytes but received ");
            p10.append(this.f19102d + j);
            throw new ProtocolException(p10.toString());
        }
        try {
            if (this.f19103e) {
                this.f19103e = false;
                h hVar = this.f19105g;
                ((gh.r) hVar.f19120c).q((p) hVar.f19119b);
            }
            super.write(source, j);
            this.f19102d += j;
        } catch (IOException e7) {
            IOException c2 = c(e7);
            Intrinsics.checkNotNull(c2);
            throw c2;
        }
    }
}
