package com.google.android.gms.internal.mlkit_vision_common;

import androidx.annotation.NonNull;
import com.google.firebase.encoders.EncodingException;
import java.util.HashMap;
import java.util.Map;
import xsna.cjp;
import xsna.mp70;
import xsna.np70;
import xsna.tjr0;

/* compiled from: com.google.mlkit:vision-common@@17.3.0 */
/* loaded from: classes12.dex */
public final class zzam implements cjp {
    public static final /* synthetic */ int zza = 0;
    private static final mp70 zzb = new mp70() { // from class: com.google.android.gms.internal.mlkit_vision_common.zzal
        @Override // xsna.wip
        public final void encode(Object obj, np70 np70Var) {
            int i = zzam.zza;
            throw new EncodingException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    };
    private final Map zzc = new HashMap();
    private final Map zzd = new HashMap();
    private final mp70 zze = zzb;

    @Override // xsna.cjp
    @NonNull
    public final /* bridge */ /* synthetic */ cjp registerEncoder(@NonNull Class cls, @NonNull mp70 mp70Var) {
        this.zzc.put(cls, mp70Var);
        this.zzd.remove(cls);
        return this;
    }

    public final zzan zza() {
        return new zzan(new HashMap(this.zzc), new HashMap(this.zzd), this.zze);
    }

    @NonNull
    public final /* bridge */ /* synthetic */ cjp registerEncoder(@NonNull Class cls, @NonNull tjr0 tjr0Var) {
        this.zzd.put(cls, tjr0Var);
        this.zzc.remove(cls);
        return this;
    }
}
