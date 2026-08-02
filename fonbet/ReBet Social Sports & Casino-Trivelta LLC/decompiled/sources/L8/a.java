package L8;

import com.giphy.sdk.core.network.response.ErrorResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final ErrorResponse f7086a;

    public a(ErrorResponse errorResponse) {
        Intrinsics.checkNotNullParameter(errorResponse, "errorResponse");
        this.f7086a = errorResponse;
    }

    public final ErrorResponse a() {
        return this.f7086a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String detailMessage, ErrorResponse errorResponse) {
        super(detailMessage);
        Intrinsics.checkNotNullParameter(detailMessage, "detailMessage");
        Intrinsics.checkNotNullParameter(errorResponse, "errorResponse");
        this.f7086a = errorResponse;
    }
}
