package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.zzft;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzac;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzbkt;
import com.ironsource.U3;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
final class zzr {
    public final Context a;
    public final String b;
    public final TreeMap c = new TreeMap();
    public String d;
    public String e;
    public final String f;

    public zzr(Context context, String str) {
        String concat;
        this.a = context.getApplicationContext();
        this.b = str;
        String packageName = context.getPackageName();
        try {
            String str2 = Wrappers.a(context).b(0, context.getPackageName()).versionName;
            StringBuilder sb = new StringBuilder(String.valueOf(packageName).length() + 1 + String.valueOf(str2).length());
            sb.append(packageName);
            sb.append("-");
            sb.append(str2);
            concat = sb.toString();
        } catch (PackageManager.NameNotFoundException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to get package version name for reporting", e);
            concat = String.valueOf(packageName).concat("-missing");
        }
        this.f = concat;
    }

    public final String zza() {
        return this.e;
    }

    @Nullable
    public final String zzb() {
        return this.d;
    }

    public final String zzc() {
        return this.b;
    }

    public final String zzd() {
        return this.f;
    }

    public final Map zze() {
        return this.c;
    }

    public final void zzf(com.google.android.gms.ads.internal.client.zzm zzmVar, VersionInfoParcel versionInfoParcel) {
        TreeMap treeMap;
        zzft zzftVar = zzmVar.zzj;
        if (zzftVar != null) {
            this.d = zzftVar.zza;
        }
        Bundle bundle = zzmVar.zzm;
        Bundle bundle2 = bundle != null ? bundle.getBundle(AdMobAdapter.class.getName()) : null;
        if (bundle2 == null) {
            return;
        }
        String str = (String) zzbkt.c.c();
        Iterator<String> it = bundle2.keySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            treeMap = this.c;
            if (!hasNext) {
                break;
            }
            String next = it.next();
            if (str.equals(next)) {
                this.e = bundle2.getString(next);
            } else if (next.startsWith("csa_")) {
                treeMap.put(next.substring(4), bundle2.getString(next));
            }
        }
        treeMap.put(U3.j.q, versionInfoParcel.afmaVersion);
        if (((Boolean) zzbkt.a.c()).booleanValue()) {
            Bundle zzb = zzac.zzb(this.a, (String) zzbkt.b.c());
            for (String str2 : zzb.keySet()) {
                treeMap.put(str2, zzb.get(str2).toString());
            }
        }
    }
}
