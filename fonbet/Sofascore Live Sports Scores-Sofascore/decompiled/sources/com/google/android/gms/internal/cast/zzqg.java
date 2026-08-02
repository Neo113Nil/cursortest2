package com.google.android.gms.internal.cast;

import defpackage.it7;
import defpackage.mx9;
import defpackage.tnf;
import defpackage.ufp;
import defpackage.zfp;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzqg extends zzyd implements zzzj {
    private static final zzqg zzs;
    private int zzb;
    private zzrp zzd;
    private boolean zze;
    private long zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private zzui zzl;
    private int zzm;
    private int zzn;
    private boolean zzo;
    private int zzp;
    private int zzq;
    private boolean zzr;

    static {
        zzqg zzqgVar = new zzqg();
        zzs = zzqgVar;
        zzyd.g(zzqg.class, zzqgVar);
    }

    private zzqg() {
    }

    public static zzqf n() {
        return (zzqf) zzs.d();
    }

    public static zzqf o(zzqg zzqgVar) {
        zzya d = zzs.d();
        zzyd zzydVar = d.a;
        if (!zzydVar.equals(zzqgVar)) {
            if (!d.b.k()) {
                zzyd zzydVar2 = (zzyd) zzydVar.i(4, null);
                ufp.c.a(zzydVar2.getClass()).a(zzydVar2, d.b);
                d.b = zzydVar2;
            }
            zzyd zzydVar3 = d.b;
            ufp.c.a(zzydVar3.getClass()).a(zzydVar3, zzqgVar);
        }
        return (zzqf) d;
    }

    public static zzqg p() {
        return zzs;
    }

    public final /* synthetic */ void A(int i) {
        this.zzb |= 8192;
        this.zzq = i;
    }

    public final /* synthetic */ void B(boolean z) {
        this.zzb |= 16384;
        this.zzr = z;
    }

    @Override // com.google.android.gms.internal.cast.zzyd
    public final Object i(int i, zzyd zzydVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zfp(zzs, "\u0001\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0003စ\u0002\u0004ဆ\u0003\u0005᠌\u0004\u0006᠌\u0005\u0007င\u0006\bင\u0007\tဉ\b\n᠌\t\u000bင\n\fဇ\u000b\rင\f\u000eင\r\u000fဇ\u000e", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", mx9.k, "zzi", it7.t, "zzj", "zzk", "zzl", "zzm", tnf.m, "zzn", "zzo", "zzp", "zzq", "zzr"});
        }
        if (i2 == 3) {
            return new zzqg();
        }
        if (i2 == 4) {
            return new zzqf(zzs);
        }
        if (i2 == 5) {
            return zzs;
        }
        throw null;
    }

    public final /* synthetic */ void q(zzrp zzrpVar) {
        this.zzd = zzrpVar;
        this.zzb |= 1;
    }

    public final /* synthetic */ void r(boolean z) {
        this.zzb |= 2;
        this.zze = z;
    }

    public final /* synthetic */ void s(long j) {
        this.zzb |= 4;
        this.zzf = j;
    }

    public final /* synthetic */ void v(int i) {
        this.zzb |= 64;
        this.zzj = i;
    }

    public final /* synthetic */ void w(int i) {
        this.zzb |= 128;
        this.zzk = i;
    }

    public final /* synthetic */ void x(int i) {
        this.zzb |= 1024;
        this.zzn = i;
    }

    public final /* synthetic */ void y(boolean z) {
        this.zzb |= com.ironsource.mediationsdk.metadata.a.o;
        this.zzo = z;
    }

    public final /* synthetic */ void z(int i) {
        this.zzb |= 4096;
        this.zzp = i;
    }
}
