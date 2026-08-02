package defpackage;

import android.os.Handler;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class qo0 {
    public final Handler a;
    public final lg6 b;

    public /* synthetic */ qo0(Handler handler, lg6 lg6Var) {
        this.a = handler;
        this.b = lg6Var;
    }

    public void a(dm4 dm4Var) {
        synchronized (dm4Var) {
        }
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new r0(15, this, dm4Var));
        }
    }
}
