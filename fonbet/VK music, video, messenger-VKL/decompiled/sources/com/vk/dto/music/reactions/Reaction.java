package com.vk.dto.music.reactions;

import com.vk.core.serialize.Serializer;
import org.json.JSONObject;
import xsna.bxx;
import xsna.epx;
import xsna.ho8;
import xsna.s3q0;
import xsna.urd0;
import xsna.w9y;

/* compiled from: Reaction.kt */
/* loaded from: classes18.dex */
public final class Reaction extends Serializer.StreamParcelableAdapter implements bxx {
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public Reaction(String str, String str2, String str3, String str4, String str5) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.j0(this.f);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        w9y w9yVar = new w9y();
        w9yVar.e(this.b, "id");
        w9yVar.e(this.c, "title");
        w9yVar.e(this.d, "description");
        w9yVar.e(this.e, "icon");
        w9yVar.e(this.f, "badge_icon_url");
        s3q0 s3q0Var = s3q0.a;
        return w9yVar.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Reaction)) {
            return false;
        }
        Reaction reaction = (Reaction) obj;
        return epx.f(this.b, reaction.b) && epx.f(this.c, reaction.c) && epx.f(this.d, reaction.d) && epx.f(this.e, reaction.e) && epx.f(this.f, reaction.f);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        String str = this.c;
        int a = urd0.a(urd0.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e);
        String str2 = this.f;
        return a + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Reaction(id=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", description=");
        sb.append(this.d);
        sb.append(", icon=");
        sb.append(this.e);
        sb.append(", badgeIconUrl=");
        return ho8.a(sb, this.f, ')');
    }

    public Reaction(JSONObject jSONObject) {
        this(jSONObject.optString("id"), jSONObject.optString("title"), jSONObject.optString("description"), jSONObject.optString("icon"), jSONObject.optString("badge_icon_url"));
    }
}
