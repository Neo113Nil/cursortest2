package com.vk.superapp.base.js.bridge;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.internal.LinkedTreeMap;
import com.vk.superapp.base.js.bridge.Responses$ClientError;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import xsna.b9y;
import xsna.drm0;
import xsna.tay;
import xsna.uay;
import xsna.x9y;

/* compiled from: VkClientErrorSerializer.kt */
/* loaded from: classes6.dex */
public final class VkClientErrorSerializer implements uay<Responses$ClientError> {
    public static final VkClientErrorSerializer a = new VkClientErrorSerializer();
    public static final Gson b = new GsonBuilder().create();

    private VkClientErrorSerializer() {
    }

    @Override // xsna.uay
    public final b9y b(Object obj, tay tayVar) {
        Responses$ClientError responses$ClientError = (Responses$ClientError) obj;
        x9y x9yVar = new x9y();
        x9yVar.o("error_type", responses$ClientError.b());
        String c = responses$ClientError.c();
        if (c != null && !drm0.N(c)) {
            x9yVar.o(CommonUrlParts.REQUEST_ID, responses$ClientError.c());
        }
        Responses$ClientError.ErrorData a2 = responses$ClientError.a();
        x9y x9yVar2 = new x9y();
        String a3 = a2.a();
        if (a3 != null && !drm0.N(a3)) {
            x9yVar2.o("error_description", a2.a());
        }
        b9y q = b.toJsonTree(a2).h().q(a2.b().name().toLowerCase(Locale.ROOT));
        x9y h = q instanceof x9y ? ((x9y) q).h() : null;
        if (h != null) {
            Iterator it = ((LinkedTreeMap.b) h.b.entrySet()).iterator();
            while (((LinkedTreeMap.d) it).hasNext()) {
                Map.Entry a4 = ((LinkedTreeMap.b.a) it).a();
                x9yVar2.l((b9y) a4.getValue(), (String) a4.getKey());
            }
        }
        x9yVar.l(x9yVar2, "error_data");
        return x9yVar;
    }
}
