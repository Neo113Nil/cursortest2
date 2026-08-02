package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbgr implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        zzbgh zzbghVar = (zzbgh) obj;
        zzbgh zzbghVar2 = (zzbgh) obj2;
        float f = zzbghVar.b;
        float f2 = zzbghVar2.b;
        if (f < f2) {
            return -1;
        }
        if (f > f2) {
            return 1;
        }
        float f3 = zzbghVar.a;
        float f4 = zzbghVar2.a;
        if (f3 < f4) {
            return -1;
        }
        if (f3 > f4) {
            return 1;
        }
        float f5 = (zzbghVar.d - f) * (zzbghVar.c - f3);
        float f6 = (zzbghVar2.d - f2) * (zzbghVar2.c - f4);
        if (f5 > f6) {
            return -1;
        }
        return f5 < f6 ? 1 : 0;
    }
}
