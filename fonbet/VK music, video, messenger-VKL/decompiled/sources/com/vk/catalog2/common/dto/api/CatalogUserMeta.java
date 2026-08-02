package com.vk.catalog2.common.dto.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.catalog2.common.dto.api.CatalogButton;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import defpackage.q0;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.aay;
import xsna.bh10;
import xsna.epx;
import xsna.fw3;
import xsna.ms9;
import xsna.qoy;
import xsna.shy;
import xsna.urd0;

/* compiled from: CatalogUserMeta.kt */
/* loaded from: classes16.dex */
public final class CatalogUserMeta extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<CatalogUserMeta> CREATOR = new b();
    public static final a n = new a();
    public final String b;
    public final UserId c;
    public final String d;
    public final List<CatalogButton> e;
    public final List<UserId> f;
    public final int g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final boolean l;
    public final List<Description> m;

    /* compiled from: CatalogUserMeta.kt */
    public static final class Description implements Parcelable {
        public static final Parcelable.Creator<Description> CREATOR = new a();
        public static final b e = new b();
        public final String b;
        public final String c;
        public final boolean d;

        /* compiled from: CatalogUserMeta.kt */
        public static final class a implements Parcelable.Creator<Description> {
            @Override // android.os.Parcelable.Creator
            public final Description createFromParcel(Parcel parcel) {
                return new Description(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Description[] newArray(int i) {
                return new Description[i];
            }
        }

        /* compiled from: JsonParser.kt */
        public static final class b extends aay<Description> {
            @Override // xsna.aay
            public final Description a(JSONObject jSONObject) {
                return new Description(jSONObject.optString("text", ""), jSONObject.optString("message", ""), jSONObject.optInt("highlighted") == 1);
            }
        }

        public Description(String str, String str2, boolean z) {
            this.b = str;
            this.c = str2;
            this.d = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Description)) {
                return false;
            }
            Description description = (Description) obj;
            return epx.f(this.b, description.b) && epx.f(this.c, description.c) && this.d == description.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + urd0.a(this.b.hashCode() * 31, 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Description(text=");
            sb.append(this.b);
            sb.append(", message=");
            sb.append(this.c);
            sb.append(", highlighted=");
            return q0.a(sb, this.d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
            parcel.writeString(this.c);
            parcel.writeInt(this.d ? 1 : 0);
        }
    }

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<CatalogUserMeta> {
        @Override // xsna.aay
        public final CatalogUserMeta a(JSONObject jSONObject) {
            return new CatalogUserMeta(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<CatalogUserMeta> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CatalogUserMeta a(Serializer serializer) {
            return new CatalogUserMeta(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CatalogUserMeta[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CatalogUserMeta(String str, UserId userId, String str2, List<? extends CatalogButton> list, List<UserId> list2, int i, String str3, String str4, String str5, String str6, boolean z, List<Description> list3) {
        this.b = str;
        this.c = userId;
        this.d = str2;
        this.e = list;
        this.f = list2;
        this.g = i;
        this.h = str3;
        this.i = str4;
        this.j = str5;
        this.k = str6;
        this.l = z;
        this.m = list3;
    }

    public final boolean Ab() {
        return epx.f(this.i, "today");
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.e0(this.c);
        serializer.j0(this.d);
        serializer.W(this.e);
        serializer.f0(this.f);
        serializer.S(this.g);
        serializer.j0(this.h);
        serializer.j0(this.i);
        serializer.j0(this.j);
        serializer.j0(this.k);
        serializer.L(this.l ? (byte) 1 : (byte) 0);
        serializer.f0(this.m);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogUserMeta)) {
            return false;
        }
        CatalogUserMeta catalogUserMeta = (CatalogUserMeta) obj;
        return epx.f(this.b, catalogUserMeta.b) && epx.f(this.c, catalogUserMeta.c) && epx.f(this.d, catalogUserMeta.d) && epx.f(this.e, catalogUserMeta.e) && epx.f(this.f, catalogUserMeta.f) && this.g == catalogUserMeta.g && epx.f(this.h, catalogUserMeta.h) && epx.f(this.i, catalogUserMeta.i) && epx.f(this.j, catalogUserMeta.j) && epx.f(this.k, catalogUserMeta.k) && this.l == catalogUserMeta.l && epx.f(this.m, catalogUserMeta.m);
    }

    public final int hashCode() {
        int a2 = fw3.a(urd0.a(bh10.a(this.b.hashCode() * 31, 31, this.c.b), 31, this.d), 31, this.e);
        List<UserId> list = this.f;
        int a3 = shy.a(this.g, (a2 + (list == null ? 0 : list.hashCode())) * 31, 31);
        String str = this.h;
        int hashCode = (a3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.i;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.j;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.k;
        return this.m.hashCode() + qoy.b((hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31, 31, this.l);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogUserMeta(itemId=");
        sb.append(this.b);
        sb.append(", userId=");
        sb.append(this.c);
        sb.append(", trackCode=");
        sb.append(this.d);
        sb.append(", buttons=");
        sb.append(this.e);
        sb.append(", commonFriends=");
        sb.append(this.f);
        sb.append(", commonFriendsCount=");
        sb.append(this.g);
        sb.append(", commonFriendsCountDescription=");
        sb.append(this.h);
        sb.append(", birthday=");
        sb.append(this.i);
        sb.append(", nameGen=");
        sb.append(this.j);
        sb.append(", state=");
        sb.append(this.k);
        sb.append(", isFriend=");
        sb.append(this.l);
        sb.append(", descriptions=");
        return ms9.a(')', sb, this.m);
    }

    public final boolean zb() {
        return Ab() || epx.f(this.i, "tomorrow");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v4, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CatalogUserMeta(JSONObject jSONObject) {
        this(r3, r4, r5, r8, r7, r1, r9, r10, r11, r12, true, r6 == null ? EmptyList.b : r6);
        List list;
        ArrayList arrayList;
        String optString = jSONObject.optString("item_id");
        UserId userId = new UserId(jSONObject.optLong("user_id"));
        String optString2 = jSONObject.optString("track_code");
        JSONArray optJSONArray = jSONObject.optJSONArray("actions");
        EmptyList emptyList = null;
        if (optJSONArray != null) {
            CatalogButton.b bVar = CatalogButton.b;
            list = new ArrayList(optJSONArray.length());
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                CatalogButton catalogButton = (CatalogButton) bVar.a(optJSONArray.getJSONObject(i));
                if (catalogButton != null) {
                    list.add(catalogButton);
                }
            }
        } else {
            list = 0;
        }
        list = list == 0 ? EmptyList.b : list;
        JSONArray optJSONArray2 = jSONObject.optJSONArray("common_friends");
        if (optJSONArray2 != null) {
            arrayList = new ArrayList(optJSONArray2.length());
            int length2 = optJSONArray2.length();
            for (int i2 = 0; i2 < length2; i2++) {
                arrayList.add(new UserId(optJSONArray2.getLong(i2)));
            }
        } else {
            arrayList = null;
        }
        int optInt = jSONObject.optInt("common_friends_count");
        JSONObject optJSONObject = jSONObject.optJSONObject("common_friends_description");
        String string = optJSONObject != null ? optJSONObject.getString("text") : null;
        String optString3 = jSONObject.optString("birthday");
        String optString4 = jSONObject.optString("name_in_genitive");
        String optString5 = jSONObject.optString("state");
        JSONArray optJSONArray3 = jSONObject.optJSONArray("descriptions");
        if (optJSONArray3 != null) {
            Description.b bVar2 = Description.e;
            ?? arrayList2 = new ArrayList(optJSONArray3.length());
            int length3 = optJSONArray3.length();
            for (int i3 = 0; i3 < length3; i3++) {
                arrayList2.add((Description) bVar2.a(optJSONArray3.getJSONObject(i3)));
            }
            emptyList = arrayList2;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CatalogUserMeta(Serializer serializer) {
        this(r4, r5, r6, r7, r8, r9, r10, r11, r12, r1 == null ? "" : r1, serializer.m(), serializer.B(Description.class.getClassLoader()));
        String H = serializer.H();
        String str = H == null ? "" : H;
        UserId userId = (UserId) serializer.A(UserId.class.getClassLoader());
        String H2 = serializer.H();
        String str2 = H2 == null ? "" : H2;
        List k = serializer.k(CatalogButton.class);
        List list = k == null ? EmptyList.b : k;
        ArrayList B = serializer.B(UserId.class.getClassLoader());
        int u = serializer.u();
        String H3 = serializer.H();
        String H4 = serializer.H();
        String str3 = H4 == null ? "" : H4;
        String H5 = serializer.H();
        String str4 = H5 == null ? "" : H5;
        String H6 = serializer.H();
    }
}
