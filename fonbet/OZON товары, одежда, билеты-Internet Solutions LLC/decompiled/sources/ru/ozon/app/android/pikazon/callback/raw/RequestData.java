package ru.ozon.app.android.pikazon.callback.raw;

import G.g;
import I0.C3173b;
import N3.C3660k;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/pikazon/callback/raw/RequestData;", "", "", "uuid", "originalUrl", "requestUrl", "Lkotlin/time/b;", "startTime", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUuid", "getOriginalUrl", "getRequestUrl", "J", "getStartTime-UwyO8pc", "()J", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class RequestData {

    @NotNull
    private final String originalUrl;

    @NotNull
    private final String requestUrl;
    private final long startTime;

    @NotNull
    private final String uuid;

    public /* synthetic */ RequestData(String str, String str2, String str3, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, j11);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RequestData)) {
            return false;
        }
        RequestData requestData = (RequestData) other;
        return Intrinsics.d(this.uuid, requestData.uuid) && Intrinsics.d(this.originalUrl, requestData.originalUrl) && Intrinsics.d(this.requestUrl, requestData.requestUrl) && b.g(this.startTime, requestData.startTime);
    }

    @NotNull
    public final String getOriginalUrl() {
        return this.originalUrl;
    }

    /* renamed from: getStartTime-UwyO8pc, reason: not valid java name and from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    @NotNull
    public final String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        int a11 = g.a(g.a(this.uuid.hashCode() * 31, 31, this.originalUrl), 31, this.requestUrl);
        long j11 = this.startTime;
        b.Companion companion = b.INSTANCE;
        return Long.hashCode(j11) + a11;
    }

    @NotNull
    public String toString() {
        String str = this.uuid;
        String str2 = this.originalUrl;
        return C3173b.c(C3660k.d("RequestData(uuid=", str, ", originalUrl=", str2, ", requestUrl="), this.requestUrl, ", startTime=", b.p(this.startTime), ")");
    }

    private RequestData(String uuid, String originalUrl, String requestUrl, long j11) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(originalUrl, "originalUrl");
        Intrinsics.checkNotNullParameter(requestUrl, "requestUrl");
        this.uuid = uuid;
        this.originalUrl = originalUrl;
        this.requestUrl = requestUrl;
        this.startTime = j11;
    }
}
