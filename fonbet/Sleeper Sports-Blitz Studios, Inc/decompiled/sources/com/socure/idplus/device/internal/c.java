package com.socure.idplus.device.internal;

import com.socure.idplus.device.callback.SessionTokenCallback;
import com.socure.idplus.device.internal.sigmaDeviceConfig.model.SigmaDeviceConfigResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes8.dex */
public final class c extends Lambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SessionTokenCallback f852a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(SessionTokenCallback sessionTokenCallback) {
        super(2);
        this.f852a = sessionTokenCallback;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        com.socure.idplus.device.internal.sigmaDeviceSession.b sessionTokenTuple = (com.socure.idplus.device.internal.sigmaDeviceSession.b) obj;
        Intrinsics.checkNotNullParameter(sessionTokenTuple, "sessionTokenTuple");
        Intrinsics.checkNotNullParameter((SigmaDeviceConfigResponse) obj2, "<anonymous parameter 1>");
        this.f852a.onComplete(sessionTokenTuple.f882a);
        return Unit.INSTANCE;
    }
}
