package org.maplibre.android.maps;

import java.util.ArrayList;
import java.util.Iterator;
import org.maplibre.android.annotations.c;

/* loaded from: classes10.dex */
class InfoWindowManager {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f79672a = new ArrayList();

    InfoWindowManager() {
    }

    public final void a(c cVar) {
        this.f79672a.add(cVar);
    }

    final void b() {
        ArrayList arrayList = this.f79672a;
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((c) it.next()).g();
        }
    }
}
