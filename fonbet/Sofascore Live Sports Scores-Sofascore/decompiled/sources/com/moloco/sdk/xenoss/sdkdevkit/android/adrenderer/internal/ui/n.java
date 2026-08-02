package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import defpackage.k13;
import defpackage.vub;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class n {
    public final LinkedHashMap a = new LinkedHashMap();

    public final void a(com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d dVar) {
        dVar.getClass();
        this.a.put(dVar.a, dVar);
    }

    public final ArrayList b() {
        List r = vub.r(this.a);
        ArrayList arrayList = new ArrayList(k13.r(r, 10));
        Iterator it = r.iterator();
        while (it.hasNext()) {
            arrayList.add((com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d) ((Pair) it.next()).b);
        }
        return arrayList;
    }
}
