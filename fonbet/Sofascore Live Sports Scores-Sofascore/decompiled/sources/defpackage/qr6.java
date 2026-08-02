package defpackage;

import android.app.Application;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lqr6;", "Le37;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class qr6 extends e37 {
    public final ev6 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qr6(wi7 wi7Var, fqg fqgVar, Application application) {
        super(wi7Var, application);
        wi7Var.getClass();
        fqgVar.getClass();
        Object a = fqgVar.a("USER_COMPETITION_EXTRA");
        rq3 rq3Var = null;
        if (a == null) {
            a70.r("Required value was null.");
            throw null;
        }
        this.k = ((do7) a).c;
        xw3.L(un0.z(this), null, null, new ce4(wi7Var, this, rq3Var, 29), 3);
    }

    @Override // defpackage.e37
    /* renamed from: l, reason: from getter */
    public final ev6 getK() {
        return this.k;
    }
}
