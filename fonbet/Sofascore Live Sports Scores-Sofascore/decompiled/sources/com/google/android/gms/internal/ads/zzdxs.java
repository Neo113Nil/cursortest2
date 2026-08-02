package com.google.android.gms.internal.ads;

import defpackage.pmn;
import defpackage.wbo;
import defpackage.xw3;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdxs {
    public final zzgdh a;
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final AtomicBoolean c = new AtomicBoolean(false);

    public zzdxs(zzgdh zzgdhVar) {
        this.a = zzgdhVar;
    }

    public final void a(zzbgb zzbgbVar) {
        this.c.set(true);
        synchronized (zzbgbVar.a) {
            try {
                pmn pmnVar = zzbgbVar.b;
                if (pmnVar == null) {
                    pmnVar = new pmn();
                    zzbgbVar.b = pmnVar;
                }
                synchronized (pmnVar.c) {
                    pmnVar.g.add(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zzgdh zzgdhVar = this.a;
        xw3.L(zzgdhVar.a, null, null, new wbo(zzgdhVar, null, 3), 3);
    }
}
