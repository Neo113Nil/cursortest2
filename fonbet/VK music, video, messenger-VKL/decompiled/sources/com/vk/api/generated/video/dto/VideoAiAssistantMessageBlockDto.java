package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: VideoAiAssistantMessageBlockDto.kt */
/* loaded from: classes15.dex */
public final class VideoAiAssistantMessageBlockDto implements Parcelable {
    public static final Parcelable.Creator<VideoAiAssistantMessageBlockDto> CREATOR = new a();

    @pmi0("actions")
    private final VideoAiAssistantMessageBlockActionsDto actions;

    @pmi0("block_index")
    private final Integer blockIndex;

    @pmi0("block_type")
    private final BlockTypeDto blockType;

    @pmi0("recommended_items")
    private final VideoAiAssistantMessageBlockRecommendedItemsDto recommendedItems;

    @pmi0("suggestions")
    private final VideoAiAssistantMessageBlockSuggestionsDto suggestions;

    @pmi0("text")
    private final VideoAiAssistantMessageBlockTextDto text;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoAiAssistantMessageBlockDto.kt */
    public static final class BlockTypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ BlockTypeDto[] $VALUES;

        @pmi0("actions")
        public static final BlockTypeDto ACTIONS;
        public static final Parcelable.Creator<BlockTypeDto> CREATOR;

        @pmi0("recommended_items")
        public static final BlockTypeDto RECOMMENDED_ITEMS;

        @pmi0("suggestions")
        public static final BlockTypeDto SUGGESTIONS;

        @pmi0("text")
        public static final BlockTypeDto TEXT;
        private final String value;

        /* compiled from: VideoAiAssistantMessageBlockDto.kt */
        public static final class a implements Parcelable.Creator<BlockTypeDto> {
            @Override // android.os.Parcelable.Creator
            public final BlockTypeDto createFromParcel(Parcel parcel) {
                return BlockTypeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final BlockTypeDto[] newArray(int i) {
                return new BlockTypeDto[i];
            }
        }

        static {
            BlockTypeDto blockTypeDto = new BlockTypeDto("TEXT", 0, "text");
            TEXT = blockTypeDto;
            BlockTypeDto blockTypeDto2 = new BlockTypeDto("RECOMMENDED_ITEMS", 1, "recommended_items");
            RECOMMENDED_ITEMS = blockTypeDto2;
            BlockTypeDto blockTypeDto3 = new BlockTypeDto("SUGGESTIONS", 2, "suggestions");
            SUGGESTIONS = blockTypeDto3;
            BlockTypeDto blockTypeDto4 = new BlockTypeDto("ACTIONS", 3, "actions");
            ACTIONS = blockTypeDto4;
            BlockTypeDto[] blockTypeDtoArr = {blockTypeDto, blockTypeDto2, blockTypeDto3, blockTypeDto4};
            $VALUES = blockTypeDtoArr;
            $ENTRIES = new asp(blockTypeDtoArr);
            CREATOR = new a();
        }

        private BlockTypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static BlockTypeDto valueOf(String str) {
            return (BlockTypeDto) Enum.valueOf(BlockTypeDto.class, str);
        }

        public static BlockTypeDto[] values() {
            return (BlockTypeDto[]) $VALUES.clone();
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

    /* compiled from: VideoAiAssistantMessageBlockDto.kt */
    public static final class a implements Parcelable.Creator<VideoAiAssistantMessageBlockDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoAiAssistantMessageBlockDto createFromParcel(Parcel parcel) {
            return new VideoAiAssistantMessageBlockDto(BlockTypeDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : VideoAiAssistantMessageBlockTextDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : VideoAiAssistantMessageBlockRecommendedItemsDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : VideoAiAssistantMessageBlockSuggestionsDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? VideoAiAssistantMessageBlockActionsDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoAiAssistantMessageBlockDto[] newArray(int i) {
            return new VideoAiAssistantMessageBlockDto[i];
        }
    }

    public VideoAiAssistantMessageBlockDto(BlockTypeDto blockTypeDto, Integer num, VideoAiAssistantMessageBlockTextDto videoAiAssistantMessageBlockTextDto, VideoAiAssistantMessageBlockRecommendedItemsDto videoAiAssistantMessageBlockRecommendedItemsDto, VideoAiAssistantMessageBlockSuggestionsDto videoAiAssistantMessageBlockSuggestionsDto, VideoAiAssistantMessageBlockActionsDto videoAiAssistantMessageBlockActionsDto) {
        this.blockType = blockTypeDto;
        this.blockIndex = num;
        this.text = videoAiAssistantMessageBlockTextDto;
        this.recommendedItems = videoAiAssistantMessageBlockRecommendedItemsDto;
        this.suggestions = videoAiAssistantMessageBlockSuggestionsDto;
        this.actions = videoAiAssistantMessageBlockActionsDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoAiAssistantMessageBlockDto)) {
            return false;
        }
        VideoAiAssistantMessageBlockDto videoAiAssistantMessageBlockDto = (VideoAiAssistantMessageBlockDto) obj;
        return this.blockType == videoAiAssistantMessageBlockDto.blockType && epx.f(this.blockIndex, videoAiAssistantMessageBlockDto.blockIndex) && epx.f(this.text, videoAiAssistantMessageBlockDto.text) && epx.f(this.recommendedItems, videoAiAssistantMessageBlockDto.recommendedItems) && epx.f(this.suggestions, videoAiAssistantMessageBlockDto.suggestions) && epx.f(this.actions, videoAiAssistantMessageBlockDto.actions);
    }

