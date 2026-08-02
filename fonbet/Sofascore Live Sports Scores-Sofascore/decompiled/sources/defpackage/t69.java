package defpackage;

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class t69 extends fsg {
    public final Handler a;
    public volatile boolean b;

    public t69(Handler handler) {
        this.a = handler;
    }

    @Override // defpackage.fsg
    public final k55 a(Runnable runnable, TimeUnit timeUnit) {
        em5 em5Var = em5.a;
        if (TimeUnit.NANOSECONDS == null) {
            yhk.s("unit == null");
            return null;
        }
        if (this.b) {
            return em5Var;
        }
        Handler handler = this.a;
        u69 u69Var = new u69(handler, runnable);
        Message obtain = Message.obtain(handler, u69Var);
        obtain.obj = this;
        this.a.sendMessageDelayed(obtain, 0L);
        if (!this.b) {
            return u69Var;
        }
        this.a.removeCallbacks(u69Var);
        return em5Var;
    }

    @Override // defpackage.k55
    public final void d() {
        this.b = true;
        this.a.removeCallbacksAndMessages(this);
    }
}
