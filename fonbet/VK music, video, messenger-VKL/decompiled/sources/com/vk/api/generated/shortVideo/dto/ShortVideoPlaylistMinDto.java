package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.bh10;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: ShortVideoPlaylistMinDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoPlaylistMinDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoPlaylistMinDto> CREATOR = new a();

    @pmi0("id")
    private final int id;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("title")
    private final String title;

    /* compiled from: ShortVideoPlaylistMinDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoPlaylistMinDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoPlaylistMinDto createFromParcel(Parcel parcel) {
            return new ShortVideoPlaylistMinDto(parcel.readInt(), (UserId) parcel.readParcelable(ShortVideoPlaylistMinDto.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoPlaylistMinDto[] newArray(int i) {
            return new ShortVideoPlaylistMinDto[i];
        }
    }

    public ShortVideoPlaylistMinDto(int i, UserId userId, String str) {
        this.id = i;
        this.ownerId = userId;
        this.title = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortVideoPlaylistMinDto)) {
            return false;
        }
        ShortVideoPlaylistMinDto shortVideoPlaylistMinDto = (ShortVideoPlaylistMinDto) obj;
        return this.id == shortVideoPlaylistMinDto.id && epx.f(this.ownerId, shortVideoPlaylistMinDto.ownerId) && epx.f(this.title, shortVideoPlaylistMinDto.title);
    }

    public final int getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        return this.title.hashCode() + bh10.a(Integer.hashCode(this.id) * 31, 31, this.ownerId.b);
    }

    public final UserId q() {
        return this.ownerId;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShortVideoPlaylistMinDto(id=");
        sb.append(this.id);
        sb.append(", ownerId=");
        sb.append(this.ownerId);
        sb.append(", title=");
        return ho8.a(sb, this.title, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeParcelable(this.ownerId, i);
        parcel.writeString(this.title);
    }
}
