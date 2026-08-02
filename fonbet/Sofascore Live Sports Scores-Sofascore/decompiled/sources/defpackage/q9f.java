package defpackage;

import android.app.Application;
import com.sofascore.local_persistance.UserAccount;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lq9f;", "Lynb;", "Lpi5;", "Lg9f;", "", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class q9f extends ynb {
    public final dhk l;
    public final oi5 m;
    public final UserAccount n;
    public final String o;
    public final boolean p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q9f(Application application, dhk dhkVar, oi5 oi5Var, fqg fqgVar) {
        super(application, tnb.a);
        dhkVar.getClass();
        oi5Var.getClass();
        fqgVar.getClass();
        this.l = dhkVar;
        this.m = oi5Var;
        ia0 ia0Var = ia0.q;
        UserAccount e = ok3.p().e();
        this.n = e;
        String str = (String) fqgVar.a("OPEN_PROFILE_ID");
        str = str == null ? fc6.e() : str;
        this.o = str;
        this.p = Intrinsics.c(str, e.getId());
        xw3.L(un0.z(this), null, null, new ac6(this, null), 3);
    }
}
