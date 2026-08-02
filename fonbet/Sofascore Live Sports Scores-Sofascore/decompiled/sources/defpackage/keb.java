package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class keb {
    public static final Object k = new Object();
    public final Object a;
    public final uog b;
    public int c;
    public boolean d;
    public volatile Object e;
    public volatile Object f;
    public int g;
    public boolean h;
    public boolean i;
    public final b8 j;

    public keb() {
        this.a = new Object();
        this.b = new uog();
        this.c = 0;
        Object obj = k;
        this.f = obj;
        this.j = new b8(this, 21);
        this.e = obj;
        this.g = -1;
    }

    public static void a(String str) {
        if (ig0.G().H()) {
            return;
        }
        a70.r(lnb.o("Cannot invoke ", str, " on a background thread"));
    }

    public final void b(jeb jebVar) {
        if (jebVar.b) {
            if (!jebVar.d()) {
                jebVar.a(false);
                return;
            }
            int i = jebVar.c;
            int i2 = this.g;
            if (i >= i2) {
                return;
            }
            jebVar.c = i2;
            jebVar.a.h(this.e);
        }
    }

    public final void c(jeb jebVar) {
        if (this.h) {
            this.i = true;
            return;
        }
        this.h = true;
        do {
            this.i = false;
            if (jebVar != null) {
                b(jebVar);
                jebVar = null;
            } else {
                uog uogVar = this.b;
                sog sogVar = new sog(uogVar);
                uogVar.c.put(sogVar, Boolean.FALSE);
                while (sogVar.hasNext()) {
                    b((jeb) ((Map.Entry) sogVar.next()).getValue());
                    if (this.i) {
                        break;
                    }
                }
            }
        } while (this.i);
        this.h = false;
    }

    public final Object d() {
        Object obj = this.e;
        if (obj != k) {
            return obj;
        }
        return null;
    }

    public final void e(u6b u6bVar, skd skdVar) {
        a("observe");
        if (u6bVar.getLifecycle().b() == e6b.a) {
            return;
        }
        ieb iebVar = new ieb(this, u6bVar, skdVar);
        jeb jebVar = (jeb) this.b.a(skdVar, iebVar);
        if (jebVar != null && !jebVar.c(u6bVar)) {
            a70.p("Cannot add the same observer with different lifecycles");
        } else {
            if (jebVar != null) {
                return;
            }
            u6bVar.getLifecycle().a(iebVar);
        }
    }

    public final void f(skd skdVar) {
        a("observeForever");
        heb hebVar = new heb(this, skdVar);
        jeb jebVar = (jeb) this.b.a(skdVar, hebVar);
        if (jebVar instanceof ieb) {
            a70.p("Cannot add the same observer with different lifecycles");
        } else {
            if (jebVar != null) {
                return;
            }
            hebVar.a(true);
        }
    }

    public void i(skd skdVar) {
        a("removeObserver");
        uog uogVar = this.b;
        WeakHashMap weakHashMap = uogVar.c;
        rog rogVar = uogVar.a;
        while (rogVar != null && !rogVar.a.equals(skdVar)) {
            rogVar = rogVar.c;
        }
        Object obj = null;
        if (rogVar != null) {
            uogVar.d--;
            if (!weakHashMap.isEmpty()) {
                Iterator it = weakHashMap.keySet().iterator();
                while (it.hasNext()) {
                    ((tog) it.next()).a(rogVar);
                }
            }
            rog rogVar2 = rogVar.d;
            rog rogVar3 = rogVar.c;
            if (rogVar2 != null) {
                rogVar2.c = rogVar3;
            } else {
                uogVar.a = rogVar3;
            }
            rog rogVar4 = rogVar.c;
            if (rogVar4 != null) {
                rogVar4.d = rogVar2;
            } else {
                uogVar.b = rogVar2;
            }
            rogVar.c = null;
            rogVar.d = null;
            obj = rogVar.b;
        }
        jeb jebVar = (jeb) obj;
        if (jebVar == null) {
            return;
        }
        jebVar.b();
        jebVar.a(false);
    }

    public abstract void j(Object obj);

    public void g() {
    }

    public void h() {
    }

    public keb(Object obj) {
        this.a = new Object();
        this.b = new uog();
        this.c = 0;
        this.f = k;
        this.j = new b8(this, 21);
        this.e = obj;
        this.g = 0;
    }
}
