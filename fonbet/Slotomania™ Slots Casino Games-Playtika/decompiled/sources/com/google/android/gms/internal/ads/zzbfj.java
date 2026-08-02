package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
public final class zzbfj {
    private final int zza;
    private final zzbfg zzb = new zzbfl();

    public zzbfj(int i) {
        this.zza = i;
    }

    public final String zza(ArrayList arrayList) {
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            sb.append(((String) arrayList.get(i)).toLowerCase(Locale.US));
            sb.append('\n');
        }
        String[] split = sb.toString().split("\n");
        if (split.length == 0) {
            return "";
        }
        zzbfi zzbfiVar = new zzbfi();
        int i2 = this.zza;
        PriorityQueue priorityQueue = new PriorityQueue(i2, new zzbfh(this));
        for (String str : split) {
            String[] zzb = zzbfk.zzb(str, false);
            if (zzb.length != 0) {
                zzbfn.zza(zzb, i2, 6, priorityQueue);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                zzbfiVar.zzb.write(this.zzb.zza(((zzbfm) it.next()).zzb));
            } catch (IOException e) {
                int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Error while writing hash to byteStream", e);
            }
        }
        return zzbfiVar.toString();
    }
}
