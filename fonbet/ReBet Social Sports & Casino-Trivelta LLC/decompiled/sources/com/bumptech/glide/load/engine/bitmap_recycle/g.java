package com.bumptech.glide.load.engine.bitmap_recycle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final a f29705a = new a();

    /* renamed from: b, reason: collision with root package name */
    public final Map f29706b = new HashMap();

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final Object f29707a;

        /* renamed from: b, reason: collision with root package name */
        public List f29708b;

        /* renamed from: c, reason: collision with root package name */
        public a f29709c;

        /* renamed from: d, reason: collision with root package name */
        public a f29710d;

        public a() {
            this(null);
        }

        public void a(Object obj) {
            if (this.f29708b == null) {
                this.f29708b = new ArrayList();
            }
            this.f29708b.add(obj);
        }

        public Object b() {
            int c10 = c();
            if (c10 > 0) {
                return this.f29708b.remove(c10 - 1);
            }
            return null;
        }

        public int c() {
            List list = this.f29708b;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        public a(Object obj) {
            this.f29710d = this;
            this.f29709c = this;
            this.f29707a = obj;
        }
    }

    public static void e(a aVar) {
        a aVar2 = aVar.f29710d;
        aVar2.f29709c = aVar.f29709c;
        aVar.f29709c.f29710d = aVar2;
    }

    public static void g(a aVar) {
        aVar.f29709c.f29710d = aVar;
        aVar.f29710d.f29709c = aVar;
    }

    public Object a(m mVar) {
        a aVar = (a) this.f29706b.get(mVar);
        if (aVar == null) {
            aVar = new a(mVar);
            this.f29706b.put(mVar, aVar);
        } else {
            mVar.a();
        }
        b(aVar);
        return aVar.b();
    }

    public final void b(a aVar) {
        e(aVar);
        a aVar2 = this.f29705a;
        aVar.f29710d = aVar2;
        aVar.f29709c = aVar2.f29709c;
        g(aVar);
    }

    public final void c(a aVar) {
        e(aVar);
        a aVar2 = this.f29705a;
        aVar.f29710d = aVar2.f29710d;
        aVar.f29709c = aVar2;
        g(aVar);
    }

    public void d(m mVar, Object obj) {
        a aVar = (a) this.f29706b.get(mVar);
        if (aVar == null) {
            aVar = new a(mVar);
            c(aVar);
            this.f29706b.put(mVar, aVar);
        } else {
            mVar.a();
        }
        aVar.a(obj);
    }

    public Object f() {
        for (a aVar = this.f29705a.f29710d; !aVar.equals(this.f29705a); aVar = aVar.f29710d) {
            Object b10 = aVar.b();
            if (b10 != null) {
                return b10;
            }
            e(aVar);
            this.f29706b.remove(aVar.f29707a);
            ((m) aVar.f29707a).a();
        }
        return null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("GroupedLinkedMap( ");
        a aVar = this.f29705a.f29709c;
        boolean z10 = false;
        while (!aVar.equals(this.f29705a)) {
            sb2.append('{');
            sb2.append(aVar.f29707a);
            sb2.append(':');
            sb2.append(aVar.c());
            sb2.append("}, ");
            aVar = aVar.f29709c;
            z10 = true;
        }
        if (z10) {
            sb2.delete(sb2.length() - 2, sb2.length());
        }
        sb2.append(" )");
        return sb2.toString();
    }
}
