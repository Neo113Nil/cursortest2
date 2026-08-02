package com.google.crypto.tink.shaded.protobuf;

import java.util.List;

/* loaded from: classes13.dex */
public class UninitializedMessageException extends RuntimeException {
    private static final long serialVersionUID = -7466929953374883507L;
    private final List<String> missingFields;

    public UninitializedMessageException() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.missingFields = null;
    }

    public final InvalidProtocolBufferException d() {
        return new InvalidProtocolBufferException(getMessage());
    }
}
