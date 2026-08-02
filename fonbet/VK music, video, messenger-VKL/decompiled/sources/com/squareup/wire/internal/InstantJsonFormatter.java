package com.squareup.wire.internal;

import java.time.Instant;
import java.time.format.DateTimeFormatter;

/* compiled from: InstantJsonFormatter.kt */
/* loaded from: classes14.dex */
public final class InstantJsonFormatter implements JsonFormatter<Instant> {
    public static final InstantJsonFormatter INSTANCE = new InstantJsonFormatter();

    private InstantJsonFormatter() {
    }

    @Override // com.squareup.wire.internal.JsonFormatter
    public Instant fromString(String str) {
        return Instant.from(DateTimeFormatter.ISO_OFFSET_DATE_TIME.parse(str));
    }

    @Override // com.squareup.wire.internal.JsonFormatter
    public Object toStringOrNumber(Instant instant) {
        return DateTimeFormatter.ISO_INSTANT.format(instant);
    }
}
