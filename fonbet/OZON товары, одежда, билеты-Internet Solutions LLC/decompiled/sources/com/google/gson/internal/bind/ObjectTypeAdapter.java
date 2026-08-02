package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.l;
import com.google.gson.r;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.google.gson.t;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class ObjectTypeAdapter extends TypeAdapter<Object> {

    /* renamed from: c, reason: collision with root package name */
    private static final t f59859c = new AnonymousClass1(r.DOUBLE);

    /* renamed from: a, reason: collision with root package name */
    private final Gson f59860a;

    /* renamed from: b, reason: collision with root package name */
    private final r f59861b;

    /* renamed from: com.google.gson.internal.bind.ObjectTypeAdapter$1, reason: invalid class name */
    class AnonymousClass1 implements t {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ r f59862a;

        AnonymousClass1(r rVar) {
            this.f59862a = rVar;
        }

        @Override // com.google.gson.t
        public final <T> TypeAdapter<T> create(Gson gson, com.google.gson.reflect.a<T> aVar) {
            if (aVar.getRawType() == Object.class) {
                return new ObjectTypeAdapter(gson, this.f59862a);
            }
            return null;
        }
    }

    /* loaded from: classes9.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f59863a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f59863a = iArr;
            try {
                iArr[JsonToken.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f59863a[JsonToken.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f59863a[JsonToken.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f59863a[JsonToken.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f59863a[JsonToken.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f59863a[JsonToken.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    ObjectTypeAdapter(Gson gson, r rVar) {
        this.f59860a = gson;
        this.f59861b = rVar;
    }

    public static t a(r rVar) {
        return rVar == r.DOUBLE ? f59859c : new AnonymousClass1(rVar);
    }

    private Serializable b(JsonReader jsonReader, JsonToken jsonToken) throws IOException {
        int i11 = a.f59863a[jsonToken.ordinal()];
        if (i11 == 3) {
            return jsonReader.nextString();
        }
        if (i11 == 4) {
            return this.f59861b.a(jsonReader);
        }
        if (i11 == 5) {
            return Boolean.valueOf(jsonReader.nextBoolean());
        }
        if (i11 == 6) {
            jsonReader.nextNull();
            return null;
        }
        throw new IllegalStateException("Unexpected token: " + jsonToken);
    }

    private static Serializable c(JsonReader jsonReader, JsonToken jsonToken) throws IOException {
        int i11 = a.f59863a[jsonToken.ordinal()];
        if (i11 == 1) {
            jsonReader.beginArray();
            return new ArrayList();
        }
        if (i11 != 2) {
            return null;
        }
        jsonReader.beginObject();
        return new l();
    }

    @Override // com.google.gson.TypeAdapter
    public final Object read(JsonReader jsonReader) throws IOException {
        JsonToken peek = jsonReader.peek();
        Object c11 = c(jsonReader, peek);
        if (c11 == null) {
            return b(jsonReader, peek);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (jsonReader.hasNext()) {
                String nextName = c11 instanceof Map ? jsonReader.nextName() : null;
                JsonToken peek2 = jsonReader.peek();
                Serializable c12 = c(jsonReader, peek2);
                boolean z11 = c12 != null;
                if (c12 == null) {
                    c12 = b(jsonReader, peek2);
                }
                if (c11 instanceof List) {
                    ((List) c11).add(c12);
                } else {
                    ((Map) c11).put(nextName, c12);
                }
                if (z11) {
                    arrayDeque.addLast(c11);
                    c11 = c12;
                }
            } else {
                if (c11 instanceof List) {
                    jsonReader.endArray();
                } else {
                    jsonReader.endObject();
                }
                if (arrayDeque.isEmpty()) {
                    return c11;
                }
                c11 = arrayDeque.removeLast();
            }
        }
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        TypeAdapter f7 = this.f59860a.f(obj.getClass());
        if (!(f7 instanceof ObjectTypeAdapter)) {
            f7.write(jsonWriter, obj);
        } else {
            jsonWriter.beginObject();
            jsonWriter.endObject();
        }
    }
}
