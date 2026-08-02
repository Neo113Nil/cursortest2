package com.google.android.gms.internal.ads;

import io.ktor.sse.ServerSentEventKt;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes2.dex */
final class zzaos {
    public final String zza;
    public final int zzb;
    public final String zzc;
    public final Set zzd;

    private zzaos(String str, int i, String str2, Set set) {
        this.zzb = i;
        this.zza = str;
        this.zzc = str2;
        this.zzd = set;
    }

    public static zzaos zza(String str, int i) {
        String str2;
        String trim = str.trim();
        zzgsw.zza(!trim.isEmpty());
        int indexOf = trim.indexOf(ServerSentEventKt.SPACE);
        if (indexOf == -1) {
            str2 = "";
        } else {
            String trim2 = trim.substring(indexOf).trim();
            trim = trim.substring(0, indexOf);
            str2 = trim2;
        }
        String str3 = zzfk.zza;
        String[] split = trim.split("\\.", -1);
        String str4 = split[0];
        HashSet hashSet = new HashSet();
        for (int i2 = 1; i2 < split.length; i2++) {
            hashSet.add(split[i2]);
        }
        return new zzaos(str4, i, str2, hashSet);
    }

    public static zzaos zzb() {
        return new zzaos("", 0, "", Collections.emptySet());
    }
}
