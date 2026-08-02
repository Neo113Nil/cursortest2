package com.google.android.gms.internal.cast;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.cast.CastDevice;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import xsna.dez0;
import xsna.g0a;
import xsna.o100;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
final class zzaa {
    public static final /* synthetic */ int zzc = 0;
    private static final o100 zzd = new o100("SessionFlowSummary", null);
    private static final String zzf = "22.3.1";
    private static long zzg = System.currentTimeMillis();

    @Nullable
    g0a zza;
    private final zzj zzl;
    private final String zzm;
    private final long zzo;

    @Nullable
    private String zzp;

    @Nullable
    private String zzq;

    @Nullable
    private zzt zzr;

    @Nullable
    private String zzs;

    @Nullable
    private String zzt;

    @Nullable
    private String zzu;

    @Nullable
    private String zzv;

    @Nullable
    private String zzw;

    @Nullable
    private String zzx;
    private int zzy;
    private final zzhg zze = zzhj.zza(zzz.zza);
    private final List zzh = dez0.b();
    private final List zzi = dez0.b();
    private final List zzj = dez0.b();
    private final Map zzk = Collections.synchronizedMap(new HashMap());
    public int zzb = 0;
    private final long zzn = System.currentTimeMillis();

    private zzaa(zzj zzjVar, String str) {
        this.zzl = zzjVar;
        this.zzm = str;
        long j = zzg;
        zzg = 1 + j;
        this.zzo = j;
    }

    public static zzaa zza(zzj zzjVar, String str) {
        return new zzaa(zzjVar, str);
    }

    public final void zzb(zzcs zzcsVar) {
        zzcsVar.zza(this.zzn);
        this.zzh.add(zzcsVar);
    }

    public final void zzc(zzac zzacVar) {
        zzacVar.zza(this.zzn);
        this.zzi.add(zzacVar);
    }

    public final void zzd(zzcq zzcqVar) {
        zzcqVar.zza(this.zzn);
        this.zzj.add(zzcqVar);
    }

    public final void zze(zzt zztVar) {
        zzt zztVar2 = this.zzr;
        if (zztVar2 == null || !zztVar2.zza()) {
            zztVar.zzb(this.zzn);
            this.zzr = zztVar;
        }
    }

    public final void zzf() {
        this.zzy++;
    }

    public final void zzg(String str) {
        String str2 = this.zzp;
        if (str2 == null) {
            this.zzp = str;
        } else {
            if (TextUtils.equals(str, str2)) {
                return;
            }
            zzj(4);
        }
    }

    public final void zzh(@Nullable g0a g0aVar) {
        if (g0aVar == null) {
            zzj(2);
            return;
        }
        CastDevice j = g0aVar.j();
        if (j == null) {
            zzj(3);
            return;
        }
        String str = j.m;
        this.zza = g0aVar;
        String str2 = this.zzq;
        if (str2 != null) {
            if (TextUtils.equals(str2, str)) {
                return;
            }
            zzj(5);
            return;
        }
        this.zzq = str;
        this.zzs = j.f;
        this.zzb = j.zzd();
        com.google.android.gms.cast.internal.zzaa k = j.k();
        if (k != null) {
            this.zzt = k.e;
            this.zzu = k.f;
            this.zzv = k.g;
            this.zzw = k.h;
            this.zzx = k.i;
        }
        g0aVar.i();
    }

    public final void zzi() {
        long j;
        g0a g0aVar = this.zza;
        if (g0aVar != null) {
            g0aVar.m = null;
            this.zza = null;
        }
        long j2 = this.zzo;
        zzqq zzc2 = zzqr.zzc();
        zzc2.zza(j2);
        String str = this.zzq;
        if (str != null) {
            zzc2.zzf(str);
        }
        zzur zza = zzus.zza();
        if (!TextUtils.isEmpty(this.zzs)) {
            zzc2.zzb(this.zzs);
            zza.zza(this.zzs);
        }
        if (!TextUtils.isEmpty(this.zzt)) {
            zza.zzb(this.zzt);
        }
        if (!TextUtils.isEmpty(this.zzu)) {
            zza.zzc(this.zzu);
        }
        if (!TextUtils.isEmpty(this.zzv)) {
            zza.zzd(this.zzv);
        }
        if (!TextUtils.isEmpty(this.zzw)) {
            zza.zze(this.zzw);
        }
        if (!TextUtils.isEmpty(this.zzx)) {
            zza.zzf(this.zzx);
        }
        zza.zzg(zzco.zza(this.zzb));
        zzc2.zzn((zzus) zza.zzu());
        zzqb zza2 = zzqc.zza();
        zza2.zzb(zzf);
        zza2.zza(this.zzm);
        zzc2.zzl((zzqc) zza2.zzu());
        zzhg zzhgVar = this.zze;
        zzqy zza3 = zzqz.zza();
        String str2 = (String) zzhgVar.zza();
        if (str2 != null) {
            zzro zza4 = zzrp.zza();
            zza4.zza(str2);
            zza3.zza((zzrp) zza4.zzu());
        }
        String str3 = this.zzp;
        if (str3 != null) {
            try {
                String replace = str3.replace("-", "");
                j = new BigInteger(replace.substring(0, Math.min(16, replace.length())), 16).longValue();
            } catch (NumberFormatException unused) {
                zzd.c("receiverSessionId %s is not valid for hash", str3);
                j = 0;
            }
            zza3.zzb(j);
        }
        List list = this.zzh;
        if (!list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((zzcs) it.next()).zzb());
            }
            zza3.zzc(arrayList);
        }
        List list2 = this.zzi;
        if (!list2.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((zzac) it2.next()).zzb());
            }
            zza3.zze(arrayList2);
        }
        List list3 = this.zzj;
        if (!list3.isEmpty()) {
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = list3.iterator();
            while (it3.hasNext()) {
                arrayList3.add(((zzcq) it3.next()).zzb());
            }
            zza3.zzd(arrayList3);
        }
        if (this.zzr != null) {
            ArrayList arrayList4 = new ArrayList();
            arrayList4.add(this.zzr.zzc());
            zza3.zzg(arrayList4);
        }
        Map map = this.zzk;
        if (!map.isEmpty()) {
            ArrayList arrayList5 = new ArrayList();
            Iterator it4 = map.values().iterator();
            while (it4.hasNext()) {
                arrayList5.add(((zzae) it4.next()).zza());
            }
            zza3.zzf(arrayList5);
        }
        zza3.zzh(this.zzy);
        zzc2.zzk((zzqz) zza3.zzu());
        this.zzl.zzd((zzqr) zzc2.zzu(), 233);
    }

    public final void zzj(int i) {
        Map map = this.zzk;
        Integer valueOf = Integer.valueOf(i - 1);
        zzae zzaeVar = (zzae) map.get(valueOf);
        if (zzaeVar != null) {
            zzaeVar.zzc();
            return;
        }
        zzae zzaeVar2 = new zzae(new zzad(i));
        zzaeVar2.zzb(this.zzn);
        map.put(valueOf, zzaeVar2);
    }
}
