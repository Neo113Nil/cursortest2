package com.vk.dto.gift;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.epx;
import xsna.ho8;
import xsna.t230;
import xsna.zcl;

/* compiled from: GiftCategory.kt */
/* loaded from: classes18.dex */
public final class GiftCategory extends t230 implements Parcelable {
    public static final Parcelable.Creator<GiftCategory> CREATOR = new a();
    public final String c;
    public final String d;
    public final ArrayList e;

    /* compiled from: GiftCategory.kt */
    public static final class a implements Parcelable.Creator<GiftCategory> {
        @Override // android.os.Parcelable.Creator
        public final GiftCategory createFromParcel(Parcel parcel) {
            return new GiftCategory(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final GiftCategory[] newArray(int i) {
            return new GiftCategory[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GiftCategory() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GiftCategory)) {
            return false;
        }
        GiftCategory giftCategory = (GiftCategory) obj;
        return epx.f(this.c, giftCategory.c) && epx.f(this.d, giftCategory.d);
    }

    public final int hashCode() {
        String str = this.c;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.d;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GiftCategory(name=");
        sb.append(this.c);
        sb.append(", title=");
        return ho8.a(sb, this.d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        ArrayList arrayList = this.e;
        parcel.writeInt(arrayList.size());
        parcel.writeList(arrayList);
    }

    public /* synthetic */ GiftCategory(String str, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }

    public GiftCategory(String str, String str2) {
        this.c = str;
        this.d = str2;
        this.e = new ArrayList();
    }

    public GiftCategory(JSONObject jSONObject) {
        this(jSONObject.optString("name"), jSONObject.optString("title"));
        JSONArray optJSONArray = jSONObject.optJSONArray("items");
        if (optJSONArray != null) {
            this.e = new ArrayList(optJSONArray.length());
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    ArrayList arrayList = this.e;
                    Gift gift = new Gift(optJSONObject.getJSONObject("gift"));
                    int optInt = optJSONObject.optInt("price");
                    int optInt2 = optJSONObject.optInt("gifts_left");
                    int optInt3 = optJSONObject.optInt("real_price");
                    boolean z = true;
                    if (optInt != 0 || optInt2 > 0 ? optInt > 0 : optInt3 > 0) {
                        z = false;
                    }
                    arrayList.add(new CatalogedGift(gift, z));
                }
            }
        }
    }

    public GiftCategory(Parcel parcel) {
        this(parcel.readString(), parcel.readString());
        int readInt = parcel.readInt();
        if (readInt >= 0) {
            ArrayList arrayList = new ArrayList(readInt);
            this.e = arrayList;
            parcel.readList(arrayList, CatalogedGift.class.getClassLoader());
        }
    }
}
