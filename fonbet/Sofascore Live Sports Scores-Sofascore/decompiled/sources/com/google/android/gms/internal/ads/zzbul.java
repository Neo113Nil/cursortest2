package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Preconditions;
import defpackage.ewm;
import defpackage.ohn;
import defpackage.ubf;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbul extends zzcgv {
    public final Object c = new Object();
    public boolean d = false;
    public int e = 0;

    public final zzbug d() {
        zzbug zzbugVar = new zzbug(this);
        com.google.android.gms.ads.internal.util.zze.zza("createNewReference: Trying to acquire lock");
        synchronized (this.c) {
            com.google.android.gms.ads.internal.util.zze.zza("createNewReference: Lock acquired");
            a(new ewm(this, zzbugVar), new ohn(this, zzbugVar));
            Preconditions.l(this.e >= 0);
            this.e++;
        }
        com.google.android.gms.ads.internal.util.zze.zza("createNewReference: Lock released");
        return zzbugVar;
    }

    public final void e() {
        com.google.android.gms.ads.internal.util.zze.zza("releaseOneReference: Trying to acquire lock");
        synchronized (this.c) {
            com.google.android.gms.ads.internal.util.zze.zza("releaseOneReference: Lock acquired");
            Preconditions.l(this.e > 0);
            com.google.android.gms.ads.internal.util.zze.zza("Releasing 1 reference for JS Engine");
            this.e--;
            g();
        }
        com.google.android.gms.ads.internal.util.zze.zza("releaseOneReference: Lock released");
    }

    public final void f() {
        com.google.android.gms.ads.internal.util.zze.zza("markAsDestroyable: Trying to acquire lock");
        synchronized (this.c) {
            com.google.android.gms.ads.internal.util.zze.zza("markAsDestroyable: Lock acquired");
            Preconditions.l(this.e >= 0);
            com.google.android.gms.ads.internal.util.zze.zza("Releasing root reference. JS Engine will be destroyed once other references are released.");
            this.d = true;
            g();
        }
        com.google.android.gms.ads.internal.util.zze.zza("markAsDestroyable: Lock released");
    }

    public final void g() {
        com.google.android.gms.ads.internal.util.zze.zza("maybeDestroy: Trying to acquire lock");
        synchronized (this.c) {
            try {
                com.google.android.gms.ads.internal.util.zze.zza("maybeDestroy: Lock acquired");
                Preconditions.l(this.e >= 0);
                if (this.d && this.e == 0) {
                    com.google.android.gms.ads.internal.util.zze.zza("No reference is left (including root). Cleaning up engine.");
                    a(new ubf(8), new zzcgr());
                } else {
                    com.google.android.gms.ads.internal.util.zze.zza("There are still references to the engine. Not destroying.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        com.google.android.gms.ads.internal.util.zze.zza("maybeDestroy: Lock released");
    }
}
