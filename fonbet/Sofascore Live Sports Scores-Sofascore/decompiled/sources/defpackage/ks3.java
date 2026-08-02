package defpackage;

import android.app.Application;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lks3;", "Lynb;", "Lis3;", "Lur3;", "", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ks3 extends ynb {
    public final dhk l;
    public final String m;
    public final boolean n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ks3(Application application, dhk dhkVar, fqg fqgVar) {
        super(application, tnb.a);
        dhkVar.getClass();
        fqgVar.getClass();
        this.l = dhkVar;
        String str = (String) fqgVar.a("OPEN_PROFILE_ID");
        if (str == null) {
            ia0 ia0Var = ia0.q;
            str = fc6.e();
        }
        this.m = str;
        ia0 ia0Var2 = ia0.q;
        this.n = Intrinsics.c(str, ok3.p().e().getId());
        xw3.L(un0.z(this), null, null, new jk(this, (rq3) null, 4), 3);
    }
}
