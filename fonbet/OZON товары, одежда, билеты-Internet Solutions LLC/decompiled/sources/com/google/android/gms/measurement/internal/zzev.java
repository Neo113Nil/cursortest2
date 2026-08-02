package com.google.android.gms.measurement.internal;

import B0.A0;
import Ij.C3261b;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class zzev {
    protected static final AtomicReference zza = new AtomicReference();
    protected static final AtomicReference zzb = new AtomicReference();
    protected static final AtomicReference zzc = new AtomicReference();
    private final zzeu zzd;

    public zzev(zzeu zzeuVar) {
        this.zzd = zzeuVar;
    }

    private static final String zzg(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        Preconditions.checkNotNull(strArr);
        Preconditions.checkNotNull(strArr2);
        Preconditions.checkNotNull(atomicReference);
        Preconditions.checkArgument(strArr.length == strArr2.length);
        for (int i11 = 0; i11 < strArr.length; i11++) {
            Object obj = strArr[i11];
            if (str == obj || str.equals(obj)) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = (String[]) atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        str2 = strArr3[i11];
                        if (str2 == null) {
                            str2 = strArr2[i11] + "(" + strArr[i11] + ")";
                            strArr3[i11] = str2;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    protected final String zza(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder e11 = C3261b.e("[");
        for (Object obj : objArr) {
            String zzb2 = obj instanceof Bundle ? zzb((Bundle) obj) : String.valueOf(obj);
            if (zzb2 != null) {
                if (e11.length() != 1) {
                    e11.append(", ");
                }
                e11.append(zzb2);
            }
        }
        e11.append("]");
        return e11.toString();
    }

    protected final String zzb(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!this.zzd.zza()) {
            return bundle.toString();
        }
        StringBuilder e11 = C3261b.e("Bundle[{");
        for (String str : bundle.keySet()) {
            if (e11.length() != 8) {
                e11.append(", ");
            }
            e11.append(zze(str));
            e11.append("=");
            Object obj = bundle.get(str);
            e11.append(obj instanceof Bundle ? zza(new Object[]{obj}) : obj instanceof Object[] ? zza((Object[]) obj) : obj instanceof ArrayList ? zza(((ArrayList) obj).toArray()) : String.valueOf(obj));
        }
        e11.append("}]");
        return e11.toString();
    }

    protected final String zzc(zzaw zzawVar) {
        if (!this.zzd.zza()) {
            return zzawVar.toString();
        }
        StringBuilder sb2 = new StringBuilder("origin=");
        sb2.append(zzawVar.zzc);
        sb2.append(",name=");
        sb2.append(zzd(zzawVar.zza));
        sb2.append(",params=");
        zzau zzauVar = zzawVar.zzb;
        sb2.append(zzauVar == null ? null : !this.zzd.zza() ? zzauVar.toString() : zzb(zzauVar.zzc()));
        return sb2.toString();
    }

    protected final String zzd(String str) {
        if (str == null) {
            return null;
        }
        return !this.zzd.zza() ? str : zzg(str, zzhh.zzc, zzhh.zza, zza);
    }

    protected final String zze(String str) {
        if (str == null) {
            return null;
        }
        return !this.zzd.zza() ? str : zzg(str, zzhi.zzb, zzhi.zza, zzb);
    }

    protected final String zzf(String str) {
        if (str == null) {
            return null;
        }
        return !this.zzd.zza() ? str : str.startsWith("_exp_") ? A0.b("experiment_id(", str, ")") : zzg(str, zzhj.zzb, zzhj.zza, zzc);
    }
}
