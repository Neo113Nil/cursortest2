package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class cjb {
    public static final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    public static final void a(String str) {
        if (str != null) {
            Iterator it = a.iterator();
            if (it.hasNext()) {
                throw lnb.i(it);
            }
        }
    }

    public static final void b(String str) {
        Iterator it = a.iterator();
        if (it.hasNext()) {
            throw lnb.i(it);
        }
    }
}
