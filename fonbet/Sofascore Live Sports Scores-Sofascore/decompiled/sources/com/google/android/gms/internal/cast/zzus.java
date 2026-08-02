package com.google.android.gms.internal.cast;

import defpackage.uic;
import defpackage.zfp;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzus extends zzyd implements zzzj {
    private static final zzus zzm;
    private int zzb;
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private boolean zzj;
    private int zzk;
    private boolean zzl;

    static {
        zzus zzusVar = new zzus();
        zzm = zzusVar;
        zzyd.g(zzus.class, zzusVar);
    }

    private zzus() {
    }

    public static zzur n() {
        return (zzur) zzm.d();
    }

    @Override // com.google.android.gms.internal.cast.zzyd
    public final Object i(int i, zzyd zzydVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zfp(zzm, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဇ\u0006\b᠌\u0007\tဇ\b", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", uic.n, "zzl"});
        }
        if (i2 == 3) {
            return new zzus();
        }
        if (i2 == 4) {
            return new zzur(zzm);
        }
        if (i2 == 5) {
            return zzm;
        }
        throw null;
    }

    public final /* synthetic */ void o(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzd = str;
    }

    public final /* synthetic */ void p(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zze = str;
    }

    public final /* synthetic */ void q(String str) {
        str.getClass();
        this.zzb |= 4;
        this.zzf = str;
    }

    public final /* synthetic */ void r(String str) {
        str.getClass();
        this.zzb |= 8;
        this.zzg = str;
    }

    public final /* synthetic */ void s(String str) {
        str.getClass();
        this.zzb |= 16;
        this.zzh = str;
    }

    public final /* synthetic */ void v(String str) {
        str.getClass();
        this.zzb |= 32;
        this.zzi = str;
    }

    public final /* synthetic */ void w(int i) {
        this.zzk = i - 1;
        this.zzb |= 128;
    }
}
