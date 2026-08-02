package com.google.android.gms.internal.consent_sdk;

import android.os.Build;
import defpackage.a5p;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzgw extends zzqm implements zzrr {
    private static final zzgw zzb;
    private int zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private int zzh;

    static {
        zzgw zzgwVar = new zzgw();
        zzb = zzgwVar;
        zzqm.m(zzgw.class, zzgwVar);
    }

    private zzgw() {
    }

    public static zzgv n() {
        return (zzgv) zzb.h();
    }

    public static /* synthetic */ void o(zzgw zzgwVar, int i) {
        zzgwVar.zzd |= 8;
        zzgwVar.zzh = i;
    }

    public static /* synthetic */ void p(zzgw zzgwVar) {
        String str = Build.MODEL;
        str.getClass();
        zzgwVar.zzd |= 4;
        zzgwVar.zzg = str;
    }

    public static /* synthetic */ void q(zzgw zzgwVar) {
        String str = Build.VERSION.RELEASE;
        str.getClass();
        zzgwVar.zzd |= 2;
        zzgwVar.zzf = str;
    }

    public static /* synthetic */ void r(zzgw zzgwVar) {
        zzgwVar.zze = 1;
        zzgwVar.zzd = 1 | zzgwVar.zzd;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    public final Object f(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new a5p(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004င\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzgw();
        }
        if (i2 == 4) {
            return new zzgv(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
