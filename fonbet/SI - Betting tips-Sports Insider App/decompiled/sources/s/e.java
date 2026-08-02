package s;

import androidx.datastore.preferences.protobuf.c1;
import j$.util.Map;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e extends n implements Map, j$.util.Map {

    /* renamed from: d, reason: collision with root package name */
    public c1 f22550d;

    /* renamed from: e, reason: collision with root package name */
    public b f22551e;

    /* renamed from: f, reason: collision with root package name */
    public d f22552f;

    public e() {
        super(0);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        c1 c1Var = this.f22550d;
        if (c1Var != null) {
            return c1Var;
        }
        c1 c1Var2 = new c1(this, 3);
        this.f22550d = c1Var2;
        return c1Var2;
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    public final boolean k(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Map
    public final Set keySet() {
        b bVar = this.f22551e;
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b(this);
        this.f22551e = bVar2;
        return bVar2;
    }

    public final boolean l(Collection collection) {
        int i5 = this.f22575c;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i5 != this.f22575c;
    }

    public final boolean m(Collection collection) {
        int i5 = this.f22575c;
        for (int i10 = i5 - 1; i10 >= 0; i10--) {
            if (!collection.contains(g(i10))) {
                h(i10);
            }
        }
        return i5 != this.f22575c;
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map map) {
        c(map.size() + this.f22575c);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map
    public final Collection values() {
        d dVar = this.f22552f;
        if (dVar != null) {
            return dVar;
        }
        d dVar2 = new d(this);
        this.f22552f = dVar2;
        return dVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(n map) {
        super(0);
        Intrinsics.checkNotNullParameter(map, "map");
        int i5 = map.f22575c;
        c(this.f22575c + i5);
        if (this.f22575c != 0) {
            for (int i10 = 0; i10 < i5; i10++) {
                put(map.g(i10), map.j(i10));
            }
        } else if (i5 > 0) {
            kotlin.collections.o.e(0, 0, map.f22573a, this.f22573a, i5);
            kotlin.collections.o.d(0, 0, i5 << 1, map.f22574b, this.f22574b);
            this.f22575c = i5;
        }
    }
}
