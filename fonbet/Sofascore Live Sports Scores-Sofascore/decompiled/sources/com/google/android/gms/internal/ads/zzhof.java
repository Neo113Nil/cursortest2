package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhof {
    public final HashMap a = new HashMap();

    public final void a(zzich zzichVar, Object obj) {
        List list;
        byte[] bArr = zzichVar.a;
        if (bArr.length != 0 && bArr.length != 5) {
            defpackage.zzl.x("PrefixMap only supports 0 and 5 byte prefixes");
            return;
        }
        HashMap hashMap = this.a;
        if (hashMap.containsKey(zzichVar)) {
            list = (List) hashMap.get(zzichVar);
        } else {
            ArrayList arrayList = new ArrayList();
            hashMap.put(zzichVar, arrayList);
            list = arrayList;
        }
        list.add(obj);
    }
}
