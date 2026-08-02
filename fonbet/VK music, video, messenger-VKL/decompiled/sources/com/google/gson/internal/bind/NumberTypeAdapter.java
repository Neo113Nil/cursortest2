package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.ToNumberPolicy;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import xsna.i0p0;
import xsna.rtp0;
import xsna.xtp0;

/* loaded from: classes.dex */
public final class NumberTypeAdapter extends TypeAdapter<Number> {
    public static final rtp0 b = d(ToNumberPolicy.LAZILY_PARSED_NUMBER);
    public final i0p0 a;

    /* loaded from: classes13.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            a = iArr;
            try {
                iArr[JsonToken.NULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[JsonToken.NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[JsonToken.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public NumberTypeAdapter(i0p0 i0p0Var) {
        this.a = i0p0Var;
    }

    public static rtp0 d(i0p0 i0p0Var) {
        return new rtp0() { // from class: com.google.gson.internal.bind.NumberTypeAdapter.1
            @Override // xsna.rtp0
            public final <T> TypeAdapter<T> a(Gson gson, xtp0<T> xtp0Var) {
                if (xtp0Var.getRawType() == Number.class) {
                    return NumberTypeAdapter.this;
                }
                return null;
            }
        };
    }

    @Override // com.google.gson.TypeAdapter
    public final Number b(JsonReader jsonReader) throws IOException {
        JsonToken peek = jsonReader.peek();
        int i = a.a[peek.ordinal()];
        if (i == 1) {
            jsonReader.nextNull();
            return null;
        }
        if (i == 2 || i == 3) {
            return this.a.a(jsonReader);
        }
        throw new JsonSyntaxException("Expecting number, got: " + peek + "; at path " + jsonReader.getPath());
    }

    @Override // com.google.gson.TypeAdapter
    public final void c(JsonWriter jsonWriter, Number number) throws IOException {
        jsonWriter.value(number);
    }
}
