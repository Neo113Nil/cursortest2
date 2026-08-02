package com.vk.dto.attaches;

import com.vk.core.serialize.Serializer;
import org.json.JSONObject;
import xsna.aay;
import xsna.bxx;
import xsna.epx;
import xsna.urd0;

/* compiled from: AttachMarketRejectInfo.kt */
/* loaded from: classes18.dex */
public final class AttachMarketRejectInfo extends Serializer.StreamParcelableAdapter implements bxx {
    public static final Serializer.c<AttachMarketRejectInfo> CREATOR = new b();
    public static final a h = new a();
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final boolean g;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<AttachMarketRejectInfo> {
        @Override // xsna.aay
        public final AttachMarketRejectInfo a(JSONObject jSONObject) {
            return new AttachMarketRejectInfo(jSONObject.getString("title"), jSONObject.getString("description"), jSONObject.getString("info_link"), jSONObject.getString("write_to_support_link"), jSONObject.getInt("moderation_status"), jSONObject.getBoolean("in_progress"));
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<AttachMarketRejectInfo> {
        @Override // com.vk.core.serialize.Serializer.c
        public final AttachMarketRejectInfo a(Serializer serializer) {
            String H = serializer.H();
            if (H == null) {
                H = "";
            }
            String H2 = serializer.H();
            if (H2 == null) {
                H2 = "";
            }
            String H3 = serializer.H();
            if (H3 == null) {
                H3 = "";
            }
            String H4 = serializer.H();
            return new AttachMarketRejectInfo(H, H2, H3, H4 != null ? H4 : "", serializer.u(), serializer.m());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AttachMarketRejectInfo[i];
        }
    }

    public AttachMarketRejectInfo(String str, String str2, String str3, String str4, int i, boolean z) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = i;
        this.g = z;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.S(this.f);
        serializer.L(this.g ? (byte) 1 : (byte) 0);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("title", this.b);
        jSONObject.put("description", this.c);
        jSONObject.put("info_link", this.d);
        jSONObject.put("write_to_support_link", this.e);
        jSONObject.put("moderation_status", this.f);
        jSONObject.put("in_progress", this.g);
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AttachMarketRejectInfo)) {
            return false;
        }
        AttachMarketRejectInfo attachMarketRejectInfo = (AttachMarketRejectInfo) obj;
        return epx.f(this.b, attachMarketRejectInfo.b) && epx.f(this.c, attachMarketRejectInfo.c) && epx.f(this.d, attachMarketRejectInfo.d) && epx.f(this.e, attachMarketRejectInfo.e) && this.f == attachMarketRejectInfo.f && this.g == attachMarketRejectInfo.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + ((urd0.a(urd0.a(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e) + this.f) * 31);
    }
}
