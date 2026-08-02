package defpackage;

import java.util.ArrayList;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class dbc extends ebc {
    public final Object a = new Object();
    public Executor b;
    public dad c;
    public mac d;
    public ArrayList e;

    public String j() {
        return null;
    }

    public String k() {
        return null;
    }

    public final void l(mac macVar, ArrayList arrayList) {
        if (macVar == null) {
            yhk.s("groupRoute must not be null");
            return;
        }
        synchronized (this.a) {
            try {
                Executor executor = this.b;
                if (executor != null) {
                    executor.execute(new kx0(this, this.c, macVar, arrayList, 9));
                } else {
                    this.d = macVar;
                    this.e = new ArrayList(arrayList);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void m(String str);

    public abstract void n(String str);

    public abstract void o(ArrayList arrayList);
}
