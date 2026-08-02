package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.common.util.Clock;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzciu extends zzcio implements zzih {
    private static final AtomicInteger zzo = new AtomicInteger(0);
    private String zzd;
    private final zzcha zze;
    private boolean zzf;
    private final zzcit zzg;
    private final zzchx zzh;
    private ByteBuffer zzi;
    private boolean zzj;
    private final Object zzk;
    private final String zzl;
    private final int zzm;
    private boolean zzn;

    public zzciu(zzchb zzchbVar, zzcha zzchaVar) {
        super(zzchbVar);
        this.zze = zzchaVar;
        this.zzg = new zzcit();
        this.zzh = new zzchx();
        this.zzk = new Object();
        this.zzl = (String) zzgsu.zzd(zzchbVar != null ? zzchbVar.zzn() : null).zza("");
        this.zzm = zzchbVar != null ? zzchbVar.zzp() : 0;
        zzo.incrementAndGet();
    }

    public static int zzr() {
        return zzo.get();
    }

    protected static final String zzv(String str) {
        String zzg = com.google.android.gms.ads.internal.util.client.zzf.zzg(str);
        String.valueOf(zzg);
        return "cache:".concat(String.valueOf(zzg));
    }

    private final void zzx() {
        int zza = (int) this.zzg.zza();
        int zza2 = (int) this.zzh.zza(this.zzi);
        int position = this.zzi.position();
        int round = Math.round(zza2 * (position / zza));
        int zzP = zzcgs.zzP();
        int zzQ = zzcgs.zzQ();
        String str = this.zzd;
        zzn(str, zzv(str), position, zza, round, zza2, round > 0, zzP, zzQ);
    }

    @Override // com.google.android.gms.internal.ads.zzcio, com.google.android.gms.common.api.Releasable
    public final void release() {
        zzo.decrementAndGet();
    }

    @Override // com.google.android.gms.internal.ads.zzih
    public final void zza(zzhj zzhjVar, zzhn zzhnVar, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzih
    public final void zzb(zzhj zzhjVar, zzhn zzhnVar, boolean z) {
        if (zzhjVar instanceof zzhu) {
            this.zzg.zzb((zzhu) zzhjVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzih
    public final void zzc(zzhj zzhjVar, zzhn zzhnVar, boolean z, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzih
    public final void zzd(zzhj zzhjVar, zzhn zzhnVar, boolean z) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v2 */
    @Override // com.google.android.gms.internal.ads.zzcio
    public final boolean zze(String str) {
        String str2;
        String str3;
        Clock clock;
        long j;
        this.zzd = str;
        String str4 = "error";
        String zzv = zzv(str);
        try {
            zzhq zzhqVar = new zzhq();
            zzhqVar.zzb(this.zzb);
            zzcha zzchaVar = this.zze;
            zzhqVar.zzc(zzchaVar.zzd);
            zzhqVar.zzd(zzchaVar.zze);
            zzhqVar.zze(true);
            zzhqVar.zzf(this);
            zzhj zza = zzhqVar.zza();
            if (zzchaVar.zzi) {
                zza = new zzchv(this.zza, zza, this.zzl, this.zzm, null, null);
            }
            zza.zzb(new zzhn(Uri.parse(str), 0L, -1L, null));
            zzchb zzchbVar = (zzchb) this.zzc.get();
            if (zzchbVar != null) {
                zzchbVar.zzt(zzv, this);
            }
            Clock zzk = com.google.android.gms.ads.internal.zzt.zzk();
            long currentTimeMillis = zzk.currentTimeMillis();
            long longValue = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzan)).longValue();
            long longValue2 = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzam)).longValue();
            this.zzi = ByteBuffer.allocate(zzchaVar.zzc);
            byte[] bArr = new byte[8192];
            long j2 = currentTimeMillis;
            while (true) {
                str2 = str4;
                try {
                    int zza2 = zza.zza(bArr, 0, Math.min(this.zzi.remaining(), 8192));
                    if (zza2 == -1) {
                        this.zzn = true;
                        zzp(str, zzv, (int) this.zzh.zza(this.zzi));
                        break;
                    }
                    synchronized (this.zzk) {
                        clock = zzk;
                        if (this.zzf) {
                            j = currentTimeMillis;
                        } else {
                            j = currentTimeMillis;
                            this.zzi.put(bArr, 0, zza2);
                        }
                    }
                    if (this.zzi.remaining() <= 0) {
                        zzx();
                        break;
                    }
                    str3 = this.zzf;
                    try {
                        if (str3 != 0) {
                            int limit = this.zzi.limit();
                            StringBuilder sb = new StringBuilder(String.valueOf(limit).length() + 24);
                            sb.append("Precache abort at ");
                            sb.append(limit);
                            sb.append(" bytes");
                            throw new IOException(sb.toString());
                        }
                        long currentTimeMillis2 = clock.currentTimeMillis();
                        if (currentTimeMillis2 - j2 >= longValue) {
                            zzx();
                            j2 = currentTimeMillis2;
                        }
                        if (currentTimeMillis2 - j > 1000 * longValue2) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(longValue2).length() + 29);
                            sb2.append("Timeout exceeded. Limit: ");
                            sb2.append(longValue2);
                            sb2.append(" sec");
                            throw new IOException(sb2.toString());
                        }
                        str4 = str2;
                        zzk = clock;
                        currentTimeMillis = j;
                    } catch (Exception e) {
                        e = e;
                        String canonicalName = e.getClass().getCanonicalName();
                        String message = e.getMessage();
                        StringBuilder sb3 = new StringBuilder(String.valueOf(canonicalName).length() + 1 + String.valueOf(message).length());
                        sb3.append(canonicalName);
                        sb3.append(":");
                        sb3.append(message);
                        String sb4 = sb3.toString();
                        StringBuilder sb5 = new StringBuilder(String.valueOf(str).length() + 34 + sb4.length());
                        sb5.append("Failed to preload url ");
                        sb5.append(str);
                        sb5.append(" Exception: ");
                        sb5.append(sb4);
                        String sb6 = sb5.toString();
                        int i = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb6);
                        zzq(str, zzv, str3, sb4);
                        return false;
                    }
                } catch (Exception e2) {
                    e = e2;
                    str3 = str2;
                    String canonicalName2 = e.getClass().getCanonicalName();
                    String message2 = e.getMessage();
                    StringBuilder sb32 = new StringBuilder(String.valueOf(canonicalName2).length() + 1 + String.valueOf(message2).length());
                    sb32.append(canonicalName2);
                    sb32.append(":");
                    sb32.append(message2);
                    String sb42 = sb32.toString();
                    StringBuilder sb52 = new StringBuilder(String.valueOf(str).length() + 34 + sb42.length());
                    sb52.append("Failed to preload url ");
                    sb52.append(str);
                    sb52.append(" Exception: ");
                    sb52.append(sb42);
                    String sb62 = sb52.toString();
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi(sb62);
                    zzq(str, zzv, str3, sb42);
                    return false;
                }
            }
            return true;
        } catch (Exception e3) {
            e = e3;
            str2 = str4;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcio
    public final void zzl() {
        this.zzf = true;
    }

    public final String zzs() {
        return this.zzd;
    }

    public final boolean zzt() {
        return this.zzn;
    }

    public final ByteBuffer zzu() {
        synchronized (this.zzk) {
            ByteBuffer byteBuffer = this.zzi;
            if (byteBuffer != null && !this.zzj) {
                byteBuffer.flip();
                this.zzj = true;
            }
            this.zzf = true;
        }
        return this.zzi;
    }
}
