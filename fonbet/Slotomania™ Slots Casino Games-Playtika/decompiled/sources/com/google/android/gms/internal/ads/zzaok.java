package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.google.android.exoplayer2.C;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes2.dex */
final class zzaok {
    private boolean zzd;
    private boolean zze;
    private int[] zzf;
    private int zzg;
    private int zzh;
    private Rect zzi;
    private long zzb = C.TIME_UNSET;
    private long zzc = C.TIME_UNSET;
    private final int[] zza = new int[4];
    private int zzj = -1;
    private int zzk = -1;

    private static int zzg(int[] iArr, int i) {
        if (i >= iArr.length) {
            i = 0;
        }
        return iArr[i];
    }

    private static int zzh(int i, int i2) {
        return (i & 16777215) | ((i2 * 17) << 24);
    }

    private final void zzi(zzer zzerVar, boolean z, Rect rect, int[] iArr) {
        int i;
        int i2;
        int i3 = !z ? 1 : 0;
        int width = rect.width();
        int i4 = i3 * width;
        int height = rect.height();
        while (true) {
            int i5 = 0;
            do {
                int i6 = 0;
                for (int i7 = 1; i6 < i7 && i7 <= 64; i7 <<= 2) {
                    if (zzerVar.zzc() < 4) {
                        i = -1;
                        i2 = 0;
                        break;
                    }
                    i6 = (i6 << 4) | zzerVar.zzj(4);
                }
                i = i6 & 3;
                i2 = i6 < 4 ? width : i6 >> 2;
                int min = Math.min(i2, width - i5);
                if (min > 0) {
                    int i8 = i4 + min;
                    Arrays.fill(iArr, i4, i8, this.zza[i]);
                    i5 += min;
                    i4 = i8;
                }
            } while (i5 < width);
            i3 += 2;
            if (i3 >= height) {
                return;
            }
            i4 = i3 * width;
            zzerVar.zzm();
        }
    }

