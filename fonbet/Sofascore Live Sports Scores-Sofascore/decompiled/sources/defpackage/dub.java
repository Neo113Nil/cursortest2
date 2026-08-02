package defpackage;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class dub extends u4k {
    public final w4k a;
    public final w4k b;
    public final pjd c;
    public final /* synthetic */ eub d;

    public dub(eub eubVar, Gson gson, Type type, u4k u4kVar, Type type2, u4k u4kVar2, pjd pjdVar) {
        this.d = eubVar;
        this.a = new w4k(gson, u4kVar, type);
        this.b = new w4k(gson, u4kVar2, type2);
        this.c = pjdVar;
    }

    @Override // defpackage.u4k
    public final Object a(JsonReader jsonReader) {
        u4k u4kVar = (u4k) this.b.c;
        u4k u4kVar2 = (u4k) this.a.c;
        JsonToken peek = jsonReader.peek();
        if (peek == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        Map map = (Map) this.c.n();
        if (peek != JsonToken.BEGIN_ARRAY) {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                xga.INSTANCE.promoteNameToValue(jsonReader);
                Object a = u4kVar2.a(jsonReader);
                if (map.put(a, u4kVar.a(jsonReader)) != null) {
                    throw new yga(mz1.m(a, "duplicate key: "));
                }
            }
            jsonReader.endObject();
            return map;
        }
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            jsonReader.beginArray();
            Object a2 = u4kVar2.a(jsonReader);
            if (map.put(a2, u4kVar.a(jsonReader)) != null) {
                throw new yga(mz1.m(a2, "duplicate key: "));
            }
            jsonReader.endArray();
        }
        jsonReader.endArray();
        return map;
    }

    @Override // defpackage.u4k
    public final void b(JsonWriter jsonWriter, Object obj) {
        String str;
        Map map = (Map) obj;
        if (map == null) {
            jsonWriter.nullValue();
            return;
        }
        boolean z = this.d.b;
        w4k w4kVar = this.b;
        if (!z) {
            jsonWriter.beginObject();
            for (Map.Entry entry : map.entrySet()) {
                jsonWriter.name(String.valueOf(entry.getKey()));
                w4kVar.b(jsonWriter, entry.getValue());
            }
            jsonWriter.endObject();
            return;
        }
        ArrayList arrayList = new ArrayList(map.size());
        ArrayList arrayList2 = new ArrayList(map.size());
        int i = 0;
        boolean z2 = false;
        for (Map.Entry entry2 : map.entrySet()) {
            w4k w4kVar2 = this.a;
            Object key = entry2.getKey();
            try {
                kha khaVar = new kha();
                w4kVar2.b(khaVar, key);
                pfa h = khaVar.h();
                arrayList.add(h);
                arrayList2.add(entry2.getValue());
                h.getClass();
                z2 |= (h instanceof bfa) || (h instanceof iga);
            } catch (IOException e) {
                throw new zfa(e);
            }
        }
        if (z2) {
            jsonWriter.beginArray();
            int size = arrayList.size();
            while (i < size) {
                jsonWriter.beginArray();
                pfa pfaVar = (pfa) arrayList.get(i);
                x4k x4kVar = b5k.a;
                o49.e(pfaVar, jsonWriter);
                w4kVar.b(jsonWriter, arrayList2.get(i));
                jsonWriter.endArray();
                i++;
            }
            jsonWriter.endArray();
            return;
        }
        jsonWriter.beginObject();
        int size2 = arrayList.size();
        while (i < size2) {
            pfa pfaVar2 = (pfa) arrayList.get(i);
            pfaVar2.getClass();
            if (pfaVar2 instanceof rga) {
                rga rgaVar = (rga) pfaVar2;
                Serializable serializable = rgaVar.a;
                if (serializable instanceof Number) {
                    str = String.valueOf(rgaVar.d());
                } else if (serializable instanceof Boolean) {
                    str = Boolean.toString(rgaVar.c());
                } else {
                    if (!(serializable instanceof String)) {
                        ogj.b();
                        return;
                    }
                    str = rgaVar.e();
                }
            } else {
                if (!(pfaVar2 instanceof gga)) {
                    ogj.b();
                    return;
                }
                str = "null";
            }
            jsonWriter.name(str);
            w4kVar.b(jsonWriter, arrayList2.get(i));
            i++;
        }
        jsonWriter.endObject();
    }
}
