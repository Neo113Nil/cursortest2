package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbfx {
    public int b;
    public final Object a = new Object();
    public final LinkedList c = new LinkedList();

    public final void a(zzbfw zzbfwVar) {
        synchronized (this.a) {
            try {
                Iterator it = this.c.iterator();
                while (it.hasNext()) {
                    zzbfw zzbfwVar2 = (zzbfw) it.next();
                    if (com.google.android.gms.ads.internal.zzt.zzh().g().zzc()) {
                        if (!com.google.android.gms.ads.internal.zzt.zzh().g().zze() && !zzbfwVar.equals(zzbfwVar2) && zzbfwVar2.q.equals(zzbfwVar.q)) {
                            it.remove();
                            return;
                        }
                    } else if (!zzbfwVar.equals(zzbfwVar2) && zzbfwVar2.o.equals(zzbfwVar.o)) {
                        it.remove();
                        return;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(zzbfw zzbfwVar) {
        synchronized (this.a) {
            try {
                LinkedList linkedList = this.c;
                if (linkedList.size() >= 10) {
                    int size = linkedList.size();
                    StringBuilder sb = new StringBuilder(String.valueOf(size).length() + 30);
                    sb.append("Queue is full, current size = ");
                    sb.append(size);
                    String sb2 = sb.toString();
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    zzo.zzd(sb2);
                    linkedList.remove(0);
                }
                int i2 = this.b;
                this.b = i2 + 1;
                zzbfwVar.l = i2;
                synchronized (zzbfwVar.g) {
                    try {
                        int i3 = zzbfwVar.k;
                        int i4 = zzbfwVar.l;
                        int i5 = zzbfwVar.b;
                        if (!zzbfwVar.d) {
                            i5 = (i4 * i5) + (i3 * zzbfwVar.a);
                        }
                        if (i5 > zzbfwVar.n) {
                            zzbfwVar.n = i5;
                        }
                    } finally {
                    }
                }
                linkedList.add(zzbfwVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
