package com.socure.idplus.device.internal;

import com.socure.idplus.device.callback.SessionTokenCallback;
import com.socure.idplus.device.error.SigmaDeviceError;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes8.dex */
public final class d extends Lambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SessionTokenCallback f853a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(SessionTokenCallback sessionTokenCallback) {
        super(2);
        this.f853a = sessionTokenCallback;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        SigmaDeviceError sigmaDeviceError = (SigmaDeviceError) obj;
        String socureErrorMessage = (String) obj2;
        Intrinsics.checkNotNullParameter(sigmaDeviceError, "sigmaDeviceError");
        Intrinsics.checkNotNullParameter(socureErrorMessage, "socureErrorMessage");
        this.f853a.onError(sigmaDeviceError, socureErrorMessage);
        return Unit.INSTANCE;
    }
}
