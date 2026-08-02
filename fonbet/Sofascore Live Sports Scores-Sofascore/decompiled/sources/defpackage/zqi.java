package defpackage;

import android.os.Handler;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class zqi {
    public static final ArrayList b = new ArrayList(50);
    public final Handler a;

    public zqi(Handler handler) {
        this.a = handler;
    }

    public static xqi d() {
        xqi xqiVar;
        ArrayList arrayList = b;
        synchronized (arrayList) {
            try {
                xqiVar = arrayList.isEmpty() ? new xqi() : (xqi) arrayList.remove(arrayList.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return xqiVar;
    }

    public final xqi a(int i) {
        xqi d = d();
        d.a = this.a.obtainMessage(i);
        return d;
    }

    public final xqi b(int i, int i2, int i3) {
        xqi d = d();
        d.a = this.a.obtainMessage(i, i2, i3);
        return d;
    }

    public final xqi c(int i, Object obj) {
        xqi d = d();
        d.a = this.a.obtainMessage(i, obj);
        return d;
    }

    public final void e(Runnable runnable) {
        this.a.post(runnable);
    }

    public final void f(int i) {
        z1a.s(i != 0);
        this.a.removeMessages(i);
    }

    public final void g(int i) {
        this.a.sendEmptyMessage(i);
    }
}
