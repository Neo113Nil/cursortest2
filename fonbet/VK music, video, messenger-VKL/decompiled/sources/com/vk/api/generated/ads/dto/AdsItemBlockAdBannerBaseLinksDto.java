package com.vk.api.generated.ads.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AdsItemBlockAdBannerBaseLinksDto.kt */
/* loaded from: classes14.dex */
public final class AdsItemBlockAdBannerBaseLinksDto implements Parcelable {
    public static final Parcelable.Creator<AdsItemBlockAdBannerBaseLinksDto> CREATOR = new a();

    @pmi0("button")
    private final AdsItemBlockAdBannerBaseLinkDto button;

    @pmi0("footer")
    private final AdsItemBlockAdBannerBaseLinkDto footer;

    @pmi0("header")
    private final AdsItemBlockAdBannerBaseLinkDto header;

    @pmi0("image")
    private final AdsItemBlockAdBannerBaseLinkDto image;

    @pmi0("text")
    private final AdsItemBlockAdBannerBaseLinkDto text;

    /* compiled from: AdsItemBlockAdBannerBaseLinksDto.kt */
    public static final class a implements Parcelable.Creator<AdsItemBlockAdBannerBaseLinksDto> {
        @Override // android.os.Parcelable.Creator
        public final AdsItemBlockAdBannerBaseLinksDto createFromParcel(Parcel parcel) {
            return new AdsItemBlockAdBannerBaseLinksDto(parcel.readInt() == 0 ? null : AdsItemBlockAdBannerBaseLinkDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AdsItemBlockAdBannerBaseLinkDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AdsItemBlockAdBannerBaseLinkDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AdsItemBlockAdBannerBaseLinkDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AdsItemBlockAdBannerBaseLinkDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final AdsItemBlockAdBannerBaseLinksDto[] newArray(int i) {
            return new AdsItemBlockAdBannerBaseLinksDto[i];
        }
    }

    public AdsItemBlockAdBannerBaseLinksDto() {
        this(null, null, null, null, null, 31, null);
    }

    public final AdsItemBlockAdBannerBaseLinkDto d() {
        return this.button;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final AdsItemBlockAdBannerBaseLinkDto e() {
        return this.footer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsItemBlockAdBannerBaseLinksDto)) {
            return false;
        }
        AdsItemBlockAdBannerBaseLinksDto adsItemBlockAdBannerBaseLinksDto = (AdsItemBlockAdBannerBaseLinksDto) obj;
        return epx.f(this.header, adsItemBlockAdBannerBaseLinksDto.header) && epx.f(this.text, adsItemBlockAdBannerBaseLinksDto.text) && epx.f(this.image, adsItemBlockAdBannerBaseLinksDto.image) && epx.f(this.footer, adsItemBlockAdBannerBaseLinksDto.footer) && epx.f(this.button, adsItemBlockAdBannerBaseLinksDto.button);
    }

    public final AdsItemBlockAdBannerBaseLinkDto f() {
        return this.header;
    }

    public final AdsItemBlockAdBannerBaseLinkDto g() {
        return this.image;
    }

    public final int hashCode() {
        AdsItemBlockAdBannerBaseLinkDto adsItemBlockAdBannerBaseLinkDto = this.header;
        int hashCode = (adsItemBlockAdBannerBaseLinkDto == null ? 0 : adsItemBlockAdBannerBaseLinkDto.hashCode()) * 31;
        AdsItemBlockAdBannerBaseLinkDto adsItemBlockAdBannerBaseLinkDto2 = this.text;
        int hashCode2 = (hashCode + (adsItemBlockAdBannerBaseLinkDto2 == null ? 0 : adsItemBlockAdBannerBaseLinkDto2.hashCode())) * 31;
        AdsItemBlockAdBannerBaseLinkDto adsItemBlockAdBannerBaseLinkDto3 = this.image;
        int hashCode3 = (hashCode2 + (adsItemBlockAdBannerBaseLinkDto3 == null ? 0 : adsItemBlockAdBannerBaseLinkDto3.hashCode())) * 31;
        AdsItemBlockAdBannerBaseLinkDto adsItemBlockAdBannerBaseLinkDto4 = this.footer;
        int hashCode4 = (hashCode3 + (adsItemBlockAdBannerBaseLinkDto4 == null ? 0 : adsItemBlockAdBannerBaseLinkDto4.hashCode())) * 31;
        AdsItemBlockAdBannerBaseLinkDto adsItemBlockAdBannerBaseLinkDto5 = this.button;
        return hashCode4 + (adsItemBlockAdBannerBaseLinkDto5 != null ? adsItemBlockAdBannerBaseLinkDto5.hashCode() : 0);
    }

