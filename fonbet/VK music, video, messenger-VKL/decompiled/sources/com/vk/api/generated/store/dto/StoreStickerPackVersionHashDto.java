package com.vk.api.generated.store.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: StoreStickerPackVersionHashDto.kt */
/* loaded from: classes15.dex */
public final class StoreStickerPackVersionHashDto implements Parcelable {
    public static final Parcelable.Creator<StoreStickerPackVersionHashDto> CREATOR = new a();

    @pmi0("hash")
    private final String hash;

    @pmi0("pack_id")
    private final Integer packId;

    /* compiled from: StoreStickerPackVersionHashDto.kt */
    public static final class a implements Parcelable.Creator<StoreStickerPackVersionHashDto> {
        @Override // android.os.Parcelable.Creator
        public final StoreStickerPackVersionHashDto createFromParcel(Parcel parcel) {
            return new StoreStickerPackVersionHashDto(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final StoreStickerPackVersionHashDto[] newArray(int i) {
            return new StoreStickerPackVersionHashDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StoreStickerPackVersionHashDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final String d() {
        return this.hash;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Integer e() {
        return this.packId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoreStickerPackVersionHashDto)) {
            return false;
        }
        StoreStickerPackVersionHashDto storeStickerPackVersionHashDto = (StoreStickerPackVersionHashDto) obj;
        return epx.f(this.packId, storeStickerPackVersionHashDto.packId) && epx.f(this.hash, storeStickerPackVersionHashDto.hash);
    }

    public final int hashCode() {
        Integer num = this.packId;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.hash;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoreStickerPackVersionHashDto(packId=");
        sb.append(this.packId);
        sb.append(", hash=");
        return ho8.a(sb, this.hash, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.packId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.hash);
    }

    public StoreStickerPackVersionHashDto(Integer num, String str) {
        this.packId = num;
        this.hash = str;
    }

    public /* synthetic */ StoreStickerPackVersionHashDto(Integer num, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str);
    }
}
