package com.google.android.gms.internal.ads;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import defpackage.lqo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzgfc extends zzifm implements zzigx {
    private static final zzgfc zzl;
    private static volatile zzihe zzm;
    private int zza;
    private boolean zzc;
    private boolean zzd;
    private long zzh;
    private boolean zzi;
    private boolean zzb = true;
    private long zze = TTAdConstant.AD_MAX_EVENT_TIME;
    private long zzf = 3600000;
    private String zzg = "https://pagead2.googlesyndication.com/mads/asp";
    private long zzj = 5;
    private long zzk = ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;

    static {
        zzgfc zzgfcVar = new zzgfc();
        zzl = zzgfcVar;
        zzifm.y(zzgfc.class, zzgfcVar);
    }

    private zzgfc() {
    }

    public static zzgfb K() {
        return (zzgfb) zzl.v();
    }

    public static zzgfc L() {
        return zzl;
    }

    public final boolean D() {
        return this.zzd;
    }

    public final long E() {
        return this.zzf;
    }

    public final String F() {
        return this.zzg;
    }

    public final long G() {
        return this.zzh;
    }

    public final boolean H() {
        return this.zzi;
    }

    public final long I() {
        return this.zzj;
    }

    public final long J() {
        return this.zzk;
    }

    public final /* synthetic */ void M(boolean z) {
        this.zza |= 4;
        this.zzd = z;
    }

    public final /* synthetic */ void N(long j) {
        this.zza |= 64;
        this.zzh = j;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object z(zzifl zziflVar, zzifm zzifmVar) {
        zzihe zziheVar;
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return new lqo(zzl, "\u0004\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဈ\u0005\u0007ဂ\u0006\bဇ\u0007\tဂ\b\nဂ\t", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (ordinal == 3) {
            return new zzgfc();
        }
        if (ordinal == 4) {
            return new zzgfb(zzl);
        }
        if (ordinal == 5) {
            return zzl;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar2 = zzm;
        if (zziheVar2 != null) {
            return zziheVar2;
        }
        synchronized (zzgfc.class) {
            try {
                zziheVar = zzm;
                if (zziheVar == null) {
                    zziheVar = new zzifh(zzl);
                    zzm = zziheVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziheVar;
    }
}
