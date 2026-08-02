package com.google.android.gms.internal.measurement;

import defpackage.vvo;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzyf {
    public final ConcurrentHashMap a = new ConcurrentHashMap();

    public abstract Object a();

    public final Object b(zzyd zzydVar, zzzj zzzjVar) {
        ConcurrentHashMap concurrentHashMap = this.a;
        Object obj = concurrentHashMap.get(zzydVar);
        if (obj != null) {
            return obj;
        }
        Object a = a();
        Object putIfAbsent = concurrentHashMap.putIfAbsent(zzydVar, a);
        if (putIfAbsent != null) {
            return putIfAbsent;
        }
        int a2 = zzzjVar.a();
        vvo vvoVar = null;
        for (int i = 0; i < a2; i++) {
            if (zzxx.f.equals(zzzjVar.b(i))) {
                Object c = zzzjVar.c(i);
                if (c instanceof zzyj) {
                    if (vvoVar == null) {
                        vvoVar = new vvo(this, zzydVar);
                    }
                    ((zzyj) c).a();
                }
            }
        }
        return a;
    }
}
