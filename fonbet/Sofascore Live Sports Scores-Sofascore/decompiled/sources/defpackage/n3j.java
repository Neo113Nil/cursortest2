package defpackage;

import android.app.Application;
import com.sofascore.model.newNetwork.StatisticsSeasonsResponse;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.a;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ln3j;", "Lkoj;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class n3j extends koj {
    public final j0j n;
    public StatisticsSeasonsResponse o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3j(w3b w3bVar, j0j j0jVar, Application application) {
        super(w3bVar, j0jVar, application);
        w3bVar.getClass();
        j0jVar.getClass();
        this.n = j0jVar;
    }

    @Override // defpackage.koj
    public final void G(int i, int i2, Integer num, String str) {
        str.getClass();
        rnj rnjVar = new rnj(i, i2, num, str, null);
        boj bojVar = boj.PLAYERS;
        C(rnjVar, a.c(bojVar), bojVar);
    }

    @Override // defpackage.koj
    public final void v(c3j c3jVar) {
        ynj ynjVar = (ynj) l().a();
        qnj qnjVar = ynjVar != null ? ynjVar.f : null;
        g3j g3jVar = qnjVar instanceof g3j ? (g3j) qnjVar : null;
        if (g3jVar == null) {
            return;
        }
        n(null, new vsc(23, g3jVar, c3jVar, this));
    }

    @Override // defpackage.koj
    public final Object x(List list, rnj rnjVar, boj bojVar, ajj ajjVar) {
        return s9a.r(new m3j(rnjVar, this, null), ajjVar);
    }
}
