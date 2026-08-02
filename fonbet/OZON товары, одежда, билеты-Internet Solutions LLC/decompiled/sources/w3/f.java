package w3;

import android.net.Uri;
import com.google.common.collect.f0;
import j3.C7275q;
import java.util.Map;
import p3.k;
import w3.C10425b;

/* loaded from: classes.dex */
public final class f implements k {

    /* renamed from: a, reason: collision with root package name */
    private final Object f103469a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private C7275q.d f103470b;

    /* renamed from: c, reason: collision with root package name */
    private C10425b f103471c;

    private static C10425b b(C7275q.d dVar) {
        k.a aVar = new k.a();
        Uri uri = dVar.f69215b;
        s sVar = new s(uri == null ? null : uri.toString(), dVar.f69219f, aVar);
        f0<Map.Entry<String, String>> it = dVar.f69216c.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> next = it.next();
            sVar.c(next.getKey(), next.getValue());
        }
        C10425b.a aVar2 = new C10425b.a();
        aVar2.e(dVar.f69214a);
        aVar2.b(dVar.f69217d);
        aVar2.c(dVar.f69218e);
        aVar2.d(com.google.common.primitives.b.f(dVar.f69220g));
        C10425b a11 = aVar2.a(sVar);
        a11.y(dVar.c());
        return a11;
    }

    @Override // w3.k
    public final j a(C7275q c7275q) {
        C10425b c10425b;
        c7275q.f69184b.getClass();
        C7275q.d dVar = c7275q.f69184b.f69242c;
        if (dVar == null) {
            return j.f103481a;
        }
        synchronized (this.f103469a) {
            try {
                if (!dVar.equals(this.f103470b)) {
                    this.f103470b = dVar;
                    this.f103471c = b(dVar);
                }
                c10425b = this.f103471c;
                c10425b.getClass();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c10425b;
    }
}
