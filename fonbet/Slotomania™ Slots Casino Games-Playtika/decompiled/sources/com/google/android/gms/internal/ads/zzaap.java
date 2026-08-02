package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes5.dex */
final class zzaap extends zzaai {
    private final boolean zze;
    private final zzaae zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final int zzm;
    private final int zzn;
    private final int zzo;
    private final int zzp;
    private final boolean zzq;
    private final int zzr;
    private final int zzs;
    private final boolean zzt;
    private final boolean zzu;
    private final int zzv;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004d, code lost:
    
        if (r1 >= 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0055, code lost:
    
        if (r1 >= 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0062, code lost:
    
        if (r1 >= 0.0f) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x006a, code lost:
    
        if (r12 >= 0) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0106 A[EDGE_INSN: B:134:0x0106->B:71:0x0106 BREAK  A[LOOP:1: B:63:0x00e7->B:132:0x0103], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00b4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x018b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzaap(int i, zzbg zzbgVar, int i2, zzaae zzaaeVar, int i3, String str, int i4, boolean z) {
        super(i, zzbgVar, i2);
        boolean z2;
        boolean z3;
        int i5;
        int i6;
        int i7;
        int i8;
        zzv zzvVar;
        String str2;
        int i9;
        char c;
        boolean z4;
        zzv zzvVar2;
        int i10;
        int i11;
        int i12;
        this.zzf = zzaaeVar;
        int i13 = 1;
        int i14 = true != zzaaeVar.zzM ? 16 : 24;
        boolean z5 = zzaaeVar.zzL;
        if (z && (((i10 = (zzvVar2 = this.zzd).zzw) == -1 || i10 <= zzaaeVar.zza) && ((i11 = zzvVar2.zzx) == -1 || i11 <= zzaaeVar.zzb))) {
            float f = zzvVar2.zzA;
            if ((f == -1.0f || f <= zzaaeVar.zzc) && ((i12 = zzvVar2.zzj) == -1 || i12 <= zzaaeVar.zzd)) {
                z2 = true;
                this.zze = z2;
                if (z) {
                    zzv zzvVar3 = this.zzd;
                    int i15 = zzvVar3.zzw;
                    if (i15 != -1) {
                        int i16 = zzaaeVar.zze;
                    }
                    int i17 = zzvVar3.zzx;
                    if (i17 != -1) {
                        int i18 = zzaaeVar.zzf;
                    }
                    float f2 = zzvVar3.zzA;
                    if (f2 != -1.0f) {
                        int i19 = zzaaeVar.zzg;
                    }
                    int i20 = zzvVar3.zzj;
                    if (i20 != -1) {
                        int i21 = zzaaeVar.zzh;
                    }
                    z3 = true;
                    this.zzg = z3;
                    this.zzh = zzmw.zzac(i3, false);
                    zzv zzvVar4 = this.zzd;
                    float f3 = zzvVar4.zzA;
                    this.zzi = f3 == -1.0f && f3 >= 10.0f;
                    this.zzj = zzvVar4.zzj;
                    this.zzk = zzvVar4.zzc();
                    i5 = 0;
                    while (true) {
                        i6 = Integer.MAX_VALUE;
                        if (i5 >= zzaaeVar.zzo.size()) {
                            i7 = 0;
                            i5 = Integer.MAX_VALUE;
                            break;
                        } else {
                            i7 = zzaaq.zzj(this.zzd, (String) zzaaeVar.zzo.get(i5), false);
                            if (i7 > 0) {
                                break;
                            } else {
                                i5++;
                            }
                        }
                    }
                    this.zzm = i5;
                    this.zzn = i7;
                    int i22 = this.zzd.zzf;
                    int i23 = zzaaeVar.zzp;
                    this.zzo = zzaaq.zzm(i22, 0);
                    int i24 = this.zzd.zzf;
                    this.zzq = (i24 == 0 && (i24 & 1) == 0) ? false : true;
                    this.zzr = zzaaq.zzj(this.zzd, str, zzaaq.zzi(str) == null);
                    i8 = 0;
                    while (true) {
                        if (i8 < zzaaeVar.zzm.size()) {
                            String str3 = this.zzd.zzp;
                            if (str3 != null && str3.equals(zzaaeVar.zzm.get(i8))) {
                                i6 = i8;
                                break;
                            }
                            i8++;
                        } else {
                            break;
                        }
                    }
                    this.zzl = i6;
                    this.zzp = zzaaq.zzn(this.zzd, zzaaeVar.zzn);
                    this.zzt = (i3 & RendererCapabilities.MODE_SUPPORT_MASK) == 128;
                    this.zzu = (i3 & 64) == 64;
                    zzvVar = this.zzd;
                    str2 = zzvVar.zzp;
                    if (str2 != null) {
                        i9 = 4;
                        switch (str2.hashCode()) {
                            case -1851077871:
                                if (str2.equals(MimeTypes.VIDEO_DOLBY_VISION)) {
                                    c = 0;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -1662735862:
                                if (str2.equals("video/av01")) {
                                    c = 1;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -1662541442:
                                if (str2.equals("video/hevc")) {
                                    c = 2;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1331836730:
                                if (str2.equals("video/avc")) {
                                    c = 4;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1599127257:
                                if (str2.equals(MimeTypes.VIDEO_VP9)) {
                                    c = 3;
                                    break;
                                }
                                c = 65535;
                                break;
                            default:
                                c = 65535;
                                break;
                        }
                        if (c == 0) {
                            i9 = 5;
                        } else if (c != 1) {
                            if (c == 2) {
                                i9 = 3;
                            } else if (c == 3) {
                                i9 = 2;
                            } else if (c == 4) {
                                i9 = 1;
                            }
                        }
                        this.zzv = i9;
                        if ((zzvVar.zzf & 16384) == 0) {
                            zzaae zzaaeVar2 = this.zzf;
                            if (zzmw.zzac(i3, zzaaeVar2.zzV) && ((z4 = this.zze) || zzaaeVar2.zzK)) {
                                if (zzmw.zzac(i3, false) && this.zzg && z4 && zzvVar.zzj != -1) {
                                    boolean z6 = zzaaeVar2.zzG;
                                    boolean z7 = zzaaeVar2.zzF;
                                    if ((i14 & i3) != 0) {
                                        i13 = 2;
                                    }
                                }
                                this.zzs = i13;
                            }
                        }
                        i13 = 0;
                        this.zzs = i13;
                    }
                    i9 = 0;
                    this.zzv = i9;
                    if ((zzvVar.zzf & 16384) == 0) {
                    }
                    i13 = 0;
                    this.zzs = i13;
                }
                z3 = false;
                this.zzg = z3;
                this.zzh = zzmw.zzac(i3, false);
                zzv zzvVar42 = this.zzd;
                float f32 = zzvVar42.zzA;
                this.zzi = f32 == -1.0f && f32 >= 10.0f;
                this.zzj = zzvVar42.zzj;
                this.zzk = zzvVar42.zzc();
                i5 = 0;
                while (true) {
                    i6 = Integer.MAX_VALUE;
                    if (i5 >= zzaaeVar.zzo.size()) {
                    }
                    i5++;
                }
                this.zzm = i5;
                this.zzn = i7;
                int i222 = this.zzd.zzf;
                int i232 = zzaaeVar.zzp;
                this.zzo = zzaaq.zzm(i222, 0);
                int i242 = this.zzd.zzf;
                this.zzq = (i242 == 0 && (i242 & 1) == 0) ? false : true;
                this.zzr = zzaaq.zzj(this.zzd, str, zzaaq.zzi(str) == null);
                i8 = 0;
                while (true) {
                    if (i8 < zzaaeVar.zzm.size()) {
                    }
                    i8++;
                }
                this.zzl = i6;
                this.zzp = zzaaq.zzn(this.zzd, zzaaeVar.zzn);
                this.zzt = (i3 & RendererCapabilities.MODE_SUPPORT_MASK) == 128;
                this.zzu = (i3 & 64) == 64;
                zzvVar = this.zzd;
                str2 = zzvVar.zzp;
                if (str2 != null) {
                }
                i9 = 0;
                this.zzv = i9;
                if ((zzvVar.zzf & 16384) == 0) {
                }
                i13 = 0;
                this.zzs = i13;
            }
        }
        z2 = false;
        this.zze = z2;
        if (z) {
        }
        z3 = false;
        this.zzg = z3;
        this.zzh = zzmw.zzac(i3, false);
        zzv zzvVar422 = this.zzd;
        float f322 = zzvVar422.zzA;
        this.zzi = f322 == -1.0f && f322 >= 10.0f;
        this.zzj = zzvVar422.zzj;
        this.zzk = zzvVar422.zzc();
        i5 = 0;
        while (true) {
            i6 = Integer.MAX_VALUE;
            if (i5 >= zzaaeVar.zzo.size()) {
            }
            i5++;
        }
        this.zzm = i5;
        this.zzn = i7;
        int i2222 = this.zzd.zzf;
        int i2322 = zzaaeVar.zzp;
        this.zzo = zzaaq.zzm(i2222, 0);
        int i2422 = this.zzd.zzf;
        this.zzq = (i2422 == 0 && (i2422 & 1) == 0) ? false : true;
        this.zzr = zzaaq.zzj(this.zzd, str, zzaaq.zzi(str) == null);
        i8 = 0;
        while (true) {
            if (i8 < zzaaeVar.zzm.size()) {
            }
            i8++;
        }
        this.zzl = i6;
        this.zzp = zzaaq.zzn(this.zzd, zzaaeVar.zzn);
        this.zzt = (i3 & RendererCapabilities.MODE_SUPPORT_MASK) == 128;
        this.zzu = (i3 & 64) == 64;
        zzvVar = this.zzd;
        str2 = zzvVar.zzp;
        if (str2 != null) {
        }
        i9 = 0;
        this.zzv = i9;
        if ((zzvVar.zzf & 16384) == 0) {
        }
        i13 = 0;
        this.zzs = i13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzi(zzaap zzaapVar, zzaap zzaapVar2) {
        zzgvm zza = zzgvm.zzg().zzd(zzaapVar.zzh, zzaapVar2.zzh).zza(Integer.valueOf(zzaapVar.zzm), Integer.valueOf(zzaapVar2.zzm), zzgxt.zzb().zza()).zzb(zzaapVar.zzn, zzaapVar2.zzn).zzb(zzaapVar.zzo, zzaapVar2.zzo).zza(Integer.valueOf(zzaapVar.zzp), Integer.valueOf(zzaapVar2.zzp), zzgxt.zzb().zza()).zzd(zzaapVar.zzq, zzaapVar2.zzq).zzb(zzaapVar.zzr, zzaapVar2.zzr).zzd(zzaapVar.zzi, zzaapVar2.zzi).zzd(zzaapVar.zze, zzaapVar2.zze).zzd(zzaapVar.zzg, zzaapVar2.zzg).zza(Integer.valueOf(zzaapVar.zzl), Integer.valueOf(zzaapVar2.zzl), zzgxt.zzb().zza());
        boolean z = zzaapVar.zzt;
        zzgvm zzd = zza.zzd(z, zzaapVar2.zzt);
        boolean z2 = zzaapVar.zzu;
        zzgvm zzd2 = zzd.zzd(z2, zzaapVar2.zzu);
        if (z && z2) {
            zzd2 = zzd2.zzb(zzaapVar.zzv, zzaapVar2.zzv);
        }
        return zzd2.zze();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzj(zzaap zzaapVar, zzaap zzaapVar2) {
        zzgxt zzgxtVar;
        zzgxt zza;
        if (zzaapVar.zze && zzaapVar.zzh) {
            zza = zzaaq.zzc;
        } else {
            zzgxtVar = zzaaq.zzc;
            zza = zzgxtVar.zza();
        }
        zzgvm zzg = zzgvm.zzg();
        boolean z = zzaapVar.zzf.zzF;
        return zzg.zza(Integer.valueOf(zzaapVar.zzk), Integer.valueOf(zzaapVar2.zzk), zza).zza(Integer.valueOf(zzaapVar.zzj), Integer.valueOf(zzaapVar2.zzj), zza).zze();
    }

    @Override // com.google.android.gms.internal.ads.zzaai
    public final int zza() {
        return this.zzs;
    }

    @Override // com.google.android.gms.internal.ads.zzaai
    public final /* bridge */ /* synthetic */ boolean zzc(zzaai zzaaiVar) {
        zzaap zzaapVar = (zzaap) zzaaiVar;
        if (!Objects.equals(this.zzd.zzp, zzaapVar.zzd.zzp)) {
            return false;
        }
        boolean z = this.zzf.zzN;
        return this.zzt == zzaapVar.zzt && this.zzu == zzaapVar.zzu;
    }
}
