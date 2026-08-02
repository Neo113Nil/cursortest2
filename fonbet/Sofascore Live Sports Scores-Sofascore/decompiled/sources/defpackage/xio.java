package defpackage;

import com.google.android.gms.internal.ads.zzaww;
import com.google.android.gms.internal.ads.zzgzg;
import java.io.Serializable;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class xio extends zzgzg implements Serializable {
    public final zzaww a;

    public xio(zzaww zzawwVar) {
        this.a = zzawwVar;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Iterator it = ((Iterable) obj).iterator();
        Iterator it2 = ((Iterable) obj2).iterator();
        while (it.hasNext()) {
            if (!it2.hasNext()) {
                return 1;
            }
            int compare = this.a.compare(it.next(), it2.next());
            if (compare != 0) {
                return compare;
            }
        }
        return it2.hasNext() ? -1 : 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xio) {
            return this.a.equals(((xio) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 2075626741;
    }

    public final String toString() {
        return this.a.toString().concat(".lexicographical()");
    }
}
