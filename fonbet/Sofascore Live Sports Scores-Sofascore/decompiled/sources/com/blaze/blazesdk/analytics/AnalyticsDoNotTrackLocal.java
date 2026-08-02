package com.blaze.blazesdk.analytics;

import androidx.annotation.Keep;
import defpackage.lnb;
import defpackage.o6a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001b"}, d2 = {"Lcom/blaze/blazesdk/analytics/AnalyticsDoNotTrackLocal;", "", "id", "", "request", "", "response", "eventType", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()J", "getRequest", "()Ljava/lang/String;", "getResponse", "getEventType", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class AnalyticsDoNotTrackLocal {
    public static final int $stable = 0;

    @NotNull
    private final String eventType;
    private final long id;

    @NotNull
    private final String request;

    @Nullable
    private final String response;

    public AnalyticsDoNotTrackLocal(long j, @NotNull String str, @Nullable String str2, @NotNull String str3) {
        str.getClass();
        str3.getClass();
        this.id = j;
        this.request = str;
        this.response = str2;
        this.eventType = str3;
    }

    public static /* synthetic */ AnalyticsDoNotTrackLocal copy$default(AnalyticsDoNotTrackLocal analyticsDoNotTrackLocal, long j, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            j = analyticsDoNotTrackLocal.id;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            str = analyticsDoNotTrackLocal.request;
        }
        String str4 = str;
        if ((i & 4) != 0) {
            str2 = analyticsDoNotTrackLocal.response;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            str3 = analyticsDoNotTrackLocal.eventType;
        }
        return analyticsDoNotTrackLocal.copy(j2, str4, str5, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getRequest() {
        return this.request;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getResponse() {
        return this.response;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getEventType() {
        return this.eventType;
    }

    @NotNull
    public final AnalyticsDoNotTrackLocal copy(long id, @NotNull String request, @Nullable String response, @NotNull String eventType) {
        request.getClass();
        eventType.getClass();
        return new AnalyticsDoNotTrackLocal(id, request, response, eventType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnalyticsDoNotTrackLocal)) {
            return false;
        }
        AnalyticsDoNotTrackLocal analyticsDoNotTrackLocal = (AnalyticsDoNotTrackLocal) other;
        return this.id == analyticsDoNotTrackLocal.id && Intrinsics.c(this.request, analyticsDoNotTrackLocal.request) && Intrinsics.c(this.response, analyticsDoNotTrackLocal.response) && Intrinsics.c(this.eventType, analyticsDoNotTrackLocal.eventType);
    }

    @NotNull
    public final String getEventType() {
        return this.eventType;
    }

    public final long getId() {
        return this.id;
    }

    @NotNull
    public final String getRequest() {
        return this.request;
    }

    @Nullable
    public final String getResponse() {
        return this.response;
    }

    public int hashCode() {
        int k = o6a.k(this.request, Long.hashCode(this.id) * 31);
        String str = this.response;
        return this.eventType.hashCode() + ((k + (str == null ? 0 : str.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("AnalyticsDoNotTrackLocal(id=");
        sb.append(this.id);
        sb.append(", request=");
        sb.append(this.request);
        sb.append(", response=");
        sb.append(this.response);
        sb.append(", eventType=");
        return lnb.q(sb, this.eventType, ')');
    }

    public /* synthetic */ AnalyticsDoNotTrackLocal(long j, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, str, str2, str3);
    }
}
