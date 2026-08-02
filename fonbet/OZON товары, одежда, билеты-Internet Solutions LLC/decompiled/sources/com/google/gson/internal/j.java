package com.google.gson.internal;

import com.google.gson.stream.JsonReader;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class j {
    public static volatile j INSTANCE;

    public abstract void promoteNameToValue(JsonReader jsonReader) throws IOException;
}
