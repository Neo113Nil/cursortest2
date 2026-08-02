package com.vk.api.generated.newsfeed.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import ru.ok.android.externcalls.analytics.internal.storage.DatabaseHelper;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.pmi0;
import xsna.shy;
import xsna.zcl;

/* compiled from: NewsfeedMediaDiscoverItemDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedMediaDiscoverItemDto implements Parcelable {
    public static final Parcelable.Creator<NewsfeedMediaDiscoverItemDto> CREATOR = new a();

    @pmi0("action")
    private final NewsfeedMediaDiscoverActionDto action;

    @pmi0("cover")
    private final NewsfeedMediaDiscoverCoverDto cover;

    @pmi0("height")
    private final int height;

    @pmi0(DatabaseHelper.ITEM_COLUMN_NAME)
    private final NewsfeedNewsfeedItemDto item;

    @pmi0("subtitle")
    private final String subtitle;

    @pmi0("tags")
    private final List<String> tags;

    @pmi0("title")
    private final String title;

    @pmi0("width")
    private final int width;

    /* compiled from: NewsfeedMediaDiscoverItemDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedMediaDiscoverItemDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedMediaDiscoverItemDto createFromParcel(Parcel parcel) {
            return new NewsfeedMediaDiscoverItemDto(parcel.readInt(), parcel.readInt(), (NewsfeedNewsfeedItemDto) parcel.readParcelable(NewsfeedMediaDiscoverItemDto.class.getClassLoader()), parcel.createStringArrayList(), (NewsfeedMediaDiscoverActionDto) parcel.readParcelable(NewsfeedMediaDiscoverItemDto.class.getClassLoader()), parcel.readInt() == 0 ? null : NewsfeedMediaDiscoverCoverDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedMediaDiscoverItemDto[] newArray(int i) {
            return new NewsfeedMediaDiscoverItemDto[i];
        }
    }

    public NewsfeedMediaDiscoverItemDto(int i, int i2, NewsfeedNewsfeedItemDto newsfeedNewsfeedItemDto, List<String> list, NewsfeedMediaDiscoverActionDto newsfeedMediaDiscoverActionDto, NewsfeedMediaDiscoverCoverDto newsfeedMediaDiscoverCoverDto, String str, String str2) {
        this.width = i;
        this.height = i2;
        this.item = newsfeedNewsfeedItemDto;
        this.tags = list;
        this.action = newsfeedMediaDiscoverActionDto;
        this.cover = newsfeedMediaDiscoverCoverDto;
        this.title = str;
        this.subtitle = str2;
    }

    public final NewsfeedMediaDiscoverActionDto d() {
        return this.action;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final NewsfeedMediaDiscoverCoverDto e() {
        return this.cover;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedMediaDiscoverItemDto)) {
            return false;
        }
        NewsfeedMediaDiscoverItemDto newsfeedMediaDiscoverItemDto = (NewsfeedMediaDiscoverItemDto) obj;
        return this.width == newsfeedMediaDiscoverItemDto.width && this.height == newsfeedMediaDiscoverItemDto.height && epx.f(this.item, newsfeedMediaDiscoverItemDto.item) && epx.f(this.tags, newsfeedMediaDiscoverItemDto.tags) && epx.f(this.action, newsfeedMediaDiscoverItemDto.action) && epx.f(this.cover, newsfeedMediaDiscoverItemDto.cover) && epx.f(this.title, newsfeedMediaDiscoverItemDto.title) && epx.f(this.subtitle, newsfeedMediaDiscoverItemDto.subtitle);
    }

    public final NewsfeedNewsfeedItemDto f() {
        return this.item;
    }

    public final String g() {
        return this.subtitle;
    }

    public final int getHeight() {
        return this.height;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getWidth() {
        return this.width;
    }

    public final int hashCode() {
        int a2 = fw3.a((this.item.hashCode() + shy.a(this.height, Integer.hashCode(this.width) * 31, 31)) * 31, 31, this.tags);
        NewsfeedMediaDiscoverActionDto newsfeedMediaDiscoverActionDto = this.action;
        int hashCode = (a2 + (newsfeedMediaDiscoverActionDto == null ? 0 : newsfeedMediaDiscoverActionDto.hashCode())) * 31;
        NewsfeedMediaDiscoverCoverDto newsfeedMediaDiscoverCoverDto = this.cover;
        int hashCode2 = (hashCode + (newsfeedMediaDiscoverCoverDto == null ? 0 : newsfeedMediaDiscoverCoverDto.hashCode())) * 31;
        String str = this.title;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subtitle;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final List<String> i() {
        return this.tags;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NewsfeedMediaDiscoverItemDto(width=");
        sb.append(this.width);
        sb.append(", height=");
        sb.append(this.height);
        sb.append(", item=");
        sb.append(this.item);
        sb.append(", tags=");
        sb.append(this.tags);
        sb.append(", action=");
        sb.append(this.action);
        sb.append(", cover=");
        sb.append(this.cover);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", subtitle=");
        return ho8.a(sb, this.subtitle, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeParcelable(this.item, i);
        parcel.writeStringList(this.tags);
        parcel.writeParcelable(this.action, i);
        NewsfeedMediaDiscoverCoverDto newsfeedMediaDiscoverCoverDto = this.cover;
        if (newsfeedMediaDiscoverCoverDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            newsfeedMediaDiscoverCoverDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
    }

    public /* synthetic */ NewsfeedMediaDiscoverItemDto(int i, int i2, NewsfeedNewsfeedItemDto newsfeedNewsfeedItemDto, List list, NewsfeedMediaDiscoverActionDto newsfeedMediaDiscoverActionDto, NewsfeedMediaDiscoverCoverDto newsfeedMediaDiscoverCoverDto, String str, String str2, int i3, zcl zclVar) {
        this(i, i2, newsfeedNewsfeedItemDto, list, (i3 & 16) != 0 ? null : newsfeedMediaDiscoverActionDto, (i3 & 32) != 0 ? null : newsfeedMediaDiscoverCoverDto, (i3 & 64) != 0 ? null : str, (i3 & 128) != 0 ? null : str2);
    }
}
