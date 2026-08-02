package com.socure.idplus.device.internal;

import com.socure.idplus.device.callback.SessionTokenCallback;
import com.socure.idplus.device.error.SigmaDeviceError;
import com.socure.idplus.device.internal.input.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes8.dex */
public final class i extends Lambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f858a;
    public final /* synthetic */ SessionTokenCallback b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, SessionTokenCallback sessionTokenCallback) {
        super(2);
        this.f858a = jVar;
        this.b = sessionTokenCallback;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        SigmaDeviceError sigmaDeviceError = (SigmaDeviceError) obj;
        String socureSigmaDeviceErrorMessage = (String) obj2;
        Intrinsics.checkNotNullParameter(sigmaDeviceError, "sigmaDeviceError");
        Intrinsics.checkNotNullParameter(socureSigmaDeviceErrorMessage, "socureSigmaDeviceErrorMessage");
        this.f858a.h.b();
        k kVar = this.f858a.d;
        kVar.c = false;
        kVar.f861a.clear();
        SessionTokenCallback sessionTokenCallback = this.b;
        if (sessionTokenCallback != null) {
            sessionTokenCallback.onError(sigmaDeviceError, socureSigmaDeviceErrorMessage);
        } else {
            this.f858a.c.onError(sigmaDeviceError, socureSigmaDeviceErrorMessage);
        }
        return Unit.INSTANCE;
    }
}
