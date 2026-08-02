package com.vk.api.generated.newsfeed.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: NewsfeedNewsfeedItemHeaderOverlayImageDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedNewsfeedItemHeaderOverlayImageDto implements Parcelable {
    public static final Parcelable.Creator<NewsfeedNewsfeedItemHeaderOverlayImageDto> CREATOR = new a();

    @pmi0("action")
    private final NewsfeedNewsfeedItemHeaderActionDto action;

    @pmi0("image")
    private final NewsfeedNewsfeedItemHeaderImageDto image;

    /* compiled from: NewsfeedNewsfeedItemHeaderOverlayImageDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedNewsfeedItemHeaderOverlayImageDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedNewsfeedItemHeaderOverlayImageDto createFromParcel(Parcel parcel) {
            return new NewsfeedNewsfeedItemHeaderOverlayImageDto(parcel.readInt() == 0 ? null : NewsfeedNewsfeedItemHeaderImageDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? NewsfeedNewsfeedItemHeaderActionDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedNewsfeedItemHeaderOverlayImageDto[] newArray(int i) {
            return new NewsfeedNewsfeedItemHeaderOverlayImageDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NewsfeedNewsfeedItemHeaderOverlayImageDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final NewsfeedNewsfeedItemHeaderActionDto d() {
        return this.action;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final NewsfeedNewsfeedItemHeaderImageDto e() {
        return this.image;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedNewsfeedItemHeaderOverlayImageDto)) {
            return false;
        }
        NewsfeedNewsfeedItemHeaderOverlayImageDto newsfeedNewsfeedItemHeaderOverlayImageDto = (NewsfeedNewsfeedItemHeaderOverlayImageDto) obj;
        return epx.f(this.image, newsfeedNewsfeedItemHeaderOverlayImageDto.image) && epx.f(this.action, newsfeedNewsfeedItemHeaderOverlayImageDto.action);
    }

    public final int hashCode() {
        NewsfeedNewsfeedItemHeaderImageDto newsfeedNewsfeedItemHeaderImageDto = this.image;
        int hashCode = (newsfeedNewsfeedItemHeaderImageDto == null ? 0 : newsfeedNewsfeedItemHeaderImageDto.hashCode()) * 31;
        NewsfeedNewsfeedItemHeaderActionDto newsfeedNewsfeedItemHeaderActionDto = this.action;
        return hashCode + (newsfeedNewsfeedItemHeaderActionDto != null ? newsfeedNewsfeedItemHeaderActionDto.hashCode() : 0);
    }

    public final String toString() {
        return "NewsfeedNewsfeedItemHeaderOverlayImageDto(image=" + this.image + ", action=" + this.action + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        NewsfeedNewsfeedItemHeaderImageDto newsfeedNewsfeedItemHeaderImageDto = this.image;
        if (newsfeedNewsfeedItemHeaderImageDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            newsfeedNewsfeedItemHeaderImageDto.writeToParcel(parcel, i);
        }
        NewsfeedNewsfeedItemHeaderActionDto newsfeedNewsfeedItemHeaderActionDto = this.action;
        if (newsfeedNewsfeedItemHeaderActionDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            newsfeedNewsfeedItemHeaderActionDto.writeToParcel(parcel, i);
        }
    }

    public NewsfeedNewsfeedItemHeaderOverlayImageDto(NewsfeedNewsfeedItemHeaderImageDto newsfeedNewsfeedItemHeaderImageDto, NewsfeedNewsfeedItemHeaderActionDto newsfeedNewsfeedItemHeaderActionDto) {
        this.image = newsfeedNewsfeedItemHeaderImageDto;
        this.action = newsfeedNewsfeedItemHeaderActionDto;
    }

    public /* synthetic */ NewsfeedNewsfeedItemHeaderOverlayImageDto(NewsfeedNewsfeedItemHeaderImageDto newsfeedNewsfeedItemHeaderImageDto, NewsfeedNewsfeedItemHeaderActionDto newsfeedNewsfeedItemHeaderActionDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : newsfeedNewsfeedItemHeaderImageDto, (i & 2) != 0 ? null : newsfeedNewsfeedItemHeaderActionDto);
    }
}
