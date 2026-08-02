package defpackage;

import android.app.Application;
import com.sofascore.model.mvvm.model.AiAnalystDemoEvent;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lxdk;", "Lq8;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class xdk extends q8 {
    public final bfk e;
    public final s96 f;
    public final bli g;
    public final fdi h;
    public final jof i;
    public final aeh j;
    public final hof k;
    public AiAnalystDemoEvent l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xdk(Application application, bfk bfkVar, s96 s96Var, bli bliVar) {
        super(application);
        bfkVar.getClass();
        s96Var.getClass();
        bliVar.getClass();
        this.e = bfkVar;
        this.f = s96Var;
        this.g = bliVar;
        fdi a = gdi.a(rm5.a);
        this.h = a;
        this.i = un0.u(a);
        rq3 rq3Var = null;
        aeh b = beh.b(0, 0, null, 7);
        this.j = b;
        this.k = un0.t(b);
        xw3.L(un0.z(this), null, null, new vdk(this, rq3Var, 0), 3);
        xw3.L(un0.z(this), null, null, new udk(this, rq3Var, 1), 3);
    }

    @Override // defpackage.ltk
    public final void e() {
        this.g.a();
    }
}
