package defpackage;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class luf extends u4k {
    public final LinkedHashMap a;

    public luf(LinkedHashMap linkedHashMap) {
        this.a = linkedHashMap;
    }

    @Override // defpackage.u4k
    public final Object a(JsonReader jsonReader) {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        Object c = c();
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                kuf kufVar = (kuf) this.a.get(jsonReader.nextName());
                if (kufVar != null && kufVar.e) {
                    e(c, jsonReader, kufVar);
                }
                jsonReader.skipValue();
            }
            jsonReader.endObject();
            return d(c);
        } catch (IllegalAccessException e) {
            vha vhaVar = iuf.a;
            vp2.e("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
            return null;
        } catch (IllegalStateException e2) {
            throw new yga(e2);
        }
    }

    @Override // defpackage.u4k
    public final void b(JsonWriter jsonWriter, Object obj) {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.beginObject();
        try {
            Iterator it = this.a.values().iterator();
            while (it.hasNext()) {
                ((kuf) it.next()).a(jsonWriter, obj);
            }
            jsonWriter.endObject();
        } catch (IllegalAccessException e) {
            vha vhaVar = iuf.a;
            vp2.e("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
        }
    }

    public abstract Object c();

    public abstract Object d(Object obj);

    public abstract void e(Object obj, JsonReader jsonReader, kuf kufVar);
}
