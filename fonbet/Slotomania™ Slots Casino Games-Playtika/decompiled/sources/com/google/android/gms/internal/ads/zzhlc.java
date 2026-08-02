package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayDeque;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
final class zzhlc extends zziaz {
    public static final zziat zza(zzibq zzibqVar) throws IOException {
        String str;
        int zzm = zzibqVar.zzm();
        zziat zzc = zzc(zzibqVar, zzm);
        if (zzc == null) {
            return zzb(zzibqVar, zzm);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (zzibqVar.zzf()) {
                if (zzc instanceof zziav) {
                    str = zzibqVar.zzh();
                    if (!zzhle.zza(str)) {
                        throw new IOException("illegal characters in string");
                    }
                } else {
                    str = null;
                }
                int zzm2 = zzibqVar.zzm();
                zziat zzc2 = zzc(zzibqVar, zzm2);
                zziat zzb = zzc2 == null ? zzb(zzibqVar, zzm2) : zzc2;
                if (zzc instanceof zzias) {
                    ((zzias) zzc).zza(zzb);
                } else {
                    zziav zziavVar = (zziav) zzc;
                    if (zziavVar.zzc(str)) {
                        String.valueOf(str);
                        throw new IOException("duplicate key: ".concat(String.valueOf(str)));
                    }
                    zziavVar.zza(str, zzb);
                }
                if (zzc2 != null) {
                    arrayDeque.addLast(zzc);
                    if (arrayDeque.size() > 100) {
                        throw new IOException("too many recursions");
                    }
                    zzc = zzb;
                } else {
                    continue;
                }
            } else {
                if (zzc instanceof zzias) {
                    zzibqVar.zzc();
                } else {
                    zzibqVar.zze();
                }
                if (arrayDeque.isEmpty()) {
                    return zzc;
                }
                zzc = (zziat) arrayDeque.removeLast();
            }
        }
    }

    private static final zziat zzb(zzibq zzibqVar, int i) throws IOException {
        int i2 = i - 1;
        if (i2 == 5) {
            String zzi = zzibqVar.zzi();
            if (zzhle.zza(zzi)) {
                return new zziax(zzi);
            }
            throw new IOException("illegal characters in string");
        }
        if (i2 == 6) {
            return new zziax(new zzhld(zzibqVar.zzi()));
        }
        if (i2 == 7) {
            return new zziax(Boolean.valueOf(zzibqVar.zzj()));
        }
        if (i2 != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(zzibr.zza(i)));
        }
        zzibqVar.zzk();
        return zziau.zza;
    }

    @Nullable
    private static final zziat zzc(zzibq zzibqVar, int i) throws IOException {
        int i2 = i - 1;
        if (i2 == 0) {
            zzibqVar.zzb();
            return new zzias();
        }
        if (i2 != 2) {
            return null;
        }
        zzibqVar.zzd();
        return new zziav();
    }
}
