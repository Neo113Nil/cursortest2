package defpackage;

import android.app.Application;
import com.sofascore.model.newNetwork.EsportsGame;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lnz5;", "Lq8;", "kz5", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class nz5 extends q8 {
    public final zf5 e;
    public final s96 f;
    public final yzc g;
    public final lec h;
    public final yzc i;
    public final lec j;
    public g9i k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nz5(Application application, zf5 zf5Var, s96 s96Var) {
        super(application);
        zf5Var.getClass();
        s96Var.getClass();
        this.e = zf5Var;
        this.f = s96Var;
        yzc yzcVar = new yzc();
        this.g = yzcVar;
        this.h = waa.w(yzcVar);
        yzc yzcVar2 = new yzc();
        this.i = yzcVar2;
        this.j = waa.w(yzcVar2);
    }

    public final void k(EsportsGame esportsGame) {
        g9i g9iVar = this.k;
        rq3 rq3Var = null;
        if (g9iVar != null) {
            g9iVar.e(null);
        }
        this.k = xw3.L(un0.z(this), null, null, new mz5(this, esportsGame, rq3Var, 0), 3);
    }
}
