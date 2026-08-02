package com.vk.catalog2.common.dto.api.layout;

import com.vk.core.serialize.Serializer;
import org.json.JSONObject;
import xsna.aay;
import xsna.bxx;
import xsna.epx;
import xsna.ho8;
import xsna.s3q0;
import xsna.w9y;

/* compiled from: TopTitle.kt */
/* loaded from: classes16.dex */
public final class TopTitle extends Serializer.StreamParcelableAdapter implements bxx {
    public static final Serializer.c<TopTitle> CREATOR = new b();
    public static final a d = new a();
    public final String b;
    public final String c;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<TopTitle> {
        @Override // xsna.aay
        public final TopTitle a(JSONObject jSONObject) {
            return new TopTitle(jSONObject.optString("text"), jSONObject.has("icon") ? jSONObject.getString("icon") : null);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<TopTitle> {
        @Override // com.vk.core.serialize.Serializer.c
        public final TopTitle a(Serializer serializer) {
            String H = serializer.H();
            if (H == null) {
                H = "";
            }
            return new TopTitle(H, serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TopTitle[i];
        }
    }

    public TopTitle(String str, String str2) {
        this.b = str;
        this.c = str2;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        w9y w9yVar = new w9y();
        w9yVar.e(this.b, "text");
        w9yVar.e(this.c, "icon");
        s3q0 s3q0Var = s3q0.a;
        return w9yVar.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TopTitle)) {
            return false;
        }
        TopTitle topTitle = (TopTitle) obj;
        return epx.f(this.b, topTitle.b) && epx.f(this.c, topTitle.c);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        String str = this.c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TopTitle(text=");
        sb.append(this.b);
        sb.append(", icon=");
        return ho8.a(sb, this.c, ')');
    }
}
