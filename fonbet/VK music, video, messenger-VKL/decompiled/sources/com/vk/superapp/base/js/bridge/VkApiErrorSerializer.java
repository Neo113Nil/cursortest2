package com.vk.superapp.base.js.bridge;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import xsna.b9y;
import xsna.tay;
import xsna.uay;
import xsna.x9y;

/* compiled from: VkApiErrorSerializer.kt */
/* loaded from: classes6.dex */
public final class VkApiErrorSerializer implements uay<Responses$ApiError> {
    public static final VkApiErrorSerializer a = new VkApiErrorSerializer();
    public static final Gson b = new GsonBuilder().create();

    private VkApiErrorSerializer() {
    }

    @Override // xsna.uay
    public final b9y b(Object obj, tay tayVar) {
        Responses$ApiError responses$ApiError = (Responses$ApiError) obj;
        x9y x9yVar = new x9y();
        x9yVar.o("error_type", responses$ApiError.b());
        x9yVar.l(b.toJsonTree(responses$ApiError.a()).h(), "error_data");
        return x9yVar;
    }
}
