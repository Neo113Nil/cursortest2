package com.socure.idplus.device.internal.sigmaDeviceSession.manager;

import com.socure.idplus.device.error.SigmaDeviceError;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes8.dex */
public final class i extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function2 f893a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(g gVar) {
        super(1);
        this.f893a = gVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        com.socure.idplus.device.internal.network.a error = (com.socure.idplus.device.internal.network.a) obj;
        Intrinsics.checkNotNullParameter(error, "error");
        Function2 function2 = this.f893a;
        SigmaDeviceError sigmaDeviceError = SigmaDeviceError.DataFetchError;
        String str = error.c;
        if (str == null) {
            str = "Unable to create session";
        }
        function2.invoke(sigmaDeviceError, str);
        return Unit.INSTANCE;
    }
}
