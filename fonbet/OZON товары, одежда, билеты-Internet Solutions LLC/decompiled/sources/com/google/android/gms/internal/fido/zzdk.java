package com.google.android.gms.internal.fido;

import E0.C2942q;
import I0.C3173b;

/* loaded from: classes9.dex */
public class zzdk {
    private final String zza;
    private final Class zzb;
    private final boolean zzc;

    protected zzdk(String str, Class cls, boolean z11) {
        this(str, cls, z11, true);
    }

    public static zzdk zza(String str, Class cls) {
        return new zzdk(str, cls, false, false);
    }

    public final String toString() {
        Class cls = this.zzb;
        String name = getClass().getName();
        return C3173b.c(C2942q.e(name, "/"), this.zza, "[", cls.getName(), "]");
    }

    public final boolean zzb() {
        return this.zzc;
    }

    private zzdk(String str, Class cls, boolean z11, boolean z12) {
        zzfk.zzb(str);
        this.zza = str;
        this.zzb = cls;
        this.zzc = z11;
        System.identityHashCode(this);
        for (int i11 = 0; i11 < 5; i11++) {
        }
    }
}
