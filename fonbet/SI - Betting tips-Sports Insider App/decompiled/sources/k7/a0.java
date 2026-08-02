package k7;

import java.util.Iterator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a0 extends o {

    /* renamed from: d, reason: collision with root package name */
    public final transient Object f18846d;

    public a0(Object obj) {
        this.f18846d = obj;
    }

    @Override // k7.h
    public final int a(Object[] objArr) {
        objArr[0] = this.f18846d;
        return 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f18846d.equals(obj);
    }

    @Override // k7.h
    public final c0 d() {
        return new t(this.f18846d);
    }

    @Override // k7.o
    public final m h() {
        Object[] objArr = {this.f18846d};
        for (int i5 = 0; i5 < 1; i5++) {
            i iVar = m.f18895b;
            if (objArr[i5] == null) {
                throw new NullPointerException(androidx.appcompat.widget.c1.i(i5, "at index "));
            }
        }
        return m.h(1, objArr);
    }

    @Override // k7.o, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f18846d.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new t(this.f18846d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return androidx.appcompat.widget.c1.n("[", this.f18846d.toString(), "]");
    }
}
