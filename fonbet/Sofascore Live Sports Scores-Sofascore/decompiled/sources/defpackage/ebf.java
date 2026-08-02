package defpackage;

import android.app.Application;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lebf;", "Lq8;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ebf extends q8 {
    public final dhk e;
    public final yzc f;
    public final yzc g;
    public final String h;
    public final boolean i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ebf(Application application, dhk dhkVar, fqg fqgVar) {
        super(application);
        dhkVar.getClass();
        fqgVar.getClass();
        this.e = dhkVar;
        yzc yzcVar = new yzc();
        this.f = yzcVar;
        this.g = yzcVar;
        String str = (String) fqgVar.a("OPEN_PROFILE_ID");
        if (str == null) {
            ia0 ia0Var = ia0.q;
            str = fc6.e();
        }
        this.h = str;
        ia0 ia0Var2 = ia0.q;
        this.i = Intrinsics.c(str, ok3.p().e().getId());
        xw3.L(un0.z(this), null, null, new ppa(this, null, 26), 3);
    }
}
