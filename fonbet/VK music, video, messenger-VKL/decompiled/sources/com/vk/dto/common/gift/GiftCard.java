package com.vk.dto.common.gift;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.gift.GiftBackground;
import defpackage.q0;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONObject;
import xsna.epx;
import xsna.fw3;
import xsna.zcl;

/* compiled from: GiftCard.kt */
/* loaded from: classes18.dex */
public final class GiftCard implements Serializer.StreamParcelable {
    public static final Serializer.c<GiftCard> CREATOR = new b();
    public final int b;
    public final List<GiftBackground> c;
    public final boolean d;

    /* compiled from: GiftCard.kt */
    public static final class a {
        public static GiftCard a(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            int i = jSONObject.getInt("nominal");
            Serializer.c<GiftBackground> cVar = GiftBackground.CREATOR;
            return new GiftCard(i, GiftBackground.a.b(jSONObject.optJSONArray("backgrounds")), jSONObject.optBoolean("is_nominal_private", false));
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<GiftCard> {
        @Override // com.vk.core.serialize.Serializer.c
        public final GiftCard a(Serializer serializer) {
            return new GiftCard(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new GiftCard[i];
        }
    }

    public GiftCard(int i, List<GiftBackground> list, boolean z) {
        this.b = i;
        this.c = list;
        this.d = z;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.f0(this.c);
        serializer.L(this.d ? (byte) 1 : (byte) 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GiftCard)) {
            return false;
        }
        GiftCard giftCard = (GiftCard) obj;
        return this.b == giftCard.b && epx.f(this.c, giftCard.c) && this.d == giftCard.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + fw3.a(Integer.hashCode(this.b) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GiftCard(nominal=");
        sb.append(this.b);
        sb.append(", backgrounds=");
        sb.append(this.c);
        sb.append(", isNominalPrivate=");
        return q0.a(sb, this.d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    public GiftCard(Serializer serializer) {
        this(serializer.u(), serializer.B(GiftBackground.class.getClassLoader()), serializer.m());
    }

    public GiftCard(int i, List list, boolean z, int i2, zcl zclVar) {
        this(i, (i2 & 2) != 0 ? EmptyList.b : list, (i2 & 4) != 0 ? false : z);
    }
}
