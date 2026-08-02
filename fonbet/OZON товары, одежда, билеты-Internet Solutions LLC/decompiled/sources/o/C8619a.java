package o;

import androidx.annotation.NonNull;
import androidx.lifecycle.I;
import java.util.HashMap;
import java.util.Map;
import o.C8620b;

/* renamed from: o.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8619a<K, V> extends C8620b<K, V> {

    /* renamed from: e, reason: collision with root package name */
    private final HashMap<K, C8620b.c<K, V>> f77436e = new HashMap<>();

    @Override // o.C8620b
    protected final C8620b.c<K, V> b(K k11) {
        return this.f77436e.get(k11);
    }

    @Override // o.C8620b
    public final V g(@NonNull K k11, @NonNull V v11) {
        C8620b.c<K, V> b11 = b(k11);
        if (b11 != null) {
            return b11.f77442b;
        }
        this.f77436e.put(k11, f(k11, v11));
        return null;
    }

    @Override // o.C8620b
    public final V h(@NonNull K k11) {
        V v11 = (V) super.h(k11);
        this.f77436e.remove(k11);
        return v11;
    }

    public final Map.Entry i(I i11) {
        HashMap<K, C8620b.c<K, V>> hashMap = this.f77436e;
        if (hashMap.containsKey(i11)) {
            return hashMap.get(i11).f77444d;
        }
        return null;
    }

    public final boolean k(I i11) {
        return this.f77436e.containsKey(i11);
    }
}
