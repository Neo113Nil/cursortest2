package com.vk.dto.common;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.OrdAdvertiser;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.aay;
import xsna.bpn0;
import xsna.cqm0;
import xsna.epx;
import xsna.j5g;
import xsna.ms9;

/* compiled from: OrdAdInfo.kt */
/* loaded from: classes18.dex */
public final class OrdAdInfo extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<OrdAdInfo> CREATOR = new c();
    public static final b d = new b();
    public final String b;
    public final List<OrdAdvertiser> c;

    /* compiled from: OrdAdInfo.kt */
    public static final class a {
        public static b a() {
            return OrdAdInfo.d;
        }
    }

    /* compiled from: JsonParser.kt */
    public static final class b extends aay<OrdAdInfo> {
        @Override // xsna.aay
        public final OrdAdInfo a(JSONObject jSONObject) {
            List list;
            try {
                String optString = jSONObject.optString("title");
                bpn0 bpn0Var = cqm0.a;
                if (optString == null) {
                    optString = "";
                }
                JSONArray optJSONArray = jSONObject.optJSONArray("advertisers");
                if (optJSONArray != null) {
                    OrdAdvertiser.a aVar = OrdAdvertiser.d;
                    ArrayList arrayList = new ArrayList(optJSONArray.length());
                    int length = optJSONArray.length();
                    for (int i = 0; i < length; i++) {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                        if (optJSONObject != null) {
                            arrayList.add((OrdAdvertiser) aVar.a(optJSONObject));
                        }
                    }
                    list = j5g.V(arrayList);
                } else {
                    list = EmptyList.b;
                }
                return new OrdAdInfo(optString, list);
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    /* compiled from: Serializer.kt */
    public static final class c extends Serializer.c<OrdAdInfo> {
        @Override // com.vk.core.serialize.Serializer.c
        public final OrdAdInfo a(Serializer serializer) {
            String H = serializer.H();
            if (H == null) {
                H = "";
            }
            List l = serializer.l(OrdAdInfo.class.getClassLoader());
            if (l == null) {
                l = EmptyList.b;
            }
            return new OrdAdInfo(H, l);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new OrdAdInfo[i];
        }
    }

    public OrdAdInfo(String str, List<OrdAdvertiser> list) {
        this.b = str;
        this.c = list;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.W(this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrdAdInfo)) {
            return false;
        }
        OrdAdInfo ordAdInfo = (OrdAdInfo) obj;
        return epx.f(this.b, ordAdInfo.b) && epx.f(this.c, ordAdInfo.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OrdAdInfo(title=");
        sb.append(this.b);
        sb.append(", advertisers=");
        return ms9.a(')', sb, this.c);
    }
}
