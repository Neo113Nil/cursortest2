package com.google.android.gms.internal.ads;

import android.os.Parcelable;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.internal.ads.zzbil;
import defpackage.c9o;
import defpackage.g9o;
import defpackage.jjn;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class r implements zzfnl {
    public final ConcurrentHashMap a;
    public final zzfns b;
    public final jjn c = new jjn();

    public r(zzfns zzfnsVar) {
        this.a = new ConcurrentHashMap(zzfnsVar.e);
        this.b = zzfnsVar;
    }

    public final synchronized boolean a(zzfnv zzfnvVar, zzfnu zzfnuVar) {
        boolean z;
        try {
            ConcurrentHashMap concurrentHashMap = this.a;
            c9o c9oVar = (c9o) concurrentHashMap.get(zzfnvVar);
            zzfnuVar.d = com.google.android.gms.ads.internal.zzt.zzk().a();
            if (c9oVar == null) {
                zzfns zzfnsVar = this.b;
                c9o c9oVar2 = new c9o(zzfnsVar.e, zzfnsVar.f * 1000);
                if (concurrentHashMap.size() == zzfnsVar.d) {
                    int i = zzfnsVar.j;
                    int i2 = i - 1;
                    zzfnv zzfnvVar2 = null;
                    if (i == 0) {
                        throw null;
                    }
                    long j = Long.MAX_VALUE;
                    if (i2 == 0) {
                        for (Map.Entry entry : concurrentHashMap.entrySet()) {
                            if (((c9o) entry.getValue()).d.a < j) {
                                j = ((c9o) entry.getValue()).d.a;
                                zzfnvVar2 = (zzfnv) entry.getKey();
                            }
                        }
                        if (zzfnvVar2 != null) {
                            concurrentHashMap.remove(zzfnvVar2);
                        }
                    } else if (i2 == 1) {
                        for (Map.Entry entry2 : concurrentHashMap.entrySet()) {
                            if (((c9o) entry2.getValue()).d.c < j) {
                                j = ((c9o) entry2.getValue()).d.c;
                                zzfnvVar2 = (zzfnv) entry2.getKey();
                            }
                        }
                        if (zzfnvVar2 != null) {
                            concurrentHashMap.remove(zzfnvVar2);
                        }
                    } else if (i2 == 2) {
                        int i3 = Integer.MAX_VALUE;
                        for (Map.Entry entry3 : concurrentHashMap.entrySet()) {
                            if (((c9o) entry3.getValue()).d.d < i3) {
                                i3 = ((c9o) entry3.getValue()).d.d;
                                zzfnvVar2 = (zzfnv) entry3.getKey();
                            }
                        }
                        if (zzfnvVar2 != null) {
                            concurrentHashMap.remove(zzfnvVar2);
                        }
                    }
                    jjn jjnVar = this.c;
                    jjnVar.b++;
                    ((zzfnn) jjnVar.f).b = true;
                }
                concurrentHashMap.put(zzfnvVar, c9oVar2);
                jjn jjnVar2 = this.c;
                jjnVar2.a++;
                ((zzfnn) jjnVar2.f).a = true;
                c9oVar = c9oVar2;
            }
            g9o g9oVar = c9oVar.d;
            g9oVar.c = com.google.android.gms.ads.internal.zzt.zzk().a();
            g9oVar.d++;
            c9oVar.a();
            LinkedList linkedList = c9oVar.a;
            if (linkedList.size() == c9oVar.b) {
                z = false;
            } else {
                linkedList.add(zzfnuVar);
                z = true;
            }
            jjn jjnVar3 = this.c;
            jjnVar3.e++;
            zzfnn zzfnnVar = (zzfnn) jjnVar3.f;
            zzfnn clone = zzfnnVar.clone();
            zzfnnVar.a = false;
            zzfnnVar.b = false;
            zzfoi zzfoiVar = c9oVar.d.b;
            zzfoi clone2 = zzfoiVar.clone();
            zzfoiVar.a = false;
            zzfoiVar.b = 0;
            zzbil.zzb.zzc F = zzbil.zzb.F();
            zzbil.zzb.zza.C0136zza H = zzbil.zzb.zza.H();
            H.n();
            ((zzbil.zzb.zza) H.b).E();
            zzbil.zzb.zzg.zza H2 = zzbil.zzb.zzg.H();
            boolean z2 = clone.a;
            H2.n();
            ((zzbil.zzb.zzg) H2.b).E(z2);
            boolean z3 = clone.b;
            H2.n();
            ((zzbil.zzb.zzg) H2.b).F(z3);
            int i4 = clone2.b;
            H2.n();
            ((zzbil.zzb.zzg) H2.b).G(i4);
            H.n();
            ((zzbil.zzb.zza) H.b).G((zzbil.zzb.zzg) H2.o());
            F.n();
            ((zzbil.zzb) F.b).E((zzbil.zzb.zza) H.o());
            zzfnuVar.a.zza().f.D((zzbil.zzb) F.o());
            b();
        } catch (Throwable th) {
            throw th;
        }
        return z;
    }

    public final void b() {
        Parcelable.Creator<zzfns> creator = zzfns.CREATOR;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.t7)).booleanValue()) {
            StringBuilder sb = new StringBuilder();
            zzfns zzfnsVar = this.b;
            sb.append(zzfnsVar.c);
            sb.append(" PoolCollection");
            StringBuilder sb2 = new StringBuilder("\n\tPool does not exist: ");
            jjn jjnVar = this.c;
            sb2.append(jjnVar.c);
            sb2.append("\n\tNew pools created: ");
            sb2.append(jjnVar.a);
            sb2.append("\n\tPools removed: ");
            sb2.append(jjnVar.b);
            sb2.append("\n\tEntries added: ");
            sb2.append(jjnVar.e);
            sb2.append("\n\tNo entries retrieved: ");
            sb2.append(jjnVar.d);
            sb2.append("\n");
            sb.append(sb2.toString());
            int i = 0;
            for (Map.Entry entry : this.a.entrySet()) {
                i++;
                sb.append(i);
                sb.append(". ");
                sb.append(entry.getValue());
                sb.append("#");
                sb.append(((zzfnv) entry.getKey()).hashCode());
                sb.append("    ");
                int i2 = 0;
                while (true) {
                    c9o c9oVar = (c9o) entry.getValue();
                    c9oVar.a();
                    if (i2 >= c9oVar.a.size()) {
                        break;
                    }
                    sb.append("[O]");
                    i2++;
                }
                c9o c9oVar2 = (c9o) entry.getValue();
                c9oVar2.a();
                for (int size = c9oVar2.a.size(); size < zzfnsVar.e; size++) {
                    sb.append("[ ]");
                }
                sb.append("\n");
                g9o g9oVar = ((c9o) entry.getValue()).d;
                sb.append("Created: " + g9oVar.a + " Last accessed: " + g9oVar.c + " Accesses: " + g9oVar.d + "\nEntries retrieved: Valid: " + g9oVar.e + " Stale: " + g9oVar.f);
                sb.append("\n");
            }
            while (i < zzfnsVar.d) {
                i++;
                sb.append(i);
                sb.append(".\n");
            }
            String sb3 = sb.toString();
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzd(sb3);
        }
    }
}
