package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;
import xsna.zrp;

/* compiled from: GroupsVideoChannelOnboardingDto.kt */
/* loaded from: classes14.dex */
public final class GroupsVideoChannelOnboardingDto implements Parcelable {
    public static final Parcelable.Creator<GroupsVideoChannelOnboardingDto> CREATOR = new a();

    @pmi0("author_clipper_status")
    private final AuthorClipperStatusDto authorClipperStatus;

    @pmi0("has_description")
    private final Boolean hasDescription;

    @pmi0("has_photo")
    private final Boolean hasPhoto;

    @pmi0("has_published_videos")
    private final Boolean hasPublishedVideos;

    @pmi0("has_video_cover")
    private final Boolean hasVideoCover;

    @pmi0("published_clips_count")
    private final Integer publishedClipsCount;

    @pmi0("published_videos")
    private final Integer publishedVideos;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GroupsVideoChannelOnboardingDto.kt */
    public static final class AuthorClipperStatusDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ AuthorClipperStatusDto[] $VALUES;

        @pmi0("congrats_clips")
        public static final AuthorClipperStatusDto CONGRATS_CLIPS;

        @pmi0("congrats_videos")
        public static final AuthorClipperStatusDto CONGRATS_VIDEOS;
        public static final Parcelable.Creator<AuthorClipperStatusDto> CREATOR;

        @pmi0("in_progress")
        public static final AuthorClipperStatusDto IN_PROGRESS;

        @pmi0("passed")
        public static final AuthorClipperStatusDto PASSED;

        @pmi0("try_clips")
        public static final AuthorClipperStatusDto TRY_CLIPS;

        @pmi0("try_videos")
        public static final AuthorClipperStatusDto TRY_VIDEOS;
        private final String value;

        /* compiled from: GroupsVideoChannelOnboardingDto.kt */
        public static final class a implements Parcelable.Creator<AuthorClipperStatusDto> {
            @Override // android.os.Parcelable.Creator
            public final AuthorClipperStatusDto createFromParcel(Parcel parcel) {
                return AuthorClipperStatusDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final AuthorClipperStatusDto[] newArray(int i) {
                return new AuthorClipperStatusDto[i];
            }
        }

        static {
            AuthorClipperStatusDto authorClipperStatusDto = new AuthorClipperStatusDto("IN_PROGRESS", 0, "in_progress");
            IN_PROGRESS = authorClipperStatusDto;
            AuthorClipperStatusDto authorClipperStatusDto2 = new AuthorClipperStatusDto("CONGRATS_VIDEOS", 1, "congrats_videos");
            CONGRATS_VIDEOS = authorClipperStatusDto2;
            AuthorClipperStatusDto authorClipperStatusDto3 = new AuthorClipperStatusDto("CONGRATS_CLIPS", 2, "congrats_clips");
            CONGRATS_CLIPS = authorClipperStatusDto3;
            AuthorClipperStatusDto authorClipperStatusDto4 = new AuthorClipperStatusDto("TRY_VIDEOS", 3, "try_videos");
            TRY_VIDEOS = authorClipperStatusDto4;
            AuthorClipperStatusDto authorClipperStatusDto5 = new AuthorClipperStatusDto("TRY_CLIPS", 4, "try_clips");
            TRY_CLIPS = authorClipperStatusDto5;
            AuthorClipperStatusDto authorClipperStatusDto6 = new AuthorClipperStatusDto("PASSED", 5, "passed");
            PASSED = authorClipperStatusDto6;
            AuthorClipperStatusDto[] authorClipperStatusDtoArr = {authorClipperStatusDto, authorClipperStatusDto2, authorClipperStatusDto3, authorClipperStatusDto4, authorClipperStatusDto5, authorClipperStatusDto6};
            $VALUES = authorClipperStatusDtoArr;
            $ENTRIES = new asp(authorClipperStatusDtoArr);
            CREATOR = new a();
        }

        private AuthorClipperStatusDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static AuthorClipperStatusDto valueOf(String str) {
            return (AuthorClipperStatusDto) Enum.valueOf(AuthorClipperStatusDto.class, str);
        }

