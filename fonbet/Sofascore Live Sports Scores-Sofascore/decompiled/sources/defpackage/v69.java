package defpackage;

import android.os.Handler;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class v69 extends gsg {
    public final Handler a;

    public v69(Handler handler) {
        this.a = handler;
    }

    @Override // defpackage.gsg
    public final fsg a() {
        return new t69(this.a);
    }

    @Override // defpackage.gsg
    public final k55 c(Runnable runnable) {
        if (TimeUnit.NANOSECONDS == null) {
            yhk.s("unit == null");
            return null;
        }
        Handler handler = this.a;
        u69 u69Var = new u69(handler, runnable);
        handler.postDelayed(u69Var, 0L);
        return u69Var;
    }
}
