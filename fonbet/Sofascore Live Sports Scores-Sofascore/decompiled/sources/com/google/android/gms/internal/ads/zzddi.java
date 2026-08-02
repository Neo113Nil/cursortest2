package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.List;
import org.json.JSONException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzddi extends com.google.android.gms.ads.internal.client.zzdw {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;
    public final long f;
    public final String g;
    public final zzemv h;
    public final Bundle i;
    public final double j;
    public final int k;

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00fa, code lost:
    
        if (android.text.TextUtils.isEmpty(r3) != false) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzddi(zzfld zzfldVar, String str, zzemv zzemvVar, zzflg zzflgVar, String str2) {
        Bundle bundle;
        String str3;
        String str4 = null;
        this.b = zzfldVar == null ? null : zzfldVar.b0;
        this.c = str2;
        this.d = zzflgVar == null ? null : zzflgVar.b;
        if (("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) && zzfldVar != null) {
            try {
                str4 = zzfldVar.v.getString("class_name");
            } catch (JSONException unused) {
            }
        }
        this.a = str4 != null ? str4 : str;
        this.e = zzemvVar.a;
        this.h = zzemvVar;
        this.j = zzfldVar == null ? 0.0d : zzfldVar.z0;
        this.k = zzfldVar == null ? 2 : zzfldVar.I0;
        this.f = com.google.android.gms.ads.internal.zzt.zzk().a() / 1000;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.w)).booleanValue()) {
            Bundle bundle2 = new Bundle();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Q7)).booleanValue() && zzflgVar != null) {
                bundle2.putAll(zzflgVar.k);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.R7)).booleanValue() && zzfldVar != null) {
                bundle2.putAll(zzfldVar.F0);
            }
            this.i = bundle2;
        } else {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Q7)).booleanValue() || zzflgVar == null) {
                bundle = new Bundle();
                this.i = bundle;
            } else {
                bundle = zzflgVar.k;
                this.i = bundle;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.R7)).booleanValue() && zzfldVar != null) {
                Bundle bundle3 = zzfldVar.F0;
                if (bundle != null) {
                    bundle.putAll(bundle3);
                }
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Ma)).booleanValue() && zzflgVar != null) {
            str3 = zzflgVar.i;
        }
        str3 = "";
        this.g = str3;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdx
    public final String zze() {
        return this.a;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdx
    public final String zzf() {
        return this.b;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdx
    public final List zzg() {
        return this.e;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdx
    public final com.google.android.gms.ads.internal.client.zzv zzh() {
        zzemv zzemvVar = this.h;
        if (zzemvVar != null) {
            return zzemvVar.f;
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdx
    public final Bundle zzi() {
        return this.i;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdx
    public final String zzj() {
        return this.c;
    }
}
