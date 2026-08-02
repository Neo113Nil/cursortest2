package com.google.android.gms.internal.gtm;

import I0.C3173b;
import Nh.a;
import java.util.Collections;
import java.util.List;

/* loaded from: classes9.dex */
public final class zzqm {
    private final List<zzqj> zza;
    private final List<zzqj> zzb;
    private final List<zzqj> zzc;
    private final List<zzqj> zzd;

    /* synthetic */ zzqm(List list, List list2, List list3, List list4, zzql zzqlVar) {
        this.zza = Collections.unmodifiableList(list);
        this.zzb = Collections.unmodifiableList(list2);
        this.zzc = Collections.unmodifiableList(list3);
        this.zzd = Collections.unmodifiableList(list4);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zza);
        String valueOf2 = String.valueOf(this.zzb);
        String valueOf3 = String.valueOf(this.zzc);
        String valueOf4 = String.valueOf(this.zzd);
        int length = valueOf.length();
        int length2 = valueOf2.length();
        StringBuilder sb2 = new StringBuilder(length + 71 + length2 + valueOf3.length() + valueOf4.length());
        a.h(sb2, "Positive predicates: ", valueOf, "  Negative predicates: ", valueOf2);
        return C3173b.c(sb2, "  Add tags: ", valueOf3, "  Remove tags: ", valueOf4);
    }

    public final List<zzqj> zza() {
        return this.zzc;
    }

    public final List<zzqj> zzb() {
        return this.zzb;
    }

    public final List<zzqj> zzc() {
        return this.zza;
    }

    public final List<zzqj> zzd() {
        return this.zzd;
    }
}
