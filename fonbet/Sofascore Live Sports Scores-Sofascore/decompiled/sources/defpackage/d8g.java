package defpackage;

import java.net.Proxy;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class d8g {
    public final lk a;
    public final cqa b;
    public final pof c;
    public final boolean d;
    public final List e;
    public int f;
    public List g;
    public final ArrayList h;

    public d8g(lk lkVar, cqa cqaVar, pof pofVar, boolean z) {
        List k;
        cqaVar.getClass();
        this.a = lkVar;
        this.b = cqaVar;
        this.c = pofVar;
        this.d = z;
        km5 km5Var = km5.a;
        this.e = km5Var;
        this.g = km5Var;
        this.h = new ArrayList();
        jl9 jl9Var = lkVar.h;
        pofVar.d.getClass();
        URI i = jl9Var.i();
        if (i.getHost() == null) {
            k = yol.k(new Proxy[]{Proxy.NO_PROXY});
        } else {
            List<Proxy> select = lkVar.g.select(i);
            k = (select == null || select.isEmpty()) ? yol.k(new Proxy[]{Proxy.NO_PROXY}) : yol.j(select);
        }
        this.e = k;
        this.f = 0;
        f26 f26Var = pofVar.d;
        List list = this.e;
        f26Var.getClass();
        list.getClass();
    }

    public final boolean a() {
        return this.f < this.e.size() || !this.h.isEmpty();
    }
}
