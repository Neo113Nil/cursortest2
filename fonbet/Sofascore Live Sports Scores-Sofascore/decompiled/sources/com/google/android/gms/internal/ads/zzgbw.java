package com.google.android.gms.internal.ads;

import defpackage.cqo;
import defpackage.lqo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzgbw extends zzifm implements zzigx {
    private static final zzgbw zzn;
    private static volatile zzihe zzo;
    private int zza;
    private String zzb = "";
    private long zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private zzifx zzk;
    private zzifx zzl;
    private zzifx zzm;

    static {
        zzgbw zzgbwVar = new zzgbw();
        zzn = zzgbwVar;
        zzifm.y(zzgbw.class, zzgbwVar);
    }

    private zzgbw() {
        cqo cqoVar = cqo.e;
        this.zzk = cqoVar;
        this.zzl = cqoVar;
        this.zzm = cqoVar;
    }

    public static zzgbw V() {
        return zzn;
    }

    public final void D(long j) {
        zzifx zzifxVar = this.zzl;
        if (!zzifxVar.zza()) {
            int size = zzifxVar.size();
            this.zzl = zzifxVar.g(size + size);
        }
        this.zzl.l(j);
    }

    public final void E(long j) {
        zzifx zzifxVar = this.zzm;
        if (!zzifxVar.zza()) {
            int size = zzifxVar.size();
            this.zzm = zzifxVar.g(size + size);
        }
        this.zzm.l(j);
    }

    public final void F() {
        this.zzm = cqo.e;
    }

    public final String G() {
        return this.zzb;
    }

    public final long H() {
        return this.zzc;
    }

    public final int I() {
        return this.zzd;
    }

    public final boolean J() {
        return this.zze;
    }

    public final boolean K() {
        return this.zzf;
    }

    public final long L() {
        return this.zzg;
    }

    public final long M() {
        return this.zzh;
    }

    public final long N() {
        return this.zzi;
    }

    public final boolean O() {
        return (this.zza & 64) != 0;
    }

    public final zzifx P() {
        return this.zzk;
    }

    public final int Q() {
        return this.zzk.size();
    }

    public final int R() {
        return this.zzl.size();
    }

    public final zzifx S() {
        return this.zzm;
    }

    public final int U() {
        return this.zzm.size();
    }

    public final /* synthetic */ void W(String str) {
        str.getClass();
        this.zzb = str;
    }

    public final /* synthetic */ void X(long j) {
        this.zza |= 1;
        this.zzc = j;
    }

    public final /* synthetic */ void Y(int i) {
        this.zza |= 2;
        this.zzd = i;
    }

    public final /* synthetic */ void Z() {
        this.zza |= 4;
        this.zze = true;
    }

    public final /* synthetic */ void a0() {
        this.zza |= 8;
        this.zzf = true;
    }

    public final /* synthetic */ void b0(long j) {
        this.zza |= 16;
        this.zzg = j;
    }

    public final /* synthetic */ void c0(long j) {
        this.zzh = j;
    }

    public final /* synthetic */ void d0(long j) {
        this.zza |= 32;
        this.zzi = j;
    }

    public final /* synthetic */ void e0(long j) {
        this.zza |= 64;
        this.zzj = j;
    }

    public final void f0(long j) {
        zzifx zzifxVar = this.zzk;
        if (!zzifxVar.zza()) {
            int size = zzifxVar.size();
            this.zzk = zzifxVar.g(size + size);
        }
        this.zzk.l(j);
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object z(zzifl zziflVar, zzifm zzifmVar) {
        zzihe zziheVar;
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return new lqo(zzn, "\u0004\f\u0000\u0001\u0001\f\f\u0000\u0003\u0000\u0001Ȉ\u0002ဂ\u0000\u0003င\u0001\u0004ဇ\u0002\u0005ဇ\u0003\u0006ဂ\u0004\u0007\u0002\bဂ\u0005\tဂ\u0006\n%\u000b%\f%", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        if (ordinal == 3) {
            return new zzgbw();
        }
        if (ordinal == 4) {
            return new zzgbv(zzn);
        }
        if (ordinal == 5) {
            return zzn;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar2 = zzo;
        if (zziheVar2 != null) {
            return zziheVar2;
        }
        synchronized (zzgbw.class) {
            try {
                zziheVar = zzo;
                if (zziheVar == null) {
                    zziheVar = new zzifh(zzn);
                    zzo = zziheVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziheVar;
    }
}
