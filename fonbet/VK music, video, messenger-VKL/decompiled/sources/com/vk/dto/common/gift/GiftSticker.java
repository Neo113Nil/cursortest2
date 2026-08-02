package com.vk.dto.common.gift;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import defpackage.q0;
import xsna.zcl;

/* compiled from: GiftSticker.kt */
/* loaded from: classes18.dex */
public final class GiftSticker implements Serializer.StreamParcelable {
    public static final Serializer.c<GiftSticker> CREATOR = new a();
    public final int b;
    public final boolean c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<GiftSticker> {
        @Override // com.vk.core.serialize.Serializer.c
        public final GiftSticker a(Serializer serializer) {
            return new GiftSticker(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new GiftSticker[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GiftSticker() {
        this(0, 0 == true ? 1 : 0, 3, null);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.L(this.c ? (byte) 1 : (byte) 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GiftSticker)) {
            return false;
        }
        GiftSticker giftSticker = (GiftSticker) obj;
        return this.b == giftSticker.b && this.c == giftSticker.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + (Integer.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GiftSticker(stickersProductId=");
        sb.append(this.b);
        sb.append(", isStickersStyle=");
        return q0.a(sb, this.c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    public GiftSticker(int i, boolean z) {
        this.b = i;
        this.c = z;
    }

    public /* synthetic */ GiftSticker(int i, boolean z, int i2, zcl zclVar) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? false : z);
    }

    public GiftSticker(Serializer serializer) {
        this(serializer.u(), serializer.m());
    }
}
