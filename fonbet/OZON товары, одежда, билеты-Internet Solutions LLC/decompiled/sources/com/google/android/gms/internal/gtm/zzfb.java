package com.google.android.gms.internal.gtm;

import Ij.C3261b;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Map;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductContainerDTO;

/* loaded from: classes9.dex */
public final class zzfb extends zzbs {
    private static zzfb zza;

    public zzfb(zzbv zzbvVar) {
        super(zzbvVar);
    }

    public static zzfb zza() {
        return zza;
    }

    @VisibleForTesting
    protected static final String zzf(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        if (!(obj instanceof Long)) {
            return obj instanceof Boolean ? String.valueOf(obj) : obj instanceof Throwable ? obj.getClass().getCanonicalName() : "-";
        }
        Long l11 = (Long) obj;
        if (Math.abs(l11.longValue()) < 100) {
            return String.valueOf(obj);
        }
        String str = String.valueOf(obj).charAt(0) != '-' ? "" : "-";
        String valueOf = String.valueOf(Math.abs(l11.longValue()));
        StringBuilder e11 = C3261b.e(str);
        e11.append(Math.round(Math.pow(10.0d, valueOf.length() - 1)));
        e11.append("...");
        e11.append(str);
        e11.append(Math.round(Math.pow(10.0d, valueOf.length()) - 1.0d));
        return e11.toString();
    }

    public final void zzb(zzex zzexVar, String str) {
        zzS(str.length() != 0 ? "Discarding hit. ".concat(str) : new String("Discarding hit. "), zzexVar != null ? zzexVar.toString() : "no hit data");
    }

    public final void zzc(Map<String, String> map, String str) {
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (sb2.length() > 0) {
                sb2.append(',');
            }
            sb2.append(entry.getKey());
            sb2.append('=');
            sb2.append(entry.getValue());
        }
        zzS(str.length() != 0 ? "Discarding hit. ".concat(str) : new String("Discarding hit. "), sb2.toString());
    }

    @Override // com.google.android.gms.internal.gtm.zzbs
    protected final void zzd() {
        synchronized (zzfb.class) {
            zza = this;
        }
    }

    public final synchronized void zze(int i11, String str, Object obj, Object obj2, Object obj3) {
        char c11;
        try {
            Preconditions.checkNotNull(str);
            if (zzw().zzb()) {
                zzw();
                c11 = 'C';
            } else {
                zzw();
                c11 = 'c';
            }
            char charAt = "01VDIWEA?".charAt(i11);
            String str2 = zzbt.zza;
            String zzD = zzbr.zzD(str, zzf(obj), zzf(obj2), zzf(obj3));
            StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 4 + String.valueOf(zzD).length());
            sb2.append("3");
            sb2.append(charAt);
            sb2.append(c11);
            sb2.append(str2);
            sb2.append(ProductContainerDTO.RATIO_DELIMITER);
            sb2.append(zzD);
            String sb3 = sb2.toString();
            if (sb3.length() > 1024) {
                sb3 = sb3.substring(0, UserVerificationMethods.USER_VERIFY_ALL);
            }
            zzfh zzp = zzt().zzp();
            if (zzp != null) {
                zzp.zze().zzc(sb3);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
