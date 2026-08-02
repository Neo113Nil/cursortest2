package com.google.android.gms.internal.ads;

import defpackage.nkn;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class zzdjn {
    public final HashMap a = new HashMap();

    public zzdjn(Set set) {
        synchronized (this) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                zzdlo zzdloVar = (zzdlo) it.next();
                synchronized (this) {
                    n0(zzdloVar.a, zzdloVar.b);
                }
            }
        }
    }

    public final synchronized void n0(Object obj, Executor executor) {
        this.a.put(obj, executor);
    }

    public final synchronized void p0(zzdjm zzdjmVar) {
        for (Map.Entry entry : this.a.entrySet()) {
            ((Executor) entry.getValue()).execute(new nkn(zzdjmVar, entry.getKey(), false, 12));
        }
    }
}
