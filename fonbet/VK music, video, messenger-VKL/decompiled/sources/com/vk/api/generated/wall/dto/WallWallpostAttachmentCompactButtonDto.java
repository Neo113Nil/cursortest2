package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.newsfeed.dto.NewsfeedNewsfeedItemHeaderActionDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedNewsfeedItemHeaderTextDto;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: WallWallpostAttachmentCompactButtonDto.kt */
/* loaded from: classes15.dex */
public final class WallWallpostAttachmentCompactButtonDto implements Parcelable {
    public static final Parcelable.Creator<WallWallpostAttachmentCompactButtonDto> CREATOR = new a();

    @pmi0("action")
    private final NewsfeedNewsfeedItemHeaderActionDto action;

    @pmi0("text")
    private final NewsfeedNewsfeedItemHeaderTextDto text;

    /* compiled from: WallWallpostAttachmentCompactButtonDto.kt */
    public static final class a implements Parcelable.Creator<WallWallpostAttachmentCompactButtonDto> {
        @Override // android.os.Parcelable.Creator
        public final WallWallpostAttachmentCompactButtonDto createFromParcel(Parcel parcel) {
            return new WallWallpostAttachmentCompactButtonDto(parcel.readInt() == 0 ? null : NewsfeedNewsfeedItemHeaderActionDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? NewsfeedNewsfeedItemHeaderTextDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final WallWallpostAttachmentCompactButtonDto[] newArray(int i) {
            return new WallWallpostAttachmentCompactButtonDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WallWallpostAttachmentCompactButtonDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final NewsfeedNewsfeedItemHeaderActionDto d() {
        return this.action;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final NewsfeedNewsfeedItemHeaderTextDto e() {
        return this.text;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallWallpostAttachmentCompactButtonDto)) {
            return false;
        }
        WallWallpostAttachmentCompactButtonDto wallWallpostAttachmentCompactButtonDto = (WallWallpostAttachmentCompactButtonDto) obj;
        return epx.f(this.action, wallWallpostAttachmentCompactButtonDto.action) && epx.f(this.text, wallWallpostAttachmentCompactButtonDto.text);
    }

    public final int hashCode() {
        NewsfeedNewsfeedItemHeaderActionDto newsfeedNewsfeedItemHeaderActionDto = this.action;
        int hashCode = (newsfeedNewsfeedItemHeaderActionDto == null ? 0 : newsfeedNewsfeedItemHeaderActionDto.hashCode()) * 31;
        NewsfeedNewsfeedItemHeaderTextDto newsfeedNewsfeedItemHeaderTextDto = this.text;
        return hashCode + (newsfeedNewsfeedItemHeaderTextDto != null ? newsfeedNewsfeedItemHeaderTextDto.hashCode() : 0);
    }

    public final String toString() {
        return "WallWallpostAttachmentCompactButtonDto(action=" + this.action + ", text=" + this.text + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        NewsfeedNewsfeedItemHeaderActionDto newsfeedNewsfeedItemHeaderActionDto = this.action;
        if (newsfeedNewsfeedItemHeaderActionDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            newsfeedNewsfeedItemHeaderActionDto.writeToParcel(parcel, i);
        }
        NewsfeedNewsfeedItemHeaderTextDto newsfeedNewsfeedItemHeaderTextDto = this.text;
        if (newsfeedNewsfeedItemHeaderTextDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            newsfeedNewsfeedItemHeaderTextDto.writeToParcel(parcel, i);
        }
    }

    public WallWallpostAttachmentCompactButtonDto(NewsfeedNewsfeedItemHeaderActionDto newsfeedNewsfeedItemHeaderActionDto, NewsfeedNewsfeedItemHeaderTextDto newsfeedNewsfeedItemHeaderTextDto) {
        this.action = newsfeedNewsfeedItemHeaderActionDto;
        this.text = newsfeedNewsfeedItemHeaderTextDto;
    }

    public /* synthetic */ WallWallpostAttachmentCompactButtonDto(NewsfeedNewsfeedItemHeaderActionDto newsfeedNewsfeedItemHeaderActionDto, NewsfeedNewsfeedItemHeaderTextDto newsfeedNewsfeedItemHeaderTextDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : newsfeedNewsfeedItemHeaderActionDto, (i & 2) != 0 ? null : newsfeedNewsfeedItemHeaderTextDto);
    }
}
