package com.google.android.gms.internal.mlkit_vision_common;

import androidx.annotation.NonNull;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;
import r8.d;

/* loaded from: classes9.dex */
public final class zzan {
    private final Map zza;
    private final Map zzb;
    private final d zzc;

    zzan(Map map, Map map2, d dVar) {
        this.zza = map;
        this.zzb = map2;
        this.zzc = dVar;
    }

    @NonNull
    public final byte[] zza(@NonNull Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new zzak(byteArrayOutputStream, this.zza, this.zzb, this.zzc).zzf(obj);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
