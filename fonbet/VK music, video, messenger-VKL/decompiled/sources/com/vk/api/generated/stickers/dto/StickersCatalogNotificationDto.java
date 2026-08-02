package com.vk.api.generated.stickers.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;

/* compiled from: StickersCatalogNotificationDto.kt */
/* loaded from: classes15.dex */
public final class StickersCatalogNotificationDto implements Parcelable {
    public static final Parcelable.Creator<StickersCatalogNotificationDto> CREATOR = new a();

    @pmi0("id")
    private final int id;

    @pmi0("store_stickers")
    private final StickersCatalogNotificationEntryDto storeStickers;

    @pmi0("type")
    private final String type;

    /* compiled from: StickersCatalogNotificationDto.kt */
    public static final class a implements Parcelable.Creator<StickersCatalogNotificationDto> {
        @Override // android.os.Parcelable.Creator
        public final StickersCatalogNotificationDto createFromParcel(Parcel parcel) {
            return new StickersCatalogNotificationDto(parcel.readInt(), parcel.readString(), StickersCatalogNotificationEntryDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final StickersCatalogNotificationDto[] newArray(int i) {
            return new StickersCatalogNotificationDto[i];
        }
    }

    public StickersCatalogNotificationDto(int i, String str, StickersCatalogNotificationEntryDto stickersCatalogNotificationEntryDto) {
        this.id = i;
        this.type = str;
        this.storeStickers = stickersCatalogNotificationEntryDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickersCatalogNotificationDto)) {
            return false;
        }
        StickersCatalogNotificationDto stickersCatalogNotificationDto = (StickersCatalogNotificationDto) obj;
        return this.id == stickersCatalogNotificationDto.id && epx.f(this.type, stickersCatalogNotificationDto.type) && epx.f(this.storeStickers, stickersCatalogNotificationDto.storeStickers);
    }

    public final int hashCode() {
        return this.storeStickers.hashCode() + urd0.a(Integer.hashCode(this.id) * 31, 31, this.type);
    }

    public final String toString() {
        return "StickersCatalogNotificationDto(id=" + this.id + ", type=" + this.type + ", storeStickers=" + this.storeStickers + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.type);
        this.storeStickers.writeToParcel(parcel, i);
    }
}
