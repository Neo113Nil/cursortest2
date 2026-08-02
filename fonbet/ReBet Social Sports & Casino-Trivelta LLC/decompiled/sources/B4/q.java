package B4;

import B4.n;
import com.bumptech.glide.load.data.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import x0.InterfaceC6775d;

/* loaded from: classes2.dex */
public class q implements n {

    /* renamed from: a, reason: collision with root package name */
    public final List f757a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC6775d f758b;

    public static class a implements com.bumptech.glide.load.data.d, d.a {

        /* renamed from: a, reason: collision with root package name */
        public final List f759a;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC6775d f760b;

        /* renamed from: c, reason: collision with root package name */
        public int f761c;

        /* renamed from: d, reason: collision with root package name */
        public com.bumptech.glide.h f762d;

        /* renamed from: e, reason: collision with root package name */
        public d.a f763e;

        /* renamed from: f, reason: collision with root package name */
        public List f764f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f765g;

        public a(List list, InterfaceC6775d interfaceC6775d) {
            this.f760b = interfaceC6775d;
            com.bumptech.glide.util.k.c(list);
            this.f759a = list;
            this.f761c = 0;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class a() {
            return ((com.bumptech.glide.load.data.d) this.f759a.get(0)).a();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            List list = this.f764f;
            if (list != null) {
                this.f760b.release(list);
            }
            this.f764f = null;
            Iterator it = this.f759a.iterator();
            while (it.hasNext()) {
                ((com.bumptech.glide.load.data.d) it.next()).b();
            }
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void c(Exception exc) {
            ((List) com.bumptech.glide.util.k.d(this.f764f)).add(exc);
            g();
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
            this.f765g = true;
            Iterator it = this.f759a.iterator();
            while (it.hasNext()) {
                ((com.bumptech.glide.load.data.d) it.next()).cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public com.bumptech.glide.load.a d() {
            return ((com.bumptech.glide.load.data.d) this.f759a.get(0)).d();
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(com.bumptech.glide.h hVar, d.a aVar) {
            this.f762d = hVar;
            this.f763e = aVar;
            this.f764f = (List) this.f760b.acquire();
            ((com.bumptech.glide.load.data.d) this.f759a.get(this.f761c)).e(hVar, this);
            if (this.f765g) {
                cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void f(Object obj) {
            if (obj != null) {
                this.f763e.f(obj);
            } else {
                g();
            }
        }

        public final void g() {
            if (this.f765g) {
                return;
            }
            if (this.f761c < this.f759a.size() - 1) {
                this.f761c++;
                e(this.f762d, this.f763e);
            } else {
                com.bumptech.glide.util.k.d(this.f764f);
                this.f763e.c(new com.bumptech.glide.load.engine.q("Fetch failed", new ArrayList(this.f764f)));
            }
        }
    }

    public q(List list, InterfaceC6775d interfaceC6775d) {
        this.f757a = list;
        this.f758b = interfaceC6775d;
    }

    @Override // B4.n
    public boolean a(Object obj) {
        Iterator it = this.f757a.iterator();
        while (it.hasNext()) {
            if (((n) it.next()).a(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // B4.n
    public n.a b(Object obj, int i10, int i11, com.bumptech.glide.load.j jVar) {
        n.a b10;
        int size = this.f757a.size();
        ArrayList arrayList = new ArrayList(size);
        com.bumptech.glide.load.g gVar = null;
        for (int i12 = 0; i12 < size; i12++) {
            n nVar = (n) this.f757a.get(i12);
            if (nVar.a(obj) && (b10 = nVar.b(obj, i10, i11, jVar)) != null) {
                gVar = b10.f750a;
                arrayList.add(b10.f752c);
            }
        }
        if (arrayList.isEmpty() || gVar == null) {
            return null;
        }
        return new n.a(gVar, new a(arrayList, this.f758b));
    }

    public String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.f757a.toArray()) + '}';
    }
}
