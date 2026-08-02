package com.google.android.gms.internal.cast;

import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.ironsource.X3;
import xsna.i5s;
import xsna.n6j;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public class zzit {
    private final String zza;
    private final Class zzb;
    private final boolean zzc;

    public zzit(String str, Class cls, boolean z) {
        this(str, cls, z, true);
    }

    public static zzit zza(String str, Class cls) {
        return new zzit(str, cls, false, false);
    }

    public final String toString() {
        Class cls = this.zzb;
        String name = getClass().getName();
        String name2 = cls.getName();
        int length = name.length();
        int length2 = name2.length();
        String str = this.zza;
        StringBuilder sb = new StringBuilder(str.length() + length + 1 + 1 + length2 + 1);
        n6j.b(sb, name, DomExceptionUtils.SEPARATOR, str, X3.j.d);
        return i5s.a(sb, name2, X3.j.e);
    }

    public final boolean zzb() {
        return this.zzc;
    }

    private zzit(String str, Class cls, boolean z, boolean z2) {
        zzkm.zzb(str);
        this.zza = str;
        this.zzb = cls;
        this.zzc = z;
        System.identityHashCode(this);
        for (int i = 0; i < 5; i++) {
        }
    }
}
