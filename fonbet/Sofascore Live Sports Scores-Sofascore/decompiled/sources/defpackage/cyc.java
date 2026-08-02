package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class cyc implements xd4, wd4 {
    public final ArrayList a;
    public final sx2 b;
    public int c;
    public k7f d;
    public wd4 e;
    public List f;
    public boolean g;

    public cyc(ArrayList arrayList, sx2 sx2Var) {
        this.b = sx2Var;
        if (arrayList.isEmpty()) {
            a70.p("Must not be empty.");
            throw null;
        }
        this.a = arrayList;
        this.c = 0;
    }

    @Override // defpackage.xd4
    public final void a() {
        List list = this.f;
        if (list != null) {
            this.b.b(list);
        }
        this.f = null;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((xd4) it.next()).a();
        }
    }

    @Override // defpackage.xd4
    public final void b(k7f k7fVar, wd4 wd4Var) {
        this.d = k7fVar;
        this.e = wd4Var;
        this.f = (List) this.b.c();
        ((xd4) this.a.get(this.c)).b(k7fVar, this);
        if (this.g) {
            cancel();
        }
    }

    @Override // defpackage.xd4
    public final Class c() {
        return ((xd4) this.a.get(0)).c();
    }

    @Override // defpackage.xd4
    public final void cancel() {
        this.g = true;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((xd4) it.next()).cancel();
        }
    }

    @Override // defpackage.wd4
    public final void d(Exception exc) {
        List list = this.f;
        w1a.m(list, "Argument must not be null");
        list.add(exc);
        f();
    }

    @Override // defpackage.xd4
    public final int e() {
        return ((xd4) this.a.get(0)).e();
    }

    public final void f() {
        if (this.g) {
            return;
        }
        if (this.c < this.a.size() - 1) {
            this.c++;
            b(this.d, this.e);
        } else {
            w1a.l(this.f);
            this.e.d(new mz8("Fetch failed", new ArrayList(this.f)));
        }
    }

    @Override // defpackage.wd4
    public final void l(Object obj) {
        if (obj != null) {
            this.e.l(obj);
        } else {
            f();
        }
    }
}
