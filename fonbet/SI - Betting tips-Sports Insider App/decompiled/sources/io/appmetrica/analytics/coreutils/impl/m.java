package io.appmetrica.analytics.coreutils.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ActivationBarrierCallback f11689a;

    public m(ActivationBarrierCallback activationBarrierCallback) {
        this.f11689a = activationBarrierCallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11689a.onWaitFinished();
    }
}
