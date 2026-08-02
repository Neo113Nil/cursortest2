package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzab {
    public zzaa a;
    public zzaa b;
    public final ArrayList c;

    public zzab() {
        this.a = new zzaa("", 0L, null);
        this.b = new zzaa("", 0L, null);
        this.c = new ArrayList();
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        zzab zzabVar = new zzab(this.a.clone());
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            zzabVar.c.add(((zzaa) it.next()).clone());
        }
        return zzabVar;
    }

    public zzab(zzaa zzaaVar) {
        this.a = zzaaVar;
        this.b = zzaaVar.clone();
        this.c = new ArrayList();
    }
}
