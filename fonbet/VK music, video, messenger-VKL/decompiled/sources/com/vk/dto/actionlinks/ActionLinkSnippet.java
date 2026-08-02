package com.vk.dto.actionlinks;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.core.serialize.Serializer;
import com.vk.dto.actionlinks.SnippetTarget;
import com.vk.dto.common.Good;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.aay;
import xsna.epx;
import xsna.urd0;
import xsna.zcl;

/* compiled from: ActionLinkSnippet.kt */
/* loaded from: classes18.dex */
public final class ActionLinkSnippet extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<ActionLinkSnippet> CREATOR = new b();
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final SnippetTarget f;
    public final int g;
    public final int h;
    public final SnippetStyle i;
    public final Good j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;
    public final String p;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<ActionLinkSnippet> {
        @Override // xsna.aay
        public final ActionLinkSnippet a(JSONObject jSONObject) {
            return new ActionLinkSnippet(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<ActionLinkSnippet> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ActionLinkSnippet a(Serializer serializer) {
            return new ActionLinkSnippet(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ActionLinkSnippet[i];
        }
    }

    static {
        new a();
    }

    public /* synthetic */ ActionLinkSnippet(String str, String str2, String str3, String str4, SnippetTarget snippetTarget, int i, int i2, SnippetStyle snippetStyle, String str5, String str6, String str7, Good good, String str8, String str9, String str10, int i3, zcl zclVar) {
        this(str, str2, str3, str4, snippetTarget, i, i2, snippetStyle, (i3 & 256) != 0 ? null : str5, (i3 & 512) != 0 ? null : str6, (i3 & 1024) != 0 ? null : str7, (i3 & 2048) != 0 ? null : good, (i3 & 4096) != 0 ? null : str8, (i3 & 8192) != 0 ? null : str9, (i3 & 16384) != 0 ? null : str10);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.S(this.g);
        serializer.S(this.h);
        serializer.j0(this.n);
        serializer.j0(this.o);
        serializer.j0(this.p);
        serializer.i0(this.i);
        serializer.j0(this.f.h());
        serializer.i0(this.j);
        serializer.j0(this.l);
        serializer.j0(this.k);
        serializer.j0(this.m);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionLinkSnippet)) {
            return false;
        }
        ActionLinkSnippet actionLinkSnippet = (ActionLinkSnippet) obj;
        return epx.f(this.b, actionLinkSnippet.b) && epx.f(this.c, actionLinkSnippet.c) && epx.f(this.d, actionLinkSnippet.d) && epx.f(this.e, actionLinkSnippet.e) && this.f == actionLinkSnippet.f && this.g == actionLinkSnippet.g && this.h == actionLinkSnippet.h && epx.f(this.i, actionLinkSnippet.i) && epx.f(this.n, actionLinkSnippet.n) && epx.f(this.o, actionLinkSnippet.o) && epx.f(this.p, actionLinkSnippet.p) && epx.f(this.j, actionLinkSnippet.j) && epx.f(this.l, actionLinkSnippet.l) && epx.f(this.k, actionLinkSnippet.k) && epx.f(this.m, actionLinkSnippet.m);
    }

    public final int hashCode() {
        int hashCode = (((((this.f.hashCode() + urd0.a(urd0.a(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e)) * 31) + this.g) * 31) + this.h) * 31;
        SnippetStyle snippetStyle = this.i;
        int hashCode2 = (hashCode + (snippetStyle != null ? snippetStyle.hashCode() : 0)) * 31;
        String str = this.n;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.o;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.p;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Good good = this.j;
        int hashCode6 = (hashCode5 + (good != null ? good.hashCode() : 0)) * 31;
        String str4 = this.l;
        int hashCode7 = (hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.k;
        int hashCode8 = (hashCode7 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.m;
        return hashCode8 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String zb() {
        String str = this.o;
        if (str != null && str.length() != 0) {
            return str;
        }
        String str2 = this.n;
        if (str2 != null && str2.length() != 0) {
            return str2;
        }
        String str3 = this.o;
        return (str3 == null || str3.length() == 0) ? this.p : str3;
    }

    public ActionLinkSnippet(String str, String str2, String str3, String str4, SnippetTarget snippetTarget, int i, int i2, SnippetStyle snippetStyle, String str5, String str6, String str7, Good good, String str8, String str9, String str10) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = snippetTarget;
        this.g = i;
        this.h = i2;
        this.i = snippetStyle;
        this.n = str5;
        this.o = str6;
        this.p = str7;
        this.j = good;
        this.k = str8;
        this.l = str9;
        this.m = str10;
    }

    public ActionLinkSnippet(JSONObject jSONObject) {
        this.b = jSONObject.optString("title");
        this.e = jSONObject.optString("open_title");
        SnippetTarget.a aVar = SnippetTarget.Companion;
        String optString = jSONObject.optString("target");
        aVar.getClass();
        this.f = SnippetTarget.a.a(optString);
        this.c = jSONObject.optString("description");
        this.d = jSONObject.optString("type_name");
        this.g = jSONObject.optInt("show_ts");
        this.h = jSONObject.optInt("hide_ts");
        if (jSONObject.has("image")) {
            JSONArray jSONArray = jSONObject.getJSONArray("image");
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                int optInt = jSONObject2.optInt("width");
                if (optInt >= 0 && optInt < 100) {
                    this.p = jSONObject2.optString("url");
                } else if (100 <= optInt && optInt < 300) {
                    this.o = jSONObject2.optString("url");
                } else {
                    this.n = jSONObject2.optString("url");
                }
            }
        }
        this.i = jSONObject.has(TtmlNode.TAG_STYLE) ? new SnippetStyle(jSONObject.getJSONObject(TtmlNode.TAG_STYLE)) : null;
        this.k = jSONObject.has("app_package_name") ? jSONObject.optString("app_package_name") : null;
        this.l = jSONObject.has("app_deeplink") ? jSONObject.optString("app_deeplink") : null;
        if (jSONObject.has("market_item")) {
            this.j = (Good) Good.p0.a(jSONObject.getJSONObject("market_item"));
        } else {
            this.j = null;
        }
        this.m = jSONObject.has("icon") ? jSONObject.optString("icon") : null;
    }

    public ActionLinkSnippet(Serializer serializer) {
        String H = serializer.H();
        this.b = H == null ? "" : H;
        String H2 = serializer.H();
        this.c = H2 == null ? "" : H2;
        String H3 = serializer.H();
        this.d = H3 == null ? "" : H3;
        String H4 = serializer.H();
        this.e = H4 == null ? "" : H4;
        this.g = serializer.u();
        this.h = serializer.u();
        this.n = serializer.H();
        this.o = serializer.H();
        this.p = serializer.H();
        this.i = (SnippetStyle) serializer.G(SnippetStyle.class.getClassLoader());
        SnippetTarget.a aVar = SnippetTarget.Companion;
        String H5 = serializer.H();
        String str = H5 != null ? H5 : "";
        aVar.getClass();
        this.f = SnippetTarget.a.a(str);
        this.j = (Good) serializer.G(Good.class.getClassLoader());
        this.l = serializer.H();
        this.k = serializer.H();
        this.m = serializer.H();
    }
}
