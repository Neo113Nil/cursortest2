package com.sofascore.model;

import java.time.Instant;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0082\u0004J\n\u0010\u000f\u001a\u00020\u0010H\u0096\u0080\u0004R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/sofascore/model/DateSection;", "", "timestamp", "", "text", "", "<init>", "(JLjava/lang/String;)V", "getText", "()Ljava/lang/String;", "getTimestamp", "()J", "equals", "", "other", "hashCode", "", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DateSection {

    @Nullable
    private final String text;
    private final long timestamp;

    public DateSection(long j, @Nullable String str) {
        this.text = str;
        this.timestamp = Instant.ofEpochSecond(j).atZone(ZoneId.systemDefault()).truncatedTo(ChronoUnit.DAYS).toEpochSecond();
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DateSection)) {
            return false;
        }
        DateSection dateSection = (DateSection) other;
        return this.timestamp == dateSection.timestamp && Intrinsics.c(this.text, dateSection.text);
    }

    @Nullable
    public final String getText() {
        return this.text;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.timestamp) * 31;
        String str = this.text;
        return hashCode + (str != null ? str.hashCode() : 0);
    }
}
