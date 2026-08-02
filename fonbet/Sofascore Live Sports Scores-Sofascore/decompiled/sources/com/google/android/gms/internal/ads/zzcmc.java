package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.StrictMode;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import defpackage.sa0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcmc {
    public static final zzclm a(Context context, zzcnw zzcnwVar, String str, boolean z, boolean z2, zzbbd zzbbdVar, zzbkn zzbknVar, VersionInfoParcel versionInfoParcel, sa0 sa0Var, com.google.android.gms.ads.internal.zza zzaVar, zzbif zzbifVar, zzfld zzfldVar, zzflg zzflgVar, zzelp zzelpVar, zzfma zzfmaVar, zzeaj zzeajVar) {
        zzbjg.a(context);
        try {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.g gVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.g(context, zzcnwVar, str, z, z2, zzbbdVar, zzbknVar, versionInfoParcel, sa0Var, zzaVar, zzbifVar, zzfldVar, zzflgVar, zzfmaVar, zzeajVar, zzelpVar);
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                Object mo792zza = gVar.mo792zza();
                StrictMode.setThreadPolicy(threadPolicy);
                return (zzclm) mo792zza;
            } catch (Throwable th) {
                StrictMode.setThreadPolicy(threadPolicy);
                throw th;
            }
        } catch (Throwable th2) {
            throw new zzcmb("Webview initialization failed.", th2);
        }
    }
}
