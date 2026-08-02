package com.vk.dto.stories.entities;

import com.vk.core.serialize.Serializer;
import org.json.JSONObject;
import xsna.aay;
import xsna.bxx;
import xsna.epx;
import xsna.f370;
import xsna.ho8;
import xsna.s3q0;
import xsna.w9y;

/* compiled from: OrdData.kt */
/* loaded from: classes18.dex */
public final class OrdData extends Serializer.StreamParcelableAdapter implements bxx {
    public static final Serializer.c<OrdData> CREATOR = new b();
    public static final a e = new a();
    public final boolean b;
    public final String c;
    public final String d;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<OrdData> {
        @Override // xsna.aay
        public final OrdData a(JSONObject jSONObject) {
            return new OrdData(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<OrdData> {
        @Override // com.vk.core.serialize.Serializer.c
        public final OrdData a(Serializer serializer) {
            return new OrdData(serializer.m(), serializer.I(), serializer.I());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new OrdData[i];
        }
    }

    public OrdData(boolean z, String str, String str2) {
        this.b = z;
        this.c = str;
        this.d = str2;
    }

    public static OrdData zb(OrdData ordData) {
        return new OrdData(ordData.b, ordData.c, ordData.d);
    }

    public final String Ab() {
        return this.d;
    }

    public final String Bb() {
        return this.c;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.L(this.b ? (byte) 1 : (byte) 0);
        serializer.m0(this.c);
        serializer.m0(this.d);
    }

    public final boolean W3() {
        return this.b;
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        w9y w9yVar = new w9y();
        w9yVar.b(Boolean.valueOf(this.b), "is_ad");
        w9yVar.e(this.c, "pred_id");
        w9yVar.e(this.d, "er_id");
        s3q0 s3q0Var = s3q0.a;
        return w9yVar.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrdData)) {
            return false;
        }
        OrdData ordData = (OrdData) obj;
        return this.b == ordData.b && epx.f(this.c, ordData.c) && epx.f(this.d, ordData.d);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.b) * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OrdData(isAd=");
        sb.append(this.b);
        sb.append(", predId=");
        sb.append(this.c);
        sb.append(", erId=");
        return ho8.a(sb, this.d, ')');
    }

    public OrdData(JSONObject jSONObject) {
        this(jSONObject.optBoolean("is_ad"), f370.A("pred_id", jSONObject), f370.A("er_id", jSONObject));
    }
}
