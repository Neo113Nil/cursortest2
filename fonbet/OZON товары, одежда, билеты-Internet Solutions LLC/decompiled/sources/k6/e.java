package k6;

import T5.k;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f70924a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final HashMap f70925b = new HashMap();

    private static class a<T, R> {

        /* renamed from: a, reason: collision with root package name */
        private final Class<T> f70926a;

        /* renamed from: b, reason: collision with root package name */
        final Class<R> f70927b;

        /* renamed from: c, reason: collision with root package name */
        final k<T, R> f70928c;

        public a(@NonNull Class<T> cls, @NonNull Class<R> cls2, k<T, R> kVar) {
            this.f70926a = cls;
            this.f70927b = cls2;
            this.f70928c = kVar;
        }

        public final boolean a(@NonNull Class<?> cls, @NonNull Class<?> cls2) {
            return this.f70926a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f70927b);
        }
    }

    @NonNull
    private synchronized List<a<?, ?>> c(@NonNull String str) {
        List<a<?, ?>> list;
        try {
            if (!this.f70924a.contains(str)) {
                this.f70924a.add(str);
            }
            list = (List) this.f70925b.get(str);
            if (list == null) {
                list = new ArrayList<>();
                this.f70925b.put(str, list);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return list;
    }

    public final synchronized void a(@NonNull k kVar, @NonNull Class cls, @NonNull Class cls2, @NonNull String str) {
        c(str).add(new a<>(cls, cls2, kVar));
    }

    @NonNull
    public final synchronized ArrayList b(@NonNull Class cls, @NonNull Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f70924a.iterator();
        while (it.hasNext()) {
            List<a> list = (List) this.f70925b.get((String) it.next());
            if (list != null) {
                for (a aVar : list) {
                    if (aVar.a(cls, cls2)) {
                        arrayList.add(aVar.f70928c);
                    }
                }
            }
        }
        return arrayList;
    }

    @NonNull
    public final synchronized ArrayList d(@NonNull Class cls, @NonNull Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f70924a.iterator();
        while (it.hasNext()) {
            List<a> list = (List) this.f70925b.get((String) it.next());
            if (list != null) {
                for (a aVar : list) {
                    if (aVar.a(cls, cls2) && !arrayList.contains(aVar.f70927b)) {
                        arrayList.add(aVar.f70927b);
                    }
                }
            }
        }
        return arrayList;
    }

    public final synchronized void e(@NonNull k kVar, @NonNull Class cls, @NonNull Class cls2, @NonNull String str) {
        c(str).add(0, new a<>(cls, cls2, kVar));
    }

    public final synchronized void f(@NonNull ArrayList arrayList) {
        try {
            ArrayList arrayList2 = new ArrayList(this.f70924a);
            this.f70924a.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.f70924a.add((String) it.next());
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                String str = (String) it2.next();
                if (!arrayList.contains(str)) {
                    this.f70924a.add(str);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
