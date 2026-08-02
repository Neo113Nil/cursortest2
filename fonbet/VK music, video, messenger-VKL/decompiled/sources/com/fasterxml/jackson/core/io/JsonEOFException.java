package com.fasterxml.jackson.core.io;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonToken;
import xsna.qj90;

/* loaded from: classes12.dex */
public class JsonEOFException extends JsonParseException {
    private static final long serialVersionUID = 1;
    protected final JsonToken _token;

    public JsonEOFException(qj90 qj90Var, JsonToken jsonToken, String str) {
        super(qj90Var, str);
        this._token = jsonToken;
    }
}
