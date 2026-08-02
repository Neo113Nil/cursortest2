package defpackage;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class p49 extends u5h {
    public u4k a;

    @Override // defpackage.u4k
    public final Object a(JsonReader jsonReader) {
        u4k u4kVar = this.a;
        if (u4kVar != null) {
            return u4kVar.a(jsonReader);
        }
        a70.r("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        return null;
    }

    @Override // defpackage.u4k
    public final void b(JsonWriter jsonWriter, Object obj) {
        u4k u4kVar = this.a;
        if (u4kVar != null) {
            u4kVar.b(jsonWriter, obj);
        } else {
            a70.r("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }
    }

    @Override // defpackage.u5h
    public final u4k c() {
        u4k u4kVar = this.a;
        if (u4kVar != null) {
            return u4kVar;
        }
        a70.r("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        return null;
    }
}
