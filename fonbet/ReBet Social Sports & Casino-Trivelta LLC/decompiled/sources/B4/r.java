package B4;

import B4.n;
import com.bumptech.glide.j;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import x0.InterfaceC6775d;

/* loaded from: classes2.dex */
public class r {

    /* renamed from: e, reason: collision with root package name */
    public static final c f766e = new c();

    /* renamed from: f, reason: collision with root package name */
    public static final n f767f = new a();

    /* renamed from: a, reason: collision with root package name */
    public final List f768a;

    /* renamed from: b, reason: collision with root package name */
    public final c f769b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f770c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC6775d f771d;

    public static class a implements n {
        @Override // B4.n
        public boolean a(Object obj) {
            return false;
        }

        @Override // B4.n
        public n.a b(Object obj, int i10, int i11, com.bumptech.glide.load.j jVar) {
            return null;
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final Class f772a;

        /* renamed from: b, reason: collision with root package name */
        public final Class f773b;

        /* renamed from: c, reason: collision with root package name */
        public final o f774c;

        public b(Class cls, Class cls2, o oVar) {
            this.f772a = cls;
            this.f773b = cls2;
            this.f774c = oVar;
        }

        public boolean a(Class cls) {
            return this.f772a.isAssignableFrom(cls);
        }

        public boolean b(Class cls, Class cls2) {
            return a(cls) && this.f773b.isAssignableFrom(cls2);
        }
    }

    public static class c {
        public q a(List list, InterfaceC6775d interfaceC6775d) {
            return new q(list, interfaceC6775d);
        }
    }

    public r(InterfaceC6775d interfaceC6775d) {
        this(interfaceC6775d, f766e);
    }

    public static n f() {
        return f767f;
    }

    public final void a(Class cls, Class cls2, o oVar, boolean z10) {
        b bVar = new b(cls, cls2, oVar);
        List list = this.f768a;
        list.add(z10 ? list.size() : 0, bVar);
    }

    public synchronized void b(Class cls, Class cls2, o oVar) {
        a(cls, cls2, oVar, true);
    }

    public final n c(b bVar) {
        return (n) com.bumptech.glide.util.k.d(bVar.f774c.e(this));
    }

    public synchronized n d(Class cls, Class cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z10 = false;
            for (b bVar : this.f768a) {
                if (this.f770c.contains(bVar)) {
                    z10 = true;
                } else if (bVar.b(cls, cls2)) {
                    this.f770c.add(bVar);
                    arrayList.add(c(bVar));
                    this.f770c.remove(bVar);
                }
            }
            if (arrayList.size() > 1) {
                return this.f769b.a(arrayList, this.f771d);
            }
            if (arrayList.size() == 1) {
                return (n) arrayList.get(0);
            }
            if (!z10) {
                throw new j.c(cls, cls2);
            }
            return f();
        } catch (Throwable th2) {
            this.f770c.clear();
            throw th2;
        }
    }

    public synchronized List e(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (b bVar : this.f768a) {
                if (!this.f770c.contains(bVar) && bVar.a(cls)) {
                    this.f770c.add(bVar);
                    arrayList.add(c(bVar));
                    this.f770c.remove(bVar);
                }
            }
        } finally {
        }
        return arrayList;
    }

    public synchronized List g(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (b bVar : this.f768a) {
            if (!arrayList.contains(bVar.f773b) && bVar.a(cls)) {
                arrayList.add(bVar.f773b);
            }
        }
        return arrayList;
    }

    public final o h(b bVar) {
        return bVar.f774c;
    }

    public synchronized List i(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f768a.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.b(cls, cls2)) {
                it.remove();
                arrayList.add(h(bVar));
            }
        }
        return arrayList;
    }

    public synchronized List j(Class cls, Class cls2, o oVar) {
        List i10;
        i10 = i(cls, cls2);
        b(cls, cls2, oVar);
        return i10;
    }

    public r(InterfaceC6775d interfaceC6775d, c cVar) {
        this.f768a = new ArrayList();
        this.f770c = new HashSet();
        this.f771d = interfaceC6775d;
        this.f769b = cVar;
    }
}
