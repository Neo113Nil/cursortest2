package Bh;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import uh.InterfaceC6579c;
import yh.C6896e;

/* loaded from: classes3.dex */
public final class h implements Eh.b {

    /* renamed from: a, reason: collision with root package name */
    public final List f934a;

    /* renamed from: b, reason: collision with root package name */
    public final List f935b;

    /* renamed from: c, reason: collision with root package name */
    public final List f936c;

    /* renamed from: d, reason: collision with root package name */
    public final List f937d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f938e = new AtomicBoolean(false);

    public h(List list) {
        this.f937d = list;
        this.f934a = new ArrayList(list.size());
        this.f936c = new ArrayList(list.size());
        this.f935b = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            x xVar = (x) it.next();
            if (xVar.F()) {
                this.f934a.add(xVar);
            }
            if (xVar instanceof Eh.b) {
                Eh.b bVar = (Eh.b) xVar;
                if (bVar.i0()) {
                    this.f935b.add(bVar);
                }
            }
            if (xVar.S1()) {
                this.f936c.add(xVar);
            }
        }
    }

    public static x d(List list) {
        Objects.requireNonNull(list, "spanProcessorList");
        return new h(new ArrayList(list));
    }

    @Override // Bh.x
    public void D1(InterfaceC6579c interfaceC6579c, k kVar) {
        Iterator it = this.f934a.iterator();
        while (it.hasNext()) {
            ((x) it.next()).D1(interfaceC6579c, kVar);
        }
    }

    @Override // Bh.x
    public boolean F() {
        return !this.f934a.isEmpty();
    }

    @Override // Bh.x
    public void M1(l lVar) {
        Iterator it = this.f936c.iterator();
        while (it.hasNext()) {
            ((x) it.next()).M1(lVar);
        }
    }

    @Override // Bh.x
    public boolean S1() {
        return !this.f936c.isEmpty();
    }

    @Override // Bh.x
    public C6896e T() {
        ArrayList arrayList = new ArrayList(this.f937d.size());
        Iterator it = this.f937d.iterator();
        while (it.hasNext()) {
            arrayList.add(((x) it.next()).T());
        }
        return C6896e.h(arrayList);
    }

    @Override // Eh.b
    public boolean i0() {
        return !this.f935b.isEmpty();
    }

    @Override // Eh.b
    public void n0(k kVar) {
        Iterator it = this.f935b.iterator();
        while (it.hasNext()) {
            ((Eh.b) it.next()).n0(kVar);
        }
    }

    @Override // Bh.x
    public C6896e shutdown() {
        if (this.f938e.getAndSet(true)) {
            return C6896e.j();
        }
        ArrayList arrayList = new ArrayList(this.f937d.size());
        Iterator it = this.f937d.iterator();
        while (it.hasNext()) {
            arrayList.add(((x) it.next()).shutdown());
        }
        return C6896e.h(arrayList);
    }

    public String toString() {
        return "MultiSpanProcessor{spanProcessorsStart=" + this.f934a + ", spanProcessorsEnding=" + this.f935b + ", spanProcessorsEnd=" + this.f936c + ", spanProcessorsAll=" + this.f937d + '}';
    }
}
