package defpackage;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class k0i extends u4k {
    public static final hh0 c = new hh0(4);
    public final /* synthetic */ int a;
    public final u4k b;

    public /* synthetic */ k0i(u4k u4kVar, int i) {
        this.a = i;
        this.b = u4kVar;
    }

    @Override // defpackage.u4k
    public final Object a(JsonReader jsonReader) {
        int i = this.a;
        u4k u4kVar = this.b;
        switch (i) {
            case 0:
                Date date = (Date) u4kVar.a(jsonReader);
                if (date != null) {
                    return new Timestamp(date.getTime());
                }
                return null;
            case 1:
                return new AtomicLong(((Number) u4kVar.a(jsonReader)).longValue());
            case 2:
                ArrayList arrayList = new ArrayList();
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    arrayList.add(Long.valueOf(((Number) u4kVar.a(jsonReader)).longValue()));
                }
                jsonReader.endArray();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i2 = 0; i2 < size; i2++) {
                    atomicLongArray.set(i2, ((Long) arrayList.get(i2)).longValue());
                }
                return atomicLongArray;
            default:
                if (jsonReader.peek() != JsonToken.NULL) {
                    return u4kVar.a(jsonReader);
                }
                jsonReader.nextNull();
                return null;
        }
    }

    @Override // defpackage.u4k
    public final void b(JsonWriter jsonWriter, Object obj) {
        int i = this.a;
        u4k u4kVar = this.b;
        switch (i) {
            case 0:
                u4kVar.b(jsonWriter, (Timestamp) obj);
                break;
            case 1:
                u4kVar.b(jsonWriter, Long.valueOf(((AtomicLong) obj).get()));
                break;
            case 2:
                AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
                jsonWriter.beginArray();
                int length = atomicLongArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    u4kVar.b(jsonWriter, Long.valueOf(atomicLongArray.get(i2)));
                }
                jsonWriter.endArray();
                break;
            default:
                if (obj == null) {
                    jsonWriter.nullValue();
                    break;
                } else {
                    u4kVar.b(jsonWriter, obj);
                    break;
                }
        }
    }
}
