package aa;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class n implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final Iterator f114a;

    /* renamed from: b, reason: collision with root package name */
    public Object f115b = null;

    public n(ArrayList arrayList) {
        this.f114a = arrayList.iterator();
        a();
    }

    public final void a() {
        this.f115b = null;
        while (true) {
            Iterator it = this.f114a;
            if (!it.hasNext() || this.f115b != null) {
                return;
            }
            Object obj = ((WeakReference) it.next()).get();
            this.f115b = obj;
            if (obj == null) {
                it.remove();
            }
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f115b != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj = this.f115b;
        a();
        return obj;
    }
}
