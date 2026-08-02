package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes3.dex */
final class zzatq {
    long zza;
    final String zzb;
    final String zzc;
    final long zzd;
    final long zze;
    final long zzf;
    final long zzg;
    final List zzh;

    private zzatq(String str, String str2, long j, long j2, long j3, long j4, List list) {
        this.zzb = str;
        this.zzc = true == "".equals(str2) ? null : str2;
        this.zzd = j;
        this.zze = j2;
        this.zzf = j3;
        this.zzg = j4;
        this.zzh = list;
    }

    static zzatq zza(zzatr zzatrVar) throws IOException {
        if (zzatt.zzi(zzatrVar) != 538247942) {
            throw new IOException();
        }
        String zzm = zzatt.zzm(zzatrVar);
        String zzm2 = zzatt.zzm(zzatrVar);
        long zzk = zzatt.zzk(zzatrVar);
        long zzk2 = zzatt.zzk(zzatrVar);
        long zzk3 = zzatt.zzk(zzatrVar);
        long zzk4 = zzatt.zzk(zzatrVar);
        int zzi = zzatt.zzi(zzatrVar);
        if (zzi < 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(zzi).length() + 20);
            sb.append("readHeaderList size=");
            sb.append(zzi);
            throw new IOException(sb.toString());
        }
        List emptyList = zzi == 0 ? Collections.emptyList() : new ArrayList();
        for (int i = 0; i < zzi; i++) {
            emptyList.add(new zzasp(zzatt.zzm(zzatrVar).intern(), zzatt.zzm(zzatrVar).intern()));
        }
        return new zzatq(zzm, zzm2, zzk, zzk2, zzk3, zzk4, emptyList);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    zzatq(String str, zzasg zzasgVar) {
        this(str, r2, r3, r5, r7, r9, r0);
        String str2 = zzasgVar.zzb;
        long j = zzasgVar.zzc;
        long j2 = zzasgVar.zzd;
        long j3 = zzasgVar.zze;
        long j4 = zzasgVar.zzf;
        List list = zzasgVar.zzh;
        if (list == null) {
            Map map = zzasgVar.zzg;
            list = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                list.add(new zzasp((String) entry.getKey(), (String) entry.getValue()));
            }
        }
    }
}
