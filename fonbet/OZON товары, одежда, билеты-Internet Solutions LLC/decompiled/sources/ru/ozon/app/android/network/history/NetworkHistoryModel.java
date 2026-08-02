package ru.ozon.app.android.network.history;

import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\n\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/network/history/NetworkHistoryModel;", "", "traceId", "", ImagesContract.URL, "responseTime", "", "time", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;FJ)V", "getTraceId", "()Ljava/lang/String;", "getUrl", "getResponseTime", "()F", "getTime", "()J", "network_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class NetworkHistoryModel {
    private final float responseTime;
    private final long time;

    @NotNull
    private final String traceId;

    @NotNull
    private final String url;

    public NetworkHistoryModel(@NotNull String traceId, @NotNull String url, float f7, long j11) {
        Intrinsics.checkNotNullParameter(traceId, "traceId");
        Intrinsics.checkNotNullParameter(url, "url");
        this.traceId = traceId;
        this.url = url;
        this.responseTime = f7;
        this.time = j11;
    }

    public final float getResponseTime() {
        return this.responseTime;
    }

    public final long getTime() {
        return this.time;
    }

    @NotNull
    public final String getTraceId() {
        return this.traceId;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }
}
