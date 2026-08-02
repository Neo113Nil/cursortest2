package com.socure.idplus.device.internal.behavior.manager;

import com.socure.idplus.device.error.SigmaDeviceError;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes8.dex */
public final class e extends Lambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public static final e f849a = new e();

    public e() {
        super(2);
    }

    public static void a(SigmaDeviceError sigmaDeviceError, String socureSigmaDeviceErrorMessage) {
        Intrinsics.checkNotNullParameter(sigmaDeviceError, "sigmaDeviceError");
        Intrinsics.checkNotNullParameter(socureSigmaDeviceErrorMessage, "socureSigmaDeviceErrorMessage");
        com.socure.idplus.device.internal.logger.b.a("DeviceBehaviorManager", "Error uploading location data: " + sigmaDeviceError + ", " + socureSigmaDeviceErrorMessage);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((SigmaDeviceError) obj, (String) obj2);
        return Unit.INSTANCE;
    }
}
