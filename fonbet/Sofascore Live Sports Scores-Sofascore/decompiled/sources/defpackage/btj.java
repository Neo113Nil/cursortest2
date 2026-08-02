package defpackage;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class btj {
    public int e;
    public int f;
    public int g;
    public int h;
    public hv9 l;
    public int m;
    public hv9 n;
    public int o;
    public int p;
    public int q;
    public hv9 r;
    public hv9 s;
    public int t;
    public int u;
    public boolean v;
    public boolean w;
    public boolean x;
    public HashMap y;
    public HashSet z;
    public int a = Integer.MAX_VALUE;
    public int b = Integer.MAX_VALUE;
    public int c = Integer.MAX_VALUE;
    public int d = Integer.MAX_VALUE;
    public int i = Integer.MAX_VALUE;
    public int j = Integer.MAX_VALUE;
    public boolean k = true;

    public btj() {
        av9 av9Var = hv9.b;
        vvf vvfVar = vvf.e;
        this.l = vvfVar;
        this.m = 0;
        this.n = vvfVar;
        this.o = 0;
        this.p = Integer.MAX_VALUE;
        this.q = Integer.MAX_VALUE;
        this.r = vvfVar;
        this.s = vvfVar;
        this.t = 0;
        this.u = 0;
        this.v = false;
        this.w = false;
        this.x = false;
        this.y = new HashMap();
        this.z = new HashSet();
    }

    public void a(int i) {
        Iterator it = this.y.values().iterator();
        while (it.hasNext()) {
            if (((ysj) it.next()).a.c == i) {
                it.remove();
            }
        }
    }

    public final void b(dtj dtjVar) {
        this.a = dtjVar.a;
        this.b = dtjVar.b;
        this.c = dtjVar.c;
        this.d = dtjVar.d;
        this.e = dtjVar.e;
        this.f = dtjVar.f;
        this.g = dtjVar.g;
        this.h = dtjVar.h;
        this.i = dtjVar.i;
        this.j = dtjVar.j;
        this.k = dtjVar.k;
        this.l = dtjVar.l;
        this.m = dtjVar.m;
        this.n = dtjVar.n;
        this.o = dtjVar.o;
        this.p = dtjVar.p;
        this.q = dtjVar.q;
        this.r = dtjVar.r;
        this.s = dtjVar.s;
        this.t = dtjVar.t;
        this.u = dtjVar.u;
        this.v = dtjVar.v;
        this.w = dtjVar.w;
        this.x = dtjVar.x;
        this.z = new HashSet(dtjVar.z);
        this.y = new HashMap(dtjVar.y);
    }

    public btj c(int i, int i2) {
        this.i = i;
        this.j = i2;
        this.k = true;
        return this;
    }
}
