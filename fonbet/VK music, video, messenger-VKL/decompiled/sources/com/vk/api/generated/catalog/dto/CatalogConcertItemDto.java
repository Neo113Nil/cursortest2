package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.audio.dto.AudioConcertDto;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: CatalogConcertItemDto.kt */
/* loaded from: classes14.dex */
public final class CatalogConcertItemDto implements Parcelable {
    public static final Parcelable.Creator<CatalogConcertItemDto> CREATOR = new a();

    @pmi0("concert_data")
    private final AudioConcertDto concertData;

    @pmi0("purchase_action")
    private final CatalogButtonDto purchaseAction;

    @pmi0("track_code")
    private final String trackCode;

    /* compiled from: CatalogConcertItemDto.kt */
    public static final class a implements Parcelable.Creator<CatalogConcertItemDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogConcertItemDto createFromParcel(Parcel parcel) {
            return new CatalogConcertItemDto(AudioConcertDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CatalogButtonDto.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogConcertItemDto[] newArray(int i) {
            return new CatalogConcertItemDto[i];
        }
    }

    public CatalogConcertItemDto(AudioConcertDto audioConcertDto, CatalogButtonDto catalogButtonDto, String str) {
        this.concertData = audioConcertDto;
        this.purchaseAction = catalogButtonDto;
        this.trackCode = str;
    }

    public final AudioConcertDto d() {
        return this.concertData;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final CatalogButtonDto e() {
        return this.purchaseAction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogConcertItemDto)) {
            return false;
        }
        CatalogConcertItemDto catalogConcertItemDto = (CatalogConcertItemDto) obj;
        return epx.f(this.concertData, catalogConcertItemDto.concertData) && epx.f(this.purchaseAction, catalogConcertItemDto.purchaseAction) && epx.f(this.trackCode, catalogConcertItemDto.trackCode);
    }

    public final int hashCode() {
        int hashCode = this.concertData.hashCode() * 31;
        CatalogButtonDto catalogButtonDto = this.purchaseAction;
        int hashCode2 = (hashCode + (catalogButtonDto == null ? 0 : catalogButtonDto.hashCode())) * 31;
        String str = this.trackCode;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String r() {
        return this.trackCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogConcertItemDto(concertData=");
        sb.append(this.concertData);
        sb.append(", purchaseAction=");
        sb.append(this.purchaseAction);
        sb.append(", trackCode=");
        return ho8.a(sb, this.trackCode, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.concertData.writeToParcel(parcel, i);
        CatalogButtonDto catalogButtonDto = this.purchaseAction;
        if (catalogButtonDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            catalogButtonDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.trackCode);
    }

    public /* synthetic */ CatalogConcertItemDto(AudioConcertDto audioConcertDto, CatalogButtonDto catalogButtonDto, String str, int i, zcl zclVar) {
        this(audioConcertDto, (i & 2) != 0 ? null : catalogButtonDto, (i & 4) != 0 ? null : str);
    }
}
