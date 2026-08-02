package defpackage;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.security.AccessController;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class w4k extends u4k {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final Object d;

    public w4k(Class cls) {
        this.a = 1;
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
        try {
            for (Field field : (Field[]) AccessController.doPrivileged(new i02(1, cls))) {
                Enum r5 = (Enum) field.get(null);
                String name = r5.name();
                String str = r5.toString();
                b6h b6hVar = (b6h) field.getAnnotation(b6h.class);
                if (b6hVar != null) {
                    name = b6hVar.value();
                    for (String str2 : b6hVar.alternate()) {
                        ((HashMap) this.b).put(str2, r5);
                    }
                }
                ((HashMap) this.b).put(name, r5);
                ((HashMap) this.c).put(str, r5);
                ((HashMap) this.d).put(r5, name);
            }
        } catch (IllegalAccessException e) {
            a70.j(e);
            throw null;
        }
    }

    @Override // defpackage.u4k
    public final Object a(JsonReader jsonReader) {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                return ((u4k) obj).a(jsonReader);
            default:
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                String nextString = jsonReader.nextString();
                Enum r3 = (Enum) ((HashMap) this.b).get(nextString);
                return r3 == null ? (Enum) ((HashMap) obj).get(nextString) : r3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0056, code lost:
    
        if ((r1 instanceof defpackage.luf) == false) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.reflect.Type] */
    @Override // defpackage.u4k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(JsonWriter jsonWriter, Object obj) {
        u4k c;
        int i = this.a;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                u4k u4kVar = (u4k) this.c;
                ?? r1 = (Type) obj2;
                Class<?> cls = (obj == null || !((r1 instanceof Class) || (r1 instanceof TypeVariable))) ? r1 : obj.getClass();
                if (cls != r1) {
                    u4k adapter = ((Gson) this.b).getAdapter(new u5k(cls));
                    if (adapter instanceof luf) {
                        u4k u4kVar2 = u4kVar;
                        while ((u4kVar2 instanceof u5h) && (c = ((u5h) u4kVar2).c()) != u4kVar2) {
                            u4kVar2 = c;
                        }
                        break;
                    }
                    u4kVar = adapter;
                }
                u4kVar.b(jsonWriter, obj);
                break;
            default:
                Enum r5 = (Enum) obj;
                jsonWriter.value(r5 == null ? null : (String) ((HashMap) obj2).get(r5));
                break;
        }
    }

    public w4k(Gson gson, u4k u4kVar, Type type) {
        this.a = 0;
        this.b = gson;
        this.c = u4kVar;
        this.d = type;
    }
}
