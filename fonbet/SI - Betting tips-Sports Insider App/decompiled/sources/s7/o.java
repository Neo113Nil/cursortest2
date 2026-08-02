package s7;

import com.google.android.gms.measurement.internal.zzbe;
import java.util.Iterator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class o implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final Iterator f22919a;

    public o(zzbe zzbeVar) {
        this.f22919a = zzbeVar.f5796a.keySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f22919a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return (String) this.f22919a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
