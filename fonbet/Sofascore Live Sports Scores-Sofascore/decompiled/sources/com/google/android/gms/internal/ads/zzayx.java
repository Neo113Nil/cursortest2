package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import defpackage.lkn;
import defpackage.lqo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzayx extends zzifm implements zzigx {
    private static final zzayx zzA;
    private static volatile zzihe zzB;
    private int zza;
    private long zzu;
    private long zzv;
    private long zzb = -1;
    private long zzc = -1;
    private long zzd = -1;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private int zzh = 1000;
    private long zzi = -1;
    private long zzj = -1;
    private long zzk = -1;
    private int zzl = 1000;
    private long zzm = -1;
    private long zzn = -1;
    private long zzo = -1;
    private long zzp = -1;
    private long zzw = -1;
    private long zzx = -1;
    private long zzy = -1;
    private long zzz = -1;

    static {
        zzayx zzayxVar = new zzayx();
        zzA = zzayxVar;
        zzifm.y(zzayx.class, zzayxVar);
    }

    private zzayx() {
    }

    public static zzayw D() {
        return (zzayw) zzA.v();
    }

    public final /* synthetic */ void E(long j) {
        this.zza |= 1;
        this.zzb = j;
    }

    public final /* synthetic */ void F(long j) {
        this.zza |= 2;
        this.zzc = j;
    }

    public final /* synthetic */ void G(long j) {
        this.zza |= 4;
        this.zzd = j;
    }

    public final /* synthetic */ void H(long j) {
        this.zza |= 8;
        this.zze = j;
    }

    public final /* synthetic */ void I() {
        this.zza &= -9;
        this.zze = -1L;
    }

    public final /* synthetic */ void J(long j) {
        this.zza |= 16;
        this.zzf = j;
    }

    public final /* synthetic */ void K(long j) {
        this.zza |= 32;
        this.zzg = j;
    }

    public final /* synthetic */ void L(long j) {
        this.zza |= 128;
        this.zzi = j;
    }

    public final /* synthetic */ void M(long j) {
        this.zza |= NotificationCompat.FLAG_LOCAL_ONLY;
        this.zzj = j;
    }

    public final /* synthetic */ void N(long j) {
        this.zza |= 512;
        this.zzk = j;
    }

    public final /* synthetic */ void O(long j) {
        this.zza |= com.ironsource.mediationsdk.metadata.a.o;
        this.zzm = j;
    }

    public final /* synthetic */ void P(long j) {
        this.zza |= 4096;
        this.zzn = j;
    }

    public final /* synthetic */ void Q(long j) {
        this.zza |= 8192;
        this.zzo = j;
    }

    public final /* synthetic */ void R(long j) {
        this.zza |= 16384;
        this.zzp = j;
    }

    public final /* synthetic */ void S(long j) {
        this.zza |= 32768;
        this.zzu = j;
    }

    public final /* synthetic */ void U(long j) {
        this.zza |= C.DEFAULT_BUFFER_SEGMENT_SIZE;
        this.zzv = j;
    }

    public final /* synthetic */ void V(long j) {
        this.zza |= 131072;
        this.zzw = j;
    }

    public final /* synthetic */ void W(long j) {
        this.zza |= 262144;
        this.zzx = j;
    }

    public final /* synthetic */ void X(int i) {
        this.zzh = i - 1;
        this.zza |= 64;
    }

    public final /* synthetic */ void Y(int i) {
        this.zzl = i - 1;
        this.zza |= 1024;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object z(zzifl zziflVar, zzifm zzifmVar) {
        zzihe zziheVar;
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            lkn lknVar = lkn.n;
            return new lqo(zzA, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007᠌\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000b᠌\n\fဂ\u000b\rဂ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂ\u0014", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", lknVar, "zzi", "zzj", "zzk", "zzl", lknVar, "zzm", "zzn", "zzo", "zzp", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz"});
        }
        if (ordinal == 3) {
            return new zzayx();
        }
        if (ordinal == 4) {
            return new zzayw(zzA);
        }
        if (ordinal == 5) {
            return zzA;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar2 = zzB;
        if (zziheVar2 != null) {
            return zziheVar2;
        }
        synchronized (zzayx.class) {
            try {
                zziheVar = zzB;
                if (zziheVar == null) {
                    zziheVar = new zzifh(zzA);
                    zzB = zziheVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziheVar;
    }
}
