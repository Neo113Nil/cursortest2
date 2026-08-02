package com.google.android.gms.internal.play_billing;

import defpackage.boo;
import defpackage.lnb;
import defpackage.loo;
import defpackage.x5n;
import defpackage.yhk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzen extends zzgp implements zzhs {
    private static final zzen zzb;
    private zzgu zzd = boo.e;

    static {
        zzen zzenVar = new zzen();
        zzb = zzenVar;
        zzgp.e(zzen.class, zzenVar);
    }

    private zzen() {
    }

    public static zzem p() {
        return (zzem) zzb.j();
    }

    public static void q(zzen zzenVar, ArrayList arrayList) {
        zzgu zzguVar = zzenVar.zzd;
        if (!zzguVar.zzc()) {
            int size = zzguVar.size();
            zzenVar.zzd = zzguVar.i(size + size);
        }
        List list = zzenVar.zzd;
        int size2 = arrayList.size();
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(list.size() + size2);
        } else if (list instanceof boo) {
            boo booVar = (boo) list;
            int i = booVar.c + size2;
            int length = booVar.b.length;
            if (i > length) {
                if (length != 0) {
                    while (length < i) {
                        length = x5n.e(length, 3, 2, 1, 10);
                    }
                    booVar.b = Arrays.copyOf(booVar.b, length);
                } else {
                    booVar.b = new Object[Math.max(i, 10)];
                }
            }
        }
        int size3 = list.size();
        int size4 = arrayList.size();
        for (int i2 = 0; i2 < size4; i2++) {
            Object obj = arrayList.get(i2);
            if (obj == null) {
                String k = lnb.k(list.size() - size3, "Element at index ", " is null.");
                int size5 = list.size();
                while (true) {
                    size5--;
                    if (size5 < size3) {
                        yhk.s(k);
                        return;
                    }
                    list.remove(size5);
                }
            } else {
                list.add(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzgp
    public final Object i(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new loo(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", zzel.class});
        }
        if (i2 == 3) {
            return new zzen();
        }
        if (i2 == 4) {
            return new zzem(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
