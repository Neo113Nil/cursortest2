package com.socure.idplus.device.internal;

import com.socure.idplus.device.callback.SessionTokenCallback;
import com.socure.idplus.device.error.SigmaDeviceError;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class b implements SessionTokenCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f842a;

    public b(j jVar) {
        this.f842a = jVar;
    }

    @Override // com.socure.idplus.device.callback.SessionTokenCallback
    public final void onComplete(String sessionToken) {
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        this.f842a.c.onSessionCreated(sessionToken);
    }

    @Override // com.socure.idplus.device.callback.DeviceIntelligenceCallback
    public final void onError(SigmaDeviceError errorType, String str) {
        Intrinsics.checkNotNullParameter(errorType, "errorType");
        this.f842a.c.onError(errorType, str);
    }
}
