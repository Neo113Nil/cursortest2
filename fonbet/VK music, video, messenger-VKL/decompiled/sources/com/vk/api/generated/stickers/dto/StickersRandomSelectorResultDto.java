package com.vk.api.generated.stickers.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.store.dto.StoreStockItemDto;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.qoy;
import xsna.zcl;

/* compiled from: StickersRandomSelectorResultDto.kt */
/* loaded from: classes15.dex */
public final class StickersRandomSelectorResultDto implements Parcelable {
    public static final Parcelable.Creator<StickersRandomSelectorResultDto> CREATOR = new a();

    @pmi0("id")
    private final String id;

    @pmi0("is_enabled")
    private final boolean isEnabled;

    @pmi0("pack")
    private final StoreStockItemDto pack;

    @pmi0("reason")
    private final String reason;

    /* compiled from: StickersRandomSelectorResultDto.kt */
    public static final class a implements Parcelable.Creator<StickersRandomSelectorResultDto> {
        @Override // android.os.Parcelable.Creator
        public final StickersRandomSelectorResultDto createFromParcel(Parcel parcel) {
            return new StickersRandomSelectorResultDto(parcel.readString(), StoreStockItemDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final StickersRandomSelectorResultDto[] newArray(int i) {
            return new StickersRandomSelectorResultDto[i];
        }
    }

    public StickersRandomSelectorResultDto(String str, StoreStockItemDto storeStockItemDto, boolean z, String str2) {
        this.id = str;
        this.pack = storeStockItemDto;
        this.isEnabled = z;
        this.reason = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickersRandomSelectorResultDto)) {
            return false;
        }
        StickersRandomSelectorResultDto stickersRandomSelectorResultDto = (StickersRandomSelectorResultDto) obj;
        return epx.f(this.id, stickersRandomSelectorResultDto.id) && epx.f(this.pack, stickersRandomSelectorResultDto.pack) && this.isEnabled == stickersRandomSelectorResultDto.isEnabled && epx.f(this.reason, stickersRandomSelectorResultDto.reason);
    }

    public final int hashCode() {
        int b = qoy.b((this.pack.hashCode() + (this.id.hashCode() * 31)) * 31, 31, this.isEnabled);
        String str = this.reason;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickersRandomSelectorResultDto(id=");
        sb.append(this.id);
        sb.append(", pack=");
        sb.append(this.pack);
        sb.append(", isEnabled=");
        sb.append(this.isEnabled);
        sb.append(", reason=");
        return ho8.a(sb, this.reason, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        this.pack.writeToParcel(parcel, i);
        parcel.writeInt(this.isEnabled ? 1 : 0);
        parcel.writeString(this.reason);
    }

    public /* synthetic */ StickersRandomSelectorResultDto(String str, StoreStockItemDto storeStockItemDto, boolean z, String str2, int i, zcl zclVar) {
        this(str, storeStockItemDto, z, (i & 8) != 0 ? null : str2);
    }
}
