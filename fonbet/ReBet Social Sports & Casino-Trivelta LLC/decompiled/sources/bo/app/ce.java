package bo.app;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ce extends c7 {

    /* renamed from: k, reason: collision with root package name */
    public final boolean f25363k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ce(q5 dispatchDataProvider) {
        super(c9.f25344n, dispatchDataProvider);
        Intrinsics.checkNotNullParameter(dispatchDataProvider, "dispatchDataProvider");
        this.f25363k = true;
    }

    @Override // bo.app.c7
    public final void a(long j10) {
    }

    @Override // bo.app.c7
    public final boolean c() {
        return this.f25363k;
    }

    @Override // bo.app.c7
    public final void a(long j10, id requestInfo, j apiResponse) {
        Intrinsics.checkNotNullParameter(requestInfo, "requestInfo");
        Intrinsics.checkNotNullParameter(apiResponse, "apiResponse");
        super.a(j10, requestInfo, apiResponse);
        requestInfo.a(j10, jd.f25627e);
    }
}
