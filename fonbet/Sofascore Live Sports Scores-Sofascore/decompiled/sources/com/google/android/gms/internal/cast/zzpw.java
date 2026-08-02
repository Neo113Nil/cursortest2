package com.google.android.gms.internal.cast;

import defpackage.ccd;
import defpackage.mdp;
import defpackage.wfp;
import defpackage.zfp;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzpw extends zzyd implements zzzj {
    private static final zzpw zzh;
    private int zzb;
    private zzqc zzd;
    private zzsx zze;
    private zzyl zzf = wfp.e;
    private zzyj zzg = mdp.e;

    static {
        zzpw zzpwVar = new zzpw();
        zzh = zzpwVar;
        zzyd.g(zzpw.class, zzpwVar);
    }

    private zzpw() {
    }

    public static zzpv n() {
        return (zzpv) zzh.d();
    }

    @Override // com.google.android.gms.internal.cast.zzyd
    public final Object i(int i, zzyd zzydVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zfp(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b\u0004ࠞ", new Object[]{"zzb", "zzd", "zze", "zzf", zzsr.class, "zzg", ccd.n});
        }
        if (i2 == 3) {
            return new zzpw();
        }
        if (i2 == 4) {
            return new zzpv(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        throw null;
    }

    public final /* synthetic */ void o(zzqc zzqcVar) {
        this.zzd = zzqcVar;
        this.zzb |= 1;
    }

    public final void p(ArrayList arrayList) {
        zzyj zzyjVar = this.zzg;
        if (!zzyjVar.zza()) {
            int size = zzyjVar.size();
            this.zzg = zzyjVar.zzf(size + size);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.zzg.g(((zzpm) it.next()).a);
        }
    }
}
