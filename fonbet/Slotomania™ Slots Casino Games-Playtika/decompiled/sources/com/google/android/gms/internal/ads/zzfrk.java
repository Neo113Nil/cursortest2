package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
public final class zzfrk {
    private final zzeor zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final Context zze;
    private final zzfkf zzf;
    private final zzfkg zzg;
    private final Clock zzh;
    private final zzbai zzi;

    public zzfrk(zzeor zzeorVar, VersionInfoParcel versionInfoParcel, String str, String str2, Context context, zzfkf zzfkfVar, zzfkg zzfkgVar, Clock clock, zzbai zzbaiVar) {
        this.zza = zzeorVar;
        this.zzb = versionInfoParcel.afmaVersion;
        this.zzc = str;
        this.zzd = str2;
        this.zze = context;
        this.zzf = zzfkfVar;
        this.zzg = zzfkgVar;
        this.zzh = clock;
        this.zzi = zzbaiVar;
    }

    public static String zzd(String str, String str2, String str3) {
        if (true == TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return str.replaceAll(str2, str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzg(String str) {
        return TextUtils.isEmpty(str) ? "" : com.google.android.gms.ads.internal.util.client.zzl.zzj() ? "fakeForAdDebugLog" : str;
    }

    public final List zza(zzfke zzfkeVar, zzfjt zzfjtVar, List list) {
        return zzb(zzfkeVar, zzfjtVar, false, "", "", list, null, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0155, code lost:
    
        if (r5 == false) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List zzb(zzfke zzfkeVar, zzfjt zzfjtVar, boolean z, String str, String str2, List list, zzdbb zzdbbVar, zzces zzcesVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            boolean z2 = true;
            String zzd = zzd(zzd(zzd((String) it.next(), "@gw_adlocid@", zzfkeVar.zza.zza.zzg), "@gw_adnetrefresh@", true != z ? "0" : "1"), "@gw_sdkver@", this.zzb);
            if (zzfjtVar != null) {
                String zzd2 = zzd(zzd(zzd(zzd, "@gw_qdata@", zzfjtVar.zzy), "@gw_adnetid@", zzfjtVar.zzx), "@gw_allocid@", zzfjtVar.zzw);
                Context context = this.zze;
                zzd = zzcdp.zza(zzd2, context, zzfjtVar.zzW, zzfjtVar.zzaw);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzoX)).booleanValue() && zzfjtVar.zze == 4) {
                    com.google.android.gms.ads.internal.zzt.zzc();
                    zzd = zzd(zzd, "@gw_aps@", true == com.google.android.gms.ads.internal.util.zzs.zzJ(context) ? "1" : "0");
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzpi)).booleanValue() && zzcesVar != null) {
                    int i = zzcesVar.zza;
                    String zzd3 = zzd(zzd, "@gw_is@", i >= 0 ? Integer.toString(i) : "");
                    int i2 = zzcesVar.zzb;
                    String zzd4 = zzd(zzd3, "@gw_fis@", i2 >= 0 ? Integer.toString(i2) : "");
                    int i3 = zzcesVar.zzc;
                    zzd = zzd(zzd4, "@gw_sfis@", i3 >= 0 ? Integer.toString(i3) : "");
                }
            }
            zzeor zzeorVar = this.zza;
            String zzd5 = zzd(zzd(zzd(zzd(zzd, "@gw_adnetstatus@", zzeorVar.zzg()), "@gw_ttr@", Long.toString(zzeorVar.zzh(), 10)), "@gw_seqnum@", this.zzc), "@gw_sessid@", this.zzd);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzpg)).booleanValue()) {
                zzd5 = (zzdbbVar == null || zzdbbVar.zza() <= 0) ? zzd(zzd5, "@gw_placement_id@", "") : zzd(zzd5, "@gw_placement_id@", Long.toString(zzdbbVar.zza(), 10));
            }
            boolean z3 = false;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzet)).booleanValue() && !TextUtils.isEmpty(str)) {
                z3 = true;
            }
            boolean isEmpty = TextUtils.isEmpty(str2);
            boolean z4 = !isEmpty;
            if (z3) {
                z2 = z4;
            }
            if (this.zzi.zza(Uri.parse(zzd5))) {
                Uri.Builder buildUpon = Uri.parse(zzd5).buildUpon();
                if (z3) {
                    buildUpon = buildUpon.appendQueryParameter("ms", str);
                }
                if (z2) {
                    buildUpon = buildUpon.appendQueryParameter("attok", str2);
                }
                zzd5 = buildUpon.build().toString();
                arrayList.add(zzd5);
            }
            arrayList.add(zzd5);
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005f A[LOOP:0: B:10:0x0059->B:12:0x005f, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List zzc(zzfjt zzfjtVar, List list, zzcbd zzcbdVar) {
        zzfkf zzfkfVar;
        zzgsu zzd;
        Iterator it;
        ArrayList arrayList = new ArrayList();
        long currentTimeMillis = this.zzh.currentTimeMillis();
        try {
            String zzb = zzcbdVar.zzb();
            String num = Integer.toString(zzcbdVar.zzc());
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzeu)).booleanValue()) {
                zzfkg zzfkgVar = this.zzg;
                if (zzfkgVar == null) {
                    zzd = zzgsu.zzc();
                    String str = (String) zzd.zzb(zzfrj.zza).zza("");
                    String str2 = (String) zzd.zzb(zzfri.zza).zza("");
                    it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(zzcdp.zza(zzd(zzd(zzd(zzd(zzd(zzd((String) it.next(), "@gw_rwd_userid@", Uri.encode(str)), "@gw_rwd_custom_data@", Uri.encode(str2)), "@gw_tmstmp@", Long.toString(currentTimeMillis)), "@gw_rwd_itm@", Uri.encode(zzb)), "@gw_rwd_amt@", num), "@gw_sdkver@", this.zzb), this.zze, zzfjtVar.zzW, zzfjtVar.zzaw));
                    }
                    return arrayList;
                }
                zzfkfVar = zzfkgVar.zza;
            } else {
                zzfkfVar = this.zzf;
            }
            zzd = zzgsu.zzd(zzfkfVar);
            String str3 = (String) zzd.zzb(zzfrj.zza).zza("");
            String str22 = (String) zzd.zzb(zzfri.zza).zza("");
            it = list.iterator();
            while (it.hasNext()) {
            }
            return arrayList;
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to determine award type and amount.", e);
            return arrayList;
        }
    }
}
