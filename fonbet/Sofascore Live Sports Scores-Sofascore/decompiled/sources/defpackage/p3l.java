package defpackage;

import android.app.Application;
import android.content.SharedPreferences;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.odds.OddsCountryProvider;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lp3l;", "Lq8;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class p3l extends q8 {
    public final bfk e;
    public final s96 f;
    public final umd g;
    public final fyk h;
    public final SharedPreferences i;
    public final Event j;
    public final fdi k;
    public final jof l;
    public final fdi m;
    public final jof n;
    public final yzc o;
    public final yzc p;
    public final OddsCountryProvider q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3l(Application application, bfk bfkVar, s96 s96Var, umd umdVar, fyk fykVar, SharedPreferences sharedPreferences, s5d s5dVar, fqg fqgVar) {
        super(application);
        bfkVar.getClass();
        s96Var.getClass();
        umdVar.getClass();
        fykVar.getClass();
        sharedPreferences.getClass();
        s5dVar.getClass();
        fqgVar.getClass();
        this.e = bfkVar;
        this.f = s96Var;
        this.g = umdVar;
        this.h = fykVar;
        this.i = sharedPreferences;
        this.j = (Event) fqgVar.a("DAILY_BONUS_EVENT");
        fdi a = gdi.a(null);
        this.k = a;
        this.l = un0.u(a);
        fdi a2 = gdi.a(null);
        this.m = a2;
        this.n = un0.u(a2);
        yzc yzcVar = new yzc();
        this.o = yzcVar;
        this.p = yzcVar;
        bga bgaVar = xld.a;
        this.q = xld.a(i(), true);
        xw3.L(un0.z(this), null, null, new o3l(this, null), 3);
    }
}
