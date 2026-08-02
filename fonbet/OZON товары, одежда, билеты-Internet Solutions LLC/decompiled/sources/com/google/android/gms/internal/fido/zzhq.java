package com.google.android.gms.internal.fido;

import Sh.b;
import com.google.protobuf.DescriptorProtos$FileOptions;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import java.io.IOException;
import java.io.InputStream;
import java.util.TreeMap;

/* loaded from: classes9.dex */
final class zzhq {
    static final zzhp zza(InputStream inputStream, zzhs zzhsVar) throws zzhj {
        try {
            return zzb(inputStream, zzhsVar);
        } finally {
            try {
                zzhsVar.close();
            } catch (IOException unused) {
            }
        }
    }

    private static final zzhp zzb(InputStream inputStream, zzhs zzhsVar) throws zzhj {
        try {
            zzhr zzd = zzhsVar.zzd();
            if (zzd == null) {
                throw new zzhj("Parser being asked to parse an empty input stream");
            }
            try {
                byte zza = zzd.zza();
                byte zzb = zzd.zzb();
                int i11 = 0;
                if (zzb == Byte.MIN_VALUE) {
                    long zza2 = zzhsVar.zza();
                    if (zza2 > 1000) {
                        throw new zzhj("Parser being asked to read a large CBOR array");
                    }
                    zzc(zza, zza2, inputStream, zzhsVar);
                    zzhp[] zzhpVarArr = new zzhp[(int) zza2];
                    while (i11 < zza2) {
                        zzhpVarArr[i11] = zzb(inputStream, zzhsVar);
                        i11++;
                    }
                    return new zzhg(zzcc.zzi(zzhpVarArr));
                }
                if (zzb != -96) {
                    if (zzb == -64) {
                        throw new zzhj("Tags are currently unsupported");
                    }
                    if (zzb == -32) {
                        return new zzhh(zzhsVar.zzf());
                    }
                    if (zzb == 0 || zzb == 32) {
                        long zzb2 = zzhsVar.zzb();
                        zzc(zza, zzb2 > 0 ? zzb2 : ~zzb2, inputStream, zzhsVar);
                        return new zzhk(zzb2);
                    }
                    if (zzb == 64) {
                        byte[] zzg = zzhsVar.zzg();
                        int length = zzg.length;
                        zzc(zza, length, inputStream, zzhsVar);
                        return new zzhi(zzgx.zzl(zzg, 0, length));
                    }
                    if (zzb == 96) {
                        String zze = zzhsVar.zze();
                        zzc(zza, zze.length(), inputStream, zzhsVar);
                        return new zzhn(zze);
                    }
                    throw new zzhj("Unidentifiable major type: " + zzd.zzc());
                }
                long zzc = zzhsVar.zzc();
                if (zzc > 1000) {
                    throw new zzhj("Parser being asked to read a large CBOR map");
                }
                zzc(zza, zzc, inputStream, zzhsVar);
                int i12 = (int) zzc;
                zzhl[] zzhlVarArr = new zzhl[i12];
                zzhp zzhpVar = null;
                int i13 = 0;
                while (i13 < zzc) {
                    zzhp zzb3 = zzb(inputStream, zzhsVar);
                    if (zzhpVar != null && zzb3.compareTo(zzhpVar) <= 0) {
                        throw new zzhf("Keys in CBOR Map not in strictly ascending natural order:\nPrevious key: " + zzhpVar.toString() + "\nCurrent key: " + zzb3.toString());
                    }
                    zzhlVarArr[i13] = new zzhl(zzb3, zzb(inputStream, zzhsVar));
                    i13++;
                    zzhpVar = zzb3;
                }
                TreeMap treeMap = new TreeMap();
                while (i11 < i12) {
                    zzhl zzhlVar = zzhlVarArr[i11];
                    if (treeMap.containsKey(zzhlVar.zza())) {
                        throw new zzhf("Attempted to add duplicate key to canonical CBOR Map.");
                    }
                    treeMap.put(zzhlVar.zza(), zzhlVar.zzb());
                    i11++;
                }
                return new zzhm(zzcj.zzf(treeMap));
            } catch (IOException e11) {
                e = e11;
                throw new zzhj("Error in decoding CborValue from bytes", e);
            } catch (RuntimeException e12) {
                e = e12;
                throw new zzhj("Error in decoding CborValue from bytes", e);
            }
        } catch (IOException e13) {
            throw new zzhj("Error in decoding CborValue from bytes", e13);
        }
    }

    private static final void zzc(byte b11, long j11, InputStream inputStream, zzhs zzhsVar) throws IOException {
        switch (b11) {
            case 24:
                if (j11 < 24) {
                    throw new zzhf(b.b(j11, "Integer value ", " after add info could have been represented in 0 additional bytes, but used 1"));
                }
                return;
            case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                if (j11 < 256) {
                    throw new zzhf(b.b(j11, "Integer value ", " after add info could have been represented in 0-1 additional bytes, but used 2"));
                }
                return;
            case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                if (j11 < 65536) {
                    throw new zzhf(b.b(j11, "Integer value ", " after add info could have been represented in 0-2 additional bytes, but used 4"));
                }
                return;
            case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                if (j11 < 4294967296L) {
                    throw new zzhf(b.b(j11, "Integer value ", " after add info could have been represented in 0-4 additional bytes, but used 8"));
                }
                return;
            default:
                return;
        }
    }
}
