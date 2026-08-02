package com.vk.api.generated.newsfeed.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: NewsfeedDzenStoryNewsBlockItemDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedDzenStoryNewsBlockItemDto implements Parcelable {
    public static final Parcelable.Creator<NewsfeedDzenStoryNewsBlockItemDto> CREATOR = new a();

    @pmi0("action")
    private final NewsfeedCaptionInfoButtonActionDto action;

    @pmi0("date")
    private final Integer date;

    @pmi0("description")
    private final NewsfeedNewsfeedItemHeaderTextDto description;

    @pmi0("image")
    private final NewsfeedNewsfeedItemHeaderImageDto image;

    @pmi0("research")
    private final NewsfeedMediascopeResearchDto research;

    @pmi0("title")
    private final NewsfeedDzenTextDto title;

    @pmi0("track_code")
    private final String trackCode;

    /* compiled from: NewsfeedDzenStoryNewsBlockItemDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedDzenStoryNewsBlockItemDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedDzenStoryNewsBlockItemDto createFromParcel(Parcel parcel) {
            return new NewsfeedDzenStoryNewsBlockItemDto(NewsfeedDzenTextDto.CREATOR.createFromParcel(parcel), (NewsfeedNewsfeedItemHeaderTextDto) parcel.readParcelable(NewsfeedDzenStoryNewsBlockItemDto.class.getClassLoader()), parcel.readString(), (NewsfeedNewsfeedItemHeaderImageDto) parcel.readParcelable(NewsfeedDzenStoryNewsBlockItemDto.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : NewsfeedCaptionInfoButtonActionDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? NewsfeedMediascopeResearchDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedDzenStoryNewsBlockItemDto[] newArray(int i) {
            return new NewsfeedDzenStoryNewsBlockItemDto[i];
        }
    }

    public NewsfeedDzenStoryNewsBlockItemDto(NewsfeedDzenTextDto newsfeedDzenTextDto, NewsfeedNewsfeedItemHeaderTextDto newsfeedNewsfeedItemHeaderTextDto, String str, NewsfeedNewsfeedItemHeaderImageDto newsfeedNewsfeedItemHeaderImageDto, Integer num, NewsfeedCaptionInfoButtonActionDto newsfeedCaptionInfoButtonActionDto, NewsfeedMediascopeResearchDto newsfeedMediascopeResearchDto) {
        this.title = newsfeedDzenTextDto;
        this.description = newsfeedNewsfeedItemHeaderTextDto;
        this.trackCode = str;
        this.image = newsfeedNewsfeedItemHeaderImageDto;
        this.date = num;
        this.action = newsfeedCaptionInfoButtonActionDto;
        this.research = newsfeedMediascopeResearchDto;
    }

    public final NewsfeedCaptionInfoButtonActionDto d() {
        return this.action;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Integer e() {
        return this.date;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedDzenStoryNewsBlockItemDto)) {
            return false;
        }
        NewsfeedDzenStoryNewsBlockItemDto newsfeedDzenStoryNewsBlockItemDto = (NewsfeedDzenStoryNewsBlockItemDto) obj;
        return epx.f(this.title, newsfeedDzenStoryNewsBlockItemDto.title) && epx.f(this.description, newsfeedDzenStoryNewsBlockItemDto.description) && epx.f(this.trackCode, newsfeedDzenStoryNewsBlockItemDto.trackCode) && epx.f(this.image, newsfeedDzenStoryNewsBlockItemDto.image) && epx.f(this.date, newsfeedDzenStoryNewsBlockItemDto.date) && epx.f(this.action, newsfeedDzenStoryNewsBlockItemDto.action) && epx.f(this.research, newsfeedDzenStoryNewsBlockItemDto.research);
    }

    public final NewsfeedNewsfeedItemHeaderTextDto f() {
        return this.description;
    }

    public final NewsfeedNewsfeedItemHeaderImageDto g() {
        return this.image;
    }

    public final int hashCode() {
        int a2 = urd0.a((this.description.hashCode() + (this.title.hashCode() * 31)) * 31, 31, this.trackCode);
        NewsfeedNewsfeedItemHeaderImageDto newsfeedNewsfeedItemHeaderImageDto = this.image;
        int hashCode = (a2 + (newsfeedNewsfeedItemHeaderImageDto == null ? 0 : newsfeedNewsfeedItemHeaderImageDto.hashCode())) * 31;
        Integer num = this.date;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        NewsfeedCaptionInfoButtonActionDto newsfeedCaptionInfoButtonActionDto = this.action;
        int hashCode3 = (hashCode2 + (newsfeedCaptionInfoButtonActionDto == null ? 0 : newsfeedCaptionInfoButtonActionDto.hashCode())) * 31;
        NewsfeedMediascopeResearchDto newsfeedMediascopeResearchDto = this.research;
        return hashCode3 + (newsfeedMediascopeResearchDto != null ? newsfeedMediascopeResearchDto.hashCode() : 0);
    }

    public final NewsfeedMediascopeResearchDto i() {
        return this.research;
    }

    public final NewsfeedDzenTextDto j() {
        return this.title;
    }

    public final String r() {
        return this.trackCode;
    }

    public final String toString() {
        return "NewsfeedDzenStoryNewsBlockItemDto(title=" + this.title + ", description=" + this.description + ", trackCode=" + this.trackCode + ", image=" + this.image + ", date=" + this.date + ", action=" + this.action + ", research=" + this.research + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.title.writeToParcel(parcel, i);
        parcel.writeParcelable(this.description, i);
        parcel.writeString(this.trackCode);
        parcel.writeParcelable(this.image, i);
        Integer num = this.date;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        NewsfeedCaptionInfoButtonActionDto newsfeedCaptionInfoButtonActionDto = this.action;
        if (newsfeedCaptionInfoButtonActionDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            newsfeedCaptionInfoButtonActionDto.writeToParcel(parcel, i);
        }
        NewsfeedMediascopeResearchDto newsfeedMediascopeResearchDto = this.research;
        if (newsfeedMediascopeResearchDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            newsfeedMediascopeResearchDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ NewsfeedDzenStoryNewsBlockItemDto(NewsfeedDzenTextDto newsfeedDzenTextDto, NewsfeedNewsfeedItemHeaderTextDto newsfeedNewsfeedItemHeaderTextDto, String str, NewsfeedNewsfeedItemHeaderImageDto newsfeedNewsfeedItemHeaderImageDto, Integer num, NewsfeedCaptionInfoButtonActionDto newsfeedCaptionInfoButtonActionDto, NewsfeedMediascopeResearchDto newsfeedMediascopeResearchDto, int i, zcl zclVar) {
        this(newsfeedDzenTextDto, newsfeedNewsfeedItemHeaderTextDto, str, (i & 8) != 0 ? null : newsfeedNewsfeedItemHeaderImageDto, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : newsfeedCaptionInfoButtonActionDto, (i & 64) != 0 ? null : newsfeedMediascopeResearchDto);
    }
}
