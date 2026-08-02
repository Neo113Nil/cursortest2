package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes3.dex */
final class zzalm {
    public static void zza(int i, zzap zzapVar, zzt zztVar, zzap zzapVar2, zzap... zzapVarArr) {
        if (zzapVar2 == null) {
            zzapVar2 = new zzap(C.TIME_UNSET, new zzao[0]);
        }
        if (zzapVar != null) {
            zzgvz zzd = zzapVar.zzd(zzfu.class);
            int size = zzd.size();
            for (int i2 = 0; i2 < size; i2++) {
                zzfu zzfuVar = (zzfu) zzd.get(i2);
                if (!zzfuVar.zza.equals(MdtaMetadataEntry.KEY_ANDROID_CAPTURE_FPS) || i == 2) {
                    zzapVar2 = zzapVar2.zzg(zzfuVar);
                }
            }
        }
        for (zzap zzapVar3 : zzapVarArr) {
            zzapVar2 = zzapVar2.zzf(zzapVar3);
        }
        if (zzapVar2.zza() > 0) {
            zztVar.zzl(zzapVar2);
        }
    }

    public static void zzb(int i, zzagi zzagiVar, zzt zztVar) {
        if (i == 1 && zzagiVar.zzb()) {
            zztVar.zzJ(zzagiVar.zza);
            zztVar.zzK(zzagiVar.zzb);
        }
    }

