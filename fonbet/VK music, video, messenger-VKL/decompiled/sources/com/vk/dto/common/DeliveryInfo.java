package com.vk.dto.common;

import com.vk.core.serialize.Serializer;
import org.json.JSONObject;
import xsna.aay;
import xsna.bxx;
import xsna.epx;
import xsna.f370;
import xsna.ho8;

/* compiled from: DeliveryInfo.kt */
/* loaded from: classes18.dex */
public final class DeliveryInfo extends Serializer.StreamParcelableAdapter implements bxx {
    public static final Serializer.c<DeliveryInfo> CREATOR = new b();
    public static final a c = new a();
    public final String b;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<DeliveryInfo> {
        @Override // xsna.aay
        public final DeliveryInfo a(JSONObject jSONObject) {
            return new DeliveryInfo(f370.D(jSONObject, "text"));
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<DeliveryInfo> {
        @Override // com.vk.core.serialize.Serializer.c
        public final DeliveryInfo a(Serializer serializer) {
            return new DeliveryInfo(serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DeliveryInfo[i];
        }
    }

    public DeliveryInfo(String str) {
        this.b = str;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt("text", this.b);
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DeliveryInfo) && epx.f(this.b, ((DeliveryInfo) obj).b);
    }

    public final int hashCode() {
        String str = this.b;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("DeliveryInfo(text="), this.b, ')');
    }
}
