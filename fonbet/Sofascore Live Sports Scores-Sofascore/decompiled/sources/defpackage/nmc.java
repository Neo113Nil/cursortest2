package defpackage;

import android.app.Application;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lnmc;", "Lq8;", "lmc", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class nmc extends q8 {
    public final vrj e;
    public final s96 f;
    public final Long g;
    public final mqi h;
    public final yzc i;
    public final yzc j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nmc(Application application, fqg fqgVar, vrj vrjVar, s96 s96Var) {
        super(application);
        fqgVar.getClass();
        vrjVar.getClass();
        s96Var.getClass();
        this.e = vrjVar;
        this.f = s96Var;
        this.g = (Long) fqgVar.a("ARG_WEEK_MIDDLE_EPOCH_SECONDS");
        this.h = ypa.b(new xxb(this, 2));
        yzc yzcVar = new yzc();
        this.i = yzcVar;
        this.j = yzcVar;
    }
}
