package com.ironsource;

import com.ironsource.C2571o1;
import com.ironsource.InterfaceC2517l1;
import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.r5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2628r5 {
    private final InterfaceC2642s1 a;

    public C2628r5(InterfaceC2642s1 analytics, String adRequestAdId, Ed adRequestProviderName) {
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(adRequestAdId, "adRequestAdId");
        Intrinsics.checkNotNullParameter(adRequestProviderName, "adRequestProviderName");
        this.a = analytics;
        analytics.a(new C2571o1.s(adRequestProviderName.value()), new C2571o1.b(adRequestAdId));
    }

    public final void a() {
        InterfaceC2517l1.c.a.a().a(this.a);
    }

    public final void a(IronSourceError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        InterfaceC2517l1.c.a.a(new C2571o1.j(error.getErrorCode()), new C2571o1.k(error.getErrorMessage()), new C2571o1.f(0L)).a(this.a);
    }
}
