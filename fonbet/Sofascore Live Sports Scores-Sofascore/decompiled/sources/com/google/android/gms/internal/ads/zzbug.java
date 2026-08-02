package com.google.android.gms.internal.ads;

import defpackage.b1l;
import defpackage.d1l;
import defpackage.haf;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbug extends zzcgv {
    public final Object c = new Object();
    public final zzbul d;
    public boolean e;

    public zzbug(zzbul zzbulVar) {
        this.d = zzbulVar;
    }

    public final void d() {
        com.google.android.gms.ads.internal.util.zze.zza("release: Trying to acquire lock");
        synchronized (this.c) {
            try {
                com.google.android.gms.ads.internal.util.zze.zza("release: Lock acquired");
                if (this.e) {
                    com.google.android.gms.ads.internal.util.zze.zza("release: Lock already released");
                    return;
                }
                this.e = true;
                a(new haf(8), new zzcgr());
                a(new b1l(this), new d1l(this));
                com.google.android.gms.ads.internal.util.zze.zza("release: Lock released");
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
