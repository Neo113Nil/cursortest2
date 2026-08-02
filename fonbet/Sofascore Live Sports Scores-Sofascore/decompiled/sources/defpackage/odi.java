package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class odi implements Map.Entry, hia {
    public final Object a;
    public Object b;
    public final /* synthetic */ pdi c;

    public odi(pdi pdiVar) {
        this.c = pdiVar;
        Map.Entry entry = (Map.Entry) pdiVar.c;
        entry.getClass();
        this.a = entry.getKey();
        Map.Entry entry2 = (Map.Entry) pdiVar.c;
        entry2.getClass();
        this.b = entry2.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        pdi pdiVar = this.c;
        koh kohVar = (koh) pdiVar.d;
        if (kohVar.e().d != pdiVar.b) {
            a70.o();
            return null;
        }
        Object obj2 = this.b;
        kohVar.put(this.a, obj);
        this.b = obj;
        return obj2;
    }
}
