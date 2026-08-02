package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import com.sofascore.model.mvvm.model.Tournament;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.newNetwork.TournamentResponse;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcnc;", "Lq8;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class cnc extends q8 {
    public final w3b e;
    public final wqc f;
    public final yzc g;
    public final yzc h;
    public final zzc i;
    public final zzc j;
    public UniqueTournament k;
    public boolean l;
    public boolean m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnc(Application application, w3b w3bVar, wqc wqcVar) {
        super(application);
        w3bVar.getClass();
        wqcVar.getClass();
        this.e = w3bVar;
        this.f = wqcVar;
        yzc yzcVar = new yzc();
        this.g = yzcVar;
        this.h = yzcVar;
        zzc zzcVar = new zzc();
        this.i = zzcVar;
        this.j = zzcVar;
        this.l = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable k(int i, sq3 sq3Var) {
        zmc zmcVar;
        int i2;
        TournamentResponse tournamentResponse;
        Tournament tournament;
        if (sq3Var instanceof zmc) {
            zmcVar = (zmc) sq3Var;
            int i3 = zmcVar.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                zmcVar.t = i3 - Integer.MIN_VALUE;
                Object obj = zmcVar.r;
                lu3 lu3Var = lu3.a;
                i2 = zmcVar.t;
                if (i2 != 0) {
                    y6a.M(obj);
                    zmcVar.t = 1;
                    obj = this.e.j0(i, zmcVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                tournamentResponse = (TournamentResponse) obj;
                if (tournamentResponse != null || (tournament = tournamentResponse.getTournament()) == null) {
                    return null;
                }
                return tournament.getUniqueTournament();
            }
        }
        zmcVar = new zmc(this, sq3Var);
        Object obj2 = zmcVar.r;
        lu3 lu3Var2 = lu3.a;
        i2 = zmcVar.t;
        if (i2 != 0) {
        }
        tournamentResponse = (TournamentResponse) obj2;
        if (tournamentResponse != null) {
        }
        return null;
    }

    public final void l(int i, boolean z, boolean z2) {
        SharedPreferences d;
        if (z) {
            yaa.k(i, true, i());
        }
        rq3 rq3Var = null;
        if (!z2) {
            xw3.L(un0.z(this), null, null, new qu1(this, i, rq3Var, 18), 3);
            return;
        }
        Context i2 = i();
        SharedPreferences sharedPreferences = uic.j;
        if (sharedPreferences == null) {
            Context applicationContext = i2.getApplicationContext();
            synchronized (uic.i) {
                d = a5f.d(applicationContext);
                uic.j = d;
            }
            d.getClass();
            sharedPreferences = d;
        }
        wt3.v(sharedPreferences, "PREF_SHOW_MMA_ORGANIZATION_REMINDER", false);
        Unit unit = Unit.a;
        xw3.L(un0.z(this), null, null, new ppa(this, rq3Var, 16), 3);
    }
}
