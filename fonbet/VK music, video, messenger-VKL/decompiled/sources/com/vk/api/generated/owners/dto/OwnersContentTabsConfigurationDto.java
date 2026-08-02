package com.vk.api.generated.owners.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.X3;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: OwnersContentTabsConfigurationDto.kt */
/* loaded from: classes15.dex */
public final class OwnersContentTabsConfigurationDto implements Parcelable {
    public static final Parcelable.Creator<OwnersContentTabsConfigurationDto> CREATOR = new a();

    @pmi0("donut")
    private final OwnersContentTabDonutDto donut;

    @pmi0(X3.i.Z)
    private final OwnersContentTabMainDto main;

    @pmi0("posts")
    private final OwnersContentTabPostsDto posts;

    @pmi0("short_videos")
    private final OwnersContentTabShortVideosDto shortVideos;

    @pmi0("videos")
    private final OwnersContentTabVideosDto videos;

    /* compiled from: OwnersContentTabsConfigurationDto.kt */
    public static final class a implements Parcelable.Creator<OwnersContentTabsConfigurationDto> {
        @Override // android.os.Parcelable.Creator
        public final OwnersContentTabsConfigurationDto createFromParcel(Parcel parcel) {
            return new OwnersContentTabsConfigurationDto(parcel.readInt() == 0 ? null : OwnersContentTabMainDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : OwnersContentTabPostsDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : OwnersContentTabDonutDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : OwnersContentTabVideosDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? OwnersContentTabShortVideosDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final OwnersContentTabsConfigurationDto[] newArray(int i) {
            return new OwnersContentTabsConfigurationDto[i];
        }
    }

    public OwnersContentTabsConfigurationDto() {
        this(null, null, null, null, null, 31, null);
    }

    public final OwnersContentTabDonutDto d() {
        return this.donut;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final OwnersContentTabMainDto e() {
        return this.main;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OwnersContentTabsConfigurationDto)) {
            return false;
        }
        OwnersContentTabsConfigurationDto ownersContentTabsConfigurationDto = (OwnersContentTabsConfigurationDto) obj;
        return epx.f(this.main, ownersContentTabsConfigurationDto.main) && epx.f(this.posts, ownersContentTabsConfigurationDto.posts) && epx.f(this.donut, ownersContentTabsConfigurationDto.donut) && epx.f(this.videos, ownersContentTabsConfigurationDto.videos) && epx.f(this.shortVideos, ownersContentTabsConfigurationDto.shortVideos);
    }

    public final OwnersContentTabPostsDto f() {
        return this.posts;
    }

    public final OwnersContentTabShortVideosDto g() {
        return this.shortVideos;
    }

    public final int hashCode() {
        OwnersContentTabMainDto ownersContentTabMainDto = this.main;
        int hashCode = (ownersContentTabMainDto == null ? 0 : ownersContentTabMainDto.hashCode()) * 31;
        OwnersContentTabPostsDto ownersContentTabPostsDto = this.posts;
        int hashCode2 = (hashCode + (ownersContentTabPostsDto == null ? 0 : ownersContentTabPostsDto.hashCode())) * 31;
        OwnersContentTabDonutDto ownersContentTabDonutDto = this.donut;
        int hashCode3 = (hashCode2 + (ownersContentTabDonutDto == null ? 0 : ownersContentTabDonutDto.hashCode())) * 31;
        OwnersContentTabVideosDto ownersContentTabVideosDto = this.videos;
        int hashCode4 = (hashCode3 + (ownersContentTabVideosDto == null ? 0 : ownersContentTabVideosDto.hashCode())) * 31;
        OwnersContentTabShortVideosDto ownersContentTabShortVideosDto = this.shortVideos;
        return hashCode4 + (ownersContentTabShortVideosDto != null ? ownersContentTabShortVideosDto.hashCode() : 0);
    }

    public final OwnersContentTabVideosDto i() {
        return this.videos;
    }

    public final String toString() {
        return "OwnersContentTabsConfigurationDto(main=" + this.main + ", posts=" + this.posts + ", donut=" + this.donut + ", videos=" + this.videos + ", shortVideos=" + this.shortVideos + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        OwnersContentTabMainDto ownersContentTabMainDto = this.main;
        if (ownersContentTabMainDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            ownersContentTabMainDto.writeToParcel(parcel, i);
        }
        OwnersContentTabPostsDto ownersContentTabPostsDto = this.posts;
        if (ownersContentTabPostsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            ownersContentTabPostsDto.writeToParcel(parcel, i);
        }
        OwnersContentTabDonutDto ownersContentTabDonutDto = this.donut;
        if (ownersContentTabDonutDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            ownersContentTabDonutDto.writeToParcel(parcel, i);
        }
        OwnersContentTabVideosDto ownersContentTabVideosDto = this.videos;
        if (ownersContentTabVideosDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            ownersContentTabVideosDto.writeToParcel(parcel, i);
        }
        OwnersContentTabShortVideosDto ownersContentTabShortVideosDto = this.shortVideos;
        if (ownersContentTabShortVideosDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            ownersContentTabShortVideosDto.writeToParcel(parcel, i);
        }
    }

    public OwnersContentTabsConfigurationDto(OwnersContentTabMainDto ownersContentTabMainDto, OwnersContentTabPostsDto ownersContentTabPostsDto, OwnersContentTabDonutDto ownersContentTabDonutDto, OwnersContentTabVideosDto ownersContentTabVideosDto, OwnersContentTabShortVideosDto ownersContentTabShortVideosDto) {
        this.main = ownersContentTabMainDto;
        this.posts = ownersContentTabPostsDto;
        this.donut = ownersContentTabDonutDto;
        this.videos = ownersContentTabVideosDto;
        this.shortVideos = ownersContentTabShortVideosDto;
    }

    public /* synthetic */ OwnersContentTabsConfigurationDto(OwnersContentTabMainDto ownersContentTabMainDto, OwnersContentTabPostsDto ownersContentTabPostsDto, OwnersContentTabDonutDto ownersContentTabDonutDto, OwnersContentTabVideosDto ownersContentTabVideosDto, OwnersContentTabShortVideosDto ownersContentTabShortVideosDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : ownersContentTabMainDto, (i & 2) != 0 ? null : ownersContentTabPostsDto, (i & 4) != 0 ? null : ownersContentTabDonutDto, (i & 8) != 0 ? null : ownersContentTabVideosDto, (i & 16) != 0 ? null : ownersContentTabShortVideosDto);
    }
}
