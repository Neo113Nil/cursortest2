package com.google.android.gms.internal.mlkit_vision_common;

import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Map;
import r8.b;
import r8.d;
import r8.f;
import s8.InterfaceC9625b;

/* loaded from: classes9.dex */
public final class zzam implements InterfaceC9625b {
    public static final /* synthetic */ int zza = 0;
    private static final d zzb = new d() { // from class: com.google.android.gms.internal.mlkit_vision_common.zzal
        @Override // r8.d
        public final void encode(Object obj, Object obj2) {
            int i11 = zzam.zza;
            throw new b("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    };
    private final Map zzc = new HashMap();
    private final Map zzd = new HashMap();
    private final d zze = zzb;

    @Override // s8.InterfaceC9625b
    @NonNull
    public final /* bridge */ /* synthetic */ InterfaceC9625b registerEncoder(@NonNull Class cls, @NonNull d dVar) {
        this.zzc.put(cls, dVar);
        this.zzd.remove(cls);
        return this;
    }

    public final zzan zza() {
        return new zzan(new HashMap(this.zzc), new HashMap(this.zzd), this.zze);
    }

    @NonNull
    public final /* bridge */ /* synthetic */ InterfaceC9625b registerEncoder(@NonNull Class cls, @NonNull f fVar) {
        this.zzd.put(cls, fVar);
        this.zzc.remove(cls);
        return this;
    }
}
