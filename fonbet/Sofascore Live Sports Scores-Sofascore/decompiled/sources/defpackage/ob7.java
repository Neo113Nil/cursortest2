package defpackage;

import android.app.Application;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lob7;", "Lq8;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ob7 extends q8 {
    public final wi7 e;
    public final fdi f;
    public final jof g;
    public final String h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ob7(wi7 wi7Var, Application application) {
        super(application);
        wi7Var.getClass();
        this.e = wi7Var;
        fdi a = gdi.a(new mb7());
        this.f = a;
        this.g = un0.K(new v98(new ip1(this, null, 18), a), un0.z(this), new uci(5000L, Long.MAX_VALUE), new mb7());
        this.h = dv3.c();
    }

    public final void k(boolean z) {
        while (true) {
            fdi fdiVar = this.f;
            Object value = fdiVar.getValue();
            boolean z2 = z;
            if (fdiVar.k(value, mb7.a((mb7) value, null, null, null, z2, false, null, 55))) {
                return;
            } else {
                z = z2;
            }
        }
    }
}
