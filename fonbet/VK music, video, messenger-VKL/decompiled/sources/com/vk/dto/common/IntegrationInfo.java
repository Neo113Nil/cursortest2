package com.vk.dto.common;

import com.vk.core.serialize.Serializer;
import org.json.JSONObject;
import xsna.aay;
import xsna.bxx;
import xsna.epx;
import xsna.f370;
import xsna.ho8;

/* compiled from: IntegrationInfo.kt */
/* loaded from: classes18.dex */
public final class IntegrationInfo extends Serializer.StreamParcelableAdapter implements bxx {
    public static final Serializer.c<IntegrationInfo> CREATOR = new b();
    public static final a c = new a();
    public final String b;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<IntegrationInfo> {
        @Override // xsna.aay
        public final IntegrationInfo a(JSONObject jSONObject) {
            return new IntegrationInfo(f370.D(jSONObject, "title"));
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<IntegrationInfo> {
        @Override // com.vk.core.serialize.Serializer.c
        public final IntegrationInfo a(Serializer serializer) {
            return new IntegrationInfo(serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new IntegrationInfo[i];
        }
    }

    public IntegrationInfo(String str) {
        this.b = str;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt("title", this.b);
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof IntegrationInfo) && epx.f(this.b, ((IntegrationInfo) obj).b);
    }

    public final int hashCode() {
        String str = this.b;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("IntegrationInfo(title="), this.b, ')');
    }
}
