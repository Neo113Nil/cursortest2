package com.socure.idplus.device.internal.sigmaDeviceSession.manager;

import com.socure.idplus.device.callback.SessionTokenCallback;
import com.socure.idplus.device.error.SigmaDeviceError;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes8.dex */
public final class g extends Lambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f891a;
    public final /* synthetic */ Function2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j jVar, Function2 function2) {
        super(2);
        this.f891a = jVar;
        this.b = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        SigmaDeviceError sigmaDeviceError = (SigmaDeviceError) obj;
        String message = (String) obj2;
        Intrinsics.checkNotNullParameter(sigmaDeviceError, "sigmaDeviceError");
        Intrinsics.checkNotNullParameter(message, "message");
        j jVar = this.f891a;
        jVar.h = null;
        jVar.i = null;
        jVar.f = com.socure.idplus.device.internal.sigmaDeviceSession.a.c;
        Iterator it = new ArrayList(jVar.g).iterator();
        while (it.hasNext()) {
            SessionTokenCallback sessionTokenCallback = (SessionTokenCallback) it.next();
            Intrinsics.checkNotNull(sessionTokenCallback);
            sessionTokenCallback.onError(SigmaDeviceError.DataFetchError, "Unable to fetch session");
        }
        jVar.g.clear();
        this.b.invoke(sigmaDeviceError, message);
        return Unit.INSTANCE;
    }
}
