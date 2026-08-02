package com.google.android.gms.internal.play_billing;

import defpackage.loo;
import defpackage.p6o;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzel extends zzgp implements zzhs {
    private static final zzel zzb;
    private int zzd;
    private zzev zze;
    private zzev zzf;
    private int zzg;

    static {
        zzel zzelVar = new zzel();
        zzb = zzelVar;
        zzgp.e(zzel.class, zzelVar);
    }

    private zzel() {
    }

    public static zzek p() {
        return (zzek) zzb.j();
    }

    public static /* synthetic */ void q(zzel zzelVar, zzev zzevVar) {
        zzelVar.zze = zzevVar;
        zzelVar.zzd |= 1;
    }

    public static /* synthetic */ void r(zzel zzelVar, zzev zzevVar) {
        zzelVar.zzf = zzevVar;
        zzelVar.zzd |= 2;
    }

    public static /* synthetic */ void s(zzel zzelVar, int i) {
        zzelVar.zzg = i - 1;
        zzelVar.zzd |= 4;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgp
    public final Object i(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new loo(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003᠌\u0002", new Object[]{"zzd", "zze", "zzf", "zzg", p6o.b});
        }
        if (i2 == 3) {
            return new zzel();
        }
        if (i2 == 4) {
            return new zzek(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
