package defpackage;

import android.app.Application;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lrnc;", "Lq8;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class rnc extends q8 {
    public final j0j e;
    public final int f;
    public final yzc g;
    public final yzc h;
    public final hof i;
    public final jof j;
    public boolean k;
    public boolean l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rnc(Application application, j0j j0jVar, bt7 bt7Var, fqg fqgVar) {
        super(application);
        j0jVar.getClass();
        fqgVar.getClass();
        this.e = j0jVar;
        Integer num = (Integer) fqgVar.a("FIGHTER_ID");
        int intValue = num != null ? num.intValue() : 0;
        this.f = intValue;
        yzc yzcVar = new yzc();
        this.g = yzcVar;
        this.h = yzcVar;
        hof H = un0.H(j0jVar.e(intValue), un0.z(this), new uci(5000L, Long.MAX_VALUE), 0);
        this.i = H;
        this.j = un0.K(la8.a(H, new lr5(null, bt7Var, 2)), un0.z(this), new uci(5000L, Long.MAX_VALUE), null);
        this.k = true;
    }
}
