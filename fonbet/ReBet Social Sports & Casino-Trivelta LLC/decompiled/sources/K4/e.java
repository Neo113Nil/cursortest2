package K4;

import com.bumptech.glide.load.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final List f6238a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final Map f6239b = new HashMap();

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final Class f6240a;

        /* renamed from: b, reason: collision with root package name */
        public final Class f6241b;

        /* renamed from: c, reason: collision with root package name */
        public final l f6242c;

        public a(Class cls, Class cls2, l lVar) {
            this.f6240a = cls;
            this.f6241b = cls2;
            this.f6242c = lVar;
        }

        public boolean a(Class cls, Class cls2) {
            return this.f6240a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f6241b);
        }
    }

    public synchronized void a(String str, l lVar, Class cls, Class cls2) {
        c(str).add(new a(cls, cls2, lVar));
    }

    public synchronized List b(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f6238a.iterator();
        while (it.hasNext()) {
            List<a> list = (List) this.f6239b.get((String) it.next());
            if (list != null) {
                for (a aVar : list) {
                    if (aVar.a(cls, cls2)) {
                        arrayList.add(aVar.f6242c);
                    }
                }
            }
        }
        return arrayList;
    }

    public final synchronized List c(String str) {
        List list;
        try {
            if (!this.f6238a.contains(str)) {
                this.f6238a.add(str);
            }
            list = (List) this.f6239b.get(str);
            if (list == null) {
                list = new ArrayList();
                this.f6239b.put(str, list);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return list;
    }

    public synchronized List d(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f6238a.iterator();
        while (it.hasNext()) {
            List<a> list = (List) this.f6239b.get((String) it.next());
            if (list != null) {
                for (a aVar : list) {
                    if (aVar.a(cls, cls2) && !arrayList.contains(aVar.f6241b)) {
                        arrayList.add(aVar.f6241b);
                    }
                }
            }
        }
        return arrayList;
    }

    public synchronized void e(List list) {
        try {
            ArrayList<String> arrayList = new ArrayList(this.f6238a);
            this.f6238a.clear();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f6238a.add((String) it.next());
            }
            for (String str : arrayList) {
                if (!list.contains(str)) {
                    this.f6238a.add(str);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
