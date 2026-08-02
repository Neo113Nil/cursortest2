package defpackage;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class ckd extends u4k {
    public static final j13 c = new j13(tjj.a, 2);
    public final Gson a;
    public final ujj b;

    public ckd(Gson gson, ujj ujjVar) {
        this.a = gson;
        this.b = ujjVar;
    }

    public static Serializable d(JsonReader jsonReader, JsonToken jsonToken) {
        int i = bkd.a[jsonToken.ordinal()];
        if (i == 1) {
            jsonReader.beginArray();
            return new ArrayList();
        }
        if (i != 2) {
            return null;
        }
        jsonReader.beginObject();
        return new nbb(true);
    }

    @Override // defpackage.u4k
    public final Object a(JsonReader jsonReader) {
        JsonToken peek = jsonReader.peek();
        Object d = d(jsonReader, peek);
        if (d == null) {
            return c(jsonReader, peek);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (jsonReader.hasNext()) {
                String nextName = d instanceof Map ? jsonReader.nextName() : null;
                JsonToken peek2 = jsonReader.peek();
                Serializable d2 = d(jsonReader, peek2);
                boolean z = d2 != null;
                if (d2 == null) {
                    d2 = c(jsonReader, peek2);
                }
                if (d instanceof List) {
                    ((List) d).add(d2);
                } else {
                    ((Map) d).put(nextName, d2);
                }
                if (z) {
                    arrayDeque.addLast(d);
                    d = d2;
                }
            } else {
                if (d instanceof List) {
                    jsonReader.endArray();
                } else {
                    jsonReader.endObject();
                }
                if (arrayDeque.isEmpty()) {
                    return d;
                }
                d = arrayDeque.removeLast();
            }
        }
    }

    @Override // defpackage.u4k
    public final void b(JsonWriter jsonWriter, Object obj) {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        u4k adapter = this.a.getAdapter(obj.getClass());
        if (!(adapter instanceof ckd)) {
            adapter.b(jsonWriter, obj);
        } else {
            jsonWriter.beginObject();
            jsonWriter.endObject();
        }
    }

    public final Serializable c(JsonReader jsonReader, JsonToken jsonToken) {
        int i = bkd.a[jsonToken.ordinal()];
        if (i == 3) {
            return jsonReader.nextString();
        }
        if (i == 4) {
            return this.b.a(jsonReader);
        }
        if (i == 5) {
            return Boolean.valueOf(jsonReader.nextBoolean());
        }
        if (i == 6) {
            jsonReader.nextNull();
            return null;
        }
        yhk.r(jsonToken, "Unexpected token: ");
        return null;
    }
}
