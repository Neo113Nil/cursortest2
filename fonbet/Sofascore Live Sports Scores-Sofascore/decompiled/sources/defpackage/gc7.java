package defpackage;

import android.app.Application;
import androidx.compose.runtime.e;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lgc7;", "Lq8;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class gc7 extends q8 {
    public final wi7 e;
    public final int f;
    public final List g;
    public final e1d h;
    public final g62 i;
    public final nn2 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gc7(wi7 wi7Var, fqg fqgVar, Application application) {
        super(application);
        fqgVar.getClass();
        wi7Var.getClass();
        this.e = wi7Var;
        Object a = fqgVar.a("roundId");
        rq3 rq3Var = null;
        if (a == null) {
            a70.r("Required value was null.");
            throw null;
        }
        this.f = ((Number) a).intValue();
        Object a2 = fqgVar.a("squad");
        if (a2 == null) {
            a70.r("Required value was null.");
            throw null;
        }
        this.g = (List) a2;
        km5 km5Var = km5.a;
        this.h = e.f(new ec7(km5Var, km5Var, null, Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), 0));
        g62 g = ml4.g(0, 7, null);
        this.i = g;
        this.j = f5p.J(g);
        xw3.L(un0.z(this), null, null, new fc7(this, rq3Var, 1), 3);
    }
}
