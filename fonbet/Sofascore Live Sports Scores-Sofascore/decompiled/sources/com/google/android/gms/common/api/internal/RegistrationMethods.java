package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.Preconditions;
import defpackage.gl5;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@KeepForSdk
/* loaded from: classes3.dex */
public class RegistrationMethods<A extends Api.AnyClient, L> {
    public final c a;
    public final d b;
    public final Runnable c;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @KeepForSdk
    public static class Builder<A extends Api.AnyClient, L> {
        public RemoteCall a;
        public RemoteCall b;
        public ListenerHolder d;
        public Feature[] e;
        public int g;
        public gl5 c = gl5.b;
        public boolean f = true;

        private Builder() {
        }

        public final RegistrationMethods a() {
            Preconditions.a("Must set register function", this.a != null);
            Preconditions.a("Must set unregister function", this.b != null);
            Preconditions.a("Must set holder", this.d != null);
            ListenerHolder.ListenerKey listenerKey = this.d.b;
            Preconditions.j(listenerKey, "Key must not be null");
            return new RegistrationMethods(new c(this, this.d, this.e, this.f, this.g), new d(this, listenerKey), this.c);
        }
    }

    public /* synthetic */ RegistrationMethods(c cVar, d dVar, Runnable runnable) {
        this.a = cVar;
        this.b = dVar;
        this.c = runnable;
    }
}
