package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes2.dex */
public final class zzahh {
    public static int zza(int i) {
        int i2 = 0;
        while (i > 0) {
            i >>>= 1;
            i2++;
        }
        return i2;
    }

    public static zzahe zzb(zzes zzesVar, boolean z, boolean z2) throws zzat {
        if (z) {
            zzd(3, zzesVar, false);
        }
        String zzK = zzesVar.zzK((int) zzesVar.zzA(), StandardCharsets.UTF_8);
        int length = zzK.length();
        long zzA = zzesVar.zzA();
        String[] strArr = new String[(int) zzA];
        int i = length + 15;
        for (int i2 = 0; i2 < zzA; i2++) {
            String zzK2 = zzesVar.zzK((int) zzesVar.zzA(), StandardCharsets.UTF_8);
            strArr[i2] = zzK2;
            i = i + 4 + zzK2.length();
        }
        if (z2 && (zzesVar.zzs() & 1) == 0) {
            throw zzat.zzb("framing bit expected to be set", null);
        }
        return new zzahe(zzK, strArr, i + 1);
    }

    public static zzap zzc(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            String str2 = zzfk.zza;
            String[] split = str.split("=", 2);
            if (split.length != 2) {
                String.valueOf(str);
                zzef.zzc("VorbisUtil", "Failed to parse Vorbis comment: ".concat(String.valueOf(str)));
            } else if (split[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(zzaiv.zzb(new zzes(Base64.decode(split[1], 0))));
                } catch (RuntimeException e) {
                    zzef.zzd("VorbisUtil", "Failed to parse vorbis picture", e);
                }
            } else {
                arrayList.add(new zzajs(split[0], split[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new zzap(arrayList);
    }

    public static boolean zzd(int i, zzes zzesVar, boolean z) throws zzat {
        if (zzesVar.zzd() < 7) {
            if (z) {
                return false;
            }
            int zzd = zzesVar.zzd();
            StringBuilder sb = new StringBuilder(String.valueOf(zzd).length() + 18);
            sb.append("too short header: ");
            sb.append(zzd);
            throw zzat.zzb(sb.toString(), null);
        }
        if (zzesVar.zzs() != i) {
            if (z) {
                return false;
            }
            String hexString = Integer.toHexString(i);
            String.valueOf(hexString);
            throw zzat.zzb("expected header type ".concat(String.valueOf(hexString)), null);
        }
        if (zzesVar.zzs() == 118 && zzesVar.zzs() == 111 && zzesVar.zzs() == 114 && zzesVar.zzs() == 98 && zzesVar.zzs() == 105 && zzesVar.zzs() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw zzat.zzb("expected characters 'vorbis'", null);
    }
}
