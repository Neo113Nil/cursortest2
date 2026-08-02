package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import defpackage.q0;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;
import xsna.zrp;

/* compiled from: VideoRelatedTabDto.kt */
/* loaded from: classes15.dex */
public final class VideoRelatedTabDto implements Parcelable {
    public static final Parcelable.Creator<VideoRelatedTabDto> CREATOR = new a();

    @pmi0(SignalingProtocol.KEY_ACTIVE)
    private final boolean active;

    @pmi0("category")
    private final CategoryDto category;

    @pmi0("id")
    private final String id;

    @pmi0("title")
    private final String title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoRelatedTabDto.kt */
    public static final class CategoryDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ CategoryDto[] $VALUES;

        @pmi0("author")
        public static final CategoryDto AUTHOR;

        @pmi0("continue_watch")
        public static final CategoryDto CONTINUE_WATCH;
        public static final Parcelable.Creator<CategoryDto> CREATOR;

        @pmi0("music_mix")
        public static final CategoryDto MUSIC_MIX;

        @pmi0("music_similar")
        public static final CategoryDto MUSIC_SIMILAR;

        @pmi0("other")
        public static final CategoryDto OTHER;

        @pmi0("search")
        public static final CategoryDto SEARCH;

        @pmi0("similar_context")
        public static final CategoryDto SIMILAR_CONTEXT;

        @pmi0("similar_relevant")
        public static final CategoryDto SIMILAR_RELEVANT;

        @pmi0("similar_videos")
        public static final CategoryDto SIMILAR_VIDEOS;

        @pmi0("video_for_you")
        public static final CategoryDto VIDEO_FOR_YOU;
        private final String value;

        /* compiled from: VideoRelatedTabDto.kt */
        public static final class a implements Parcelable.Creator<CategoryDto> {
            @Override // android.os.Parcelable.Creator
            public final CategoryDto createFromParcel(Parcel parcel) {
                return CategoryDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final CategoryDto[] newArray(int i) {
                return new CategoryDto[i];
            }
        }

        static {
            CategoryDto categoryDto = new CategoryDto("SIMILAR_VIDEOS", 0, "similar_videos");
            SIMILAR_VIDEOS = categoryDto;
            CategoryDto categoryDto2 = new CategoryDto("VIDEO_FOR_YOU", 1, "video_for_you");
            VIDEO_FOR_YOU = categoryDto2;
            CategoryDto categoryDto3 = new CategoryDto("AUTHOR", 2, "author");
            AUTHOR = categoryDto3;
            CategoryDto categoryDto4 = new CategoryDto("CONTINUE_WATCH", 3, "continue_watch");
            CONTINUE_WATCH = categoryDto4;
            CategoryDto categoryDto5 = new CategoryDto("SEARCH", 4, "search");
            SEARCH = categoryDto5;
            CategoryDto categoryDto6 = new CategoryDto("MUSIC_MIX", 5, "music_mix");
            MUSIC_MIX = categoryDto6;
            CategoryDto categoryDto7 = new CategoryDto("MUSIC_SIMILAR", 6, "music_similar");
            MUSIC_SIMILAR = categoryDto7;
            CategoryDto categoryDto8 = new CategoryDto("SIMILAR_CONTEXT", 7, "similar_context");
            SIMILAR_CONTEXT = categoryDto8;
            CategoryDto categoryDto9 = new CategoryDto("SIMILAR_RELEVANT", 8, "similar_relevant");
            SIMILAR_RELEVANT = categoryDto9;
            CategoryDto categoryDto10 = new CategoryDto(NativeAdContent.ViewTag.OTHER, 9, "other");
            OTHER = categoryDto10;
            CategoryDto[] categoryDtoArr = {categoryDto, categoryDto2, categoryDto3, categoryDto4, categoryDto5, categoryDto6, categoryDto7, categoryDto8, categoryDto9, categoryDto10};
            $VALUES = categoryDtoArr;
            $ENTRIES = new asp(categoryDtoArr);
            CREATOR = new a();
        }

        private CategoryDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static CategoryDto valueOf(String str) {
            return (CategoryDto) Enum.valueOf(CategoryDto.class, str);
        }

        public static CategoryDto[] values() {
            return (CategoryDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String i() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: VideoRelatedTabDto.kt */
    public static final class a implements Parcelable.Creator<VideoRelatedTabDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoRelatedTabDto createFromParcel(Parcel parcel) {
            return new VideoRelatedTabDto(parcel.readString(), parcel.readString(), CategoryDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoRelatedTabDto[] newArray(int i) {
            return new VideoRelatedTabDto[i];
        }
    }

    public VideoRelatedTabDto(String str, String str2, CategoryDto categoryDto, boolean z) {
        this.id = str;
        this.title = str2;
        this.category = categoryDto;
        this.active = z;
    }

    public final boolean d() {
        return this.active;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final CategoryDto e() {
        return this.category;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoRelatedTabDto)) {
            return false;
        }
        VideoRelatedTabDto videoRelatedTabDto = (VideoRelatedTabDto) obj;
        return epx.f(this.id, videoRelatedTabDto.id) && epx.f(this.title, videoRelatedTabDto.title) && this.category == videoRelatedTabDto.category && this.active == videoRelatedTabDto.active;
    }

    public final String getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.active) + ((this.category.hashCode() + urd0.a(this.id.hashCode() * 31, 31, this.title)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoRelatedTabDto(id=");
        sb.append(this.id);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", category=");
        sb.append(this.category);
        sb.append(", active=");
        return q0.a(sb, this.active, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.title);
        this.category.writeToParcel(parcel, i);
        parcel.writeInt(this.active ? 1 : 0);
    }
}
