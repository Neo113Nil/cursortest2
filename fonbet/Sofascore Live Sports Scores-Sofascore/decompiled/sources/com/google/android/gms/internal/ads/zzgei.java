package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import com.ironsource.Ua;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import defpackage.lkn;
import defpackage.lqo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzgei extends zzifm implements zzigx {
    private static final zzgei zzE;
    private static volatile zzihe zzF;
    private boolean zzC;
    private boolean zzD;
    private int zza;
    private int zzb;
    private boolean zze;
    private boolean zzf;
    private int zzh;
    private zzgfa zzj;
    private boolean zzk;
    private zzgfc zzn;
    private int zzc = 1;
    private boolean zzd = true;
    private String zzg = "unknown_host";
    private boolean zzi = true;
    private long zzl = 100;
    private long zzm = 2000;
    private long zzo = 10;
    private long zzp = 100;
    private long zzu = 20000;
    private String zzv = "";
    private String zzw = "";
    private long zzx = 500;
    private long zzy = Ua.C;
    private boolean zzz = true;
    private boolean zzA = true;
    private boolean zzB = true;

    static {
        zzgei zzgeiVar = new zzgei();
        zzE = zzgeiVar;
        zzifm.y(zzgei.class, zzgeiVar);
    }

    private zzgei() {
    }

    public static zzgeg o0() {
        return (zzgeg) zzE.v();
    }

    public final /* synthetic */ void D(boolean z) {
        this.zza |= 16;
        this.zzf = z;
    }

    public final /* synthetic */ void E(String str) {
        str.getClass();
        this.zza |= 32;
        this.zzg = str;
    }

    public final /* synthetic */ void F(zzgfa zzgfaVar) {
        this.zzj = zzgfaVar;
        this.zza |= NotificationCompat.FLAG_LOCAL_ONLY;
    }

    public final /* synthetic */ void G(long j) {
        this.zza |= 1024;
        this.zzl = j;
    }

    public final /* synthetic */ void H(long j) {
        this.zza |= com.ironsource.mediationsdk.metadata.a.o;
        this.zzm = j;
    }

    public final /* synthetic */ void I(zzgfc zzgfcVar) {
        this.zzn = zzgfcVar;
        this.zza |= 4096;
    }

    public final /* synthetic */ void J(long j) {
        this.zza |= 524288;
        this.zzy = j;
    }

    public final /* synthetic */ void K(boolean z) {
        this.zza |= ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
        this.zzz = z;
    }

    public final /* synthetic */ void L(boolean z) {
        this.zza |= C.DEFAULT_MUXED_BUFFER_SIZE;
        this.zzD = z;
    }

    public final int M() {
        int a = zzgek.a(this.zzb);
        if (a == 0) {
            return 1;
        }
        return a;
    }

    public final int N() {
        int a = zzgek.a(this.zzc);
        if (a == 0) {
            return 2;
        }
        return a;
    }

    public final int O() {
        int i = this.zzh;
        int i2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? 0 : 5 : 4 : 3 : 2;
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    public final /* synthetic */ void P(int i) {
        this.zzb = i - 1;
        this.zza |= 1;
    }

    public final void Q() {
        this.zzh = 1;
        this.zza |= 64;
    }

    public final boolean R() {
        return this.zzd;
    }

    public final boolean S() {
        return this.zze;
    }

    public final boolean U() {
        return this.zzf;
    }

    public final String V() {
        return this.zzg;
    }

    public final boolean W() {
        return this.zzi;
    }

    public final zzgfa X() {
        zzgfa zzgfaVar = this.zzj;
        return zzgfaVar == null ? zzgfa.I() : zzgfaVar;
    }

    public final boolean Y() {
        return this.zzk;
    }

    public final long Z() {
        return this.zzl;
    }

    public final long a0() {
        return this.zzm;
    }

    public final zzgfc b0() {
        zzgfc zzgfcVar = this.zzn;
        return zzgfcVar == null ? zzgfc.L() : zzgfcVar;
    }

    public final long c0() {
        return this.zzo;
    }

    public final long d0() {
        return this.zzp;
    }

    public final long e0() {
        return this.zzu;
    }

    public final String f0() {
        return this.zzv;
    }

    public final String g0() {
        return this.zzw;
    }

    public final long h0() {
        return this.zzx;
    }

    public final long i0() {
        return this.zzy;
    }

    public final boolean j0() {
        return this.zzz;
    }

    public final boolean k0() {
        return this.zzA;
    }

    public final boolean l0() {
        return this.zzB;
    }

    public final boolean m0() {
        return this.zzC;
    }

    public final boolean n0() {
        return this.zzD;
    }

    public final /* synthetic */ void p0(boolean z) {
        this.zza |= 4;
        this.zzd = z;
    }

    public final /* synthetic */ void q0(boolean z) {
        this.zza |= 8;
        this.zze = z;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object z(zzifl zziflVar, zzifm zzifmVar) {
        zzihe zziheVar;
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            lkn lknVar = lkn.s;
            return new lqo(zzE, "\u0004\u0019\u0000\u0001\u0001\u001a\u0019\u0000\u0000\u0000\u0001᠌\u0000\u0003ဈ\u0005\u0004ဇ\u0007\u0005ဉ\b\u0006ဇ\t\u0007ဂ\u000b\bဉ\f\tဇ\u0002\nဂ\r\u000bဂ\u000e\fဂ\u000f\rဈ\u0010\u000eဈ\u0011\u000fဂ\u0012\u0010ဂ\u0013\u0011ဇ\u0014\u0012ဂ\n\u0013ဇ\u0015\u0014ဇ\u0016\u0015ဇ\u0017\u0016᠌\u0001\u0017ဇ\u0003\u0018ဇ\u0004\u0019ဌ\u0006\u001aဇ\u0018", new Object[]{"zza", "zzb", lknVar, "zzg", "zzi", "zzj", "zzk", "zzm", "zzn", "zzd", "zzo", "zzp", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzl", "zzA", "zzB", "zzC", "zzc", lknVar, "zze", "zzf", "zzh", "zzD"});
        }
        if (ordinal == 3) {
            return new zzgei();
        }
        if (ordinal == 4) {
            return new zzgeg(zzE);
        }
        if (ordinal == 5) {
            return zzE;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar2 = zzF;
        if (zziheVar2 != null) {
            return zziheVar2;
        }
        synchronized (zzgei.class) {
            try {
                zziheVar = zzF;
                if (zziheVar == null) {
                    zziheVar = new zzifh(zzE);
                    zzF = zziheVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziheVar;
    }
}
