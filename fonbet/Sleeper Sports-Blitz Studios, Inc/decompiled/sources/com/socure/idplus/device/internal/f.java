package com.socure.idplus.device.internal;

import com.socure.idplus.device.error.SigmaDeviceError;
import com.socure.idplus.device.internal.input.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes8.dex */
public final class f extends Lambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f855a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(j jVar) {
        super(2);
        this.f855a = jVar;
    }

    public final void a(SigmaDeviceError sigmaDeviceError, String socureErrorMessage) {
        com.socure.idplus.device.internal.behavior.manager.f fVar;
        k kVar;
        Intrinsics.checkNotNullParameter(sigmaDeviceError, "sigmaDeviceError");
        Intrinsics.checkNotNullParameter(socureErrorMessage, "socureErrorMessage");
        fVar = this.f855a.h;
        fVar.b();
        kVar = this.f855a.d;
        kVar.a();
        com.socure.idplus.device.internal.logger.b.a("SocureInternal", "Error fetching session token: " + sigmaDeviceError + ", " + socureErrorMessage);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((SigmaDeviceError) obj, (String) obj2);
        return Unit.INSTANCE;
    }
}