    public final int hashCode() {
        int hashCode = this.blockType.hashCode() * 31;
        Integer num = this.blockIndex;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        VideoAiAssistantMessageBlockTextDto videoAiAssistantMessageBlockTextDto = this.text;
        int hashCode3 = (hashCode2 + (videoAiAssistantMessageBlockTextDto == null ? 0 : videoAiAssistantMessageBlockTextDto.hashCode())) * 31;
        VideoAiAssistantMessageBlockRecommendedItemsDto videoAiAssistantMessageBlockRecommendedItemsDto = this.recommendedItems;
        int hashCode4 = (hashCode3 + (videoAiAssistantMessageBlockRecommendedItemsDto == null ? 0 : videoAiAssistantMessageBlockRecommendedItemsDto.hashCode())) * 31;
        VideoAiAssistantMessageBlockSuggestionsDto videoAiAssistantMessageBlockSuggestionsDto = this.suggestions;
        int hashCode5 = (hashCode4 + (videoAiAssistantMessageBlockSuggestionsDto == null ? 0 : videoAiAssistantMessageBlockSuggestionsDto.hashCode())) * 31;
        VideoAiAssistantMessageBlockActionsDto videoAiAssistantMessageBlockActionsDto = this.actions;
        return hashCode5 + (videoAiAssistantMessageBlockActionsDto != null ? videoAiAssistantMessageBlockActionsDto.hashCode() : 0);
    }

    public final String toString() {
        return "VideoAiAssistantMessageBlockDto(blockType=" + this.blockType + ", blockIndex=" + this.blockIndex + ", text=" + this.text + ", recommendedItems=" + this.recommendedItems + ", suggestions=" + this.suggestions + ", actions=" + this.actions + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.blockType.writeToParcel(parcel, i);
        Integer num = this.blockIndex;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        VideoAiAssistantMessageBlockTextDto videoAiAssistantMessageBlockTextDto = this.text;
        if (videoAiAssistantMessageBlockTextDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            videoAiAssistantMessageBlockTextDto.writeToParcel(parcel, i);
        }
        VideoAiAssistantMessageBlockRecommendedItemsDto videoAiAssistantMessageBlockRecommendedItemsDto = this.recommendedItems;
        if (videoAiAssistantMessageBlockRecommendedItemsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            videoAiAssistantMessageBlockRecommendedItemsDto.writeToParcel(parcel, i);
        }
        VideoAiAssistantMessageBlockSuggestionsDto videoAiAssistantMessageBlockSuggestionsDto = this.suggestions;
        if (videoAiAssistantMessageBlockSuggestionsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            videoAiAssistantMessageBlockSuggestionsDto.writeToParcel(parcel, i);
        }
        VideoAiAssistantMessageBlockActionsDto videoAiAssistantMessageBlockActionsDto = this.actions;
        if (videoAiAssistantMessageBlockActionsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            videoAiAssistantMessageBlockActionsDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ VideoAiAssistantMessageBlockDto(BlockTypeDto blockTypeDto, Integer num, VideoAiAssistantMessageBlockTextDto videoAiAssistantMessageBlockTextDto, VideoAiAssistantMessageBlockRecommendedItemsDto videoAiAssistantMessageBlockRecommendedItemsDto, VideoAiAssistantMessageBlockSuggestionsDto videoAiAssistantMessageBlockSuggestionsDto, VideoAiAssistantMessageBlockActionsDto videoAiAssistantMessageBlockActionsDto, int i, zcl zclVar) {
        this(blockTypeDto, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : videoAiAssistantMessageBlockTextDto, (i & 8) != 0 ? null : videoAiAssistantMessageBlockRecommendedItemsDto, (i & 16) != 0 ? null : videoAiAssistantMessageBlockSuggestionsDto, (i & 32) != 0 ? null : videoAiAssistantMessageBlockActionsDto);
    }
}
