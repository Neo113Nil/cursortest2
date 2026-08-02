package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: VideoAiAssistantChatSuggestionDto.kt */
/* loaded from: classes15.dex */
public final class VideoAiAssistantChatSuggestionDto implements Parcelable {
    public static final Parcelable.Creator<VideoAiAssistantChatSuggestionDto> CREATOR = new a();

    @pmi0("category")
    private final CategoryDto category;

    @pmi0(HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT)
    private final String content;

    @pmi0("prompt")
    private final String prompt;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoAiAssistantChatSuggestionDto.kt */
    public static final class CategoryDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ CategoryDto[] $VALUES;

        @pmi0("common")
        public static final CategoryDto COMMON;
        public static final Parcelable.Creator<CategoryDto> CREATOR;

        @pmi0("music")
        public static final CategoryDto MUSIC;
        private final String value;

        /* compiled from: VideoAiAssistantChatSuggestionDto.kt */
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

    /* compiled from: VideoAiAssistantChatSuggestionDto.kt */
    public static final class a implements Parcelable.Creator<VideoAiAssistantChatSuggestionDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoAiAssistantChatSuggestionDto createFromParcel(Parcel parcel) {
            return new VideoAiAssistantChatSuggestionDto(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : CategoryDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final VideoAiAssistantChatSuggestionDto[] newArray(int i) {
            return new VideoAiAssistantChatSuggestionDto[i];
        }
    }

    public VideoAiAssistantChatSuggestionDto(String str, String str2, CategoryDto categoryDto) {
        this.content = str;
        this.prompt = str2;
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
        if (!(obj instanceof VideoAiAssistantChatSuggestionDto)) {
            return false;
        }
        VideoAiAssistantChatSuggestionDto videoAiAssistantChatSuggestionDto = (VideoAiAssistantChatSuggestionDto) obj;
        return epx.f(this.content, videoAiAssistantChatSuggestionDto.content) && epx.f(this.prompt, videoAiAssistantChatSuggestionDto.prompt) && this.category == videoAiAssistantChatSuggestionDto.category;
    }

    public final int hashCode() {
        int a2 = urd0.a(this.content.hashCode() * 31, 31, this.prompt);
        CategoryDto categoryDto = this.category;
        return a2 + (categoryDto == null ? 0 : categoryDto.hashCode());
    }

    public final String toString() {
        return "VideoAiAssistantChatSuggestionDto(content=" + this.content + ", prompt=" + this.prompt + ", category=" + this.category + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.content);
        parcel.writeString(this.prompt);
        CategoryDto categoryDto = this.category;
        if (categoryDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            categoryDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ VideoAiAssistantChatSuggestionDto(String str, String str2, CategoryDto categoryDto, int i, zcl zclVar) {
        this(str, str2, (i & 4) != 0 ? null : categoryDto);
    }
}
