package com.vk.dto.profile;

import com.vk.core.serialize.Serializer;
import org.json.JSONObject;

/* loaded from: classes18.dex */
public class PlainAddress extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<PlainAddress> CREATOR = new a();
    public int b;
    public double c;
    public double d;

    public class a extends Serializer.c<PlainAddress> {
        @Override // com.vk.core.serialize.Serializer.c
        public final PlainAddress a(Serializer serializer) {
            return new PlainAddress(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PlainAddress[i];
        }
    }

    public PlainAddress() {
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.O(this.c);
        serializer.O(this.d);
    }

    public PlainAddress(JSONObject jSONObject) {
        this.b = jSONObject.optInt("id", -1);
        this.c = jSONObject.optDouble("latitude");
        this.d = jSONObject.optDouble("longitude");
    }

    public PlainAddress(Serializer serializer) {
        this.b = serializer.u();
        this.c = serializer.r();
        this.d = serializer.r();
    }
}
