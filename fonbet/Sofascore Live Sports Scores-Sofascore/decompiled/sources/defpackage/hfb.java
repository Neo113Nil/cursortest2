package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class hfb {
    public static final Logger c;
    public static hfb d;
    public static final List e;
    public final LinkedHashSet a = new LinkedHashSet();
    public final LinkedHashMap b = new LinkedHashMap();

    static {
        Logger logger = Logger.getLogger(hfb.class.getName());
        c = logger;
        ArrayList arrayList = new ArrayList();
        try {
            boolean z = jge.a;
            arrayList.add(jge.class);
        } catch (ClassNotFoundException e2) {
            logger.log(Level.WARNING, "Unable to find pick-first LoadBalancer", (Throwable) e2);
        }
        try {
            arrayList.add(lzg.class);
        } catch (ClassNotFoundException e3) {
            logger.log(Level.FINE, "Unable to find round-robin LoadBalancer", (Throwable) e3);
        }
        e = Collections.unmodifiableList(arrayList);
    }

    public static synchronized hfb a() {
        hfb hfbVar;
        synchronized (hfb.class) {
            try {
                if (d == null) {
                    List<gfb> L = b0a.L(gfb.class, e, gfb.class.getClassLoader(), new mx9());
                    d = new hfb();
                    for (gfb gfbVar : L) {
                        c.fine("Service loader found " + gfbVar);
                        hfb hfbVar2 = d;
                        synchronized (hfbVar2) {
                            gfbVar.getClass();
                            hfbVar2.a.add(gfbVar);
                        }
                    }
                    d.c();
                }
                hfbVar = d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return hfbVar;
    }

    public final synchronized gfb b(String str) {
        LinkedHashMap linkedHashMap;
        linkedHashMap = this.b;
        z1a.y(str, "policy");
        return (gfb) linkedHashMap.get(str);
    }

    public final synchronized void c() {
        this.b.clear();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            gfb gfbVar = (gfb) it.next();
            String a = gfbVar.a();
            if (((gfb) this.b.get(a)) == null) {
                this.b.put(a, gfbVar);
            }
        }
    }
}
