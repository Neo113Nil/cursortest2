package A7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public final D f235a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f236b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public int f237c = 0;

    public m(D d10) {
        this.f235a = d10;
    }

    public synchronized boolean a(Object obj) {
        return this.f236b.containsKey(obj);
    }

    public synchronized Object b(Object obj) {
        return this.f236b.get(obj);
    }

    public synchronized int c() {
        return this.f236b.size();
    }

    public synchronized Object d() {
        return this.f236b.isEmpty() ? null : this.f236b.keySet().iterator().next();
    }

    public synchronized ArrayList e(D6.l lVar) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList(this.f236b.entrySet().size());
            for (Map.Entry entry : this.f236b.entrySet()) {
                if (lVar != null && !lVar.apply(entry.getKey())) {
                }
                arrayList.add(entry);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return arrayList;
    }

    public synchronized int f() {
        return this.f237c;
    }

    public final int g(Object obj) {
        if (obj == null) {
            return 0;
        }
        return this.f235a.a(obj);
    }

    public synchronized Object h(Object obj, Object obj2) {
        Object remove;
        remove = this.f236b.remove(obj);
        this.f237c -= g(remove);
        this.f236b.put(obj, obj2);
        this.f237c += g(obj2);
        return remove;
    }

    public synchronized Object i(Object obj) {
        Object remove;
        remove = this.f236b.remove(obj);
        this.f237c -= g(remove);
        return remove;
    }

    public synchronized ArrayList j(D6.l lVar) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            Iterator it = this.f236b.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (lVar != null && !lVar.apply(entry.getKey())) {
                }
                arrayList.add(entry.getValue());
                this.f237c -= g(entry.getValue());
                it.remove();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return arrayList;
    }

    public synchronized void k() {
        if (this.f236b.isEmpty()) {
            this.f237c = 0;
        }
    }
}
