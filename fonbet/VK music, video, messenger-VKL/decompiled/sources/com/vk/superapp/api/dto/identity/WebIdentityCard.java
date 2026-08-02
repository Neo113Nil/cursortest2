package com.vk.superapp.api.dto.identity;

import com.vk.core.serialize.Serializer;
import org.json.JSONObject;

/* compiled from: WebIdentityCard.kt */
/* loaded from: classes6.dex */
public abstract class WebIdentityCard extends Serializer.StreamParcelableAdapter {
    public abstract WebIdentityLabel Ab();

    public abstract JSONObject Bb();

    public abstract String Cb();

    public boolean equals(Object obj) {
        return obj != null && ((WebIdentityCard) obj).zb() == zb();
    }

    public abstract String getTitle();

    public abstract String getType();

    public int hashCode() {
        return Integer.hashCode(zb());
    }

    public String toString() {
        return Bb().toString();
    }

    public abstract int zb();
}
