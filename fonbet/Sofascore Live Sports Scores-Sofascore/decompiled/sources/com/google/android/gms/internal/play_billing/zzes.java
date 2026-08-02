package com.google.android.gms.internal.play_billing;

import defpackage.loo;
import defpackage.p62;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzes extends zzgp implements zzhs {
    private static final zzes zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";

    static {
        zzes zzesVar = new zzes();
        zzb = zzesVar;
        zzgp.e(zzes.class, zzesVar);
    }

    private zzes() {
    }

    public static zzer p() {
        return (zzer) zzb.j();
    }

    public static /* synthetic */ void q(zzes zzesVar, String str) {
        zzesVar.zzd |= 4;
        zzesVar.zzg = str;
    }

    public static /* synthetic */ void r(zzes zzesVar, String str) {
        str.getClass();
        zzesVar.zzd |= 16;
        zzesVar.zzi = str;
    }

    public static /* synthetic */ void s(zzes zzesVar, String str) {
        zzesVar.zzd |= 32;
        zzesVar.zzj = str;
    }

    public static /* synthetic */ void t(zzes zzesVar) {
        zzesVar.zzd |= 8;
        zzesVar.zzh = p62.a;
    }

    public static /* synthetic */ void u(zzes zzesVar) {
        zzesVar.zzd |= 1;
        zzesVar.zze = 24;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgp
    public final Object i(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new loo(zzb, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new zzes();
        }
        if (i2 == 4) {
            return new zzer(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
