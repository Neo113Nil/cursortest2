package com.vk.dto.common;

import com.vk.core.serialize.Serializer;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$ReferrerItemType;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONObject;
import xsna.aay;
import xsna.bxx;
import xsna.dz5;
import xsna.epx;

/* compiled from: OtherGoods.kt */
/* loaded from: classes18.dex */
public final class OtherGoods extends Serializer.StreamParcelableAdapter implements bxx {
    public static final Serializer.c<OtherGoods> CREATOR = new c();
    public static final b h = new b();
    public final String b;
    public final String c;
    public final String[] d;
    public final MobileOfficialAppsMarketStat$ReferrerItemType e;
    public final int f;
    public ArrayList g;

    /* compiled from: OtherGoods.kt */
    public static final class a {
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
         */
        public static MobileOfficialAppsMarketStat$ReferrerItemType a(String str) {
            if (str != null) {
                switch (str.hashCode()) {
                    case -1365840537:
                        if (str.equals("other_goods")) {
                            return MobileOfficialAppsMarketStat$ReferrerItemType.OTHER_GOODS;
                        }
                        break;
                    case 67748972:
                        if (str.equals("similar_items")) {
                            return MobileOfficialAppsMarketStat$ReferrerItemType.SIMILAR_ITEMS;
                        }
                        break;
                    case 1456351722:
                        if (str.equals("similar_items_bookmarks")) {
                            return MobileOfficialAppsMarketStat$ReferrerItemType.SIMILAR_ITEMS_BOOKMARKS;
                        }
                        break;
                    case 1542023282:
                        if (str.equals("recommended_goods")) {
                            return MobileOfficialAppsMarketStat$ReferrerItemType.RECOMMENDED_GOODS;
                        }
                        break;
                }
            }
            return MobileOfficialAppsMarketStat$ReferrerItemType.OTHER_GOODS;
        }
    }

    /* compiled from: JsonParser.kt */
    public static final class b extends aay<OtherGoods> {
        @Override // xsna.aay
        public final OtherGoods a(JSONObject jSONObject) {
            return new OtherGoods(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class c extends Serializer.c<OtherGoods> {
        @Override // com.vk.core.serialize.Serializer.c
        public final OtherGoods a(Serializer serializer) {
            return new OtherGoods(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new OtherGoods[i];
        }
    }

    public OtherGoods(String str, String str2, String[] strArr, MobileOfficialAppsMarketStat$ReferrerItemType mobileOfficialAppsMarketStat$ReferrerItemType, int i) {
        this.b = str;
        this.c = str2;
        this.d = strArr;
        this.e = mobileOfficialAppsMarketStat$ReferrerItemType;
        this.f = i;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.e.name());
        serializer.k0(this.d);
        serializer.S(this.f);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt("title", this.b);
        jSONObject.putOpt("link", this.c);
        jSONObject.putOpt("referrer_item_type", this.e.name());
        jSONObject.putOpt("item_ids", this.d);
        jSONObject.putOpt("view_type", Integer.valueOf(this.f));
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!OtherGoods.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        OtherGoods otherGoods = (OtherGoods) obj;
        String str = otherGoods.b;
        String[] strArr = otherGoods.d;
        if (!epx.f(this.b, str) || !epx.f(this.c, otherGoods.c)) {
            return false;
        }
        String[] strArr2 = this.d;
        if (strArr2 != null) {
            if (strArr == null || !Arrays.equals(strArr2, strArr)) {
                return false;
            }
        } else if (strArr != null) {
            return false;
        }
        return this.e == otherGoods.e && this.f == otherGoods.f && epx.f(this.g, otherGoods.g);
    }

    public final int hashCode() {
        String str = this.b;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String[] strArr = this.d;
        int hashCode3 = (((this.e.hashCode() + ((hashCode2 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31)) * 31) + this.f) * 31;
        ArrayList arrayList = this.g;
        return hashCode3 + (arrayList != null ? arrayList.hashCode() : 0);
    }

    public OtherGoods(JSONObject jSONObject) {
        this.f = 1;
        this.b = jSONObject.optString("title");
        this.c = jSONObject.optString("link");
        this.e = a.a(jSONObject.optString("referrer_item_type"));
        this.d = dz5.G(jSONObject.optJSONArray("item_ids"));
        this.f = jSONObject.optInt("view_type", 1);
    }

    public OtherGoods(Serializer serializer) {
        this.f = 1;
        this.b = serializer.H();
        this.c = serializer.H();
        this.e = a.a(serializer.H());
        this.d = serializer.g();
        this.f = serializer.u();
    }
}
