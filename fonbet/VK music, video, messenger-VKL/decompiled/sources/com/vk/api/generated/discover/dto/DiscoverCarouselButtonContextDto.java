package com.vk.api.generated.discover.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: DiscoverCarouselButtonContextDto.kt */
/* loaded from: classes14.dex */
public final class DiscoverCarouselButtonContextDto implements Parcelable {
    public static final Parcelable.Creator<DiscoverCarouselButtonContextDto> CREATOR = new a();

    @pmi0("object_id")
    private final int objectId;

    @pmi0("original_url")
    private final String originalUrl;

    @pmi0("view_url")
    private final String viewUrl;

    /* compiled from: DiscoverCarouselButtonContextDto.kt */
    public static final class a implements Parcelable.Creator<DiscoverCarouselButtonContextDto> {
        @Override // android.os.Parcelable.Creator
        public final DiscoverCarouselButtonContextDto createFromParcel(Parcel parcel) {
            return new DiscoverCarouselButtonContextDto(parcel.readInt(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DiscoverCarouselButtonContextDto[] newArray(int i) {
            return new DiscoverCarouselButtonContextDto[i];
        }
    }

    public DiscoverCarouselButtonContextDto(int i, String str, String str2) {
        this.objectId = i;
        this.viewUrl = str;
        this.originalUrl = str2;
    }

    public final int d() {
        return this.objectId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.originalUrl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DiscoverCarouselButtonContextDto)) {
            return false;
        }
        DiscoverCarouselButtonContextDto discoverCarouselButtonContextDto = (DiscoverCarouselButtonContextDto) obj;
        return this.objectId == discoverCarouselButtonContextDto.objectId && epx.f(this.viewUrl, discoverCarouselButtonContextDto.viewUrl) && epx.f(this.originalUrl, discoverCarouselButtonContextDto.originalUrl);
    }

    public final String f() {
        return this.viewUrl;
    }

    public final int hashCode() {
        int a2 = urd0.a(Integer.hashCode(this.objectId) * 31, 31, this.viewUrl);
        String str = this.originalUrl;
        return a2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DiscoverCarouselButtonContextDto(objectId=");
        sb.append(this.objectId);
        sb.append(", viewUrl=");
        sb.append(this.viewUrl);
        sb.append(", originalUrl=");
        return ho8.a(sb, this.originalUrl, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.objectId);
        parcel.writeString(this.viewUrl);
        parcel.writeString(this.originalUrl);
    }

    public /* synthetic */ DiscoverCarouselButtonContextDto(int i, String str, String str2, int i2, zcl zclVar) {
        this(i, str, (i2 & 4) != 0 ? null : str2);
    }
}
