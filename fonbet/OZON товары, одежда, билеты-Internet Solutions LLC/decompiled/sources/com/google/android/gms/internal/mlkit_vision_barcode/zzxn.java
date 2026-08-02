package com.google.android.gms.internal.mlkit_vision_barcode;

import android.graphics.Point;
import androidx.annotation.NonNull;
import java.util.Iterator;

/* loaded from: classes9.dex */
public abstract class zzxn {
    public static zzxn zzg(@NonNull Iterable iterable, int i11, int i12, float f7) {
        Iterator it = iterable.iterator();
        int i13 = 0;
        int i14 = i11;
        int i15 = i12;
        int i16 = 0;
        while (it.hasNext()) {
            Point point = (Point) it.next();
            i14 = Math.min(i14, point.x);
            i15 = Math.min(i15, point.y);
            i13 = Math.max(i13, point.x);
            i16 = Math.max(i16, point.y);
        }
        float f11 = i11;
        float f12 = i12;
        return new zzxg((i14 + 0.0f) / f11, (i15 + 0.0f) / f12, (i13 + 0.0f) / f11, (i16 + 0.0f) / f12, 0.0f);
    }

    abstract float zza();

    abstract float zzb();

    abstract float zzc();

    abstract float zzd();

    abstract float zze();

    final float zzf() {
        if (!zzh()) {
            return 0.0f;
        }
        return (zzd() - zze()) * (zzb() - zzc());
    }

    final boolean zzh() {
        return zzc() >= 0.0f && zzc() < zzb() && zzb() <= 1.0f && zze() >= 0.0f && zze() < zzd() && zzd() <= 1.0f;
    }
}
