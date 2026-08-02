package com.vk.dto.common;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.MarketRejectInfoButtons;
import com.vk.log.L;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.aay;
import xsna.bxx;
import xsna.kvf;
import xsna.s3q0;

/* compiled from: MarketRejectInfo.kt */
/* loaded from: classes18.dex */
public final class MarketRejectInfo extends Serializer.StreamParcelableAdapter implements bxx {
    public static final Serializer.c<MarketRejectInfo> CREATOR = new b();
    public static final a i = new a();
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final boolean g;
    public final List<MarketRejectInfoButtons> h;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<MarketRejectInfo> {
        @Override // xsna.aay
        public final MarketRejectInfo a(JSONObject jSONObject) {
            ArrayList arrayList;
            String string = jSONObject.getString("title");
            String string2 = jSONObject.getString("description");
            String string3 = jSONObject.getString("info_link");
            String string4 = jSONObject.getString("write_to_support_link");
            int i = jSONObject.getInt("moderation_status");
            boolean z = jSONObject.getBoolean("in_progress");
            MarketRejectInfoButtons.a aVar = MarketRejectInfoButtons.d;
            JSONArray optJSONArray = jSONObject.optJSONArray("buttons");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                arrayList = new ArrayList(length);
                for (int i2 = 0; i2 < length; i2++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
                    if (optJSONObject != null) {
                        try {
                            arrayList.add(aVar.a(optJSONObject));
                        } catch (Exception e) {
                            L.i(e);
                            s3q0 s3q0Var = s3q0.a;
                        }
                    }
                }
            } else {
                arrayList = null;
            }
            return new MarketRejectInfo(string, string2, string3, string4, i, z, arrayList);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<MarketRejectInfo> {
        @Override // com.vk.core.serialize.Serializer.c
        public final MarketRejectInfo a(Serializer serializer) {
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
            return new MarketRejectInfo(H, H2, H3, H4 != null ? H4 : "", serializer.u(), serializer.m(), serializer.B(MarketRejectInfoButtons.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MarketRejectInfo[i];
        }
    }

    public MarketRejectInfo(String str, String str2, String str3, String str4, int i2, boolean z, List<MarketRejectInfoButtons> list) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = i2;
        this.g = z;
        this.h = list;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.S(this.f);
        serializer.L(this.g ? (byte) 1 : (byte) 0);
        serializer.f0(this.h);
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
        List<MarketRejectInfoButtons> list = this.h;
        jSONObject.put("buttons", list != null ? kvf.a(list) : null);
        return jSONObject;
    }
}
