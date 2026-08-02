package com.vk.api.generated.discover.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: DiscoverCarouselButtonActionDto.kt */
/* loaded from: classes14.dex */
public final class DiscoverCarouselButtonActionDto implements Parcelable {
    public static final Parcelable.Creator<DiscoverCarouselButtonActionDto> CREATOR = new a();

    @pmi0("context")
    private final DiscoverCarouselButtonContextDto context;

    @pmi0("target")
    private final DiscoverCarouselButtonActionTargetDto target;

    @pmi0("type")
    private final DiscoverCarouselButtonActionTypeDto type;

    @pmi0("url")
    private final String url;

    /* compiled from: DiscoverCarouselButtonActionDto.kt */
    public static final class a implements Parcelable.Creator<DiscoverCarouselButtonActionDto> {
        @Override // android.os.Parcelable.Creator
        public final DiscoverCarouselButtonActionDto createFromParcel(Parcel parcel) {
            return new DiscoverCarouselButtonActionDto(DiscoverCarouselButtonActionTypeDto.CREATOR.createFromParcel(parcel), (DiscoverCarouselButtonContextDto) parcel.readParcelable(DiscoverCarouselButtonActionDto.class.getClassLoader()), parcel.readInt() == 0 ? null : DiscoverCarouselButtonActionTargetDto.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DiscoverCarouselButtonActionDto[] newArray(int i) {
            return new DiscoverCarouselButtonActionDto[i];
        }
    }

    public DiscoverCarouselButtonActionDto(DiscoverCarouselButtonActionTypeDto discoverCarouselButtonActionTypeDto, DiscoverCarouselButtonContextDto discoverCarouselButtonContextDto, DiscoverCarouselButtonActionTargetDto discoverCarouselButtonActionTargetDto, String str) {
        this.type = discoverCarouselButtonActionTypeDto;
        this.context = discoverCarouselButtonContextDto;
        this.target = discoverCarouselButtonActionTargetDto;
        this.url = str;
    }

    public final DiscoverCarouselButtonContextDto d() {
        return this.context;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final DiscoverCarouselButtonActionTypeDto e() {
        return this.type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DiscoverCarouselButtonActionDto)) {
            return false;
        }
        DiscoverCarouselButtonActionDto discoverCarouselButtonActionDto = (DiscoverCarouselButtonActionDto) obj;
        return this.type == discoverCarouselButtonActionDto.type && epx.f(this.context, discoverCarouselButtonActionDto.context) && this.target == discoverCarouselButtonActionDto.target && epx.f(this.url, discoverCarouselButtonActionDto.url);
    }

    public final String getUrl() {
        return this.url;
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        DiscoverCarouselButtonContextDto discoverCarouselButtonContextDto = this.context;
        int hashCode2 = (hashCode + (discoverCarouselButtonContextDto == null ? 0 : discoverCarouselButtonContextDto.hashCode())) * 31;
        DiscoverCarouselButtonActionTargetDto discoverCarouselButtonActionTargetDto = this.target;
        int hashCode3 = (hashCode2 + (discoverCarouselButtonActionTargetDto == null ? 0 : discoverCarouselButtonActionTargetDto.hashCode())) * 31;
        String str = this.url;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DiscoverCarouselButtonActionDto(type=");
        sb.append(this.type);
        sb.append(", context=");
        sb.append(this.context);
        sb.append(", target=");
        sb.append(this.target);
        sb.append(", url=");
        return ho8.a(sb, this.url, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.type.writeToParcel(parcel, i);
        parcel.writeParcelable(this.context, i);
        DiscoverCarouselButtonActionTargetDto discoverCarouselButtonActionTargetDto = this.target;
        if (discoverCarouselButtonActionTargetDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            discoverCarouselButtonActionTargetDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.url);
    }

    public /* synthetic */ DiscoverCarouselButtonActionDto(DiscoverCarouselButtonActionTypeDto discoverCarouselButtonActionTypeDto, DiscoverCarouselButtonContextDto discoverCarouselButtonContextDto, DiscoverCarouselButtonActionTargetDto discoverCarouselButtonActionTargetDto, String str, int i, zcl zclVar) {
        this(discoverCarouselButtonActionTypeDto, (i & 2) != 0 ? null : discoverCarouselButtonContextDto, (i & 4) != 0 ? null : discoverCarouselButtonActionTargetDto, (i & 8) != 0 ? null : str);
    }
}
