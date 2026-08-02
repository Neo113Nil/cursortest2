package com.vk.superapp.common.js.bridge.impl;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.internal.LinkedTreeMap;
import com.vk.superapp.common.js.bridge.api.events.GetUserInfo$Response;
import java.util.Iterator;
import java.util.Map;
import xsna.b9y;
import xsna.tay;
import xsna.uay;
import xsna.x9y;

/* compiled from: GetUserSerializer.kt */
/* loaded from: classes6.dex */
public final class GetUserSerializer implements uay<GetUserInfo$Response.Data> {
    public static final GetUserSerializer a = new GetUserSerializer();
    public static final Gson b = new GsonBuilder().registerTypeAdapter(GetUserInfo$Response.User.Sex.class, new GetUserInfo$Response.User.Sex.Serializer()).create();

    private GetUserSerializer() {
    }

    @Override // xsna.uay
    public final b9y b(Object obj, tay tayVar) {
        x9y h = b.toJsonTree((GetUserInfo$Response.Data) obj).h();
        LinkedTreeMap<String, b9y> linkedTreeMap = h.b;
        if (linkedTreeMap.containsKey("user")) {
            Iterator it = ((LinkedTreeMap.b) h.q("user").h().b.entrySet()).iterator();
            while (((LinkedTreeMap.d) it).hasNext()) {
                Map.Entry a2 = ((LinkedTreeMap.b.a) it).a();
                h.l((b9y) a2.getValue(), (String) a2.getKey());
            }
            h.r("user");
        }
        if (linkedTreeMap.containsKey("users")) {
            Iterator it2 = ((LinkedTreeMap.b) h.q("users").h().b.entrySet()).iterator();
            while (((LinkedTreeMap.d) it2).hasNext()) {
                Map.Entry a3 = ((LinkedTreeMap.b.a) it2).a();
                h.l((b9y) a3.getValue(), (String) a3.getKey());
            }
            h.r("users");
        }
        return h;
    }
}
