package j1;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public int f18215a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final r f18216b;

    /* renamed from: c, reason: collision with root package name */
    public r f18217c;

    /* renamed from: d, reason: collision with root package name */
    public r f18218d;

    /* renamed from: e, reason: collision with root package name */
    public int f18219e;

    /* renamed from: f, reason: collision with root package name */
    public int f18220f;

    public o(r rVar) {
        this.f18216b = rVar;
        this.f18217c = rVar;
    }

    public final void a() {
        this.f18215a = 1;
        this.f18217c = this.f18216b;
        this.f18220f = 0;
    }

    public final boolean b() {
        k1.a b10 = this.f18217c.f18231b.b();
        int a7 = b10.a(6);
        return !(a7 == 0 || ((ByteBuffer) b10.f1362d).get(a7 + b10.f1359a) == 0) || this.f18219e == 65039;
    }
}
