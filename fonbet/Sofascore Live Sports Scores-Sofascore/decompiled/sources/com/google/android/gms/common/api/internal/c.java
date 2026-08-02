package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.RegistrationMethods;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class c extends RegisterListenerMethod {
    public final /* synthetic */ RegistrationMethods.Builder e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(RegistrationMethods.Builder builder, ListenerHolder listenerHolder, Feature[] featureArr, boolean z, int i) {
        super(listenerHolder, featureArr, z, i);
        this.e = builder;
    }

    public final void a(Api.AnyClient anyClient, TaskCompletionSource taskCompletionSource) {
        this.e.a.u(anyClient, taskCompletionSource);
    }
}
