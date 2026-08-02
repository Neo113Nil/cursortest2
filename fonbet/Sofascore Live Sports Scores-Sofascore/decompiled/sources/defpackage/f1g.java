package defpackage;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class f1g implements zd4, wd4 {
    public final tl4 a;
    public final sl4 b;
    public int c;
    public int d = -1;
    public pia e;
    public List f;
    public int g;
    public volatile ntc h;
    public File i;
    public g1g j;

    public f1g(sl4 sl4Var, tl4 tl4Var) {
        this.b = sl4Var;
        this.a = tl4Var;
    }

    @Override // defpackage.zd4
    public final boolean b() {
        List list;
        ArrayList o;
        ArrayList a = this.b.a();
        boolean z = false;
        if (!a.isEmpty()) {
            sl4 sl4Var = this.b;
            ovf a2 = sl4Var.c.a();
            Class<?> cls = sl4Var.d.getClass();
            Class cls2 = sl4Var.g;
            Class cls3 = sl4Var.k;
            wj9 wj9Var = a2.h;
            pxc pxcVar = (pxc) ((AtomicReference) wj9Var.b).getAndSet(null);
            if (pxcVar == null) {
                pxcVar = new pxc(cls, cls2, cls3);
            } else {
                pxcVar.a = cls;
                pxcVar.b = cls2;
                pxcVar.c = cls3;
            }
            synchronized (((dh0) wj9Var.c)) {
                list = (List) ((dh0) wj9Var.c).get(pxcVar);
            }
            ((AtomicReference) wj9Var.b).set(pxcVar);
            List list2 = list;
            if (list == null) {
                ArrayList arrayList = new ArrayList();
                wj9 wj9Var2 = a2.a;
                synchronized (wj9Var2) {
                    o = ((l2a) wj9Var2.b).o(cls);
                }
                Iterator it = o.iterator();
                while (it.hasNext()) {
                    Iterator it2 = a2.c.c((Class) it.next(), cls2).iterator();
                    while (it2.hasNext()) {
                        Class cls4 = (Class) it2.next();
                        if (!a2.f.c(cls4, cls3).isEmpty() && !arrayList.contains(cls4)) {
                            arrayList.add(cls4);
                        }
                    }
                }
                wj9 wj9Var3 = a2.h;
                List unmodifiableList = Collections.unmodifiableList(arrayList);
                synchronized (((dh0) wj9Var3.c)) {
                    ((dh0) wj9Var3.c).put(new pxc(cls, cls2, cls3), unmodifiableList);
                }
                list2 = arrayList;
            }
            if (!list2.isEmpty()) {
                while (true) {
                    List list3 = this.f;
                    if (list3 != null && this.g < list3.size()) {
                        this.h = null;
                        while (!z && this.g < this.f.size()) {
                            List list4 = this.f;
                            int i = this.g;
                            this.g = i + 1;
                            otc otcVar = (otc) list4.get(i);
                            File file = this.i;
                            sl4 sl4Var2 = this.b;
                            this.h = otcVar.a(file, sl4Var2.e, sl4Var2.f, sl4Var2.i);
                            if (this.h != null && this.b.c(this.h.c.c()) != null) {
                                this.h.c.b(this.b.o, this);
                                z = true;
                            }
                        }
                        return z;
                    }
                    int i2 = this.d + 1;
                    this.d = i2;
                    if (i2 >= list2.size()) {
                        int i3 = this.c + 1;
                        this.c = i3;
                        if (i3 >= a.size()) {
                            break;
                        }
                        this.d = 0;
                    }
                    pia piaVar = (pia) a.get(this.c);
                    Class cls5 = (Class) list2.get(this.d);
                    bwj e = this.b.e(cls5);
                    sl4 sl4Var3 = this.b;
                    this.j = new g1g(sl4Var3.c.a, piaVar, sl4Var3.n, sl4Var3.e, sl4Var3.f, e, cls5, sl4Var3.i);
                    File b = sl4Var3.h.d().b(this.j);
                    this.i = b;
                    if (b != null) {
                        this.e = piaVar;
                        this.f = this.b.c.a().f(b);
                        this.g = 0;
                    }
                }
            } else if (!File.class.equals(this.b.k)) {
                StringBuilder sb = new StringBuilder("Failed to find any load path from ");
                sb.append(this.b.d.getClass());
                Class cls6 = this.b.k;
                sb.append(" to ");
                sb.append(cls6);
                throw new IllegalStateException(sb.toString());
            }
        }
        return false;
    }

    @Override // defpackage.zd4
    public final void cancel() {
        ntc ntcVar = this.h;
        if (ntcVar != null) {
            ntcVar.c.cancel();
        }
    }

    @Override // defpackage.wd4
    public final void d(Exception exc) {
        this.a.c(this.j, exc, this.h.c, 4);
    }

    @Override // defpackage.wd4
    public final void l(Object obj) {
        this.a.a(this.e, obj, this.h.c, 4, this.j);
    }
}
