package com.google.android.gms.internal.fido;

import Ej.b;

/* loaded from: classes9.dex */
public final class zzbm {
    public static int zza(int i11, int i12, String str) {
        String zza;
        if (i11 >= 0 && i11 < i12) {
            return i11;
        }
        if (i11 < 0) {
            zza = zzbo.zza("%s (%s) must not be negative", "index", Integer.valueOf(i11));
        } else {
            if (i12 < 0) {
                throw new IllegalArgumentException(b.a(i12, "negative size: "));
            }
            zza = zzbo.zza("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i11), Integer.valueOf(i12));
        }
        throw new IndexOutOfBoundsException(zza);
    }

    public static int zzb(int i11, int i12, String str) {
        if (i11 < 0 || i11 > i12) {
            throw new IndexOutOfBoundsException(zzg(i11, i12, "index"));
        }
        return i11;
    }

    public static void zzc(boolean z11) {
        if (!z11) {
            throw new IllegalArgumentException();
        }
    }

    public static void zzd(boolean z11, String str, char c11) {
        if (!z11) {
            throw new IllegalArgumentException(zzbo.zza(str, Character.valueOf(c11)));
        }
    }

    public static void zze(int i11, int i12, int i13) {
        if (i11 < 0 || i12 < i11 || i12 > i13) {
            throw new IndexOutOfBoundsException((i11 < 0 || i11 > i13) ? zzg(i11, i13, "start index") : (i12 < 0 || i12 > i13) ? zzg(i12, i13, "end index") : zzbo.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i12), Integer.valueOf(i11)));
        }
    }

    public static void zzf(boolean z11, Object obj) {
        if (!z11) {
            throw new IllegalStateException((String) obj);
        }
    }

    private static String zzg(int i11, int i12, String str) {
        if (i11 < 0) {
            return zzbo.zza("%s (%s) must not be negative", str, Integer.valueOf(i11));
        }
        if (i12 >= 0) {
            return zzbo.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i11), Integer.valueOf(i12));
        }
        throw new IllegalArgumentException(b.a(i12, "negative size: "));
    }
}
