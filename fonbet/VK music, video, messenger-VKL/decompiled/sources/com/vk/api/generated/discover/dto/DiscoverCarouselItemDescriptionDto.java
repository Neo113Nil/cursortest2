package com.vk.api.generated.discover.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: DiscoverCarouselItemDescriptionDto.kt */
/* loaded from: classes14.dex */
public final class DiscoverCarouselItemDescriptionDto implements Parcelable {
    public static final Parcelable.Creator<DiscoverCarouselItemDescriptionDto> CREATOR = new a();

    @pmi0("text")
    private final String text;

    @pmi0("type")
    private final DiscoverCarouselItemDescriptionTypeDto type;

    /* compiled from: DiscoverCarouselItemDescriptionDto.kt */
    public static final class a implements Parcelable.Creator<DiscoverCarouselItemDescriptionDto> {
        @Override // android.os.Parcelable.Creator
        public final DiscoverCarouselItemDescriptionDto createFromParcel(Parcel parcel) {
            return new DiscoverCarouselItemDescriptionDto(parcel.readString(), parcel.readInt() == 0 ? null : DiscoverCarouselItemDescriptionTypeDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final DiscoverCarouselItemDescriptionDto[] newArray(int i) {
            return new DiscoverCarouselItemDescriptionDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DiscoverCarouselItemDescriptionDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final String d() {
        return this.text;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final DiscoverCarouselItemDescriptionTypeDto e() {
        return this.type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DiscoverCarouselItemDescriptionDto)) {
            return false;
        }
        DiscoverCarouselItemDescriptionDto discoverCarouselItemDescriptionDto = (DiscoverCarouselItemDescriptionDto) obj;
        return epx.f(this.text, discoverCarouselItemDescriptionDto.text) && this.type == discoverCarouselItemDescriptionDto.type;
    }

    public final int hashCode() {
        String str = this.text;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        DiscoverCarouselItemDescriptionTypeDto discoverCarouselItemDescriptionTypeDto = this.type;
        return hashCode + (discoverCarouselItemDescriptionTypeDto != null ? discoverCarouselItemDescriptionTypeDto.hashCode() : 0);
    }

    public final String toString() {
        return "DiscoverCarouselItemDescriptionDto(text=" + this.text + ", type=" + this.type + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.text);
        DiscoverCarouselItemDescriptionTypeDto discoverCarouselItemDescriptionTypeDto = this.type;
        if (discoverCarouselItemDescriptionTypeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            discoverCarouselItemDescriptionTypeDto.writeToParcel(parcel, i);
        }
    }

    public DiscoverCarouselItemDescriptionDto(String str, DiscoverCarouselItemDescriptionTypeDto discoverCarouselItemDescriptionTypeDto) {
        this.text = str;
        this.type = discoverCarouselItemDescriptionTypeDto;
    }

    public /* synthetic */ DiscoverCarouselItemDescriptionDto(String str, DiscoverCarouselItemDescriptionTypeDto discoverCarouselItemDescriptionTypeDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : discoverCarouselItemDescriptionTypeDto);
    }
}
