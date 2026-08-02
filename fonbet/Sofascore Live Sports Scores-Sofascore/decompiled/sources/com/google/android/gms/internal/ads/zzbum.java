package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import defpackage.e3c;
import defpackage.hcc;
import defpackage.l2a;
import defpackage.nkn;
import defpackage.w9f;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbum {
    public final Context b;
    public final String c;
    public final VersionInfoParcel d;
    public final zzfrj e;
    public zzbul f;
    public final Object a = new Object();
    public int g = 1;

    public zzbum(Context context, VersionInfoParcel versionInfoParcel, String str, zzfrj zzfrjVar) {
        this.c = str;
        this.b = context.getApplicationContext();
        this.d = versionInfoParcel;
        this.e = zzfrjVar;
    }

    public final zzbul a() {
        zzfqw e = zzfqw.e(6, this.b);
        e.zza();
        zzbul zzbulVar = new zzbul();
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before UI_THREAD_EXECUTOR");
        zzcgj.f.execute(new nkn(this, zzbulVar, false, 4));
        com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine: Promise created");
        int i = 27;
        boolean z = false;
        zzbulVar.a(new l2a(this, zzbulVar, e, z, i), new hcc(this, zzbulVar, e, z, i));
        return zzbulVar;
    }

    public final zzbug b() {
        com.google.android.gms.ads.internal.util.zze.zza("getEngine: Trying to acquire lock");
        Object obj = this.a;
        synchronized (obj) {
            try {
                com.google.android.gms.ads.internal.util.zze.zza("getEngine: Lock acquired");
                com.google.android.gms.ads.internal.util.zze.zza("refreshIfDestroyed: Trying to acquire lock");
                synchronized (obj) {
                    try {
                        com.google.android.gms.ads.internal.util.zze.zza("refreshIfDestroyed: Lock acquired");
                        zzbul zzbulVar = this.f;
                        if (zzbulVar != null && this.g == 0) {
                            zzbulVar.a(new e3c(this, 26), w9f.c);
                        }
                    } finally {
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        com.google.android.gms.ads.internal.util.zze.zza("refreshIfDestroyed: Lock released");
        zzbul zzbulVar2 = this.f;
        if (zzbulVar2 != null && zzbulVar2.b.get() != -1) {
            int i = this.g;
            if (i == 0) {
                com.google.android.gms.ads.internal.util.zze.zza("getEngine (NO_UPDATE): Lock released");
                return this.f.d();
            }
            if (i != 1) {
                com.google.android.gms.ads.internal.util.zze.zza("getEngine (UPDATING): Lock released");
                return this.f.d();
            }
            this.g = 2;
            a();
            com.google.android.gms.ads.internal.util.zze.zza("getEngine (PENDING_UPDATE): Lock released");
            return this.f.d();
        }
        this.g = 2;
        this.f = a();
        com.google.android.gms.ads.internal.util.zze.zza("getEngine (NULL or REJECTED): Lock released");
        return this.f.d();
    }
}
