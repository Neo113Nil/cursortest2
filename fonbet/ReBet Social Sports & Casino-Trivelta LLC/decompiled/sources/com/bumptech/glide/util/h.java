package com.bumptech.glide.util;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public final Map f30148a = new LinkedHashMap(100, 0.75f, true);

    /* renamed from: b, reason: collision with root package name */
    public final long f30149b;

    /* renamed from: c, reason: collision with root package name */
    public long f30150c;

    /* renamed from: d, reason: collision with root package name */
    public long f30151d;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Object f30152a;

        /* renamed from: b, reason: collision with root package name */
        public final int f30153b;

        public a(Object obj, int i10) {
            this.f30152a = obj;
            this.f30153b = i10;
        }
    }

    public h(long j10) {
        this.f30149b = j10;
        this.f30150c = j10;
    }

    public void b() {
        m(0L);
    }

    public final void f() {
        m(this.f30150c);
    }

    public synchronized Object g(Object obj) {
        a aVar;
        aVar = (a) this.f30148a.get(obj);
        return aVar != null ? aVar.f30152a : null;
    }

    public synchronized long h() {
        return this.f30150c;
    }

    public int i(Object obj) {
        return 1;
    }

    public void j(Object obj, Object obj2) {
    }

    public synchronized Object k(Object obj, Object obj2) {
        int i10 = i(obj2);
        long j10 = i10;
        if (j10 >= this.f30150c) {
            j(obj, obj2);
            return null;
        }
        if (obj2 != null) {
            this.f30151d += j10;
        }
        a aVar = (a) this.f30148a.put(obj, obj2 == null ? null : new a(obj2, i10));
        if (aVar != null) {
            this.f30151d -= aVar.f30153b;
            if (!aVar.f30152a.equals(obj2)) {
                j(obj, aVar.f30152a);
            }
        }
        f();
        return aVar != null ? aVar.f30152a : null;
    }

    public synchronized Object l(Object obj) {
        a aVar = (a) this.f30148a.remove(obj);
        if (aVar == null) {
            return null;
        }
        this.f30151d -= aVar.f30153b;
        return aVar.f30152a;
    }

    public synchronized void m(long j10) {
        while (this.f30151d > j10) {
            Iterator it = this.f30148a.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            a aVar = (a) entry.getValue();
            this.f30151d -= aVar.f30153b;
            Object key = entry.getKey();
            it.remove();
            j(key, aVar.f30152a);
        }
    }
}
