package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.n;
import com.google.gson.r;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.google.gson.t;
import java.io.IOException;

/* loaded from: classes.dex */
public final class NumberTypeAdapter extends TypeAdapter<Number> {

    /* renamed from: b, reason: collision with root package name */
    private static final t f59855b = new NumberTypeAdapter(r.LAZILY_PARSED_NUMBER).new AnonymousClass1();

    /* renamed from: a, reason: collision with root package name */
    private final r f59856a;

    /* renamed from: com.google.gson.internal.bind.NumberTypeAdapter$1, reason: invalid class name */
    class AnonymousClass1 implements t {
        AnonymousClass1() {
        }

        @Override // com.google.gson.t
        public final <T> TypeAdapter<T> create(Gson gson, com.google.gson.reflect.a<T> aVar) {
            if (aVar.getRawType() == Number.class) {
                return NumberTypeAdapter.this;
            }
            return null;
        }
    }

    /* loaded from: classes9.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f59858a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f59858a = iArr;
            try {
                iArr[JsonToken.NULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f59858a[JsonToken.NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f59858a[JsonToken.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private NumberTypeAdapter(r rVar) {
        this.f59856a = rVar;
    }

    public static t a(r rVar) {
        return rVar == r.LAZILY_PARSED_NUMBER ? f59855b : new NumberTypeAdapter(rVar).new AnonymousClass1();
    }

    @Override // com.google.gson.TypeAdapter
    public final Number read(JsonReader jsonReader) throws IOException {
        JsonToken peek = jsonReader.peek();
        int i11 = a.f59858a[peek.ordinal()];
        if (i11 == 1) {
            jsonReader.nextNull();
            return null;
        }
        if (i11 == 2 || i11 == 3) {
            return this.f59856a.a(jsonReader);
        }
        throw new n("Expecting number, got: " + peek + "; at path " + jsonReader.getPath());
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter, Number number) throws IOException {
        jsonWriter.value(number);
    }
}
