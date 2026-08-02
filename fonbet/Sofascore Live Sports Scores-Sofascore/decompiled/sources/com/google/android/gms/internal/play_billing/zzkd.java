package com.google.android.gms.internal.play_billing;

import defpackage.boo;
import defpackage.loo;
import defpackage.p6o;
import defpackage.pfo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzkd extends zzgp implements zzhs {
    private static final zzkd zzb;
    private int zzd;
    private int zzf;
    private zzju zzi;
    private boolean zzj;
    private boolean zzk;
    private zzld zzl;
    private String zze = "";
    private zzgt zzg = pfo.e;
    private zzgu zzh = boo.e;

    static {
        zzkd zzkdVar = new zzkd();
        zzb = zzkdVar;
        zzgp.e(zzkd.class, zzkdVar);
    }

    private zzkd() {
    }

    public static zzka p() {
        return (zzka) zzb.j();
    }

    public static void q(zzkd zzkdVar, zzjz zzjzVar) {
        zzgt zzgtVar = zzkdVar.zzg;
        if (!zzgtVar.zzc()) {
            int size = zzgtVar.size();
            zzkdVar.zzg = zzgtVar.i(size + size);
        }
        zzkdVar.zzg.g(zzjzVar.a);
    }

    public static /* synthetic */ void r(zzkd zzkdVar, zzju zzjuVar) {
        zzkdVar.zzi = zzjuVar;
        zzkdVar.zzd |= 4;
    }

    public static /* synthetic */ void s(zzkd zzkdVar) {
        zzkdVar.zzd |= 1;
        zzkdVar.zze = "ProxyBillingBroadcastReceiver";
    }

    public static /* synthetic */ void t(zzkd zzkdVar, zzld zzldVar) {
        zzkdVar.zzl = zzldVar;
        zzkdVar.zzd |= 32;
    }

    public static /* synthetic */ void u(zzkd zzkdVar, int i) {
        zzkdVar.zzf = i - 1;
        zzkdVar.zzd |= 2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgp
    public final Object i(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new loo(zzb, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0002\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ࠬ\u0004\u001b\u0005ဉ\u0002\u0006ဇ\u0003\u0007ဇ\u0004\bဉ\u0005", new Object[]{"zzd", "zze", "zzf", p6o.f, "zzg", p6o.e, "zzh", zzkz.class, "zzi", "zzj", "zzk", "zzl"});
        }
        if (i2 == 3) {
            return new zzkd();
        }
        if (i2 == 4) {
            return new zzka(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
