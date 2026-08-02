package androidx.datastore.preferences.protobuf;

import com.google.android.gms.internal.measurement.j6;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class c1 extends AbstractSet {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1586a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map f1587b;

    public /* synthetic */ c1(Map map, int i5) {
        this.f1586a = i5;
        this.f1587b = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        switch (this.f1586a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                if (contains(entry)) {
                    return false;
                }
                ((z0) this.f1587b).put((Comparable) entry.getKey(), entry.getValue());
                return true;
            case 1:
                Map.Entry entry2 = (Map.Entry) obj;
                if (contains(entry2)) {
                    return false;
                }
                ((j6) this.f1587b).put((Comparable) entry2.getKey(), entry2.getValue());
                return true;
            case 2:
                Map.Entry entry3 = (Map.Entry) obj;
                if (contains(entry3)) {
                    return false;
                }
                ((com.logrocket.protobuf.i1) this.f1587b).put((Comparable) entry3.getKey(), entry3.getValue());
                return true;
            default:
                return super.add(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        switch (this.f1586a) {
            case 0:
                ((z0) this.f1587b).clear();
                break;
            case 1:
                ((j6) this.f1587b).clear();
                break;
            case 2:
                ((com.logrocket.protobuf.i1) this.f1587b).clear();
                break;
            default:
                super.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        switch (this.f1586a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = ((z0) this.f1587b).get(entry.getKey());
                Object value = entry.getValue();
                return obj2 == value || (obj2 != null && obj2.equals(value));
            case 1:
                Map.Entry entry2 = (Map.Entry) obj;
                Object obj3 = ((j6) this.f1587b).get(entry2.getKey());
                Object value2 = entry2.getValue();
                if (obj3 != value2) {
                    return obj3 != null && obj3.equals(value2);
                }
                return true;
            case 2:
                Map.Entry entry3 = (Map.Entry) obj;
                Object obj4 = ((com.logrocket.protobuf.i1) this.f1587b).get(entry3.getKey());
                Object value3 = entry3.getValue();
                return obj4 == value3 || (obj4 != null && obj4.equals(value3));
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        switch (this.f1586a) {
            case 0:
                return new b1((z0) this.f1587b, 0);
            case 1:
                return new b1((j6) this.f1587b);
            case 2:
                return new b1((com.logrocket.protobuf.i1) this.f1587b, 2);
            default:
                return new s.c((s.e) this.f1587b);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        switch (this.f1586a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                if (!contains(entry)) {
                    return false;
                }
                ((z0) this.f1587b).remove(entry.getKey());
                return true;
            case 1:
                Map.Entry entry2 = (Map.Entry) obj;
                if (!contains(entry2)) {
                    return false;
                }
                ((j6) this.f1587b).remove(entry2.getKey());
                return true;
            case 2:
                Map.Entry entry3 = (Map.Entry) obj;
                if (!contains(entry3)) {
                    return false;
                }
                ((com.logrocket.protobuf.i1) this.f1587b).remove(entry3.getKey());
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f1586a) {
            case 0:
                return ((z0) this.f1587b).size();
            case 1:
                return ((j6) this.f1587b).size();
            case 2:
                return ((com.logrocket.protobuf.i1) this.f1587b).size();
            default:
                return ((s.e) this.f1587b).f22575c;
        }
    }
}
