package defpackage;

import android.app.Application;
import android.app.Service;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class r6h implements uv8 {
    public final Service a;
    public kc4 b;

    public r6h(Service service) {
        this.a = service;
    }

    @Override // defpackage.uv8
    public final Object f() {
        kc4 kc4Var = this.b;
        if (kc4Var != null) {
            return kc4Var;
        }
        Application application = this.a.getApplication();
        o3a.p(application instanceof uv8, "Hilt service must be attached to an @HiltAndroidApp Application. Found: %s", application.getClass());
        kc4 kc4Var2 = new kc4(((mc4) ((q6h) fz8.Q(q6h.class, application))).h);
        this.b = kc4Var2;
        return kc4Var2;
    }
}
