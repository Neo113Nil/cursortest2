package gh;

import java.io.Closeable;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Headers;
import okio.Socket;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class o0 implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f10273a;

    /* renamed from: b, reason: collision with root package name */
    public final h0 f10274b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10275c;

    /* renamed from: d, reason: collision with root package name */
    public final int f10276d;

    /* renamed from: e, reason: collision with root package name */
    public final u f10277e;

    /* renamed from: f, reason: collision with root package name */
    public final Headers f10278f;

    /* renamed from: g, reason: collision with root package name */
    public final r0 f10279g;

    /* renamed from: h, reason: collision with root package name */
    public final Socket f10280h;

    /* renamed from: i, reason: collision with root package name */
    public final o0 f10281i;
    public final o0 j;

    /* renamed from: k, reason: collision with root package name */
    public final o0 f10282k;

    /* renamed from: l, reason: collision with root package name */
    public final long f10283l;

    /* renamed from: m, reason: collision with root package name */
    public final long f10284m;

    /* renamed from: n, reason: collision with root package name */
    public final kh.h f10285n;

    /* renamed from: o, reason: collision with root package name */
    public final u0 f10286o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f10287p;

    public o0(i0 request, h0 protocol, String message, int i5, u uVar, Headers headers, r0 body, Socket socket, o0 o0Var, o0 o0Var2, o0 o0Var3, long j, long j6, kh.h hVar, u0 trailersSource) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(trailersSource, "trailersSource");
        this.f10273a = request;
        this.f10274b = protocol;
        this.f10275c = message;
        this.f10276d = i5;
        this.f10277e = uVar;
        this.f10278f = headers;
        this.f10279g = body;
        this.f10280h = socket;
        this.f10281i = o0Var;
        this.j = o0Var2;
        this.f10282k = o0Var3;
        this.f10283l = j;
        this.f10284m = j6;
        this.f10285n = hVar;
        this.f10286o = trailersSource;
        boolean z5 = false;
        if (200 <= i5 && i5 < 300) {
            z5 = true;
        }
        this.f10287p = z5;
    }

    public static String c(o0 o0Var, String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        String str = o0Var.f10278f.get(name);
        if (str == null) {
            return null;
        }
        return str;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f10279g.close();
    }

    public final n0 k() {
        Intrinsics.checkNotNullParameter(this, "response");
        n0 n0Var = new n0();
        n0Var.f10259c = -1;
        n0Var.f10263g = r0.f10297b;
        n0Var.f10270o = u0.f10319b;
        n0Var.f10257a = this.f10273a;
        n0Var.f10258b = this.f10274b;
        n0Var.f10259c = this.f10276d;
        n0Var.f10260d = this.f10275c;
        n0Var.f10261e = this.f10277e;
        n0Var.f10262f = this.f10278f.newBuilder();
        n0Var.f10263g = this.f10279g;
        n0Var.f10264h = this.f10280h;
        n0Var.f10265i = this.f10281i;
        n0Var.j = this.j;
        n0Var.f10266k = this.f10282k;
        n0Var.f10267l = this.f10283l;
        n0Var.f10268m = this.f10284m;
        n0Var.f10269n = this.f10285n;
        n0Var.f10270o = this.f10286o;
        return n0Var;
    }

    public final String toString() {
        return "Response{protocol=" + this.f10274b + ", code=" + this.f10276d + ", message=" + this.f10275c + ", url=" + this.f10273a.f10206a + '}';
    }
}
