package com.vk.api.generated.newsfeed.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: NewsfeedItemPromoButtonImageDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedItemPromoButtonImageDto implements Parcelable {
    public static final Parcelable.Creator<NewsfeedItemPromoButtonImageDto> CREATOR = new a();

    @pmi0("height")
    private final Integer height;

    @pmi0("url")
    private final String url;

    @pmi0("width")
    private final Integer width;

    /* compiled from: NewsfeedItemPromoButtonImageDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedItemPromoButtonImageDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedItemPromoButtonImageDto createFromParcel(Parcel parcel) {
            return new NewsfeedItemPromoButtonImageDto(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedItemPromoButtonImageDto[] newArray(int i) {
            return new NewsfeedItemPromoButtonImageDto[i];
        }
    }

    public NewsfeedItemPromoButtonImageDto() {
        this(null, null, null, 7, null);
    }

    public final Integer d() {
        return this.height;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Integer e() {
        return this.width;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedItemPromoButtonImageDto)) {
            return false;
        }
        NewsfeedItemPromoButtonImageDto newsfeedItemPromoButtonImageDto = (NewsfeedItemPromoButtonImageDto) obj;
        return epx.f(this.width, newsfeedItemPromoButtonImageDto.width) && epx.f(this.height, newsfeedItemPromoButtonImageDto.height) && epx.f(this.url, newsfeedItemPromoButtonImageDto.url);
    }

    public final String getUrl() {
        return this.url;
    }

    public final int hashCode() {
        Integer num = this.width;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.height;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.url;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NewsfeedItemPromoButtonImageDto(width=");
        sb.append(this.width);
        sb.append(", height=");
        sb.append(this.height);
        sb.append(", url=");
        return ho8.a(sb, this.url, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.width;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.height;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        parcel.writeString(this.url);
    }

    public NewsfeedItemPromoButtonImageDto(Integer num, Integer num2, String str) {
        this.width = num;
        this.height = num2;
        this.url = str;
    }

    public /* synthetic */ NewsfeedItemPromoButtonImageDto(Integer num, Integer num2, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : str);
    }
}
