package com.vk.api.generated.newsfeed.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: NewsfeedDzenTopStoriesBlockHeaderDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedDzenTopStoriesBlockHeaderDto implements Parcelable {
    public static final Parcelable.Creator<NewsfeedDzenTopStoriesBlockHeaderDto> CREATOR = new a();

    @pmi0("description")
    private final String description;

    @pmi0("hidden")
    private final Boolean hidden;

    @pmi0("image")
    private final NewsfeedNewsfeedItemHeaderImageDto image;

    @pmi0("info")
    private final NewsfeedDzenTopStoriesBlockHeaderInfoDto info;

    @pmi0("is_bold")
    private final Boolean isBold;

    @pmi0("title")
    private final String title;

    /* compiled from: NewsfeedDzenTopStoriesBlockHeaderDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedDzenTopStoriesBlockHeaderDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedDzenTopStoriesBlockHeaderDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            Boolean bool = null;
            NewsfeedDzenTopStoriesBlockHeaderInfoDto createFromParcel = parcel.readInt() == 0 ? null : NewsfeedDzenTopStoriesBlockHeaderInfoDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            NewsfeedNewsfeedItemHeaderImageDto newsfeedNewsfeedItemHeaderImageDto = (NewsfeedNewsfeedItemHeaderImageDto) parcel.readParcelable(NewsfeedDzenTopStoriesBlockHeaderDto.class.getClassLoader());
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new NewsfeedDzenTopStoriesBlockHeaderDto(readString, readString2, createFromParcel, valueOf, newsfeedNewsfeedItemHeaderImageDto, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedDzenTopStoriesBlockHeaderDto[] newArray(int i) {
            return new NewsfeedDzenTopStoriesBlockHeaderDto[i];
        }
    }

    public NewsfeedDzenTopStoriesBlockHeaderDto(String str, String str2, NewsfeedDzenTopStoriesBlockHeaderInfoDto newsfeedDzenTopStoriesBlockHeaderInfoDto, Boolean bool, NewsfeedNewsfeedItemHeaderImageDto newsfeedNewsfeedItemHeaderImageDto, Boolean bool2) {
        this.title = str;
        this.description = str2;
        this.info = newsfeedDzenTopStoriesBlockHeaderInfoDto;
        this.hidden = bool;
        this.image = newsfeedNewsfeedItemHeaderImageDto;
        this.isBold = bool2;
    }

    public final Boolean d() {
        return this.hidden;
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
        if (!(obj instanceof NewsfeedDzenTopStoriesBlockHeaderDto)) {
            return false;
        }
        NewsfeedDzenTopStoriesBlockHeaderDto newsfeedDzenTopStoriesBlockHeaderDto = (NewsfeedDzenTopStoriesBlockHeaderDto) obj;
        return epx.f(this.title, newsfeedDzenTopStoriesBlockHeaderDto.title) && epx.f(this.description, newsfeedDzenTopStoriesBlockHeaderDto.description) && epx.f(this.info, newsfeedDzenTopStoriesBlockHeaderDto.info) && epx.f(this.hidden, newsfeedDzenTopStoriesBlockHeaderDto.hidden) && epx.f(this.image, newsfeedDzenTopStoriesBlockHeaderDto.image) && epx.f(this.isBold, newsfeedDzenTopStoriesBlockHeaderDto.isBold);
    }

    public final NewsfeedDzenTopStoriesBlockHeaderInfoDto f() {
        return this.info;
    }

    public final Boolean g() {
        return this.isBold;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        String str = this.description;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        NewsfeedDzenTopStoriesBlockHeaderInfoDto newsfeedDzenTopStoriesBlockHeaderInfoDto = this.info;
        int hashCode3 = (hashCode2 + (newsfeedDzenTopStoriesBlockHeaderInfoDto == null ? 0 : newsfeedDzenTopStoriesBlockHeaderInfoDto.hashCode())) * 31;
        Boolean bool = this.hidden;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        NewsfeedNewsfeedItemHeaderImageDto newsfeedNewsfeedItemHeaderImageDto = this.image;
        int hashCode5 = (hashCode4 + (newsfeedNewsfeedItemHeaderImageDto == null ? 0 : newsfeedNewsfeedItemHeaderImageDto.hashCode())) * 31;
        Boolean bool2 = this.isBold;
        return hashCode5 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NewsfeedDzenTopStoriesBlockHeaderDto(title=");
        sb.append(this.title);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", info=");
        sb.append(this.info);
        sb.append(", hidden=");
        sb.append(this.hidden);
        sb.append(", image=");
        sb.append(this.image);
        sb.append(", isBold=");
        return tn.a(sb, this.isBold, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        NewsfeedDzenTopStoriesBlockHeaderInfoDto newsfeedDzenTopStoriesBlockHeaderInfoDto = this.info;
        if (newsfeedDzenTopStoriesBlockHeaderInfoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            newsfeedDzenTopStoriesBlockHeaderInfoDto.writeToParcel(parcel, i);
        }
        Boolean bool = this.hidden;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        parcel.writeParcelable(this.image, i);
        Boolean bool2 = this.isBold;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
    }

    public /* synthetic */ NewsfeedDzenTopStoriesBlockHeaderDto(String str, String str2, NewsfeedDzenTopStoriesBlockHeaderInfoDto newsfeedDzenTopStoriesBlockHeaderInfoDto, Boolean bool, NewsfeedNewsfeedItemHeaderImageDto newsfeedNewsfeedItemHeaderImageDto, Boolean bool2, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : newsfeedDzenTopStoriesBlockHeaderInfoDto, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : newsfeedNewsfeedItemHeaderImageDto, (i & 32) != 0 ? null : bool2);
    }
}
