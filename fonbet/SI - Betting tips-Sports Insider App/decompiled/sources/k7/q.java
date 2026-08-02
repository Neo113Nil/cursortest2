package k7;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class q extends o {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r f18906d;

    public q(r rVar) {
        this.f18906d = rVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f18906d.get(entry.getKey());
            if (obj2 != null && obj2.equals(entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // k7.h
    public final c0 d() {
        return h().listIterator(0);
    }

    @Override // k7.o, java.util.Collection, java.util.Set
    public final int hashCode() {
        return a.b(this.f18906d.entrySet());
    }

    @Override // k7.o
    public final m i() {
        return new p(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return h().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f18906d.f18911d.size();
    }
}