    public static zzao zzc(zzes zzesVar) {
        String str;
        zzao zzaixVar;
        int zzg = zzesVar.zzg() + zzesVar.zzB();
        int zzB = zzesVar.zzB();
        int i = (zzB >> 24) & 255;
        zzao zzaoVar = null;
        try {
            if (i == 169 || i == 253) {
                int i2 = zzB & 16777215;
                if (i2 == 6516084) {
                    int zzB2 = zzesVar.zzB();
                    if (zzesVar.zzB() == 1684108385) {
                        zzesVar.zzk(8);
                        String zzL = zzesVar.zzL(zzB2 - 16);
                        zzaoVar = new zzajb(C.LANGUAGE_UNDETERMINED, zzL, zzL);
                    } else {
                        zzef.zzc("MetadataUtil", "Failed to parse comment attribute: ".concat(zzfy.zze(zzB)));
                    }
                } else {
                    if (i2 != 7233901 && i2 != 7631467) {
                        if (i2 != 6516589 && i2 != 7828084) {
                            if (i2 == 6578553) {
                                zzaoVar = zzd(zzB, "TDRC", zzesVar);
                            } else if (i2 == 4280916) {
                                zzaoVar = zzd(zzB, "TPE1", zzesVar);
                            } else if (i2 == 7630703) {
                                zzaoVar = zzd(zzB, "TSSE", zzesVar);
                            } else if (i2 == 6384738) {
                                zzaoVar = zzd(zzB, "TALB", zzesVar);
                            } else if (i2 == 7108978) {
                                zzaoVar = zzd(zzB, "USLT", zzesVar);
                            } else if (i2 == 6776174) {
                                zzaoVar = zzd(zzB, "TCON", zzesVar);
                            } else if (i2 == 6779504) {
                                zzaoVar = zzd(zzB, "TIT1", zzesVar);
                            } else if (i2 == 7173742) {
                                zzaoVar = zzd(zzB, "MVNM", zzesVar);
                            } else {
                                if (i2 == 7173737) {
                                    zzaoVar = zze(zzB, "MVIN", zzesVar, true, false);
                                }
                                String zze = zzfy.zze(zzB);
                                StringBuilder sb = new StringBuilder(zze.length() + 32);
                                sb.append("Skipped unknown metadata entry: ");
                                sb.append(zze);
                                zzef.zza("MetadataUtil", sb.toString());
                            }
                        }
                        zzaoVar = zzd(zzB, "TCOM", zzesVar);
                    }
                    zzaoVar = zzd(zzB, "TIT2", zzesVar);
                }
            } else if (zzB == 1735291493) {
                String zza = zzaji.zza(zzf(zzesVar) - 1);
                if (zza != null) {
                    zzaixVar = new zzajm("TCON", null, zzgvz.zzj(zza));
                    zzaoVar = zzaixVar;
                } else {
                    zzef.zzc("MetadataUtil", "Failed to parse standard genre code");
                }
            } else if (zzB == 1684632427) {
                zzaoVar = zzg(1684632427, "TPOS", zzesVar);
            } else if (zzB == 1953655662) {
                zzaoVar = zzg(1953655662, "TRCK", zzesVar);
            } else if (zzB == 1953329263) {
                zzaoVar = zze(1953329263, "TBPM", zzesVar, true, false);
            } else if (zzB == 1668311404) {
                zzaoVar = zze(1668311404, "TCMP", zzesVar, true, true);
            } else if (zzB == 1668249202) {
                int zzB3 = zzesVar.zzB();
                if (zzesVar.zzB() == 1684108385) {
                    int zzB4 = zzesVar.zzB();
                    int i3 = zzald.zza;
                    int i4 = zzB4 & 16777215;
                    if (i4 == 13) {
                        str = "image/jpeg";
                    } else if (i4 == 14) {
                        str = "image/png";
                        i4 = 14;
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(i4).length() + 30);
                        sb2.append("Unrecognized cover art flags: ");
                        sb2.append(i4);
                        zzef.zzc("MetadataUtil", sb2.toString());
                    } else {
                        zzesVar.zzk(4);
                        int i5 = zzB3 - 16;
                        byte[] bArr = new byte[i5];
                        zzesVar.zzm(bArr, 0, i5);
                        zzaixVar = new zzaix(str, null, 3, bArr);
                        zzaoVar = zzaixVar;
                    }
                } else {
                    zzef.zzc("MetadataUtil", "Failed to parse cover art attribute");
                }
            } else if (zzB == 1631670868) {
                zzaoVar = zzd(1631670868, "TPE2", zzesVar);
            } else if (zzB == 1936682605) {
                zzaoVar = zzd(1936682605, "TSOT", zzesVar);
            } else if (zzB == 1936679276) {
                zzaoVar = zzd(1936679276, "TSOA", zzesVar);
            } else if (zzB == 1936679282) {
                zzaoVar = zzd(1936679282, "TSOP", zzesVar);
            } else if (zzB == 1936679265) {
                zzaoVar = zzd(1936679265, "TSO2", zzesVar);
            } else if (zzB == 1936679791) {
                zzaoVar = zzd(1936679791, "TSOC", zzesVar);
            } else if (zzB == 1920233063) {
                zzaoVar = zze(1920233063, "ITUNESADVISORY", zzesVar, false, false);
            } else if (zzB == 1885823344) {
                zzaoVar = zze(1885823344, "ITUNESGAPLESS", zzesVar, false, true);
            } else if (zzB == 1936683886) {
                zzaoVar = zzd(1936683886, "TVSHOWSORT", zzesVar);
            } else if (zzB == 1953919848) {
                zzaoVar = zzd(1953919848, "TVSHOW", zzesVar);
            } else {
                if (zzB == 757935405) {
                    int i6 = -1;
                    int i7 = -1;
                    String str2 = null;
                    String str3 = null;
                    while (zzesVar.zzg() < zzg) {
                        int zzg2 = zzesVar.zzg();
                        int zzB5 = zzesVar.zzB();
                        int zzB6 = zzesVar.zzB();
                        zzesVar.zzk(4);
                        if (zzB6 == 1835360622) {
                            str2 = zzesVar.zzL(zzB5 - 12);
                        } else {
                            int i8 = zzB5 - 12;
                            if (zzB6 == 1851878757) {
                                str3 = zzesVar.zzL(i8);
                            } else {
                                if (zzB6 == 1684108385) {
                                    i7 = zzB5;
                                }
                                if (zzB6 == 1684108385) {
                                    i6 = zzg2;
                                }
                                zzesVar.zzk(i8);
                            }
                        }
                    }
                    if (str2 != null && str3 != null && i6 != -1) {
                        zzesVar.zzh(i6);
                        zzesVar.zzk(16);
                        zzaoVar = new zzajj(str2, str3, zzesVar.zzL(i7 - 16));
                    }
                }
                String zze2 = zzfy.zze(zzB);
                StringBuilder sb3 = new StringBuilder(zze2.length() + 32);
                sb3.append("Skipped unknown metadata entry: ");
                sb3.append(zze2);
                zzef.zza("MetadataUtil", sb3.toString());
            }
            return zzaoVar;
        } finally {
            zzesVar.zzh(zzg);
        }
    }

    private static zzajm zzd(int i, String str, zzes zzesVar) {
        int zzB = zzesVar.zzB();
        if (zzesVar.zzB() == 1684108385) {
            zzesVar.zzk(8);
            return new zzajm(str, null, zzgvz.zzj(zzesVar.zzL(zzB - 16)));
        }
        zzef.zzc("MetadataUtil", "Failed to parse text attribute: ".concat(zzfy.zze(i)));
        return null;
    }

    private static zzajh zze(int i, String str, zzes zzesVar, boolean z, boolean z2) {
        int zzf = zzf(zzesVar);
        if (z2) {
            zzf = Math.min(1, zzf);
        }
        if (zzf >= 0) {
            return z ? new zzajm(str, null, zzgvz.zzj(Integer.toString(zzf))) : new zzajb(C.LANGUAGE_UNDETERMINED, str, Integer.toString(zzf));
        }
        zzef.zzc("MetadataUtil", "Failed to parse uint8 attribute: ".concat(zzfy.zze(i)));
        return null;
    }

    private static int zzf(zzes zzesVar) {
        int zzB = zzesVar.zzB();
        if (zzesVar.zzB() == 1684108385) {
            zzesVar.zzk(8);
            int i = zzB - 16;
            if (i == 1) {
                return zzesVar.zzs();
            }
            if (i == 2) {
                return zzesVar.zzt();
            }
            if (i == 3) {
                return zzesVar.zzx();
            }
            if (i == 4 && (zzesVar.zzn() & 128) == 0) {
                return zzesVar.zzH();
            }
        }
        zzef.zzc("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    private static zzajm zzg(int i, String str, zzes zzesVar) {
        int zzB = zzesVar.zzB();
        if (zzesVar.zzB() == 1684108385 && zzB >= 22) {
            zzesVar.zzk(10);
            int zzt = zzesVar.zzt();
            if (zzt > 0) {
                StringBuilder sb = new StringBuilder(String.valueOf(zzt).length());
                sb.append(zzt);
                String sb2 = sb.toString();
                int zzt2 = zzesVar.zzt();
                if (zzt2 > 0) {
                    StringBuilder sb3 = new StringBuilder(sb2.length() + 1 + String.valueOf(zzt2).length());
                    sb3.append(sb2);
                    sb3.append("/");
                    sb3.append(zzt2);
                    sb2 = sb3.toString();
                }
                return new zzajm(str, null, zzgvz.zzj(sb2));
            }
        }
        zzef.zzc("MetadataUtil", "Failed to parse index/count attribute: ".concat(zzfy.zze(i)));
        return null;
    }
}
