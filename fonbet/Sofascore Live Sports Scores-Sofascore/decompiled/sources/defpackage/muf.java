package defpackage;

import com.google.gson.stream.JsonReader;
import java.lang.reflect.Field;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class muf extends luf {
    public final pjd b;

    public muf(pjd pjdVar, LinkedHashMap linkedHashMap) {
        super(linkedHashMap);
        this.b = pjdVar;
    }

    @Override // defpackage.luf
    public final Object c() {
        return this.b.n();
    }

    @Override // defpackage.luf
    public final void e(Object obj, JsonReader jsonReader, kuf kufVar) {
        Field field = kufVar.b;
        Object a = kufVar.h.a(jsonReader);
        if (a == null && kufVar.k) {
            return;
        }
        if (kufVar.l) {
            throw new zfa("Cannot set value of 'static final' ".concat(iuf.d(field, false)));
        }
        field.set(obj, a);
    }

    @Override // defpackage.luf
    public final Object d(Object obj) {
        return obj;
    }
}
