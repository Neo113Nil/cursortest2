package defpackage;

import android.app.Application;
import com.sofascore.model.newNetwork.commentary.Comment;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lq81;", "Lq8;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class q81 extends q8 {
    public final s96 e;
    public final int f;
    public final int g;
    public final String h;
    public final int i;
    public final Comment j;
    public final Float k;
    public final Float l;
    public final fdi m;
    public final jof n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q81(Application application, fqg fqgVar, s96 s96Var) {
        super(application);
        fqgVar.getClass();
        s96Var.getClass();
        this.e = s96Var;
        Object a = fqgVar.a("BASEBALL_COMMENTARY_AT_EVENT_ID");
        rq3 rq3Var = null;
        if (a == null) {
            a70.p("Required value was null.");
            throw null;
        }
        this.f = ((Number) a).intValue();
        Object a2 = fqgVar.a("BASEBALL_COMMENTARY_AT_TEAM_ID");
        if (a2 == null) {
            a70.p("Required value was null.");
            throw null;
        }
        this.g = ((Number) a2).intValue();
        Object a3 = fqgVar.a("BASEBALL_COMMENTARY_AT_TEAM_DISPLAY_NAME");
        if (a3 == null) {
            a70.p("Required value was null.");
            throw null;
        }
        this.h = (String) a3;
        Object a4 = fqgVar.a("BASEBALL_COMMENTARY_AT_BAT_ID");
        if (a4 == null) {
            a70.p("Required value was null.");
            throw null;
        }
        this.i = ((Number) a4).intValue();
        Object a5 = fqgVar.a("BASEBALL_COMMENTARY_MODAL_DATA");
        if (a5 == null) {
            a70.p("Required value was null.");
            throw null;
        }
        this.j = (Comment) a5;
        this.k = (Float) fqgVar.a("BASEBALL_COMMENTARY_AT_BAT_PROBABILITY");
        this.l = (Float) fqgVar.a("BASEBALL_COMMENTARY_AT_BAT_PROBABILITY_DIFF");
        fdi a6 = gdi.a(tnb.a);
        this.m = a6;
        this.n = un0.u(a6);
        xw3.L(un0.z(this), null, null, new q3(this, rq3Var, 7), 3);
    }
}
