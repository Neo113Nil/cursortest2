package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import defpackage.sa0;
import defpackage.v0l;
import defpackage.y0l;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdxg {
    public final Context a;
    public final zzbbd b;
    public final zzbkn c;
    public final VersionInfoParcel d;
    public final com.google.android.gms.ads.internal.zza e;
    public final zzbif f;
    public final zzdgq g;
    public final zzelp h;
    public final zzfma i;
    public final zzeaj j;
    public final zzcnl k;

    public zzdxg(Context context, zzbbd zzbbdVar, zzbkn zzbknVar, VersionInfoParcel versionInfoParcel, com.google.android.gms.ads.internal.zza zzaVar, zzbif zzbifVar, zzdgq zzdgqVar, zzelp zzelpVar, zzfma zzfmaVar, zzeaj zzeajVar, zzcnl zzcnlVar) {
        this.a = context;
        this.b = zzbbdVar;
        this.c = zzbknVar;
        this.d = versionInfoParcel;
        this.e = zzaVar;
        this.f = zzbifVar;
        this.g = zzdgqVar;
        this.h = zzelpVar;
        this.i = zzfmaVar;
        this.j = zzeajVar;
        this.k = zzcnlVar;
    }

    public final zzclm a(com.google.android.gms.ads.internal.client.zzr zzrVar, zzfld zzfldVar, zzflg zzflgVar) {
        zzclm a = zzcmc.a(this.a, zzcnw.a(zzrVar), zzrVar.zza, false, false, this.b, this.c, this.d, new sa0(this, 9), this.e, this.f, zzfldVar, zzflgVar, this.h, this.i, this.j);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Rf)).booleanValue()) {
            WebView zzD = a.zzD();
            if (this.k.a != null) {
                try {
                    int i = v0l.a;
                    if (!y0l.i.b()) {
                        throw y0l.a();
                    }
                    ((WebViewProviderBoundaryInterface) v0l.b(zzD).b).setProfile("GMA_WEBVIEW_PROFILE");
                    com.google.android.gms.ads.internal.util.zze.zza("WebViewCompat Profile is defined");
                    return a;
                } catch (IllegalStateException e) {
                    String concat = "WebViewCompat error: ".concat(e.toString());
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    zzo.zzi(concat);
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Qf)).booleanValue()) {
                        com.google.android.gms.ads.internal.zzt.zzh().d("WebViewCompat.setProfile", e);
                    }
                }
            }
        }
        return a;
    }
}
