package com.fasterxml.jackson.core.exc;

import com.fasterxml.jackson.core.JsonToken;
import xsna.qj90;

/* loaded from: classes12.dex */
public class InputCoercionException extends StreamReadException {
    private static final long serialVersionUID = 1;
    protected final JsonToken _inputType;
    protected final Class<?> _targetType;

    public InputCoercionException(qj90 qj90Var, String str, JsonToken jsonToken, Class cls) {
        super(qj90Var, str);
        this._inputType = jsonToken;
        this._targetType = cls;
    }
}
