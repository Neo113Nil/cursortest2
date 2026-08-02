package com.google.android.gms.internal.fido;

import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.ironsource.X3;
import xsna.h5s;
import xsna.ho8;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes12.dex */
public class zzdk {
    private final String zza;
    private final Class zzb;
    private final boolean zzc;

    public zzdk(String str, Class cls, boolean z) {
        this(str, cls, z, true);
    }

    public static zzdk zza(String str, Class cls) {
        return new zzdk(str, cls, false, false);
    }

    public final String toString() {
        Class cls = this.zzb;
        String name = getClass().getName();
        return h5s.d(ho8.b(name, DomExceptionUtils.SEPARATOR), this.zza, X3.j.d, cls.getName(), X3.j.e);
    }

    public final boolean zzb() {
        return this.zzc;
    }

    private zzdk(String str, Class cls, boolean z, boolean z2) {
        zzfk.zzb(str);
        this.zza = str;
        this.zzb = cls;
        this.zzc = z;
        System.identityHashCode(this);
        for (int i = 0; i < 5; i++) {
        }
    }
}