    public final void zza(String str) {
        int i;
        String trim = str.trim();
        String str2 = zzfk.zza;
        for (String str3 : trim.split("\\r?\\n", -1)) {
            if (str3.startsWith("palette: ")) {
                String[] split = str3.substring(9).split(",", -1);
                this.zzf = new int[split.length];
                for (int i2 = 0; i2 < split.length; i2++) {
                    int[] iArr = this.zzf;
                    try {
                        i = Integer.parseInt(split[i2].trim(), 16);
                    } catch (RuntimeException e) {
                        zzef.zzd("VobsubParser", "Parsing color failed", e);
                        i = 0;
                    }
                    iArr[i2] = i;
                }
            } else if (str3.startsWith("size: ")) {
                String[] split2 = str3.substring(6).trim().split("x", -1);
                if (split2.length != 2) {
                    StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 36);
                    sb.append("Ignoring malformed IDX size line: '");
                    sb.append(str3);
                    sb.append("'");
                    zzef.zzc("VobsubParser", sb.toString());
                } else {
                    try {
                        this.zzg = Integer.parseInt(split2[0]);
                        this.zzh = Integer.parseInt(split2[1]);
                        this.zzd = true;
                    } catch (RuntimeException e2) {
                        zzef.zzd("VobsubParser", "Parsing IDX failed", e2);
                    }
                }
            }
        }
    }

    public final zzcx zzb(zzes zzesVar) {
        Rect rect;
        if (this.zzf == null || !this.zzd || !this.zze || (rect = this.zzi) == null || this.zzj == -1 || this.zzk == -1 || rect.width() < 2 || this.zzi.height() < 2) {
            return null;
        }
        Rect rect2 = this.zzi;
        int[] iArr = new int[rect2.width() * rect2.height()];
        zzer zzerVar = new zzer();
        zzesVar.zzh(this.zzj);
        zzerVar.zza(zzesVar);
        zzi(zzerVar, true, rect2, iArr);
        zzesVar.zzh(this.zzk);
        zzerVar.zza(zzesVar);
        zzi(zzerVar, false, rect2, iArr);
        Bitmap createBitmap = Bitmap.createBitmap(iArr, rect2.width(), rect2.height(), Bitmap.Config.ARGB_8888);
        zzcw zzcwVar = new zzcw();
        zzcwVar.zzc(createBitmap);
        zzcwVar.zzi(rect2.left / this.zzg);
        zzcwVar.zzj(0);
        zzcwVar.zzf(rect2.top / this.zzh, 0);
        zzcwVar.zzg(0);
        zzcwVar.zzm(rect2.width() / this.zzg);
        zzcwVar.zzn(rect2.height() / this.zzh);
        return zzcwVar.zzr();
    }

    public final void zzc() {
        this.zzb = C.TIME_UNSET;
        this.zzc = C.TIME_UNSET;
        this.zze = false;
        this.zzi = null;
        this.zzj = -1;
        this.zzk = -1;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:39:0x0069. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0187 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final /* synthetic */ void zzd(zzes zzesVar) {
        boolean z;
        if (this.zzf == null) {
            zzef.zzc("VobsubParser", "Skipping SPU (no palette)");
            return;
        }
        if (!this.zzd) {
            zzef.zzc("VobsubParser", "Skipping SPU (no plane)");
            return;
        }
        int zzg = zzesVar.zzg() - 2;
        zzesVar.zzh(zzesVar.zzt() + zzg);
        do {
            int i = 4;
            if (zzesVar.zzd() < 4) {
                z = false;
            } else {
                int zzg2 = zzesVar.zzg();
                int zzt = zzesVar.zzt() * 10000;
                int zzt2 = zzesVar.zzt() + zzg;
                boolean z2 = zzt2 != zzg2 && zzt2 < zzesVar.zze();
                int zze = z2 ? zzt2 : zzesVar.zze();
                while (true) {
                    boolean z3 = true;
                    while (zzesVar.zzg() < zze && z3) {
                        long j = zzt;
                        int zzs = zzesVar.zzs();
                        if (zzs == 255) {
                            switch (zzs) {
                                case 0:
                                    break;
                                case 1:
                                    this.zzb = j;
                                    z3 = true;
                                    i = 4;
                                    break;
                                case 2:
                                    this.zzc = j;
                                    z3 = true;
                                    i = 4;
                                    break;
                                case 3:
                                    if (zzesVar.zzd() < 2) {
                                        zzef.zzc("VobsubParser", "Incomplete color command");
                                        z3 = false;
                                        i = 4;
                                        break;
                                    } else {
                                        int zzs2 = zzesVar.zzs();
                                        int zzs3 = zzesVar.zzs();
                                        int[] iArr = this.zza;
                                        iArr[3] = zzg(this.zzf, zzs2 >> 4);
                                        iArr[2] = zzg(this.zzf, zzs2 & 15);
                                        iArr[1] = zzg(this.zzf, zzs3 >> 4);
                                        iArr[0] = zzg(this.zzf, zzs3 & 15);
                                        this.zze = true;
                                        z3 = true;
                                        i = 4;
                                    }
                                case 4:
                                    if (zzesVar.zzd() >= 2) {
                                        if (this.zze) {
                                            int zzs4 = zzesVar.zzs();
                                            int zzs5 = zzesVar.zzs();
                                            int[] iArr2 = this.zza;
                                            iArr2[3] = zzh(iArr2[3], zzs4 >> 4);
                                            iArr2[2] = zzh(iArr2[2], zzs4 & 15);
                                            iArr2[1] = zzh(iArr2[1], zzs5 >> 4);
                                            iArr2[0] = zzh(iArr2[0], zzs5 & 15);
                                            z3 = true;
                                            i = 4;
                                            break;
                                        } else {
                                            zzef.zzc("VobsubParser", "Ignoring alpha command before color command");
                                        }
                                    } else {
                                        zzef.zzc("VobsubParser", "Incomplete alpha command");
                                    }
                                    i = 4;
                                    z3 = false;
                                    break;
                                case 5:
                                    if (zzesVar.zzd() >= 6) {
                                        int zzs6 = zzesVar.zzs();
                                        int zzs7 = zzesVar.zzs();
                                        int i2 = zzs7 >> 4;
                                        int zzs8 = ((zzs7 & 15) << 8) | zzesVar.zzs();
                                        int zzs9 = zzesVar.zzs();
                                        int zzs10 = zzesVar.zzs();
                                        this.zzi = new Rect((zzs6 << i) | i2, (zzs9 << i) | (zzs10 >> 4), zzs8 + 1, (((zzs10 & 15) << 8) | zzesVar.zzs()) + 1);
                                        z3 = true;
                                        i = 4;
                                        break;
                                    } else {
                                        zzef.zzc("VobsubParser", "Incomplete area command");
                                        z3 = false;
                                        break;
                                    }
                                case 6:
                                    if (zzesVar.zzd() < i) {
                                        zzef.zzc("VobsubParser", "Incomplete offsets command");
                                        z3 = false;
                                        break;
                                    } else {
                                        this.zzj = zzesVar.zzt();
                                        this.zzk = zzesVar.zzt();
                                    }
                                default:
                                    StringBuilder sb = new StringBuilder(String.valueOf(zzs).length() + 22);
                                    sb.append("Unrecognized command: ");
                                    sb.append(zzs);
                                    zzef.zzc("VobsubParser", sb.toString());
                                    z3 = false;
                                    break;
                            }
                            while (zzesVar.zzg() < zze) {
                                long j2 = zzt;
                                int zzs11 = zzesVar.zzs();
                                if (zzs11 == 255) {
                                    z3 = false;
                                }
                            }
                        }
                    }
                }
                if (z2) {
                    zzesVar.zzh(zzt2);
                }
                z = z2;
            }
        } while (z);
    }

    final /* synthetic */ long zze() {
        return this.zzb;
    }

    final /* synthetic */ long zzf() {
        return this.zzc;
    }
}
