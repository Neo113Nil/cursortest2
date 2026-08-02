package B4;

import com.bumptech.glide.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import x0.InterfaceC6775d;

/* loaded from: classes2.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    public final r f753a;

    /* renamed from: b, reason: collision with root package name */
    public final a f754b;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final Map f755a = new HashMap();

        /* renamed from: B4.p$a$a, reason: collision with other inner class name */
        public static class C0018a {

            /* renamed from: a, reason: collision with root package name */
            public final List f756a;

            public C0018a(List list) {
                this.f756a = list;
            }
        }

        public void a() {
            this.f755a.clear();
        }

        public List b(Class cls) {
            C0018a c0018a = (C0018a) this.f755a.get(cls);
            if (c0018a == null) {
                return null;
            }
            return c0018a.f756a;
        }

        public void c(Class cls, List list) {
            if (((C0018a) this.f755a.put(cls, new C0018a(list))) == null) {
                return;
            }
            throw new IllegalStateException("Already cached loaders for model: " + cls);
        }
    }

    public p(InterfaceC6775d interfaceC6775d) {
        this(new r(interfaceC6775d));
    }

    public static Class b(Object obj) {
        return obj.getClass();
    }

    public synchronized void a(Class cls, Class cls2, o oVar) {
        this.f753a.b(cls, cls2, oVar);
        this.f754b.a();
    }

    public synchronized List c(Class cls) {
        return this.f753a.g(cls);
    }

    public List d(Object obj) {
        List e10 = e(b(obj));
        if (e10.isEmpty()) {
            throw new j.c(obj);
        }
        int size = e10.size();
        List list = Collections.EMPTY_LIST;
        boolean z10 = true;
        for (int i10 = 0; i10 < size; i10++) {
            n nVar = (n) e10.get(i10);
            if (nVar.a(obj)) {
                if (z10) {
                    list = new ArrayList(size - i10);
                    z10 = false;
                }
                list.add(nVar);
            }
        }
        if (list.isEmpty()) {
            throw new j.c(obj, e10);
        }
        return list;
    }

    public final synchronized List e(Class cls) {
        List b10;
        b10 = this.f754b.b(cls);
        if (b10 == null) {
            b10 = Collections.unmodifiableList(this.f753a.e(cls));
            this.f754b.c(cls, b10);
        }
        return b10;
    }

    public synchronized void f(Class cls, Class cls2, o oVar) {
        g(this.f753a.j(cls, cls2, oVar));
        this.f754b.a();
    }

    public final void g(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((o) it.next()).d();
        }
    }

    public p(r rVar) {
        this.f754b = new a();
        this.f753a = rVar;
    }
}
