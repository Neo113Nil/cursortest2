package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class iz0 {
    public CopyOnWriteArrayList a;

    public static void a(List list) {
        Iterator it = list.iterator();
        if (it.hasNext()) {
            throw lnb.i(it);
        }
    }
}
