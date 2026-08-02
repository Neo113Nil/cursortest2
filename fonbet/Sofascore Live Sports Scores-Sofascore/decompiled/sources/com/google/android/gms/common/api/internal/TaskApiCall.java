package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@KeepForSdk
/* loaded from: classes3.dex */
public abstract class TaskApiCall<A extends Api.AnyClient, ResultT> {
    public final Feature[] a;
    public final boolean b;
    public final int c;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @KeepForSdk
    public static class Builder<A extends Api.AnyClient, ResultT> {
        public RemoteCall a;
        public Feature[] c;
        public boolean b = true;
        public int d = 0;

        private Builder() {
        }

        public final e a() {
            Preconditions.a("execute parameter required", this.a != null);
            return new e(this, this.c, this.b, this.d);
        }
    }

    public TaskApiCall(Feature[] featureArr, boolean z, int i) {
        this.a = featureArr;
        boolean z2 = false;
        if (featureArr != null && z) {
            z2 = true;
        }
        this.b = z2;
        this.c = i;
    }

    public static Builder a() {
        Builder builder = new Builder();
        builder.b = true;
        builder.d = 0;
        return builder;
    }

    @KeepForSdk
    @Deprecated
    public TaskApiCall() {
        this.a = null;
        this.b = false;
        this.c = 0;
    }
}
