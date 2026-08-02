package com.vk.api.request.rx;

import com.vk.dto.common.data.VKList;
import org.json.JSONObject;
import xsna.aay;
import xsna.we3;

/* compiled from: RxListWithPayloadApiRequest.kt */
/* loaded from: classes15.dex */
public final class VkListWithPayload<VkList, Payload> extends VKList<VkList> {
    private final Payload data;

    public VkListWithPayload(JSONObject jSONObject, aay aayVar, we3 we3Var) {
        super(jSONObject, aayVar);
        this.data = (Payload) we3Var.a(jSONObject);
    }

    public final Payload q() {
        return this.data;
    }
}
