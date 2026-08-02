package defpackage;

import android.app.Application;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lbuf;", "Lynb;", "Lytf;", "Lltf;", "Lstf;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class buf extends ynb {
    public final dhk l;
    public final cg4 m;
    public final String n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public buf(Application application, dhk dhkVar, cg4 cg4Var) {
        super(application, new unb(new ytf(false, false)));
        dhkVar.getClass();
        cg4Var.getClass();
        this.l = dhkVar;
        this.m = cg4Var;
        ia0 ia0Var = ia0.q;
        this.n = fc6.e();
        rq3 rq3Var = null;
        xw3.L(un0.z(this), null, null, new auf(this, rq3Var, 0), 3);
        xw3.L(un0.z(this), null, null, new auf(this, rq3Var, 1), 3);
    }

    public final void t(ltf ltfVar) {
        int i = 3;
        rq3 rq3Var = null;
        if (ltfVar instanceof jtf) {
            xw3.L(un0.z(this), null, null, new auf(this, rq3Var, 2), 3);
            return;
        }
        if (ltfVar instanceof ktf) {
            xw3.L(un0.z(this), null, null, new auf(this, rq3Var, 4), 3);
        } else if (ltfVar instanceof itf) {
            xw3.L(un0.z(this), null, null, new auf(this, rq3Var, i), 3);
        } else {
            zzl.b();
        }
    }
}
