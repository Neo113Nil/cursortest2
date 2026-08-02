package com.socure.idplus.device.internal.sigmaNetworkAnalyzer.manager;

import com.socure.idplus.device.internal.sigmaDeviceSession.manager.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class b implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f897a;

    public b(e eVar) {
        this.f897a = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        com.socure.idplus.device.internal.network.a dataError = (com.socure.idplus.device.internal.network.a) obj;
        Intrinsics.checkNotNullParameter(dataError, "dataError");
        this.f897a.invoke(dataError);
        return Unit.INSTANCE;
    }
}
