package com.vk.dto.common;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.AdsChoicesOptions;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.aay;
import xsna.cqm0;
import xsna.epx;
import xsna.j5g;
import xsna.ms9;
import xsna.zcl;

/* compiled from: AdsChoices.kt */
/* loaded from: classes18.dex */
public final class AdsChoices implements Serializer.StreamParcelable {
    public static final Serializer.c<AdsChoices> CREATOR = new b();
    public static final a g = new a();
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final List<AdsChoicesOptions> f;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<AdsChoices> {
        @Override // xsna.aay
        public final AdsChoices a(JSONObject jSONObject) {
            List list;
            try {
                String a = cqm0.a(jSONObject.optString("icon_link"));
                String a2 = cqm0.a(jSONObject.optString("click_link"));
                String a3 = cqm0.a(jSONObject.optString("close_url"));
                String a4 = cqm0.a(jSONObject.optString("close_action_text"));
                JSONArray optJSONArray = jSONObject.optJSONArray(SignalingProtocol.KEY_OPTIONS);
                if (optJSONArray != null) {
                    AdsChoicesOptions.a aVar = AdsChoicesOptions.i;
                    ArrayList arrayList = new ArrayList(optJSONArray.length());
                    int length = optJSONArray.length();
                    for (int i = 0; i < length; i++) {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                        if (optJSONObject != null) {
                            arrayList.add((AdsChoicesOptions) aVar.a(optJSONObject));
                        }
                    }
                    list = j5g.V(arrayList);
                } else {
                    list = EmptyList.b;
                }
                return new AdsChoices(a, a2, a3, a4, list);
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<AdsChoices> {
        @Override // com.vk.core.serialize.Serializer.c
        public final AdsChoices a(Serializer serializer) {
            return new AdsChoices(serializer.H(), serializer.H(), serializer.H(), serializer.H(), serializer.B(AdsChoicesOptions.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AdsChoices[i];
        }
    }

    public AdsChoices() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.f0(this.f);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsChoices)) {
            return false;
        }
        AdsChoices adsChoices = (AdsChoices) obj;
        return epx.f(this.b, adsChoices.b) && epx.f(this.c, adsChoices.c) && epx.f(this.d, adsChoices.d) && epx.f(this.e, adsChoices.e) && epx.f(this.f, adsChoices.f);
    }

    public final int hashCode() {
        String str = this.b;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.c;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        return this.f.hashCode() + ((hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdsChoices(iconLink=");
        sb.append(this.b);
        sb.append(", clickLink=");
        sb.append(this.c);
        sb.append(", closeUrl=");
        sb.append(this.d);
        sb.append(", closeActionText=");
        sb.append(this.e);
        sb.append(", options=");
        return ms9.a(')', sb, this.f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    public AdsChoices(String str, String str2, String str3, String str4, List<AdsChoicesOptions> list) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = list;
    }

    public AdsChoices(String str, String str2, String str3, String str4, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? EmptyList.b : list);
    }
}
