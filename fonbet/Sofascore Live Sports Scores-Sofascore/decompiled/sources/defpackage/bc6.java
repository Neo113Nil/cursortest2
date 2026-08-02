package defpackage;

import android.app.Application;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.network.response.LineupsResponse;
import com.sofascore.model.newNetwork.FootballShotmapItem;
import com.sofascore.model.newNetwork.FootballShotmapResponse;
import java.util.List;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lbc6;", "Lq8;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class bc6 extends q8 {
    public final s96 e;
    public final g39 f;
    public final yzc g;
    public final lec h;
    public boolean i;
    public boolean j;
    public LineupsResponse k;
    public g9i l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bc6(Application application, s96 s96Var, g39 g39Var) {
        super(application);
        s96Var.getClass();
        g39Var.getClass();
        this.e = s96Var;
        this.f = g39Var;
        yzc yzcVar = new yzc();
        this.g = yzcVar;
        this.h = waa.w(yzcVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Event event, sq3 sq3Var) {
        yb6 yb6Var;
        int i;
        List<FootballShotmapItem> shotmap;
        if (sq3Var instanceof yb6) {
            yb6Var = (yb6) sq3Var;
            int i2 = yb6Var.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yb6Var.t = i2 - Integer.MIN_VALUE;
                Object obj = yb6Var.r;
                lu3 lu3Var = lu3.a;
                i = yb6Var.t;
                rq3 rq3Var = null;
                if (i != 0) {
                    y6a.M(obj);
                    int id = event.getId();
                    yb6Var.t = 1;
                    g39 g39Var = this.f;
                    g39Var.getClass();
                    obj = yaa.P(new x29(g39Var, id, rq3Var, 0), yb6Var);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                FootballShotmapResponse footballShotmapResponse = (FootballShotmapResponse) yaa.x((x2g) obj);
                return (footballShotmapResponse != null || (shotmap = footballShotmapResponse.getShotmap()) == null) ? km5.a : shotmap;
            }
        }
        yb6Var = new yb6(this, sq3Var);
        Object obj2 = yb6Var.r;
        lu3 lu3Var2 = lu3.a;
        i = yb6Var.t;
        rq3 rq3Var2 = null;
        if (i != 0) {
        }
        FootballShotmapResponse footballShotmapResponse2 = (FootballShotmapResponse) yaa.x((x2g) obj2);
        if (footballShotmapResponse2 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(Event event, sq3 sq3Var) {
        zb6 zb6Var;
        int i;
        if (sq3Var instanceof zb6) {
            zb6Var = (zb6) sq3Var;
            int i2 = zb6Var.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zb6Var.t = i2 - Integer.MIN_VALUE;
                Object obj = zb6Var.r;
                lu3 lu3Var = lu3.a;
                i = zb6Var.t;
                if (i != 0) {
                    y6a.M(obj);
                    zb6Var.t = 1;
                    g39 g39Var = this.f;
                    g39Var.getClass();
                    obj = yaa.P(new c64(g39Var, event.getId(), Boolean.valueOf(event.shouldReverseTeams()), (rq3) null, 10), zb6Var);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                List list = (List) yaa.x((x2g) obj);
                return list != null ? km5.a : list;
            }
        }
        zb6Var = new zb6(this, sq3Var);
        Object obj2 = zb6Var.r;
        lu3 lu3Var2 = lu3.a;
        i = zb6Var.t;
        if (i != 0) {
        }
        List list2 = (List) yaa.x((x2g) obj2);
        if (list2 != null) {
        }
    }

    public final void m(Event event) {
        g9i g9iVar = this.l;
        if (g9iVar != null) {
            g9iVar.e(null);
        }
        iz2 z = un0.z(this);
        hs4 hs4Var = z45.a;
        this.l = xw3.L(z, hq4.c, null, new ac6(event, this, null), 2);
    }
}
