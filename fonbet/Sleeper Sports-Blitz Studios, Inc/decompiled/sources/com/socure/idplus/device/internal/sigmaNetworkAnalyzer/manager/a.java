package com.socure.idplus.device.internal.sigmaNetworkAnalyzer.manager;

import com.socure.idplus.device.internal.sigmaDeviceSession.manager.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;

/* loaded from: classes8.dex */
public final class a implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f896a;

    public a(d dVar) {
        this.f896a = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ResponseBody responseBody = (ResponseBody) obj;
        Intrinsics.checkNotNullParameter(responseBody, "responseBody");
        this.f896a.invoke(Boolean.TRUE);
        return Unit.INSTANCE;
    }
}
