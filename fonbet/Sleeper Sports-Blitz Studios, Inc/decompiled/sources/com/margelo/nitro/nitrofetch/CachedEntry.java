package com.margelo.nitro.nitrofetch;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import io.sentry.protocol.Response;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FetchCache.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/margelo/nitro/nitrofetch/CachedEntry;", "", Response.TYPE, "Lcom/margelo/nitro/nitrofetch/NitroResponse;", "timestampMs", "", "<init>", "(Lcom/margelo/nitro/nitrofetch/NitroResponse;J)V", "getResponse", "()Lcom/margelo/nitro/nitrofetch/NitroResponse;", "getTimestampMs", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "react-native-nitro-fetch_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class CachedEntry {
    private final NitroResponse response;
    private final long timestampMs;

    public static /* synthetic */ CachedEntry copy$default(CachedEntry cachedEntry, NitroResponse nitroResponse, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            nitroResponse = cachedEntry.response;
        }
        if ((i & 2) != 0) {
            j = cachedEntry.timestampMs;
        }
        return cachedEntry.copy(nitroResponse, j);
    }

    /* renamed from: component1, reason: from getter */
    public final NitroResponse getResponse() {
        return this.response;
    }

    /* renamed from: component2, reason: from getter */
    public final long getTimestampMs() {
        return this.timestampMs;
    }

    public final CachedEntry copy(NitroResponse response, long timestampMs) {
        Intrinsics.checkNotNullParameter(response, "response");
        return new CachedEntry(response, timestampMs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CachedEntry)) {
            return false;
        }
        CachedEntry cachedEntry = (CachedEntry) other;
        return Intrinsics.areEqual(this.response, cachedEntry.response) && this.timestampMs == cachedEntry.timestampMs;
    }

    public int hashCode() {
        return (this.response.hashCode() * 31) + Long.hashCode(this.timestampMs);
    }

    public String toString() {
        return "CachedEntry(response=" + this.response + ", timestampMs=" + this.timestampMs + ")";
    }

    public CachedEntry(NitroResponse response, long j) {
        Intrinsics.checkNotNullParameter(response, "response");
        this.response = response;
        this.timestampMs = j;
    }

    public final NitroResponse getResponse() {
        return this.response;
    }

    public final long getTimestampMs() {
        return this.timestampMs;
    }
}
