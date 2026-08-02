package androidx.constraintlayout.core.widgets.analyzer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class f implements d {

    /* renamed from: d, reason: collision with root package name */
    public p f17821d;

    /* renamed from: f, reason: collision with root package name */
    public int f17823f;

    /* renamed from: g, reason: collision with root package name */
    public int f17824g;

    /* renamed from: a, reason: collision with root package name */
    public d f17818a = null;

    /* renamed from: b, reason: collision with root package name */
    public boolean f17819b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f17820c = false;

    /* renamed from: e, reason: collision with root package name */
    public a f17822e = a.UNKNOWN;

    /* renamed from: h, reason: collision with root package name */
    public int f17825h = 1;

    /* renamed from: i, reason: collision with root package name */
    public g f17826i = null;

    /* renamed from: j, reason: collision with root package name */
    public boolean f17827j = false;

    /* renamed from: k, reason: collision with root package name */
    public List f17828k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public List f17829l = new ArrayList();

    public enum a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public f(p pVar) {
        this.f17821d = pVar;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.d
    public void a(d dVar) {
        Iterator it = this.f17829l.iterator();
        while (it.hasNext()) {
            if (!((f) it.next()).f17827j) {
                return;
            }
        }
        this.f17820c = true;
        d dVar2 = this.f17818a;
        if (dVar2 != null) {
            dVar2.a(this);
        }
        if (this.f17819b) {
            this.f17821d.a(this);
            return;
        }
        f fVar = null;
        int i10 = 0;
        for (f fVar2 : this.f17829l) {
            if (!(fVar2 instanceof g)) {
                i10++;
                fVar = fVar2;
            }
        }
        if (fVar != null && i10 == 1 && fVar.f17827j) {
            g gVar = this.f17826i;
            if (gVar != null) {
                if (!gVar.f17827j) {
                    return;
                } else {
                    this.f17823f = this.f17825h * gVar.f17824g;
                }
            }
            d(fVar.f17824g + this.f17823f);
        }
        d dVar3 = this.f17818a;
        if (dVar3 != null) {
            dVar3.a(this);
        }
    }

    public void b(d dVar) {
        this.f17828k.add(dVar);
        if (this.f17827j) {
            dVar.a(dVar);
        }
    }

    public void c() {
        this.f17829l.clear();
        this.f17828k.clear();
        this.f17827j = false;
        this.f17824g = 0;
        this.f17820c = false;
        this.f17819b = false;
    }

    public void d(int i10) {
        if (this.f17827j) {
            return;
        }
        this.f17827j = true;
        this.f17824g = i10;
        for (d dVar : this.f17828k) {
            dVar.a(dVar);
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f17821d.f17867b.t());
        sb2.append(":");
        sb2.append(this.f17822e);
        sb2.append("(");
        sb2.append(this.f17827j ? Integer.valueOf(this.f17824g) : "unresolved");
        sb2.append(") <t=");
        sb2.append(this.f17829l.size());
        sb2.append(":d=");
        sb2.append(this.f17828k.size());
        sb2.append(">");
        return sb2.toString();
    }
}
