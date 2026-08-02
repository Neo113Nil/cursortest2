package q1;

import android.net.Uri;
import b1.z;
import com.google.common.collect.m0;
import e1.AbstractC4134a;
import h1.C4420p;
import h1.InterfaceC4411g;
import java.util.Map;
import q1.C6099h;

/* renamed from: q1.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6103l implements w {

    /* renamed from: a, reason: collision with root package name */
    public final Object f63324a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public z.f f63325b;

    /* renamed from: c, reason: collision with root package name */
    public u f63326c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC4411g.a f63327d;

    /* renamed from: e, reason: collision with root package name */
    public String f63328e;

    /* renamed from: f, reason: collision with root package name */
    public D1.k f63329f;

    @Override // q1.w
    public u a(b1.z zVar) {
        u uVar;
        AbstractC4134a.e(zVar.f24655b);
        z.f fVar = zVar.f24655b.f24751c;
        if (fVar == null) {
            return u.f63350a;
        }
        synchronized (this.f63324a) {
            try {
                if (!fVar.equals(this.f63325b)) {
                    this.f63325b = fVar;
                    this.f63326c = b(fVar);
                }
                uVar = (u) AbstractC4134a.e(this.f63326c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return uVar;
    }

    public final u b(z.f fVar) {
        InterfaceC4411g.a aVar = this.f63327d;
        if (aVar == null) {
            aVar = new C4420p.b().f(this.f63328e);
        }
        Uri uri = fVar.f24710c;
        K k10 = new K(uri == null ? null : uri.toString(), fVar.f24715h, aVar);
        m0 it = fVar.f24712e.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            k10.c((String) entry.getKey(), (String) entry.getValue());
        }
        C6099h.b f10 = new C6099h.b().g(fVar.f24708a, J.f63235d).d(fVar.f24713f).e(fVar.f24714g).f(com.google.common.primitives.f.o(fVar.f24717j));
        D1.k kVar = this.f63329f;
        if (kVar != null) {
            f10.c(kVar);
        }
        C6099h a10 = f10.a(k10);
        a10.F(0, fVar.c());
        return a10;
    }
}
