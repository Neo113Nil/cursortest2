package ru.ozon.app.android.common.request;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/common/request/RegisterSearchEventRequestParams;", "", "requestId", "", "isPrefetched", "", "<init>", "(Ljava/lang/String;Z)V", "getRequestId", "()Ljava/lang/String;", "()Z", "prefetch_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RegisterSearchEventRequestParams {
    private final boolean isPrefetched;

    @NotNull
    private final String requestId;

    public RegisterSearchEventRequestParams(@NotNull String requestId, boolean z11) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        this.requestId = requestId;
        this.isPrefetched = z11;
    }

    @NotNull
    public final String getRequestId() {
        return this.requestId;
    }

    /* renamed from: isPrefetched, reason: from getter */
    public final boolean getIsPrefetched() {
        return this.isPrefetched;
    }
}
