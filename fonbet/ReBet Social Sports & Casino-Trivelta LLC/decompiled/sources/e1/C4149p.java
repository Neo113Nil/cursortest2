package e1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: e1.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4149p implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public final Object f45544a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final Map f45545b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public Set f45546c = Collections.EMPTY_SET;

    /* renamed from: d, reason: collision with root package name */
    public List f45547d = Collections.EMPTY_LIST;

    public Set J() {
        Set set;
        synchronized (this.f45544a) {
            set = this.f45546c;
        }
        return set;
    }

    public void a(Object obj) {
        synchronized (this.f45544a) {
            try {
                ArrayList arrayList = new ArrayList(this.f45547d);
                arrayList.add(obj);
                this.f45547d = Collections.unmodifiableList(arrayList);
                Integer num = (Integer) this.f45545b.get(obj);
                if (num == null) {
                    HashSet hashSet = new HashSet(this.f45546c);
                    hashSet.add(obj);
                    this.f45546c = Collections.unmodifiableSet(hashSet);
                }
                this.f45545b.put(obj, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int b(Object obj) {
        int intValue;
        synchronized (this.f45544a) {
            try {
                intValue = this.f45545b.containsKey(obj) ? ((Integer) this.f45545b.get(obj)).intValue() : 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return intValue;
    }

    public void c(Object obj) {
        synchronized (this.f45544a) {
            try {
                Integer num = (Integer) this.f45545b.get(obj);
                if (num == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList(this.f45547d);
                arrayList.remove(obj);
                this.f45547d = Collections.unmodifiableList(arrayList);
                if (num.intValue() == 1) {
                    this.f45545b.remove(obj);
                    HashSet hashSet = new HashSet(this.f45546c);
                    hashSet.remove(obj);
                    this.f45546c = Collections.unmodifiableSet(hashSet);
                } else {
                    this.f45545b.put(obj, Integer.valueOf(num.intValue() - 1));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        Iterator it;
        synchronized (this.f45544a) {
            it = this.f45547d.iterator();
        }
        return it;
    }
}
