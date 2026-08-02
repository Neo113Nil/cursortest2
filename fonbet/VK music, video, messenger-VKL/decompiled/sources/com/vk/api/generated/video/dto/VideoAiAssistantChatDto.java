package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.bh10;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: VideoAiAssistantChatDto.kt */
/* loaded from: classes15.dex */
public final class VideoAiAssistantChatDto implements Parcelable {
    public static final Parcelable.Creator<VideoAiAssistantChatDto> CREATOR = new a();

    @pmi0("category")
    private final CategoryDto category;

    @pmi0("created_at")
    private final long createdAt;

    @pmi0("id")
    private final String id;

    @pmi0("reaction")
    private final VideoAiAssistantReactionDto reaction;

    @pmi0("state")
    private final VideoAiAssistantChatStateDto state;

    @pmi0("title")
    private final String title;

    @pmi0("updated_at")
    private final long updatedAt;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoAiAssistantChatDto.kt */
    public static final class CategoryDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ CategoryDto[] $VALUES;

        @pmi0("common")
        public static final CategoryDto COMMON;
        public static final Parcelable.Creator<CategoryDto> CREATOR;

        @pmi0("music")
        public static final CategoryDto MUSIC;
        private final String value;

        /* compiled from: VideoAiAssistantChatDto.kt */
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
            CategoryDto categoryDto = new CategoryDto("COMMON", 0, "common");
            COMMON = categoryDto;
            CategoryDto categoryDto2 = new CategoryDto("MUSIC", 1, "music");
            MUSIC = categoryDto2;
            CategoryDto[] categoryDtoArr = {categoryDto, categoryDto2};
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

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: VideoAiAssistantChatDto.kt */
    public static final class a implements Parcelable.Creator<VideoAiAssistantChatDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoAiAssistantChatDto createFromParcel(Parcel parcel) {
            return new VideoAiAssistantChatDto(parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readLong(), parcel.readInt() == 0 ? null : VideoAiAssistantReactionDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : VideoAiAssistantChatStateDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? CategoryDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoAiAssistantChatDto[] newArray(int i) {
            return new VideoAiAssistantChatDto[i];
        }
    }

    public VideoAiAssistantChatDto(String str, String str2, long j, long j2, VideoAiAssistantReactionDto videoAiAssistantReactionDto, VideoAiAssistantChatStateDto videoAiAssistantChatStateDto, CategoryDto categoryDto) {
        this.id = str;
        this.title = str2;
        this.createdAt = j;
        this.updatedAt = j2;
        this.reaction = videoAiAssistantReactionDto;
        this.state = videoAiAssistantChatStateDto;
        this.category = categoryDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoAiAssistantChatDto)) {
            return false;
        }
        VideoAiAssistantChatDto videoAiAssistantChatDto = (VideoAiAssistantChatDto) obj;
        return epx.f(this.id, videoAiAssistantChatDto.id) && epx.f(this.title, videoAiAssistantChatDto.title) && this.createdAt == videoAiAssistantChatDto.createdAt && this.updatedAt == videoAiAssistantChatDto.updatedAt && epx.f(this.reaction, videoAiAssistantChatDto.reaction) && this.state == videoAiAssistantChatDto.state && this.category == videoAiAssistantChatDto.category;
    }

    public final int hashCode() {
        int a2 = bh10.a(bh10.a(urd0.a(this.id.hashCode() * 31, 31, this.title), 31, this.createdAt), 31, this.updatedAt);
        VideoAiAssistantReactionDto videoAiAssistantReactionDto = this.reaction;
        int hashCode = (a2 + (videoAiAssistantReactionDto == null ? 0 : videoAiAssistantReactionDto.hashCode())) * 31;
        VideoAiAssistantChatStateDto videoAiAssistantChatStateDto = this.state;
        int hashCode2 = (hashCode + (videoAiAssistantChatStateDto == null ? 0 : videoAiAssistantChatStateDto.hashCode())) * 31;
        CategoryDto categoryDto = this.category;
        return hashCode2 + (categoryDto != null ? categoryDto.hashCode() : 0);
    }

    public final String toString() {
        return "VideoAiAssistantChatDto(id=" + this.id + ", title=" + this.title + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ", reaction=" + this.reaction + ", state=" + this.state + ", category=" + this.category + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.title);
        parcel.writeLong(this.createdAt);
        parcel.writeLong(this.updatedAt);
        VideoAiAssistantReactionDto videoAiAssistantReactionDto = this.reaction;
        if (videoAiAssistantReactionDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            videoAiAssistantReactionDto.writeToParcel(parcel, i);
        }
        VideoAiAssistantChatStateDto videoAiAssistantChatStateDto = this.state;
        if (videoAiAssistantChatStateDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            videoAiAssistantChatStateDto.writeToParcel(parcel, i);
        }
        CategoryDto categoryDto = this.category;
        if (categoryDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            categoryDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ VideoAiAssistantChatDto(String str, String str2, long j, long j2, VideoAiAssistantReactionDto videoAiAssistantReactionDto, VideoAiAssistantChatStateDto videoAiAssistantChatStateDto, CategoryDto categoryDto, int i, zcl zclVar) {
        this(str, str2, j, j2, (i & 16) != 0 ? null : videoAiAssistantReactionDto, (i & 32) != 0 ? null : videoAiAssistantChatStateDto, (i & 64) != 0 ? null : categoryDto);
    }
}
