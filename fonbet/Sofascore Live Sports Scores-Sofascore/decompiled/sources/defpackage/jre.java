package defpackage;

import android.app.Application;
import androidx.compose.runtime.e;
import com.sofascore.model.mvvm.model.Player;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ljre;", "Lq8;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class jre extends q8 {
    public final wi7 e;
    public final Player f;
    public final Integer g;
    public final e1d h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jre(wi7 wi7Var, fqg fqgVar, Application application) {
        super(application);
        fqgVar.getClass();
        wi7Var.getClass();
        this.e = wi7Var;
        Object a = fqgVar.a("PLAYER");
        if (a == null) {
            a70.r("Required value was null.");
            throw null;
        }
        this.f = (Player) a;
        this.g = (Integer) fqgVar.a("POSITION_ON_FANTASY");
        rlh rlhVar = rlh.b;
        this.h = e.f(new hre(null, null, null, null, rlhVar, rlhVar, true, false));
    }

    public final hre k() {
        return (hre) ((eoh) this.h).getValue();
    }

    public final void l(tn6 tn6Var) {
        ((eoh) this.h).setValue(hre.a(k(), null, tn6Var, null, null, null, true, false, 445));
        xw3.L(un0.z(this), null, null, new q7c(this, tn6Var, (rq3) null, 4), 3);
    }
}