    public final AdsItemBlockAdBannerBaseLinkDto i() {
        return this.text;
    }

    public final String toString() {
        return "AdsItemBlockAdBannerBaseLinksDto(header=" + this.header + ", text=" + this.text + ", image=" + this.image + ", footer=" + this.footer + ", button=" + this.button + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AdsItemBlockAdBannerBaseLinkDto adsItemBlockAdBannerBaseLinkDto = this.header;
        if (adsItemBlockAdBannerBaseLinkDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            adsItemBlockAdBannerBaseLinkDto.writeToParcel(parcel, i);
        }
        AdsItemBlockAdBannerBaseLinkDto adsItemBlockAdBannerBaseLinkDto2 = this.text;
        if (adsItemBlockAdBannerBaseLinkDto2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            adsItemBlockAdBannerBaseLinkDto2.writeToParcel(parcel, i);
        }
        AdsItemBlockAdBannerBaseLinkDto adsItemBlockAdBannerBaseLinkDto3 = this.image;
        if (adsItemBlockAdBannerBaseLinkDto3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            adsItemBlockAdBannerBaseLinkDto3.writeToParcel(parcel, i);
        }
        AdsItemBlockAdBannerBaseLinkDto adsItemBlockAdBannerBaseLinkDto4 = this.footer;
        if (adsItemBlockAdBannerBaseLinkDto4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            adsItemBlockAdBannerBaseLinkDto4.writeToParcel(parcel, i);
        }
        AdsItemBlockAdBannerBaseLinkDto adsItemBlockAdBannerBaseLinkDto5 = this.button;
        if (adsItemBlockAdBannerBaseLinkDto5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            adsItemBlockAdBannerBaseLinkDto5.writeToParcel(parcel, i);
        }
    }

    public AdsItemBlockAdBannerBaseLinksDto(AdsItemBlockAdBannerBaseLinkDto adsItemBlockAdBannerBaseLinkDto, AdsItemBlockAdBannerBaseLinkDto adsItemBlockAdBannerBaseLinkDto2, AdsItemBlockAdBannerBaseLinkDto adsItemBlockAdBannerBaseLinkDto3, AdsItemBlockAdBannerBaseLinkDto adsItemBlockAdBannerBaseLinkDto4, AdsItemBlockAdBannerBaseLinkDto adsItemBlockAdBannerBaseLinkDto5) {
        this.header = adsItemBlockAdBannerBaseLinkDto;
        this.text = adsItemBlockAdBannerBaseLinkDto2;
        this.image = adsItemBlockAdBannerBaseLinkDto3;
        this.footer = adsItemBlockAdBannerBaseLinkDto4;
        this.button = adsItemBlockAdBannerBaseLinkDto5;
    }

    public /* synthetic */ AdsItemBlockAdBannerBaseLinksDto(AdsItemBlockAdBannerBaseLinkDto adsItemBlockAdBannerBaseLinkDto, AdsItemBlockAdBannerBaseLinkDto adsItemBlockAdBannerBaseLinkDto2, AdsItemBlockAdBannerBaseLinkDto adsItemBlockAdBannerBaseLinkDto3, AdsItemBlockAdBannerBaseLinkDto adsItemBlockAdBannerBaseLinkDto4, AdsItemBlockAdBannerBaseLinkDto adsItemBlockAdBannerBaseLinkDto5, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : adsItemBlockAdBannerBaseLinkDto, (i & 2) != 0 ? null : adsItemBlockAdBannerBaseLinkDto2, (i & 4) != 0 ? null : adsItemBlockAdBannerBaseLinkDto3, (i & 8) != 0 ? null : adsItemBlockAdBannerBaseLinkDto4, (i & 16) != 0 ? null : adsItemBlockAdBannerBaseLinkDto5);
    }
}
