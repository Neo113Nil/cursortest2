package defpackage;

import android.app.Application;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lybf;", "Lq8;", "wbf", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ybf extends q8 {
    public final a3l e;
    public final dhk f;
    public final oi5 g;
    public final yzc h;
    public final yzc i;
    public final yzc j;
    public final yzc k;
    public boolean l;
    public boolean m;
    public final String n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ybf(Application application, a3l a3lVar, dhk dhkVar, oi5 oi5Var, fqg fqgVar) {
        super(application);
        a3lVar.getClass();
        dhkVar.getClass();
        oi5Var.getClass();
        fqgVar.getClass();
        this.e = a3lVar;
        this.f = dhkVar;
        this.g = oi5Var;
        yzc yzcVar = new yzc();
        this.h = yzcVar;
        this.i = yzcVar;
        yzc yzcVar2 = new yzc();
        this.j = yzcVar2;
        this.k = yzcVar2;
        this.l = true;
        String str = (String) fqgVar.a("OPEN_PROFILE_ID");
        if (str == null) {
            ia0 ia0Var = ia0.q;
            str = fc6.e();
        }
        this.n = str;
        ia0 ia0Var2 = ia0.q;
        Intrinsics.c(str, ok3.p().e().getId());
    }
}
