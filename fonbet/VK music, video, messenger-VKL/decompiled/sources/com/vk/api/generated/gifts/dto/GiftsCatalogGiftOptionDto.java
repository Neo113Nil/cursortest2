package com.vk.api.generated.gifts.dto;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;

/* compiled from: GiftsCatalogGiftOptionDto.kt */
/* loaded from: classes14.dex */
public final class GiftsCatalogGiftOptionDto implements Parcelable {
    public static final Parcelable.Creator<GiftsCatalogGiftOptionDto> CREATOR = new a();

    @pmi0("gift_id")
    private final int giftId;

    @pmi0("is_enabled")
    private final boolean isEnabled;

    @pmi0("title")
    private final String title;

    /* compiled from: GiftsCatalogGiftOptionDto.kt */
    public static final class a implements Parcelable.Creator<GiftsCatalogGiftOptionDto> {
        @Override // android.os.Parcelable.Creator
        public final GiftsCatalogGiftOptionDto createFromParcel(Parcel parcel) {
            return new GiftsCatalogGiftOptionDto(parcel.readInt(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final GiftsCatalogGiftOptionDto[] newArray(int i) {
            return new GiftsCatalogGiftOptionDto[i];
        }
    }

    public GiftsCatalogGiftOptionDto(int i, String str, boolean z) {
        this.giftId = i;
        this.title = str;
        this.isEnabled = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GiftsCatalogGiftOptionDto)) {
            return false;
        }
        GiftsCatalogGiftOptionDto giftsCatalogGiftOptionDto = (GiftsCatalogGiftOptionDto) obj;
        return this.giftId == giftsCatalogGiftOptionDto.giftId && epx.f(this.title, giftsCatalogGiftOptionDto.title) && this.isEnabled == giftsCatalogGiftOptionDto.isEnabled;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isEnabled) + urd0.a(Integer.hashCode(this.giftId) * 31, 31, this.title);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GiftsCatalogGiftOptionDto(giftId=");
        sb.append(this.giftId);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", isEnabled=");
        return q0.a(sb, this.isEnabled, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.giftId);
        parcel.writeString(this.title);
        parcel.writeInt(this.isEnabled ? 1 : 0);
    }
}
