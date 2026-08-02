package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.common.util.Clock;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzcix extends zzcio implements zzcgr {
    public static final /* synthetic */ int zzd = 0;
    private zzcgs zze;
    private String zzf;
    private boolean zzg;
    private boolean zzh;
    private zzcig zzi;
    private long zzj;
    private long zzk;

    public zzcix(zzchb zzchbVar, zzcha zzchaVar) {
        super(zzchbVar);
        zzcjq zzcjqVar = new zzcjq(zzchbVar.getContext(), zzchaVar, (zzchb) this.zzc.get(), null);
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh("ExoPlayerAdapter initialized.");
        this.zze = zzcjqVar;
        zzcjqVar.zzs(this);
    }

    protected static final String zzc(String str) {
        String zzg = com.google.android.gms.ads.internal.util.client.zzf.zzg(str);
        String.valueOf(zzg);
        return "cache:".concat(String.valueOf(zzg));
    }

    private final void zzd(long j) {
        com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzciv
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzcix.this.zzb();
            }
        }, j);
    }

    private static String zzx(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        int length = String.valueOf(canonicalName).length();
        StringBuilder sb = new StringBuilder(str.length() + 1 + length + 1 + String.valueOf(message).length());
        sb.append(str);
        sb.append("/");
        sb.append(canonicalName);
        sb.append(":");
        sb.append(message);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzcio, com.google.android.gms.common.api.Releasable
    public final void release() {
        zzcgs zzcgsVar = this.zze;
        if (zzcgsVar != null) {
            zzcgsVar.zzs(null);
            this.zze.zzt();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgr
    public final void zzD() {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Precache onRenderedFirstFrame");
    }

    public final zzcgs zza() {
        synchronized (this) {
            this.zzh = true;
            notify();
        }
        this.zze.zzs(null);
        zzcgs zzcgsVar = this.zze;
        this.zze = null;
        return zzcgsVar;
    }

    final /* synthetic */ void zzb() {
        long longValue;
        long intValue;
        boolean booleanValue;
        long j;
        long j2;
        long j3;
        String zzc = zzc(this.zzf);
        String str = "error";
        try {
            longValue = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzam)).longValue() * 1000;
            intValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzw)).intValue();
            booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcB)).booleanValue();
        } catch (Exception e) {
            String str2 = str;
            String str3 = this.zzf;
            String message = e.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 34 + String.valueOf(message).length());
            sb.append("Failed to preload url ");
            sb.append(str3);
            sb.append(" Exception: ");
            sb.append(message);
            String sb2 = sb.toString();
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi(sb2);
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "VideoStreamExoPlayerCache.preload");
            release();
            zzq(this.zzf, zzc, str2, zzx(str2, e));
        }
        synchronized (this) {
            try {
                if (com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - this.zzj <= longValue) {
                    try {
                        if (this.zzg) {
                            throw new IOException("Abort requested before buffering finished. ");
                        }
                        if (!this.zzh) {
                            if (!this.zze.zzB()) {
                                throw new IOException("ExoPlayer was released during preloading.");
                            }
                            long zzH = this.zze.zzH();
                            if (zzH > 0) {
                                long zzN = this.zze.zzN();
                                if (zzN != this.zzk) {
                                    boolean z = zzN > 0;
                                    j2 = zzH;
                                    j3 = zzN;
                                    j = intValue;
                                    zzm(this.zzf, zzc, j3, j2, z, booleanValue ? this.zze.zzI() : -1L, booleanValue ? this.zze.zzJ() : -1L, booleanValue ? this.zze.zzK() : -1L, zzcgs.zzP(), zzcgs.zzQ());
                                    this.zzk = j3;
                                } else {
                                    j = intValue;
                                    j2 = zzH;
                                    j3 = zzN;
                                }
                                if (j3 >= j2) {
                                    zzp(this.zzf, zzc, j2);
                                } else if (this.zze.zzO() >= j && j3 > 0) {
                                }
                            }
                            zzd(((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzan)).longValue());
                            return;
                        }
                        com.google.android.gms.ads.internal.zzt.zzB().zzd(this.zzi);
                        return;
                    } catch (Throwable th) {
                        th = th;
                        str = "Timeout reached. Limit: ";
                    }
                } else {
                    try {
                        StringBuilder sb3 = new StringBuilder(String.valueOf(longValue).length() + 27);
                        sb3.append("Timeout reached. Limit: ");
                        sb3.append(longValue);
                        sb3.append(" ms");
                        throw new IOException(sb3.toString());
                    } catch (Throwable th2) {
                        th = th2;
                        str = "downloadTimeout";
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcio
    public final boolean zze(String str) {
        return zzf(str, new String[]{str});
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [long] */
    @Override // com.google.android.gms.internal.ads.zzcio
    public final boolean zzf(String str, String[] strArr) {
        Clock clock;
        String str2;
        String str3;
        long j;
        long j2;
        ?? r4;
        long j3;
        long j4;
        long j5;
        long j6;
        boolean z;
        this.zzf = str;
        String str4 = "error";
        String zzc = zzc(str);
        String str5 = " ms";
        String str6 = "Timeout reached. Limit: ";
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                uriArr[i] = Uri.parse(strArr[i]);
            }
            this.zze.zzq(uriArr, this.zzb);
            zzchb zzchbVar = (zzchb) this.zzc.get();
            if (zzchbVar != null) {
                zzchbVar.zzt(zzc, this);
            }
            Clock zzk = com.google.android.gms.ads.internal.zzt.zzk();
            long currentTimeMillis = zzk.currentTimeMillis();
            long longValue = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzan)).longValue();
            long longValue2 = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzam)).longValue() * 1000;
            long intValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzw)).intValue();
            boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcB)).booleanValue();
            long j7 = -1;
            while (true) {
                synchronized (this) {
                    try {
                        if (zzk.currentTimeMillis() - currentTimeMillis > longValue2) {
                            String str7 = str5;
                            String str8 = str6;
                            long j8 = longValue2;
                            StringBuilder sb = new StringBuilder(String.valueOf(j8).length() + 27);
                            sb.append(str8);
                            sb.append(j8);
                            sb.append(str7);
                            throw new IOException(sb.toString());
                        }
                        if (this.zzg) {
                            throw new IOException("Abort requested before buffering finished. ");
                        }
                        if (!this.zzh) {
                            if (!this.zze.zzB()) {
                                throw new IOException("ExoPlayer was released during preloading.");
                            }
                            long zzH = this.zze.zzH();
                            if (zzH > 0) {
                                clock = zzk;
                                long zzN = this.zze.zzN();
                                if (zzN != j7) {
                                    if (zzN > 0) {
                                        j6 = longValue2;
                                        z = true;
                                    } else {
                                        j6 = longValue2;
                                        z = false;
                                    }
                                    long j9 = longValue;
                                    j4 = zzH;
                                    str3 = str6;
                                    j3 = j9;
                                    str2 = str5;
                                    j5 = zzN;
                                    j2 = intValue;
                                    j = j6;
                                    zzm(str, zzc, j5, j4, z, booleanValue ? this.zze.zzI() : -1L, booleanValue ? this.zze.zzJ() : -1L, booleanValue ? this.zze.zzK() : -1L, zzcgs.zzP(), zzcgs.zzQ());
                                    j7 = j5;
                                } else {
                                    str3 = str6;
                                    j3 = longValue;
                                    j2 = intValue;
                                    j4 = zzH;
                                    str2 = str5;
                                    j = longValue2;
                                    j5 = zzN;
                                }
                                if (j5 >= j4) {
                                    zzp(str, zzc, j4);
                                } else if (this.zze.zzO() < j2 || j5 <= 0) {
                                    r4 = j3;
                                }
                            } else {
                                clock = zzk;
                                str2 = str5;
                                str3 = str6;
                                j = longValue2;
                                j2 = intValue;
                                r4 = longValue;
                            }
                            try {
                                try {
                                    wait(r4);
                                } catch (Throwable th) {
                                    th = th;
                                    str4 = r4;
                                    throw th;
                                }
                            } catch (InterruptedException unused) {
                                throw new IOException("Wait interrupted.");
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                longValue = r4;
                str5 = str2;
                longValue2 = j;
                intValue = j2;
                str6 = str3;
                zzk = clock;
            }
            return true;
        } catch (Exception e) {
            String str9 = str4;
            String message = e.getMessage();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(message).length());
            sb2.append("Failed to preload url ");
            sb2.append(str);
            sb2.append(" Exception: ");
            sb2.append(message);
            String sb3 = sb2.toString();
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi(sb3);
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "VideoStreamExoPlayerCache.preload");
            release();
            zzq(str, zzc, str9, zzx(str9, e));
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcio
    public final boolean zzg(String str, String[] strArr, zzcig zzcigVar) {
        this.zzf = str;
        this.zzi = zzcigVar;
        String zzc = zzc(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                uriArr[i] = Uri.parse(strArr[i]);
            }
            this.zze.zzq(uriArr, this.zzb);
            zzchb zzchbVar = (zzchb) this.zzc.get();
            if (zzchbVar != null) {
                zzchbVar.zzt(zzc, this);
            }
            this.zzj = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
            this.zzk = -1L;
            zzd(0L);
            return true;
        } catch (Exception e) {
            String message = e.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(message).length());
            sb.append("Failed to preload url ");
            sb.append(str);
            sb.append(" Exception: ");
            sb.append(message);
            String sb2 = sb.toString();
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi(sb2);
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "VideoStreamExoPlayerCache.preload");
            release();
            zzq(str, zzc, "error", zzx("error", e));
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcio
    public final void zzh(int i) {
        this.zze.zzG(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcio
    public final void zzi(int i) {
        this.zze.zzF(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcio
    public final void zzj(int i) {
        this.zze.zzy(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcio
    public final void zzk(int i) {
        this.zze.zzz(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcio
    public final void zzl() {
        synchronized (this) {
            this.zzg = true;
            notify();
            release();
        }
        String str = this.zzf;
        if (str != null) {
            zzq(this.zzf, zzc(str), "externalAbort", "Programmatic precache abort.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgr
    public final void zzr(final boolean z, final long j) {
        final zzchb zzchbVar = (zzchb) this.zzc.get();
        if (zzchbVar != null) {
            zzcff.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzciw
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    int i = zzcix.zzd;
                    zzchb.this.zzu(z, j);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgr
    public final void zzs(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzcgr
    public final void zzt(int i, int i2) {
    }

    @Override // com.google.android.gms.internal.ads.zzcgr
    public final void zzu(String str, Exception exc) {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Precache error", exc);
        com.google.android.gms.ads.internal.zzt.zzh().zzh(exc, "VideoStreamExoPlayerCache.onError");
    }

    @Override // com.google.android.gms.internal.ads.zzcgr
    public final void zzv(String str, Exception exc) {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Precache exception", exc);
        com.google.android.gms.ads.internal.zzt.zzh().zzh(exc, "VideoStreamExoPlayerCache.onException");
    }
}
