package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes5.dex */
public final class zzje extends zzau {
    public final int zzc;
    public final String zzd;
    public final int zze;
    public final zzv zzf;
    public final int zzg;
    public final zzxc zzh;
    final boolean zzi;

    private zzje(int i, Throwable th, int i2) {
        this(i, th, null, i2, null, -1, null, 4, null, false);
    }

    public static zzje zza(IOException iOException, int i) {
        return new zzje(0, iOException, i);
    }

    public static zzje zzb(Throwable th, String str, int i, zzv zzvVar, int i2, zzxc zzxcVar, boolean z, int i3) {
        if (zzvVar == null) {
            i2 = 4;
        }
        return new zzje(1, th, null, i3, str, i, zzvVar, i2, zzxcVar, z);
    }

    public static zzje zzc(RuntimeException runtimeException, int i) {
        return new zzje(2, runtimeException, i);
    }

    final zzje zzd(zzxc zzxcVar) {
        String message = getMessage();
        String str = zzfk.zza;
        return new zzje(message, getCause(), this.zza, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, zzxcVar, this.zzb, this.zzi);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private zzje(int i, Throwable th, String str, int i2, String str2, int i3, zzv zzvVar, int i4, zzxc zzxcVar, boolean z) {
        this(TextUtils.isEmpty(null) ? r0 : r0.concat(": null"), th, i2, i, r5, r6, zzvVar, i4, zzxcVar, SystemClock.elapsedRealtime(), z);
        String str3;
        int i5;
        String str4;
        String str5;
        if (i == 0) {
            str3 = str2;
            i5 = i3;
            str4 = "Source error";
        } else if (i != 1) {
            str4 = "Unexpected runtime error";
            str3 = str2;
            i5 = i3;
        } else {
            String valueOf = String.valueOf(zzvVar);
            String str6 = zzfk.zza;
            if (i4 == 0) {
                str5 = "NO";
            } else if (i4 == 1) {
                str5 = "NO_UNSUPPORTED_SUBTYPE";
            } else if (i4 == 2) {
                str5 = "NO_UNSUPPORTED_DRM";
            } else if (i4 == 3) {
                str5 = "NO_EXCEEDS_CAPABILITIES";
            } else {
                if (i4 != 4) {
                    throw new IllegalStateException();
                }
                str5 = "YES";
            }
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 14 + String.valueOf(i3).length() + 9 + String.valueOf(valueOf).length() + 19 + str5.length());
            str3 = str2;
            sb.append(str3);
            sb.append(" error, index=");
            i5 = i3;
            sb.append(i5);
            sb.append(", format=");
            sb.append(valueOf);
            sb.append(", format_supported=");
            sb.append(str5);
            str4 = sb.toString();
        }
    }

    private zzje(String str, Throwable th, int i, int i2, String str2, int i3, zzv zzvVar, int i4, zzxc zzxcVar, long j, boolean z) {
        super(str, th, i, Bundle.EMPTY, j);
        boolean z2;
        if (!z) {
            z2 = true;
        } else if (i2 == 1) {
            i2 = 1;
            z2 = true;
        } else {
            z2 = false;
        }
        zzgsw.zza(z2);
        zzgsw.zza(th != null);
        this.zzc = i2;
        this.zzd = str2;
        this.zze = i3;
        this.zzf = zzvVar;
        this.zzg = i4;
        this.zzh = zzxcVar;
        this.zzi = z;
    }
}
