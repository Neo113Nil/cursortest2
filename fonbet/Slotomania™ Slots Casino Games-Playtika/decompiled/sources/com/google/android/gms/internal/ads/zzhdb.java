package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
public final class zzhdb implements zzhdp {
    private static final Charset zza = Charset.forName(C.UTF8_NAME);
    private final InputStream zzb;

    private zzhdb(InputStream inputStream) {
        this.zzb = inputStream;
    }

    public static zzhdb zza(String str) {
        return new zzhdb(new ByteArrayInputStream(str.getBytes(zza)));
    }

    private static int zzc(zziat zziatVar) throws IOException {
        if (!(zziatVar instanceof zziax)) {
            throw new IOException("invalid key id: not a JSON primitive");
        }
        if (!zziatVar.zzg().zzc()) {
            throw new IOException("invalid key id: not a JSON number");
        }
        try {
            long zzc = zzhle.zzc(zziatVar.zzg().zzh());
            if (zzc > 4294967295L || zzc < -2147483648L) {
                throw new IOException("invalid key id");
            }
            return (int) zzc;
        } catch (NumberFormatException e) {
            throw new IOException(e);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.zzhdp
    public final zzhso zzb() throws IOException {
        char c;
        int i;
        char c2;
        zzhtb zzhtbVar;
        char c3;
        zzhse zzhseVar;
        String str = "status";
        String str2 = "keyData";
        try {
            try {
                InputStream inputStream = this.zzb;
                int i2 = zzhea.zza;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    InputStream inputStream2 = inputStream;
                    if (read == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                    inputStream = inputStream2;
                }
                zziav zze = zzhle.zzb(new String(byteArrayOutputStream.toByteArray(), zza)).zze();
                if (!zze.zzc("key")) {
                    throw new zziaw("invalid keyset: no key");
                }
                zziat zzh = zze.zzh("key");
                if (!(zzh instanceof zzias)) {
                    throw new zziaw("invalid keyset: key must be an array");
                }
                zzias zzf = zzh.zzf();
                if (zzf.zzb() == 0) {
                    throw new zziaw("invalid keyset: key is empty");
                }
                zzhsl zzh2 = zzhso.zzh();
                if (zze.zzc("primaryKeyId")) {
                    zzh2.zza(zzc(zze.zzh("primaryKeyId")));
                }
                int i3 = 0;
                while (i3 < zzf.zzb()) {
                    zziav zze2 = zzf.zzc(i3).zze();
                    if (!zze2.zzc(str2) || !zze2.zzc(str) || !zze2.zzc("keyId") || !zze2.zzc("outputPrefixType")) {
                        throw new zziaw("invalid key");
                    }
                    zziat zzh3 = zze2.zzh(str2);
                    if (!(zzh3 instanceof zziav)) {
                        throw new zziaw("invalid key: keyData must be an object");
                    }
                    zzhsm zze3 = zzhsn.zze();
                    String zzd = zze2.zzh(str).zzd();
                    String str3 = str;
                    int hashCode = zzd.hashCode();
                    String str4 = str2;
                    int i4 = i3;
                    if (hashCode == -891611359) {
                        if (zzd.equals("ENABLED")) {
                            c = 0;
                        }
                        c = 65535;
                    } else if (hashCode != 478389753) {
                        if (hashCode == 1053567612 && zzd.equals("DISABLED")) {
                            c = 1;
                        }
                        c = 65535;
                    } else {
                        if (zzd.equals("DESTROYED")) {
                            c = 2;
                        }
                        c = 65535;
                    }
                    if (c == 0) {
                        i = 3;
                    } else if (c == 1) {
                        i = 4;
                    } else {
                        if (c != 2) {
                            String.valueOf(zzd);
                            throw new zziaw("unknown status: ".concat(String.valueOf(zzd)));
                        }
                        i = 5;
                    }
                    zze3.zze(i);
                    zze3.zzc(zzc(zze2.zzh("keyId")));
                    String zzd2 = zze2.zzh("outputPrefixType").zzd();
                    switch (zzd2.hashCode()) {
                        case -2053249079:
                            if (zzd2.equals("LEGACY")) {
                                c2 = 2;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 80904:
                            if (zzd2.equals("RAW")) {
                                c2 = 1;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 2575090:
                            if (zzd2.equals("TINK")) {
                                c2 = 0;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1761684556:
                            if (zzd2.equals("CRUNCHY")) {
                                c2 = 3;
                                break;
                            }
                            c2 = 65535;
                            break;
                        default:
                            c2 = 65535;
                            break;
                    }
                    if (c2 == 0) {
                        zzhtbVar = zzhtb.TINK;
                    } else if (c2 == 1) {
                        zzhtbVar = zzhtb.RAW;
                    } else if (c2 == 2) {
                        zzhtbVar = zzhtb.LEGACY;
                    } else {
                        if (c2 != 3) {
                            String.valueOf(zzd2);
                            throw new zziaw("unknown output prefix type: ".concat(String.valueOf(zzd2)));
                        }
                        zzhtbVar = zzhtb.CRUNCHY;
                    }
                    zze3.zzd(zzhtbVar);
                    zziav zze4 = zzh3.zze();
                    if (!zze4.zzc("typeUrl") || !zze4.zzc("value") || !zze4.zzc("keyMaterialType")) {
                        throw new zziaw("invalid keyData");
                    }
                    byte[] zza2 = zzhyx.zza(zze4.zzh("value").zzd(), 2);
                    zzhsd zzd3 = zzhsf.zzd();
                    zzd3.zza(zze4.zzh("typeUrl").zzd());
                    zzicn zzicnVar = zzicn.zza;
                    zzd3.zzb(zzicn.zzt(zza2, 0, zza2.length));
                    String zzd4 = zze4.zzh("keyMaterialType").zzd();
                    switch (zzd4.hashCode()) {
                        case -1881281466:
                            if (zzd4.equals("REMOTE")) {
                                c3 = 3;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -1609477353:
                            if (zzd4.equals("SYMMETRIC")) {
                                c3 = 0;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 249237018:
                            if (zzd4.equals("ASYMMETRIC_PRIVATE")) {
                                c3 = 1;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 1534613202:
                            if (zzd4.equals("ASYMMETRIC_PUBLIC")) {
                                c3 = 2;
                                break;
                            }
                            c3 = 65535;
                            break;
                        default:
                            c3 = 65535;
                            break;
                    }
                    if (c3 == 0) {
                        zzhseVar = zzhse.SYMMETRIC;
                    } else if (c3 == 1) {
                        zzhseVar = zzhse.ASYMMETRIC_PRIVATE;
                    } else if (c3 == 2) {
                        zzhseVar = zzhse.ASYMMETRIC_PUBLIC;
                    } else {
                        if (c3 != 3) {
                            String.valueOf(zzd4);
                            throw new zziaw("unknown key material type: ".concat(String.valueOf(zzd4)));
                        }
                        zzhseVar = zzhse.REMOTE;
                    }
                    zzd3.zzc(zzhseVar);
                    zze3.zza((zzhsf) zzd3.zzbu());
                    zzh2.zzb((zzhsn) zze3.zzbu());
                    i3 = i4 + 1;
                    str = str3;
                    str2 = str4;
                }
                return (zzhso) zzh2.zzbu();
            } finally {
                this.zzb.close();
            }
        } catch (zziaw | IllegalStateException e) {
            throw new IOException(e);
        }
    }
}
