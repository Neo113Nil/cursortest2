package com.google.android.gms.internal.ads;

import defpackage.ddb;
import defpackage.k6o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzevx implements zzfdi {
    public final Set a;

    public zzevx(Set set) {
        this.a = set;
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final ddb zza() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        return zzhcy.a(new k6o(arrayList, 0));
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final int zzb() {
        return 8;
    }
}
