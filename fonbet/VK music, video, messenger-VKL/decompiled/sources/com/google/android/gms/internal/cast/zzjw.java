package com.google.android.gms.internal.cast;

import java.util.Set;
import java.util.logging.Level;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class zzjw implements zzjp {
    private final String zza;
    private final Level zzb;
    private final Set zzc;
    private final zzjg zzd;
    private final int zze;

    private zzjw(String str, boolean z, int i, Level level, boolean z2, Set set, zzjg zzjgVar) {
        this.zza = "";
        this.zze = 2;
        this.zzb = level;
        this.zzc = set;
        this.zzd = zzjgVar;
    }

    @Override // com.google.android.gms.internal.cast.zzjp
    public final zzix zza(String str) {
        return new zzjy(this.zza, str, true, 2, this.zzb, this.zzc, this.zzd, null);
    }

    public final zzjw zzb(boolean z) {
        Set set = this.zzc;
        zzjg zzjgVar = this.zzd;
        return new zzjw(this.zza, true, 2, Level.OFF, false, set, zzjgVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private zzjw() {
        this("", true, 2, Level.ALL, false, r6, r7);
        Set set;
        zzjg zzjgVar;
        set = zzjy.zzb;
        zzjgVar = zzjy.zzc;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ zzjw(byte[] bArr) {
        this("", true, 2, Level.ALL, false, r6, r7);
        Set set;
        zzjg zzjgVar;
        set = zzjy.zzb;
        zzjgVar = zzjy.zzc;
    }
}
