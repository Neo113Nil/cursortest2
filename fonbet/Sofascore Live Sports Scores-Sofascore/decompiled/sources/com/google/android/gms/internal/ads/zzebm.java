package com.google.android.gms.internal.ads;

import defpackage.r2o;
import defpackage.s2o;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzebm {
    public final ConcurrentHashMap a = new ConcurrentHashMap();

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a7 A[Catch: all -> 0x004c, TryCatch #0 {all -> 0x004c, blocks: (B:3:0x0001, B:11:0x0019, B:13:0x0038, B:15:0x003e, B:17:0x0047, B:19:0x004f, B:25:0x0073, B:27:0x00a7, B:29:0x00b1, B:30:0x00b9, B:31:0x00c0, B:33:0x00c6, B:35:0x00ca, B:37:0x00df, B:38:0x00e8, B:40:0x00ee, B:43:0x00fc, B:46:0x0102, B:47:0x0114, B:49:0x011a, B:52:0x012c, B:55:0x0134, B:67:0x0145, B:70:0x014d, B:73:0x0153, B:76:0x015c, B:85:0x0165, B:88:0x0084, B:89:0x0095), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void a(int i, long j, long j2) {
        int i2;
        ArrayDeque arrayDeque;
        Long l;
        try {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Q8)).booleanValue()) {
                if (i == 2) {
                    r2o r2oVar = new r2o();
                    r2oVar.a = j;
                    byte b = (byte) (r2oVar.c | 1);
                    r2oVar.b = 1;
                    r2oVar.c = (byte) (b | 2);
                    s2o a = r2oVar.a();
                    ConcurrentHashMap concurrentHashMap = this.a;
                    ArrayDeque arrayDeque2 = (ArrayDeque) concurrentHashMap.get(a);
                    if (arrayDeque2 != null && !arrayDeque2.isEmpty()) {
                        arrayDeque2.removeFirst();
                        if (arrayDeque2.isEmpty()) {
                            concurrentHashMap.remove(a);
                        }
                    }
                    i = 2;
                }
                r2o r2oVar2 = new r2o();
                r2oVar2.a = j;
                byte b2 = (byte) (r2oVar2.c | 1);
                r2oVar2.b = i;
                r2oVar2.c = (byte) (b2 | 2);
                s2o a2 = r2oVar2.a();
                int i3 = a2.b;
                if (i3 != 0) {
                    if (i3 == 1) {
                        i2 = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.X8)).intValue();
                    } else if (i3 == 2) {
                        i2 = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Y8)).intValue();
                    } else if (i3 == 3) {
                        i2 = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Z8)).intValue();
                    }
                    if (i2 > 0) {
                        ConcurrentHashMap concurrentHashMap2 = this.a;
                        ArrayDeque arrayDeque3 = (ArrayDeque) concurrentHashMap2.get(a2);
                        if (arrayDeque3 == null) {
                            arrayDeque3 = new ArrayDeque();
                            concurrentHashMap2.put(a2, arrayDeque3);
                        }
                        arrayDeque3.addLast(Long.valueOf(j2));
                        while (arrayDeque3.size() > i2) {
                            arrayDeque3.removeFirst();
                        }
                        b();
                        int intValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.a9)).intValue();
                        if (intValue <= 0) {
                            concurrentHashMap2.clear();
                            return;
                        }
                        while (true) {
                            Iterator it = concurrentHashMap2.values().iterator();
                            int i4 = 0;
                            while (it.hasNext()) {
                                i4 += ((ArrayDeque) it.next()).size();
                            }
                            if (i4 <= intValue) {
                                break;
                            }
                            if (!concurrentHashMap2.isEmpty()) {
                                Long l2 = Long.MAX_VALUE;
                                Map.Entry entry = null;
                                for (Map.Entry entry2 : concurrentHashMap2.entrySet()) {
                                    ArrayDeque arrayDeque4 = (ArrayDeque) entry2.getValue();
                                    if (!arrayDeque4.isEmpty() && (l = (Long) arrayDeque4.peekFirst()) != null && l.longValue() < l2.longValue()) {
                                        entry = entry2;
                                        l2 = l;
                                    }
                                }
                                if (entry != null && (arrayDeque = (ArrayDeque) entry.getValue()) != null && !arrayDeque.isEmpty()) {
                                    arrayDeque.removeFirst();
                                    if (arrayDeque.isEmpty()) {
                                        concurrentHashMap2.remove(entry.getKey());
                                    }
                                }
                            }
                        }
                    }
                }
                i2 = 0;
                if (i2 > 0) {
                }
            }
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0012 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        long j;
        long a = com.google.android.gms.ads.internal.zzt.zzk().a();
        Iterator it = this.a.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            zzebp zzebpVar = (zzebp) entry.getKey();
            ArrayDeque arrayDeque = (ArrayDeque) entry.getValue();
            int b = zzebpVar.b();
            if (b != 0) {
                if (b == 1) {
                    j = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.U8)).longValue();
                } else if (b == 2) {
                    j = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.V8)).longValue();
                } else if (b == 3) {
                    j = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.W8)).longValue();
                }
                if (j == 0) {
                    it.remove();
                    j = 0;
                }
                if (j <= 0) {
                    Iterator it2 = arrayDeque.iterator();
                    while (it2.hasNext() && a - ((Long) it2.next()).longValue() > j) {
                        it2.remove();
                    }
                    if (arrayDeque.isEmpty()) {
                        it.remove();
                    }
                }
            }
            j = 0;
            if (j == 0) {
            }
            if (j <= 0) {
            }
        }
    }
}
