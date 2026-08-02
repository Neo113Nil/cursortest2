package E;

import java.util.Iterator;
import java.util.Map;
import kotlin.collections.AbstractSet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d extends AbstractSet implements D.b {

    /* renamed from: a, reason: collision with root package name */
    public final b f2911a;

    public d(b bVar) {
        this.f2911a = bVar;
    }

    public boolean b(Map.Entry entry) {
        if (entry == null) {
            return false;
        }
        Object obj = this.f2911a.get(entry.getKey());
        return obj != null ? Intrinsics.areEqual(obj, entry.getValue()) : entry.getValue() == null && this.f2911a.containsKey(entry.getKey());
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return b((Map.Entry) obj);
        }
        return false;
    }

    @Override // kotlin.collections.AbstractCollection
    /* renamed from: getSize */
    public int get_size() {
        return this.f2911a.size();
    }

    @Override // kotlin.collections.AbstractSet, kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new e(this.f2911a.d());
    }
}
