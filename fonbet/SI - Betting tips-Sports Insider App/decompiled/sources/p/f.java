package p;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class f implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public c f21394a;

    /* renamed from: b, reason: collision with root package name */
    public c f21395b;

    /* renamed from: c, reason: collision with root package name */
    public final WeakHashMap f21396c = new WeakHashMap();

    /* renamed from: d, reason: collision with root package name */
    public int f21397d = 0;

    public c a(Object obj) {
        c cVar = this.f21394a;
        while (cVar != null && !cVar.f21387a.equals(obj)) {
            cVar = cVar.f21389c;
        }
        return cVar;
    }

    public Object b(Object obj) {
        c a7 = a(obj);
        if (a7 == null) {
            return null;
        }
        this.f21397d--;
        WeakHashMap weakHashMap = this.f21396c;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((e) it.next()).a(a7);
            }
        }
        c cVar = a7.f21390d;
        if (cVar != null) {
            cVar.f21389c = a7.f21389c;
        } else {
            this.f21394a = a7.f21389c;
        }
        c cVar2 = a7.f21389c;
        if (cVar2 != null) {
            cVar2.f21390d = cVar;
        } else {
            this.f21395b = cVar;
        }
        a7.f21389c = null;
        a7.f21390d = null;
        return a7.f21388b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (((p.b) r7).hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0052, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0053, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f21397d != fVar.f21397d) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = fVar.iterator();
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                break;
            }
            b bVar2 = (b) it2;
            if (!bVar2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) bVar.next();
            Object next = bVar2.next();
            if ((entry != null || next == null) && (entry == null || entry.equals(next))) {
            }
        }
        return false;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i5 = 0;
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                return i5;
            }
            i5 += ((Map.Entry) bVar.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        b bVar = new b(this.f21394a, this.f21395b, 0);
        this.f21396c.put(bVar, Boolean.FALSE);
        return bVar;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                sb2.append("]");
                return sb2.toString();
            }
            sb2.append(((Map.Entry) bVar.next()).toString());
            if (bVar.hasNext()) {
                sb2.append(", ");
            }
        }
    }
}
