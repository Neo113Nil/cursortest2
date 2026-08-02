package com.socure.idplus.device.internal.sigmaDeviceSession.manager;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes8.dex */
public final class e extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final e f889a = new e();

    public e() {
        super(1);
    }

    public static void a(com.socure.idplus.device.internal.network.a dataError) {
        Intrinsics.checkNotNullParameter(dataError, "dataError");
        com.socure.idplus.device.internal.logger.b.b("SigmaDeviceSessionManager", "Error uploading network data with error code: " + dataError.a() + " and message: " + dataError.b());
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((com.socure.idplus.device.internal.network.a) obj);
        return Unit.INSTANCE;
    }
}
