package T6;

import J7.c;
import K6.b;
import android.graphics.Rect;
import b7.InterfaceC2407b;
import com.facebook.drawee.backends.pipeline.e;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import o7.EnumC5823e;
import o7.InterfaceC5825g;
import o7.i;
import o7.j;
import o7.k;
import o7.n;

/* loaded from: classes2.dex */
public class a implements i {

    /* renamed from: a, reason: collision with root package name */
    public final e f10957a;

    /* renamed from: b, reason: collision with root package name */
    public final b f10958b;

    /* renamed from: c, reason: collision with root package name */
    public final j f10959c = new j(k.f59462c);

    /* renamed from: d, reason: collision with root package name */
    public U6.a f10960d;

    /* renamed from: e, reason: collision with root package name */
    public U6.b f10961e;

    /* renamed from: f, reason: collision with root package name */
    public c f10962f;

    /* renamed from: g, reason: collision with root package name */
    public List f10963g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f10964h;

    public a(b bVar, e eVar) {
        this.f10958b = bVar;
        this.f10957a = eVar;
    }

    @Override // o7.i
    public void a(j jVar, n nVar) {
        List list;
        if (!this.f10964h || (list = this.f10963g) == null || list.isEmpty()) {
            return;
        }
        jVar.S();
        Iterator it = this.f10963g.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
    }

    @Override // o7.i
    public void b(j jVar, EnumC5823e enumC5823e) {
        List list;
        jVar.H(enumC5823e);
        if (!this.f10964h || (list = this.f10963g) == null || list.isEmpty()) {
            return;
        }
        if (enumC5823e == EnumC5823e.f59379f) {
            d();
        }
        jVar.S();
        Iterator it = this.f10963g.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
    }

    public void c(InterfaceC5825g interfaceC5825g) {
        if (interfaceC5825g == null) {
            return;
        }
        if (this.f10963g == null) {
            this.f10963g = new CopyOnWriteArrayList();
        }
        this.f10963g.add(interfaceC5825g);
    }

    public void d() {
        InterfaceC2407b g10 = this.f10957a.g();
        if (g10 == null || g10.d() == null) {
            return;
        }
        Rect bounds = g10.d().getBounds();
        this.f10959c.N(bounds.width());
        this.f10959c.M(bounds.height());
    }

    public void e() {
        List list = this.f10963g;
        if (list != null) {
            list.clear();
        }
    }

    public void f() {
        e();
        g(false);
        this.f10959c.w();
    }

    public void g(boolean z10) {
        this.f10964h = z10;
        if (!z10) {
            U6.b bVar = this.f10961e;
            if (bVar != null) {
                this.f10957a.S(bVar);
            }
            c cVar = this.f10962f;
            if (cVar != null) {
                this.f10957a.y0(cVar);
                return;
            }
            return;
        }
        h();
        U6.b bVar2 = this.f10961e;
        if (bVar2 != null) {
            this.f10957a.l(bVar2);
        }
        c cVar2 = this.f10962f;
        if (cVar2 != null) {
            this.f10957a.i0(cVar2);
        }
    }

    public final void h() {
        if (this.f10961e == null) {
            this.f10961e = new U6.b(this.f10958b, this.f10959c, this);
        }
        if (this.f10960d == null) {
            this.f10960d = new U6.a(this.f10958b, this.f10959c);
        }
        if (this.f10962f == null) {
            this.f10962f = new c(this.f10960d);
        }
    }
}
