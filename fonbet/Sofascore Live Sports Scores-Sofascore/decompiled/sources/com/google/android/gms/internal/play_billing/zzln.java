package com.google.android.gms.internal.play_billing;

import defpackage.loo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzln extends zzgp implements zzhs {
    private static final zzln zzb;
    private int zzd;
    private int zze;
    private boolean zzf;
    private long zzg;
    private boolean zzh;
    private int zzi;
    private int zzj;

    static {
        zzln zzlnVar = new zzln();
        zzb = zzlnVar;
        zzgp.e(zzln.class, zzlnVar);
    }

    private zzln() {
    }

    public static zzll p() {
        return (zzll) zzb.j();
    }

    public static /* synthetic */ void q(zzln zzlnVar, boolean z) {
        zzlnVar.zzd |= 8;
        zzlnVar.zzh = z;
    }

    public static /* synthetic */ void r(zzln zzlnVar, int i) {
        zzlnVar.zzd |= 16;
        zzlnVar.zzi = i;
    }

    public static /* synthetic */ void s(zzln zzlnVar, long j) {
        zzlnVar.zzd |= 4;
        zzlnVar.zzg = j;
    }

    public static /* synthetic */ void t(zzln zzlnVar, int i) {
        zzlnVar.zzd |= 32;
        zzlnVar.zzj = i;
    }

    public static /* synthetic */ void u(zzln zzlnVar) {
        zzlnVar.zzd |= 2;
        zzlnVar.zzf = true;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgp
    public final Object i(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new loo(zzb, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001\u0003ဂ\u0002\u0004ဇ\u0003\u0005င\u0004\u0006င\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new zzln();
        }
        if (i2 == 4) {
            return new zzll(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
