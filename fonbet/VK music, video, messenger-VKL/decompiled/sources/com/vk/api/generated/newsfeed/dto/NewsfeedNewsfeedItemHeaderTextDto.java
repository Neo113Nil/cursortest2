package com.vk.api.generated.newsfeed.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: NewsfeedNewsfeedItemHeaderTextDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedNewsfeedItemHeaderTextDto implements Parcelable {
    public static final Parcelable.Creator<NewsfeedNewsfeedItemHeaderTextDto> CREATOR = new a();

    @pmi0("color")
    private final NewsfeedNewsfeedItemColorDto color;

    @pmi0("text")
    private final String text;

    /* compiled from: NewsfeedNewsfeedItemHeaderTextDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedNewsfeedItemHeaderTextDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedNewsfeedItemHeaderTextDto createFromParcel(Parcel parcel) {
            return new NewsfeedNewsfeedItemHeaderTextDto(parcel.readString(), parcel.readInt() == 0 ? null : NewsfeedNewsfeedItemColorDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedNewsfeedItemHeaderTextDto[] newArray(int i) {
            return new NewsfeedNewsfeedItemHeaderTextDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NewsfeedNewsfeedItemHeaderTextDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final NewsfeedNewsfeedItemColorDto d() {
        return this.color;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.text;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedNewsfeedItemHeaderTextDto)) {
            return false;
        }
        NewsfeedNewsfeedItemHeaderTextDto newsfeedNewsfeedItemHeaderTextDto = (NewsfeedNewsfeedItemHeaderTextDto) obj;
        return epx.f(this.text, newsfeedNewsfeedItemHeaderTextDto.text) && epx.f(this.color, newsfeedNewsfeedItemHeaderTextDto.color);
    }

    public final int hashCode() {
        String str = this.text;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        NewsfeedNewsfeedItemColorDto newsfeedNewsfeedItemColorDto = this.color;
        return hashCode + (newsfeedNewsfeedItemColorDto != null ? newsfeedNewsfeedItemColorDto.hashCode() : 0);
    }

    public final String toString() {
        return "NewsfeedNewsfeedItemHeaderTextDto(text=" + this.text + ", color=" + this.color + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.text);
        NewsfeedNewsfeedItemColorDto newsfeedNewsfeedItemColorDto = this.color;
        if (newsfeedNewsfeedItemColorDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            newsfeedNewsfeedItemColorDto.writeToParcel(parcel, i);
        }
    }

    public NewsfeedNewsfeedItemHeaderTextDto(String str, NewsfeedNewsfeedItemColorDto newsfeedNewsfeedItemColorDto) {
        this.text = str;
        this.color = newsfeedNewsfeedItemColorDto;
    }

    public /* synthetic */ NewsfeedNewsfeedItemHeaderTextDto(String str, NewsfeedNewsfeedItemColorDto newsfeedNewsfeedItemColorDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : newsfeedNewsfeedItemColorDto);
    }
}
