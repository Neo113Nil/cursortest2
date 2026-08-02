package io.ably.lib.types;

import io.ably.lib.util.Serialisation;

/* loaded from: classes9.dex */
public class ErrorResponse {
    public ErrorInfo error;

    public static ErrorResponse fromJSON(String str) throws AblyException {
        return (ErrorResponse) Serialisation.gson.fromJson(str, ErrorResponse.class);
    }
}
