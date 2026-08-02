package com.vk.dto.clips.masks;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import org.json.JSONObject;
import xsna.aay;
import xsna.bh10;
import xsna.bxx;
import xsna.epx;
import xsna.f370;
import xsna.ho8;
import xsna.s3q0;
import xsna.shy;
import xsna.w9y;

/* compiled from: MaskLight.kt */
/* loaded from: classes18.dex */
public final class MaskLight extends Serializer.StreamParcelableAdapter implements bxx {
    public static final Serializer.c<MaskLight> CREATOR = new b();
    public static final a f = new a();
    public final int b;
    public final UserId c;
    public final int d;
    public final String e;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<MaskLight> {
        @Override // xsna.aay
        public final MaskLight a(JSONObject jSONObject) {
            return new MaskLight(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<MaskLight> {
        @Override // com.vk.core.serialize.Serializer.c
        public final MaskLight a(Serializer serializer) {
            return new MaskLight(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MaskLight[i];
        }
    }

    public MaskLight(int i, UserId userId, int i2, String str) {
        this.b = i;
        this.c = userId;
        this.d = i2;
        this.e = str;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.e0(this.c);
        serializer.S(this.d);
        serializer.m0(this.e);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        w9y w9yVar = new w9y();
        w9yVar.c(Integer.valueOf(this.b), "id");
        w9yVar.d(Long.valueOf(this.c.b), "owner_id");
        w9yVar.c(Integer.valueOf(this.d), "section_id");
        w9yVar.e(this.e, "name");
        s3q0 s3q0Var = s3q0.a;
        return w9yVar.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MaskLight)) {
            return false;
        }
        MaskLight maskLight = (MaskLight) obj;
        return this.b == maskLight.b && epx.f(this.c, maskLight.c) && this.d == maskLight.d && epx.f(this.e, maskLight.e);
    }

    public final int hashCode() {
        int a2 = shy.a(this.d, bh10.a(Integer.hashCode(this.b) * 31, 31, this.c.b), 31);
        String str = this.e;
        return a2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MaskLight(id=");
        sb.append(this.b);
        sb.append(", ownerId=");
        sb.append(this.c);
        sb.append(", sectionId=");
        sb.append(this.d);
        sb.append(", name=");
        return ho8.a(sb, this.e, ')');
    }

    public final String zb() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.c);
        sb.append('_');
        sb.append(this.b);
        return sb.toString();
    }

    public MaskLight(JSONObject jSONObject) {
        this(jSONObject.getInt("id"), new UserId(jSONObject.getLong("owner_id")), jSONObject.getInt("section_id"), f370.A("name", jSONObject));
    }

    public MaskLight(Serializer serializer) {
        this(serializer.u(), (UserId) serializer.A(UserId.class.getClassLoader()), serializer.u(), serializer.I());
    }
}
