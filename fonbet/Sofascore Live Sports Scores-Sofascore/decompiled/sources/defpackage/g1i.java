package defpackage;

import android.app.Application;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lg1i;", "Lq8;", "f1i", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class g1i extends q8 {
    public final s96 e;
    public final umd f;
    public final amd g;
    public final yzc h;
    public final yzc i;
    public final yzc j;
    public final yzc k;
    public final yzc l;
    public final yzc m;
    public final yzc n;
    public final yzc o;
    public final jof p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1i(Application application, fqg fqgVar, s96 s96Var, umd umdVar, amd amdVar, bt7 bt7Var) {
        super(application);
        fqgVar.getClass();
        s96Var.getClass();
        umdVar.getClass();
        amdVar.getClass();
        this.e = s96Var;
        this.f = umdVar;
        this.g = amdVar;
        Integer num = (Integer) fqgVar.a("STAGE_SPORT");
        int intValue = num != null ? num.intValue() : 0;
        yzc yzcVar = new yzc();
        this.h = yzcVar;
        this.i = yzcVar;
        yzc yzcVar2 = new yzc();
        this.j = yzcVar2;
        this.k = yzcVar2;
        yzc yzcVar3 = new yzc();
        this.l = yzcVar3;
        this.m = yzcVar3;
        yzc yzcVar4 = new yzc();
        this.n = yzcVar4;
        this.o = yzcVar4;
        this.p = un0.K(bt7Var.a.f(), un0.z(this), new uci(5000L, Long.MAX_VALUE), null);
        xw3.L(un0.z(this), null, null, new z23(this, intValue, (rq3) null, 17), 3);
    }
}
