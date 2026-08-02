package com.google.android.gms.auth.api.signin.internal;

import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public class HashAccumulator {
    private int zaa = 1;

    @NonNull
    public HashAccumulator addObject(Object obj) {
        this.zaa = (this.zaa * 31) + (obj == null ? 0 : obj.hashCode());
        return this;
    }

    public int hash() {
        return this.zaa;
    }

    @NonNull
    public final HashAccumulator zaa(boolean z10) {
        this.zaa = (this.zaa * 31) + (z10 ? 1 : 0);
        return this;
    }
}
