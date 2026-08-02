package pa;

import hb.i;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c implements y3.a {

    /* renamed from: a, reason: collision with root package name */
    public final int f21573a;

    /* renamed from: b, reason: collision with root package name */
    public final int f21574b;

    /* renamed from: c, reason: collision with root package name */
    public final int f21575c;

    public c(i iVar) {
        this.f21573a = iVar.f10485b;
        this.f21574b = iVar.f10486c;
        this.f21575c = iVar.f10487d;
    }

    @Override // y3.a
    public final int getCreatedAt() {
        return this.f21575c;
    }

    @Override // y3.a
    public final int getId() {
        return this.f21573a;
    }

    @Override // y3.a
    public final int getType() {
        return this.f21574b;
    }
}
