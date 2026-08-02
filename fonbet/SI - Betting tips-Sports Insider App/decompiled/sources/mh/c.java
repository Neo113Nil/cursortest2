package mh;

import androidx.appcompat.app.v0;
import gh.y;
import hh.g;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.z;
import okio.Buffer;
import okio.BufferedSource;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class c extends a {

    /* renamed from: e, reason: collision with root package name */
    public long f20747e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f20748f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f f20749g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, y url) {
        super(fVar, url);
        Intrinsics.checkNotNullParameter(url, "url");
        this.f20749g = fVar;
        this.f20747e = -1L;
        this.f20748f = true;
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z5;
        if (this.f20742c) {
            return;
        }
        if (this.f20748f) {
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
                this.f20749g.f20755b.e();
                c(f.f20753f);
            }
        }
        this.f20742c = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0076, code lost:
    
        if (r11.f20748f == false) goto L30;
     */
    @Override // mh.a, okio.Source
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long read(Buffer sink, long j) {
        f fVar = this.f20749g;
        v0 v0Var = fVar.f20756c;
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(d9.e.g(j, "byteCount < 0: ").toString());
        }
        if (this.f20742c) {
            throw new IllegalStateException("closed");
        }
        if (this.f20748f) {
            long j6 = this.f20747e;
            if (j6 == 0 || j6 == -1) {
                if (j6 != -1) {
                    ((BufferedSource) v0Var.f365c).readUtf8LineStrict();
                }
                try {
                    this.f20747e = ((BufferedSource) v0Var.f365c).readHexadecimalUnsignedLong();
                    String obj = StringsKt.Z(((BufferedSource) v0Var.f365c).readUtf8LineStrict()).toString();
                    if (this.f20747e < 0 || (obj.length() > 0 && !z.o(obj, ";", false))) {
                        throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f20747e + obj + '\"');
                    }
                    if (this.f20747e == 0) {
                        this.f20748f = false;
                        c(fVar.f20758e.g());
                    }
                } catch (NumberFormatException e7) {
                    throw new ProtocolException(e7.getMessage());
                }
            }
            long read = super.read(sink, Math.min(j, this.f20747e));
            if (read != -1) {
                this.f20747e -= read;
                return read;
            }
            fVar.f20755b.e();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            c(f.f20753f);
            throw protocolException;
        }
        return -1L;
    }
}
