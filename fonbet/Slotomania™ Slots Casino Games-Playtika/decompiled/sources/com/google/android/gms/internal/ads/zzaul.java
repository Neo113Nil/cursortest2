package com.google.android.gms.internal.ads;

import com.ironsource.X3;
import java.nio.ByteBuffer;
import java.util.Date;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
public final class zzaul extends zzilr {
    private Date zzg;
    private Date zzh;
    private long zzi;
    private long zzj;
    private double zzk;
    private float zzl;
    private zzimb zzm;
    private long zzn;

    public zzaul() {
        super("mvhd");
        this.zzk = 1.0d;
        this.zzl = 1.0f;
        this.zzm = zzimb.zzj;
    }

    public final String toString() {
        return "MovieHeaderBox[creationTime=" + this.zzg + ";modificationTime=" + this.zzh + ";timescale=" + this.zzi + ";duration=" + this.zzj + ";rate=" + this.zzk + ";volume=" + this.zzl + ";matrix=" + this.zzm + ";nextTrackId=" + this.zzn + X3.j.e;
    }

    public final long zzc() {
        return this.zzi;
    }

    public final long zzd() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzilp
    public final void zze(ByteBuffer byteBuffer) {
        zzh(byteBuffer);
        if (zzg() == 1) {
            this.zzg = zzilw.zza(zzauh.zzd(byteBuffer));
            this.zzh = zzilw.zza(zzauh.zzd(byteBuffer));
            this.zzi = zzauh.zza(byteBuffer);
            this.zzj = zzauh.zzd(byteBuffer);
        } else {
            this.zzg = zzilw.zza(zzauh.zza(byteBuffer));
            this.zzh = zzilw.zza(zzauh.zza(byteBuffer));
            this.zzi = zzauh.zza(byteBuffer);
            this.zzj = zzauh.zza(byteBuffer);
        }
        this.zzk = zzauh.zze(byteBuffer);
        byteBuffer.get(new byte[2]);
        this.zzl = ((short) ((r1[1] & 255) | ((short) (65280 & (r1[0] << 8))))) / 256.0f;
        zzauh.zzb(byteBuffer);
        zzauh.zza(byteBuffer);
        zzauh.zza(byteBuffer);
        this.zzm = new zzimb(zzauh.zze(byteBuffer), zzauh.zze(byteBuffer), zzauh.zze(byteBuffer), zzauh.zze(byteBuffer), zzauh.zzf(byteBuffer), zzauh.zzf(byteBuffer), zzauh.zzf(byteBuffer), zzauh.zze(byteBuffer), zzauh.zze(byteBuffer));
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        this.zzn = zzauh.zza(byteBuffer);
    }
}
