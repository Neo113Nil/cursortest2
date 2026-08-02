package com.squareup.wire.internal;

/* compiled from: JsonFormatter.kt */
/* loaded from: classes14.dex */
public interface JsonFormatter<W> {
    W fromString(String str);

    Object toStringOrNumber(W w);
}
