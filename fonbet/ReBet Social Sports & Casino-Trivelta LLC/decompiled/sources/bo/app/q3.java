package bo.app;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class q3 extends c7 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(q5 dispatchDataProvider) {
        super(c9.f25334d, dispatchDataProvider);
        Intrinsics.checkNotNullParameter(dispatchDataProvider, "dispatchDataProvider");
    }

    @Override // bo.app.c7
    public final void a(long j10) {
        c(j10);
    }

    @Override // bo.app.c7
    public final void a(long j10, id requestInfo, nb apiResponse) {
        Intrinsics.checkNotNullParameter(requestInfo, "requestInfo");
        Intrinsics.checkNotNullParameter(apiResponse, "apiResponse");
        super.a(j10, requestInfo, apiResponse);
        Long l10 = apiResponse.f25582b;
        if (l10 != null) {
            requestInfo.f25572b = l10.longValue() + j10;
            requestInfo.a(j10, jd.f25624b);
            d9 d9Var = requestInfo.f25571a;
            y3 y3Var = d9Var instanceof y3 ? (y3) d9Var : null;
            if (y3Var != null) {
                y3Var.f26316n = requestInfo.f25578h;
            }
        }
    }
}
