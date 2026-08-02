package com.vk.dto.actionlinks;

import com.vk.core.serialize.Serializer;
import com.vk.log.L;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.aay;
import xsna.epx;
import xsna.f370;
import xsna.uqi;
import xsna.urd0;

/* compiled from: ActionLink.kt */
/* loaded from: classes18.dex */
public final class ActionLink extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<ActionLink> CREATOR = new b();
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final ActionLinkSnippet f;
    public final String g;
    public final String h;
    public final Integer i;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<ActionLink> {
        @Override // xsna.aay
        public final ActionLink a(JSONObject jSONObject) {
            return new ActionLink(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<ActionLink> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ActionLink a(Serializer serializer) {
            return new ActionLink(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ActionLink[i];
        }
    }

    static {
        new a();
    }

    public ActionLink(int i, String str, String str2, String str3, ActionLinkSnippet actionLinkSnippet, String str4, String str5, Integer num) {
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = actionLinkSnippet;
        this.g = str4;
        this.h = str5;
        this.i = num;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.i0(this.f);
        serializer.j0(this.g);
        serializer.j0(this.h);
        serializer.V(this.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionLink)) {
            return false;
        }
        ActionLink actionLink = (ActionLink) obj;
        return this.b == actionLink.b && epx.f(this.c, actionLink.c) && epx.f(this.d, actionLink.d) && epx.f(this.e, actionLink.e) && epx.f(this.f, actionLink.f) && epx.f(this.g, actionLink.g) && epx.f(this.h, actionLink.h) && epx.f(this.i, actionLink.i);
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(urd0.a(Integer.hashCode(this.b) * 31, 31, this.c), 31, this.d), 31, this.e);
        ActionLinkSnippet actionLinkSnippet = this.f;
        int hashCode = (a2 + (actionLinkSnippet == null ? 0 : actionLinkSnippet.hashCode())) * 31;
        String str = this.g;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.h;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.i;
        return hashCode3 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionLink(linkId=");
        sb.append(this.b);
        sb.append(", type=");
        sb.append(this.c);
        sb.append(", id=");
        sb.append(this.d);
        sb.append(", url=");
        sb.append(this.e);
        sb.append(", snippet=");
        sb.append(this.f);
        sb.append(", deeplink=");
        sb.append(this.g);
        sb.append(", appPackage=");
        sb.append(this.h);
        sb.append(", urlTarget=");
        return uqi.b(sb, this.i, ')');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ActionLink(JSONObject jSONObject) {
        this(r2, r3, r4, r5, r6, jSONObject.optString("app_deeplink"), jSONObject.optString("app_package_name"), f370.x(jSONObject, "url_target"));
        int optInt = jSONObject.optInt("link_id");
        String optString = jSONObject.optString("type");
        String optString2 = jSONObject.optString("id");
        String optString3 = jSONObject.optString("url");
        ActionLinkSnippet actionLinkSnippet = null;
        if (jSONObject.has("snippet")) {
            try {
                actionLinkSnippet = new ActionLinkSnippet(jSONObject.getJSONObject("snippet"));
            } catch (JSONException e) {
                L.i(e);
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ActionLink(Serializer serializer) {
        this(r1, r0, r3, r4 == null ? "" : r4, (ActionLinkSnippet) serializer.G(ActionLinkSnippet.class.getClassLoader()), serializer.H(), serializer.H(), serializer.v());
        int u = serializer.u();
        String H = serializer.H();
        H = H == null ? "" : H;
        String H2 = serializer.H();
        H2 = H2 == null ? "" : H2;
        String H3 = serializer.H();
    }
}
