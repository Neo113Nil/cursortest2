package defpackage;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class oq7 extends xti {
    public final /* synthetic */ c8g e;
    public final /* synthetic */ pq7 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oq7(String str, c8g c8gVar, pq7 pq7Var) {
        super(str);
        this.e = c8gVar;
        this.f = pq7Var;
    }

    @Override // defpackage.xti
    public final long a() {
        b8g b8gVar;
        c8g c8gVar = this.e;
        try {
            b8gVar = c8gVar.g();
        } catch (Throwable th) {
            b8gVar = new b8g(c8gVar, null, th, 2);
        }
        pq7 pq7Var = this.f;
        if (!((CopyOnWriteArrayList) pq7Var.d).contains(c8gVar)) {
            return -1L;
        }
        ((LinkedBlockingDeque) pq7Var.e).put(b8gVar);
        return -1L;
    }
}
