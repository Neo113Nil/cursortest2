package mh;

import gh.y;
import hh.g;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Headers;
import okio.Buffer;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class d extends a {

    /* renamed from: e, reason: collision with root package name */
    public long f20750e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f f20751f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, y url, long j) {
        super(fVar, url);
        Intrinsics.checkNotNullParameter(url, "url");
        this.f20751f = fVar;
        this.f20750e = j;
        if (j == 0) {
            c(Headers.EMPTY);
        }
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z5;
        if (this.f20742c) {
            return;
        }
        if (this.f20750e != 0) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            TimeZone timeZone = g.f10825a;
            Intrinsics.checkNotNullParameter(this, "<this>");
            Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
            try {
                z5 = g.g(this, 100);
            } catch (IOException unused) {
                z5 = false;
            }
            if (!z5) {
                this.f20751f.f20755b.e();
                c(f.f20753f);
            }
        }
        this.f20742c = true;
    }

    @Override // mh.a, okio.Source
    public final long read(Buffer sink, long j) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(d9.e.g(j, "byteCount < 0: ").toString());
        }
        if (this.f20742c) {
            throw new IllegalStateException("closed");
        }
        long j6 = this.f20750e;
        if (j6 == 0) {
            return -1L;
        }
        long read = super.read(sink, Math.min(j6, j));
        if (read == -1) {
            this.f20751f.f20755b.e();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            c(f.f20753f);
            throw protocolException;
        }
        long j10 = this.f20750e - read;
        this.f20750e = j10;
        if (j10 == 0) {
            c(Headers.EMPTY);
        }
        return read;
    }
}
