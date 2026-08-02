package com.google.android.gms.internal.ads;

import defpackage.ica;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhoh {
    public static final zzich b = zzich.a(new byte[0]);
    public final Map a;

    public final Iterable a(byte[] bArr) {
        List list;
        zzich zzichVar = b;
        Map map = this.a;
        List list2 = (List) map.get(zzichVar);
        if (bArr.length >= 5) {
            int length = bArr.length;
            list = (List) map.get(new zzich(bArr, 5 > length ? length : 5));
        } else {
            list = null;
        }
        return (list2 == null && list == null) ? new ArrayList() : list2 == null ? list : list == null ? list2 : new ica(this, list, list2);
    }
}
