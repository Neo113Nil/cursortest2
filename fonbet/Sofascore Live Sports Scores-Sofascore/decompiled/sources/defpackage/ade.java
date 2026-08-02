package defpackage;

import android.app.Application;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lade;", "Lq8;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ade extends q8 {
    public final wve e;
    public final int f;
    public final Integer g;
    public final int h;
    public final Integer i;
    public final fdi j;
    public final jof k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ade(wve wveVar, fqg fqgVar, Application application) {
        super(application);
        wveVar.getClass();
        fqgVar.getClass();
        this.e = wveVar;
        Object a = fqgVar.a("takerPlayerId");
        if (a == null) {
            a70.p("Required value was null.");
            throw null;
        }
        this.f = ((Number) a).intValue();
        this.g = (Integer) fqgVar.a("goalkeeperPlayerId");
        Object a2 = fqgVar.a("takerTeamId");
        if (a2 == null) {
            a70.p("Required value was null.");
            throw null;
        }
        this.h = ((Number) a2).intValue();
        this.i = (Integer) fqgVar.a("goalkeeperTeamId");
        fdi a3 = gdi.a(null);
        this.j = a3;
        this.k = un0.u(a3);
        xw3.L(un0.z(this), null, null, new q7c(this, null), 3);
    }
}
