package defpackage;

import android.app.Application;
import com.bumptech.glide.a;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class mf0 implements uff {
    public final /* synthetic */ int a;
    public final Object b;

    public mf0(it7 it7Var, ec4 ec4Var) {
        this.a = 1;
        this.b = ec4Var;
    }

    @Override // defpackage.yff
    public final Object get() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Application application = (Application) ((sz8) obj).b;
                x2a.w(application);
                return application;
            case 1:
                n0g c = a.c((Application) ((ec4) obj).get());
                x2a.w(c);
                return c;
            default:
                v38 v38Var = (v38) ((sz8) obj).b;
                x2a.w(v38Var);
                return v38Var;
        }
    }

    public /* synthetic */ mf0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
