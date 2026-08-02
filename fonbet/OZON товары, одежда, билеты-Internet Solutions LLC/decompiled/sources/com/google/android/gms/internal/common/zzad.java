package com.google.android.gms.internal.common;

import java.util.Iterator;

/* loaded from: classes9.dex */
public final class zzad extends zzaa {
    public zzad() {
        super(4);
    }

    public final zzad zzb(Object obj) {
        zza(obj);
        return this;
    }

    public final zzad zzc(Iterator it) {
        while (it.hasNext()) {
            zza(it.next());
        }
        return this;
    }

    zzad(int i11) {
        super(4);
    }
}
