package org.jsoup.parser;

import Pf.q;
import java.io.StringReader;
import java.util.ArrayList;
import org.jsoup.parser.C;

/* loaded from: classes10.dex */
abstract class J {

    /* renamed from: a, reason: collision with root package name */
    protected l f79464a;

    /* renamed from: b, reason: collision with root package name */
    C8817f f79465b;

    /* renamed from: c, reason: collision with root package name */
    H f79466c;

    /* renamed from: d, reason: collision with root package name */
    Pf.f f79467d;

    /* renamed from: e, reason: collision with root package name */
    ArrayList<Pf.h> f79468e;

    /* renamed from: f, reason: collision with root package name */
    String f79469f;

    /* renamed from: g, reason: collision with root package name */
    C f79470g;

    /* renamed from: h, reason: collision with root package name */
    k f79471h;

    /* renamed from: i, reason: collision with root package name */
    B f79472i;

    /* renamed from: j, reason: collision with root package name */
    private C.g f79473j;

    /* renamed from: k, reason: collision with root package name */
    private final C.f f79474k = new C.f(this);

    /* renamed from: l, reason: collision with root package name */
    boolean f79475l;

    J() {
    }

    final Pf.h a() {
        int size = this.f79468e.size();
        return size > 0 ? this.f79468e.get(size - 1) : this.f79467d;
    }

    final boolean b(String str) {
        Pf.h a11;
        return this.f79468e.size() != 0 && (a11 = a()) != null && a11.x().equals(str) && a11.V().f79568a.equals("http://www.w3.org/1999/xhtml");
    }

    void c(StringReader stringReader, l lVar) {
        lVar.a();
        Pf.f fVar = new Pf.f();
        this.f79467d = fVar;
        fVar.c0(lVar);
        this.f79464a = lVar;
        this.f79471h = lVar.e();
        C8817f c8817f = new C8817f(stringReader);
        this.f79465b = c8817f;
        this.f79475l = false;
        lVar.c();
        c8817f.M0(this.f79475l);
        lVar.c();
        C8818g c8818g = (C8818g) this;
        this.f79466c = new H(c8818g);
        this.f79468e = new ArrayList<>(32);
        this.f79472i = lVar.f();
        C.g gVar = new C.g(c8818g);
        this.f79473j = gVar;
        this.f79470g = gVar;
        this.f79469f = "";
        i(this.f79467d, true);
    }

    final Pf.h d() {
        Pf.h remove = this.f79468e.remove(this.f79468e.size() - 1);
        i(remove, false);
        return remove;
    }

    abstract boolean e(C c11);

    final boolean f(String str) {
        C c11 = this.f79470g;
        C.f fVar = this.f79474k;
        if (c11 == fVar) {
            C.f fVar2 = new C.f(this);
            fVar2.o(str);
            return e(fVar2);
        }
        fVar.f();
        fVar.o(str);
        return e(fVar);
    }

    final void g(String str) {
        C.g gVar = this.f79473j;
        if (this.f79470g == gVar) {
            C.g gVar2 = new C.g((C8818g) this);
            gVar2.o(str);
            e(gVar2);
        } else {
            gVar.f();
            gVar.o(str);
            e(gVar);
        }
    }

    final m h(C.g gVar) {
        return this.f79472i.d(gVar.f79424d.g(), gVar.f79425e, "http://www.w3.org/1999/xhtml", this.f79471h.e());
    }

    final void i(Pf.n nVar, boolean z11) {
        if (this.f79475l) {
            C c11 = this.f79470g;
            int i11 = c11.f79415b;
            int i12 = c11.f79416c;
            if (nVar instanceof Pf.h) {
                Pf.h hVar = (Pf.h) nVar;
                if (c11.c()) {
                    if (hVar.R().a()) {
                        return;
                    } else {
                        i11 = this.f79465b.D0();
                    }
                } else if (!z11) {
                }
                i12 = i11;
            }
            nVar.e().C(new Pf.q(new q.b(i11, this.f79465b.R(i11), this.f79465b.k(i11)), new q.b(i12, this.f79465b.R(i12), this.f79465b.k(i12))), z11 ? "jsoup.start" : "jsoup.end");
        }
    }
}
