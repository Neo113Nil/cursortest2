package com.ironsource;

import defpackage.e5h;
import defpackage.i5h;
import defpackage.lwj;
import defpackage.tub;
import defpackage.xka;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Id {

    @NotNull
    private final Map<String, C4398xc> a;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a extends xka implements Function1<String, Pair<? extends String, ? extends C4398xc>> {
        final /* synthetic */ JSONObject a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(JSONObject jSONObject) {
            super(1);
            this.a = jSONObject;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Pair<String, C4398xc> invoke(String str) {
            str.getClass();
            JSONObject jSONObject = this.a.getJSONObject(str);
            jSONObject.getClass();
            return new Pair<>(str, new C4398xc(str, jSONObject));
        }
    }

    public Id(@NotNull JSONObject jSONObject) {
        jSONObject.getClass();
        Iterator<String> keys = jSONObject.keys();
        keys.getClass();
        lwj n = i5h.n(e5h.b(keys), new a(jSONObject));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = n.a.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) n.b.invoke(it.next());
            linkedHashMap.put(pair.a, pair.b);
        }
        Map<String, C4398xc> j = tub.j(linkedHashMap);
        this.a = j;
        for (Map.Entry<String, C4398xc> entry : j.entrySet()) {
            entry.getKey();
            C4398xc value = entry.getValue();
            if (b(value)) {
                value.b(a(value));
            }
        }
    }

    private final C4398xc a(C4398xc c4398xc) {
        return this.a.get(c4398xc.h());
    }

    private final boolean b(C4398xc c4398xc) {
        return c4398xc.o() && c4398xc.l().length() > 0;
    }

    @NotNull
    public final Map<String, C4398xc> a() {
        return this.a;
    }
}
