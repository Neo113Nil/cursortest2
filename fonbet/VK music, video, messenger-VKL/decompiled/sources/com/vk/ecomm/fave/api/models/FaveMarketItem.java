package com.vk.ecomm.fave.api.models;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Good;
import com.vk.dto.common.data.CallProducerButton;
import com.vk.dto.newsfeed.Owner;
import java.util.Collections;
import org.json.JSONObject;
import xsna.bxx;
import xsna.gmq;
import xsna.kvf;
import xsna.l490;

/* compiled from: FaveMarketItem.kt */
/* loaded from: classes18.dex */
public final class FaveMarketItem extends Serializer.StreamParcelableAdapter implements bxx, gmq, l490 {
    public final Good b;
    public final CallProducerButton c;

    public FaveMarketItem(Good good, CallProducerButton callProducerButton) {
        this.b = good;
        this.c = callProducerButton;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.e0(this.b);
        serializer.e0(this.c);
    }

    @Override // xsna.gmq
    public final boolean X() {
        return this.b.J;
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("product", this.b.e5());
        jSONObject.put("product_extras", kvf.a(Collections.singletonList(this.c)));
        return jSONObject;
    }

    @Override // xsna.l490
    public final Owner s() {
        return this.b.M;
    }

    @Override // xsna.gmq
    public final void s0(boolean z) {
        this.b.J = z;
    }
}
