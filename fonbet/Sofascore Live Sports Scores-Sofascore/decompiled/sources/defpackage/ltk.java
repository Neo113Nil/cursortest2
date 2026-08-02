package defpackage;

import java.util.Iterator;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class ltk {
    public final mtk a = new mtk();

    public final void a(String str, AutoCloseable autoCloseable) {
        AutoCloseable autoCloseable2;
        mtk mtkVar = this.a;
        if (mtkVar.d) {
            mtk.a(autoCloseable);
            return;
        }
        synchronized (mtkVar.a) {
            autoCloseable2 = (AutoCloseable) mtkVar.b.put(str, autoCloseable);
        }
        mtk.a(autoCloseable2);
    }

    public final void c() {
        mtk mtkVar = this.a;
        if (!mtkVar.d) {
            mtkVar.d = true;
            synchronized (mtkVar.a) {
                try {
                    Iterator it = mtkVar.b.values().iterator();
                    while (it.hasNext()) {
                        mtk.a((AutoCloseable) it.next());
                    }
                    Iterator it2 = mtkVar.c.iterator();
                    while (it2.hasNext()) {
                        mtk.a((AutoCloseable) it2.next());
                    }
                    mtkVar.c.clear();
                    Unit unit = Unit.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        e();
    }

    public final AutoCloseable d(String str) {
        AutoCloseable autoCloseable;
        mtk mtkVar = this.a;
        synchronized (mtkVar.a) {
            autoCloseable = (AutoCloseable) mtkVar.b.get(str);
        }
        return autoCloseable;
    }

    public void e() {
    }
}
