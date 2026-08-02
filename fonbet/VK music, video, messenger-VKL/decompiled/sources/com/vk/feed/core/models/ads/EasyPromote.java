package com.vk.feed.core.models.ads;

import com.vk.core.serialize.Serializer;
import org.json.JSONObject;
import xsna.epx;
import xsna.ho8;
import xsna.shy;

/* compiled from: EasyPromote.kt */
/* loaded from: classes18.dex */
public final class EasyPromote extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<EasyPromote> CREATOR = new b();
    public final int b;
    public final int c;
    public final String d;
    public final String e;

    /* compiled from: EasyPromote.kt */
    public static final class a {
        public static EasyPromote a(JSONObject jSONObject) {
            return new EasyPromote(jSONObject.getInt("type"), jSONObject.optInt("ad_id"), jSONObject.optString("label_text", null), jSONObject.optString("button_text", null));
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<EasyPromote> {
        @Override // com.vk.core.serialize.Serializer.c
        public final EasyPromote a(Serializer serializer) {
            return new EasyPromote(serializer.u(), serializer.u(), serializer.H(), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EasyPromote[i];
        }
    }

    public EasyPromote(int i, int i2, String str, String str2) {
        this.b = i;
        this.c = i2;
        this.d = str;
        this.e = str2;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.S(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EasyPromote)) {
            return false;
        }
        EasyPromote easyPromote = (EasyPromote) obj;
        return this.b == easyPromote.b && this.c == easyPromote.c && epx.f(this.d, easyPromote.d) && epx.f(this.e, easyPromote.e);
    }

    public final int hashCode() {
        int a2 = shy.a(this.c, Integer.hashCode(this.b) * 31, 31);
        String str = this.d;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EasyPromote(type=");
        sb.append(this.b);
        sb.append(", adId=");
        sb.append(this.c);
        sb.append(", labelText=");
        sb.append(this.d);
        sb.append(", buttonText=");
        return ho8.a(sb, this.e, ')');
    }
}
