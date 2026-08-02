package com.google.android.gms.internal.mlkit_common;

import androidx.annotation.NonNull;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;
import xsna.mp70;

/* compiled from: com.google.mlkit:common@@18.7.0 */
/* loaded from: classes12.dex */
public final class zzbt {
    private final Map zza;
    private final Map zzb;
    private final mp70 zzc;

    public zzbt(Map map, Map map2, mp70 mp70Var) {
        this.zza = map;
        this.zzb = map2;
        this.zzc = mp70Var;
    }

    @NonNull
    public final byte[] zza(@NonNull Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new zzbq(byteArrayOutputStream, this.zza, this.zzb, this.zzc).zzf(obj);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
