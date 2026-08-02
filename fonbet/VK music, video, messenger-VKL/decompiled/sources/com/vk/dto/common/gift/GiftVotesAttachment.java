package com.vk.dto.common.gift;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.epx;
import xsna.er;

/* compiled from: GiftVotesAttachment.kt */
/* loaded from: classes18.dex */
public final class GiftVotesAttachment implements Serializer.StreamParcelable {
    public static final Serializer.c<GiftVotesAttachment> CREATOR = new b();
    public final int b;
    public final Image c;

    /* compiled from: GiftVotesAttachment.kt */
    public static final class a {
        public static GiftVotesAttachment a(JSONObject jSONObject) {
            JSONArray optJSONArray;
            Image image = null;
            if (jSONObject == null) {
                return null;
            }
            int i = jSONObject.getInt("amount");
            JSONObject optJSONObject = jSONObject.optJSONObject("image");
            if (optJSONObject != null && (optJSONArray = optJSONObject.optJSONArray("sources")) != null) {
                ArrayList arrayList = new ArrayList();
                int length = optJSONArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    JSONObject optJSONObject2 = optJSONArray.optJSONObject(i2);
                    if (optJSONObject2 != null) {
                        arrayList.add(new ImageSize(optJSONObject2.optString("url"), optJSONObject2.optInt("width"), optJSONObject2.optInt("height"), null, (char) 0, false, 56, null));
                    }
                }
                image = new Image(arrayList);
            }
            return new GiftVotesAttachment(i, image);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<GiftVotesAttachment> {
        @Override // com.vk.core.serialize.Serializer.c
        public final GiftVotesAttachment a(Serializer serializer) {
            return new GiftVotesAttachment(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new GiftVotesAttachment[i];
        }
    }

    public GiftVotesAttachment(int i, Image image) {
        this.b = i;
        this.c = image;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.i0(this.c);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GiftVotesAttachment)) {
            return false;
        }
        GiftVotesAttachment giftVotesAttachment = (GiftVotesAttachment) obj;
        return this.b == giftVotesAttachment.b && epx.f(this.c, giftVotesAttachment.c);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.b) * 31;
        Image image = this.c;
        return hashCode + (image == null ? 0 : image.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GiftVotesAttachment(amount=");
        sb.append(this.b);
        sb.append(", image=");
        return er.d(sb, this.c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    public GiftVotesAttachment(Serializer serializer) {
        this(serializer.u(), (Image) serializer.G(Image.class.getClassLoader()));
    }
}
