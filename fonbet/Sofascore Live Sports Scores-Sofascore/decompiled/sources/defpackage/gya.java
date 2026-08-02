package defpackage;

import android.app.Application;
import android.content.Context;
import com.sofascore.model.mvvm.model.Season;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lgya;", "Lq8;", "cya", "bya", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class gya extends q8 {
    public static final String l = Season.SubSeasonType.OVERALL.getLabel();
    public final w3b e;
    public final yzc f;
    public final yzc g;
    public final yzc h;
    public final yzc i;
    public final Integer j;
    public Season k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gya(Application application, w3b w3bVar, fqg fqgVar) {
        super(application);
        w3bVar.getClass();
        fqgVar.getClass();
        this.e = w3bVar;
        yzc yzcVar = new yzc();
        this.f = yzcVar;
        this.g = yzcVar;
        yzc yzcVar2 = new yzc();
        this.h = yzcVar2;
        this.i = yzcVar2;
        Integer num = (Integer) fqgVar.a("uniqueTournamentId");
        this.j = num;
        if (num != null) {
            xw3.L(un0.z(this), null, null, new jr5(this, num.intValue(), (rq3) null, 6), 3);
        }
    }

    public final void k(Context context) {
        context.getClass();
        Integer num = this.j;
        if (num != null) {
            int intValue = num.intValue();
            Season season = this.k;
            if (season == null) {
                return;
            }
            xw3.L(un0.z(this), null, null, new eya(season, this, intValue, context, null), 3);
        }
    }
}
