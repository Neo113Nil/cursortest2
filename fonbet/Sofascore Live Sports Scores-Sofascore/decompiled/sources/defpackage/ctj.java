package defpackage;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class ctj {
    public int a = Integer.MAX_VALUE;
    public int b = Integer.MAX_VALUE;
    public int c = Integer.MAX_VALUE;
    public int d = Integer.MAX_VALUE;
    public int e = Integer.MAX_VALUE;
    public int f = Integer.MAX_VALUE;
    public boolean g = true;
    public boolean h = true;
    public hv9 i;
    public hv9 j;
    public hv9 k;
    public hv9 l;
    public hv9 m;
    public int n;
    public int o;
    public hv9 p;
    public atj q;
    public hv9 r;
    public boolean s;
    public hv9 t;
    public int u;
    public HashMap v;
    public HashSet w;

    public ctj() {
        av9 av9Var = hv9.b;
        vvf vvfVar = vvf.e;
        this.i = vvfVar;
        this.j = vvfVar;
        this.k = vvfVar;
        this.l = vvfVar;
        this.m = vvfVar;
        this.n = Integer.MAX_VALUE;
        this.o = Integer.MAX_VALUE;
        this.p = vvfVar;
        this.q = atj.a;
        this.r = vvfVar;
        this.s = true;
        this.t = vvfVar;
        this.u = 0;
        this.v = new HashMap();
        this.w = new HashSet();
    }

    public etj a() {
        return new etj(this);
    }

    public ctj b(int i) {
        Iterator it = this.v.values().iterator();
        while (it.hasNext()) {
            if (((zsj) it.next()).a.c == i) {
                it.remove();
            }
        }
        return this;
    }

    public final void c(etj etjVar) {
        this.a = etjVar.a;
        this.b = etjVar.b;
        this.c = etjVar.c;
        this.d = etjVar.d;
        this.e = etjVar.e;
        this.f = etjVar.f;
        this.g = etjVar.g;
        this.h = etjVar.h;
        this.j = etjVar.j;
        this.i = etjVar.i;
        this.k = etjVar.k;
        this.l = etjVar.l;
        this.m = etjVar.m;
        this.n = etjVar.n;
        this.o = etjVar.o;
        this.p = etjVar.p;
        this.q = etjVar.q;
        this.r = etjVar.r;
        this.s = etjVar.t;
        this.t = etjVar.s;
        this.u = etjVar.u;
        this.w = new HashSet(etjVar.w);
        this.v = new HashMap(etjVar.v);
    }

    public ctj d() {
        this.u = -3;
        return this;
    }

    public ctj e(zsj zsjVar) {
        osj osjVar = zsjVar.a;
        b(osjVar.c);
        this.v.put(osjVar, zsjVar);
        return this;
    }

    public ctj f() {
        return g(new String[0]);
    }

    public ctj g(String... strArr) {
        zu9 s = hv9.s();
        for (String str : strArr) {
            str.getClass();
            s.c(nik.U(str));
        }
        this.r = s.g();
        this.s = false;
        return this;
    }

    public ctj h() {
        this.s = false;
        return this;
    }

    public ctj i(int i, boolean z) {
        HashSet hashSet = this.w;
        if (z) {
            hashSet.add(Integer.valueOf(i));
            return this;
        }
        hashSet.remove(Integer.valueOf(i));
        return this;
    }
}
