package defpackage;

import android.os.Handler;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class yqi {
    public static final ArrayList b = new ArrayList(50);
    public final Handler a;

    public yqi(Handler handler) {
        this.a = handler;
    }

    public static wqi b() {
        wqi wqiVar;
        ArrayList arrayList = b;
        synchronized (arrayList) {
            try {
                wqiVar = arrayList.isEmpty() ? new wqi() : (wqi) arrayList.remove(arrayList.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return wqiVar;
    }

    public final wqi a(int i, Object obj) {
        wqi b2 = b();
        b2.a = this.a.obtainMessage(i, obj);
        return b2;
    }

    public final void c(int i) {
        this.a.sendEmptyMessage(i);
    }
}
