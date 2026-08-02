package com.vk.dto.actionlinks;

import com.vk.core.serialize.Serializer;
import org.json.JSONObject;
import xsna.aay;

/* compiled from: CheckLinkResponse.kt */
/* loaded from: classes18.dex */
public final class CheckLinkResponse extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<CheckLinkResponse> CREATOR = new b();
    public final boolean b;
    public final String c;
    public final ActionLink d;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<CheckLinkResponse> {
        @Override // xsna.aay
        public final CheckLinkResponse a(JSONObject jSONObject) {
            return new CheckLinkResponse(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<CheckLinkResponse> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CheckLinkResponse a(Serializer serializer) {
            return new CheckLinkResponse(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CheckLinkResponse[i];
        }
    }

    static {
        new a();
    }

    public CheckLinkResponse(JSONObject jSONObject) {
        this.b = jSONObject.optInt("is_valid", 0) == 1;
        this.c = jSONObject.optString("error_text");
        this.d = jSONObject.has("action") ? new ActionLink(jSONObject.getJSONObject("action")) : null;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.L(this.b ? (byte) 1 : (byte) 0);
        serializer.j0(this.c);
        serializer.i0(this.d);
    }

    public CheckLinkResponse(Serializer serializer) {
        this.b = serializer.m();
        this.c = serializer.H();
        this.d = (ActionLink) serializer.G(ActionLink.class.getClassLoader());
    }
}
