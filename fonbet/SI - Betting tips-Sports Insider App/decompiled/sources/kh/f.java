package kh;

import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.ForwardingSource;
import okio.Source;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class f extends ForwardingSource {

    /* renamed from: a, reason: collision with root package name */
    public final long f19106a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f19107b;

    /* renamed from: c, reason: collision with root package name */
    public long f19108c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f19109d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f19110e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f19111f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ h f19112g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, Source delegate, long j, boolean z5) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f19112g = hVar;
        this.f19106a = j;
        this.f19107b = z5;
        this.f19109d = true;
        if (j == 0) {
            c(null);
        }
    }

    public final IOException c(IOException iOException) {
        if (this.f19110e) {
            return iOException;
        }
        this.f19110e = true;
        h hVar = this.f19112g;
        if (iOException == null && this.f19109d) {
            this.f19109d = false;
            ((gh.r) hVar.f19120c).v((p) hVar.f19119b);
        }
        return h.a(hVar, this.f19108c, this.f19107b, iOException, 8);
    }

    @Override // okio.ForwardingSource, okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f19111f) {
            return;
        }
        this.f19111f = true;
        try {
            super.close();
            c(null);
        } catch (IOException e7) {
            IOException c2 = c(e7);
            Intrinsics.checkNotNull(c2);
            throw c2;
        }
    }

    @Override // okio.ForwardingSource, okio.Source
    public final long read(Buffer sink, long j) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (this.f19111f) {
            throw new IllegalStateException("closed");
        }
        try {
            long read = delegate().read(sink, j);
            boolean z5 = this.f19109d;
            h hVar = this.f19112g;
            if (z5) {
                this.f19109d = false;
                ((gh.r) hVar.f19120c).v((p) hVar.f19119b);
            }
            if (read == -1) {
                c(null);
                return -1L;
            }
            long j6 = this.f19108c + read;
            long j10 = this.f19106a;
            if (j10 == -1 || j6 <= j10) {
                this.f19108c = j6;
                if (((lh.f) hVar.f19122e).b()) {
                    c(null);
                }
                return read;
            }
            throw new ProtocolException("expected " + j10 + " bytes but received " + j6);
        } catch (IOException e7) {
            IOException c2 = c(e7);
            Intrinsics.checkNotNull(c2);
            throw c2;
        }
    }
}
