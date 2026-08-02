package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Objects;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.3.1 */
/* loaded from: classes7.dex */
final class zzdp extends zzcu {
    final transient Object[] zza;

    private zzdp(@CheckForNull Object obj, Object[] objArr, int i) {
        this.zza = objArr;
    }

    static zzdp zzg(int i, Object[] objArr, zzct zzctVar) {
        zzby.zzb(Objects.requireNonNull(objArr[0]), Objects.requireNonNull(objArr[1]));
        return new zzdp(null, objArr, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x001d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e A[RETURN] */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcu, java.util.Map
    @CheckForNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(@CheckForNull Object obj) {
        Object requireNonNull;
        if (obj != null) {
            Object[] objArr = this.zza;
            if (Objects.requireNonNull(objArr[0]).equals(obj)) {
                requireNonNull = Objects.requireNonNull(objArr[1]);
                if (requireNonNull != null) {
                    return null;
                }
                return requireNonNull;
            }
        }
        requireNonNull = null;
        if (requireNonNull != null) {
        }
    }

    @Override // java.util.Map
    public final int size() {
        return 1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcu
    final zzcn zza() {
        return new zzdo(this.zza, 1, 1);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcu
    final zzcv zzd() {
        return new zzdm(this, this.zza, 0, 1);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcu
    final zzcv zze() {
        return new zzdn(this, new zzdo(this.zza, 0, 1));
    }
}
