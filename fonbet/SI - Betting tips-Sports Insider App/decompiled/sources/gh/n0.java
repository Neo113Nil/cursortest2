package gh;

import okio.Socket;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public i0 f10257a;

    /* renamed from: b, reason: collision with root package name */
    public h0 f10258b;

    /* renamed from: d, reason: collision with root package name */
    public String f10260d;

    /* renamed from: e, reason: collision with root package name */
    public u f10261e;

    /* renamed from: h, reason: collision with root package name */
    public Socket f10264h;

    /* renamed from: i, reason: collision with root package name */
    public o0 f10265i;
    public o0 j;

    /* renamed from: k, reason: collision with root package name */
    public o0 f10266k;

    /* renamed from: l, reason: collision with root package name */
    public long f10267l;

    /* renamed from: m, reason: collision with root package name */
    public long f10268m;

    /* renamed from: n, reason: collision with root package name */
    public kh.h f10269n;

    /* renamed from: c, reason: collision with root package name */
    public int f10259c = -1;

    /* renamed from: g, reason: collision with root package name */
    public r0 f10263g = r0.f10297b;

    /* renamed from: o, reason: collision with root package name */
    public u0 f10270o = u0.f10319b;

    /* renamed from: f, reason: collision with root package name */
    public v f10262f = new v();

    public static void b(o0 o0Var, String str) {
        if (o0Var != null) {
            if (o0Var.f10281i != null) {
                throw new IllegalArgumentException(str.concat(".networkResponse != null").toString());
            }
            if (o0Var.j != null) {
                throw new IllegalArgumentException(str.concat(".cacheResponse != null").toString());
            }
            if (o0Var.f10282k != null) {
                throw new IllegalArgumentException(str.concat(".priorResponse != null").toString());
            }
        }
    }

    public final o0 a() {
        int i5 = this.f10259c;
        if (i5 < 0) {
            throw new IllegalStateException(("code < 0: " + this.f10259c).toString());
        }
        i0 i0Var = this.f10257a;
        if (i0Var == null) {
            throw new IllegalStateException("request == null");
        }
        h0 h0Var = this.f10258b;
        if (h0Var == null) {
            throw new IllegalStateException("protocol == null");
        }
        String str = this.f10260d;
        if (str != null) {
            return new o0(i0Var, h0Var, str, i5, this.f10261e, this.f10262f.d(), this.f10263g, this.f10264h, this.f10265i, this.j, this.f10266k, this.f10267l, this.f10268m, this.f10269n, this.f10270o);
        }
        throw new IllegalStateException("message == null");
    }
}
