package com.nimbusds.jose.shaded.gson.internal;

import com.nimbusds.jose.shaded.gson.stream.JsonReader;
import java.io.IOException;

/* loaded from: classes8.dex */
public abstract class JsonReaderInternalAccess {
    public static JsonReaderInternalAccess INSTANCE;

    public abstract void promoteNameToValue(JsonReader jsonReader) throws IOException;
}
