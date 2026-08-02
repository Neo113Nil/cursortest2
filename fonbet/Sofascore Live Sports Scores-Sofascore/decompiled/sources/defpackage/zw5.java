package defpackage;

import android.app.Application;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Lineups;
import com.sofascore.model.network.response.LineupsResponse;
import kotlin.Metadata;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lzw5;", "Lx21;", "Lww5;", "Lsw5;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class zw5 extends x21 {
    public final s96 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zw5(s96 s96Var, Application application) {
        super(application);
        s96Var.getClass();
        this.o = s96Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.x21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object u(Event event, rq3 rq3Var) {
        yw5 yw5Var;
        int i;
        LineupsResponse lineupsResponse;
        if (rq3Var instanceof yw5) {
            yw5Var = (yw5) rq3Var;
            int i2 = yw5Var.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yw5Var.u = i2 - Integer.MIN_VALUE;
                Object obj = yw5Var.s;
                lu3 lu3Var = lu3.a;
                i = yw5Var.u;
                if (i != 0) {
                    y6a.M(obj);
                    yw5Var.r = event;
                    yw5Var.u = 1;
                    obj = this.o.p(event, yw5Var);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    event = yw5Var.r;
                    y6a.M(obj);
                }
                lineupsResponse = (LineupsResponse) obj;
                if (lineupsResponse != null) {
                    v(event, lineupsResponse);
                    Lineups homeLineups$default = LineupsResponse.getHomeLineups$default(lineupsResponse, null, 1, null);
                    Lineups awayLineups$default = LineupsResponse.getAwayLineups$default(lineupsResponse, null, 1, null);
                    gv9 W = m6k.W(i(), homeLineups$default.getPlayers(), homeLineups$default.getSupportStaff());
                    W.getClass();
                    this.m = W;
                    gv9 W2 = m6k.W(i(), awayLineups$default.getPlayers(), awayLineups$default.getSupportStaff());
                    W2.getClass();
                    this.n = W2;
                    n(new ww5(new e9b(), false), new r82(29, this, event));
                }
                return Unit.a;
            }
        }
        yw5Var = new yw5(this, (sq3) rq3Var);
        Object obj2 = yw5Var.s;
        lu3 lu3Var2 = lu3.a;
        i = yw5Var.u;
        if (i != 0) {
        }
        lineupsResponse = (LineupsResponse) obj2;
        if (lineupsResponse != null) {
        }
        return Unit.a;
    }

    @Override // defpackage.x21
    public final void x(boolean z) {
        n(null, new c31(z, 3));
    }
}
