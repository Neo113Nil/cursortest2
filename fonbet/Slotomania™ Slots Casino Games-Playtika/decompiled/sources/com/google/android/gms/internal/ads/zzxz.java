package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.common.net.HttpHeaders;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
final class zzxz implements zzabr, zzwr {
    final /* synthetic */ zzyi zza;
    private final long zzb;
    private final Uri zzc;
    private final zzig zzd;
    private final zzxv zze;
    private final zzafs zzf;
    private final zzdr zzg;
    private final zzagp zzh;
    private volatile boolean zzi;
    private boolean zzj;
    private long zzk;
    private zzhn zzl;
    private zzahb zzm;
    private boolean zzn;

    public zzxz(zzyi zzyiVar, Uri uri, zzhj zzhjVar, zzxv zzxvVar, zzafs zzafsVar, zzdr zzdrVar) {
        Objects.requireNonNull(zzyiVar);
        this.zza = zzyiVar;
        this.zzc = uri;
        this.zzd = new zzig(zzhjVar);
        this.zze = zzxvVar;
        this.zzf = zzafsVar;
        this.zzg = zzdrVar;
        this.zzh = new zzagp();
        this.zzj = true;
        this.zzb = zzwt.zza();
        this.zzl = zzi(0L, null);
    }

    private final zzhn zzi(long j, String str) {
        Map map;
        map = zzyi.zzb;
        if (str != null && !str.startsWith("W/")) {
            zzgwb zzgwbVar = new zzgwb();
            zzgwbVar.zzb(map.entrySet());
            zzgwbVar.zza(HttpHeaders.IF_RANGE, str);
            map = zzgwbVar.zzd();
        }
        zzhm zzhmVar = new zzhm();
        zzhmVar.zza(this.zzc);
        zzhmVar.zzc(j);
        zzhmVar.zzd(6);
        zzhmVar.zzb(map);
        return zzhmVar.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final void zzb() {
        this.zzi = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00cd A[Catch: all -> 0x00bc, TryCatch #7 {all -> 0x00bc, blocks: (B:116:0x007a, B:118:0x0080, B:21:0x00c3, B:23:0x00cd, B:24:0x00da, B:26:0x00e4, B:27:0x00f1, B:29:0x00fb, B:30:0x0108, B:32:0x0112, B:33:0x0125, B:35:0x012f, B:37:0x0136, B:41:0x0173, B:42:0x017c, B:44:0x0189, B:46:0x0192, B:47:0x01ad, B:49:0x01c2, B:50:0x01c5, B:52:0x01c9, B:104:0x0140, B:107:0x015e, B:123:0x008c, B:126:0x00aa), top: B:115:0x007a }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e4 A[Catch: all -> 0x00bc, TryCatch #7 {all -> 0x00bc, blocks: (B:116:0x007a, B:118:0x0080, B:21:0x00c3, B:23:0x00cd, B:24:0x00da, B:26:0x00e4, B:27:0x00f1, B:29:0x00fb, B:30:0x0108, B:32:0x0112, B:33:0x0125, B:35:0x012f, B:37:0x0136, B:41:0x0173, B:42:0x017c, B:44:0x0189, B:46:0x0192, B:47:0x01ad, B:49:0x01c2, B:50:0x01c5, B:52:0x01c9, B:104:0x0140, B:107:0x015e, B:123:0x008c, B:126:0x00aa), top: B:115:0x007a }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00fb A[Catch: all -> 0x00bc, TryCatch #7 {all -> 0x00bc, blocks: (B:116:0x007a, B:118:0x0080, B:21:0x00c3, B:23:0x00cd, B:24:0x00da, B:26:0x00e4, B:27:0x00f1, B:29:0x00fb, B:30:0x0108, B:32:0x0112, B:33:0x0125, B:35:0x012f, B:37:0x0136, B:41:0x0173, B:42:0x017c, B:44:0x0189, B:46:0x0192, B:47:0x01ad, B:49:0x01c2, B:50:0x01c5, B:52:0x01c9, B:104:0x0140, B:107:0x015e, B:123:0x008c, B:126:0x00aa), top: B:115:0x007a }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0112 A[Catch: all -> 0x00bc, TryCatch #7 {all -> 0x00bc, blocks: (B:116:0x007a, B:118:0x0080, B:21:0x00c3, B:23:0x00cd, B:24:0x00da, B:26:0x00e4, B:27:0x00f1, B:29:0x00fb, B:30:0x0108, B:32:0x0112, B:33:0x0125, B:35:0x012f, B:37:0x0136, B:41:0x0173, B:42:0x017c, B:44:0x0189, B:46:0x0192, B:47:0x01ad, B:49:0x01c2, B:50:0x01c5, B:52:0x01c9, B:104:0x0140, B:107:0x015e, B:123:0x008c, B:126:0x00aa), top: B:115:0x007a }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x012f A[Catch: all -> 0x00bc, TRY_LEAVE, TryCatch #7 {all -> 0x00bc, blocks: (B:116:0x007a, B:118:0x0080, B:21:0x00c3, B:23:0x00cd, B:24:0x00da, B:26:0x00e4, B:27:0x00f1, B:29:0x00fb, B:30:0x0108, B:32:0x0112, B:33:0x0125, B:35:0x012f, B:37:0x0136, B:41:0x0173, B:42:0x017c, B:44:0x0189, B:46:0x0192, B:47:0x01ad, B:49:0x01c2, B:50:0x01c5, B:52:0x01c9, B:104:0x0140, B:107:0x015e, B:123:0x008c, B:126:0x00aa), top: B:115:0x007a }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0173 A[Catch: all -> 0x00bc, TryCatch #7 {all -> 0x00bc, blocks: (B:116:0x007a, B:118:0x0080, B:21:0x00c3, B:23:0x00cd, B:24:0x00da, B:26:0x00e4, B:27:0x00f1, B:29:0x00fb, B:30:0x0108, B:32:0x0112, B:33:0x0125, B:35:0x012f, B:37:0x0136, B:41:0x0173, B:42:0x017c, B:44:0x0189, B:46:0x0192, B:47:0x01ad, B:49:0x01c2, B:50:0x01c5, B:52:0x01c9, B:104:0x0140, B:107:0x015e, B:123:0x008c, B:126:0x00aa), top: B:115:0x007a }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0189 A[Catch: all -> 0x00bc, TryCatch #7 {all -> 0x00bc, blocks: (B:116:0x007a, B:118:0x0080, B:21:0x00c3, B:23:0x00cd, B:24:0x00da, B:26:0x00e4, B:27:0x00f1, B:29:0x00fb, B:30:0x0108, B:32:0x0112, B:33:0x0125, B:35:0x012f, B:37:0x0136, B:41:0x0173, B:42:0x017c, B:44:0x0189, B:46:0x0192, B:47:0x01ad, B:49:0x01c2, B:50:0x01c5, B:52:0x01c9, B:104:0x0140, B:107:0x015e, B:123:0x008c, B:126:0x00aa), top: B:115:0x007a }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01c2 A[Catch: all -> 0x00bc, TryCatch #7 {all -> 0x00bc, blocks: (B:116:0x007a, B:118:0x0080, B:21:0x00c3, B:23:0x00cd, B:24:0x00da, B:26:0x00e4, B:27:0x00f1, B:29:0x00fb, B:30:0x0108, B:32:0x0112, B:33:0x0125, B:35:0x012f, B:37:0x0136, B:41:0x0173, B:42:0x017c, B:44:0x0189, B:46:0x0192, B:47:0x01ad, B:49:0x01c2, B:50:0x01c5, B:52:0x01c9, B:104:0x0140, B:107:0x015e, B:123:0x008c, B:126:0x00aa), top: B:115:0x007a }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01c9 A[Catch: all -> 0x00bc, TRY_LEAVE, TryCatch #7 {all -> 0x00bc, blocks: (B:116:0x007a, B:118:0x0080, B:21:0x00c3, B:23:0x00cd, B:24:0x00da, B:26:0x00e4, B:27:0x00f1, B:29:0x00fb, B:30:0x0108, B:32:0x0112, B:33:0x0125, B:35:0x012f, B:37:0x0136, B:41:0x0173, B:42:0x017c, B:44:0x0189, B:46:0x0192, B:47:0x01ad, B:49:0x01c2, B:50:0x01c5, B:52:0x01c9, B:104:0x0140, B:107:0x015e, B:123:0x008c, B:126:0x00aa), top: B:115:0x007a }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01d8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x020f A[EDGE_INSN: B:96:0x020f->B:76:0x020f BREAK  A[LOOP:1: B:57:0x01d6->B:68:0x01d6], SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzabr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzc() throws IOException {
        int i;
        long j;
        int i2;
        int i3;
        int i4;
        boolean z;
        List list;
        String str;
        List list2;
        String str2;
        List list3;
        String str3;
        List list4;
        boolean z2;
        List list5;
        int i5;
        zzig zzigVar;
        zzyi zzyiVar;
        zzj zzjVar;
        int i6;
        zzv zzvVar;
        int i7;
        int i8 = 0;
        String str4 = null;
        for (int i9 = 0; i9 == 0 && !this.zzi; i9 = i6) {
            try {
                long j2 = this.zzh.zza;
                zzhn zzi = zzi(j2, str4);
                this.zzl = zzi;
                zzig zzigVar2 = this.zzd;
                long zzb = zzigVar2.zzb(zzi);
                if (this.zzi) {
                    zzxv zzxvVar = this.zze;
                    if (zzxvVar.zzd() != -1) {
                        this.zzh.zza = zzxvVar.zzd();
                    }
                    zzhl.zza(this.zzd);
                    return;
                }
                List list6 = (List) zzigVar2.zzj().get(HttpHeaders.ETAG);
                str4 = (list6 == null || list6.isEmpty()) ? null : (String) list6.get(i8);
                if (zzb != -1) {
                    zzb += j2;
                    this.zza.zzH();
                }
                long j3 = zzb;
                zzyi zzyiVar2 = this.zza;
                Map zzj = zzigVar2.zzj();
                List list7 = (List) zzj.get("icy-br");
                j = -1;
                if (list7 != null) {
                    try {
                        String str5 = (String) list7.get(i8);
                        try {
                            i3 = Integer.parseInt(str5) * 1000;
                        } catch (NumberFormatException unused) {
                            i3 = -1;
                        }
                        if (i3 > 0) {
                            i4 = i3;
                            z = true;
                            list = (List) zzj.get("icy-genre");
                            if (list != null) {
                                str = (String) list.get(0);
                                z = true;
                            } else {
                                str = null;
                            }
                            list2 = (List) zzj.get("icy-name");
                            if (list2 != null) {
                                str2 = (String) list2.get(0);
                                z = true;
                            } else {
                                str2 = null;
                            }
                            list3 = (List) zzj.get("icy-url");
                            if (list3 != null) {
                                str3 = (String) list3.get(0);
                                z = true;
                            } else {
                                str3 = null;
                            }
                            list4 = (List) zzj.get("icy-pub");
                            if (list4 != null) {
                                z2 = ((String) list4.get(0)).equals("1");
                                z = true;
                            } else {
                                z2 = false;
                            }
                            list5 = (List) zzj.get("icy-metaint");
                            if (list5 != null) {
                                String str6 = (String) list5.get(0);
                                try {
                                    i7 = Integer.parseInt(str6);
                                } catch (NumberFormatException unused2) {
                                    i7 = -1;
                                }
                                if (i7 > 0) {
                                    i5 = i7;
                                    z = true;
                                    zzyiVar2.zzP(z ? new zzaiw(i4, str, str2, str3, z2, i5) : null);
                                    zzigVar = this.zzd;
                                    zzyiVar = this.zza;
                                    if (zzyiVar.zzO() != null || zzyiVar.zzO().zzf == -1) {
                                        zzjVar = zzigVar;
                                    } else {
                                        zzj zzwsVar = new zzws(zzigVar, zzyiVar.zzO().zzf, this);
                                        zzahb zzx = zzyiVar.zzx();
                                        this.zzm = zzx;
                                        zzvVar = zzyi.zzc;
                                        zzx.zzA(zzvVar);
                                        zzjVar = zzwsVar;
                                    }
                                    zzxv zzxvVar2 = this.zze;
                                    zzxvVar2.zza(zzjVar, this.zzc, zzigVar.zzj(), j2, j3, this.zzf);
                                    if (zzyiVar.zzO() != null) {
                                        zzxvVar2.zzc();
                                    }
                                    if (this.zzj) {
                                        zzxvVar2.zze(j2, this.zzk);
                                        i = 0;
                                        try {
                                            this.zzj = false;
                                        } catch (Throwable th) {
                                            th = th;
                                            i2 = i;
                                            if (i2 != 1) {
                                                zzxv zzxvVar3 = this.zze;
                                                if (zzxvVar3.zzd() != j) {
                                                    this.zzh.zza = zzxvVar3.zzd();
                                                }
                                            }
                                            zzhl.zza(this.zzd);
                                            throw th;
                                        }
                                    } else {
                                        i = 0;
                                    }
                                    i6 = i;
                                    while (true) {
                                        if (i6 != 0) {
                                            break;
                                        }
                                        try {
                                            if (this.zzi) {
                                                i6 = i;
                                                break;
                                            }
                                            try {
                                                zzdr zzdrVar = this.zzg;
                                                zzdrVar.zzc();
                                                i6 = zzxvVar2.zzf(this.zzh);
                                                long zzd = zzxvVar2.zzd();
                                                if (zzd > zzyiVar.zzL() + j2) {
                                                    zzdrVar.zzb();
                                                    zzyiVar.zzN().post(zzyiVar.zzM());
                                                    j2 = zzd;
                                                }
                                            } catch (InterruptedException unused3) {
                                                throw new InterruptedIOException();
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            i2 = i6;
                                            if (i2 != 1) {
                                            }
                                            zzhl.zza(this.zzd);
                                            throw th;
                                        }
                                    }
                                    if (i6 == 1) {
                                        i6 = i;
                                    } else if (zzxvVar2.zzd() != -1) {
                                        this.zzh.zza = zzxvVar2.zzd();
                                    }
                                    zzhl.zza(zzigVar);
                                    i8 = i;
                                } else {
                                    try {
                                        StringBuilder sb = new StringBuilder(String.valueOf(str6).length() + 27);
                                        sb.append("Invalid metadata interval: ");
                                        sb.append(str6);
                                        zzef.zzc("IcyHeaders", sb.toString());
                                    } catch (NumberFormatException unused4) {
                                        String.valueOf(str6);
                                        zzef.zzc("IcyHeaders", "Invalid metadata interval: ".concat(String.valueOf(str6)));
                                        i5 = i7;
                                        zzyiVar2.zzP(z ? new zzaiw(i4, str, str2, str3, z2, i5) : null);
                                        zzigVar = this.zzd;
                                        zzyiVar = this.zza;
                                        if (zzyiVar.zzO() != null) {
                                        }
                                        zzjVar = zzigVar;
                                        zzxv zzxvVar22 = this.zze;
                                        zzxvVar22.zza(zzjVar, this.zzc, zzigVar.zzj(), j2, j3, this.zzf);
                                        if (zzyiVar.zzO() != null) {
                                        }
                                        if (this.zzj) {
                                        }
                                        i6 = i;
                                        while (true) {
                                            if (i6 != 0) {
                                            }
                                        }
                                        if (i6 == 1) {
                                        }
                                        zzhl.zza(zzigVar);
                                        i8 = i;
                                    }
                                }
                            }
                            i5 = -1;
                            zzyiVar2.zzP(z ? new zzaiw(i4, str, str2, str3, z2, i5) : null);
                            zzigVar = this.zzd;
                            zzyiVar = this.zza;
                            if (zzyiVar.zzO() != null) {
                            }
                            zzjVar = zzigVar;
                            zzxv zzxvVar222 = this.zze;
                            zzxvVar222.zza(zzjVar, this.zzc, zzigVar.zzj(), j2, j3, this.zzf);
                            if (zzyiVar.zzO() != null) {
                            }
                            if (this.zzj) {
                            }
                            i6 = i;
                            while (true) {
                                if (i6 != 0) {
                                }
                            }
                            if (i6 == 1) {
                            }
                            zzhl.zza(zzigVar);
                            i8 = i;
                        } else {
                            try {
                                StringBuilder sb2 = new StringBuilder(String.valueOf(str5).length() + 17);
                                sb2.append("Invalid bitrate: ");
                                sb2.append(str5);
                                zzef.zzc("IcyHeaders", sb2.toString());
                            } catch (NumberFormatException unused5) {
                                String.valueOf(str5);
                                zzef.zzc("IcyHeaders", "Invalid bitrate header: ".concat(String.valueOf(str5)));
                                i4 = i3;
                                z = false;
                                list = (List) zzj.get("icy-genre");
                                if (list != null) {
                                }
                                list2 = (List) zzj.get("icy-name");
                                if (list2 != null) {
                                }
                                list3 = (List) zzj.get("icy-url");
                                if (list3 != null) {
                                }
                                list4 = (List) zzj.get("icy-pub");
                                if (list4 != null) {
                                }
                                list5 = (List) zzj.get("icy-metaint");
                                if (list5 != null) {
                                }
                                i5 = -1;
                                zzyiVar2.zzP(z ? new zzaiw(i4, str, str2, str3, z2, i5) : null);
                                zzigVar = this.zzd;
                                zzyiVar = this.zza;
                                if (zzyiVar.zzO() != null) {
                                }
                                zzjVar = zzigVar;
                                zzxv zzxvVar2222 = this.zze;
                                zzxvVar2222.zza(zzjVar, this.zzc, zzigVar.zzj(), j2, j3, this.zzf);
                                if (zzyiVar.zzO() != null) {
                                }
                                if (this.zzj) {
                                }
                                i6 = i;
                                while (true) {
                                    if (i6 != 0) {
                                    }
                                }
                                if (i6 == 1) {
                                }
                                zzhl.zza(zzigVar);
                                i8 = i;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        i = 0;
                        i2 = i;
                        if (i2 != 1) {
                        }
                        zzhl.zza(this.zzd);
                        throw th;
                    }
                }
                z = false;
                i4 = -1;
                list = (List) zzj.get("icy-genre");
                if (list != null) {
                }
                list2 = (List) zzj.get("icy-name");
                if (list2 != null) {
                }
                list3 = (List) zzj.get("icy-url");
                if (list3 != null) {
                }
                list4 = (List) zzj.get("icy-pub");
                if (list4 != null) {
                }
                list5 = (List) zzj.get("icy-metaint");
                if (list5 != null) {
                }
                i5 = -1;
                zzyiVar2.zzP(z ? new zzaiw(i4, str, str2, str3, z2, i5) : null);
                zzigVar = this.zzd;
                zzyiVar = this.zza;
                if (zzyiVar.zzO() != null) {
                }
                zzjVar = zzigVar;
                zzxv zzxvVar22222 = this.zze;
                zzxvVar22222.zza(zzjVar, this.zzc, zzigVar.zzj(), j2, j3, this.zzf);
                if (zzyiVar.zzO() != null) {
                }
                if (this.zzj) {
                }
                i6 = i;
                while (true) {
                    if (i6 != 0) {
                    }
                }
                if (i6 == 1) {
                }
                zzhl.zza(zzigVar);
                i8 = i;
            } catch (Throwable th4) {
                th = th4;
                i = i8;
                j = -1;
            }
        }
    }

    final /* synthetic */ void zzd(long j, long j2) {
        this.zzh.zza = j;
        this.zzk = j2;
        this.zzj = true;
        this.zzn = false;
    }

    final /* synthetic */ long zze() {
        return this.zzb;
    }

    final /* synthetic */ zzig zzf() {
        return this.zzd;
    }

    final /* synthetic */ long zzg() {
        return this.zzk;
    }

    final /* synthetic */ zzhn zzh() {
        return this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzwr
    public final void zza(zzes zzesVar) {
        long max = !this.zzn ? this.zzk : Math.max(this.zza.zzI(true), this.zzk);
        int zzd = zzesVar.zzd();
        zzahb zzahbVar = this.zzm;
        zzahbVar.getClass();
        zzahbVar.zzc(zzesVar, zzd);
        zzahbVar.zze(max, 1, zzd, 0, null);
        this.zzn = true;
    }
}
