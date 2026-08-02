package m3;

import e3.i0;
import f3.x;
import java.util.List;
import k2.w;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final w f20360a;

    /* renamed from: b, reason: collision with root package name */
    public final b f20361b;

    /* renamed from: c, reason: collision with root package name */
    public final r f20362c;

    public s(w __db) {
        Intrinsics.checkNotNullParameter(__db, "__db");
        this.f20360a = __db;
        this.f20361b = new b(4);
        this.f20362c = new r();
    }

    public final void a(String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        x.n0(this.f20360a, false, true, new a2.k(id2, 23));
    }

    public final i0 b(String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        return (i0) x.n0(this.f20360a, true, false, new a2.k(id2, 15));
    }

    public final o c(String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        return (o) x.n0(this.f20360a, true, false, new a2.k(id2, 14));
    }

    public final List d(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return (List) x.n0(this.f20360a, true, false, new a2.k(name, 24));
    }

    public final int e(long j, String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        return ((Number) x.n0(this.f20360a, false, true, new p(id2, j, 0))).intValue();
    }

    public final void f(int i5, String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        x.n0(this.f20360a, false, true, new h(id2, i5, 1));
    }

    public final void g(long j, String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        x.n0(this.f20360a, false, true, new p(id2, j, 1));
    }

    public final int h(i0 state, String id2) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(id2, "id");
        return ((Number) x.n0(this.f20360a, false, true, new fg.d(9, state, id2))).intValue();
    }

    public final void i(int i5, String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        x.n0(this.f20360a, false, true, new h(i5, id2, 2));
    }
}
