package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class fp3 {
    public final ArrayList a;
    public final HashMap b;

    public fp3(int i) {
        switch (i) {
            case 1:
                this.a = new ArrayList();
                this.b = new HashMap();
                break;
            default:
                this.b = new HashMap();
                this.a = new ArrayList();
                break;
        }
    }

    public void a(Object obj, String str) {
        obj.getClass();
        this.b.put(str, obj);
        this.a.remove(str);
    }

    public synchronized List b(String str) {
        List list;
        try {
            if (!this.a.contains(str)) {
                this.a.add(str);
            }
            list = (List) this.b.get(str);
            if (list == null) {
                list = new ArrayList();
                this.b.put(str, list);
            }
        } catch (Throwable th) {
            throw th;
        }
        return list;
    }

    public synchronized ArrayList c(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            List<k1g> list = (List) this.b.get((String) it.next());
            if (list != null) {
                for (k1g k1gVar : list) {
                    if ((k1gVar.a.isAssignableFrom(cls) && cls2.isAssignableFrom(k1gVar.b)) && !arrayList.contains(k1gVar.b)) {
                        arrayList.add(k1gVar.b);
                    }
                }
            }
        }
        return arrayList;
    }
}
