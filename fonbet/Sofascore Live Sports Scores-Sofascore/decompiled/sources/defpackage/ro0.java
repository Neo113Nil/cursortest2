package defpackage;

import android.os.Handler;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ro0 {
    public final Handler a;
    public final mg6 b;

    public ro0(Handler handler, mg6 mg6Var, int i) {
        switch (i) {
            case 1:
                if (mg6Var != null) {
                    handler.getClass();
                } else {
                    handler = null;
                }
                this.a = handler;
                this.b = mg6Var;
                break;
            default:
                this.a = handler;
                this.b = mg6Var;
                break;
        }
    }

    public void a(dm4 dm4Var) {
        synchronized (dm4Var) {
        }
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new r0(14, this, dm4Var));
        }
    }

    public void b(zqk zqkVar) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new ecg(22, this, zqkVar));
        }
    }
}
