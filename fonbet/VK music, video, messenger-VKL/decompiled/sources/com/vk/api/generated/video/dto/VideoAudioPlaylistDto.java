package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.audio.dto.AudioPhotoDto;
import com.vk.dto.common.id.UserId;
import xsna.bh10;
import xsna.epx;
import xsna.pmi0;
import xsna.shy;
import xsna.sn;
import xsna.tn;
import xsna.urd0;
import xsna.zcl;

/* compiled from: VideoAudioPlaylistDto.kt */
/* loaded from: classes15.dex */
public final class VideoAudioPlaylistDto implements Parcelable {
    public static final Parcelable.Creator<VideoAudioPlaylistDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("description")
    private final String description;

    @pmi0("id")
    private final int id;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("photo")
    private final AudioPhotoDto photo;

    @pmi0("should_show_onboarding")
    private final Boolean shouldShowOnboarding;

    @pmi0("title")
    private final String title;

    @pmi0("url")
    private final String url;

    /* compiled from: VideoAudioPlaylistDto.kt */
    public static final class a implements Parcelable.Creator<VideoAudioPlaylistDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoAudioPlaylistDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            int readInt = parcel.readInt();
            UserId userId = (UserId) parcel.readParcelable(VideoAudioPlaylistDto.class.getClassLoader());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt2 = parcel.readInt();
            String readString3 = parcel.readString();
            AudioPhotoDto audioPhotoDto = (AudioPhotoDto) parcel.readParcelable(VideoAudioPlaylistDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new VideoAudioPlaylistDto(readInt, userId, readString, readString2, readInt2, readString3, audioPhotoDto, valueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoAudioPlaylistDto[] newArray(int i) {
            return new VideoAudioPlaylistDto[i];
        }
    }

    public VideoAudioPlaylistDto(int i, UserId userId, String str, String str2, int i2, String str3, AudioPhotoDto audioPhotoDto, Boolean bool) {
        this.id = i;
        this.ownerId = userId;
        this.title = str;
        this.description = str2;
        this.count = i2;
        this.url = str3;
        this.photo = audioPhotoDto;
        this.shouldShowOnboarding = bool;
    }

    public final AudioPhotoDto d() {
        return this.photo;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Boolean e() {
        return this.shouldShowOnboarding;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoAudioPlaylistDto)) {
            return false;
        }
        VideoAudioPlaylistDto videoAudioPlaylistDto = (VideoAudioPlaylistDto) obj;
        return this.id == videoAudioPlaylistDto.id && epx.f(this.ownerId, videoAudioPlaylistDto.ownerId) && epx.f(this.title, videoAudioPlaylistDto.title) && epx.f(this.description, videoAudioPlaylistDto.description) && this.count == videoAudioPlaylistDto.count && epx.f(this.url, videoAudioPlaylistDto.url) && epx.f(this.photo, videoAudioPlaylistDto.photo) && epx.f(this.shouldShowOnboarding, videoAudioPlaylistDto.shouldShowOnboarding);
    }

    public final int getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int a2 = urd0.a(shy.a(this.count, urd0.a(urd0.a(bh10.a(Integer.hashCode(this.id) * 31, 31, this.ownerId.b), 31, this.title), 31, this.description), 31), 31, this.url);
        AudioPhotoDto audioPhotoDto = this.photo;
        int hashCode = (a2 + (audioPhotoDto == null ? 0 : audioPhotoDto.hashCode())) * 31;
        Boolean bool = this.shouldShowOnboarding;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final UserId q() {
        return this.ownerId;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoAudioPlaylistDto(id=");
        sb.append(this.id);
        sb.append(", ownerId=");
        sb.append(this.ownerId);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", count=");
        sb.append(this.count);
        sb.append(", url=");
        sb.append(this.url);
        sb.append(", photo=");
        sb.append(this.photo);
        sb.append(", shouldShowOnboarding=");
        return tn.a(sb, this.shouldShowOnboarding, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeParcelable(this.ownerId, i);
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        parcel.writeInt(this.count);
        parcel.writeString(this.url);
        parcel.writeParcelable(this.photo, i);
        Boolean bool = this.shouldShowOnboarding;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public /* synthetic */ VideoAudioPlaylistDto(int i, UserId userId, String str, String str2, int i2, String str3, AudioPhotoDto audioPhotoDto, Boolean bool, int i3, zcl zclVar) {
        this(i, userId, str, str2, i2, str3, (i3 & 64) != 0 ? null : audioPhotoDto, (i3 & 128) != 0 ? null : bool);
    }
}
