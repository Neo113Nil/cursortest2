package com.vk.api.generated.newsfeed.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.urd0;
import xsna.zcl;

/* compiled from: NewsfeedDzenTopStoryItemDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedDzenTopStoryItemDto implements Parcelable {
    public static final Parcelable.Creator<NewsfeedDzenTopStoryItemDto> CREATOR = new a();

    @pmi0("date")
    private final Integer date;

    @pmi0("feed_id")
    private final String feedId;

    @pmi0("icon")
    private final NewsfeedNewsfeedItemHeaderImageDto icon;

    @pmi0("story")
    private final NewsfeedDzenStoryNewsBlockDto story;

    @pmi0("title")
    private final NewsfeedDzenTextDto title;

    @pmi0("track_code")
    private final String trackCode;

    /* compiled from: NewsfeedDzenTopStoryItemDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedDzenTopStoryItemDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedDzenTopStoryItemDto createFromParcel(Parcel parcel) {
            return new NewsfeedDzenTopStoryItemDto((NewsfeedNewsfeedItemHeaderImageDto) parcel.readParcelable(NewsfeedDzenTopStoryItemDto.class.getClassLoader()), NewsfeedDzenTextDto.CREATOR.createFromParcel(parcel), parcel.readString(), NewsfeedDzenStoryNewsBlockDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedDzenTopStoryItemDto[] newArray(int i) {
            return new NewsfeedDzenTopStoryItemDto[i];
        }
    }

    public NewsfeedDzenTopStoryItemDto(NewsfeedNewsfeedItemHeaderImageDto newsfeedNewsfeedItemHeaderImageDto, NewsfeedDzenTextDto newsfeedDzenTextDto, String str, NewsfeedDzenStoryNewsBlockDto newsfeedDzenStoryNewsBlockDto, String str2, Integer num) {
        this.icon = newsfeedNewsfeedItemHeaderImageDto;
        this.title = newsfeedDzenTextDto;
        this.feedId = str;
        this.story = newsfeedDzenStoryNewsBlockDto;
        this.trackCode = str2;
        this.date = num;
    }

    public final Integer d() {
        return this.date;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.feedId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedDzenTopStoryItemDto)) {
            return false;
        }
        NewsfeedDzenTopStoryItemDto newsfeedDzenTopStoryItemDto = (NewsfeedDzenTopStoryItemDto) obj;
        return epx.f(this.icon, newsfeedDzenTopStoryItemDto.icon) && epx.f(this.title, newsfeedDzenTopStoryItemDto.title) && epx.f(this.feedId, newsfeedDzenTopStoryItemDto.feedId) && epx.f(this.story, newsfeedDzenTopStoryItemDto.story) && epx.f(this.trackCode, newsfeedDzenTopStoryItemDto.trackCode) && epx.f(this.date, newsfeedDzenTopStoryItemDto.date);
    }

    public final NewsfeedNewsfeedItemHeaderImageDto f() {
        return this.icon;
    }

    public final NewsfeedDzenStoryNewsBlockDto g() {
        return this.story;
    }

    public final int hashCode() {
        int a2 = urd0.a((this.story.hashCode() + urd0.a((this.title.hashCode() + (this.icon.hashCode() * 31)) * 31, 31, this.feedId)) * 31, 31, this.trackCode);
        Integer num = this.date;
        return a2 + (num == null ? 0 : num.hashCode());
    }

    public final NewsfeedDzenTextDto i() {
        return this.title;
    }

    public final String r() {
        return this.trackCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NewsfeedDzenTopStoryItemDto(icon=");
        sb.append(this.icon);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", feedId=");
        sb.append(this.feedId);
        sb.append(", story=");
        sb.append(this.story);
        sb.append(", trackCode=");
        sb.append(this.trackCode);
        sb.append(", date=");
        return uqi.b(sb, this.date, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.icon, i);
        this.title.writeToParcel(parcel, i);
        parcel.writeString(this.feedId);
        this.story.writeToParcel(parcel, i);
        parcel.writeString(this.trackCode);
        Integer num = this.date;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public /* synthetic */ NewsfeedDzenTopStoryItemDto(NewsfeedNewsfeedItemHeaderImageDto newsfeedNewsfeedItemHeaderImageDto, NewsfeedDzenTextDto newsfeedDzenTextDto, String str, NewsfeedDzenStoryNewsBlockDto newsfeedDzenStoryNewsBlockDto, String str2, Integer num, int i, zcl zclVar) {
        this(newsfeedNewsfeedItemHeaderImageDto, newsfeedDzenTextDto, str, newsfeedDzenStoryNewsBlockDto, str2, (i & 32) != 0 ? null : num);
    }
}
