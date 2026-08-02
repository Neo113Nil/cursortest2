package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import defpackage.dh0;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdon implements zzdfd, com.google.android.gms.ads.internal.overlay.zzr, zzdej {
    public final Context a;
    public final zzclm b;
    public final zzfld c;
    public final VersionInfoParcel d;
    public final zzemj e;
    public zzeml f;

    public zzdon(Context context, zzclm zzclmVar, zzfld zzfldVar, VersionInfoParcel versionInfoParcel, zzemj zzemjVar) {
        this.a = context;
        this.b = zzclmVar;
        this.c = zzfldVar;
        this.d = versionInfoParcel;
        this.e = zzemjVar;
    }

    public final boolean a() {
        zzfvy zzfvyVar;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.t6)).booleanValue()) {
            return false;
        }
        zzemj zzemjVar = this.e;
        synchronized (zzemjVar) {
            zzfvyVar = zzemjVar.f;
        }
        return zzfvyVar != null;
    }

    @Override // com.google.android.gms.internal.ads.zzdej
    public final void j() {
        zzclm zzclmVar;
        if (a()) {
            this.e.c();
        } else {
            if (this.f == null || (zzclmVar = this.b) == null) {
                return;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.w6)).booleanValue()) {
                zzclmVar.n("onSdkImpression", new dh0(0));
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdW(int i) {
        this.f = null;
    }

    @Override // com.google.android.gms.internal.ads.zzdfd
    public final void zzg() {
        zzclm zzclmVar;
        zzemi zzemiVar;
        zzemh zzemhVar;
        zzfld zzfldVar = this.c;
        if (!zzfldVar.T || (zzclmVar = this.b) == null) {
            return;
        }
        if (com.google.android.gms.ads.internal.zzt.zzu().zza(this.a)) {
            if (a()) {
                this.e.b();
                return;
            }
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
                zzemiVar = zzfldVar.Y == 2 ? zzemi.UNSPECIFIED : zzemi.BEGIN_TO_RENDER;
                zzemhVar = zzemh.HTML_DISPLAY;
            }
            zzeml h = com.google.android.gms.ads.internal.zzt.zzu().h(sb2, zzclmVar.zzD(), str, zzemiVar, zzemhVar, zzfldVar.l0);
            this.f = h;
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
                zzclmVar.j0(this.f);
                com.google.android.gms.ads.internal.zzt.zzu().e(zzfvqVar);
                zzclmVar.n("onSdkLoaded", new dh0(0));
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzh() {
        zzclm zzclmVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.w6)).booleanValue() || (zzclmVar = this.b) == null) {
            return;
        }
        if (this.f != null || a()) {
            if (this.f != null) {
                zzclmVar.n("onSdkImpression", new dh0(0));
            } else {
                this.e.c();
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdV() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdo() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdp() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdq() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdv() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdw() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdx() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdy() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdz() {
    }
}
