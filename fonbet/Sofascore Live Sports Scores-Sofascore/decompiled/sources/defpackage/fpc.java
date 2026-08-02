package defpackage;

import android.app.Application;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lfpc;", "Lq8;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class fpc extends q8 {
    public final w3b e;
    public final int f;
    public final yzc g;
    public final yzc h;
    public final yzc i;
    public final yzc j;
    public final hof k;
    public final jof l;
    public boolean m;
    public boolean n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fpc(Application application, w3b w3bVar, bt7 bt7Var, fqg fqgVar) {
        super(application);
        w3bVar.getClass();
        fqgVar.getClass();
        this.e = w3bVar;
        Integer num = (Integer) fqgVar.a("ORGANISATION_ID");
        int intValue = num != null ? num.intValue() : 0;
        this.f = intValue;
        yzc yzcVar = new yzc();
        this.g = yzcVar;
        this.h = yzcVar;
        yzc yzcVar2 = new yzc();
        this.i = yzcVar2;
        this.j = yzcVar2;
        irj irjVar = w3bVar.a;
        hof H = un0.H(hkg.H(zm2.s(irjVar.a, false, new String[]{"leagues"}, new tj(intValue, irjVar, 14))), un0.z(this), new uci(5000L, Long.MAX_VALUE), 0);
        this.k = H;
        this.l = un0.K(la8.a(H, new lr5(null, bt7Var, 3)), un0.z(this), new uci(5000L, Long.MAX_VALUE), null);
        this.m = true;
    }
}
