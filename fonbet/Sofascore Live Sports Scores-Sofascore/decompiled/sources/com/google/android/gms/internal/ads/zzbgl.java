package com.google.android.gms.internal.ads;

import android.util.Base64OutputStream;
import com.google.android.gms.ads.internal.util.client.zzo;
import defpackage.v4n;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbgl {
    public final int a;
    public final zzbgn b = new zzbgn();

    public zzbgl(int i) {
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v3 */
    public final String a(ArrayList arrayList) {
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        ?? r3 = 0;
        for (int i = 0; i < size; i++) {
            sb.append(((String) arrayList.get(i)).toLowerCase(Locale.US));
            sb.append('\n');
        }
        String[] split = sb.toString().split("\n");
        if (split.length == 0) {
            return "";
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(4096);
        Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 10);
        v4n v4nVar = new v4n(15);
        int i2 = this.a;
        PriorityQueue priorityQueue = new PriorityQueue(i2, v4nVar);
        int i3 = 0;
        while (i3 < split.length) {
            String[] b = zzbgm.b(split[i3], r3);
            if (b.length != 0) {
                int length = b.length;
                if (length < 6) {
                    zzbgp.a(i2, zzbgp.d(length, b), zzbgp.b(b, r3, length), length, priorityQueue);
                } else {
                    long d = zzbgp.d(6, b);
                    zzbgp.a(i2, d, zzbgp.b(b, r3, 6), 6, priorityQueue);
                    int i4 = 1;
                    while (true) {
                        int length2 = b.length;
                        if (i4 < length2 - 5) {
                            int a = zzbgm.a(b[i4 - 1]);
                            int a2 = zzbgm.a(b[i4 + 5]);
                            int i5 = i4;
                            String[] strArr = split;
                            String b2 = zzbgp.b(b, i5, 6);
                            d = (((a2 + 2147483647L) % 1073807359) + (((((d + 1073807359) - ((((a + 2147483647L) % 1073807359) * zzbgp.c(5, 16785407L)) % 1073807359)) % 1073807359) * 16785407) % 1073807359)) % 1073807359;
                            zzbgp.a(i2, d, b2, length2, priorityQueue);
                            i4 = i5 + 1;
                            split = strArr;
                            byteArrayOutputStream = byteArrayOutputStream;
                        }
                    }
                }
            }
            i3++;
            split = split;
            byteArrayOutputStream = byteArrayOutputStream;
            r3 = 0;
        }
        ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream;
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                base64OutputStream.write(this.b.b(((zzbgo) it.next()).b));
            } catch (IOException e) {
                int i6 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzg("Error while writing hash to byteStream", e);
            }
        }
        try {
            base64OutputStream.close();
        } catch (IOException e2) {
            int i7 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzg("HashManager: Unable to convert to Base64.", e2);
        }
        try {
            byteArrayOutputStream2.close();
            return byteArrayOutputStream2.toString();
        } catch (IOException e3) {
            int i8 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzg("HashManager: Unable to convert to Base64.", e3);
            return "";
        }
    }
}
