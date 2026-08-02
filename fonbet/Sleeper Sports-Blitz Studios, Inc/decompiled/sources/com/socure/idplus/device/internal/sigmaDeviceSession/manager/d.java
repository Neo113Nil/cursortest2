package com.socure.idplus.device.internal.sigmaDeviceSession.manager;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes8.dex */
public final class d extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final d f888a = new d();

    public d() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((Boolean) obj).booleanValue();
        Intrinsics.checkNotNullParameter("SigmaDeviceSessionManager", "tag");
        Intrinsics.checkNotNullParameter("Successfully posted the Network", "msg");
        com.socure.idplus.device.internal.logger.a aVar = com.socure.idplus.device.internal.logger.a.f870a;
        return Unit.INSTANCE;
    }
}
