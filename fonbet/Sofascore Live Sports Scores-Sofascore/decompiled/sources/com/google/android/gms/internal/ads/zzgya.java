package com.google.android.gms.internal.ads;

import defpackage.qjo;
import defpackage.tio;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzgya {
    public static Object a(qjo qjoVar, String str) {
        tio it = qjoVar.iterator();
        return it.hasNext() ? it.next() : str;
    }

    public static void b(List list, zzgul zzgulVar, int i, int i2) {
        int size = list.size();
        while (true) {
            size--;
            if (size <= i2) {
                break;
            } else if (zzgulVar.zza(list.get(size))) {
                list.remove(size);
            }
        }
        while (true) {
            i2--;
            if (i2 < i) {
                return;
            } else {
                list.remove(i2);
            }
        }
    }
}
