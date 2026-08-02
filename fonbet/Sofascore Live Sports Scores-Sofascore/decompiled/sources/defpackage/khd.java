package defpackage;

import android.app.Application;
import android.content.Context;
import com.sofascore.results.service.RingtoneWorker;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lkhd;", "Lynb;", "Lhhd;", "Lrgd;", "Lahd;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class khd extends ynb {
    public final yhd l;
    public boolean m;
    public final g62 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public khd(Application application, yhd yhdVar, gzh gzhVar) {
        super(application, tnb.a);
        yhdVar.getClass();
        gzhVar.getClass();
        this.l = yhdVar;
        this.m = true;
        rq3 rq3Var = null;
        g62 g = ml4.g(0, 7, null);
        this.n = g;
        fcp.m0(new v98(dy0.r(hkg.H(zm2.s(yhdVar.a.a, false, new String[]{"notification_settings"}, new a7d(20))), hkg.H(new dzh(zm2.s(gzhVar.a.a, false, new String[]{"sport_order"}, new z1h(24)), gzhVar, 0)), f5p.J(g), new ihd(4, rq3Var)), new qa7(this, rq3Var, 26), 3), un0.z(this));
    }

    public final void t(rgd rgdVar) {
        int i = 3;
        rq3 rq3Var = null;
        if (rgdVar.equals(ngd.a)) {
            xw3.L(un0.z(this), null, null, new jhd(this, rq3Var, 2), 3);
        } else if (rgdVar.equals(ogd.a)) {
            xw3.L(un0.z(this), null, null, new jhd(this, rq3Var, i), 3);
        }
    }

    public final void u() {
        n(null, new a7d(16));
        Context i = i();
        ktd A = mha.A(new ktd(RingtoneWorker.class));
        mha.y(A);
        vxd.h(i).b("RingtoneWorker-".concat(""), nf6.a, (ltd) A.a());
    }
}
