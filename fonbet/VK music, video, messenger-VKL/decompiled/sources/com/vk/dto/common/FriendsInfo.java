package com.vk.dto.common;

import com.vk.core.serialize.Serializer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.aay;
import xsna.bxx;
import xsna.c5g;
import xsna.epx;
import xsna.kvf;
import xsna.ms9;

/* compiled from: FriendsInfo.kt */
/* loaded from: classes18.dex */
public final class FriendsInfo extends Serializer.StreamParcelableAdapter implements bxx {
    public static final Serializer.c<FriendsInfo> CREATOR;
    public final int b;
    public final List<String> c;

    /* compiled from: FriendsInfo.kt */
    public static final class a {
        public static FriendsInfo a(JSONObject jSONObject) {
            JSONObject optJSONObject = jSONObject.optJSONObject("friends");
            ArrayList arrayList = null;
            JSONArray optJSONArray = optJSONObject != null ? optJSONObject.optJSONArray("preview_profiles") : null;
            int optInt = optJSONObject != null ? optJSONObject.optInt("count") : 0;
            if (optJSONArray != null) {
                arrayList = new ArrayList(optJSONArray.length());
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject optJSONObject2 = optJSONArray.optJSONObject(i);
                    if (optJSONObject2 != null) {
                        arrayList.add(optJSONObject2.optString("photo_base"));
                    }
                }
            }
            return new FriendsInfo(optInt, arrayList);
        }
    }

    /* compiled from: JsonParser.kt */
    public static final class b extends aay<FriendsInfo> {
        @Override // xsna.aay
        public final FriendsInfo a(JSONObject jSONObject) {
            return new FriendsInfo(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class c extends Serializer.c<FriendsInfo> {
        @Override // com.vk.core.serialize.Serializer.c
        public final FriendsInfo a(Serializer serializer) {
            return new FriendsInfo(serializer.u(), com.vk.core.serialize.a.a(serializer));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FriendsInfo[i];
        }
    }

    static {
        new b();
        CREATOR = new c();
    }

    public FriendsInfo(int i, List<String> list) {
        this.b = i;
        this.c = list;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.l0(this.c);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        JSONArray jSONArray;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("count", this.b);
        List<String> list = this.c;
        if (list != null) {
            List<String> list2 = list;
            ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(jSONObject.put("photo_base", (String) it.next()));
            }
            jSONArray = kvf.a(arrayList);
        } else {
            jSONArray = null;
        }
        jSONObject.put("preview_profiles", jSONArray);
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FriendsInfo)) {
            return false;
        }
        FriendsInfo friendsInfo = (FriendsInfo) obj;
        return this.b == friendsInfo.b && epx.f(this.c, friendsInfo.c);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.b) * 31;
        List<String> list = this.c;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FriendsInfo(friendsCount=");
        sb.append(this.b);
        sb.append(", friendsAvatarsList=");
        return ms9.a(')', sb, this.c);
    }

    public FriendsInfo(JSONObject jSONObject) {
        this(0, null);
        a.a(jSONObject);
    }
}
