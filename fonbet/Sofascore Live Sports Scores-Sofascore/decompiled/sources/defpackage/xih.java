package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class xih implements pk3 {
    public final /* synthetic */ yih a;

    public xih(yih yihVar) {
        this.a = yihVar;
    }

    @Override // defpackage.pk3
    public final void a(boolean z) {
        ArrayList arrayList;
        kik.g();
        synchronized (this.a) {
            arrayList = new ArrayList((HashSet) this.a.d);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((pk3) it.next()).a(z);
        }
    }
}
