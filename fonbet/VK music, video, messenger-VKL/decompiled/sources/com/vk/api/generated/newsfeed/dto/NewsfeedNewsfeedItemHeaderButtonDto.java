package com.vk.api.generated.newsfeed.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: NewsfeedNewsfeedItemHeaderButtonDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedNewsfeedItemHeaderButtonDto implements Parcelable {
    public static final Parcelable.Creator<NewsfeedNewsfeedItemHeaderButtonDto> CREATOR = new a();

    @pmi0("action")
    private final NewsfeedNewsfeedItemHeaderActionDto action;

    @pmi0("background_color")
    private final NewsfeedNewsfeedItemColorDto backgroundColor;

    @pmi0("text")
    private final NewsfeedNewsfeedItemHeaderTextDto text;

    /* compiled from: NewsfeedNewsfeedItemHeaderButtonDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedNewsfeedItemHeaderButtonDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedNewsfeedItemHeaderButtonDto createFromParcel(Parcel parcel) {
            return new NewsfeedNewsfeedItemHeaderButtonDto(NewsfeedNewsfeedItemHeaderTextDto.CREATOR.createFromParcel(parcel), NewsfeedNewsfeedItemHeaderActionDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : NewsfeedNewsfeedItemColorDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedNewsfeedItemHeaderButtonDto[] newArray(int i) {
            return new NewsfeedNewsfeedItemHeaderButtonDto[i];
        }
    }

    public NewsfeedNewsfeedItemHeaderButtonDto(NewsfeedNewsfeedItemHeaderTextDto newsfeedNewsfeedItemHeaderTextDto, NewsfeedNewsfeedItemHeaderActionDto newsfeedNewsfeedItemHeaderActionDto, NewsfeedNewsfeedItemColorDto newsfeedNewsfeedItemColorDto) {
        this.text = newsfeedNewsfeedItemHeaderTextDto;
        this.action = newsfeedNewsfeedItemHeaderActionDto;
        this.backgroundColor = newsfeedNewsfeedItemColorDto;
    }

    public final NewsfeedNewsfeedItemHeaderActionDto d() {
        return this.action;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final NewsfeedNewsfeedItemColorDto e() {
        return this.backgroundColor;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedNewsfeedItemHeaderButtonDto)) {
            return false;
        }
        NewsfeedNewsfeedItemHeaderButtonDto newsfeedNewsfeedItemHeaderButtonDto = (NewsfeedNewsfeedItemHeaderButtonDto) obj;
        return epx.f(this.text, newsfeedNewsfeedItemHeaderButtonDto.text) && epx.f(this.action, newsfeedNewsfeedItemHeaderButtonDto.action) && epx.f(this.backgroundColor, newsfeedNewsfeedItemHeaderButtonDto.backgroundColor);
    }

    public final NewsfeedNewsfeedItemHeaderTextDto f() {
        return this.text;
    }

    public final int hashCode() {
        int hashCode = (this.action.hashCode() + (this.text.hashCode() * 31)) * 31;
        NewsfeedNewsfeedItemColorDto newsfeedNewsfeedItemColorDto = this.backgroundColor;
        return hashCode + (newsfeedNewsfeedItemColorDto == null ? 0 : newsfeedNewsfeedItemColorDto.hashCode());
    }

    public final String toString() {
        return "NewsfeedNewsfeedItemHeaderButtonDto(text=" + this.text + ", action=" + this.action + ", backgroundColor=" + this.backgroundColor + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.text.writeToParcel(parcel, i);
        this.action.writeToParcel(parcel, i);
        NewsfeedNewsfeedItemColorDto newsfeedNewsfeedItemColorDto = this.backgroundColor;
        if (newsfeedNewsfeedItemColorDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            newsfeedNewsfeedItemColorDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ NewsfeedNewsfeedItemHeaderButtonDto(NewsfeedNewsfeedItemHeaderTextDto newsfeedNewsfeedItemHeaderTextDto, NewsfeedNewsfeedItemHeaderActionDto newsfeedNewsfeedItemHeaderActionDto, NewsfeedNewsfeedItemColorDto newsfeedNewsfeedItemColorDto, int i, zcl zclVar) {
        this(newsfeedNewsfeedItemHeaderTextDto, newsfeedNewsfeedItemHeaderActionDto, (i & 4) != 0 ? null : newsfeedNewsfeedItemColorDto);
    }
}
