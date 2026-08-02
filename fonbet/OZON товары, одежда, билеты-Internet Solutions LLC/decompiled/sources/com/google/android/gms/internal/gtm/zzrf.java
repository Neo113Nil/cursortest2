package com.google.android.gms.internal.gtm;

import I0.C3173b;
import com.google.android.gms.common.internal.Preconditions;
import java.util.List;

/* loaded from: classes9.dex */
public final class zzrf extends zzqw<String> {
    private final String zzb;
    private final List<zzqw<?>> zzc;

    public zzrf(String str, List<zzqw<?>> list) {
        Preconditions.checkNotNull(str, "Instruction name must be a string.");
        Preconditions.checkNotNull(list);
        this.zzb = str;
        this.zzc = list;
    }

    @Override // com.google.android.gms.internal.gtm.zzqw
    /* renamed from: toString, reason: merged with bridge method [inline-methods] */
    public final String zzc() {
        String str = this.zzb;
        String obj = this.zzc.toString();
        return C3173b.c(new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(obj).length()), "*", str, ": ", obj);
    }

    public final String zzi() {
        return this.zzb;
    }

    public final List<zzqw<?>> zzj() {
        return this.zzc;
    }
}
