package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import defpackage.njo;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzemj {
    public final Context a;
    public final VersionInfoParcel b;
    public final zzfld c;
    public final zzclm d;
    public final zzeaj e;
    public zzfvy f;

    public zzemj(Context context, VersionInfoParcel versionInfoParcel, zzfld zzfldVar, zzclm zzclmVar, zzeaj zzeajVar) {
        this.a = context;
        this.b = versionInfoParcel;
        this.c = zzfldVar;
        this.d = zzclmVar;
        this.e = zzeajVar;
    }

    public final synchronized boolean a() {
        zzclm zzclmVar;
        zzfld zzfldVar = this.c;
        if (zzfldVar.T) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.q6)).booleanValue()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.t6)).booleanValue() && (zzclmVar = this.d) != null) {
                    if (this.f != null) {
                        int i = com.google.android.gms.ads.internal.util.zze.zza;
                        zzo.zzi("Omid javascript session service already started for ad.");
                        return false;
                    }
                    if (!com.google.android.gms.ads.internal.zzt.zzu().zza(this.a)) {
                        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                        zzo.zzi("Unable to initialize omid.");
                        return false;
                    }
                    zzflz zzflzVar = zzfldVar.V;
                    zzflzVar.getClass();
                    if (zzflzVar.a.optBoolean((String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.v6), true)) {
                        zzfvy i3 = com.google.android.gms.ads.internal.zzt.zzu().i(this.b, zzclmVar.zzD());
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.u6)).booleanValue()) {
                            zzeaj zzeajVar = this.e;
                            String str = i3 != null ? "1" : "0";
                            zzeai a = zzeajVar.a();
                            a.b("omid_js_session_success", str);
                            a.c();
                        }
                        if (i3 == null) {
                            int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                            zzo.zzi("Unable to create javascript session service.");
                            return false;
                        }
                        int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                        zzo.zzh("Created omid javascript session service.");
                        this.f = i3;
                        zzclmVar.h0(this);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final synchronized void b() {
        zzclm zzclmVar;
        try {
            zzfvy zzfvyVar = this.f;
            if (zzfvyVar == null || (zzclmVar = this.d) == null) {
                return;
            }
            Iterator it = zzclmVar.zzF().iterator();
            while (it.hasNext()) {
                com.google.android.gms.ads.internal.zzt.zzu().a(zzfvyVar, (View) it.next());
            }
            zzclmVar.n("onSdkLoaded", njo.g);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c() {
        zzclm zzclmVar;
        if (this.f == null || (zzclmVar = this.d) == null) {
            return;
        }
        zzclmVar.n("onSdkImpression", njo.g);
    }
}
