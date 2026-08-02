package com.facebook.imagepipeline.producers;

import C7.InterfaceC1057v;
import com.facebook.hermes.intl.Constants;
import com.facebook.imagepipeline.request.b;
import com.facebook.react.devsupport.StackTraceHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.facebook.imagepipeline.producers.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3021e implements e0 {

    /* renamed from: n, reason: collision with root package name */
    public static final Set f30758n = D6.h.a(StackTraceHelper.ID_KEY, "uri_source");

    /* renamed from: o, reason: collision with root package name */
    public static final Object f30759o = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final com.facebook.imagepipeline.request.b f30760a;

    /* renamed from: b, reason: collision with root package name */
    public final String f30761b;

    /* renamed from: c, reason: collision with root package name */
    public final String f30762c;

    /* renamed from: d, reason: collision with root package name */
    public final g0 f30763d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f30764e;

    /* renamed from: f, reason: collision with root package name */
    public final b.c f30765f;

    /* renamed from: g, reason: collision with root package name */
    public final Map f30766g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f30767h;

    /* renamed from: i, reason: collision with root package name */
    public B7.f f30768i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f30769j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f30770k;

    /* renamed from: l, reason: collision with root package name */
    public final List f30771l;

    /* renamed from: m, reason: collision with root package name */
    public final InterfaceC1057v f30772m;

    public C3021e(com.facebook.imagepipeline.request.b bVar, String str, g0 g0Var, Object obj, b.c cVar, boolean z10, boolean z11, B7.f fVar, InterfaceC1057v interfaceC1057v) {
        this(bVar, str, null, null, g0Var, obj, cVar, z10, z11, fVar, interfaceC1057v);
    }

    public static void a(List list) {
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((f0) it.next()).b();
        }
    }

    public static void b(List list) {
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((f0) it.next()).a();
        }
    }

    public static void c(List list) {
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((f0) it.next()).d();
        }
    }

    public static void e(List list) {
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((f0) it.next()).c();
        }
    }

    @Override // com.facebook.imagepipeline.producers.e0
    public synchronized boolean A0() {
        return this.f30769j;
    }

    @Override // com.facebook.imagepipeline.producers.e0
    public void B(String str, String str2) {
        this.f30766g.put("origin", str);
        this.f30766g.put("origin_sub", str2);
    }

    @Override // com.facebook.imagepipeline.producers.e0
    public com.facebook.imagepipeline.request.b D0() {
        return this.f30760a;
    }

    @Override // com.facebook.imagepipeline.producers.e0
    public String J() {
        return this.f30762c;
    }

    @Override // com.facebook.imagepipeline.producers.e0
    public b.c T1() {
        return this.f30765f;
    }

    @Override // n7.InterfaceC5672a
    public void U(String str, Object obj) {
        if (f30758n.contains(str)) {
            return;
        }
        this.f30766g.put(str, obj);
    }

    @Override // com.facebook.imagepipeline.producers.e0
    public Object d() {
        return this.f30764e;
    }

    public void f() {
        a(g());
    }

    public synchronized List g() {
        if (this.f30770k) {
            return null;
        }
        this.f30770k = true;
        return new ArrayList(this.f30771l);
    }

    @Override // n7.InterfaceC5672a
    public Map getExtras() {
        return this.f30766g;
    }

    @Override // com.facebook.imagepipeline.producers.e0
    public String getId() {
        return this.f30761b;
    }

    @Override // com.facebook.imagepipeline.producers.e0
    public synchronized B7.f getPriority() {
        return this.f30768i;
    }

    public synchronized List h(boolean z10) {
        if (z10 == this.f30769j) {
            return null;
        }
        this.f30769j = z10;
        return new ArrayList(this.f30771l);
    }

    public synchronized List i(boolean z10) {
        if (z10 == this.f30767h) {
            return null;
        }
        this.f30767h = z10;
        return new ArrayList(this.f30771l);
    }

    public synchronized List j(B7.f fVar) {
        if (fVar == this.f30768i) {
            return null;
        }
        this.f30768i = fVar;
        return new ArrayList(this.f30771l);
    }

    @Override // com.facebook.imagepipeline.producers.e0
    public void k(f0 f0Var) {
        boolean z10;
        synchronized (this) {
            this.f30771l.add(f0Var);
            z10 = this.f30770k;
        }
        if (z10) {
            f0Var.b();
        }
    }

    @Override // n7.InterfaceC5672a
    public void m1(Map map) {
        if (map == null) {
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            U((String) entry.getKey(), entry.getValue());
        }
    }

    @Override // com.facebook.imagepipeline.producers.e0
    public synchronized boolean n1() {
        return this.f30767h;
    }

    @Override // com.facebook.imagepipeline.producers.e0
    public InterfaceC1057v r() {
        return this.f30772m;
    }

    @Override // com.facebook.imagepipeline.producers.e0
    public void w0(String str) {
        B(str, Constants.COLLATION_DEFAULT);
    }

    @Override // n7.InterfaceC5672a
    public Object y1(String str) {
        return this.f30766g.get(str);
    }

    @Override // com.facebook.imagepipeline.producers.e0
    public g0 z0() {
        return this.f30763d;
    }

    public C3021e(com.facebook.imagepipeline.request.b bVar, String str, String str2, Map map, g0 g0Var, Object obj, b.c cVar, boolean z10, boolean z11, B7.f fVar, InterfaceC1057v interfaceC1057v) {
        this.f30760a = bVar;
        this.f30761b = str;
        HashMap hashMap = new HashMap();
        this.f30766g = hashMap;
        hashMap.put(StackTraceHelper.ID_KEY, str);
        hashMap.put("uri_source", bVar == null ? "null-request" : bVar.getSourceUri());
        m1(map);
        this.f30762c = str2;
        this.f30763d = g0Var;
        this.f30764e = obj == null ? f30759o : obj;
        this.f30765f = cVar;
        this.f30767h = z10;
        this.f30768i = fVar;
        this.f30769j = z11;
        this.f30770k = false;
        this.f30771l = new ArrayList();
        this.f30772m = interfaceC1057v;
    }
}
