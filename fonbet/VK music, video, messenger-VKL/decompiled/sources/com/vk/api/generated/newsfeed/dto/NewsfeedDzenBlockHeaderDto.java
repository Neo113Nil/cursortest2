package com.vk.api.generated.newsfeed.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: NewsfeedDzenBlockHeaderDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedDzenBlockHeaderDto implements Parcelable {
    public static final Parcelable.Creator<NewsfeedDzenBlockHeaderDto> CREATOR = new a();

    @pmi0("icon")
    private final NewsfeedNewsfeedItemHeaderImageDto icon;

    @pmi0("title")
    private final String title;

    /* compiled from: NewsfeedDzenBlockHeaderDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedDzenBlockHeaderDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedDzenBlockHeaderDto createFromParcel(Parcel parcel) {
            return new NewsfeedDzenBlockHeaderDto(parcel.readString(), (NewsfeedNewsfeedItemHeaderImageDto) parcel.readParcelable(NewsfeedDzenBlockHeaderDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedDzenBlockHeaderDto[] newArray(int i) {
            return new NewsfeedDzenBlockHeaderDto[i];
        }
    }

    public NewsfeedDzenBlockHeaderDto(String str, NewsfeedNewsfeedItemHeaderImageDto newsfeedNewsfeedItemHeaderImageDto) {
        this.title = str;
        this.icon = newsfeedNewsfeedItemHeaderImageDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedDzenBlockHeaderDto)) {
            return false;
        }
        NewsfeedDzenBlockHeaderDto newsfeedDzenBlockHeaderDto = (NewsfeedDzenBlockHeaderDto) obj;
        return epx.f(this.title, newsfeedDzenBlockHeaderDto.title) && epx.f(this.icon, newsfeedDzenBlockHeaderDto.icon);
    }

    public final int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        NewsfeedNewsfeedItemHeaderImageDto newsfeedNewsfeedItemHeaderImageDto = this.icon;
        return hashCode + (newsfeedNewsfeedItemHeaderImageDto == null ? 0 : newsfeedNewsfeedItemHeaderImageDto.hashCode());
    }

    public final String toString() {
        return "NewsfeedDzenBlockHeaderDto(title=" + this.title + ", icon=" + this.icon + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeParcelable(this.icon, i);
    }

    public /* synthetic */ NewsfeedDzenBlockHeaderDto(String str, NewsfeedNewsfeedItemHeaderImageDto newsfeedNewsfeedItemHeaderImageDto, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : newsfeedNewsfeedItemHeaderImageDto);
    }
}
