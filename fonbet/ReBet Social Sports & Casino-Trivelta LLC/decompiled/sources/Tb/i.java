package Tb;

import android.view.View;
import com.henninghall.date_picker.k;
import com.henninghall.date_picker.n;
import com.henninghall.date_picker.pickers.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public final n f11411a;

    /* renamed from: b, reason: collision with root package name */
    public Vb.d f11412b;

    /* renamed from: c, reason: collision with root package name */
    public Vb.c f11413c;

    /* renamed from: d, reason: collision with root package name */
    public Vb.e f11414d;

    /* renamed from: e, reason: collision with root package name */
    public Vb.a f11415e;

    /* renamed from: f, reason: collision with root package name */
    public Vb.b f11416f;

    /* renamed from: g, reason: collision with root package name */
    public Vb.f f11417g;

    /* renamed from: h, reason: collision with root package name */
    public Vb.h f11418h;

    /* renamed from: i, reason: collision with root package name */
    public View f11419i;

    /* renamed from: j, reason: collision with root package name */
    public final Tb.b f11420j;

    /* renamed from: k, reason: collision with root package name */
    public HashMap f11421k = z();

    public class a implements a.b {
        public a() {
        }

        @Override // com.henninghall.date_picker.pickers.a.b
        public void a(com.henninghall.date_picker.pickers.a aVar, int i10, int i11) {
            if (i.this.f11411a.f38606o.g()) {
                String m10 = i.this.f11412b.m(i10);
                String m11 = i.this.f11412b.m(i11);
                if ((m10.equals("12") && m11.equals("11")) || (m10.equals("11") && m11.equals("12"))) {
                    i.this.f11415e.f12856d.a((i.this.f11415e.f12856d.getValue() + 1) % 2, false);
                }
            }
        }
    }

    public class b extends HashMap {
        public b() {
            put(Rb.c.DAY, i.this.f11413c);
            put(Rb.c.YEAR, i.this.f11418h);
            put(Rb.c.MONTH, i.this.f11417g);
            put(Rb.c.DATE, i.this.f11416f);
            put(Rb.c.HOUR, i.this.f11412b);
            put(Rb.c.MINUTE, i.this.f11414d);
            put(Rb.c.AM_PM, i.this.f11415e);
        }
    }

    public i(n nVar, View view) {
        this.f11411a = nVar;
        this.f11419i = view;
        this.f11420j = new Tb.b(view);
        this.f11418h = new Vb.h(w(k.f38580i), nVar);
        this.f11417g = new Vb.f(w(k.f38577f), nVar);
        this.f11416f = new Vb.b(w(k.f38573b), nVar);
        this.f11413c = new Vb.c(w(k.f38574c), nVar);
        this.f11414d = new Vb.e(w(k.f38576e), nVar);
        this.f11415e = new Vb.a(w(k.f38572a), nVar);
        this.f11412b = new Vb.d(w(k.f38575d), nVar);
        m();
    }

    public boolean A() {
        Iterator it = n().iterator();
        while (it.hasNext()) {
            if (((Vb.g) it.next()).f12856d.c()) {
                return true;
            }
        }
        return false;
    }

    public void B() {
        this.f11420j.b();
        i();
    }

    public final void i() {
        Iterator it = this.f11411a.f38606o.b().iterator();
        while (it.hasNext()) {
            this.f11420j.a(y((Rb.c) it.next()).f12856d.getView());
        }
    }

    public void j(Ub.h hVar) {
        Iterator it = n().iterator();
        while (it.hasNext()) {
            hVar.a((Vb.g) it.next());
        }
    }

    public void k(Ub.h hVar) {
        for (Vb.g gVar : n()) {
            if (!gVar.u()) {
                hVar.a(gVar);
            }
        }
    }

    public void l(Ub.h hVar) {
        for (Vb.g gVar : n()) {
            if (gVar.u()) {
                hVar.a(gVar);
            }
        }
    }

    public final void m() {
        this.f11412b.f12856d.setOnValueChangeListenerInScrolling(new a());
    }

    public final List n() {
        return new ArrayList(Arrays.asList(this.f11418h, this.f11417g, this.f11416f, this.f11413c, this.f11412b, this.f11414d, this.f11415e));
    }

    public final String o() {
        ArrayList v10 = v();
        if (this.f11411a.z() != Rb.b.date) {
            return this.f11413c.e();
        }
        return ((Vb.g) v10.get(0)).e() + " " + ((Vb.g) v10.get(1)).e() + " " + ((Vb.g) v10.get(2)).e();
    }

    public final String p(int i10) {
        ArrayList v10 = v();
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < 3; i11++) {
            if (i11 != 0) {
                sb2.append(" ");
            }
            Vb.g gVar = (Vb.g) v10.get(i11);
            if (gVar instanceof Vb.b) {
                sb2.append(gVar.i(i10));
            } else {
                sb2.append(gVar.l());
            }
        }
        return sb2.toString();
    }

    public final String q(int i10) {
        return this.f11411a.z() == Rb.b.date ? p(i10) : this.f11413c.l();
    }

    public String r() {
        return s(0);
    }

    public String s(int i10) {
        return q(i10) + " " + x();
    }

    public String t() {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = v().iterator();
        while (it.hasNext()) {
            sb2.append(((Vb.g) it.next()).b());
        }
        return sb2.toString();
    }

    public String u() {
        return o() + " " + this.f11412b.e() + " " + this.f11414d.e() + this.f11415e.e();
    }

    public final ArrayList v() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f11411a.f38606o.b().iterator();
        while (it.hasNext()) {
            arrayList.add(y((Rb.c) it.next()));
        }
        return arrayList;
    }

    public final com.henninghall.date_picker.pickers.a w(int i10) {
        return (com.henninghall.date_picker.pickers.a) this.f11419i.findViewById(i10);
    }

    public String x() {
        return this.f11412b.l() + " " + this.f11414d.l() + this.f11415e.l();
    }

    public Vb.g y(Rb.c cVar) {
        return (Vb.g) this.f11421k.get(cVar);
    }

    public final HashMap z() {
        return new b();
    }
}
