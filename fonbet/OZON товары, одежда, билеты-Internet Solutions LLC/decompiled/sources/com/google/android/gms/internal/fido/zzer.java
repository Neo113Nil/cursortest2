package com.google.android.gms.internal.fido;

import java.util.Set;
import java.util.logging.Level;

/* loaded from: classes9.dex */
public final class zzer implements zzek {
    private final String zza;
    private final zzdn zzb;
    private final Level zzc;
    private final Set zzd;
    private final zzea zze;

    private zzer(String str, boolean z11, zzdn zzdnVar, Level level, boolean z12, Set set, zzea zzeaVar) {
        this.zza = "";
        this.zzb = zzdnVar;
        this.zzc = level;
        this.zzd = set;
        this.zze = zzeaVar;
    }

    @Override // com.google.android.gms.internal.fido.zzek
    public final zzdp zza(String str) {
        return new zzeu(this.zza, str, true, this.zzb, this.zzc, this.zzd, this.zze, null);
    }

    public final zzer zzb(boolean z11) {
        Set set = this.zzd;
        zzea zzeaVar = this.zze;
        return new zzer(this.zza, true, this.zzb, Level.OFF, false, set, zzeaVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private zzer() {
        this("", true, r3, r4, false, r6, r7);
        Set set;
        zzea zzeaVar;
        zzdo zzdoVar = zzdo.NO_OP;
        Level level = Level.ALL;
        set = zzeu.zza;
        zzeaVar = zzeu.zzb;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    /* synthetic */ zzer(zzeq zzeqVar) {
        this("", true, r3, r4, false, r6, r7);
        Set set;
        zzea zzeaVar;
        zzdo zzdoVar = zzdo.NO_OP;
        Level level = Level.ALL;
        set = zzeu.zza;
        zzeaVar = zzeu.zzb;
    }
}
