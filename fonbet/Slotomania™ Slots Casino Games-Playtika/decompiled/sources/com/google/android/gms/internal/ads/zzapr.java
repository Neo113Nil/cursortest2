package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.Arrays;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes2.dex */
public final class zzapr implements zzapm {
    private static final float[] zza = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    private final zzare zzb;
    private zzapq zzg;
    private long zzh;
    private String zzi;
    private zzahb zzj;
    private boolean zzk;
    private final boolean[] zzd = new boolean[4];
    private final zzapp zze = new zzapp(128);
    private long zzl = C.TIME_UNSET;
    private final zzaqd zzf = new zzaqd(178, 128);
    private final zzes zzc = new zzes();

    zzapr(zzare zzareVar, String str) {
        this.zzb = zzareVar;
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zza() {
        zzgo.zzj(this.zzd);
        this.zze.zza();
        zzapq zzapqVar = this.zzg;
        if (zzapqVar != null) {
            zzapqVar.zza();
        }
        this.zzf.zza();
        this.zzh = 0L;
        this.zzl = C.TIME_UNSET;
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zzb(zzafs zzafsVar, zzara zzaraVar) {
        zzaraVar.zza();
        this.zzi = zzaraVar.zzc();
        this.zzj = zzafsVar.zzu(zzaraVar.zzb(), 2);
        this.zzg = new zzapq(this.zzj);
        this.zzb.zza(zzafsVar, zzaraVar);
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zzc(long j, int i) {
        this.zzl = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01d1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0199  */
    @Override // com.google.android.gms.internal.ads.zzapm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzd(zzes zzesVar) {
        int i;
        zzaqd zzaqdVar;
        int i2;
        int i3;
        this.zzg.getClass();
        this.zzj.getClass();
        int zzg = zzesVar.zzg();
        int zze = zzesVar.zze();
        byte[] zzi = zzesVar.zzi();
        this.zzh += zzesVar.zzd();
        this.zzj.zzc(zzesVar, zzesVar.zzd());
        while (true) {
            int zzi2 = zzgo.zzi(zzi, zzg, zze, this.zzd);
            if (zzi2 == zze) {
                break;
            }
            int i4 = zzi2 + 3;
            int i5 = zzesVar.zzi()[i4] & 255;
            int i6 = zzi2 - zzg;
            if (!this.zzk) {
                if (i6 > 0) {
                    this.zze.zzc(zzi, zzg, zzi2);
                }
                int i7 = i6 < 0 ? -i6 : 0;
                zzapp zzappVar = this.zze;
                if (zzappVar.zzb(i5, i7)) {
                    zzahb zzahbVar = this.zzj;
                    int i8 = zzappVar.zzb;
                    String str = this.zzi;
                    str.getClass();
                    byte[] copyOf = Arrays.copyOf(zzappVar.zzc, zzappVar.zza);
                    zzer zzerVar = new zzer(copyOf, copyOf.length);
                    zzerVar.zzo(i8);
                    zzerVar.zzo(4);
                    zzerVar.zzg();
                    zzerVar.zzh(8);
                    if (zzerVar.zzi()) {
                        zzerVar.zzh(4);
                        zzerVar.zzh(3);
                    }
                    int zzj = zzerVar.zzj(4);
                    float f = 1.0f;
                    i = zze;
                    if (zzj == 15) {
                        int zzj2 = zzerVar.zzj(8);
                        int zzj3 = zzerVar.zzj(8);
                        if (zzj3 == 0) {
                            zzef.zzc("H263Reader", "Invalid aspect ratio");
                        } else {
                            f = zzj2 / zzj3;
                        }
                    } else if (zzj < 7) {
                        f = zza[zzj];
                    } else {
                        zzef.zzc("H263Reader", "Invalid aspect ratio");
                    }
                    float f2 = f;
                    if (zzerVar.zzi()) {
                        zzerVar.zzh(2);
                        zzerVar.zzh(1);
                        if (zzerVar.zzi()) {
                            zzerVar.zzh(15);
                            zzerVar.zzg();
                            zzerVar.zzh(15);
                            zzerVar.zzg();
                            zzerVar.zzh(15);
                            zzerVar.zzg();
                            zzerVar.zzh(3);
                            zzerVar.zzh(11);
                            zzerVar.zzg();
                            zzerVar.zzh(15);
                            zzerVar.zzg();
                            i3 = 2;
                            if (zzerVar.zzj(i3) != 0) {
                                zzef.zzc("H263Reader", "Unhandled video object layer shape");
                            }
                            zzerVar.zzg();
                            int zzj4 = zzerVar.zzj(16);
                            zzerVar.zzg();
                            if (zzerVar.zzi()) {
                                if (zzj4 == 0) {
                                    zzef.zzc("H263Reader", "Invalid vop_increment_time_resolution");
                                } else {
                                    int i9 = zzj4 - 1;
                                    int i10 = 0;
                                    while (i9 > 0) {
                                        i9 >>= 1;
                                        i10++;
                                    }
                                    zzerVar.zzh(i10);
                                }
                            }
                            zzerVar.zzg();
                            int zzj5 = zzerVar.zzj(13);
                            zzerVar.zzg();
                            int zzj6 = zzerVar.zzj(13);
                            zzerVar.zzg();
                            zzerVar.zzg();
                            zzt zztVar = new zzt();
                            zztVar.zza(str);
                            zztVar.zzn(MimeTypes.VIDEO_MP2T);
                            zztVar.zzo(MimeTypes.VIDEO_MP4V);
                            zztVar.zzv(zzj5);
                            zztVar.zzw(zzj6);
                            zztVar.zzB(f2);
                            zztVar.zzr(Collections.singletonList(copyOf));
                            zzahbVar.zzA(zztVar.zzO());
                            this.zzk = true;
                            this.zzg.zzc(zzi, zzg, zzi2);
                            zzaqdVar = this.zzf;
                            if (i6 > 0) {
                                zzaqdVar.zzd(zzi, zzg, zzi2);
                                i2 = 0;
                            } else {
                                i2 = -i6;
                            }
                            if (zzaqdVar.zze(i2)) {
                                int zza2 = zzgo.zza(zzaqdVar.zza, zzaqdVar.zzb);
                                zzes zzesVar2 = this.zzc;
                                String str2 = zzfk.zza;
                                zzesVar2.zzb(zzaqdVar.zza, zza2);
                                this.zzb.zzb(this.zzl, zzesVar2);
                            }
                            if (i5 == 178) {
                                if (zzesVar.zzi()[zzi2 + 2] == 1) {
                                    zzaqdVar.zzc(178);
                                }
                                i5 = 178;
                            }
                            int i11 = i - zzi2;
                            this.zzg.zzd(this.zzh - i11, i11, this.zzk);
                            this.zzg.zzb(i5, this.zzl);
                            zzg = i4;
                            zze = i;
                        }
                    }
                    i3 = 2;
                    if (zzerVar.zzj(i3) != 0) {
                    }
                    zzerVar.zzg();
                    int zzj42 = zzerVar.zzj(16);
                    zzerVar.zzg();
                    if (zzerVar.zzi()) {
                    }
                    zzerVar.zzg();
                    int zzj52 = zzerVar.zzj(13);
                    zzerVar.zzg();
                    int zzj62 = zzerVar.zzj(13);
                    zzerVar.zzg();
                    zzerVar.zzg();
                    zzt zztVar2 = new zzt();
                    zztVar2.zza(str);
                    zztVar2.zzn(MimeTypes.VIDEO_MP2T);
                    zztVar2.zzo(MimeTypes.VIDEO_MP4V);
                    zztVar2.zzv(zzj52);
                    zztVar2.zzw(zzj62);
                    zztVar2.zzB(f2);
                    zztVar2.zzr(Collections.singletonList(copyOf));
                    zzahbVar.zzA(zztVar2.zzO());
                    this.zzk = true;
                    this.zzg.zzc(zzi, zzg, zzi2);
                    zzaqdVar = this.zzf;
                    if (i6 > 0) {
                    }
                    if (zzaqdVar.zze(i2)) {
                    }
                    if (i5 == 178) {
                    }
                    int i112 = i - zzi2;
                    this.zzg.zzd(this.zzh - i112, i112, this.zzk);
                    this.zzg.zzb(i5, this.zzl);
                    zzg = i4;
                    zze = i;
                }
            }
            i = zze;
            this.zzg.zzc(zzi, zzg, zzi2);
            zzaqdVar = this.zzf;
            if (i6 > 0) {
            }
            if (zzaqdVar.zze(i2)) {
            }
            if (i5 == 178) {
            }
            int i1122 = i - zzi2;
            this.zzg.zzd(this.zzh - i1122, i1122, this.zzk);
            this.zzg.zzb(i5, this.zzl);
            zzg = i4;
            zze = i;
        }
        if (!this.zzk) {
            this.zze.zzc(zzi, zzg, zze);
        }
        this.zzg.zzc(zzi, zzg, zze);
        this.zzf.zzd(zzi, zzg, zze);
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final void zze(boolean z) {
        zzapq zzapqVar = this.zzg;
        zzapqVar.getClass();
        if (z) {
            zzapqVar.zzd(this.zzh, 0, this.zzk);
            this.zzg.zza();
        }
    }
}
