package com.google.gson;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.MalformedJsonException;
import g.C6594f;
import java.io.IOException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public abstract class r implements s {
    private static final /* synthetic */ r[] $VALUES;
    public static final r BIG_DECIMAL;
    public static final r DOUBLE;
    public static final r LAZILY_PARSED_NUMBER;
    public static final r LONG_OR_DOUBLE;

    static {
        r rVar = new r() { // from class: com.google.gson.r.a
            @Override // com.google.gson.s
            public final Number a(JsonReader jsonReader) throws IOException {
                return Double.valueOf(jsonReader.nextDouble());
            }
        };
        DOUBLE = rVar;
        r rVar2 = new r() { // from class: com.google.gson.r.b
            @Override // com.google.gson.s
            public final Number a(JsonReader jsonReader) throws IOException {
                return new com.google.gson.internal.k(jsonReader.nextString());
            }
        };
        LAZILY_PARSED_NUMBER = rVar2;
        r rVar3 = new r() { // from class: com.google.gson.r.c
            private static Double b(JsonReader jsonReader, String str) throws IOException {
                try {
                    Double valueOf = Double.valueOf(str);
                    if (!valueOf.isInfinite()) {
                        if (valueOf.isNaN()) {
                        }
                        return valueOf;
                    }
                    if (!jsonReader.isLenient()) {
                        throw new MalformedJsonException("JSON forbids NaN and infinities: " + valueOf + "; at path " + jsonReader.getPreviousPath());
                    }
                    return valueOf;
                } catch (NumberFormatException e11) {
                    StringBuilder b11 = C6594f.b("Cannot parse ", str, "; at path ");
                    b11.append(jsonReader.getPreviousPath());
                    throw new l(b11.toString(), e11);
                }
            }

            @Override // com.google.gson.s
            public final Number a(JsonReader jsonReader) throws IOException, l {
                String nextString = jsonReader.nextString();
                if (nextString.indexOf(46) >= 0) {
                    return b(jsonReader, nextString);
                }
                try {
                    return Long.valueOf(Long.parseLong(nextString));
                } catch (NumberFormatException unused) {
                    return b(jsonReader, nextString);
                }
            }
        };
        LONG_OR_DOUBLE = rVar3;
        r rVar4 = new r() { // from class: com.google.gson.r.d
            @Override // com.google.gson.s
            public final Number a(JsonReader jsonReader) throws IOException {
                String nextString = jsonReader.nextString();
                try {
                    return com.google.gson.internal.n.b(nextString);
                } catch (NumberFormatException e11) {
                    StringBuilder b11 = C6594f.b("Cannot parse ", nextString, "; at path ");
                    b11.append(jsonReader.getPreviousPath());
                    throw new l(b11.toString(), e11);
                }
            }
        };
        BIG_DECIMAL = rVar4;
        $VALUES = new r[]{rVar, rVar2, rVar3, rVar4};
    }

    private r() {
        throw null;
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) $VALUES.clone();
    }
}
