package mh;

import gh.g0;
import gh.o;
import gh.y;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import lh.g;
import okhttp3.Headers;
import okio.Buffer;
import okio.BufferedSource;
import okio.ForwardingTimeout;
import okio.Source;
import okio.Timeout;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public abstract class a implements Source {

    /* renamed from: a, reason: collision with root package name */
    public final y f20740a;

    /* renamed from: b, reason: collision with root package name */
    public final ForwardingTimeout f20741b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f20742c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f20743d;

    public a(f fVar, y url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f20743d = fVar;
        this.f20740a = url;
        this.f20741b = new ForwardingTimeout(((BufferedSource) fVar.f20756c.f365c).getTimeout());
    }

    public final void c(Headers trailers) {
        g0 g0Var;
        o oVar;
        Intrinsics.checkNotNullParameter(trailers, "trailers");
        f fVar = this.f20743d;
        int i5 = fVar.f20757d;
        if (i5 == 6) {
            return;
        }
        if (i5 != 5) {
            throw new IllegalStateException("state: " + fVar.f20757d);
        }
        f.k(fVar, this.f20741b);
        fVar.f20757d = 6;
        if (trailers.size() <= 0 || (g0Var = fVar.f20754a) == null || (oVar = g0Var.j) == null) {
            return;
        }
        g.b(oVar, this.f20740a, trailers);
    }

    @Override // okio.Source
    public long read(Buffer sink, long j) {
        f fVar = this.f20743d;
        Intrinsics.checkNotNullParameter(sink, "sink");
        try {
            return ((BufferedSource) fVar.f20756c.f365c).read(sink, j);
        } catch (IOException e7) {
            fVar.f20755b.e();
            c(f.f20753f);
            throw e7;
        }
    }

    @Override // okio.Source
    /* renamed from: timeout */
    public final Timeout getTimeout() {
        return this.f20741b;
    }
}
