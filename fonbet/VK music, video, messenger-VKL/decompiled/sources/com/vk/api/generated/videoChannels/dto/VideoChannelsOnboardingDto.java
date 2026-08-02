package com.vk.api.generated.videoChannels.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.qoy;
import xsna.shy;
import xsna.zrp;

/* compiled from: VideoChannelsOnboardingDto.kt */
/* loaded from: classes15.dex */
public final class VideoChannelsOnboardingDto implements Parcelable {
    public static final Parcelable.Creator<VideoChannelsOnboardingDto> CREATOR = new a();

    @pmi0("author_clipper_status")
    private final AuthorClipperStatusDto authorClipperStatus;

    @pmi0("has_description")
    private final boolean hasDescription;

    @pmi0("has_photo")
    private final boolean hasPhoto;

    @pmi0("has_video_cover")
    private final boolean hasVideoCover;

    @pmi0("published_clips_count")
    private final int publishedClipsCount;

    @pmi0("published_videos_count")
    private final int publishedVideosCount;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoChannelsOnboardingDto.kt */
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

        /* compiled from: VideoChannelsOnboardingDto.kt */
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

    /* compiled from: VideoChannelsOnboardingDto.kt */
    public static final class a implements Parcelable.Creator<VideoChannelsOnboardingDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoChannelsOnboardingDto createFromParcel(Parcel parcel) {
            boolean z;
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            boolean z2 = false;
            boolean z3 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z = false;
                z2 = true;
            } else {
                z = false;
            }
            return new VideoChannelsOnboardingDto(readInt, readInt2, z3, z2, parcel.readInt() == 0 ? z : true, AuthorClipperStatusDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final VideoChannelsOnboardingDto[] newArray(int i) {
            return new VideoChannelsOnboardingDto[i];
        }
    }

    public VideoChannelsOnboardingDto(int i, int i2, boolean z, boolean z2, boolean z3, AuthorClipperStatusDto authorClipperStatusDto) {
        this.publishedVideosCount = i;
        this.publishedClipsCount = i2;
        this.hasPhoto = z;
        this.hasDescription = z2;
        this.hasVideoCover = z3;
        this.authorClipperStatus = authorClipperStatusDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoChannelsOnboardingDto)) {
            return false;
        }
        VideoChannelsOnboardingDto videoChannelsOnboardingDto = (VideoChannelsOnboardingDto) obj;
        return this.publishedVideosCount == videoChannelsOnboardingDto.publishedVideosCount && this.publishedClipsCount == videoChannelsOnboardingDto.publishedClipsCount && this.hasPhoto == videoChannelsOnboardingDto.hasPhoto && this.hasDescription == videoChannelsOnboardingDto.hasDescription && this.hasVideoCover == videoChannelsOnboardingDto.hasVideoCover && this.authorClipperStatus == videoChannelsOnboardingDto.authorClipperStatus;
    }

    public final int hashCode() {
        return this.authorClipperStatus.hashCode() + qoy.b(qoy.b(qoy.b(shy.a(this.publishedClipsCount, Integer.hashCode(this.publishedVideosCount) * 31, 31), 31, this.hasPhoto), 31, this.hasDescription), 31, this.hasVideoCover);
    }

    public final String toString() {
        return "VideoChannelsOnboardingDto(publishedVideosCount=" + this.publishedVideosCount + ", publishedClipsCount=" + this.publishedClipsCount + ", hasPhoto=" + this.hasPhoto + ", hasDescription=" + this.hasDescription + ", hasVideoCover=" + this.hasVideoCover + ", authorClipperStatus=" + this.authorClipperStatus + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.publishedVideosCount);
        parcel.writeInt(this.publishedClipsCount);
        parcel.writeInt(this.hasPhoto ? 1 : 0);
        parcel.writeInt(this.hasDescription ? 1 : 0);
        parcel.writeInt(this.hasVideoCover ? 1 : 0);
        this.authorClipperStatus.writeToParcel(parcel, i);
    }
}
