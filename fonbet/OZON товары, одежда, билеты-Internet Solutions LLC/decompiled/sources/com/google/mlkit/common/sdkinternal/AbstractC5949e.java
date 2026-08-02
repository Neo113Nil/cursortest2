package com.google.mlkit.common.sdkinternal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.HashMap;
import java.util.Map;

@KeepForSdk
/* renamed from: com.google.mlkit.common.sdkinternal.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5949e<K, V> {
    private final Map zza = new HashMap();

    @NonNull
    @KeepForSdk
    protected abstract V create(@NonNull K k11);

    @NonNull
    @KeepForSdk
    public V get(@NonNull K k11) {
        synchronized (this.zza) {
            try {
                if (this.zza.containsKey(k11)) {
                    return (V) this.zza.get(k11);
                }
                V create = create(k11);
                this.zza.put(k11, create);
                return create;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
