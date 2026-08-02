package defpackage;

import android.app.Application;
import com.sofascore.model.database.DisplayType;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ldyb;", "Lq8;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class dyb extends q8 {
    public final fdi e;
    public final jof f;
    public final aeh g;
    public final hof h;
    public Map i;
    public DisplayType j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dyb(Application application, cg4 cg4Var) {
        super(application);
        cg4Var.getClass();
        DisplayType displayType = DisplayType.DEFAULT;
        fdi a = gdi.a(new byb(displayType, rlh.b, false));
        this.e = a;
        this.f = un0.u(a);
        aeh b = beh.b(0, 0, null, 7);
        this.g = b;
        this.h = un0.t(b);
        lm5 lm5Var = lm5.a;
        lm5Var.getClass();
        this.i = lm5Var;
        this.j = displayType;
    }
}
