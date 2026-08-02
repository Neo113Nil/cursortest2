package com.socure.idplus.device.internal.sigmaDeviceSession.manager;

import com.socure.idplus.device.callback.SessionTokenCallback;
import com.socure.idplus.device.error.SigmaDeviceError;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes8.dex */
public final class b extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SessionTokenCallback f886a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(SessionTokenCallback sessionTokenCallback) {
        super(1);
        this.f886a = sessionTokenCallback;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        com.socure.idplus.device.internal.network.a dataError = (com.socure.idplus.device.internal.network.a) obj;
        Intrinsics.checkNotNullParameter(dataError, "dataError");
        SessionTokenCallback sessionTokenCallback = this.f886a;
        if (sessionTokenCallback != null) {
            sessionTokenCallback.onError(SigmaDeviceError.DataFetchError, dataError.c);
        }
        return Unit.INSTANCE;
    }
}
