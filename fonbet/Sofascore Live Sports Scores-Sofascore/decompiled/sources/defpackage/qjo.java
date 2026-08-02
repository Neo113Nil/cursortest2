package defpackage;

import com.google.android.gms.internal.ads.zzgzv;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class qjo extends zzgzv {
    public final /* synthetic */ Set a;
    public final /* synthetic */ Set b;

    public qjo(Set set, Set set2) {
        this.a = set;
        this.b = set2;
    }

    @Override // com.google.android.gms.internal.ads.zzgzv, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: c */
    public final tio iterator() {
        return new tio(this, this.a, this.b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.a.contains(obj) && this.b.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.a.containsAll(collection) && this.b.containsAll(collection);
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    public final int d() {
        Set set = this.a;
        int d = set instanceof zzgzv ? ((zzgzv) set).d() : set.size();
        Set set2 = this.b;
        return Math.min(d, set2 instanceof zzgzv ? ((zzgzv) set2).d() : set2.size());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return Collections.disjoint(this.b, this.a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator it = this.a.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (this.b.contains(it.next())) {
                i++;
            }
        }
        return i;
    }
}
