package defpackage;

import android.app.Application;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ly1e;", "Lq8;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class y1e extends q8 {
    public final fdi e;
    public final jof f;
    public final int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1e(Application application, fqg fqgVar, lue lueVar) {
        super(application);
        fqgVar.getClass();
        lueVar.getClass();
        fdi a = gdi.a(rlh.b);
        this.e = a;
        this.f = un0.u(a);
        Object a2 = fqgVar.a("UNIQUE_TOURNAMENT_ID");
        rq3 rq3Var = null;
        if (a2 == null) {
            a70.r("Required value was null.");
            throw null;
        }
        this.g = ((Number) a2).intValue();
        xw3.L(un0.z(this), null, null, new gjb(lueVar, this, rq3Var, 24), 3);
    }
}
