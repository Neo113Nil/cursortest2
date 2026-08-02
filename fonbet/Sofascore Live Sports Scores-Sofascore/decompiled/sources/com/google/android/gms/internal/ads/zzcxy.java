package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import defpackage.dh0;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcxy implements zzdfd, zzdej {
    public final Context a;
    public final zzclm b;
    public final zzfld c;
    public final VersionInfoParcel d;
    public zzeml e;
    public boolean f;
    public final zzemj g;

    public zzcxy(Context context, zzclm zzclmVar, zzfld zzfldVar, VersionInfoParcel versionInfoParcel, zzemj zzemjVar) {
        this.a = context;
        this.b = zzclmVar;
        this.c = zzfldVar;
        this.d = versionInfoParcel;
        this.g = zzemjVar;
    }

    public final synchronized void a() {
        zzclm zzclmVar;
        zzemi zzemiVar;
        zzemh zzemhVar;
        try {
            zzfld zzfldVar = this.c;
            if (zzfldVar.T && (zzclmVar = this.b) != null) {
                if (com.google.android.gms.ads.internal.zzt.zzu().zza(this.a)) {
                    VersionInfoParcel versionInfoParcel = this.d;
                    int i = versionInfoParcel.buddyApkVersion;
                    int i2 = versionInfoParcel.clientJarVersion;
                    StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 1 + String.valueOf(i2).length());
                    sb.append(i);
                    sb.append(".");
                    sb.append(i2);
                    String sb2 = sb.toString();
                    zzflz zzflzVar = zzfldVar.V;
                    String str = zzflzVar.a() + (-1) != 1 ? "javascript" : null;
                    if (zzflzVar.a() == 1) {
                        zzemhVar = zzemh.VIDEO;
                        zzemiVar = zzemi.DEFINED_BY_JAVASCRIPT;
                    } else {
                        int i3 = zzfldVar.e;
                        zzemh zzemhVar2 = zzemh.HTML_DISPLAY;
                        zzemiVar = i3 == 1 ? zzemi.ONE_PIXEL : zzemi.BEGIN_TO_RENDER;
                        zzemhVar = zzemhVar2;
                    }
                    zzeml h = com.google.android.gms.ads.internal.zzt.zzu().h(sb2, zzclmVar.zzD(), str, zzemiVar, zzemhVar, zzfldVar.l0);
                    this.e = h;
                    if (h != null) {
                        zzfvq zzfvqVar = h.a;
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.s6)).booleanValue()) {
                            com.google.android.gms.ads.internal.zzt.zzu().c(zzfvqVar, zzclmVar.zzD());
                            Iterator it = zzclmVar.zzF().iterator();
                            while (it.hasNext()) {
                                com.google.android.gms.ads.internal.zzt.zzu().b(zzfvqVar, (View) it.next());
                            }
                        } else {
                            com.google.android.gms.ads.internal.zzt.zzu().c(zzfvqVar, zzclmVar.zzE());
                        }
                        zzclmVar.j0(this.e);
                        com.google.android.gms.ads.internal.zzt.zzu().e(zzfvqVar);
                        this.f = true;
                        zzclmVar.n("onSdkLoaded", new dh0(0));
                    }
                }
            }
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0026 A[Catch: all -> 0x002d, TRY_LEAVE, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0014, B:6:0x0016, B:10:0x001b, B:13:0x0026, B:17:0x002f, B:19:0x0033, B:20:0x0036, B:22:0x003c, B:24:0x0040, B:26:0x0044, B:31:0x001e, B:35:0x0022, B:8:0x0017), top: B:2:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002f A[Catch: all -> 0x002d, TRY_ENTER, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0014, B:6:0x0016, B:10:0x001b, B:13:0x0026, B:17:0x002f, B:19:0x0033, B:20:0x0036, B:22:0x003c, B:24:0x0040, B:26:0x0044, B:31:0x001e, B:35:0x0022, B:8:0x0017), top: B:2:0x0001, inners: #0 }] */
    @Override // com.google.android.gms.internal.ads.zzdej
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void j() {
        boolean z;
        zzclm zzclmVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.t6)).booleanValue()) {
            zzemj zzemjVar = this.g;
            synchronized (zzemjVar) {
                if (zzemjVar.f != null) {
                    z = true;
                }
            }
            if (!z) {
                this.g.c();
                return;
            }
            if (!this.f) {
                a();
            }
            if (!this.c.T || this.e == null || (zzclmVar = this.b) == null) {
                return;
            }
            zzclmVar.n("onSdkImpression", new dh0(0));
            return;
        }
        z = false;
        if (!z) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0025 A[Catch: all -> 0x002c, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0013, B:6:0x0015, B:10:0x001a, B:13:0x0025, B:17:0x002e, B:21:0x0034, B:24:0x001d, B:28:0x0021, B:8:0x0016), top: B:2:0x0001, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002e A[Catch: all -> 0x002c, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0013, B:6:0x0015, B:10:0x001a, B:13:0x0025, B:17:0x002e, B:21:0x0034, B:24:0x001d, B:28:0x0021, B:8:0x0016), top: B:2:0x0001, inners: #1 }] */
    @Override // com.google.android.gms.internal.ads.zzdfd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void zzg() {
        boolean z;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.t6)).booleanValue()) {
            zzemj zzemjVar = this.g;
            synchronized (zzemjVar) {
                if (zzemjVar.f != null) {
                    z = true;
                }
            }
            if (!z) {
                this.g.b();
                return;
            } else {
                if (this.f) {
                    return;
                }
                a();
                return;
            }
        }
        z = false;
        if (!z) {
        }
    }
}
