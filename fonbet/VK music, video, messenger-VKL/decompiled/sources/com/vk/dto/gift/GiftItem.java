package com.vk.dto.gift;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.gift.GiftVotesAttachment;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.UserProfileGift;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.aay;
import xsna.t230;

/* loaded from: classes18.dex */
public class GiftItem extends t230 implements Parcelable {
    public static final Parcelable.Creator<GiftItem> CREATOR = new a();
    public static final b m = new b();
    public int c;
    public UserId d;
    public String e;

    @Nullable
    public UserProfileGift f;

    @Nullable
    public String g;
    public long h;
    public Gift i;
    public int j;

    @Nullable
    public String k;

    @Nullable
    public GiftVotesAttachment l;

    public class a implements Parcelable.Creator<GiftItem> {
        @Override // android.os.Parcelable.Creator
        public final GiftItem createFromParcel(Parcel parcel) {
            GiftItem giftItem = new GiftItem();
            giftItem.c = parcel.readInt();
            giftItem.d = (UserId) parcel.readParcelable(UserId.class.getClassLoader());
            giftItem.f = (UserProfileGift) parcel.readParcelable(UserProfileGift.class.getClassLoader());
            giftItem.g = parcel.readString();
            giftItem.h = parcel.readLong();
            giftItem.i = (Gift) parcel.readParcelable(Gift.class.getClassLoader());
            giftItem.j = parcel.readInt();
            giftItem.e = parcel.readString();
            giftItem.k = parcel.readString();
            giftItem.l = (GiftVotesAttachment) parcel.readParcelable(GiftVotesAttachment.class.getClassLoader());
            return giftItem;
        }

        @Override // android.os.Parcelable.Creator
        public final GiftItem[] newArray(int i) {
            return new GiftItem[i];
        }
    }

    public class b extends aay<GiftItem> {
        @Override // xsna.aay
        public final GiftItem a(JSONObject jSONObject) throws JSONException {
            return new GiftItem(jSONObject);
        }
    }

    public GiftItem() {
    }

    public final boolean d() {
        return this.j != 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e() {
        return this.j == 2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.c);
        parcel.writeParcelable(this.d, 0);
        parcel.writeParcelable(this.f, 0);
        parcel.writeString(this.g);
        parcel.writeLong(this.h);
        parcel.writeParcelable(this.i, 0);
        parcel.writeInt(this.j);
        parcel.writeString(this.e);
        parcel.writeString(this.k);
        parcel.writeParcelable(this.l, 0);
    }

    public GiftItem(JSONObject jSONObject) {
        this.c = jSONObject.optInt("id");
        this.d = new UserId(jSONObject.optLong("from_id"));
        this.g = jSONObject.optString("message");
        this.h = jSONObject.optLong("date");
        JSONObject optJSONObject = jSONObject.optJSONObject("gift");
        if (optJSONObject != null) {
            this.i = new Gift(optJSONObject);
        }
        this.j = jSONObject.optInt("privacy");
        this.e = jSONObject.optString("gift_hash");
        this.k = jSONObject.optString("entry_id");
        Serializer.c<GiftVotesAttachment> cVar = GiftVotesAttachment.CREATOR;
        this.l = GiftVotesAttachment.a.a(jSONObject.optJSONObject("votes_attachment"));
    }
}
