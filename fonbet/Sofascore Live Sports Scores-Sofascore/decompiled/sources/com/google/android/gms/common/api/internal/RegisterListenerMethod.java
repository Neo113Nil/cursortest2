package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AnyClient;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@KeepForSdk
/* loaded from: classes3.dex */
public abstract class RegisterListenerMethod<A extends Api.AnyClient, L> {
    public final ListenerHolder a;
    public final Feature[] b;
    public final boolean c;
    public final int d;

    public RegisterListenerMethod(ListenerHolder listenerHolder, Feature[] featureArr, boolean z, int i) {
        this.a = listenerHolder;
        this.b = featureArr;
        this.c = z;
        this.d = i;
    }
}
