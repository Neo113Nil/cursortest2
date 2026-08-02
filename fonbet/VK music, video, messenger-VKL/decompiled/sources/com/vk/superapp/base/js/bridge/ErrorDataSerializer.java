package com.vk.superapp.base.js.bridge;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.internal.LinkedTreeMap;
import com.vk.superapp.base.js.bridge.a;
import java.util.Iterator;
import java.util.Map;
import xsna.b9y;
import xsna.tay;
import xsna.uay;
import xsna.x9y;

/* compiled from: ErrorDataSerializer.kt */
/* loaded from: classes6.dex */
public final class ErrorDataSerializer implements uay<a.InterfaceC1867a> {
    public static final ErrorDataSerializer a = new ErrorDataSerializer();
    public static final Gson b = new GsonBuilder().registerTypeAdapter(Responses$ClientError.class, VkClientErrorSerializer.a).registerTypeAdapter(Responses$ApiError.class, VkApiErrorSerializer.a).create();

    private ErrorDataSerializer() {
    }

    @Override // xsna.uay
    public final b9y b(Object obj, tay tayVar) {
        x9y h = b.toJsonTree((a.InterfaceC1867a) obj).h();
        LinkedTreeMap<String, b9y> linkedTreeMap = h.b;
        if (linkedTreeMap.containsKey("client_error")) {
            Iterator it = ((LinkedTreeMap.b) h.q("client_error").h().b.entrySet()).iterator();
            while (((LinkedTreeMap.d) it).hasNext()) {
                Map.Entry a2 = ((LinkedTreeMap.b.a) it).a();
                h.l((b9y) a2.getValue(), (String) a2.getKey());
            }
            h.r("client_error");
            h.r("type");
        }
        if (linkedTreeMap.containsKey("api_error")) {
            Iterator it2 = ((LinkedTreeMap.b) h.q("api_error").h().b.entrySet()).iterator();
            while (((LinkedTreeMap.d) it2).hasNext()) {
                Map.Entry a3 = ((LinkedTreeMap.b.a) it2).a();
                h.l((b9y) a3.getValue(), (String) a3.getKey());
            }
            h.r("api_error");
            h.r("type");
        }
        return h;
    }
}
