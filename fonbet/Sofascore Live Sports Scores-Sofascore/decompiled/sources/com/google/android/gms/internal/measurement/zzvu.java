package com.google.android.gms.internal.measurement;

import defpackage.hv9;
import defpackage.l9p;
import defpackage.vvf;
import defpackage.w3a;
import defpackage.yhk;
import defpackage.zu9;
import java.util.ArrayList;
import java.util.UUID;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzvu {
    public static final WeakHashMap a = new WeakHashMap();
    public static final WeakHashMap b = new WeakHashMap();

    public static void a(Throwable th) {
        Throwable th2;
        zzxc zzxcVar;
        zzws zzwsVar;
        WeakHashMap weakHashMap = b;
        synchronized (weakHashMap) {
            th2 = th;
            while (th2 != null) {
                try {
                    if (weakHashMap.containsKey(th2)) {
                        break;
                    } else {
                        th2 = th2.getCause();
                    }
                } finally {
                }
            }
            weakHashMap.put(th, Boolean.valueOf(th2 != null));
        }
        if (th2 != null) {
            return;
        }
        WeakHashMap weakHashMap2 = a;
        synchronized (weakHashMap2) {
            Throwable th3 = th;
            while (th3 != null) {
                try {
                    if (weakHashMap2.containsKey(th3)) {
                        break;
                    } else {
                        th3 = th3.getCause();
                    }
                } finally {
                }
            }
            if (th3 == null) {
                zzxcVar = null;
            } else {
                weakHashMap2.put(th, (zzww) weakHashMap2.get(th3));
                zzxcVar = new zzxc();
            }
        }
        if (zzxcVar != null || (zzwsVar = zzvy.c().b) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (zzwsVar = zzvy.c().b; zzwsVar != null; zzwsVar = zzwsVar.zzb()) {
            arrayList.add(zzwsVar);
        }
        l9p l9pVar = new l9p();
        UUID zzc = ((zzws) arrayList.get(0)).zzc();
        if (zzc == null) {
            yhk.s("Null rootTraceId");
            return;
        }
        l9pVar.c = zzc;
        ((zzws) arrayList.get(0)).getClass();
        l9pVar.d = -1L;
        l9pVar.e = (byte) 1;
        zu9 t = hv9.t(arrayList.size());
        zu9 t2 = hv9.t(arrayList.size());
        for (zzws zzwsVar2 : w3a.O(arrayList)) {
            t2.c(zzwsVar2.zze());
            t.c(zzwsVar2.zzh());
        }
        WeakHashMap weakHashMap3 = a;
        synchronized (weakHashMap3) {
            try {
                vvf g = t2.g();
                if (g == null) {
                    throw new NullPointerException("Null spansNames");
                }
                l9pVar.a = g;
                vvf g2 = t.g();
                if (g2 == null) {
                    throw new NullPointerException("Null extras");
                }
                l9pVar.b = g2;
                weakHashMap3.put(th, l9pVar.a());
            } finally {
            }
        }
    }
}
