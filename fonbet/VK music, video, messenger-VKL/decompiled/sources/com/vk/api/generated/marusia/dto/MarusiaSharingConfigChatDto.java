package com.vk.api.generated.marusia.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.stories.dto.StoriesBackgroundDto;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MarusiaSharingConfigChatDto.kt */
/* loaded from: classes15.dex */
public final class MarusiaSharingConfigChatDto implements Parcelable {
    public static final Parcelable.Creator<MarusiaSharingConfigChatDto> CREATOR = new a();

    @pmi0("story_background")
    private final StoriesBackgroundDto storyBackground;

    @pmi0("url")
    private final String url;

    /* compiled from: MarusiaSharingConfigChatDto.kt */
    public static final class a implements Parcelable.Creator<MarusiaSharingConfigChatDto> {
        @Override // android.os.Parcelable.Creator
        public final MarusiaSharingConfigChatDto createFromParcel(Parcel parcel) {
            return new MarusiaSharingConfigChatDto(parcel.readString(), parcel.readInt() == 0 ? null : StoriesBackgroundDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final MarusiaSharingConfigChatDto[] newArray(int i) {
            return new MarusiaSharingConfigChatDto[i];
        }
    }

    public MarusiaSharingConfigChatDto(String str, StoriesBackgroundDto storiesBackgroundDto) {
        this.url = str;
        this.storyBackground = storiesBackgroundDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarusiaSharingConfigChatDto)) {
            return false;
        }
        MarusiaSharingConfigChatDto marusiaSharingConfigChatDto = (MarusiaSharingConfigChatDto) obj;
        return epx.f(this.url, marusiaSharingConfigChatDto.url) && epx.f(this.storyBackground, marusiaSharingConfigChatDto.storyBackground);
    }

    public final int hashCode() {
        int hashCode = this.url.hashCode() * 31;
        StoriesBackgroundDto storiesBackgroundDto = this.storyBackground;
        return hashCode + (storiesBackgroundDto == null ? 0 : storiesBackgroundDto.hashCode());
    }

    public final String toString() {
        return "MarusiaSharingConfigChatDto(url=" + this.url + ", storyBackground=" + this.storyBackground + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.url);
        StoriesBackgroundDto storiesBackgroundDto = this.storyBackground;
        if (storiesBackgroundDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            storiesBackgroundDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ MarusiaSharingConfigChatDto(String str, StoriesBackgroundDto storiesBackgroundDto, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : storiesBackgroundDto);
    }
}
