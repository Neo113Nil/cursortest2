package com.google.android.gms.auth.api.signin.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
/* loaded from: classes9.dex */
public class HashAccumulator {
    private int zaa = 1;

    @NonNull
    @KeepForSdk
    public HashAccumulator addObject(Object obj) {
        this.zaa = (this.zaa * 31) + (obj == null ? 0 : obj.hashCode());
        return this;
    }

    @KeepForSdk
    public int hash() {
        return this.zaa;
    }

    @NonNull
    public final HashAccumulator zaa(boolean z11) {
        this.zaa = (this.zaa * 31) + (z11 ? 1 : 0);
        return this;
    }
}
