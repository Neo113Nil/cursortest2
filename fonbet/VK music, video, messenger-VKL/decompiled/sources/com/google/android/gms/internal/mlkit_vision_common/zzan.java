package com.google.android.gms.internal.mlkit_vision_common;

import androidx.annotation.NonNull;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;
import xsna.mp70;

/* compiled from: com.google.mlkit:vision-common@@17.3.0 */
/* loaded from: classes12.dex */
public final class zzan {
    private final Map zza;
    private final Map zzb;
    private final mp70 zzc;

    public zzan(Map map, Map map2, mp70 mp70Var) {
        this.zza = map;
        this.zzb = map2;
        this.zzc = mp70Var;
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
