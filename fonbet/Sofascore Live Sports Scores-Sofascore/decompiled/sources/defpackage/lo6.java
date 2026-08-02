package defpackage;

import android.app.Application;
import android.content.SharedPreferences;
import androidx.compose.runtime.e;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Llo6;", "Lq8;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class lo6 extends q8 {
    public final wi7 e;
    public final SharedPreferences f;
    public final ev6 g;
    public final String h;
    public final e1d i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lo6(Application application, fqg fqgVar, wi7 wi7Var, SharedPreferences sharedPreferences) {
        super(application);
        fqgVar.getClass();
        wi7Var.getClass();
        sharedPreferences.getClass();
        this.e = wi7Var;
        this.f = sharedPreferences;
        Object a = fqgVar.a("FANTASY_COMPETITION_EXTRA");
        rq3 rq3Var = null;
        if (a == null) {
            a70.r("Required value was null.");
            throw null;
        }
        this.g = (ev6) a;
        ia0 ia0Var = ia0.q;
        this.h = fc6.e();
        rlh rlhVar = rlh.b;
        this.i = e.f(new ko6(rlhVar, rlhVar, true));
        xw3.L(un0.z(this), null, null, new ce4(this, rq3Var, 21), 3);
    }
}
