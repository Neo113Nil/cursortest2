package defpackage;

import android.app.Application;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ldw6;", "Ld50;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class dw6 extends d50 {
    public final wi7 c;
    public final Boolean d;
    public final fdi e;
    public final jof f;
    public final aeh g;
    public final hof h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dw6(wi7 wi7Var, fqg fqgVar, Application application) {
        super(application);
        wi7Var.getClass();
        fqgVar.getClass();
        this.c = wi7Var;
        this.d = (Boolean) fqgVar.a("FANTASY_FOCUS_ON_DESCRIPTION_EXTRA");
        fdi a = gdi.a(new cw6(false, false));
        this.e = a;
        this.f = un0.u(a);
        aeh b = beh.b(0, 0, null, 7);
        this.g = b;
        this.h = un0.t(b);
    }
}
