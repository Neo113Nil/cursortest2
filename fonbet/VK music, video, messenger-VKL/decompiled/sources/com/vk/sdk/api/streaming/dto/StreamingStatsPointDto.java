package com.vk.sdk.api.streaming.dto;

import xsna.eq0;
import xsna.pmi0;

/* compiled from: StreamingStatsPointDto.kt */
/* loaded from: classes5.dex */
public final class StreamingStatsPointDto {

    @pmi0("timestamp")
    private final long timestamp;

    @pmi0("value")
    private final int value;

    public StreamingStatsPointDto(long j, int i) {
        this.timestamp = j;
        this.value = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreamingStatsPointDto)) {
            return false;
        }
        StreamingStatsPointDto streamingStatsPointDto = (StreamingStatsPointDto) obj;
        return this.timestamp == streamingStatsPointDto.timestamp && this.value == streamingStatsPointDto.value;
    }

    public final int hashCode() {
        return Integer.hashCode(this.value) + (Long.hashCode(this.timestamp) * 31);
    }

    public final String toString() {
        StringBuilder a = eq0.a(this.value, "StreamingStatsPointDto(timestamp=", ", value=", this.timestamp);
        a.append(")");
        return a.toString();
    }
}
