package com.google.android.gms.internal.ads;

import defpackage.aeb;
import defpackage.beb;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzgym {
    public static ArrayList a(zzhaa zzhaaVar) {
        ArrayList arrayList = new ArrayList();
        zzhaaVar.getClass();
        while (zzhaaVar.hasNext()) {
            arrayList.add(zzhaaVar.next());
        }
        return arrayList;
    }

    public static AbstractList b(List list, zzgub zzgubVar) {
        return list != null ? new aeb(list, zzgubVar) : new beb(list, zzgubVar);
    }
}
