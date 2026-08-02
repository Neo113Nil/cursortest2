package com.google.gson;

import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.math.BigDecimal;
import xsna.i0p0;
import xsna.t33;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public abstract class ToNumberPolicy implements i0p0 {
    private static final /* synthetic */ ToNumberPolicy[] $VALUES;
    public static final ToNumberPolicy BIG_DECIMAL;
    public static final ToNumberPolicy DOUBLE;
    public static final ToNumberPolicy LAZILY_PARSED_NUMBER;
    public static final ToNumberPolicy LONG_OR_DOUBLE;

    static {
        ToNumberPolicy toNumberPolicy = new ToNumberPolicy() { // from class: com.google.gson.ToNumberPolicy.a
            @Override // xsna.i0p0
            public final Number a(JsonReader jsonReader) throws IOException {
                return Double.valueOf(jsonReader.nextDouble());
            }
        };
        DOUBLE = toNumberPolicy;
        ToNumberPolicy toNumberPolicy2 = new ToNumberPolicy() { // from class: com.google.gson.ToNumberPolicy.b
            @Override // xsna.i0p0
            public final Number a(JsonReader jsonReader) throws IOException {
                return new LazilyParsedNumber(jsonReader.nextString());
            }
        };
        LAZILY_PARSED_NUMBER = toNumberPolicy2;
        ToNumberPolicy toNumberPolicy3 = new ToNumberPolicy() { // from class: com.google.gson.ToNumberPolicy.c
            @Override // xsna.i0p0
            public final Number a(JsonReader jsonReader) throws IOException, JsonParseException {
                String nextString = jsonReader.nextString();
                try {
                    try {
                        return Long.valueOf(Long.parseLong(nextString));
                    } catch (NumberFormatException unused) {
                        Double valueOf = Double.valueOf(nextString);
                        if (!valueOf.isInfinite()) {
                            if (valueOf.isNaN()) {
                            }
                            return valueOf;
                        }
                        if (!jsonReader.isLenient()) {
                            throw new MalformedJsonException("JSON forbids NaN and infinities: " + valueOf + "; at path " + jsonReader.getPreviousPath());
                        }
                        return valueOf;
                    }
                } catch (NumberFormatException e) {
                    StringBuilder a2 = t33.a("Cannot parse ", nextString, "; at path ");
                    a2.append(jsonReader.getPreviousPath());
                    throw new JsonParseException(a2.toString(), e);
                }
            }
        };
        LONG_OR_DOUBLE = toNumberPolicy3;
        ToNumberPolicy toNumberPolicy4 = new ToNumberPolicy() { // from class: com.google.gson.ToNumberPolicy.d
            @Override // xsna.i0p0
            public final Number a(JsonReader jsonReader) throws IOException {
                String nextString = jsonReader.nextString();
                try {
                    return new BigDecimal(nextString);
                } catch (NumberFormatException e) {
                    StringBuilder a2 = t33.a("Cannot parse ", nextString, "; at path ");
                    a2.append(jsonReader.getPreviousPath());
                    throw new JsonParseException(a2.toString(), e);
                }
            }
        };
        BIG_DECIMAL = toNumberPolicy4;
        $VALUES = new ToNumberPolicy[]{toNumberPolicy, toNumberPolicy2, toNumberPolicy3, toNumberPolicy4};
    }

    public ToNumberPolicy() {
        throw null;
    }

    public static ToNumberPolicy valueOf(String str) {
        return (ToNumberPolicy) Enum.valueOf(ToNumberPolicy.class, str);
    }

    public static ToNumberPolicy[] values() {
        return (ToNumberPolicy[]) $VALUES.clone();
    }
}
