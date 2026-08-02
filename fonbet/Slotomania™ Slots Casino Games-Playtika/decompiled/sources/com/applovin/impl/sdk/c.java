package com.applovin.impl.sdk;

import com.applovin.impl.sdk.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public class c implements h.d {
    private final l a;
    private final Map b = new HashMap();
    private final Object c = new Object();
    private final List d = new ArrayList();
    private final Object e = new Object();
    private final Set f = new HashSet();
    private final Set g;
    private boolean h;

    public interface a {
        void a(List list);
    }

    public c(l lVar) {
        HashSet hashSet = new HashSet();
        this.g = hashSet;
        this.h = false;
        this.a = lVar;
        hashSet.add(h.c.LOADING);
        hashSet.add(h.c.LOAD);
        hashSet.add(h.c.SHOW);
        hashSet.add(h.c.CLICK);
        hashSet.add(h.c.SHOW_ERROR);
        hashSet.add(h.c.DESTROY);
    }

    private boolean c() {
        return this.f.isEmpty() && this.d.isEmpty();
    }

    private void d() {
        List a2 = a();
        Iterator it = b().iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(a2);
        }
    }

    public List a() {
        ArrayList arrayList;
        synchronized (this.c) {
            arrayList = new ArrayList(this.b.size());
            Iterator it = this.b.values().iterator();
            while (it.hasNext()) {
                arrayList.add(((h.b) it.next()).a());
            }
        }
        return arrayList;
    }

    public void b(Object obj) {
        synchronized (this.e) {
            this.f.remove(obj);
            if (this.h && c()) {
                this.a.m().a(this);
                this.h = false;
            }
        }
    }

    @Override // com.applovin.impl.sdk.h.d
    public void a(h.b bVar) {
        b(bVar);
        d();
    }

    public void b(a aVar) {
        synchronized (this.e) {
            this.d.remove(aVar);
            if (this.h && c()) {
                this.a.m().a(this);
                this.h = false;
            }
        }
    }

    public void a(Object obj) {
        synchronized (this.e) {
            this.f.add(obj);
            if (!this.h) {
                this.a.m().a(this, this.g);
                this.h = true;
            }
        }
    }

    private List b() {
        ArrayList arrayList;
        synchronized (this.e) {
            arrayList = new ArrayList(this.d);
        }
        return arrayList;
    }

    public void a(a aVar) {
        synchronized (this.e) {
            if (aVar != null) {
                if (!this.d.contains(aVar)) {
                    this.d.add(aVar);
                    if (!this.h) {
                        this.a.m().a(this, this.g);
                        this.h = true;
                    }
                }
            }
        }
    }

    private void b(h.b bVar) {
        synchronized (this.c) {
            if (bVar == null) {
                return;
            }
            String b = bVar.b();
            if (bVar.c() == h.c.DESTROY) {
                this.b.remove(b);
            } else {
                if (this.b.containsKey(b)) {
                    return;
                }
                this.b.put(b, bVar);
            }
        }
    }
}
