package p6;

import androidx.collection.C5132a;

/* renamed from: p6.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8862b<K, V> extends C5132a<K, V> {

    /* renamed from: g, reason: collision with root package name */
    private int f80258g;

    @Override // androidx.collection.Z, java.util.Map
    public final void clear() {
        this.f80258g = 0;
        super.clear();
    }

    @Override // androidx.collection.Z, java.util.Map
    public final int hashCode() {
        if (this.f80258g == 0) {
            this.f80258g = super.hashCode();
        }
        return this.f80258g;
    }

    @Override // androidx.collection.Z
    public final void k(C5132a c5132a) {
        this.f80258g = 0;
        super.k(c5132a);
    }

    @Override // androidx.collection.Z
    public final V l(int i11) {
        this.f80258g = 0;
        return (V) super.l(i11);
    }

    @Override // androidx.collection.Z
    public final V m(int i11, V v11) {
        this.f80258g = 0;
        return (V) super.m(i11, v11);
    }

    @Override // androidx.collection.Z, java.util.Map
    public final V put(K k11, V v11) {
        this.f80258g = 0;
        return (V) super.put(k11, v11);
    }
}
