package defpackage;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.logging.Logger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class qga {
    public static final Logger a = Logger.getLogger(qga.class.getName());

    public static Object a(JsonReader jsonReader) {
        z1a.D("unexpected end of JSON", jsonReader.hasNext());
        switch (oga.a[jsonReader.peek().ordinal()]) {
            case 1:
                jsonReader.beginArray();
                ArrayList arrayList = new ArrayList();
                while (jsonReader.hasNext()) {
                    arrayList.add(a(jsonReader));
                }
                z1a.D("Bad token: " + jsonReader.getPath(), jsonReader.peek() == JsonToken.END_ARRAY);
                jsonReader.endArray();
                break;
            case 2:
                jsonReader.beginObject();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                while (jsonReader.hasNext()) {
                    linkedHashMap.put(jsonReader.nextName(), a(jsonReader));
                }
                z1a.D("Bad token: " + jsonReader.getPath(), jsonReader.peek() == JsonToken.END_OBJECT);
                jsonReader.endObject();
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                jsonReader.nextNull();
                break;
            default:
                sw9.i(jsonReader.getPath(), "Bad token: ");
                break;
        }
        return null;
    }
}
