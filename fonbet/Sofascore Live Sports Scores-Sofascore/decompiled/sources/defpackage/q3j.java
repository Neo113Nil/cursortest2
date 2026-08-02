package defpackage;

import android.app.Application;
import com.sofascore.model.newNetwork.TeamTransfersResponse;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lq3j;", "Lq8;", "p3j", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class q3j extends q8 {
    public final j0j e;
    public final Integer f;
    public TeamTransfersResponse g;
    public boolean h;
    public final yzc i;
    public final yzc j;
    public g9i k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3j(fqg fqgVar, j0j j0jVar, Application application) {
        super(application);
        j0jVar.getClass();
        fqgVar.getClass();
        this.e = j0jVar;
        this.f = (Integer) fqgVar.a("team_id");
        this.h = true;
        yzc yzcVar = new yzc();
        this.i = yzcVar;
        this.j = yzcVar;
        k();
    }

    public final void k() {
        Integer num = this.f;
        if (num != null) {
            int intValue = num.intValue();
            if (this.k == null) {
                this.k = xw3.L(un0.z(this), null, null, new anc(this, intValue, null, 16), 3);
            }
        }
    }

    public final p3j l(TeamTransfersResponse teamTransfersResponse) {
        return new p3j(!teamTransfersResponse.getTransfersIn().isEmpty(), !teamTransfersResponse.getTransfersOut().isEmpty(), this.h ? teamTransfersResponse.getTransfersIn() : teamTransfersResponse.getTransfersOut());
    }
}
