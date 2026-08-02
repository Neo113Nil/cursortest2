package bo.app;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public final n9 f25581a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f25582b;

    public j(d9 request, n9 connectionResult) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(connectionResult, "connectionResult");
        this.f25581a = connectionResult;
        String str = (String) connectionResult.f25806b.get("retry-after");
        this.f25582b = str != null ? com.braze.support.h.a(str) : null;
    }
}
