package com.ironsource;

import defpackage.e5h;
import defpackage.lm5;
import defpackage.ml3;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Y0 {

    @NotNull
    public static final a b = new a(null);

    @NotNull
    public static final String c = "adUnits";

    @Nullable
    private final JSONObject a;

    public Y0(@NotNull JSONObject jSONObject) {
        jSONObject.getClass();
        this.a = jSONObject.optJSONObject(c);
    }

    @NotNull
    public final <T> Map<String, T> a(@NotNull Function1<? super JSONObject, ? extends T> function1) {
        function1.getClass();
        JSONObject jSONObject = this.a;
        if (jSONObject == null) {
            lm5 lm5Var = lm5.a;
            lm5Var.getClass();
            return lm5Var;
        }
        Iterator<String> keys = jSONObject.keys();
        keys.getClass();
        ml3 b2 = e5h.b(keys);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = b2.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            JSONObject jSONObject2 = jSONObject.getJSONObject((String) next);
            jSONObject2.getClass();
            linkedHashMap.put(next, function1.invoke(jSONObject2));
        }
        return linkedHashMap;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