        public static AuthorClipperStatusDto[] values() {
            return (AuthorClipperStatusDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: GroupsVideoChannelOnboardingDto.kt */
    public static final class a implements Parcelable.Creator<GroupsVideoChannelOnboardingDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsVideoChannelOnboardingDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            Boolean valueOf4;
            Integer valueOf5 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf6 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf4 = null;
            } else {
                valueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new GroupsVideoChannelOnboardingDto(valueOf5, valueOf6, valueOf, valueOf2, valueOf3, valueOf4, parcel.readInt() != 0 ? AuthorClipperStatusDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsVideoChannelOnboardingDto[] newArray(int i) {
            return new GroupsVideoChannelOnboardingDto[i];
        }
    }

    public GroupsVideoChannelOnboardingDto() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public final Boolean d() {
        return this.hasDescription;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Boolean e() {
        return this.hasPhoto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsVideoChannelOnboardingDto)) {
            return false;
        }
        GroupsVideoChannelOnboardingDto groupsVideoChannelOnboardingDto = (GroupsVideoChannelOnboardingDto) obj;
        return epx.f(this.publishedVideos, groupsVideoChannelOnboardingDto.publishedVideos) && epx.f(this.publishedClipsCount, groupsVideoChannelOnboardingDto.publishedClipsCount) && epx.f(this.hasPhoto, groupsVideoChannelOnboardingDto.hasPhoto) && epx.f(this.hasDescription, groupsVideoChannelOnboardingDto.hasDescription) && epx.f(this.hasVideoCover, groupsVideoChannelOnboardingDto.hasVideoCover) && epx.f(this.hasPublishedVideos, groupsVideoChannelOnboardingDto.hasPublishedVideos) && this.authorClipperStatus == groupsVideoChannelOnboardingDto.authorClipperStatus;
    }

    public final Boolean f() {
        return this.hasPublishedVideos;
    }

    public final Boolean g() {
        return this.hasVideoCover;
    }

    public final int hashCode() {
        Integer num = this.publishedVideos;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.publishedClipsCount;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.hasPhoto;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.hasDescription;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.hasVideoCover;
        int hashCode5 = (hashCode4 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.hasPublishedVideos;
        int hashCode6 = (hashCode5 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        AuthorClipperStatusDto authorClipperStatusDto = this.authorClipperStatus;
        return hashCode6 + (authorClipperStatusDto != null ? authorClipperStatusDto.hashCode() : 0);
    }

    public final Integer i() {
        return this.publishedVideos;
    }

    public final String toString() {
        return "GroupsVideoChannelOnboardingDto(publishedVideos=" + this.publishedVideos + ", publishedClipsCount=" + this.publishedClipsCount + ", hasPhoto=" + this.hasPhoto + ", hasDescription=" + this.hasDescription + ", hasVideoCover=" + this.hasVideoCover + ", hasPublishedVideos=" + this.hasPublishedVideos + ", authorClipperStatus=" + this.authorClipperStatus + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.publishedVideos;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.publishedClipsCount;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        Boolean bool = this.hasPhoto;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.hasDescription;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        Boolean bool3 = this.hasVideoCover;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
        Boolean bool4 = this.hasPublishedVideos;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool4);
        }
        AuthorClipperStatusDto authorClipperStatusDto = this.authorClipperStatus;
        if (authorClipperStatusDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            authorClipperStatusDto.writeToParcel(parcel, i);
        }
    }

    public GroupsVideoChannelOnboardingDto(Integer num, Integer num2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, AuthorClipperStatusDto authorClipperStatusDto) {
        this.publishedVideos = num;
        this.publishedClipsCount = num2;
        this.hasPhoto = bool;
        this.hasDescription = bool2;
        this.hasVideoCover = bool3;
        this.hasPublishedVideos = bool4;
        this.authorClipperStatus = authorClipperStatusDto;
    }

    public /* synthetic */ GroupsVideoChannelOnboardingDto(Integer num, Integer num2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, AuthorClipperStatusDto authorClipperStatusDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : bool2, (i & 16) != 0 ? null : bool3, (i & 32) != 0 ? null : bool4, (i & 64) != 0 ? null : authorClipperStatusDto);
    }
}
