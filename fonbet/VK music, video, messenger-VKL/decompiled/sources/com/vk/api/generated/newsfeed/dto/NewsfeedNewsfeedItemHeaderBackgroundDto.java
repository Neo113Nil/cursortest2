package com.vk.api.generated.newsfeed.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: NewsfeedNewsfeedItemHeaderBackgroundDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedNewsfeedItemHeaderBackgroundDto implements Parcelable {
    public static final Parcelable.Creator<NewsfeedNewsfeedItemHeaderBackgroundDto> CREATOR = new a();

    @pmi0("color")
    private final NewsfeedNewsfeedItemColorDto color;

    /* compiled from: NewsfeedNewsfeedItemHeaderBackgroundDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedNewsfeedItemHeaderBackgroundDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedNewsfeedItemHeaderBackgroundDto createFromParcel(Parcel parcel) {
            return new NewsfeedNewsfeedItemHeaderBackgroundDto((NewsfeedNewsfeedItemColorDto) parcel.readParcelable(NewsfeedNewsfeedItemHeaderBackgroundDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedNewsfeedItemHeaderBackgroundDto[] newArray(int i) {
            return new NewsfeedNewsfeedItemHeaderBackgroundDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NewsfeedNewsfeedItemHeaderBackgroundDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final NewsfeedNewsfeedItemColorDto d() {
        return this.color;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NewsfeedNewsfeedItemHeaderBackgroundDto) && epx.f(this.color, ((NewsfeedNewsfeedItemHeaderBackgroundDto) obj).color);
    }

    public final int hashCode() {
        NewsfeedNewsfeedItemColorDto newsfeedNewsfeedItemColorDto = this.color;
        if (newsfeedNewsfeedItemColorDto == null) {
            return 0;
        }
        return newsfeedNewsfeedItemColorDto.hashCode();
    }

    public final String toString() {
        return "NewsfeedNewsfeedItemHeaderBackgroundDto(color=" + this.color + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.color, i);
    }

    public NewsfeedNewsfeedItemHeaderBackgroundDto(NewsfeedNewsfeedItemColorDto newsfeedNewsfeedItemColorDto) {
        this.color = newsfeedNewsfeedItemColorDto;
    }

    public /* synthetic */ NewsfeedNewsfeedItemHeaderBackgroundDto(NewsfeedNewsfeedItemColorDto newsfeedNewsfeedItemColorDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : newsfeedNewsfeedItemColorDto);
    }
}
