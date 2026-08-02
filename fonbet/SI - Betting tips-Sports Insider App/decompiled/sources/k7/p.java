package k7;

import java.util.AbstractMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class p extends m {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f18904c;

    public p(q qVar) {
        this.f18904c = qVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i5) {
        q qVar = this.f18904c;
        return new AbstractMap.SimpleImmutableEntry(qVar.f18906d.f18910c.f18939f.get(i5), qVar.f18906d.f18911d.get(i5));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f18904c.f18906d.f18911d.size();
    }
}
