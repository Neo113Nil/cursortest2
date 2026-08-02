package com.google.android.gms.internal.mlkit_common;

import androidx.annotation.NonNull;
import com.google.firebase.encoders.EncodingException;
import java.util.HashMap;
import java.util.Map;
import xsna.cjp;
import xsna.mp70;
import xsna.np70;
import xsna.tjr0;

/* compiled from: com.google.mlkit:common@@18.7.0 */
/* loaded from: classes12.dex */
public final class zzbs implements cjp {
    public static final /* synthetic */ int zza = 0;
    private static final mp70 zzb = new mp70() { // from class: com.google.android.gms.internal.mlkit_common.zzbr
        @Override // xsna.wip
        public final void encode(Object obj, np70 np70Var) {
            int i = zzbs.zza;
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

    public final zzbt zza() {
        return new zzbt(new HashMap(this.zzc), new HashMap(this.zzd), this.zze);
    }

    @NonNull
    public final /* bridge */ /* synthetic */ cjp registerEncoder(@NonNull Class cls, @NonNull tjr0 tjr0Var) {
        this.zzd.put(cls, tjr0Var);
        this.zzc.remove(cls);
        return this;
    }
}
