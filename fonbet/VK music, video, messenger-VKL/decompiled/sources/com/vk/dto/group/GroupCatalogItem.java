package com.vk.dto.group;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.core.serialize.Serializer;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.aay;
import xsna.bxx;
import xsna.d370;
import xsna.h6g;

/* compiled from: GroupCatalogItem.kt */
/* loaded from: classes18.dex */
public class GroupCatalogItem extends Serializer.StreamParcelableAdapter implements bxx {
    public static final Serializer.c<GroupCatalogItem> CREATOR = new c();
    public static final b k = new b();
    public final long b;
    public final String c;
    public final int d;
    public final String e;
    public final GroupLikes f;
    public final String g;
    public final double h;
    public final double i;
    public final double j;

    /* compiled from: GroupCatalogItem.kt */
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        public static GroupCatalogItem a(JSONObject jSONObject) {
            double optDouble = jSONObject.optDouble("latitude");
            if (Double.isNaN(optDouble)) {
                try {
                    optDouble = jSONObject.getJSONObject("coords").optDouble("latitude");
                } catch (JSONException unused) {
                }
            }
            double d = optDouble;
            double optDouble2 = jSONObject.optDouble("longitude");
            if (Double.isNaN(optDouble2)) {
                try {
                    optDouble2 = jSONObject.getJSONObject("coords").optDouble("longitude");
                } catch (JSONException unused2) {
                }
            }
            double d2 = optDouble2;
            long optLong = jSONObject.optLong("id");
            String optString = jSONObject.optString("description");
            int optInt = jSONObject.optInt("counter");
            String optString2 = jSONObject.optString("track_code");
            GroupLikes groupLikes = jSONObject.optJSONObject("friends") != null ? new GroupLikes(jSONObject, null, 2, 0 == true ? 1 : 0) : null;
            String optString3 = jSONObject.optString("city", null);
            if (optString3 == null) {
                optString3 = jSONObject.optString("subtitle");
            }
            return new GroupCatalogItem(optLong, optString, optInt, optString2, groupLikes, optString3, d, d2, jSONObject.optDouble(CampaignEx.JSON_KEY_STAR));
        }
    }

    /* compiled from: JsonParser.kt */
    public static final class b extends aay<GroupCatalogItem> {
        @Override // xsna.aay
        public final GroupCatalogItem a(JSONObject jSONObject) {
            Serializer.c<GroupCatalogItem> cVar = GroupCatalogItem.CREATOR;
            return a.a(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class c extends Serializer.c<GroupCatalogItem> {
        @Override // com.vk.core.serialize.Serializer.c
        public final GroupCatalogItem a(Serializer serializer) {
            return new GroupCatalogItem(serializer.w(), serializer.H(), serializer.u(), serializer.H(), (GroupLikes) serializer.G(GroupLikes.class.getClassLoader()), serializer.H(), serializer.r(), serializer.r(), serializer.r());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new GroupCatalogItem[i];
        }
    }

    public GroupCatalogItem(long j, String str, int i, String str2, GroupLikes groupLikes, String str3, double d, double d2, double d3) {
        this.b = j;
        this.c = str;
        this.d = i;
        this.e = str2;
        this.f = groupLikes;
        this.g = str3;
        this.h = d;
        this.i = d2;
        this.j = d3;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.Y(this.b);
        serializer.j0(this.c);
        serializer.S(this.d);
        serializer.j0(this.e);
        serializer.i0(this.f);
        serializer.j0(this.g);
        serializer.O(this.h);
        serializer.O(this.i);
        serializer.O(this.j);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        return d370.C(new h6g(this, 23));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass().equals(obj.getClass())) {
            GroupCatalogItem groupCatalogItem = obj instanceof GroupCatalogItem ? (GroupCatalogItem) obj : null;
            if (groupCatalogItem != null && this.b == groupCatalogItem.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final GroupLikes zb() {
        return this.f;
    }

    public GroupCatalogItem(GroupCatalogItem groupCatalogItem) {
        this(groupCatalogItem.b, groupCatalogItem.c, groupCatalogItem.d, groupCatalogItem.e, groupCatalogItem.f, groupCatalogItem.g, groupCatalogItem.h, groupCatalogItem.i, groupCatalogItem.j);
    }
}
