package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.PriorityQueue;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbgp {
    public static void a(int i, long j, String str, int i2, PriorityQueue priorityQueue) {
        zzbgo zzbgoVar = new zzbgo(i2, j, str);
        if ((priorityQueue.size() != i || (((zzbgo) priorityQueue.peek()).c <= i2 && ((zzbgo) priorityQueue.peek()).a <= j)) && !priorityQueue.contains(zzbgoVar)) {
            priorityQueue.add(zzbgoVar);
            if (priorityQueue.size() > i) {
                priorityQueue.poll();
            }
        }
    }

    public static String b(String[] strArr, int i, int i2) {
        int i3 = i2 + i;
        if (strArr.length < i3) {
            int i4 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzf("Unable to construct shingle");
            return "";
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i5 = i3 - 1;
            if (i >= i5) {
                sb.append(strArr[i5]);
                return sb.toString();
            }
            sb.append(strArr[i]);
            sb.append(' ');
            i++;
        }
    }

    public static long c(int i, long j) {
        if (i == 1) {
            return j;
        }
        int i2 = i >> 1;
        long j2 = (j * j) % 1073807359;
        return (i & 1) == 0 ? c(i2, j2) % 1073807359 : ((c(i2, j2) % 1073807359) * j) % 1073807359;
    }

    public static long d(int i, String[] strArr) {
        long a = (zzbgm.a(strArr[0]) + 2147483647L) % 1073807359;
        for (int i2 = 1; i2 < i; i2++) {
            a = (((zzbgm.a(strArr[i2]) + 2147483647L) % 1073807359) + ((a * 16785407) % 1073807359)) % 1073807359;
        }
        return a;
    }
}
