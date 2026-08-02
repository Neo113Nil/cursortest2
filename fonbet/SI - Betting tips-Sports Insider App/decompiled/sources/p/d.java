package p;

import java.util.Iterator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d extends e implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public c f21391a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f21392b = true;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f21393c;

    public d(f fVar) {
        this.f21393c = fVar;
    }

    @Override // p.e
    public final void a(c cVar) {
        c cVar2 = this.f21391a;
        if (cVar == cVar2) {
            c cVar3 = cVar2.f21390d;
            this.f21391a = cVar3;
            this.f21392b = cVar3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f21392b) {
            return this.f21393c.f21394a != null;
        }
        c cVar = this.f21391a;
        return (cVar == null || cVar.f21389c == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f21392b) {
            this.f21392b = false;
            this.f21391a = this.f21393c.f21394a;
        } else {
            c cVar = this.f21391a;
            this.f21391a = cVar != null ? cVar.f21389c : null;
        }
        return this.f21391a;
    }
}
