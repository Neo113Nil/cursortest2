package com.google.gson;

/* loaded from: classes13.dex */
public final class JsonSyntaxException extends JsonParseException {
    private static final long serialVersionUID = 1;

    public JsonSyntaxException(String str) {
        super(str);
    }

    public JsonSyntaxException(String str, Exception exc) {
        super(str, exc);
    }

    public JsonSyntaxException(Exception exc) {
        super(exc);
    }
}
