package com.ironsource;

import com.ironsource.C2571o1;
import com.ironsource.InterfaceC2517l1;
import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.t5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2664t5 implements Ab {
    private final IronSourceError a;
    private final C2358c3 b;
    private final InterfaceC2642s1 c;

    public C2664t5(IronSourceError error, C2358c3 adLoadTaskListener, InterfaceC2642s1 analytics) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(adLoadTaskListener, "adLoadTaskListener");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        this.a = error;
        this.b = adLoadTaskListener;
        this.c = analytics;
    }

    public final IronSourceError a() {
        return this.a;
    }

    @Override // com.ironsource.Ab
    public void start() {
        InterfaceC2517l1.c.a aVar = InterfaceC2517l1.c.a;
        aVar.a().a(this.c);
        aVar.a(new C2571o1.j(this.a.getErrorCode()), new C2571o1.k(this.a.getErrorMessage()), new C2571o1.f(0L)).a(this.c);
        this.b.b(this.a);
    }
}
