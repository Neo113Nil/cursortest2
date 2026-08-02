package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcjl implements Iterable {
    public final ArrayList a = new ArrayList();

    public final boolean a(zzcif zzcifVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            zzcjk zzcjkVar = (zzcjk) it.next();
            if (zzcjkVar.b == zzcifVar) {
                arrayList.add(zzcjkVar);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((zzcjk) it2.next()).c.o();
        }
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.a.iterator();
    }
}
