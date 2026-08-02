package com.bykv.vk.openvk.preload.a;

import defpackage.a70;
import defpackage.yhk;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
final class i implements b {
    protected e a;
    private int b;
    private List<h> c;
    private d d;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a extends Exception {
        public a(Throwable th) {
            super(th);
        }
    }

    public i(List<h> list, int i, e eVar, d dVar) {
        this.c = list;
        this.b = i;
        this.a = eVar;
        this.d = dVar;
    }

    private d c(Class cls) {
        d dVar = this.d;
        while (dVar != null && dVar.getClass() != cls) {
            dVar = dVar.a;
        }
        return dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bykv.vk.openvk.preload.a.b
    public final Object a(Object obj) throws Exception {
        d dVar = this.d;
        if (dVar != null) {
            dVar.c = obj;
            dVar.e();
        }
        if (this.b >= this.c.size()) {
            return obj;
        }
        h hVar = this.c.get(this.b);
        Class<? extends d> cls = hVar.a;
        d dVar2 = (d) this.a.a(cls);
        if (dVar2 == null) {
            yhk.m("interceptor == null , index = ", obj, " , class: ", cls);
            return null;
        }
        com.bykv.vk.openvk.preload.a.b.a a2 = hVar.a();
        i iVar = new i(this.c, this.b + 1, this.a, dVar2);
        dVar2.a(iVar, this.d, obj, a2, hVar.b());
        dVar2.c();
        try {
            Object a3 = dVar2.a(iVar, obj);
            dVar2.d();
            return a3;
        } catch (a e) {
            dVar2.c(e.getCause());
            throw e;
        } catch (Throwable th) {
            dVar2.b(th);
            throw new a(th);
        }
    }

    @Override // com.bykv.vk.openvk.preload.a.b
    public final Object b(Class cls) {
        d c = c(cls);
        if (c != null) {
            return c.c;
        }
        a70.p("can not find pre Interceptor , class:".concat(String.valueOf(cls)));
        return null;
    }

    @Override // com.bykv.vk.openvk.preload.a.b
    public final Object a(Class cls) {
        d c = c(cls);
        if (c != null) {
            return c.b;
        }
        a70.p("can not find pre Interceptor , class:".concat(String.valueOf(cls)));
        return null;
    }
}
