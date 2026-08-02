package com.vk.api.generated.newsfeed.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: NewsfeedInfoBlockPopupDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedInfoBlockPopupDto implements Parcelable {
    public static final Parcelable.Creator<NewsfeedInfoBlockPopupDto> CREATOR = new a();

    @pmi0("button")
    private final NewsfeedInfoBlockButtonDto button;

    @pmi0("image")
    private final NewsfeedNewsfeedItemHeaderImageDto image;

    @pmi0("text")
    private final String text;

    /* compiled from: NewsfeedInfoBlockPopupDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedInfoBlockPopupDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedInfoBlockPopupDto createFromParcel(Parcel parcel) {
            return new NewsfeedInfoBlockPopupDto(parcel.readString(), (NewsfeedNewsfeedItemHeaderImageDto) parcel.readParcelable(NewsfeedInfoBlockPopupDto.class.getClassLoader()), parcel.readInt() == 0 ? null : NewsfeedInfoBlockButtonDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedInfoBlockPopupDto[] newArray(int i) {
            return new NewsfeedInfoBlockPopupDto[i];
        }
    }

    public NewsfeedInfoBlockPopupDto(String str, NewsfeedNewsfeedItemHeaderImageDto newsfeedNewsfeedItemHeaderImageDto, NewsfeedInfoBlockButtonDto newsfeedInfoBlockButtonDto) {
        this.text = str;
        this.image = newsfeedNewsfeedItemHeaderImageDto;
        this.button = newsfeedInfoBlockButtonDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedInfoBlockPopupDto)) {
            return false;
        }
        NewsfeedInfoBlockPopupDto newsfeedInfoBlockPopupDto = (NewsfeedInfoBlockPopupDto) obj;
        return epx.f(this.text, newsfeedInfoBlockPopupDto.text) && epx.f(this.image, newsfeedInfoBlockPopupDto.image) && epx.f(this.button, newsfeedInfoBlockPopupDto.button);
    }

    public final int hashCode() {
        int hashCode = this.text.hashCode() * 31;
        NewsfeedNewsfeedItemHeaderImageDto newsfeedNewsfeedItemHeaderImageDto = this.image;
        int hashCode2 = (hashCode + (newsfeedNewsfeedItemHeaderImageDto == null ? 0 : newsfeedNewsfeedItemHeaderImageDto.hashCode())) * 31;
        NewsfeedInfoBlockButtonDto newsfeedInfoBlockButtonDto = this.button;
        return hashCode2 + (newsfeedInfoBlockButtonDto != null ? newsfeedInfoBlockButtonDto.hashCode() : 0);
    }

    public final String toString() {
        return "NewsfeedInfoBlockPopupDto(text=" + this.text + ", image=" + this.image + ", button=" + this.button + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.text);
        parcel.writeParcelable(this.image, i);
        NewsfeedInfoBlockButtonDto newsfeedInfoBlockButtonDto = this.button;
        if (newsfeedInfoBlockButtonDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            newsfeedInfoBlockButtonDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ NewsfeedInfoBlockPopupDto(String str, NewsfeedNewsfeedItemHeaderImageDto newsfeedNewsfeedItemHeaderImageDto, NewsfeedInfoBlockButtonDto newsfeedInfoBlockButtonDto, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : newsfeedNewsfeedItemHeaderImageDto, (i & 4) != 0 ? null : newsfeedInfoBlockButtonDto);
    }
}
